package net.javacoding.jspider.core.util;

import java.net.URL;

import et.util.MyUtility;
import java.net.MalformedURLException;

import et.util.MyUtility;

public class EMailAddressUtil {

    final public static java.lang.String PROTOCOL_PREFIX = "mailto:";
    
    public static boolean canBeEMailAddress(java.lang.String urlString) {
        boolean result = false;
        java.net.URL url = EMailAddressUtil.fixEMailAddress(urlString);
        if (url != null) {
            result =
              EMailAddressUtil.isEMailAddress(
                EMailAddressUtil.fixEMailAddress(urlString));
        }
        return result;
    }
    
    public static java.net.URL fixEMailAddress(java.lang.String urlString) {
        java.net.URL result = null;
        try {
            result = new java.net.URL(urlString);
        }
        catch (java.net.MalformedURLException e) {
            try {
                result = new java.net.URL(PROTOCOL_PREFIX + urlString);
            }
            catch (java.net.MalformedURLException ex) {  }
        }
        if (result == null || !EMailAddressUtil.isEMailAddress(result)) {
            result = null;
        }
        return result;
    }
    
    public static boolean isEMailAddress(java.net.URL url) {
        boolean result = true;
        java.lang.String urlString = url.toString();
        if (url.getHost() != null && !url.getHost().trim().equals("")) {
            result = false;
        }
        if (url.getPort() != -1) { result = false; }
        int pos = urlString.indexOf('@');
        if (pos == -1) {
            result = false;
        } else {
            if (urlString.indexOf('@', pos + 1) != -1) { return false; }
        }
        if (pos > urlString.length() - 6) { result = false; }
        return result;
    }
    
    public static java.lang.String getEMailAddress(java.net.URL url) {
        java.lang.String urlString = url.toString();
        if (urlString.toLowerCase().startsWith(PROTOCOL_PREFIX)) {
            urlString = urlString.substring(PROTOCOL_PREFIX.length());
        } else {
            urlString = null;
        }
        return urlString;
    }
    
