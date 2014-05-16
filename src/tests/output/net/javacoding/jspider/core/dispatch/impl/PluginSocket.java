package net.javacoding.jspider.core.dispatch.impl;

import net.javacoding.jspider.api.event.EventSink;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.JSpiderEvent;

import et.util.MyUtility;
import net.javacoding.jspider.core.dispatch.EventDispatcher;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.PropertySet;

import et.util.MyUtility;
import net.javacoding.jspider.spi.Plugin;

import et.util.MyUtility;

public class PluginSocket
  implements net.javacoding.jspider.spi.Plugin
{

    protected net.javacoding.jspider.spi.Plugin
      plugin;
    protected net.javacoding.jspider.core.dispatch.EventDispatcher
      dispatcher;
    
    public PluginSocket(net.javacoding.jspider.spi.Plugin plugin,
                        net.javacoding.jspider.core.util.config.PropertySet props) {
        super();
        this.
          plugin =
          plugin;
        EventSink[] sinks =
          new net.javacoding.jspider.api.event.EventSink[1];
        sinks[0] =
          plugin;
        dispatcher =
          new net.javacoding.jspider.core.dispatch.impl.EventDispatcherImpl(
            "EventDispatcher for Plugin \'" +
            plugin.
              getName() +
            "\'",
            sinks,
            props);
    }
    
    public void
      initialize(
      ) {
        dispatcher.
          initialize();
    }
    
    public void
      shutdown(
      ) {
        dispatcher.
          shutdown();
    }
    
    public java.lang.String
      getName(
      ) {
        return plugin.
                 getName();
    }
    
    public java.lang.String
      getVersion(
      ) {
        return plugin.
                 getVersion();
    }
    
    public java.lang.String
      getDescription(
      ) {
        return plugin.
                 getDescription();
    }
    
    public java.lang.String
      getVendor(
      ) {
        return plugin.
                 getVendor();
    }
    
    public synchronized void
      notify(
      net.javacoding.jspider.api.event.JSpiderEvent event) {
        dispatcher.
          dispatch(
          event);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYa2wU1xW+XtvrZ/ADAy42YByXxIm9fi82/lEs2xTDAo7X" +
       "IcU12oxn7toDszOT\nmbvrtZuiVk1Cyo9IKGmTSCQoVVukNmqroCQ/WoUikj" +
       "6SIrWWSpK2SR+kKFVLlKqqgtpU9Jw7szuP\nXQzCsqWZvb5zzj3nnsd3z7kv" +
       "XiXFpkEaRTPEFnRqhoaj44JhUmlYEUxzEqZi4hvFZeNn9qpagBRE\nSECWGK" +
       "mKiGaHJDChQ5Y6xkYG0wZp0jVlYVbRmL1Ozio77vx0/lfH9zQUkqopUiWrUS" +
       "YwWRzWVEbT\nbIpUJmhihhrmkCRRaYrUqJRKUWrIgiIvAqGmTpFaU55VBZY0" +
       "qDlBTU1JIWGtmdSpwWVmJiOkUtRU\nkxlJkWmGyUh15IiQEjqSTFY6IrLJBi" +
       "MkGJepIpkPkWOkMEKK44owC4TrI5lddPAVO3bhPJCXy6Cm\nERdEmmEpOiqr" +
       "YIktfo7sjlv2AgGwliQom9OyoopUASZIraWSIqizHVFmyOoskBZrSZDCyMYb" +
       "LgpE\npbogHhVmaYyRej/duPUJqMq4WZCFkXV+Mr4S+Gyjz2cubx0IVv7vxP" +
       "gnTdznRRIVFdS/BJg2+5gm\naJwaVBWpxXgtGXpq7FCyMUAIEK/zEVs0Q599" +
       "9f7Ih+e2WDQNeWgOzByhIouJn4YbNy0NfVBWiGqU\n6popYyh4ds69Om5/GU" +
       "zrEM3rsyvix1Dm408nfnboK9+jfw+Q0jESFDUlmVDHSBlVpWF7XALjiKxS\n" +
       "a/ZAPG5SNkaKFD4V1Pj/YI64rFA0RxDGusDm+DitE0JK4CmAZwex/mrxxcia" +
       "cSU5CyGviUcpC+mM\n9KuUTWMEiJoEvp8+YuqyRI1pUTPotCSbsKo4Ny0ndG" +
       "Xay5pGWVXzBQWYtP6UUyA+d2sKLBQTz1x+\n8+HRvV9/3HIgBp2tJSNhEB5y" +
       "hIds4SEUHsoID6HwkFs4KSjgYjd4rYvukjCr/vHSYPUT7eYrAVI4\nRcrkRC" +
       "LJhBmFQjYKiqLNUynGeDjWuEKfRxyEa+UMRC7oElNgIZ4pYM6UQZr9Eerk9R" +
       "iMBAi7pWPX\nf/1RbP4sBhM6vw5Xt1QDVx61dKtsjR7e8+DjzYVINF+EXgLS" +
       "lpuvHhM/OrHv7KW33rvbyQRGWnIS\nNJcTE8yv/rihiVQCAHOWf/o/uz9+sn" +
       "jg5QApgqwF3GICRBuAwGa/DE+iDWZAC40FnBVxzUgICn7K\nIE05mzO0eWeG" +
       "h84dfFwNBqiApxieRjtUN+ALP9bia60VaGhP3x44JF77WrDz7Z9UvMGNkkHP" +
       "KhfM\nRimzcrHGccekQSnMv/fM+JPfuHr8i9wXtjMYCerJGUUW01y/DQXg+7" +
       "V5cCFUX/fUN1tPvZ1x9lpn\n9SHDEBbQ1+mvLm169ufCc4AZkLumvEh5aga4" +
       "pAAw1dPMkqPD+yyksXDp4VOXH2v907sXbexynYkO\n1d9ijyRfefTcUgBNXA" +
       "ank2DuzyQXPx1xVMBPDHAjD3mcKeP2LLfyt4uRUs450DMA+tSCIDxMQ7IU\n" +
       "imiioIyNvHC+YulkMrzH0uQOF8HYSCy95eJ3Wq83cQ1sgUEXOtr/l6QEY7+T" +
       "9vjTzcjQ7QLPju6e\ntu5we88Auop/4Z6qY2TrDeAEfmz84JQd1t53ZPfe28" +
       "nne/A1uELNerva+/oZKdYNTTczivUsh3M8\nZiDd4vIspiWvISA4M/GH7zY+" +
       "bse84LFD+AaabRKEJz8C78KiIpPbiZkv/fvC8+VNVqwiT2M2BBvc\nIejhio" +
       "kPLZ7qWYo+IFu+9x+3PuLF1+5//tpF9j5PRAc+UNrWdK6CBwUXsvVfStUEf3" +
       "Q6ESAlU6Sa\nl0yCyg4KShLTdApC2By2JyMQg+7v3gLGyo7BLDw2+qHLJdYP" +
       "XM7RBGNvtjhYtcbGqTobq+p8WFVA\neHxHOEMLf9+VRZYyCAoG+lEp7Y1dOy" +
       "InnGzc7stGy9gjOwfOf3D1h/InPOPKeeU4hAy22mV8xoUC\nhRCEWKO4imR7" +
       "pZYDujnIpfYyGz16u7rCK4n+vq62rr72bsCUisndY9GQtUEUEc1u9xjURLnb" +
       "QmWI\nU6hAuKzhcIo+DY2qyYT7I9QNRROjQyO4cL91NuD78x4ftcKzzmZal9" +
       "9HMXztZ6Q8symo+V3OmHGc\n0c/nJ112ggzfeft26mvrb8clqriZHPEoRfQo" +
       "hDOHMyjSe0vV0miKqmzEs0IV39A2Gy0cQGm06w/X\nrhPOrsPcSv1piMRNNy" +
       "rPeWtx/Av/rHxMeP2wBRO13qIMvdd3+h3aurNSzFMBljFNb1doiioOlvml\n" +
       "7eNtSyZtqx7Y8udd4TNf9oNZCdahbjDzssXE8z849/u+d373CGgxRUr2H4gO" +
       "D0VGQeEty4qLiTWp\nhvsK5+Rf8JyzcSWn2fIyDXrRpNyg0Cuqkx5MafLUP4" +
       "gpm+143Zyv/nF58AZHwk3Pi0WGtQCczNjJ\nUj/2jxtyAr6l7O7p5al/dUpX" +
       "7h2xnFrv7srdhLu7r9OWtR9+bKG+twjJc2b4hJzc/O0rZy9P1FmB\nYfWxd+" +
       "a0km4eq5fl26nUMTS3LieBU79+79YXj028PxOwzYD4kdLw8iDI9e0k3FrzHn" +
       "9shKfZ9kfz\nKvnjBOSaOZdkkjbPUfLRfIo0wLPNVmTbKilykpGSWcrQcW4s" +
       "eMYpkHqdAunZlRwRPf1tXV3t3dsZ\nqbYF3mU2WdmRQblqB/mt64h8VsEUuc" +
       "e2yj2rZJXTkC6g5EE4FqCWdRvmu45h+hzDnFmJYXq70TA9\nnYysdWRmbYPL" +
       "P5fPDhiaIdsOoVWyw/cZWQM6jVBTNGSd+WzxkmOLsGOLsyuyRZjbAuqSDV65" +
       "N7fH\nJni6bXt0r5I9XoVTi/tIlTRPxfCaY4rtjinOraik6uT5Aq1ObVbk8l" +
       "aoh2c7PGHbCuF8VsitTgM4\nbmWk0lxQRejWVTghpPy2KMitGt50dt7v7Pyt" +
       "Fe28t60n3N4HQVBMsaLJwEP7DYogAXo8ThjaE+Uz\nvA66uTcvwDGgakyOL1" +
       "gQDJV5pVsV7O3rc26UrXtPsXnpwbsv6DW/5Fcm2bvJUmiB40lFcfcTrnFQ\n" +
       "N2hc5sJLre7CMuIlRlpv+T4MzjD84Vv6rcX/LiMtt8IPvsoM3ex/YKRhGXYQ" +
       "iD9ujj8ysj4/B5wn\n9shN/xcAEi89IKzzj5v0r4wUAikOr+h5Tgarz8Pzv8" +
       "7VTUR1Ksp4aZH+1o+L7nviN//lJVuJaN3s\n42029EEp2ZRZx5AqKAsmbyvx" +
       "G178iUnDgJDhta3tqgrTWtG6vW5wt1FZWS2Th8ZHczspOOI+t7IO\nARqEIm" +
       "wQbv+eFJqtz+QzD1fZxgfeUqHy07a4/wN9wZ92iBkAAA==");
}
