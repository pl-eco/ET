package net.javacoding.jspider.core.impl;

import net.javacoding.jspider.api.event.resource.*;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.site.*;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.Agent;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.dispatch.EventDispatcher;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEvent;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.impl.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.exception.SpideringDoneException;

import et.util.MyUtility;
import net.javacoding.jspider.core.exception.TaskAssignmentException;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.SiteInternal;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.Storage;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.work.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.URLUtil;

import et.util.MyUtility;
import java.io.ByteArrayInputStream;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class AgentImpl
  implements net.javacoding.jspider.core.Agent,
             net.javacoding.jspider.core.event.CoreEventVisitor
{

    protected net.javacoding.jspider.core.storage.Storage
      storage;
    protected net.javacoding.jspider.core.SpiderContext
      context;
    protected net.javacoding.jspider.core.dispatch.EventDispatcher
      eventDispatcher;
    protected net.javacoding.jspider.core.task.Scheduler
      scheduler;
    protected net.javacoding.jspider.core.logging.Log
      log;
    
    public AgentImpl(net.javacoding.jspider.core.SpiderContext context) {
        super();
        this.
          context =
          context;
        this.
          storage =
          context.
            getStorage();
        this.
          eventDispatcher =
          context.
            getEventDispatcher();
        this.
          scheduler =
          new net.javacoding.jspider.core.task.SchedulerFactory(
            ).
            createScheduler(
            context);
        log =
          LogFactory.
            getLog(
            net.javacoding.jspider.core.Agent.class);
    }
    
    public synchronized void
      start(
      ) {
        java.net.URL baseURL =
          context.
            getBaseURL();
        this.
          visit(
          null,
          new net.javacoding.jspider.core.event.impl.URLFoundEvent(
            context,
            null,
            baseURL));
        this.
          notifyAll();
    }
    
    public synchronized void
      flagDone(
      net.javacoding.jspider.core.task.WorkerTask task) {
        scheduler.
          flagDone(
          task);
        this.
          notifyAll();
    }
    
    public synchronized net.javacoding.jspider.core.task.WorkerTask
      getThinkerTask(
      )
          throws net.javacoding.jspider.core.exception.TaskAssignmentException {
        while (true) {
            try {
                return scheduler.
                         getThinkerTask();
            }
            catch (net.javacoding.jspider.core.exception.SpideringDoneException e) {
                throw e;
            }
            catch (net.javacoding.jspider.core.exception.TaskAssignmentException e) {
                try {
                    this.
                      wait();
                }
                catch (java.lang.InterruptedException e1) {
                    Thread.
                      currentThread().
                      interrupt();
                }
            }
        }
    }
    
    public synchronized net.javacoding.jspider.core.task.WorkerTask
      getSpiderTask(
      )
          throws net.javacoding.jspider.core.exception.TaskAssignmentException {
        while (true) {
            try {
                return scheduler.
                         getFethTask();
            }
            catch (net.javacoding.jspider.core.exception.SpideringDoneException e) {
                throw e;
            }
            catch (net.javacoding.jspider.core.exception.TaskAssignmentException e) {
                try {
                    this.
                      wait();
                }
                catch (java.lang.InterruptedException e1) {
                    Thread.
                      currentThread().
                      interrupt();
                }
            }
        }
    }
    
    public synchronized void
      scheduleForSpidering(
      java.net.URL foundURL) {
        java.net.URL siteURL =
          URLUtil.
            getSiteURL(
            foundURL);
        net.javacoding.jspider.api.model.Site site =
          storage.
            getSiteDAO().
            find(
            siteURL);
        scheduler.
          schedule(
          new net.javacoding.jspider.core.task.work.SpiderHttpURLTask(
            context,
            foundURL,
            site));
        this.
          notifyAll();
    }
    
    public synchronized void
      scheduleForParsing(
      java.net.URL url) {
        scheduler.
          schedule(
          new net.javacoding.jspider.core.task.work.InterpreteHTMLTask(
            context,
            (net.javacoding.jspider.api.model.FetchedResource)
              storage.
                getResourceDAO().
                getResource(
                url)));
        this.
          notifyAll();
    }
    
    public synchronized void
      registerEvent(
      java.net.URL url,
      net.javacoding.jspider.core.event.CoreEvent event) {
        event.
          accept(
          url,
          this);
        this.
          notifyAll();
    }
    
    public void
      visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.CoreEvent event) {
        log.
          error(
          "ERROR -- UNHANDLED COREEVENT IN AGENT !!!");
    }
    
    public void
      visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLSpideredOkEvent event) {
        storage.
          getResourceDAO().
          setSpidered(
          url,
          event);
        eventDispatcher.
          dispatch(
          new net.javacoding.jspider.api.event.resource.ResourceFetchedEvent(
            storage.
              getResourceDAO().
              getResource(
              url)));
        scheduler.
          schedule(
          new net.javacoding.jspider.core.task.work.DecideOnParsingTask(
            context,
            url));
    }
    
    public void
      visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLSpideredErrorEvent event) {
        storage.
          getResourceDAO().
          setError(
          url,
          event);
        eventDispatcher.
          dispatch(
          new net.javacoding.jspider.api.event.resource.ResourceFetchErrorEvent(
            storage.
              getResourceDAO().
              getResource(
              url),
            event.
              getHttpStatus()));
    }
    
    public void
      visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.ResourceParsedOkEvent event) {
        storage.
          getResourceDAO().
          setParsed(
          url,
          event);
        eventDispatcher.
          dispatch(
          new net.javacoding.jspider.api.event.resource.ResourceParsedEvent(
            storage.
              getResourceDAO().
              getResource(
              url)));
    }
    
    public void
      visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.ResourceParsedErrorEvent event) {
        storage.
          getResourceDAO().
          setError(
          url,
          event);
    }
    
    public void
      visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLFoundEvent event) {
        java.net.URL foundURL =
          event.
            getFoundURL();
        java.net.URL siteURL =
          URLUtil.
            getSiteURL(
            foundURL);
        net.javacoding.jspider.api.model.Site site =
          storage.
            getSiteDAO().
            find(
            siteURL);
        boolean newResource =
          storage.
            getResourceDAO().
            getResource(
            foundURL) ==
          null;
        if (site ==
              null) {
            site =
              storage.
                getSiteDAO().
                createSite(
                siteURL);
            context.
              registerNewSite(
              site);
            storage.
              getSiteDAO().
              save(
              site);
            eventDispatcher.
              dispatch(
              new net.javacoding.jspider.api.event.site.SiteDiscoveredEvent(
                site));
            if (site.
                  getFetchRobotsTXT()) {
                if (site.
                      mustHandle()) {
                    java.net.URL robotsTXTUrl =
                      URLUtil.
                        getRobotsTXTURL(
                        siteURL);
                    scheduler.
                      schedule(
                      new net.javacoding.jspider.core.task.work.FetchRobotsTXTTaskImpl(
                        context,
                        robotsTXTUrl,
                        site));
                    if (newResource) {
                        scheduler.
                          block(
                          siteURL,
                          new net.javacoding.jspider.core.task.work.DecideOnSpideringTask(
                            context,
                            new net.javacoding.jspider.core.event.impl.URLFoundEvent(
                              context,
                              url,
                              foundURL)));
                    }
                }
            } else {
                if (site.
                      mustHandle()) {
                    ((net.javacoding.jspider.core.model.SiteInternal)
                       site).
                      registerRobotsTXTSkipped();
                    context.
                      registerRobotsTXTSkipped(
                      site);
                    eventDispatcher.
                      dispatch(
                      new net.javacoding.jspider.api.event.site.RobotsTXTSkippedEvent(
                        site));
                    if (newResource) {
                        scheduler.
                          schedule(
                          new net.javacoding.jspider.core.task.work.DecideOnSpideringTask(
                            context,
                            event));
                    }
                }
                this.
                  notifyAll();
            }
        } else
                  if (site.
                        isRobotsTXTHandled()) {
                      if (newResource) {
                          scheduler.
                            schedule(
                            new net.javacoding.jspider.core.task.work.DecideOnSpideringTask(
                              context,
                              event));
                      }
                      this.
                        notifyAll();
                  } else {
                      if (site.
                            mustHandle()) {
                          if (newResource) {
                              scheduler.
                                block(
                                siteURL,
                                new net.javacoding.jspider.core.task.work.DecideOnSpideringTask(
                                  context,
                                  new net.javacoding.jspider.core.event.impl.URLFoundEvent(
                                    context,
                                    url,
                                    foundURL)));
                          }
                      }
                  }
        if (newResource) {
            storage.
              getResourceDAO().
              registerURL(
              foundURL);
            if (!site.
                   mustHandle()) {
                storage.
                  getResourceDAO().
                  setIgnoredForFetching(
                  foundURL,
                  event);
            }
            eventDispatcher.
              dispatch(
              new net.javacoding.jspider.api.event.resource.ResourceDiscoveredEvent(
                storage.
                  getResourceDAO().
                  getResource(
                  foundURL)));
        }
        storage.
          getResourceDAO().
          registerURLReference(
          foundURL,
          url);
        if (url !=
              null) {
            eventDispatcher.
              dispatch(
              new net.javacoding.jspider.api.event.resource.ResourceReferenceDiscoveredEvent(
                storage.
                  getResourceDAO().
                  getResource(
                  url),
                storage.
                  getResourceDAO().
                  getResource(
                  foundURL)));
        }
    }
    
    public void
      visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.RobotsTXTSpideredOkEvent event) {
        java.net.URL robotsTxtURL =
          event.
            getRobotsTXTURL();
        java.net.URL siteURL =
          URLUtil.
            getSiteURL(
            robotsTxtURL);
        net.javacoding.jspider.core.model.SiteInternal site =
          (net.javacoding.jspider.core.model.SiteInternal)
            storage.
              getSiteDAO().
              find(
              siteURL);
        DecideOnSpideringTask[] tasks =
          scheduler.
            unblock(
            siteURL);
        for (int i =
               0;
             i <
               tasks.
                 length;
             i++) {
            scheduler.
              schedule(
              tasks[i]);
        }
        storage.
          getResourceDAO().
          registerURL(
          robotsTxtURL);
        storage.
          getResourceDAO().
          setSpidered(
          robotsTxtURL,
          event);
        storage.
          getResourceDAO().
          setIgnoredForParsing(
          robotsTxtURL);
        net.javacoding.jspider.api.model.Resource resource =
          storage.
            getResourceDAO().
            getResource(
            robotsTxtURL);
        byte[] bytes =
          event.
            getBytes();
        site.
          registerRobotsTXT();
        eventDispatcher.
          dispatch(
          new net.javacoding.jspider.api.event.resource.ResourceDiscoveredEvent(
            resource));
        eventDispatcher.
          dispatch(
          new net.javacoding.jspider.api.event.resource.ResourceFetchedEvent(
            resource));
        eventDispatcher.
          dispatch(
          new net.javacoding.jspider.api.event.site.RobotsTXTFetchedEvent(
            site,
            new java.lang.String(
              bytes)));
        context.
          registerRobotsTXT(
          site,
          new java.io.ByteArrayInputStream(
            bytes));
        storage.
          getSiteDAO().
          save(
          site);
    }
    
    public void
      visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.RobotsTXTSpideredErrorEvent event) {
        java.net.URL robotsTxtURL =
          event.
            getRobotsTXTURL();
        java.net.URL siteURL =
          URLUtil.
            getSiteURL(
            robotsTxtURL);
        net.javacoding.jspider.api.model.Site site =
          storage.
            getSiteDAO().
            find(
            siteURL);
        ((net.javacoding.jspider.core.model.SiteInternal)
           site).
          registerRobotsTXTError();
        DecideOnSpideringTask[] tasks =
          scheduler.
            unblock(
            siteURL);
        for (int i =
               0;
             i <
               tasks.
                 length;
             i++) {
            scheduler.
              schedule(
              tasks[i]);
        }
        storage.
          getResourceDAO().
          registerURL(
          robotsTxtURL);
        storage.
          getResourceDAO().
          setError(
          robotsTxtURL,
          event);
        eventDispatcher.
          dispatch(
          new net.javacoding.jspider.api.event.site.RobotsTXTFetchErrorEvent(
            site,
            event.
              getException()));
        context.
          registerRobotsTXTError(
          site);
        storage.
          getSiteDAO().
          save(
          site);
    }
    
    public void
      visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.RobotsTXTUnexistingEvent event) {
        java.net.URL robotsTxtURL =
          event.
            getRobotsTXTURL();
        java.net.URL siteURL =
          URLUtil.
            getSiteURL(
            robotsTxtURL);
        net.javacoding.jspider.api.model.Site site =
          storage.
            getSiteDAO().
            find(
            siteURL);
        ((net.javacoding.jspider.core.model.SiteInternal)
           site).
          registerNoRobotsTXTFound();
        DecideOnSpideringTask[] tasks =
          scheduler.
            unblock(
            siteURL);
        for (int i =
               0;
             i <
               tasks.
                 length;
             i++) {
            scheduler.
              schedule(
              tasks[i]);
        }
        storage.
          getSiteDAO().
          save(
          site);
        eventDispatcher.
          dispatch(
          new net.javacoding.jspider.api.event.site.RobotsTXTMissingEvent(
            site));
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1360121293918L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAMVae2wcxRmf89uxiR0nhEBC4iQmwcQ+39vnuDyM7TQmF2xs" +
       "J4Abeqz3xvaS9e6x\nO2dfQmqoeIUIpULQllYBBGqFVFBBpcAfVA2IRwklVe" +
       "s/gFKBaEEI1AZRqoq0paLfzM7d7O1d7rw2\nqFF2bz07M9/M7/e9ZnYeP4Uq" +
       "TQOtk00vOZDEprd3ZEgyTJzoVSXTHIWiuPxyZe3Qo7s0vQx5YqhM\nSRDUEJ" +
       "PNjoREpA4l0THQ1502UHNSVw9Mqjrh/eT1sn3zF7Ov33nF2nLUMIYaFG2ESE" +
       "SRe3WN4DQZ\nQ/XTeHocG2ZPIoETY2iFhnFiBBuKpCoHoaKujaEmU5nUJJIy" +
       "sDmMTV2doRWbzFQSG0xmpjCG6mVd\nM4mRkolumAQ1xm6QZqSOFFHUjphiku" +
       "4YqppQsJowb0RzqDyGKidUaRIqro5lZtHBeuzYQcuh+jIF\nhmlMSDLONKnY" +
       "r2iAxAZni+yMW3ZBBWhaPY3JlJ4VVaFJUICarCGpkjbZMUIMRZuEqpV6CqQQ" +
       "dN4Z\nO4VKNUlJ3i9N4jhBa5z1hqxXUKuWwUKbEHS2sxrrCTg7z8GZja3Bqv" +
       "r/Hhn6vJlxXpHAskrHXw2N\n1jsaDeMJbGBNxlbD0ynvfQPXptaVIQSVz3ZU" +
       "tur0XPDsnthHxzdYddYWqDM4fgOWSVz+IrLu/Pme\nD2rL6TBqkrqpUFXImT" +
       "ljdYi/6U4nQZtXZ3ukL72Zl88Pv3LtLT/Dfy1DNQOoStbV1LQ2gGqxlujl\n" +
       "z9XwHFM0bJUOTkyYmAygCpUVVensb4BjQlExhaMKnpMSmWLP6SRCqBouD/yH" +
       "i/3bSG8E1fVMYo0M\nTCdVb5KgNg2TfZR+WU8A8ftuMJNKAhv7ZN3A+xSotM" +
       "9WPU07b5j1eKiVOm1MBYXcqavQOC4/+v5r\nh/p33XXYYoxqGR8WQReBQK8Q" +
       "6OUCvVSglwr0ZgXC0Jmoc3IhpJwkqOn87RfdjUfbzWfKUPkYqlWm\np1NEGl" +
       "cxmJykqvosTsQJ07kVNv1magU6WT8O6gny4yp0xMwBMJsx0CanGgrjHYAnCX" +
       "Rrfu7L338S\nn32KagxleBXt3Roa8LXfGlt968h1V1x/eFM5rTRbQamAqi2l" +
       "e4/LnxzZ/dQbv33nQqHuBLXkWWF+\nS2pFzuEPGbqME+ClRPc//PfOT++t7H" +
       "q6DFWAaYJzIhKoFFj6eqeMHGvqzngmCha0rJvQjWlJpa8y\n7mQZmTL0WVHC" +
       "1OUs9twIANTBVQlXgOvjRfRGXzbR20pLuSiejjkwv3f61irfm7+qe5mBknGR" +
       "DTZf\nOoKJZXArBB2jBsZQ/s79Q/d+/9Sd32JccDIIqkqmxlVFTrPxneMB7l" +
       "cWMH7vmlX3/aD12JsZsleK\n3nsMQzpAuU5/d/78H/1GegAcAxioqRzEzP48" +
       "WdrX4EyX/b27LXdiOZ9Dx96/o/W9P57kDsoW+ESt\nj+O3pZ65/fh8GYW4Fk" +
       "KQZF6ZMSgWAumTh4UFoJGpPC2pZXgus2zWT1ANaxmK+mA8TSCIRkyvkvDG\n" +
       "dFlSB/oefqFu/p5U5AprJGfZKgz0xdMbTv609ctmNgIusMrmAvnf1TOScaUw" +
       "dfoTICjsxsFsDwXa\nAv72ELSrlq1ozOhZRVBrMb8xwp55/M4wSu9t7Lmdah" +
       "pjAzE4NvEq1OCdfmwHjcUZa5kev+mfLz64\nrNlin7ZZx7qhacpaO6k5reLy" +
       "jQePBedHrlYsNJ1RylH54K/3PHj6JHmXqbYwSCptYzp/gHslm6+I\nvjGzou" +
       "rJh6bLUPUYamSZhqSRvZKaooo/Bkph9vLCGLBqf58b9y196846nHVOZ2AT63" +
       "QFwsHDc67+\nCetfDtd6uDZz69/ssH4PYhrTzxq0sPvWrK3WJg2dwPhwIg2a" +
       "YYLTg8yC1emwFHxXVsE7ww4Ft9Du\nu6zrhQ9OPaF8zpR4Gcu4emgDPu5aVm" +
       "IzrHI9adLYbksueU8tg0mzm0kNEW6Q0bDP71bVA+FAW7Td\nHyaofnTnwIiX" +
       "z4r2GxOTnIMMIn8ydAgcR9TEdGw580uUSm+/lpq2v4SgWzHc39OXsaRtxSyJ" +
       "i/WO\niNE0sIaX5TDZwi+U+c1ncozevukwZE7XdYKuCCvfnUUyFHWPZDCagy" +
       "QXSPv9tpBP/9xLb9EzTcoL\n1wV8UhcUnlSCT6oBz4D8PsWElEuegqWCbXKT" +
       "YnKdjsmFfSH3ahKEyQWCBK1ik3MIpv1P5Y+HTTZD\neKgY4Qnextuf30MhkD" +
       "bBtYWDtKUwSEkOUq0JHSVSai48poAn6uS+q5OgiEt4fG3+QHsAlGa5ZUYZ\n" +
       "mbRrYh9EDiZF01Aimfu9I/Z2hZBYDddWjsTWwkgc4kiUq/qkHYObBQZdDgwC" +
       "na6Dpt/fSfWfBnkG\nAQijfd5iyc2Z9tZi04bKk7QwZjVqYEPdwkOliKZWCC" +
       "yzz+eImE8wmZG1sZgsNn57F0dFF6FsF4Fi\nXTCVhxTawEx19yqQjehGGtz/" +
       "+WdaS7J18J3X/L3+Duml66zg3JS7uKDOM/zQW7j1snq5wOqllujJ\ndhUkqy" +
       "KDcErbzdbYmWDZcPWGP++IPPodZwrRSNdQ9hQit1lcfuHnx/8Ufuvt22AUY6" +
       "j6ysGR3p5Y\nPwx4Q1FxcXnFzNqryqeUV1mg49E8b2cgt1F3bgxfZmCSMrTR" +
       "nEjenNX9Ndznh7juhwrm8XlhvIw+\nt4KPNg9oMiwUNMiTE8VztZKJ3AMEUj" +
       "EiGcSZjw0ZyjTkpjN8I+DpsX/4Eh9u67MoX2PfYLJX3Bn4\nEres/OhTKxPL" +
       "TbUL5HEOIfes/8mHT70/vMpSG2tLZnPeroi9jbUtw2ZSn6SKu7GYBFb7pW0b" +
       "H58b\nfne8jCNwLwT3GZ3ug1Wx8foQA+rHOWxF4NrO2druhi16e7gwDZnVjc" +
       "2EnxGrjDArD9Lbs27dWTja\nFoy2hyHiVVBHvKC0hXnsq3VjPzZG4bG05jwJ" +
       "Y6U5bJ+uMX4fK4RbEK5LOW6XfkW4FdXtAqC+KkDt\nzPrFi4v6xbSMk3Rd5q" +
       "VQ9Jh0p3Ia4O3PlLN+n4eAOYnJ6BTdsmCg2aWeFFIjgsrfuaUyEmwLhNrD\n" +
       "EJnOyZW11Wy2nAzt9rlC2NNdgkGO/eD/Cfu3syh0BVg8f40VzxN0FkzHWnQ6" +
       "kXtHtPEL5N51i1xn\nF0POR9DqHFGlgaOKOs6BG//6jP0jMU+bhnzsdp5d0b" +
       "awrz0SoOaop7TEnuFYRsnr2ZKGajoUlrbo\nv0CGnMn1duiGBRkM4IzWHYVL" +
       "4UApXx9QpzNAhX0+AdS/3Ca6fl+4LQRuEVY55SmD7YCfKg3KZ7DK\nt4FCP4" +
       "QUg6QPLo1Don1FkJTlpYueKgFJMAuJp9o1JH5fWyjIjCQLiV1MnRATEmLqFy" +
       "MmHGiPwNqk\nkuWcC4pIjuy0JFUeBF7FwJOKSbDBmhRkiW6idiC6j2/9I4VY" +
       "orctCyXjXIGSiNqe89yjFGkLwEKs\n6wxkrBdihL/wbFiMmKC/PRTJkEF7aS" +
       "yN7tlQf4auEM6IKnUHaY5qesmoXiSm2ymmu831dAO+oqh2\nCDFRIca3GDGA" +
       "KnUuuSreVVrF2Tcb8NCWw8WJwf0LVPgtJSnphmuOUzK3ZEouzmLlF5HZc4l7" +
       "rIor\n+uVCTECI6V2MGEpJ1EnJN9xT0m8YurFAVroWxMqtnJVbl8zKkIDL5q" +
       "Svcg1X0F+UlT1CjM3L7V2M\nmCWxQs8FpAwZW0cSFmwrsZKsXALXYc7K4SWz" +
       "Igu4bO4r4R6u4rYyJcTY3JeyGDHASsTvZOXSRbHi\nxlziJYmhi8i7OTF3L5" +
       "mYGYFYl0Bs1jVioeJx5aasmIBIWj2HFiOGmovPSUzRLelcJ7aDLgsWyIax\n" +
       "IDM5wdk4sWQ27srCFLSZyRHXm9i+4s7rqBBjM5PvLUbM0sxEH9eJOXrNqOtY" +
       "f3tJYnrgeo8T896S\niTmWRSxsi/UPuEYsECpKzMNCjC3WP7IYMZSYkJOYyx" +
       "dLjBsXdv+CjOYzzs1nS+bmCQGazYU96Ro0\nelagCDe/zIqJ2FzY04sR89UY" +
       "zR4Np2F1B3UXSMxjucSkCarNjoyeRVmTd8zROownb5q//sIXkytO\nsCM+2Q" +
       "NzNTFUM5FSVfvXettzVdLAEwrjs8b6dm/h+DxBzaXObBFUQX/oLDzHrWYvEr" +
       "S2SDNoQX/s\nLV4haHXhFgRV8yd7/RMELc+tT9Ay8Ye96uugI1CVPp7MbqI2" +
       "ik/m1ukHugO/yvaxfSSJZYUejkk/\n8lzFVUf/8B/2SSXzPZkejZTNDkZQR4" +
       "8mqQdMdtiCvqMHzOSUYQBZ7NsTh7jOtHq0jkKutZ8tyMpq\nGb12qD//eEHQ" +
       "ipluvxtDnlpBvwm6O3g3Z6BzC+HAxsb9ADtaQEe5h4v4Hy1fz5G+KwAA");
}
