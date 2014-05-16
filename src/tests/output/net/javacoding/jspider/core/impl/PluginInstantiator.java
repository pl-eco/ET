package net.javacoding.jspider.core.impl;

import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.PropertySet;

import et.util.MyUtility;
import net.javacoding.jspider.spi.Plugin;

import et.util.MyUtility;
import net.javacoding.jspider.mod.plugin.console.ConsolePlugin;

import et.util.MyUtility;
import java.lang.reflect.Constructor;

import et.util.MyUtility;
import java.lang.reflect.InvocationTargetException;

import et.util.MyUtility;

public class PluginInstantiator
{

    protected net.javacoding.jspider.core.logging.Log
      log;
    
    public PluginInstantiator() {
        super();
        log =
          LogFactory.
            getLog(
            net.javacoding.jspider.core.impl.PluginInstantiator.class);
    }
    
    public net.javacoding.jspider.spi.Plugin
      instantiate(
      java.lang.Class pluginClass,
      java.lang.String name,
      net.javacoding.jspider.core.util.config.PropertySet config) {
        net.javacoding.jspider.spi.Plugin plugin =
          null;
        try {
            log.
              debug(
              ("first trying to instantiate via ctr with (name, config) para" +
               "ms"));
            plugin =
              this.
                instantiateWithNameAndConfig(
                pluginClass,
                name,
                config);
            if (plugin ==
                  null) {
                log.
                  debug(
                  ("plugin not yet instantiated, trying via ctr with (config) pa" +
                   "ram"));
                plugin =
                  this.
                    instantiateWithConfig(
                    pluginClass,
                    name,
                    config);
            }
            if (plugin ==
                  null) {
                log.
                  debug(
                  ("plugin not yet instantiated, trying via ctr with (name) para" +
                   "m"));
                plugin =
                  this.
                    instantiateWithName(
                    pluginClass,
                    name,
                    config);
            }
            if (plugin ==
                  null) {
                log.
                  debug(
                  "plugin not yet instantiated, trying via default constructor");
                plugin =
                  (net.javacoding.jspider.spi.Plugin)
                    pluginClass.
                      newInstance();
            }
        }
        catch (java.lang.InstantiationException e) {
            log.
              error(
              "cannot instantiate module - defaulting to console",
              e);
            plugin =
              new net.javacoding.jspider.mod.plugin.console.ConsolePlugin(
                );
        }
        catch (java.lang.IllegalAccessException e) {
            log.
              error(
              "cannot instantiate module - defaulting to console",
              e);
            plugin =
              new net.javacoding.jspider.mod.plugin.console.ConsolePlugin(
                );
        }
        log.
          debug(
          "plugin instantiated.");
        return plugin;
    }
    
    protected net.javacoding.jspider.spi.Plugin
      instantiateWithNameAndConfig(
      java.lang.Class pluginClass,
      java.lang.String name,
      net.javacoding.jspider.core.util.config.PropertySet config) {
        net.javacoding.jspider.spi.Plugin plugin =
          null;
        try {
            Class[] paramClasses =
              new java.lang.Class[2];
            paramClasses[0] =
              java.lang.String.class;
            paramClasses[1] =
              net.javacoding.jspider.core.util.config.PropertySet.class;
            Object[] params =
              new java.lang.Object[2];
            params[0] =
              name;
            params[1] =
              config;
            java.lang.reflect.Constructor constructor =
              pluginClass.
                getDeclaredConstructor(
                paramClasses);
            plugin =
              (net.javacoding.jspider.spi.Plugin)
                constructor.
                  newInstance(
                  params);
        }
        catch (java.lang.NoSuchMethodException e) {
            log.
              debug(
              ("cannot instantiate module - constructor with name and Proper" +
               "tySet params not found"),
              e);
        }
        catch (java.lang.InstantiationException e) {
            log.
              debug(
              "cannot instantiate module - InstantiationException",
              e);
        }
        catch (java.lang.reflect.InvocationTargetException e) {
            log.
              debug(
              "cannot instantiate module - InvocationTargetException",
              e);
        }
        catch (java.lang.IllegalAccessException e) {
            log.
              debug(
              "cannot instantiate module - IllegalAccessException",
              e);
        }
        return plugin;
    }
    
    protected net.javacoding.jspider.spi.Plugin
      instantiateWithConfig(
      java.lang.Class pluginClass,
      java.lang.String name,
      net.javacoding.jspider.core.util.config.PropertySet config) {
        net.javacoding.jspider.spi.Plugin plugin =
          null;
        try {
            Class[] paramClasses =
              new java.lang.Class[1];
            paramClasses[0] =
              net.javacoding.jspider.core.util.config.PropertySet.class;
            Object[] params =
              new java.lang.Object[1];
            params[0] =
              config;
            java.lang.reflect.Constructor constructor =
              pluginClass.
                getDeclaredConstructor(
                paramClasses);
            plugin =
              (net.javacoding.jspider.spi.Plugin)
                constructor.
                  newInstance(
                  params);
        }
        catch (java.lang.NoSuchMethodException e) {
            log.
              debug(
              ("cannot instantiate module - constructor with PropertySet par" +
               "am not found"),
              e);
        }
        catch (java.lang.InstantiationException e) {
            log.
              debug(
              "cannot instantiate module - InstantiationException",
              e);
        }
        catch (java.lang.reflect.InvocationTargetException e) {
            log.
              debug(
              "cannot instantiate module - InvocationTargetException",
              e);
        }
        catch (java.lang.IllegalAccessException e) {
            log.
              debug(
              "cannot instantiate module - IllegalAccessException",
              e);
        }
        return plugin;
    }
    
