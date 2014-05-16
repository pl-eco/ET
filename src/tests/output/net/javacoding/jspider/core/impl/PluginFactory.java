package net.javacoding.jspider.core.impl;

import net.javacoding.jspider.core.dispatch.impl.PluginSocket;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.*;

import et.util.MyUtility;
import net.javacoding.jspider.spi.Plugin;

import et.util.MyUtility;
import java.util.ArrayList;

import et.util.MyUtility;

public class PluginFactory
{

    net.javacoding.jspider.core.impl.PluginInstantiator
      pluginInstantiator;
    
    public PluginFactory() {
        super();
        pluginInstantiator =
          new net.javacoding.jspider.core.impl.PluginInstantiator(
            );
    }
    
    public Plugin[]
      createPlugins(
      ) {
        net.javacoding.jspider.core.logging.Log log =
          LogFactory.
            getLog(
            net.javacoding.jspider.core.impl.PluginFactory.class);
        java.util.ArrayList loadedPlugins =
          new java.util.ArrayList(
          );
        net.javacoding.jspider.core.util.config.PropertySet props =
          ConfigurationFactory.
            getConfiguration().
            getPluginsConfiguration();
        net.javacoding.jspider.core.util.config.PropertySet pluginsProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            PLUGINS,
          props);
        int pluginCount =
          pluginsProps.
            getInteger(
            ConfigConstants.
              PLUGINS_COUNT,
            0);
        log.
          info(
          "Loading " +
          pluginCount +
          " plugins.");
        for (int i =
               0;
             i <
               pluginCount;
             i++) {
            java.lang.String pluginInstance =
              pluginsProps.
                getString(
                "" +
                (i +
                   1) +
                "." +
                ConfigConstants.
                  PLUGINS_CONFIG,
                null);
            if (pluginInstance !=
                  null) {
                log.
                  info(
                  "Loading plugin configuration \'" +
                  pluginInstance +
                  "\'...");
                net.javacoding.jspider.core.util.config.PropertySet config =
                  ConfigurationFactory.
                    getConfiguration().
                    getPluginConfiguration(
                    pluginInstance);
                net.javacoding.jspider.core.util.config.PropertySet pluginConfig =
                  new net.javacoding.jspider.core.util.config.MappedPropertySet(
                  ConfigConstants.
                    PLUGIN,
                  config);
                java.lang.Class pluginClass =
                  pluginConfig.
                    getClass(
                    ConfigConstants.
                      PLUGIN_CLASS,
                    null);
                if (pluginClass ==
                      null) {
                    log.
                      info(
                      "Plugin class \'" +
                      pluginConfig.
                        getString(
                        ConfigConstants.
                          PLUGIN_CLASS,
                        "") +
                      "\' not found");
                } else {
                    net.javacoding.jspider.core.util.config.PropertySet pluginParams =
                      new net.javacoding.jspider.core.util.config.MappedPropertySet(
                      ConfigConstants.
                        PLUGIN_CONFIG,
                      pluginConfig);
                    net.javacoding.jspider.spi.Plugin plugin =
                      pluginInstantiator.
                        instantiate(
                        pluginClass,
                        pluginInstance,
                        pluginParams);
                    net.javacoding.jspider.core.util.config.PropertySet filterConfig =
                      new net.javacoding.jspider.core.util.config.MappedPropertySet(
                      ConfigConstants.
                        PLUGIN_FILTER,
                      pluginConfig);
                    if (filterConfig.
                          getBoolean(
                          ConfigConstants.
                            PLUGIN_FILTER_ENABLED,
                          false)) {
                        log.
                          info(
                          "Plugin uses local event filtering");
                        loadedPlugins.
                          add(
                          new net.javacoding.jspider.core.dispatch.impl.PluginSocket(
                            plugin,
                            filterConfig));
                    } else {
                        log.
                          info(
                          "Plugin not configured for local event filtering");
                        loadedPlugins.
                          add(
                          plugin);
                    }
                    log.
                      info(
                      "Plugin Name    : " +
                      plugin.
                        getName());
                    log.
                      info(
                      "Plugin Version : " +
                      plugin.
                        getVersion());
                    log.
                      info(
                      "Plugin Vendor  : " +
                      plugin.
                        getVendor());
                }
            } else {
                log.
                  info(
                  "Plugin configuration \'" +
                  pluginInstance +
                  "\' couldn\'t be loaded");
            }
        }
        log.
          info(
          "Loaded " +
          loadedPlugins.
            size() +
          " plugins.");
        return (Plugin[])
                 loadedPlugins.
                   toArray(
                   new net.javacoding.jspider.spi.Plugin[loadedPlugins.
                                                           size()]);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJ1XXWwcVxW+++Ndr+3Uf2liYqd2U0NjFO8mOHHr+IEutkM2" +
       "2cTbrNsS47K9nr3r\nTDI7M525Y69NG7UibUofKqGWPxFagYQiIQSoFeWhiB" +
       "CV8h8J/NAWUBGofQBBKvqAEkFROefeGe/M\n7CahtTTju3PPuefcc77znXu/" +
       "c5m02BYZUOw0XzWZnZ4qFqhls/KURm17Dj6VlFdaUoXzh3UjSiJ5\nElXLnH" +
       "TmFTtTppxm1HImNz1Zs8iQaWirS5rB3XUaVtl/27srvzl7qD9GOudJp6oXOe" +
       "WqMmXonNX4\nPOmosuois+xsuczK86RbZ6xcZJZKNXUNBA19nvTY6pJOuWMx" +
       "+xizDW0ZBXtsx2SWsOl9zJMOxdBt\nbjkKNyybk678SbpMMw5XtUxetflkni" +
       "QqKtPK9oPkNInlSUtFo0sguCXv7SIjVswcwO8g3qaCm1aF\nKsxTiZ9SdYjE" +
       "YFhjY8fDh0EAVJNVxk8YG6biOoUPpEe6pFF9KVPklqovgWiL4YAVTrZdc1EQ" +
       "ajWp\ncoousRInfWG5gpwCqZQIC6pwcnNYTKwEOdsWypkvW7OJjv8+WbgyJH" +
       "IeLzNFQ/+ToHRLSOkYqzCL\n6QqTiled9DO5485AlBAQvjkkLGWyH/7hPfm/" +
       "XhiUMv1NZGYXTzKFl5R3xwe2r2ffSsXQjVbTsFWE\nQmDnIqsFd2ayZgKat2" +
       "ysiJNpb/Inx352/JFvs79HSWuOJBRDc6p6jqSYXp5yx0kY51Wdya+zlYrN\n" +
       "eI7ENfEpYYjfEI6KqjEMRwLGJuUnxLhmEkKS8ETg+SSRf934gnopaM6Sqh+g" +
       "CMjVtMnJbp3xBYSA\nYpQh+QsnbVMtM2tBMSy2oFZNbSGkUkMjnSuRCFZruN" +
       "Y0AOZBQ4MFSsr5N3/10Mzhzz8hM4doc93j\nJA1G03WjaddoGo2m0Wg6YJRE" +
       "IsLc1mA4MT9lLKN/PD/Z9dSo/WKUxOZJSq1WHU4XNQblRzXNWGHl\nEhf46/" +
       "ZhXUAM8NmxCFAFH0oaLCRKA+K3bJEdYUjWCzkHIwo4Wz/93m/fLq28gOjBbG" +
       "/G1aVrkLtT\n0reOkeL9hx54YkcMhVbimBYQHb7x6iXl7SePvPDqr9/YWYc+" +
       "J8MNFdmoiRUVdr9gGQorA2PVl//y\nvw/+8+mWiR9ESRzKFIiKU4AXVP0tYR" +
       "uBypr0WAqDBZrtFcOqUg2nPGpp4ycsY6X+RUBmkxh3QQDa\n4WmBp8/F5hZ8" +
       "4WQPvnolwDCeoT0IDrz6ucTu137U/ooIikeXnT5eLTIui6+7no45izH4/sZX" +
       "Ck9/\n8fLZT4tcuMngJGE6i5qq1IR/WyOQ+94mRJDu2/zMl0bOveYlu7e+et" +
       "ay6Crmuvbo+vav/px+HUgC\nitVW15ioRSIsEc8AvneJ8ahvEn/vcEUQf+HS" +
       "OoBtwktedfGz/3r52bYh6QzqDGxAq595KjNTRwJa\nJeXBtXNj68X7VMl3YQ" +
       "INCa/9+J5nr17ifxKRruMDrd1aa3TwXuqD7p2vLncnvv9cNUqS86RLNEGq\n" +
       "83up5mAe5qGN2VPuxzzZFJgPtiTJv5Mb+B8IY9NnNozMOufAGKVxnAqBEcP2" +
       "UXh6XTD2hsAYISYO\n9guFYfG+3XRzBq6agqekB1yl2OYt0udPgdyB7DcPnX" +
       "vz8ZE///6S25N8Z5261N9KZ5wXH7uwHsVK\nSsGpg9pH6/uAUw+OIuIkANko" +
       "BffVJuk5y0mr0Bzbuwf86QFDeEhKq2U3ydN3TVx86/L31CvCSps4\ng2RRwT" +
       "WTEl98dmOGaWO38x233JWGZ00bGWeTz0huulQbvPStkfeGxPqu0wlf53R/J5" +
       "epddTfGeSG\nJ/bu2c3JxPttTfv33rFrbHx0315Ots4dzBXTjdlBQ59omrfT" +
       "0K4b44S7c5FBekTWbhKFj+BMz+hO\n1T8J/sePzWSnRRQ3czL2f7a5sIOdIo" +
       "kfccmgzhcDHpFYZPu1TkzitHf2U+90PE5/er/EWU+wbaLX\n+557nY3c1aE0" +
       "6c0pbpijGltmWp2MwtaOiJOkV3ed9w3+5cD4+YebsdGAvxSCaiXl4ncv/HHf" +
       "6384\nA17Mk+TR2eJUNj8DDg9e11xJ6V7uvzt2Qv2FAJdLDA3n36DSZJAO2i" +
       "wGx3d9LlA8Q4EOdRs829zk\nbmvWoXw5ugan35DwP8OhbCxGOZNAsLHr+VhB" +
       "dBZ08szK4cs7B658LUqi1yGFJifpjRVKyvOx4Xei\nL20ZFv0+vkhtufXwFa" +
       "TxhhG4OAi/2wOR6r5OpITgxyUrqXVWGjO9Grn1GjUC/9zqME3TU5y4484Q\n" +
       "neUNhWq56W9cbF//gjN+KOoGdgZf1Q9CIR8b37Vnz+jYPriDBTJzuz0kMYO0" +
       "vymghceBvoZbp7wb\nKTvWH9j5stn9Sxl17/7SClRYcTTN36F844RpsYoqdt" +
       "Iq+5WMIOdk6EacAhyE/0R8bam2wkn/ddRA\nA//5NdZg+801OEm6I7/8w5zc" +
       "FJTnpK3+wy/6CCcxEMXhoxso6KqTquyENbcSvDwXTaaomOnaN1+K\n3/3U7/" +
       "4jaj+pyFs73lShMy2r0FwyWZ1qq7Y4YOAcnvEVx4LzKxck6Ya43ZYryptpv7" +
       "+xbdganjte\nmJmUgKq3pt0TH7w1jY1DsLE1vf9LEPSnDzULiHDS34XQ3bxr" +
       "5n+F5pphVhEAAA==");
}