    public EMailAddressUtil() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwUxxWfu7PPnDnHHxBixQYbcFss8BmbszG4VeOeTXxw" +
       "4MsZEnJxdJnbnbMX\n9nY3u3P24aYoUZNAIrVVlK9WIomqpkJqUT+CSCu1Ck" +
       "VJ+o1U+Y8kbZWoFVGUqiVKVVVBVSr6ZmbX\nu7dnQD2Jk3Z3dua9eW/e+72P" +
       "vTOXUb1lok7JitFjBrFiiek0Ni0iJ1RsWQdhKie9WR9Jn96n6UEU\nSKGgIl" +
       "PUnJKsfhlT3K/I/cnx0bKJug1dPTar6tTep2qX3Zs/Xfj9ib0dIdScRc2KNk" +
       "0xVaSErlFS\nplkULZJinpjWmCwTOYtaNULkaWIqWFUWgVDXsqjNUmY1TEsm" +
       "sTLE0tV5RthmlQxicpnOZApFJV2z\nqFmSqG5aFLWkjuB53F+iitqfUiw6mk" +
       "LhgkJU2XoQHUehFKovqHgWCNelnFP08x3797B5IG9UQE2z\ngCXisNQdVTSw" +
       "RJefY/nEPfuAAFgbioTO6cui6jQME6hNqKRibbZ/mpqKNguk9XoJpFB0+zU3" +
       "BaJV\nBpaO4lmSo6jdT5cWS0AV4WZhLBTd6ifjO4HPbvf5zOOtqXD0v0+mP+" +
       "nmPq+TiaQy/RuAaYOPKUMK\nxCSaRATjlVLsmeS9pc4gQkB8q49Y0Ix95ieH" +
       "Uh+e7xI0HSvQTOWPEInmpE+HO9cvjb0fCTE1Vhm6\npTAoVJycezVtr4yWDU" +
       "DzuuUd2WLMWfxF5pf3Pvw98vcgWpVEYUlXS0UtiSJEkxP2uAHGKUUjYnaq\n" +
       "ULAITaI6lU+Fdf4O5igoKmHmCMPYwHSOj8sGQqgBrgBcGSR+EXYDb0/sx4oK" +
       "0AboWoeYTgZFOzRC\nZxgKJF0G/88csQxFJuaMpJtkhik+U81VZqKaFwIBFr" +
       "P+iFMBnpO6CnvkpNOXfvvQxL4nTgr/MczZ\nSlI0AHJjrtyYLTfG5AqD+eWi" +
       "QIBLvK3SrsxRMounf7wy2vL1PuvVIAplUUQpFksU51UCcYhVVV8g\nco5yIL" +
       "Z6QM+xBkCN5gGzoEZOhY14jIAh5020yY9NN6KTMMIAuKXjV//wUW7hLIMRc/" +
       "tatrtQDZx4\nVOgW7Z2+f+8DJzeFGNFCHfMPkPbcePec9NGT+8++9bt3t7gx" +
       "QFFPVWhWc7LQ8qufNnWJyJC63O2f\n/8/kx0/X7zoXRHUQr5CxKAacQfhv8M" +
       "uoCLFRJ10xYwHn6oJuFrHKlpwc00jnTH3BneGoaWK3VgEg\nZiyfgjzTXflq" +
       "ePvbP1/9Jj+xkxSbPdlzmlARYq2urQ+ahMD8u99MP/3s5RP3cUPblqYobJTy" +
       "qiKV\nuSK3BcCxa1YI91j72mee6z31tuPJNe7uY6aJjzFHlh9ZWv+tX+EXIB" +
       "VASFrKIuERh7gk5Ahg9618\nvM2zyN432SQMXP7Q2cOKgeOZYv7L/379xcZu" +
       "oQzj6VzGTQdxWCYS+yu4ctKDi6d2LE3fo4is5k+T\nPuLF1w69eOUifY9b2n" +
       "U+k7axXK3g3diDy5G35lvDP3qpGEQNWdTCSx3W6N1YLTE/ZKFYWQl7MoWa\n" +
       "KtYrC4/IsqPL4O70A88j1g87N6fAmFGzcUQgjdO0gMna4RqFa7WdDvmTLbax" +
       "25pyABDSUIRkQ/Xd\nbGYX59zM758VGApRkKtomNefLQAoi/cNZcBlOjN1cC" +
       "oxlcqlMxN7kofBPe1e94jTiYrz0KlLj/f+\n5Y8X7ark6XZcqr/lHi29+tj5" +
       "pSALoQj0Hdg64J4R+h42CvBeADyVqzxzo0jNCWpzjgwMD4FCbSCJ\n9UkxRb" +
       "YRMH7HrgvvX/6h8gkX08jbkDHGYcuJ8BmP4JBuWKzgeToue6eeKcNiuabJIy" +
       "Q5nit3Xfxu\n79Vuvr+tddhTPO33hnlsHvCWhUau98DgYHyIos/XUJt27xza" +
       "Fo/3De2i6L7/u8TEfM78nNVNsTlL\naLd/hSk8Xu3941D2q43NTGRjD7Vx39" +
       "/CUwuDf2xCKxW9i2CEuszE2Dh3xVpoG11S0aLx3FmuxijP\nOluc/OKmoE4n" +
       "N5lo/bVaLd4mnjj8z+jj+I37BTzbKsssU3PopXdI7x1RaYVyHqG60aeSeaK6" +
       "+c0v\nbT9vQZ1Qbr6n6697hk9/xZ/g6lhT4Y2gSracdOEH5/889M6fHgUtsq" +
       "jhwNR0Yiw1AQp3XVdcTmqd\n77grNKf8mkPSzjVVjXMl02hlhmk0CfT92sGK" +
       "mOtezjPgPfQFuJpsbzb58owoelV+C3K/sdsXV64f\nATvxs/cxEeFznggf9k" +
       "V4Spewmhz/9oXVS0+VhvcG7cpzJ7spNQbVwA4WVMPbQWzJVF0c3nXjipeH\n" +
       "jkvC2peId1t/EUubShHywrzdvp/L/mu7/MHWcYHEdu9noZdwcvAq6Vnz4cei" +
       "fFXmyhWKn0/IUxte\n/uDspcxagWbxIbW56lvGyyM+pvipogaLp43Xk8Cp39" +
       "i68czxzHt5xwuHodTkdV0lUAtRWCQ7xO2W\nq8DRTrtuIed5c3D0sAdHouwd" +
       "YbdHaoTJYHzbjpG+oXgNMFmEZFpQyhUg8Sh60qPoiKvoE7UrOgCK\nQo1p9w" +
       "mFlC+i3Mm/UZ5/WSk5lEmt5KoBuHptV/XePFc961pg55BrgedqtEB8YFt8oC" +
       "8+QlEIXMV2\n+tqNnfQNim5RLO9ubLZ0LatM2laZvHlW+Y7HKh5cvFxr8zBY" +
       "g1VeAOhCj3At6H7fo+JOV8UztasI\n0I1Df9PuE7oMXR5yCJrTFj8/+6xpr/" +
       "qPTPyTI21aemDL60brb/in4PK/LaugayuUVNXbaXvGYcMk\nEEKcUvTd4tSv" +
       "UNR9o/4LOh324Db5sWA7R1HHddiAgz28HD+laN3KHJBq7ZGX/meA4Up66Drd" +
       "Fy/p\nawADIGXD88YK/Zjo2svG/wCjHt/gvxQAAA==");
}
