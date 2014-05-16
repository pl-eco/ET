package net.javacoding.jspider.core.util;

import java.net.MalformedURLException;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.util.ArrayList;

import et.util.MyUtility;
import java.util.StringTokenizer;

import et.util.MyUtility;

public class URLUtil {

    
    public static java.net.URL normalize(java.net.URL original) {
        java.net.URL normalized = null;
        if (original != null) {
            java.lang.String urlString = original.toString();
            urlString = URLUtil.normalizeDotFolders(urlString);
            urlString = URLUtil.normalizeBackSlashes(urlString);
            urlString = URLUtil.normalizeDoubleSlashes(urlString);
            urlString = URLUtil.normalizeStripQuery(urlString);
            try {
                normalized = new java.net.URL(urlString);
            }
            catch (java.net.MalformedURLException e) {  }
        }
        return normalized;
    }
    
    protected static java.lang.String normalizeBackSlashes(
      java.lang.String original) {
        return StringUtil.replace(original, "\\", "/");
    }
    
    protected static java.lang.String normalizeDoubleSlashes(
      java.lang.String original) {
        return StringUtil.replace(original, "//", "/", 7);
    }
    
    protected static java.lang.String normalizeDotFolders(
      java.lang.String original) {
        return StringUtil.replace(original, "/./", "/");
    }
    
    protected static java.lang.String normalizeStripQuery(
      java.lang.String original) {
        int index = original.indexOf('?');
        if (index >= 0) {
            return original.substring(0, index);
        } else {
            return original;
        }
    }
    
    protected static java.lang.String normalizeStripTrailingSlash(
      java.lang.String original) {
        if (original.endsWith("/")) {
            return original.substring(0, original.length() - 1);
        } else {
            return original;
        }
    }
    
    public static java.net.URL getSiteURL(java.net.URL resourceURL) {
        java.net.URL siteURL = null;
        if (resourceURL != null) {
            try {
                siteURL = new java.net.URL(resourceURL.getProtocol(),
                                           resourceURL.getHost(),
                                           resourceURL.getPort(), "");
            }
            catch (java.net.MalformedURLException e) {  }
        }
        return siteURL;
    }
    
    public static java.net.URL getRobotsTXTURL(java.net.URL resourceURL) {
        java.net.URL retVal = null;
        if (resourceURL != null) {
            try {
                retVal = new java.net.URL(URLUtil.getSiteURL(resourceURL),
                                          "/robots.txt");
            }
            catch (java.net.MalformedURLException e) {  }
        }
        return retVal;
    }
    
    public static java.lang.String stripResource(java.lang.String path) {
        java.lang.String result = null;
        if (path != null) {
            int pos = path.lastIndexOf("/");
            result = path.substring(0, pos + 1);
        }
        return result;
    }
    
    public static int getDepth(java.net.URL url) {
        int depth = 0;
        if (url != null) {
            java.lang.String path = url.getPath();
            if (!URLUtil.isFileSpecified(url) && !path.endsWith("/")) {
                path = path + "/";
            }
            int pos = path.indexOf('/');
            while (pos != -1) {
                if (pos > 0) { depth++; }
                pos = path.indexOf('/', pos + 1);
            }
        }
        return depth;
    }
    
    public static boolean isFileSpecified(java.net.URL url) {
        boolean specified = false;
        java.lang.String path = url.getPath();
        int posLastSlash = path.lastIndexOf('/');
        int posLastDot = path.lastIndexOf('.');
        specified = posLastDot > posLastSlash;
        return specified;
    }
    
    public static String[] getFolderNames(java.net.URL url) {
        url = URLUtil.normalize(url);
        java.util.ArrayList al = new java.util.ArrayList();
        java.lang.String path = url.getPath();
        if (URLUtil.isFileSpecified(url)) {
            path = URLUtil.stripResource(path);
        }
        java.util.StringTokenizer st = new java.util.StringTokenizer(path, "/");
        while (st.hasMoreTokens()) { al.add(st.nextToken()); }
        return (String[]) al.toArray(new java.lang.String[al.size()]);
    }
    
    public static java.lang.String getFileName(java.net.URL url) {
        return url.getPath().substring(
                 URLUtil.stripResource(url.getPath()).length());
    }
    
