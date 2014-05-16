package net.javacoding.jspider.core.throttle;

import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.throttle.impl.DistributedLoadThrottleProvider;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.*;

import et.util.MyUtility;

public class ThrottleFactory
{

    
    public net.javacoding.jspider.core.throttle.Throttle
      createThrottle(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.core.util.config.PropertySet props =
          ConfigurationFactory.
            getConfiguration().
            getSiteConfiguration(
            site);
        net.javacoding.jspider.core.util.config.PropertySet throttleProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            SITE_THROTTLE,
          props);
        java.lang.Class providerClass =
          throttleProps.
            getClass(
            ConfigConstants.
              SITE_THROTTLE_PROVIDER,
            net.javacoding.jspider.core.throttle.impl.DistributedLoadThrottleProvider.class);
        net.javacoding.jspider.core.logging.Log log =
          LogFactory.
            getLog(
            net.javacoding.jspider.core.throttle.ThrottleFactory.class);
        log.
          info(
          "Throttle provider class is \'" +
          providerClass +
          "\'");
        try {
            net.javacoding.jspider.core.throttle.ThrottleProvider provider =
              (net.javacoding.jspider.core.throttle.ThrottleProvider)
                providerClass.
                  newInstance();
            net.javacoding.jspider.core.util.config.PropertySet throttleConfigProps =
              new net.javacoding.jspider.core.util.config.MappedPropertySet(
              ConfigConstants.
                SITE_THROTTLE_CONFIG,
              throttleProps);
            return provider.
                     createThrottle(
                     throttleConfigProps);
        }
        catch (java.lang.InstantiationException e) {
            log.
              error(
              "InstantiationException on Throttle",
              e);
            return null;
        }
        catch (java.lang.IllegalAccessException e) {
            log.
              error(
              "IllegalAccessException on Throttle",
              e);
            return null;
        }
    }
    
    public ThrottleFactory() {
        super();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJ1WW2wUVRg+28u22xZ74dbQQmsBQ5XOCu02gT5oU1rZdqEr" +
       "Cyq1uJzOnN1Oe3Zm\nnDnbbhGJRuT2YGLAW4IaHwyJMT5IxBcTJIh3EtMHQQ" +
       "2JBh80CtEHIzEY/M+Zmc50WkDdZGbPnPP9\n99t5+woqtUzUKFsSmzKIJfWk" +
       "kti0iNJDsWVth620fK40kjwxoOlFKJRARarCUHVCtqIKZjiqKtH4\npq6CiZ" +
       "oNnU5lqc4cPnO4bFx5ffLLg/0Nxah6CFWrWophpso9usZIgQ2hqhzJjRDT6l" +
       "YUogyhWo0Q\nJUVMFVN1DwB1bQjVWWpWwyxvEmsbsXQ6wYF1Vt4gppDpbiZQ" +
       "laxrFjPzMtNNi6GaxBiewNE8U2k0\noVqsK4HCGZVQxXoc7UPFCVSaoTgLwC" +
       "UJ14qo4Bjt4/sAr1BBTTODZeKSlIyrGniiKUgxY/GqAQAA\naVmOsFF9RlSJ" +
       "hmED1dkqUaxloylmqloWoKV6HqQwtOymTAFUbmB5HGdJmqH6IC5pHwEqItzC" +
       "SRha\nHIQJThCzZYGY+aI1GK76+0jyz2YR8xKFyJTrXwZEKwJE20iGmESTiU" +
       "14LS8di+/MNxYhBODFAbCN\n6V79/o7ET6ebbEzDPJjBkTEis7R8vbNx+XT3" +
       "j5Firka5oVsqT4VZlouoJp2TroIB2bxkhiM/lNzD\nD7d9vPOpt8gvRag8js" +
       "KyTvM5LY4iRFN6nHUZrBOqRuzdwUzGIiyOSqjYCuviG9yRUSnh7gjD2sBs\n" +
       "VKwLBkKoDJ4QPDFk/5bxF0O120dNnTFK+jBPySnJYKhTI2yYJ4GsKxD+4THL" +
       "UBViDsu6SYaZgx+e\nQ1jgwqonQyFetcGao5Cgm3UKbNLyicuf7+0dOHzIji" +
       "DPOkdNhjpAtOSJlhzREhctuaKlgGgUCgmh\nS2c7l0dL4UX167tdNc+1WaeK" +
       "UPEQiqi5XJ7hEUqgGDGl+iRR0kxkY60v80XCQbZWjUDigiZpCoxE\noYA3J0" +
       "zUEkxQr6zjsMKQddP7bnx1NT15kucSj/0izt1WDSI5butW1Zra1b/7UEsxB0" +
       "2W8CABdNXt\nuaflq0e2nPz6i0trvEJgaNWc+pxLyesrqH7S1GWiQP/y2L/0" +
       "1+bfjpZueK8IlUDRQttiGJINesCK\noIxZddbl9izuLKCszOhmDlN+5DaaCh" +
       "7ISW9HJM4C/qq1c4g7K6CgaHfXngnfe+GDynPCYrczVvta\naIowu85qPV9v" +
       "NwmB/UsvJ4++cOXgo8LRjqcZChv5EarKBaHI0hAEduE8NS/VLzr2YuvxC24k" +
       "F3rc\nu00TT/FAFp6eXv7KJ/hV6AdQl5a6h4iyQ0IScgXw9z1ivdZ3yL9bHA" +
       "hPrmD19PGJ4EYmN/LEH2df\nq2i2leE0jX4ZK8X7LsdCvl7jcvaEz1CYaPnN" +
       "Oq2YEgcf+b3qAP5ol90P62YXWK+Wz8Vev0ha76+S\n56nlCNONNkomCPUsC0" +
       "rbIiaQa1r1w00/9HWeeDJomugoxKXp7dkymywtn3nn9Hexi9/uBy2GUNnW\n" +
       "wVRPd6IXFG66pbi0XDvR8GDxqPppkZh/dgnNmZuzibr8ZkIumwTGvsYdxnci" +
       "IpbNQvca0LwSnjZ4\n7nS6rvjnh3X8tdBOd/7qmDdBQjPm1/vNt2eQPbH2Hr" +
       "98oPX7b847U813W/JQP6f35089e3pamBmB\newu2tnomwL2Jr0LiLgEVLrqh" +
       "Z0yF3djjDJULyvWx9aBPHQji1yxJVaSELmMa3/TGmcrp5/Od/bYm\nC3yA+K" +
       "Z0oen8m603moUGjsCwb24632UT2Nzq5RD/62fovv83jza2t69tj7V1dDBej8" +
       "xuNosYWn2T\nGYMNVcrpCqFSCtC3r9gehu6QTYIZcUUL2AO2v3Z4/lon9gf4" +
       "66HbWKPmDDqcEhvO/TMOO2DLuljH\n2vXtbbENdzO0ko2q1sw0dO2dRxUwtu" +
       "0/DVRUgH4acCRvePVzrtD2RU9umd695qxR+5kYEjOXsXKI\nbCZPqa9O/DUT" +
       "NkySUYWXyu3eb7vsMZhf/0Zd8Czzm7nLJscMNdyCHLKA//kp4Ja8ZH4Khsqc" +
       "lR+f\nhYjPxjNU4X34oWMMFQOUL8cNNxg1Ym7w+4VkF2fB+Aebei6U5gwAAA" +
       "==");
}
