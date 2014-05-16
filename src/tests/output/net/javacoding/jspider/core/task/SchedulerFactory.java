package net.javacoding.jspider.core.task;

import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.impl.DefaultSchedulerProvider;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.impl.SchedulerMonitorThread;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.*;

import et.util.MyUtility;

public class SchedulerFactory
{

    final public static int
      DEFAULT_MONITORING_INTERVAL =
      1000;
    
    public net.javacoding.jspider.core.task.Scheduler
      createScheduler(
      net.javacoding.jspider.core.SpiderContext context) {
        net.javacoding.jspider.core.util.config.PropertySet props =
          ConfigurationFactory.
            getConfiguration().
            getJSpiderConfiguration();
        net.javacoding.jspider.core.util.config.PropertySet schedulerProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            CONFIG_SCHEDULER,
          props);
        java.lang.Class providerClass =
          schedulerProps.
            getClass(
            ConfigConstants.
              CONFIG_SCHEDULER_PROVIDER,
            net.javacoding.jspider.core.task.impl.DefaultSchedulerProvider.class);
        net.javacoding.jspider.core.logging.Log log =
          LogFactory.
            getLog(
            net.javacoding.jspider.core.task.SchedulerFactory.class);
        log.
          info(
          "TaskScheduler provider class is \'" +
          providerClass +
          "\'");
        try {
            net.javacoding.jspider.core.task.SchedulerProvider provider =
              (net.javacoding.jspider.core.task.SchedulerProvider)
                providerClass.
                  newInstance();
            net.javacoding.jspider.core.task.Scheduler scheduler =
              provider.
                createScheduler();
            net.javacoding.jspider.core.util.config.PropertySet monitoringProps =
              new net.javacoding.jspider.core.util.config.MappedPropertySet(
              ConfigConstants.
                CONFIG_SCHEDULER_MONITORING,
              schedulerProps);
            if (monitoringProps.
                  getBoolean(
                  ConfigConstants.
                    CONFIG_SCHEDULER_MONITORING_ENABLED,
                  false)) {
                int interval =
                  monitoringProps.
                    getInteger(
                    ConfigConstants.
                      CONFIG_SCHEDULER_MONITORING_INTERVAL,
                    DEFAULT_MONITORING_INTERVAL);
                new net.javacoding.jspider.core.task.impl.SchedulerMonitorThread(
                  scheduler,
                  context.
                    getEventDispatcher(),
                  interval);
            }
            return scheduler;
        }
        catch (java.lang.InstantiationException e) {
            log.
              error(
              "InstantiationException on Scheduler",
              e);
            return null;
        }
        catch (java.lang.IllegalAccessException e) {
            log.
              error(
              "IllegalAccessException on Scheduler",
              e);
            return null;
        }
    }
    
    public SchedulerFactory() {
        super();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1360121358116L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJ1Xe2wURRifu2uvT2x7oDa00PJQqchVJOVhTbTpQw6uD3sF" +
       "5KhZp7tz7cLe7ro7\ne70i4htQExMjvhJ8JRoSQ4yRqP8Y0QC+SUz/8BmNij" +
       "EYhWCMgRgMfjOzd7e3V8F4ye7OzXzffN98\n3+97zIGTqNy2ULNsR+mUSexo" +
       "d2IIWzZRujVs2yMwJclHy6uG9q/XjSAKxFFQVSiqi8t2u4IpbleV\n9lhPZ9" +
       "ZCraahTY1rBnX3Kdnl+kXnJj/dva4phOqSqE7VExRTVe42dEqyNIlq0yQ9Ri" +
       "y7S1GIkkQN\nOiFKglgq1tTtQGjoSRSx1XEdU8ci9jCxDS3DCCO2YxKLy8xN" +
       "xlGtbOg2tRyZGpZNUX18K87gdoeq\nWntctWlnHIVTKtEU+w60E4XiqDyl4X" +
       "EgvCyeO0U737G9j80DebUKalopLJMcS9k2VQdLtPg58ide\nvB4IgLUiTeiE" +
       "kRdVpmOYQBGhkob18fYEtVR9HEjLDQekUDT3XzcFokoTy9vwOJEoavTTDYkl" +
       "oKri\nZmEsFF3qJ+M7gc/m+nzm8dZguPbvh4fOtHKflylE1pj+FcA038c0TF" +
       "LEIrpMBONZJ7o3ttlpDiIE\nxJf6iAVN1xVvbYifONQiaJpmoBkc20pkKsnn" +
       "VjbPm+76qSrE1Kg0DVtlUCg6OffqkLvSmTUBzZfl\nd2SL0dziu8Pvb77nFf" +
       "JrEFXGUFg2NCetx1AV0ZVud1wB47iqEzE7mErZhMZQmcanwgb/D+ZIqRph\n" +
       "5gjD2MR0go+zJkKoAp4APEuR+F3CXuDthDxBFEcjVh9mmJyKmhSt0AkdZSiQ" +
       "DQX8P7rVNlWFWKOy\nYZFRiu1to6VcWSaqbjIQYDHrjzgN4LnW0GAPSd5//O" +
       "Mdvesf2iP8xzDnKknRcpAbLciNunKjTG6U\nyY365aJAgEu8vNiuzFEKi6ff" +
       "Xu+sf3SZ/WYQhZKoSk2nHYrHNAJxiDXNmCSKRDkQGzyg51gDoNaO\nAWZBDU" +
       "mDjXiMgCEzFlrox2YhomMwwgC46Z3nPzslTR5kMGJun8N2F6qBE7cJ3WrbEr" +
       "etu33PwhAj\nmixj/gHSxRffXZJPPdx/8PNPvl1SiAGKFpeEZiknCy2/+kOW" +
       "IYNNLVLY/qm/1p5+vHzNG0FUBvEK\nGYtiwBmE/3y/jKIQ68ylK2Ys4KxJGV" +
       "Yaa2wpl2Oq6YRlTBZmOGpmsVeDABAzlk9BnunO3h++9ou3\na47yE+eSYp0n" +
       "eyYIFSHWULD1iEUIzH/79NDjT5zcvYUb2rU0RWHTGdNUOcsVuTwAjp09Q7hH" +
       "G+fs\nfbJt3xc5T84u7N5lWXiKOTJ77/S8Zz7Az0IqgJC01e2ERxziklBOAH" +
       "sv5eNrPIvs/0KXhIHLHzp9\nrBjkPJMeu/PPw89VtwplGE9zHjdNJMfS291f" +
       "xCXJd2zft2I6sUkVWc2fJn3E29/Z8NzZY/Q7bumC\n85m0BdlSBTdiDy5Xf5" +
       "5pCL/2fDqIKpKonpc6rNONWHOYH5JQrOxudzKOZhWtFxcekWU78+Bu9gPP\n" +
       "I9YPu0JOgTGjZuMqgTROUw8ma4TnRnjq3XTIv2wxwl6zszyrCCgxhaIxqLLj" +
       "xIr8+MJLZ+7dvTrI\nXF2eYYqDTeoLdAMO6xV2HXhiXs3e7x/hjkIodIJtuo" +
       "YLX8TfVwoYhiioruqYl7AlgEmbtx5Zipp6\nevu6NsRHpP7BgdjI4HBs4GYp" +
       "NjDSO7yxK+739pClpqGMZNw690byj2uVn5f2CG83evsnL+Ha686T\nxbNPnB" +
       "Z+hmYG2wP5ZFyKEp+Qx+a/9PPB48NzRAYSHceikqLv5RFdB3dDrZmFMyy4kA" +
       "ROfWTpggM7\nh78bEyeJFOf4Xt1Jdzz/JWm7qVaeoZaEoC8Cg/JzdfDUki21" +
       "Pw/KJbnwK0Rocy50LTTv3zoRruHu\nW3+v3YWP3BZ0QzlGURU1zGUayRCtEN" +
       "X+Tfp545UDcN2mlh/6Vu6/a6awbvY6uphNkt979dA3HV9+\n/QAcP4kqBgYT" +
       "3V3xXrBUywXFSXJDpumW0IT6YZC3fSLCStrFYqbO4riqtgh0u/pIUXS15qOr" +
       "Bp5O\neCJudEV80cX9wV79MybHQP74jd7ji6Qg8Ldj3/Fdbd9/dcxt5jwgL1" +
       "D9Ij3gvPngoWl+TB/C+XWB\njQK8hYYEJxWnimrR0WDqcq5as2olKBQBSex6" +
       "EVWVaNyQsRbrefG9munHnJXrhCqzPASxHinbcuzl\ntvOtXAVXYtjTL7r/Kz" +
       "LYKgSfyT5jFN3wP9qw65evvmbFqmUdqymqkMUNhpt1DkVtF+quEnzs3nku\n" +
       "XrK2QPGVLYIpyavA6SRhtbTHah18QWYv/f+fafnyZR1roLv2Cb3KbhVIzB3y" +
       "6v/eQiJIs/V+aazG\nN5ZcGMW1Rl44ffuSw2bDR7wvyl89KsGfKUfTvGXHMw" +
       "6bFkmp3CyVoggJG2Uoar2YshQKGHz44RzB\nNgW14QJswME+Xo4dcHucmQMw" +
       "4o689HdTdEkxPUXVhT9e0vsgzwIpG95v5lzgqYYiFrPmP+/9vS7M\nDwAA");
}
