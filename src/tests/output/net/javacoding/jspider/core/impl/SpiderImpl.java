package net.javacoding.jspider.core.impl;

import net.javacoding.jspider.api.event.engine.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.Spider;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.dispatch.DispatchSpiderTasks;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.dispatch.DispatchThinkerTasks;

import et.util.MyUtility;
import net.javacoding.jspider.core.threading.ThreadPoolMonitorThread;

import et.util.MyUtility;
import net.javacoding.jspider.core.threading.WorkerThreadPool;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.*;

import et.util.MyUtility;

public class SpiderImpl
  implements net.javacoding.jspider.core.Spider
{
static {
}
    final public static int
      DEFAULT_MONITORING_INTERVAL =
      1000;
    protected net.javacoding.jspider.core.threading.WorkerThreadPool
      spiders;
    protected net.javacoding.jspider.core.threading.WorkerThreadPool
      thinkers;
    
    public SpiderImpl(net.javacoding.jspider.core.SpiderContext context,
                      int spiderThreads,
                      int thinkerThreads) {
        super();
        LogFactory.
          getLog(
          net.javacoding.jspider.core.Spider.class).
          info(
          "Spider born - threads: spiders: " +
          spiderThreads +
          ", thinkers: " +
          thinkerThreads);
        spiders =
          new net.javacoding.jspider.core.threading.WorkerThreadPool(
            "Spiders",
            "Spider",
            spiderThreads);
        thinkers =
          new net.javacoding.jspider.core.threading.WorkerThreadPool(
            "Thinkers",
            "Thinker",
            thinkerThreads);
        net.javacoding.jspider.core.util.config.PropertySet props =
          ConfigurationFactory.
            getConfiguration().
            getJSpiderConfiguration();
        net.javacoding.jspider.core.util.config.PropertySet threadProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            CONFIG_THREADING,
          props);
        net.javacoding.jspider.core.util.config.PropertySet spidersProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            CONFIG_THREADING_SPIDERS,
          threadProps);
        net.javacoding.jspider.core.util.config.PropertySet thinkerProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            CONFIG_THREADING_THINKERS,
          threadProps);
        net.javacoding.jspider.core.util.config.PropertySet spidersMonitoringProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            CONFIG_THREADING_MONITORING,
          spidersProps);
        net.javacoding.jspider.core.util.config.PropertySet thinkerMonitoringProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            CONFIG_THREADING_MONITORING,
          thinkerProps);
        if (spidersMonitoringProps.
              getBoolean(
              ConfigConstants.
                CONFIG_THREADING_MONITORING_ENABLED,
              false)) {
            int interval =
              spidersMonitoringProps.
                getInteger(
                ConfigConstants.
                  CONFIG_THREADING_MONITORING_INTERVAL,
                DEFAULT_MONITORING_INTERVAL);
            new net.javacoding.jspider.core.threading.ThreadPoolMonitorThread(
              context.
                getEventDispatcher(),
              interval,
              spiders);
        }
        if (thinkerMonitoringProps.
              getBoolean(
              ConfigConstants.
                CONFIG_THREADING_MONITORING_ENABLED,
              false)) {
            int interval =
              thinkerMonitoringProps.
                getInteger(
                ConfigConstants.
                  CONFIG_THREADING_MONITORING_INTERVAL,
                DEFAULT_MONITORING_INTERVAL);
            new net.javacoding.jspider.core.threading.ThreadPoolMonitorThread(
              context.
                getEventDispatcher(),
              interval,
              thinkers);
        }
    }
    
    public void
      crawl(
      net.javacoding.jspider.core.SpiderContext context) {
        long start =
          System.
            currentTimeMillis();
        context.
          getEventDispatcher().
          dispatch(
          new net.javacoding.jspider.api.event.engine.SpideringStartedEvent(
            context.
              getBaseURL()));
        net.javacoding.jspider.core.task.dispatch.DispatchSpiderTasks dispatchSpiderTask =
          new net.javacoding.jspider.core.task.dispatch.DispatchSpiderTasks(
          spiders,
          context);
        net.javacoding.jspider.core.task.dispatch.DispatchThinkerTasks dispatchThinkerTask =
          new net.javacoding.jspider.core.task.dispatch.DispatchThinkerTasks(
          thinkers,
          context);
        synchronized (dispatchSpiderTask)  {
            context.
              getAgent().
              start();
            spiders.
              assignGroupTask(
              dispatchSpiderTask);
            thinkers.
              assignGroupTask(
              dispatchThinkerTask);
            try {
                dispatchSpiderTask.
                  wait();
            }
            catch (java.lang.InterruptedException e) {
                Thread.
                  currentThread().
                  interrupt();
            }
        }
        net.javacoding.jspider.core.logging.Log log =
          LogFactory.
            getLog(
            net.javacoding.jspider.core.Spider.class);
        log.
          debug(
          "Stopping spider workers...");
        spiders.
          stopAll();
        log.
          info(
          "Stopped spider workers...");
        log.
          debug(
          "Stopping thinker workers...");
        thinkers.
          stopAll();
        log.
          info(
          "Stopped thinker workers...");
        context.
          getEventDispatcher().
          dispatch(
          new net.javacoding.jspider.api.event.engine.SpideringSummaryEvent(
            context.
              getStorage().
              getSummary()));
        context.
          getEventDispatcher().
          dispatch(
          new net.javacoding.jspider.api.event.engine.SpideringStoppedEvent(
            context.
              getStorage()));
        context.
          getEventDispatcher().
          shutdown();
        log.
          info(
          "Spidering done!");
        log.
          info(
          "Elapsed time : " +
          (System.
             currentTimeMillis() -
             start));
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1360121306733L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJ1YfWwcRxWfu7Pv/JX4I25qYjt2XENjJb7zR+w4sURzsh1y" +
       "ycW++pyEuK4u6905\ne5293c3u3PliSkRFSdIClaqmQFH6ARQioQgQUcsfIE" +
       "LUlu9I4D/aAmpVSFUFQaoihBJBUXgzs3u7\nt+c4Mift7uzse/PevI/fe3MX" +
       "b6By00AtohkmJ3VshkeSCcEwsTSiCKY5BVMp8fXyysSFA6rmR744\n8ssSQb" +
       "Vx0YxIAhEishSJjQ7nDdSua8rJOUUj1jolq+y+76PF357Z3xxAtdOoVlaTRC" +
       "CyOKKpBOfJ\nNKrJ4MwsNsyoJGFpGtWrGEtJbMiCIi8BoaZOowZTnlMFkjWw" +
       "OYlNTclRwgYzq2ODybQn46hG1FST\nGFmRaIZJUF18QcgJkSyRlUhcNslwHA" +
       "XTMlYk8wQ6hQJxVJ5WhDkg3Bi3dxFhK0b20nkgr5JBTSMt\niNhmKTsuq2CJ" +
       "Ni9HYcedB4AAWEMZTOa1gqgyVYAJ1MBVUgR1LpIkhqzOAWm5lgUpBG2646JA" +
       "VKEL\n4nFhDqcIavLSJfgnoKpkZqEsBN3jJWMrgc82eXzm8tZEsOa/TyRutj" +
       "Ofl0lYVKj+IWDa7GGaxGls\nYFXEnPFWNnwudjTb4kcIiO/xEHOa6Md/dCh+" +
       "/XIbp2legWZidgGLJCV+NNjSuhx9rzJA1ajQNVOm\noVC0c+bVhPVlOK9DNG" +
       "8srEg/hu2PP5v8+dHPfRf/zY8qYigoako2o8ZQJValEWscgnFcVjGfnUin\n" +
       "TUxiqExhU0GNvYM50rKCqTmCMNYFMs/GeR0hFILLB9cM4r+N9EZQTVKXJWzE" +
       "MroS1gnqVjGZof4X\nNQk8P7Ngss8zombgGRmIZtz0ebp87aLPR/PUm2UKhO" +
       "Q+TQHilHjh2q8fGTvw+FnuMxpnlmIEbQOJ\nYUdi2JIYphLDVGLYkYh8Pibr" +
       "3mIrUrdINHv+/sPhuie7zVf8KDCNKuVMJkuEWQVD1gmKoi1iKUVY\n2NW7Qp" +
       "xFFoRlzSxEKCiQUmAhlhFgtpyBOryR6ORvDEYChNfyqdu/+yC1eIkGDXVyI1" +
       "2dqwYuO851\nq+lKPrz/2NmOACVaLKPeANLOu6+eEj944uClN37z9lYn4gnq" +
       "LEnEUk6aSF71E4YmYgmAyln+q//e\n9+HT5bte9qMyyE7AJyJAVEGyb/bKKE" +
       "qoYRucqLGAszqtGRlBoZ9sRKki84a26MyweFnHxnVggGq4\nyuHqtUKyld7o" +
       "xwZ628Cji9rTswcGfbc+H+x58yfVrzOj2ChZ64LTJCY85+odd0wZGMP8219L" +
       "PP3M\njTMPMV9YziAoqGdnFVnMM/3u9YHvN6yQ/+GmxnNf6Tr/pu3sDc7qUc" +
       "MQTlJf5x9dbn32F8JzgA2Q\no6a8hFkKBpikADA1YXvJsZGDHFE4/jxy/trp" +
       "rnf/cNXCKFftc6j+mnos+8oXLi/7qYkroQoJ5rid\nUawK0pGPVQZwIwt5Ol" +
       "PJ7FnFk7aXoArG2buzF/RpAEG0aIZlKRzXREGJjX7jSvXyU9nB/VyTdS6C\n" +
       "2Ggq33b1212325kGlsCgCwWt91BOMMadXKePPoIG1wQxu/t2be/r697RT1BI" +
       "5BWZ+aeRoK7VkIOv\nYdVw2GGz2+IJQ86AojmrMLw8/c8e6f1to3yrTe6Gw0" +
       "24r+827txw/UMWcR67r1B9PEKe2vzS+5eu\nTTbyJOYl+r6SKunm4WWauatG" +
       "z8MetqwmgVG/tm3LxVOT78zynTQUw+SYms0MvPAW7tpTI64AxAFo\nJCAJ2L" +
       "4G6Own7Uyg9+1s3E0zlEUxYnp1WCQUKL0FYC9tY2yUycx+5l+vPl/VzrOG8r" +
       "QUkqHINUVc\nKfHE0vn+5eQRmW/Ia2IP8dJPDz1/6yp5hzuoAGRU2pZ8qYKH" +
       "BRfGDr2Rqw/+4IWMH4WmUR1r0gSV\nHBaULAWMaUgmc8SajEM2uL8Xt0w8T4" +
       "cLQN3i9bFLrBdCHYfAuDhvHdRsgusB64nspws1WYXkmEcV\nCscgBeaw0fCX" +
       "F1+6+eiZIT/FpPIcVRxsUufQjWdpl3v64jOt1efe/SJzFPjnOl10ggnvZPf7" +
       "OV4G\nCKguqwJrvrogbkzWNOcJah4d2xs9FJ9KHZwYj01NTMbGP5WKjU+NTR" +
       "6OxllYcVin9/2FTa2H6364\nNlmb2uTdFGLwcbRUEQDuSt3QCBgdSyA+xFHA" +
       "ZDQRjnapAtoN7vKgHQ+h0T27rrx34/vyTYZoVawD\nj1IGyxmVbMaFsgFNN2" +
       "mv5zpsWCt1TugmT9odxEKJvr7enQQNrA33du7cPtTdOwAd2tS+WDJs7Yqu\n" +
       "e8zZ5CnoKEs3Q1Ww7IgaWOKsd9xMUcD9ETK/bHIsOmqj6uBqqAr1HAts+ohm" +
       "HIcunr0nNE25k1O3\nwtVsiWte2amsXDwELiLztFsqdt0Jp1D1sHnBsWrf4J" +
       "qtOtRDrQp865hVbYl0YcOlAX1foDe+L6bJ\nJyyoc9CwxWrjXOouOZE2pNsm" +
       "7bh7oaLw3nqnMw+D9jOf/kfNaeG1h/0W9O4BOxBN71ZwDisOCnsX\nOciOeD" +
       "bg1B5p+/PewQuf9cIwa+DdMFzMlhKvfO/ynwbe+uNjgB7TKDQ+kRyJxscgsN" +
       "pWFZcS63PN\nDwbm5V+yvLIQseRgWsw0XIyDVQaGc7U6VYSG7UU95Ha4+q0Y" +
       "61+ph3S5z1PMfKUu/FLBhUNDbL6f\n3r685sZloNfbuNB1hu5eVM8CtIqGsM" +
       "i9ulvnHA9AnuY0+hcHL9E9CMCuypFIe9Gmkn86+Hlc7Fg+\ntvVVvf5XrMUv" +
       "nJkroGVLZxXFXXVc46Bu4LTMVKrgNYgb6OsEtd/t0AbK0gfT/FnO9hyUhlXY" +
       "gIM+\n3BwvErRxZQ6w6YILES36bxG0vpgeLOS8uEm/A/0OkNLhhUKeuoohr+" +
       "I0Kxtd+JrUsSjT5jj/zR+X\nPfjk7//Dwtp2L/13BOpBToYmOBKF0njSZE0D" +
       "/UYPmGLWgMMTYWltmbja5Cvyf0Oa3eWkIKtz6mhi\nrKSi9EFl2PF/YN8Q2J" +
       "lC3xpP3lBoPraSIZhy7nJC1ZQtGf8DiGbAP8ITAAA=");
}
