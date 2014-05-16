package net.javacoding.jspider.core.task.impl;

import net.javacoding.jspider.core.task.Scheduler;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.SchedulerProvider;

import et.util.MyUtility;

public class DefaultSchedulerProvider
  implements net.javacoding.jspider.core.task.SchedulerProvider
{

    
    public net.javacoding.jspider.core.task.Scheduler createScheduler() {
        return new net.javacoding.jspider.core.task.impl.SchedulerImpl();
    }
    
    public DefaultSchedulerProvider() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1359579677527L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVWW2wUVRg+22233bbQCwUaWmhTLlKFWe4BmhiaXsLCQhcW" +
       "oyzF5XTmbDvt2Zlx\n5ky7IBKNCMiDiQFvCWp8MCTG+CARX0yQIN5JTB8ENS" +
       "QafNAoRB+MxGDwP2dmurPTlpK4ycycPef7\nL+f/v/8/592bqMwyUbNsSeyg" +
       "QSypK5XEpkWULootaw9MZeTLZdHk2e2aXoJCCVSiKgzVJGQrpmCG\nY6oSi3" +
       "d35E3Uauj04CDVmatnkpbNi++MfX18W1MY1aRRjaqlGGaq3KVrjORZGlXnSG" +
       "6AmFanohAl\njeo0QpQUMVVM1UMA1LU0qrfUQQ0z2yTWbmLpdJQD6y3bIKaw" +
       "6U0mULWsaxYzbZnppsVQbWIYj+KY\nzVQaS6gW60igSFYlVLGeQEdQOIHKsh" +
       "QPAnBewttFTGiM9fJ5gFeq4KaZxTLxREpHVA0i0RKUmNjx\nku0AANHyHGFD" +
       "+oSpUg3DBKp3XKJYG4ylmKlqgwAt022wwtCCaZUCqMLA8ggeJBmGGoO4pLME" +
       "qKgI\nCxdhaG4QJjRBzhYEcubLVl+k+t+Tyb9bRc5LFSJT7n85CC0KCO0mWW" +
       "ISTSaO4G1bOh3fazeXIATg\nuQGwg+lc+uEjiV8utDiYpikwfQPDRGYZ+c6G" +
       "5oXjnT9Hw9yNCkO3VE6Fop2LrCbdlY68AWyeN6GR\nL0re4se7P9379Dvktx" +
       "JUEUcRWad2ToujKNGULndcDuOEqhFnti+btQiLo1IqpiK6+A/hyKqU8HBE\n" +
       "YGxgNiTGeQMhVA5PCJ5G5Pxm8xcktJtksU1ZSh4iik2JmTT1UVUhpmQwtEUj" +
       "rJ+zQdYV4EH/sGXw\npX5ZN0k/w9ZIv5ozaP/0KvLcfs1YKMQLOViGFDi7Va" +
       "cAzMhnb3x5uGf78yecpHIiup4z9DA4IRWc\nkFwnJO6ExJ2QuBPSdE6gUEiY" +
       "n18ceZ5KhVfc7+931L6w0jpfgsJpFFVzOZvhAUqgUjGl+hhRMkxQ\ntc5XFo" +
       "KNQOXqAWA1+JShoEhUEYR61ERtQfYWaj4OIwyUHD9y95tbmbFznGicGA1cu+" +
       "MapHnE8a26\nPbV/24ETbWEOGivlGQTokpm1Z+RbJ3ec+/ar68sLVcLQkknF" +
       "O1mSF1/QfQilDEE1SUH9K/9s/eNU\n2aYPSlApVDT0NIaBidAgFgVtFBVhh9" +
       "fQeLBAsiqrmzlM+ZLXhSrZkKmPFWYEhWbxV53DJh6sgIOi\nF95+NrLq6kdV" +
       "l8WOvbZZ4+uvKcKcIqwrxHqPSQjMX381eeqlm8f3iUC7kWYoYtgDVJXzwpH5" +
       "IUjs\nnCkagtTYcPrl9jNXvUzOKWjvNE18kCcy/8z4wtc+w69Ds4CitdRDRN" +
       "QkEpaQZ4C/HxLjFb5F/r/N\nhXByBeuolx8XXmZyA0/+demNylbHGS7T7Lex" +
       "WLyXuTvk4+We5oLx5gmmNRLPSE/XDqfxOW3y8Jkb\nx9p//O6K20p9R3QB9W" +
       "vmqH3+uQvjJTyrUTgssbXTq2txWPNRSBxgwBxRZXwmKjZc6bSOzcyV3Lh6\n" +
       "01pnPw0MrZmxI0zqAnnYzcLpzhRxHh5/7M/qY/iT/c6W6ou7RY9m59a/eY20" +
       "b6mWp2hRUaYbKykZ\nJbSQpqC1HeKs9fJU82jLT70bzj4VzJNolP6oF4tl5I" +
       "vvXfhh/bXvj4IXaVS+sy/V1ZnoAYdb7mku\nI9eNNu0KD6mfi2y4/WDSDaFY" +
       "qMO/TciTSeCCo+0pylOr8L0WPK+CZxk8De75Ir58sZ6/5ji1y1/r\n7sn2GU" +
       "shDkUtmwQzMpFkgdvoMCbpY8w6CGY9cJNfByVVkRK6jGm8+62LVeMv2hu2OZ" +
       "me5QPEuzP5\nlitvt99tFWFyORrxne/u//JRbO4sMIB/djEU/7/H5eY1q1as" +
       "Xr1y7Ua4RgT2+IDV6sTfK4IH778I\nUB70TWeVt6zGSTdk5x4nt40fWH7JqP" +
       "tCtPmJu1YFBCRrU+ojh58oEcMkWVVko8Lp3k5q9jG09L7O\ncoZK+UfsNO3I" +
       "Ps5Q60yyIMY/fjHMUNM9xECCf/wScHGeN7UEQ+XuyI8fZGh2MZ6hysIfP3SY" +
       "oTBA\n+XBkopfVitOC3yokp3Xmjf8AapY66vkMAAA=");
}
