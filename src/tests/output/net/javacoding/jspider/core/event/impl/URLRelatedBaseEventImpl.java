package net.javacoding.jspider.core.event.impl;

import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEventVisitor;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class URLRelatedBaseEventImpl
extends net.javacoding.jspider.core.event.impl.BaseCoreEventImpl
{

    protected java.net.URL
      url;
    
    public URLRelatedBaseEventImpl(net.javacoding.jspider.core.SpiderContext context,
                                   java.net.URL url) {
        super(context);
        this.
          url =
          url;
    }
    
    public java.net.URL
      getURL(
      ) {
        return url;
    }
    
    public void
      accept(
      java.net.URL url,
      net.javacoding.jspider.core.event.CoreEventVisitor visitor) {
        visitor.
          visit(
          url,
          this);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1Yb2wcxRUfn+2zzz7i2DGJg+3YDi5gYd/Zvpxj56Q2ru0o" +
       "l1zi484JjWt0rHfn\nnE32dpfdufMlDVFpgVA+ICH+tEgpUVFpJIRo1Qj4QN" +
       "U0Avo/UusPQFuBWgUhqjaIqqqIWqr0zcze\n7dzajqmwpd0bz7w378177/fe" +
       "m33xKqq1LdQh2yFywsR2aCKdlCwbKxOaZNszMJWR36wNJM/v1w0f\nqkogn6" +
       "oQ1JSQ7bAiESmsKuH4ZKxooW7T0E4saAZx9lm2y65bP1387Zl97dWoaRY1qX" +
       "qaSESVJwyd\n4CKZRcEczs1jyx5XFKzMomYdYyWNLVXS1JNAaOizqMVWF3SJ" +
       "5C1sp7BtaAVK2GLnTWwxmaXJBArK\nhm4TKy8Tw7IJ2pg4JhWkcJ6oWjih2i" +
       "SWQP6sijXFvg+dRtUJVJvVpAUg3JwonSLMdgzvofNA3qCC\nmlZWknGJpea4" +
       "qoMlurwc5RP37gcCYK3LYXLUKIuq0SWYQC1cJU3SF8JpYqn6ApDWGnmQQtAt" +
       "q24K\nRPWmJB+XFnCGoDYvXZIvAVWAmYWyEHSzl4ztBD67xeMzwVvT/uB/H0" +
       "1+0s18XqNgWaP61wHTNg9T\nCmexhXUZc8Zr+dCT8SP5Dh9CQHyzh5jTjH/h" +
       "1UOJDy92cZr2FWim549hmWTkT0c6OpfG3w9UUzXq\nTcNWaShUnJx5NemsxI" +
       "omRPPm8o50MVRa/Fnq50e+/gL+mw/Vx5FfNrR8To+jANaVCWdcB+OEqmM+\n" +
       "O53N2pjEUY3GpvwG+x/MkVU1TM3hh7EpkaNsXDQRQnXwVMHTg/jfRvoiaOuh" +
       "VCKFNYlg5cuSjacK\nWCfxnKmFTIJ265jM0WCQDQXCYO6YbaoKtuZkw8JzmF" +
       "LOqUA6t+oWRSq+abGqiuLYi0INQnavocGG\nGfn8lV+fmtr/rUe4T2kcOooT" +
       "9EVQIuQqEXKUCFElQkyJEFUitIoSqKqKid9SaXjqSYUC7u8/jm18\nbMB+xY" +
       "eqZ1FAzeXyRJrXMABV0jRjESsZwiK1WUAFC0aI5OA8BDXolNFgIwYisHTBQt" +
       "u9wetCPg4j\nCSJy6fT1332UWbxA44zGRSvdnasGXj7OdQv2pe/Zd+8j26sp" +
       "0WINdSCQ9q69e0b+6NEDF976zbt3\nuCAhqHcZdpdzUux51U9ahowVyG3u9t" +
       "/+996Pn6gde9mHagDQkNKIBIEI+WGbV0YFBmOlfEaNBZyN\nWcPKSRpdKiWh" +
       "BnLUMhbdGRZCN7ExjdhGeGrh2eJEcSt90cUW+trEA47a03MGli2vfdM/+PZP" +
       "Gt9k\nRikl1iYhA6cx4TBtdt0xY2EM8+9+J/nEU1fPfJX5wnEGQX4zP6+pcp" +
       "Hpt6UKfL9phZQRamt98um+\ns2+XnL3J3X3csqQT1NfFB5Y6n/mF9F1IJwBr" +
       "Wz2JGWp9TJIPmNpwacupiQM8CfGUderslYf7/vyH\ny05aE8qlS/XXzIP5Vx" +
       "66uOSjJg5A4ZLsgyWQscJJR1WsmIAbWcjTmQCzZwPH8RBxOCOjO0ZAoRaQ\n" +
       "RAttSFVCCUOWtPjk9y41Lj2eH9nHVblJIIhPZopdl5/vu97NVHAk+oXM6fxf" +
       "V5Csgy7+6c8wQfHP\nm4l2DQ/2R6ID0RGC6mRe2JnPWgnqu1GCSbPxhMAR5t" +
       "bYJVhjJ1uI0FdsnXSNjg6MRAmqzltaSc8g\nixqqLHCWIo6++9l4gCKBRQti" +
       "Cm53SGhC8ubePbTDKKE5N/+1f73+bEM3j07K01HONe1i0FVwZeT7\nTp6NLK" +
       "XvVrmzvbXXQ3zyp4eevXaZvMeg5yYMKq2nuFzBw5KQy0bfKjT7f3Qu50N1s2" +
       "gj658knRyW\ntDwF5iwErT3hTCYg6MT1ym6G4yFWTogd3mQliPWmKrcowbgS" +
       "H2522gDPZnhanOzU4slOVYgFdIIx\n9LL37eVcEjAtg4B+WCkKjnfCLSWEW9" +
       "QDPm7qyd1jl96/+kP1EwawBtZEjlMOR+kAmxFQX22YNm1X\nhH7Z2al32rRj" +
       "TOwOghqY2KHI8M7RdYntkf6h6MAQ7FU/szeeDsE5qaA0P/Jp6JCWn4zqg1yT" +
       "Qrxs\nYFigTg1N6fmcuAgtQ01qanyS7volVg7YSW5z0OACpsMBC1izc7Vuk3" +
       "XKZ77yj+DD0hv38EBvqWwk\nqPjouXdw3+6gvEL3EiCGOaCBZTQXjV5pB1gX" +
       "Xgq8pru7/rJn5Pz9XjjSGtAhwrGSLSNfeunin6Lv\n/PFB0GIW1R2cTk+MJ6" +
       "ZA4a4bisvIzYX2u6qPqr9kceMgY9ndoZIpVomHBgvD1UefqUBFd0XNpvV6\n" +
       "q+OlrSvVbMFHqyS1NTMe6O1fwARiT0SOLSBn1E3UZF2COdo/NDQwHIEuggu+" +
       "3e7mtmDRh5g4tcIQ\nY/B0Oobo/P8MUeoFhMOdEg435h7u/nU53Fj/cGQgMs" +
       "iRyQ4kin7AFR0ddEV/Y51ER4Z5sS6o0B7A\nVdkpgsNr3wYmYMg2O8xZ1w4c" +
       "yLd+SZaxSbwlL2mpOehOCs4N8uXZfw4qH9w5yTNBm/hlQiTcO3wd\n92768G" +
       "Ne7Cq7rRVKpUfI49u+/8GFK6lWnk34Xf7WZddpkYff59lRgibNZz03ksCo37" +
       "iz58XTqffm\nfY4J5iFrFgz6AcXP9B2kRtmyiodoD9u27KMKv/rL25fuveN1" +
       "s/lX7GpQvp7XQ6eXzWuaWEWFsd+0\ncFZlmtTzmsqD7GmCbvts9z/Qn/4w/z" +
       "7FmZ8hqGdNZoJq2a/IeJag9hswgij6I3KcI2jzyhwQws5I\npH+OoA2V9FBo" +
       "3X9E0ucBf0BKhz8wRQCeF7C/wywBZPQzXpepQ8tIoU6lcdMq1N60iWWVNvXF" +
       "516r\nueux3/+H1YdS80y/BEHjwNAZHtcl7YTNujC6Rm/Gct6CWx9hhdTxca" +
       "PNd+RfftrFvqMsq3fmSHJq\nhdZjbD2ySmSwf3jnQATuMTW09fj83xagW9m6" +
       "ksXYKcSehJ5nzhH7P//20F7XFAAA");
}
