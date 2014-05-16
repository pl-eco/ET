package net.javacoding.jspider.mod.plugin.console;

import net.javacoding.jspider.mod.plugin.FlatOutputPlugin;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.PropertySet;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;

public class ConsolePlugin
extends net.javacoding.jspider.mod.plugin.FlatOutputPlugin
{

    final public static java.lang.String
      MODULE_NAME =
      "Console writer JSpider module";
    final public static java.lang.String
      MODULE_VERSION =
      "v1.0";
    final public static java.lang.String
      MODULE_DESCRIPTION =
      ("A simple JSpider module that writes down all jobs carried ou" +
       "t by the JSpider on your console");
    final public static java.lang.String
      MODULE_VENDOR =
      "http://www.javacoding.net";
    final public static java.lang.String
      PREFIX =
      "prefix";
    final public static java.lang.String
      ADDSPACE =
      "addspace";
    final public static java.lang.String
      PREFIX_DEFAULT =
      "[Plugin] ";
    protected java.lang.String
      name;
    protected java.lang.String
      prefix;
    protected net.javacoding.jspider.core.logging.Log
      log;
    
    public ConsolePlugin(java.lang.String name,
                         net.javacoding.jspider.core.util.config.PropertySet config) {
        super();
        log =
          LogFactory.
            getLog(
            net.javacoding.jspider.mod.plugin.console.ConsolePlugin.class);
        this.
          name =
          name;
        prefix =
          config.
            getString(
            PREFIX,
            PREFIX_DEFAULT);
        log.
          debug(
          "plugin \'" +
          name +
          "\' prefix is \'" +
          prefix +
          "\'");
        if (config.
              getBoolean(
              ADDSPACE,
              false)) {
            prefix =
              prefix +
              " ";
            log.
              debug(
              "adding space after prefix");
        }
        log.
          info(
          "Prefix set to \'" +
          prefix +
          "\'");
    }
    
    public ConsolePlugin() {
        super();
        log =
          LogFactory.
            getLog(
            net.javacoding.jspider.mod.plugin.console.ConsolePlugin.class);
        prefix =
          PREFIX_DEFAULT;
        log.
          info(
          "Prefix set to default: \'" +
          prefix +
          "\'");
    }
    
    public java.lang.String
      getName(
      ) {
        return MODULE_NAME;
    }
    
    public java.lang.String
      getVersion(
      ) {
        return MODULE_VERSION;
    }
    
    public java.lang.String
      getDescription(
      ) {
        return MODULE_DESCRIPTION;
    }
    
    public java.lang.String
      getVendor(
      ) {
        return MODULE_VENDOR;
    }
    
    protected void
      println(
      java.lang.Object object) {
        System.
          out.
          println(
          prefix +
          object);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVae2wcxRmfs53zE5zYzoPYcS7BLbjYdz6fnzESXP1QLjnb" +
       "h89JiHF0rHfHzoa9\n3WV3znYCjYoKJOUPJAT0oVIQqBVVhaAqAoTaQhFQ6I" +
       "Oq+A+grUCtQJSqhVKhCgRU6Tcze97ZvbMd\n5Yql3VvPfjPf9/2+x3wzs4+8" +
       "jzbZFmqR7TA5aWI7PJxOSZaNlWFNsu1paMrIL26qTj18UDfKUCCJ\nylSFoP" +
       "qkbEcUiUgRVYkkRoaWLRQyDe3kgmYQZ5yCUfZd+vnS784caC5H9TOoXtXTRC" +
       "KqPGzoBC+T\nGVSXxdk5bNlxRcHKDNqiY6yksaVKmnoKCA19BjXY6oIukZyF" +
       "7SlsG9oiJWywcya2GM98YxLVyYZu\nEysnE8OyCdqcPCEtSpEcUbVIUrXJUB" +
       "IF51WsKfaN6DQqT6JN85q0AITbknktImzEyBhtB/IaFcS0\n5iUZ57tU3KDq" +
       "gMRuf49VjdsOAgF0rcxictxYZVWhS9CAGrhImqQvRNLEUvUFIN1k5IALQTvX" +
       "HBSI\nqkxJvkFawBmCdvjpUvwVUFUzWGgXgrb6ydhIYLOdPpsJ1poM1v33jt" +
       "THIWbzCgXLGpW/Ejq1+jpN\n4XlsYV3GvOMnufA9iaO5ljKEgHirj5jTxL/0" +
       "1KHke8/u5jTNRWgm505gmWTkz/tadq3E36kup2JU\nmYatUlfwaM6smnLeDC" +
       "2b4M3bVkekL8P5l7+c+tXRr/8Y/6MMVSVQUDa0XFZPoGqsK8POcyU8J1Ud\n" +
       "89bJ+XkbkwSq0FhT0GD/AxzzqoYpHEF4NiVynD0vmwihSrgCcI0h/reZ3iBe" +
       "wM3BN3FKyy2oetgk\naFDHZJa6gGwoYPzZE7apKtiazRrKrMmoZmXeZ9bXd5" +
       "lyq18KBGjY+oNOAw/db2gwUkZ++O3f3Dx6\n8JtnuQmp2zlyEtQP3MMu97DD" +
       "PQzcw5x72OEe9nBHgQDju90LMLWYQgPrnz8d2nxnp/1kGSqfQdVq\nNpsj0p" +
       "yGISAlTTOWsJIhzCO3CN7PnA48tm4OnBeEyWgwEAsWQHTRQnv9TuqGdgKeJP" +
       "C8ldPn/vBB\nZulx6k/U/k10dC4aWPMGLltde/rYgevP7i2nREsVYJcyIG3b" +
       "ePSM/MEd44+/9ts3L3eDgaC2ghgt\n7EljzC9+yjJkrEAOc4f/9qf7P7x70+" +
       "ATZagCAheAJxI4HOSBVj8PT6wN5fMWBQt61s4bVlbS6Kt8\nsqkhxy1jyW1h" +
       "vnMRe6aeWQvXJri+4nhriN7oywZ6a+SeRvH06cCy4iffCHa9/vPaFxko+QRa" +
       "L2Ta\nNCY8HLe45pi2MIb2N7+Tuvve989cx2zBjREgKGjm5jRVXmbybQ+A7R" +
       "uLpIbwjqZ7vtV+3+t5Yze6\no8ctSzpJbb18y8qu774kfR/SBoSvrZ7CLDrL" +
       "Vs2+A+eHHB0e58mGp6ab73v79va//PEVJ30J06JL\n9ffMrbknb3t2pYxCXA" +
       "0TlGRP5KOLTZD0KcAmDTAjc3naUs3wrOEBHCVOz76BWD8I1ACc6IQaVpVw\n" +
       "0pAlLTHy4HO1K3fl+g5wUS4SCBIjmeXdr/yw/VyIieBwDAoZ0vm/clGyJtzA" +
       "pz/dBH31gnPPvlh3\nR3d/Z2yA8ITCLNUEEyyzAQ3nMJ/M2IsIV3WfoOoAex" +
       "Gjt6FSBenp6uwFQSCR6/PqQl6U2BqpTTYs\nzL2E09NAZIUDuGPe4+i9gz13" +
       "0khg3oKYDntZa2tB5HQ5kdNRLHLo7cvrDr0h32GHhCZCf7IfoxVM\nPotk52" +
       "76z/P314R4VNA+LWyYGvCtZtHZPb0y8o2n7outpI+o3Mn8c7uP+NQzh+7/5B" +
       "XyFgt5N1FR\nbnuWCwU8LAk5dOC1xS3BnzyQLUOVM2gzq88knRyWtBxNCDMQ" +
       "LPaw05gEZxffe6slHodDq4m4xZ8k\nBbb+FOnOgvDsjUs3K+6AaxyuBse2DT" +
       "7bBiBV7XL8MbRkqVCyhQ6kmZeFwHNzvDaYYuO1sftlPMWV\nE5BG1SVWSrWD" +
       "59qsBF4mqHZ8cuRQcjQzER8fFUNnxg2dbn+W4LYZuXrwuXfef0z9mGWCGlbV" +
       "xmkP\nR8tq1iKkp3LDtGn9JBTwzkhtk6Y9xNj2EFTD2Eajg/3RkuK0t7sj2t" +
       "vZ3UfQ0QusOcICNpfZISJZ\nC5iExFYq8nVeEE9DEViIFdUQuVYFl73YTVyj" +
       "ei4rvoQyqWJqND5CRx/gMyG9j3v8pB+uRqdTYxE/\nqViMhrvovwtF3IE+H2" +
       "G+QG/Xgh9c7KhweHQqnZicEF0hK7gCz6KzopVipVmpj1lpkKBMiVZyJC80\n" +
       "lPOCCq4XKEpb8bpA3w1XkwN0UxGgZ+MhW82aEJHeUAyR4xLhUWqHFGNJD0El" +
       "GjphzNkhWbIsFSsh\nWHSF5k4CodvX0EMnjZwVclSlbMh5GbDB0WtkND08lU" +
       "hN+4x4SjDiYKERe0syYl8XNWIMPGGhRCMK\n0hcaUnhJFbipqNIbG/QgXFsd" +
       "g24tYtBLjhNi7otElpaWRFVAM0pzy3lZ46JVL5sYmZwSDXFGqEm6\nCg3RX5" +
       "ohelg0QW1yrORoooIXCybaTsU+69dyY+SjcG13kN9eBPmgaeF5lcF053nBHE" +
       "xNjY4lrhXx\nvUfAN+rHd2Cgr7Tar7cj1tPZ00XQ5IXiyyUWgOUNVNB7VxXa" +
       "GMpe5xflf31QVkmKYpuwJqdN3zsv\nMKviIyPpVHzYUwc8KMDZXeCu0dKSf6" +
       "y/IxbtjEHyT18onHmZBUDzTVTYhwS1Ngb1Srh2OqDuLAJq\n9XWc67EQbfvR" +
       "+U2s3KKQosbih5LTIraPCtjGCrDt7SkJ2x6YWGG9FC1hYvVKXuCy+RdU8McK" +
       "FD1N\nm2WCKo9MJaanRyfWBP5iB+wWB/gWP/CIrR6fKkSbWsS0DAJFOVaWxY" +
       "WhA/AvBIB7CnMBLEjjJThv\nT8dAZxTydfX0/kQ6nK/vnyFurf/EukpTRXc5" +
       "Su8qrvQL9Pb0amIUdXtJ0K23wHkGSqud+wbYYhui\nu5Yp5+bllz1Zeu1wog" +
       "pug6vVUbC1uIK/dxQs1wzPyv1VQbu+wtDoK8lyPf3UcoBQFVMOWFMGK1wK\n" +
       "plZ+SX/Zekt6IF6gjUneqZ4J7qy6maodwmoYVtwW2rXWrjfbsT9z7b/rbpde" +
       "OMYXxA3ejU66Ruh9\n4A3cfnWdXGRbtZoYZqeGF7Hmrtr93MbZaUB+gVp/ZP" +
       "dfx/oe/pp/2c7OZMRlu7dbRn7u0Wf/3PvG\nn24FKWZQ5cRkejieHAWBd6/L" +
       "LiNvWWy+pvy4+jJbLjor6IIzDG+nIe+6ucbCJGfp057Vc8izM9IM\nV8xxuZ" +
       "jP5ZiRBBtd6M7I3yCpQRqc8CWbD1yX7Ym6m03/Km15FO2IRju7IctsdlhCGu" +
       "YwsNBDjNE7\nHgxandUhyv9+ARh8BNEIAh3Glq2CyAIMnwowdLswfFYaDL0U" +
       "hhjUXY0u142R2AvXkIPE0BeExDmY\n+UCmEWzLlmoSLxqBoIBGbBWNQGVpaA" +
       "wyNKA+2O7lvDEidJ65ykHkqi8GkUAt6MyspCuGJYLRIIDR\n44LRWNpUFWMR" +
       "AjVkwyrT9XGgU1M7XMMODsNr4fB0UVUDvPYQFWsWFOt1FWspTbF+OgfTtUbQ" +
       "YBuP\nRba8+Y7kxibZDinLtFSdaLp/VzZlqVmVqIvOIeoTMx91Ke9eMcInoR" +
       "3i4bxIuL/7HG5rfO9Dvh/r\nPYgospvrY3JX6w/effztqSY+kfHj7EsLTpTF" +
       "PvxIm5mmzqRT6Z71ODDqF67Y88jpqbfmypxAfZPu\niRn0G4Igk7cL0XW6B3" +
       "V6qLOj4GsCfuYt7125/vLnzS2/Zmdlq+fSVUlUNZ/TNHF7V3gWaqUqvtnL\n" +
       "PQas2n7eZTkYz3mixg04TgfF2Z4Nh6DVGnsQe0L1tHPtnlAGZflHA3l6iK1t" +
       "xelBMudJpL8SUqKX\nHmYL9x+R9CrgxjdWAlebYkjFhf2qPjPv+t0bYzamSW" +
       "QyR8wc4TalztIkbMimTSyr9JBr+aGfVVxz\n56ufsXqEAky/BqFfQMh2ZFG1" +
       "VRKJ65J20manA/QdPSmWc5aFdcIKN8fEtTYfkX/x0Cxub6/yaps+\nmhot3O" +
       "Ee6Po/VOm0OKighWwJp+unLXRJMYyY3E6aZFvTVAPF4fc/6TJBBcEjAAA=");
}
