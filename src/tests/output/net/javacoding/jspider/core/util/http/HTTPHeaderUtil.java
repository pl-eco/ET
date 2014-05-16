package net.javacoding.jspider.core.util.http;

import net.javacoding.jspider.api.model.HTTPHeader;

import et.util.MyUtility;
import java.net.URLConnection;

import et.util.MyUtility;
import java.util.ArrayList;

import et.util.MyUtility;

public class HTTPHeaderUtil {

    
    public static HTTPHeader[] getHeaders(java.net.URLConnection connection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String headerKey = null;
        java.lang.String headerValue = null;
        int i = 0;
        headerKey = connection.getHeaderFieldKey(i);
        headerValue = connection.getHeaderField(i);
        while (headerKey != null || headerValue != null) {
            net.javacoding.jspider.api.model.HTTPHeader header =
              new net.javacoding.jspider.api.model.HTTPHeader(headerKey,
                                                              headerValue);
            arrayList.add(header);
            i++;
            headerKey = connection.getHeaderFieldKey(i);
            headerValue = connection.getHeaderField(i);
        }
        return (HTTPHeader[])
                 arrayList.
                   toArray(
                   new net.javacoding.jspider.api.model.HTTPHeader[arrayList.
                                                                     size()]);
    }
    
    public HTTPHeaderUtil() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVXW2wUVRg+e+m22xZ749LQQptStA10l0KpSB+0WWi67bZd" +
       "2xKllizTmbPtwOzM\nOHOmXRCJRgTkwcSAt4gaHwyJMT5AxAdNkCDeSUwfBD" +
       "UkGnzQKEQeDMRg8D/nzOzOTksx2mRmzp7z\n387/f/+l715FRaaB6kUzQvbo" +
       "2IzERpKCYWIppgimOQpbKfF8UTh5ol/V/MiXQH5ZIqgiIZpRSSBC\nVJai8S" +
       "1dWQM16pqyZ1LRiC1njpTNq27NfH2ory6AKsZQhayOEIHIYkxTCc6SMVSewZ" +
       "kJbJjdkoSl\nMVSlYiyNYEMWFHkvEGrqGKo25UlVIJaBzWFsaso0Jaw2LR0b" +
       "TKezmUDloqaaxLBEohkmQZWJXcK0\nELWIrEQTskm6EiiUlrEimY+j/SiQQE" +
       "VpRZgEwqUJ5xZRJjHaQ/eBvFQGM420IGKHJbhbVsETDV6O\n3I2b+4EAWIsz" +
       "mExpOVVBVYANVM1NUgR1MjpCDFmdBNIizQItBC2/o1AgKtEFcbcwiVME1Xrp" +
       "kvwI\nqMLMLZSFoCVeMiYJYrbcEzNXtIZC5X8fSd5oZDEPSlhUqP3FwLTSwz" +
       "SM09jAqog5400rciy+3ar3\nIwTESzzEnKZ79QfbEr+caeA0dfPQDE3swiJJ" +
       "ibc661fMdv8cDlAzSnTNlCkUCm7Oopq0T7qyOqB5\naU4iPYw4hx8Pf7r9qX" +
       "fwb35UEkchUVOsjBpHYaxKMXtdDOuErGK+O5ROm5jEUVBhWyGN/QZ3pGUF\n" +
       "U3eEYK0LZIqtszpCqBgeHzxNiP+V0RcAsHd0NNmLBQkb26hFOkGdKibjFAOi" +
       "JkH0x3eZugzH46Jm\n4HFq9vgUIfq4lzFLdVXM+Hw0ab0ppwA+ezUFiFPiiS" +
       "tf7tva/9xhHkAKOttKgjpAdSSvOmKrjlDV\n3GNUdaRQNfL5mNJlhb6lwZJo" +
       "Tv1+sqvy+TbztB8FxlBYzmQsIkwoGHJRUBRtBkspwsBY5QI+wxuA\ntXwCcA" +
       "uWpBQQxPIEnDltoCYvPvNZHYeVAKCb3X/7m2upmVMUSjT0i6l0bhoEcje3rb" +
       "x1ZEffzsNN\nAUo0E6QxAtLmu0tPideODJz69qvLLfk8IKh5TnrO5aTp5TU/" +
       "aWgilqB85cW//FfvH0eLHnjfj4KQ\ns1C1iABYgxKw0qujIM26nJJFnQWcZW" +
       "nNyAgKPXLqTCmZMrSZ/A4DziL6quIYos7yGMiq3c1nQusu\nflR2nt3YKYwV" +
       "rgo6gglPs6q8r0cNjGH/8ivJoy9ePfQYc7TtaYJCujWhyGKWGbLMB4GtmSfl" +
       "I7WL\nj73UevyiE8mavPRuwxD20EBmn55d8epnwutQDiAtTXkvZlmHmCbkKK" +
       "DvNWy91nVIfzfZJBRc3uzp\noQ3BiUxm4ok/z71R2siNoTz1bh2r2Pte+4Z0" +
       "3eJIzivPcRhoxZ0KLWsShx69Xn5Q+GQHL4fVhQm2\nVbUyG9+8hFsfKhfnye" +
       "Uw0fQ2BU9jJX8zr7YB1oCcq1U80vBTT+eJJ71XYxUFOzxbYwOFbCnx7Htn\n" +
       "fth46fsDYMUYKh4cGol1J7aCwQ0LqkuJVdN1Dwem5M/9rP3xFJrTNguZutzX" +
       "BCwbGLq+Sh1Gd8Is\nlo3M9kqwvBqeHngW2UWXfelhNX3V2HCfEzc/ixvA02" +
       "STyPzo8eV8U+v2De9PvJvtO37lYOuP312w\nO55rkspT/Zo6YJ1+9sws80EY" +
       "ZhrBHMzfD2YquvKxOQPSn5XK/E1LedVPEJtzU3t7BxhUDZroDBaR\npUhCEw" +
       "UlvuWts2WzL1idfdyURS6C+JZUtuHC2623G5kJtsaQq6nav4unBWMwjzD6GS" +
       "Dowf/WrTa3\nb1jb0dHWuYmgUihuKngDNDHnLoZpi2U4bUbbhhOx3PHd0zgG" +
       "4iYx4ZpMWshcTmfFgvr8wEz/1Zb6\nG6/5kX8Bn88zBuUkpMSTgebr/g+XNr" +
       "P6HJwQTB4W7/w4dzwsmPqY0WUFeK1fAK+MsI8HfdwV9A26\n47k1d+jggi5H" +
       "MpqEFVfz1nUoE6VMRvu69vXrmYxB+tr5v+Lavqnt/nUE1eQDcZ/ZyBMVZQm6" +
       "p5CH\nVvTaOf8i8EFWbJrd2XJOr/qCe9kZNksAnGlLUVyFwF0UQrqB0zJzUg" +
       "lvbtxjaYJW/6sBh6Ag/TB/\nYM4rE9R4N15gox83G+zVLcAGHPTj5tAA/fNz" +
       "EFRsr9z0sH1PIT3ENP/DTWoRFABSupzOAaaSpRod\nuiK8KGX1fwBZYsYV+g" +
       "0AAA==");
}
