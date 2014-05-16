package net.javacoding.jspider.core.storage;

import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.memory.InMemoryStorageProvider;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.impl.StorageImpl;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.*;

import et.util.MyUtility;

public class StorageFactory
{

    
    public net.javacoding.jspider.core.storage.Storage
      createStorage(
      ) {
        net.javacoding.jspider.core.util.config.PropertySet props =
          ConfigurationFactory.
            getConfiguration().
            getJSpiderConfiguration();
        net.javacoding.jspider.core.logging.Log log =
          LogFactory.
            getLog(
            net.javacoding.jspider.core.storage.StorageFactory.class);
        net.javacoding.jspider.core.util.config.PropertySet storageProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            CONFIG_STORAGE,
          props);
        java.lang.Class providerClass =
          storageProps.
            getClass(
            ConfigConstants.
              CONFIG_STORAGE_PROVIDER,
            net.javacoding.jspider.core.storage.memory.InMemoryStorageProvider.class);
        log.
          info(
          "Storage provider class is \'" +
          providerClass +
          "\'");
        try {
            net.javacoding.jspider.core.storage.StorageProvider provider =
              (net.javacoding.jspider.core.storage.StorageProvider)
                providerClass.
                  newInstance();
            net.javacoding.jspider.core.util.config.PropertySet storageConfigProps =
              new net.javacoding.jspider.core.util.config.MappedPropertySet(
              ConfigConstants.
                CONFIG_STORAGE_CONFIG,
              storageProps);
            return new net.javacoding.jspider.core.storage.impl.StorageImpl(
              provider,
              storageConfigProps);
        }
        catch (java.lang.InstantiationException e) {
            log.
              error(
              "InstantiationException on Storage",
              e);
            return null;
        }
        catch (java.lang.IllegalAccessException e) {
            log.
              error(
              "IllegalAccessException on Storage",
              e);
            return null;
        }
    }
    
    public StorageFactory() {
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
      ("H4sIAAAAAAAAAJ1WXWwUVRS+u9vudtvFdlt+GlpoU1CpwKz8NYHGxGZpw8KW" +
       "riyKrCXL7czddmB2\nZpy5024RiUYE9MHEgH8JanwwJMb4IBFfTJAg/pOYPg" +
       "hqSDT4oFGIPhiJweC5d2Y6s9MC6iYze+fe\n83++c859+wqqNQ3ULpoCndSJ" +
       "KaTzOWyYREor2DS3w1ZRPFcbz53YomphFMqisCxR1JgVzZSEKU7J\nUiqzsb" +
       "dioE5dUyZHFY06cmZI2bDk+sSXhze3RVBjATXKap5iKotpTaWkQgsoUSblEW" +
       "KYfZJEpAJK\nqoRIeWLIWJH3AaGmFlCzKY+qmFoGMbcRU1PGGWGzaenE4Drd" +
       "zSxKiJpqUsMSqWaYFDVl9+BxnLKo\nrKSyskl7syhakokimY+iAyiSRbUlBY" +
       "8C4fys60WKS0wNsH0gr5fBTKOEReKy1OyVVYhER5Bj2uOl\nW4AAWGNlQse0" +
       "aVU1KoYN1GybpGB1NJWnhqyOAmmtZoEWihbeVCgQ1elY3ItHSZGi1iBdzj4C" +
       "qjgP\nC2OhaF6QjEuCnC0M5MyXraFo4u9nc3928pzXSERUmP0xYFocYNpGSs" +
       "QgqkhsxmuWcCyz02oPIwTE\n8wLENk3fne8/mP3pdIdN0zYLzdDIHiLSoni9" +
       "p33RVN+P8Qgzo07XTJlBocpzntWcc9Jb0QHN86cl\nskPBPfxw28c7n3iL/B" +
       "JGdRkUFTXFKqsZFCeqlHbWMVhnZZXYu0OlkkloBtUofCuq8W8IR0lWCAtH\n" +
       "FNY6pmN8XdERQjF4QvDcg+xfkr0AgHkAIiRmADNETgo6RWtVQocZBkRNguwP" +
       "7zF1WSLGsKgZZNi0\nyYeDbBWmqXEiFGIlGyw4BdC5SVNASFE8cfnz/f1bnj" +
       "lip49BzrGRotWgWPAUC45igSkWHMVCtWIU\nCnGVC6rjyhIlsXr69d3epudW" +
       "mqfCKFJAcblctigeUQjUIVYUbYJIRcqBmPSBnmMNgJoYAcyCHUUF\nBPEagU" +
       "COG6griE2vojOwwgC4qQM3vrpanDjJYMTSPpdJt02DJO61bUt053dt3n2kK8" +
       "KIJmpYfoB0\n6e2lF8Wrzw6e/PqLS8u8GqBo6YzSnMnJSitofs7QRCJB6/LE" +
       "v/TXpt+O1q5/L4xqoF6hY1EMOIPy\nXxzUUVVivW67YsECzoaSZpSxwo7cHl" +
       "NPxwxtwtvhsJnDXkkbQSxYAQN5p7v2VPTeCx80nOMeu02x\n0dc984TaJZb0" +
       "Yr3dIAT2L72cO/rClcOP8EA7kaYoqlsjiixWuCELQpDYllnKXWide+zF7uMX" +
       "3Ey2\neNL7DANPskRWnpxa9Mon+FVoBVCSpryP8IpDXBNyFbD3cr5e4Ttk31" +
       "0OCQNXsHYG2DBwM1MeeeyP\ns6/Vd9rGMJ52v44l/H2X4yFbL3Mle8qnOQy0" +
       "6GZNlg+Iww//njiEP9plt8Lm6gLrV63yutcvku77\nE+IslRynmr5SIeNE8T" +
       "wLahvkw8d1rXFHxw8DPSceD7rG+wlxefrTg9VsRfHMO6e/W3fx24NgRQHF\n" +
       "tg7l033ZfjC445bqimJyvO2ByJj8aZiPPruEZozMaqZev5uAZYPAxFdZwNhO" +
       "nOeyk9veBJY3wNMF\nT4vTcPk/O2xmrxYb7uy19pYAuS160hTNEQ2CKXFaI0" +
       "Ss1R8xe2LZ823/8cuHur//5rwzA313K4/q\n5+JB69TTp6d4ZOJwy8HmVs9r" +
       "uGWxVYjfPKAp8Abq+V9vT4IsRXWcc/WaHrCnGRSxS5kgS0JWE7GS\n2fjGmY" +
       "ap562ezbYlc3wEmY3FSsf5N7tvdHILHIVR35R1vmPj2NjqwY79DVJ03/8ZXx" +
       "tWrV+xatXK\nNWvhplUVzLvNTjvNPPZzKVr+H4YUqlB0R7Uq1kNaZ1xI7WuT" +
       "2DW1e9lZPfkZ77vTV5s68LxkKYoP\nen4YRnWDlGQe9Tq7ndop2EHRkn9hK0" +
       "UxZ8U9fMhmLlDUdgtmimrYn59jF0Rudg7Q4Kz89LshNNX0\nFNV7H35SkaII" +
       "kLKlpLt5aOKNmA1swYZuRf8HdHze9TIMAAA=");
}
