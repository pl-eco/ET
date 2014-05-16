package net.javacoding.jspider.core.util.http;

import net.javacoding.jspider.api.model.Cookie;

import et.util.MyUtility;
import java.net.URLConnection;

import et.util.MyUtility;
import java.util.ArrayList;

import et.util.MyUtility;
import java.util.StringTokenizer;

import et.util.MyUtility;

public class CookieUtil {

    final public static java.lang.String HEADER_SET_COOKIE = "Set-Cookie";
    
    public Cookie[] getCookies(java.net.URLConnection connection) {
        String[] cookieStrings = this.getCookieStrings(connection);
        return this.getCookies(cookieStrings);
    }
    
    protected String[] getCookieStrings(java.net.URLConnection connection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String headerKey = null;
        java.lang.String headerValue = null;
        int i = 0;
        do  {
            headerKey = connection.getHeaderFieldKey(i);
            headerValue = connection.getHeaderField(i);
            if (HEADER_SET_COOKIE.equalsIgnoreCase(headerKey)) {
                if (headerValue != null) {
                    arrayList.add(headerValue.trim());
                } else {
                    arrayList.add(headerValue);
                }
            }
            i++;
        }while(headerKey != null || headerValue != null); 
        return (String[])
                 arrayList.toArray(new java.lang.String[arrayList.size()]);
    }
    
    protected Cookie[] getCookies(String[] cookieString) {
        Cookie[] cookies =
          new net.javacoding.jspider.api.model.Cookie[cookieString.length];
        int used = 0;
        for (int i = 0; i < cookieString.length; i++) {
            java.lang.String s = cookieString[i];
            net.javacoding.jspider.api.model.Cookie cookie = this.getCookie(s);
            if (cookie != null) { cookies[used++] = cookie; }
        }
        Cookie[] retVal = new net.javacoding.jspider.api.model.Cookie[used];
        System.arraycopy(cookies, 0, retVal, 0, used);
        return retVal;
    }
    
    public net.javacoding.jspider.api.model.Cookie getCookie(
      java.lang.String cookieString) {
        net.javacoding.jspider.api.model.Cookie cookie = null;
        if (cookieString != null && !cookieString.trim().equals("")) {
            java.util.StringTokenizer st =
              new java.util.StringTokenizer(cookieString, ";");
            java.lang.String name = "";
            java.lang.String value = "";
            java.lang.String domain = "";
            java.lang.String path = "";
            java.lang.String expires = "";
            while (st.hasMoreTokens()) {
                java.lang.String token = st.nextToken();
                java.util.StringTokenizer st2 =
                  new java.util.StringTokenizer(token, "=");
                if (st2.hasMoreTokens()) {
                    java.lang.String propName = st2.nextToken().trim();
                    if (st2.hasMoreTokens()) {
                        java.lang.String propValue = st2.nextToken().trim();
                        if ("value".equalsIgnoreCase(propName)) {
                            value = propValue;
                        } else
                                  if ("domain".equalsIgnoreCase(propName)) {
                                      domain = propValue;
                                  } else
                                            if ("path".equalsIgnoreCase(
                                                  propName)) {
                                                path = propValue;
                                            } else
                                                      if ("expires".
                                                            equalsIgnoreCase(
                                                            propName)) {
                                                          expires = propValue;
                                                      } else {
                                                          name = propName;
                                                          value = propValue;
                                                      }
                    }
                }
            }
            cookie = new net.javacoding.jspider.api.model.Cookie(name, value,
                                                                 domain, path,
                                                                 expires);
        }
        return cookie;
    }
    
