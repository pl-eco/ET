package net.javacoding.jspider.core.logging;

import net.javacoding.jspider.core.logging.impl.SystemOutLogProvider;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.*;

import et.util.MyUtility;
import java.util.HashMap;

import et.util.MyUtility;
import java.util.Map;

import et.util.MyUtility;

public class LogFactory
{

    public static String[][]
      replacements =
      { { "net.javacoding.jspider.",
    "" } };
    public static java.util.Map
      loggers =
      new java.util.HashMap(
      );
    public static net.javacoding.jspider.core.logging.LogFactory
      instance;
    protected net.javacoding.jspider.core.logging.LogProvider
      provider;
    
    protected LogFactory() {
        super();
        net.javacoding.jspider.core.util.config.PropertySet props =
          ConfigurationFactory.
            getConfiguration().
            getJSpiderConfiguration();
        net.javacoding.jspider.core.util.config.PropertySet logProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            CONFIG_LOG,
          props);
        java.lang.Class providerClass =
          logProps.
            getClass(
            ConfigConstants.
              CONFIG_LOG_PROVIDER,
            net.javacoding.jspider.core.logging.impl.SystemOutLogProvider.class);
        try {
            provider =
              (net.javacoding.jspider.core.logging.LogProvider)
                providerClass.
                  newInstance();
        }
        catch (java.lang.InstantiationException e) {
            
        }
        catch (java.lang.IllegalAccessException e) {
            
        }
    }
    
    protected static synchronized net.javacoding.jspider.core.logging.LogFactory
      getInstance(
      ) {
        if (instance ==
              null) {
            instance =
              new net.javacoding.jspider.core.logging.LogFactory(
                );
        }
        return instance;
    }
    
    public static synchronized net.javacoding.jspider.core.logging.Log
      getLog(
      java.lang.Class category) {
        return LogFactory.
                 getLog(
                 category.
                   getName());
    }
    
    public static synchronized net.javacoding.jspider.core.logging.Log
      getLog(
      java.lang.String category) {
        java.lang.String effectiveCategory =
          LogFactory.
            translate(
            category);
        net.javacoding.jspider.core.logging.Log log =
          (net.javacoding.jspider.core.logging.Log)
            loggers.
              get(
              effectiveCategory);
        if (log ==
              null) {
            log =
              LogFactory.
                getInstance().
                instantiate(
                effectiveCategory);
            loggers.
              put(
              effectiveCategory,
              log);
        }
        return log;
    }
    
    protected net.javacoding.jspider.core.logging.Log
      instantiate(
      java.lang.String category) {
        return provider.
                 createLog(
                 category);
    }
    
    protected static java.lang.String
      translate(
      java.lang.String category) {
        java.lang.String effectiveCategory =
          category;
        for (int i =
               0;
             i <
               replacements.
                 length;
             i++) {
            String[] replacement =
              replacements[i];
            if (category.
                  startsWith(
                  replacement[0])) {
                effectiveCategory =
                  replacement[1] +
                  category.
                    substring(
                    replacement[0].
                      length());
                break;
            }
        }
        return effectiveCategory;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZe2wUxxmfO78f4BcPFxtswATc+M6+853xoyWxbCPbHNix" +
       "CRQHdFnvjY+Fvd3N\n7px9phT1QQPNH1GjPNqqNLRVK6Qq6iOI9A/SUpSkSR" +
       "9Ijf8gtFVoKyKaKiUlqipQS0W/mdm93ds7\nHr62lnY9N/t9833z+56z+9I1" +
       "VGToqFE0/GRew4Z/YHJc0A0cG5AFw9gJU1HxjaKy8VPbFNWLPBHk\nlWIEVU" +
       "VEoz0mEKFdirWPDPaldNSsqfJ8XFaJuU7WKr3rb839+thoQwGqmkJVkjJJBC" +
       "KJA6pCcIpM\nocoETkxj3eiPxXBsCtUoGMcmsS4JsnQICFVlCtUaUlwRSFLH" +
       "xgQ2VHmWEtYaSQ3rTKY1GUGVoqoY\nRE+KRNUNgqojB4RZoT1JJLk9IhmkL4" +
       "KKZyQsx4wn0BFUEEFFM7IQB8IVEWsX7WzF9q10HsjLJVBT\nnxFEbLEUHpQU" +
       "QKLJzZHeccs2IADWkgQm+9W0qEJFgAlUy1WSBSXePkl0SYkDaZGaBCkErbrj" +
       "okBU\nqgniQSGOowTVu+nG+SOgKmOwUBaClrvJ2Epgs1UumzmsNVZc+e+nxm" +
       "80M5sXxrAoU/1LgGmNi2kC\nz2AdKyLmjDeT/udG9iQbvQgB8XIXMafp3/Dj" +
       "RyPvn2viNA05aMamD2CRRMVbXY2rF/rfKyugapRq\nqiFRV8jYObPquPmkL6" +
       "WBN69Ir0gf+q2HP5v4+Z7Pfg9/4EWlI6hYVOVkQhlBZViJDZjjEhhHJAXz\n" +
       "2bGZGQOTEVQos6lilf0GOGYkGVM4imGsCWQ/G6c0hFAJXB64RhH/q6Q3gioj" +
       "anyrQL1x3q8R1KFg\nspfaX1RjYPm9BwxNimF9r6jqeK+sxuN00smSohKq5j" +
       "weGqruQJPBK4dVGRaIiqeu/PLw0LYvHedm\no65m6kaQH4T6baF+U6ifCvWb" +
       "Qv22UOTxMHErM7GkxonRGPrry33VT/uMV7yoYAqVSYlEkgjTMobY\nE2RZnc" +
       "OxKGHOV+NwdOZf4JyV0+CnIC4qw0IsLgC8WR2tc/ujHcUjMBLAyRaO3P7Nh9" +
       "G509R1qKmX\n0dW5amC4g1y3ytbJfaOPH19XQInmCqlNgLTl3qtHxQ+f2n76" +
       "4q/e3WT7PUEtWeGYzUnDya3+uK6K\nOAbpyl7+K/8cvv5sUc8ZLyqEGIUsRQ" +
       "TwLQj5NW4ZGWHVZ6UoChZwVsyoekKQ6SMrr5ST/bo6Z88w\nl1nCxtUAwFK4" +
       "iuBabzpmPb3Rh7X0VscdjOLp2gNLgDe/UNzxzqsVbzBQrFxZ5Uiqk5jwyKux" +
       "zbFT\nxxjm3/3q+LPPXzv2GLOFaQyCyjRdJRDhOJZiKq70gPnrciQCf/2y51" +
       "5oPfGOZe86W0C/rgvz1Nyp\nzy2s/tqbwjcgSUCwGtIhzGIRMWHIEkDvbWzs" +
       "czykv9eZJNQF3dG1lZYJy36J6U//47UXy5u5MpSn\nkS1TCIo1YItlaGB7Bl" +
       "dUfOLQic6Fyd0Sz3fuBOoiPvTTR1+8eYFcZmDbLkKlrU1lK7hLcHhv98XZ\n" +
       "muIfnkx4UckUqmZFUFDILkFOUlNMQRkzBszJCFqS8TyzJPH825cOgUa3ezrE" +
       "up3TTjswptR0XOby\nx1q4iuGqNv1xqcsfPUijg17G0MLuG7n3eAkq1pLTsi" +
       "TCwGBNRAoyrI41mggTWCEG9WNHQ8MchTrT\n0blt1zY13vi6F3kBWugsBGOH" +
       "rSt0NnTkyVEY0ytExZcLWj7ynl3RwiK4cFow+PbcHUV2w5DRBzA0\nKjLQqL" +
       "dQyIEGI+ynt8EUbK7e6WvcVFy5wyeuPNn6x99eMIuvAwOb6i/Ro8lXvnhuwU" +
       "uVuiMIbAfg\ndtFMA5bzUjRMUCnj7AqFeCAsgy6LhSZ1Hz/vaDRNS9NtDoLe" +
       "taAQ7Rr9Usz0+sGHe86/d+0H0g2m\nTTmDsJ8ymOqUsRmHfgWqZtDy7+g/zZ" +
       "VaxjSDZuElDiEjg9FU04Xvtt5uZuubmyt2tBLm75JZQd/h\nrJYcmK6ujk6C" +
       "ehZbrnu7wm2dYV+4g6Bdi6u6fqcbbzSaiaDHMWnOmPY/ltpH9YwQVADDI9Dv" +
       "ZONK\n0TCdiXoX4LLUNs+Qkkw4H8J+CyeG+gfT2dFjFk36O8zdzgzIqZwBWT" +
       "QjKQLrELdALBbLWImT/e6k\nOK5LCcB81mwUz0z9vSN29cFB7qv1zgOIk3A4" +
       "eBu31L1/nafDTHfNkUxdQp5Z852rp69MLOPlnLfs\n67O6ZicPb9uZl1dqNN" +
       "jW3k0Co379wbUvHZm4PM13UpvZMFGswycv4daHK8UcXVkB5AlAjO2LIT2Q\n" +
       "SlvBy+G14qvONuCArCqYtlvWM94GSao/fWSCh6kse0L5cFpkO8tIdvk4//1z" +
       "vw9f+t1R0HMKlewY\nmxzojwzBlppcELj5amYbHinYL73FgsysGFkHo0ymvs" +
       "w6Ua5jONcpOzOSTTP3PIZKttt5uLvdtbrf\ns/RD51UkUjBzJDGeMlHKzmGd" +
       "jGq7IzsE888Ooc0ETfzvswPV8LCrHtK53bzDYxGdUXc6zP/I+p9d\nhT+fI+" +
       "gZ+vT2EABUQnWFwzuj2MprxDG7RoRduIV78sIt3NkWCPoCPQQNLxI3Uz0HZO" +
       "YM1eu4rT8D\nynKFJXaruV3Q7gTfA3DVmfDV5Ybvy/eCr1Qyo8KJ3/M2fpvd" +
       "+HWH8sEvFGgLhH1BqGiji8TP0s8B\noDVFNXvBsQXb13IhttQ8giw3EVueG7" +
       "ET9PYArArHhFmqmROYkzYw3VmOlRcw4Z62QKcvGACb7xwe\nmfRbUuni33Ro" +
       "keEe7feJ4biDuYptwDCPG3ZaarTylY5W3+mdDCs1xz71UeWTwuv7vGb+gra9" +
       "jKia\nT8azWLZPMe5FMnNv1e6mP23tOvUZ9zGmiI3VtLHWwfUJuDaYxtqQ88" +
       "yY5dsFdNzKfBvykDGviHAy\nVeBUFvsvk/WPCKoA3xvJESxn0z4R3uxqNCOq" +
       "KMgjg986X7HwTLJr1EJujN5eJah38d4SbAt0+zoD\nH+fMi4kjh/YMPORCvM" +
       "lEvM1EvG0RiPNsQm9nckPpbOpM2N5Mw9bVweZ/Qm9v5ZVcQm2hkC/cDSuK\n" +
       "AsFxmLUipcrZuIA339vS56ElAqxAgFPbt20j99jaLhD00N20TagxLO+l74aT" +
       "uohH6LEMelXQOBAM\n0noSCoMhw4s3pKUcbHDjfXLnMvcnzRKMrP//R3Nfts" +
       "0dtAH8Q17m7mbm7nGYm641em/bXspp26u2\nagFbtT/nqVpnwNcF2byKy4Gq" +
       "xdtLuuRFtxFoSfLD1WsaoTeXEVg9ul+Y/2bvZbO9l+t5VSbYSwe4\n6OJh/g" +
       "CSJa/JRAJOp343bP26bP1u5qlfIOQLdcEJxCHs7oDTmt8D1xYT8C335/Veu6" +
       "zcr8N7vPZO\n7YzhKciraQ+2hTp84TwscYvWaF1QDDnTDp5yW7tuW7uKPLUL" +
       "BnxhOFLUpkVlWGGUnmPKbR76LrU+\n65Md/7Akrlt4fNNrWs0v+Dsu6+NPaQ" +
       "SVziRl2fl6zzEu1nQ8I7Edl/KXfXyXNXDivo/8aDbhMKJQ\neKo5MyTXhrsw" +
       "E1RI/zk5VhK0IjcHSDBHTvpVBC3NpAec7B9O0tVwXAdSOlzD2tRDKfNNo9Vr" +
       "TGpY\nlGi3kfr22cJHnn77X+xEXCLyj5z0w55otM9KhkTa+6EIzRvsfSx9Rr" +
       "+KiEldh+Maq5EmqBUGX5F/\nyGtwvvZKy2rZuWd8iL+xGHN0wnm9uOKdcAB4" +
       "C2knvPjPRkd09LFcgDAlkX3MZOruMsX8B7dPBnWF\nHgAA");
}