    protected net.javacoding.jspider.spi.Plugin
      instantiateWithName(
      java.lang.Class pluginClass,
      java.lang.String name,
      net.javacoding.jspider.core.util.config.PropertySet config) {
        net.javacoding.jspider.spi.Plugin plugin =
          null;
        try {
            Class[] paramClasses =
              new java.lang.Class[1];
            paramClasses[0] =
              java.lang.String.class;
            Object[] params =
              new java.lang.Object[1];
            params[0] =
              name;
            java.lang.reflect.Constructor constructor =
              pluginClass.
                getDeclaredConstructor(
                paramClasses);
            plugin =
              (net.javacoding.jspider.spi.Plugin)
                constructor.
                  newInstance(
                  params);
        }
        catch (java.lang.NoSuchMethodException e) {
            log.
              debug(
              ("cannot instantiate module - constructor with name param not " +
               "found"),
              e);
        }
        catch (java.lang.InstantiationException e) {
            log.
              debug(
              "cannot instantiate module - InstantiationException",
              e);
        }
        catch (java.lang.reflect.InvocationTargetException e) {
            log.
              debug(
              "cannot instantiate module - InvocationTargetException",
              e);
        }
        catch (java.lang.IllegalAccessException e) {
            log.
              debug(
              "cannot instantiate module - IllegalAccessException",
              e);
        }
        return plugin;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVYfWwcRxWf853vfLYTfyY1tVO7wSW15Dv77PPZFyOIsR3F" +
       "yTl2cm5DjMt1vTd3\n3mRvd7s7Z19CGlG1NKGCSqXloyikoggFofIhSosQ0B" +
       "BCafmIKJZIW6B8pX+AIBX8gRpBUXkzu3c7\nt3e2qc/Srudm35v33rzf+5h5" +
       "6jqqNnTUIRpBckLDRnA8PivoBk6Oy4JhzMFUQny+2j974YCiViFX\nDFVJSY" +
       "IaYqLRlxSI0Ccl+6YmRnM66tJU+URaVom1Tskqu9/91sovzuxvd6OGedQgKX" +
       "EiEEkcVxWC\nc2Qe1WdwZhHrxlgyiZPzqEnBOBnHuiTI0kkgVJV51GxIaUUg" +
       "WR0bh7GhysuUsNnIalhnMvOTMVQv\nqopB9KxIVN0gqDF2TFgW+rJEkvtikk" +
       "FGY8ibkrCcNO5Bp5E7hqpTspAGwu2xvBV9bMW+vXQeyGsl\nUFNPCSLOs3iO" +
       "SwrsRKeTo2Bx9wEgAFZfBpMltSDKowgwgZpNlWRBSffFiS4paSCtVrMghaCb" +
       "11wU\niGo0QTwupHGCoDYn3az5Caj8bFsoC0HbnGRsJfDZzQ6fcd6a8db/96" +
       "HZN7uYzz1JLMpUfx8w3eJg\nOoxTWMeKiE3GG9ngY1NHsx1VCAHxNgexSTN2" +
       "23fuiP3lYqdJ016GZmbxGBZJQnwr0rFjdex1v5uq\nUaOphkShUGQ58+qs9W" +
       "U0pwGatxdWpB+D+Y8/PPyTox/9Kv5bFaqZQl5RlbMZZQr5sZIct8Y+GMck\n" +
       "BZuzM6mUgckU8shsyquy37AdKUnGdDu8MNYEssTGOQ0h5IPHBc8KMv8a6Iug" +
       "1lk5m5aUKQCloBBJ\nAFgGNYKGFEwWKA5ENQkIWDhmaFIS6wuiquMFKaPJC+" +
       "X4clRcw4rLRePWGXUyQHSfKsMqCfHCtZ+d\nmjzw8bOmDynuLEUJGgTJQVty" +
       "0JIcpJKDVHKwVDJyuZjMm4p3l7orSaPq798abXw4YDxbhdzzyC9l\nMlkiLM" +
       "oYolGQZXUFJxOEwbGJgz5DHMC1fhGQC4okZFiIRQps57KOdjoRase1qZqIV0" +
       "+//dIbiZWn\nKZio81vp6qZq4Mrjpm71PfG79t99dqebEq14qJeAtHvj1RPi" +
       "Gw9NP33156/dbkcCQd0lAVrKSQPM\nqf6sroo4CQnMXv6z/973j0ero89UIQ" +
       "9ELeQtIgDaIAnc4pRRFGij+aRFNws461KqnhFk+imfaWrJ\nkq6u2DMMN1vY" +
       "uBE2oA6eani2WVBtoS/6sZm+WkyU0f102MBS4o37vf0vf7/uebYp+ezZwKXZ" +
       "OCZm\nLDbZ7pjTMYb51z43++inr5/5EPOF5QyCvFp2UZbEHNPvJhf4vqVMXg" +
       "i2tT72mZ5zL+ed3WKvPqbr\nwgnq69x9qzsef0H4AuQMiF1DOolZaCImCeUF" +
       "0HcvGwe4j/T3TouE4s8ZX3tp1cg7L7P4kX9dPl/b\nZSpDeToK0GrHeZbJ8e" +
       "kiroR4z8lzg6vxI5KZ/pz51EF88rk7zt+4Qn7PdtrGB5V2a65UwTsFDroj\n" +
       "V5ebvN98IlOFfPOokdVECOY7BTlL/TAPVc0YtyZjaEvR9+IKZabj0QL+O5zY" +
       "5MQ6kWknHhhTajr2\nO8C4FZ7t8DRZYGxygNGFNDrYzRi62XtXATp+TVcJ6I" +
       "eTOYLcspqG/W/j999U36w9p85de7Dnj69e\nseoT1/fYVH9NPJB99mMXV6to" +
       "GPmhAxGMg7YR0AHRkYt1BeCKRLFRtWaC/gBBNYwzOhwFfZpBEG2Y\nglLS8v" +
       "DEnuil169/Q3qTSall/cgYZbDE+NkMJ9etagatfFzrZa3UPaMZNN1s4YRMTS" +
       "RynVe+3PN2\nF1vfUtrLVVHrt29Z0A/ytcE0OBoJDxP0/k1VqN2hULg3NBAI" +
       "DcEmzO2bigfBKXT9cdM/p6FEl+4H\ntcJyP2pm3tnKopsiMDipZDP8R9DTc3" +
       "hybILtVitBu9YraCAyTSdjphYNzEHvsaLcTgQd+Qyhox1r\ndUasqzvzwX/W" +
       "Pyj8+C4TQ83F9ZBqOvTEK7hnT71YpvL6iaoFZLyMZTvLOKVNs44xH1ANRzr/" +
       "tDdy\n4V5nmvHQ+s/DvJgtIV76+sXfDr3ymwdAi3nkOzgTHx+LTYLCneuKS4" +
       "hNy+2H3EvSiww4VsSX9LnF\nTKPFcV6rY2jTlbmiwOgqKj2H4GmzHNpWrvRw" +
       "PnIkazcz381+7zGjTSxE28iAI9piqijIUxNfvFS3\n+kg2sr/KyvJ76Qsa+P" +
       "dtDuED4d7B/gANkTqNfWcIyaOxwQauPW+petxWdZDNsy2SK9EkHA1E+onp\n" +
       "gbwKjbYK5vmC10G3dQjbOhiV6BAZCIyADtBWKykpnddi3T6ThYtJTzsjdoyD" +
       "urRxhYajT51U0ADz\nlp2yLQvZlt1biWWhUGAkBD08J3GX0WUiPG/nrWvYCf" +
       "+sThox0oWiiofhiVgxEFkrBt77/8bAmYLp\n0QHb9LObNn0o3DvUH4g4IE7X" +
       "lHixn7DFcnj+ZCViI1GGpUJG0Xh5j9jyOOx+atO1CuSNQKnqt8FL\n11vZGI" +
       "X3Qx/EYeKIRJZoHR2jx8lCDFhKP24rzcHy85UoHQqD0oDL29bToQBUKu6+ch" +
       "j8MDzTFgan\nK8bgk/n2AfYzahv6pU2jYXi4NzzIstu6ILxgyw3123K/Uolc" +
       "yGjDg2uh8ClOIOfRr1UicHgoEB18\npyg8T9A2BwJK4fdtzi0jtrbPVKIt4C" +
       "8ahmNqWeEb424BnkULd4sV4+4HtoEDQ7aBz23awOhIbzgU\nGBrZAHc/4uRG" +
       "bLmXK5Eb6Q8Mh9bC3QucwGFb4IuVCBweDERD7xR33yWopUzm4XX9Jacrl6pf" +
       "qkRX\nirqB8onXgTk4CzaXrkIvDdpKrqrNC1Vx5+rdt1/Wmn7K7mIKl541cG" +
       "ZKZWWZP8dyY6+m45TEDK4x\nT7Wm9VcJ6trolg28TP+xvfm1yfYqQe3rsAEH" +
       "/cdz/I6g7eU5CPJZI57+DwRtLaYnqNb+wZP+Gc5r\nQEqH17QynaV5ZKYHpl" +
       "au445rWJRoz5178nueQw//6j/sIOETzat+er0NR9hlCU6hfWOKIJ8w2DUE\n" +
       "/UZvAsWsrmOFFOINtrjOMFc0r7Pb+RNwQVb33NHZyVGztefOsJGKz7CANg89" +
       "w27y1hTOuu8qtzdM\nX/5ESzWftmT9DzPsBE+WGQAA");
}