    public URLUtil() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZfWwUxxWfO5uzjU2NzUesYMCAWwz4zr7vc/xHcG0MhjMY" +
       "n1HAGF3We2N7YW93\nuzvnD5qipqUQorRSFFIaNW1aqRVVhSoFlFRqKtGIkH" +
       "5SVf6jgVZUiWijVAlRorQKqtLSN7N7N3vn\n89mLZEuzt559M/N77/fem69L" +
       "d9EyQ0eNouEjMxo2fN2JAUE3cKpbFgxjCKqS4vVlVQMX9ymqG7ni\nyC2lCK" +
       "qNi0ZbSiBCm5Rq6+vpnNZRk6bKM+OySqx+5vTyyJbPpv5wdu+6MlQ7jGolJU" +
       "EEIondqkLw\nNBlGNWmcHsW60ZVK4dQwqlMwTiWwLgmydBIEVWUY1RvSuCKQ" +
       "jI6NQWyo8iQVrDcyGtbZmNnKOKoR\nVcUgekYkqm4QtDJ+XJgU2jJEktvikk" +
       "E648gzJmE5ZXwJnUJlcbRsTBbGQXBtPKtFG+uxrZfWg/hy\nCWDqY4KIs03K" +
       "T0gKWGJjYYucxs37QACaVqQxmVBzQ5UrAlSgehOSLCjjbQmiS8o4iC5TMzAK" +
       "QQ/P\n2ykIVWqCeEIYx0mCGgrlBsxPIFXFzEKbELSmUIz1BJw9XMCZja0Dnp" +
       "r/Pj3waRPjvDyFRZnir4BG\nGwoaDeIxrGNFxGbDexnf+b4jmUY3QiC8pkDY" +
       "lOn6/M8Pxd+7utGUWVdE5sDocSySpPhZpHH9bNff\nq8oojEpNNSTqCnmaM1" +
       "YHrC+d0xp489pcj/SjL/vxV4NvHvnqT/H7blTZhzyiKmfSSh+qwkqq23qv\n" +
       "gPe4pGCz9sDYmIFJHyqXWZVHZf+DOcYkGVNzeOBdE8gEe5/WEEIVUFxQbiPz" +
       "r5Y+CKo6NBg/RKFo\nBG1XMBmh5ItqCmgfOW5oUgrrI6Kq4xGKdyQnPE07rp" +
       "1yuWiEFsaXDM64R5WhaVK8eOd3T+zad+4p\nky3qYRYkglpgOB8fzmcN56PD" +
       "meaxhkMuFxvooXzjUTZSNGg+uNy58lte41U3KhtGVVI6nSHCqIwh\n2ARZVq" +
       "dwKkmYt9XZPJs5FHhjzSg4JoyelKEjFghgrUkdbS50QB62ffAmgFfNnrr/pw" +
       "+TU1eor1Bu\nV9PeTWjA1AkTW822xLG9jz+1uYwKTZVTEkC0eeHek+KHT/df" +
       "+fPvb7dwRyeoeU78zW1J46cQ/oCu\nijgF+Yl3f+E/ez56blnHK25UDkEJaY" +
       "kI4EwQ4xsKx8iLo85sTqLGgpbVY6qeFmT6KZtIlpMJXZ3i\nNcxZVtBHnek3" +
       "1FgFAFk6u/d1T/tbv6y+zjTOZr5aW4pMYGLGUR239ZCOMdTf/s7Ac8/fPXuU" +
       "Gdqy\nNEEeLTMqS+I0A/KQC4hdVSSmfQ2rz39724tvZZlcxXvv0nVhhhI5/e" +
       "Ts+hd+LXwP4h3izpBOYhZW\niI2EsgPQ5w723mr7SP/fbIlQ5yqMmF6a8bPM" +
       "pEe//O9r31/eZIKhbRrtY2xhzy9YGtL3lmzPfPBc\nCx2tny+Tslng7OGPa8" +
       "4Ibxwz8119foDtUjLp8Es38badNWKR+K0iquaV8SSWuWaFo/WzGSarWu1j\n" +
       "G9/pjVz8SqFqK2gWwdk2u7r785slxdd/dvWv4Zt/OQ0ohlHF/gOJ7q74LgC8" +
       "seRwSbFuct3Bsgnp\nN242v5khNGdezG/UaVcTfFnHMK0r1GC0popx2cSwrw" +
       "Tk9VC8UNZaWZX90o/19LHKcvc5vLkZb+Ce\nBltqFPceVy5dNNhtY05A5nT1" +
       "xIt3zmx7+9YNa0qzLZW41D+TpzOvfuPqLLNBFSxaBGM/1w8WTfTN\nxRYSEP" +
       "4sVXJNl5uZPk5QJWsZjQUBTz0MRNdYPinli6uiIPf1/PD16tlnM5G9JpIVNo" +
       "G+nuT0xhs/\n3na/iSGwBvTYJk3r/4pJQd/PHYz+9BMUXPyk9Egg0BoMeEMh" +
       "QKvq0rikCKZrriaohoU0nXFAfOFo\n7Qb3Vlhig0BnEntNSxzmlgiw+v30cY" +
       "SgnlI4iWCcGJlS9RMjCVa7hxANcAxBNcCOtrdGg16/P7Cd\noMBiJ0VfDh4F" +
       "kEAMzM6cY66B0gOl3XLM9kU6Juit6SoB38GMp92lfdNmmRS3TAe3DHbGYCjW" +
       "GvZ7\nI5EiDK5kDNLJ22cuSxdm8RhBq3Nm+iJM9AlIfhPYsMNWOOwYh606hh" +
       "0A2DGC1hcbb6vRZKYR2rVU\njKpeKB0WVR0OcojgjKOZnLIdfq7sSWfKhqOt" +
       "4SBTNscR02thPug+JmefHhWmZlyEkSc5yHYO8muO\nQQIj0XbI98VHXJiTbq" +
       "ug7O/ScPIMVzfI1f2mM3UjwEm7NxJ2zskZglbZLER62cI9j5DzHKEt5z3v\n" +
       "GCENkShBjUWGWxwb/RYb/UvHxktc1zDX9QfOdI0+MBsv2NmgaU47mMH6jB3h" +
       "RY4wxBH+xDHCOWzw\n4RZmYx+UoxYbR5eOjctc1yjX9YozXTv8reGYNxp0zs" +
       "Ylgtblm2dIFyTYc4+zJGJH+guONMKRvuYY\nKU1a4DfNJYYtzQ5dkfqhTFjs" +
       "TDhZkTpj5zrX2Tbjv0lQyIHO/vZQazDoDcF0Uq1jQ83oIoavtKfE\nwgxdJW" +
       "j5OCYJidBGdnA3ODjbvP5HgnaXAmfAPloYxyNpnFb1mZFBC1BP14G+tMbghs" +
       "OtgYg31LHd\npHZxazUOkelVjLMIlBmLs5ml4+xm1iyxdlv2uOWQs4C/NRjz" +
       "hoMPxNks7OnBIIPqqEqMocNDBcS9\nzRHa5sN3CIqWQigBPSNd41ghOaIirc" +
       "EOb9QPRMWcEGXHNS9bQSjnLLbOLR1b73Nb2CLsA4dsBaPU\nEmFYC+XOBBeR" +
       "/P5BYF9Ok082COzAPuHAbNH1L4LCTrZr/hgFFokCRZFFU5SHad4UuBXKBYug" +
       "C0tH\n0P9ydvDbFtT3HRIUhnDye4OQAssyurzIMLoHQ4O79mCNTMCefJ39jG" +
       "BAl9KwtZ60Tr5fGf6kPfXu\njh5zc95gv1GxC+4J3MfNq977iJ31FJwUFDle" +
       "Lxjk2Q0/evfKncHV5kmReQexZc41gL2NeQ/BlKnR\n6FnVplIjMOk3dmy6dG" +
       "rwb6NuywgdYDJJIQR5GNxwMVcIQHnZcoWXl8wVXGu4K/C85Vrr0BVgYRYK\n" +
       "wPTixBVctZBRJaNXgs2NhkVpTMLsUsfl0VhbVzVBFaOqKmNByVrKP5+lrlmW" +
       "urZ0ltrKLcXXSq4W\nh5bqCD+ApTYR9DkIGnPXQZ3boGfRtoBg573U3U5P7b" +
       "vb0vjpd93IXeLYrMhVVa6HpHi5rPlj92tr\nm9kRe/moYJgna4V3fHOv8PJu" +
       "5pjpq/OIaihBlN3SQW7pMDtQkzSNntyyulAsyCcVFyw6dy1mZcQm\n2iLroi" +
       "DLYeHYdnOiXvR0a6OimEvSw9Vblqa3ls4lH80ZKsC3fa6dzlwy4IeJNsrOHx" +
       "24JDhwNbUD\nRC+zgg3Vbo6KL9Zcewh6tBSqtJrCnKI+6luw5aEchfyt/rA3" +
       "SNeuIUccWdjM2XYason1kV6WNMy5\nXjcvgcXNs4+3XNPqfmt6f/aitjKOKs" +
       "cysmw7Y7eft3s0HY9JjNpK897INMV+gpoWggzrG/rDUl6/\n2ewg3cHN3wxa" +
       "0B97iyF6RlW0BahtvdnlH4OMki8PWxL+j110GPwCROnrUfP6I/9Y0zyzn9b+" +
       "D/ls\niRn6IAAA");
}