    public CookieUtil() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVYfWwUxxWfOx/+BmMbiBMbMOA0pvjOPp/PNrHUYp0NHBzY" +
       "+EwSHNPLem/OXtjb\nXXbn7IMmtFVJSPMHahTaJg1N1KgVUhW1VRDpH7SlKB" +
       "9N2yAl/iMhrUI/SCOqFJqoqkBtKvpmZvd2\nb+9sE9fSrvdm3pv35n383pt5" +
       "8RpaYuioSTQC5LCGjUAkPizoBk5GZMEwRmEoIb62pGL49E5F9SJP\nDHmlJE" +
       "E1MdFoTwpEaJeS7dGBvqyOmjVVPjwpq8Rcp2CVezd8OvPm8R2NJahmDNVISp" +
       "wIRBIjqkJw\nloyh6jROT2Dd6E8mcXIM1SoYJ+NYlwRZOgKEqjKG6gxpUhFI" +
       "RsfGCDZUeZoS1hkZDetMpjUYQ9Wi\nqhhEz4hE1Q2ClscOCNNCe4ZIcntMMk" +
       "hfDJWmJCwnjUPoKCqJoSUpWZgEwlUxaxftbMX2rXQcyCsl\nUFNPCSK2WHwH" +
       "JQUssdbNkdtxy04gANayNCZTak6UTxFgANVxlWRBmWyPE11SJoF0iZoBKQTd" +
       "Neei\nQFSuCeJBYRInCGpw0w3zKaCqYGahLAStdJOxlcBnd7l85vDWUGn1f5" +
       "8YvtHMfO5LYlGm+pcB0xoX\n0whOYR0rIuaMNzOBk9F9mSYvQkC80kXMafrv" +
       "/tne2NXzazlNYxGaoYkDWCQJ8dPuptWz/R9UlFA1\nyjXVkGgo5O2ceXXYnO" +
       "nLahDNq3Ir0smANfmrkdf3ffVH+CMvKo+iUlGVM2kliiqwkoyY32XwHZMU\n" +
       "zEeHUikDkyjyyWyoVGW/wRwpScbUHKXwrQlkin1nNYRQGTweeBTE/2rpi6Dq" +
       "iKoelPBeqo1GUKeC\nyTj1v6gmwfPjBwxNSmJ9XFR1PE5VHp8iRBt3MmWpjJ" +
       "oZj4cmqzvVZIjL7aoMSyTE01d++/Dgzm88\nzh1Hg83UjqAOEBuwxQZMsQEq" +
       "lluKig3YYpHHwwTekW9P6qAkzaO/v9S3/ITfeNmLSsZQhZROZ4gw\nIWPIP0" +
       "GW1RmcTBAWgLWOYGcxBgFaPQGxClokZFiI5QYYcFpH690xaWdyFL4ECLTZo7" +
       "feup6YOUPD\nh7p7BV2dqwbOO8h1q94Y37/jocfXl1CiGR/1C5C2LLx6Qrz+" +
       "xK4z7/zu/VY79glqKUjJQk6aUm71\nh3VVxEmALHv57/x7+8dPLdl81ot8kK" +
       "eAVESA+IK0X+OWkZdafRZMUWMBZ1VK1dOCTKcsbKkkU7o6\nY4+woFlKX7U8" +
       "fqixXAoyhLv59dKOd39e9RrbsQWGNQ7UjGPCU6vWtvWojjGMv//08FPfunb8" +
       "QWZo\n09IElWqZCVkSs0yROzzg2PoiaR5oWHHy2xtPvWt5st5evV/XhcPUkd" +
       "mvza5+5tfC9wACIBUN6Qhm\nmYaYJGQJoO9N7LvNMUl/rzdJaHC5M2crLQKW" +
       "Z9ITX/7XK89VNnNlKE9TLm4ascUyGNmVx5UQDx05\nFZqN3y9xNHPDo4v4yC" +
       "/3PnfzIrnMLG07n0pbly1U8D7BEZe970zXlv70+bQXlY2h5azECQq5T5Az\n" +
       "1A9jUKSMiDkYQ0vz5vMLDkfXvlxwN7kDzyHWHXY2pMA3pabfFTzSGM1yMFkD" +
       "PFvgqTdhkP2nk3X0\nVZ/1QIRUgs5+jjV0cDNj3sDen+NhVEJAtKQIrPS0Qk" +
       "wZrGXIAqBsH+wfGBxJxAdHE5GhoZ3RQfBR\ng9NHfIu83Dx86spjG//03kWz" +
       "JDlaHZvqb4ljmZcfPT/rpXlUAU2HYOy2NwpND/3ysEYA3JXI33gl\nh+cIQe" +
       "WMs7ezF/SpA0G0RwpISTMKBrZsvvDBtZ9IN5iUStaC9FMGU0wFG3HILVE1gx" +
       "Y7R7dlrtQy\npBkUb5Y6hEQHEtm1F3+48VYzW99UutRROM3fZdOCvttZGfiG" +
       "ezqCPQT1ffbidG9XsC3Y7Q+FCPrS\nZ60xgQJX3mM0E0GfxKS5cI5qPFDM/0" +
       "eh6hfam1rJDEFUx7y/jCEMzYLAoJJJOyfBDr4RWJd5YwV0\njTYp79AYhGYL" +
       "45SBT6sFMzYSNVkQpaPVc3VarEs8/sAn1Y8Jr+7nAVqXX22pmuHnL+GNW6rF" +
       "IkW9\ngqiaX8bTWLZhzi1tF+tArYyuuX/tn7d2n37EjXM+2lo4cyifLSFe+P" +
       "H5P4Qv/f4YaDGGynYPxSP9\nsUFQeO284hJi7XTjnpIp6Q0WlSbkFPTN+Ux9" +
       "+UBTqWNo+5XRvKxrzsFNFTy98Kw0vbnSBTfMcfQV\nL1otPCbM09/9PJVTuV" +
       "QOdbhSOaaKghwd+P6FqtknM907vGaZ2UZfk4tLn85gWyjoD4cBFAG1FYAk\n" +
       "yFUrDFexMKRptXckFslNL1z4JmA5yCIuyaCl34F8rLxSex6b2XmttenGs17k" +
       "nQf4ihwWciskxJdK\nWj7xnlvVwjoa34RgcC+5T1mFh6i8sxFTuirPqbXzON" +
       "XproyNvJs1y3D3zAFFgiYF0moSyyYKaVoO\nAbt6uzoYO2vpDxP0xfm8KaU1" +
       "eTzOBsxjbBRGwJ/BUKitM+wP934eznJkSjIA/nLutl2CmKhEbsfL\n4OmHp9" +
       "HccWOxMC4CP6C9pqsE4gIni4dFkQg/Zkd4yN7yo4sM4J62rg5/d1deANP15I" +
       "XD9BFA2pxN\nONAajPBQnmFWzGMY575O2Pvq1OjAnnz/Bu3NfnPRmw12+bsh" +
       "W+906w2liyNVMddShOoxd9AzF0J9\nZUH/2WZZD0/rPIs6zfLdnFlMCwzaVT" +
       "8UXpwhujvaOkP+UC+hzahthcCD2f1UwrMElZifQ8wRRbfT\nRV/PZD2IOeuF" +
       "wvD20u8v8BILPaCMlUky5W7Jh3UpDR3OtHkJcXbsnx3JDzcN8ILa4LzcchJu" +
       "77yF\nW+qvfsyb8XzsK9LKu4Q8ueYHH565MrKCF2V+HbSh4EbGycOvhJg/qj" +
       "XaFqybTwKjfnXTuhePjlye\nsMrMA2BUgFEwBFM3TMeezuYs6+UmsyCw3m5h" +
       "IrKqYHo6t+b4qVlSA7lbNpjMFvVRgvuIyZq7jN72\niews9PUiVadIp8U7cp" +
       "R1ZGynnbG/WFyghsNtoS5WX6udgbqwpifzS2hxVLqd9HvdTr8OFugz+ajk\n" +
       "gOA3Fr1HQKVwNzjd1nhOPKLFtQOebabu2/7vjukte4eb7c28vbjN9ATbOnv9" +
       "XT0uhzEUWdhrb4Jh\nbRs4dLxk69hr6/jeonUMBv1dgH51OWE5ezMX0yiutH" +
       "noBUdDwS05v8sV188+1PqKVvsb3kJZ963l\ncHZLZWTZeeZ2fJdqOk5JbGvl" +
       "/ATO9/lHgu6+rXMYnHjoP2aLy5z3LwQ1L8QLbPSfk+2vBDXOwwYc\n9J+T4y" +
       "q0tsU5CCozv5z0HxG0LJ8erGv/cJJeB5AEUvr5D5Zt57Jm+2s18XENixJt47" +
       "MvnPPtOfH2\nf9jZpEzkbRy9gYcj97QEp+b2fkWQDxvsaoXO0atLMaPrWCHs" +
       "EGe6osrgK/Ib90bniT0nq2V03/Ag\nh/9tjurbvcjqy3KkE+LPN7o9Gl/M/S" +
       "4cmu8sZhSmqIkM7GhMVd5tCvofvg2mFDIaAAA=");
}
