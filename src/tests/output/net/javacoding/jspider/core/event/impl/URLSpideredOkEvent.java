package net.javacoding.jspider.core.event.impl;

import net.javacoding.jspider.api.model.HTTPHeader;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEventVisitor;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.net.URLConnection;

import et.util.MyUtility;

public class URLSpideredOkEvent
extends net.javacoding.jspider.core.event.impl.URLRelatedBaseEventImpl
{

    protected java.lang.String mimeType;
    protected int timeMs;
    protected int size;
    protected byte[] bytes;
    protected int httpStatus;
    protected java.net.URLConnection urlConnection;
    protected HTTPHeader[] headers;
    
    public URLSpideredOkEvent(net.javacoding.jspider.core.SpiderContext context,
                              java.net.URL url, int httpStatus,
                              java.net.URLConnection urlConnection,
                              java.lang.String mimeType, int timeMs, int size,
                              byte[] bytes, HTTPHeader[] headers) {
        super(context, url);
        this.mimeType = mimeType;
        this.timeMs = timeMs;
        this.size = size;
        this.bytes = bytes;
        this.httpStatus = httpStatus;
        this.urlConnection = urlConnection;
        this.headers = headers;
    }
    
    public byte[] getBytes() { return bytes; }
    
    public java.lang.String toString() {
        return "url spidered : " + url + " (" + httpStatus + "," + mimeType +
        "," + timeMs + " ms," + size + " bytes )";
    }
    
    public void accept(
      java.net.URL url,
      net.javacoding.jspider.core.event.CoreEventVisitor visitor) {
        visitor.visit(url, this);
    }
    
    public java.net.URLConnection getURLConnection() { return urlConnection; }
    
    public int getSize() { return size; }
    
    public java.lang.String getMimeType() { return mimeType; }
    
    public int getHttpStatus() { return httpStatus; }
    
    public int getTimeMs() { return timeMs; }
    
    public HTTPHeader[] getHeaders() { return headers; }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALUZaWwc1fnt+j6S2I7jmNg5MQQT7+31EUsEYzuxkw02tjni" +
       "Gi3j2Wd7ktmdYeat\nvQ40BZFyqaKiUNqqKbS0FSpCFIGgP6iaUqAHLVVrqU" +
       "CpoK2CEFUbBKoq0hZEv/fmzc7b2bVDtbGl\nmR3PfPf93nviLCozDdQqm36y" +
       "pGPTPzAxJhkmTgyokmlOwqu4/HJZ1dhjh1KaF3liyKskCNoQk81A\nQiJSQE" +
       "kERgb7MgbaoWvq0pyqEU4nj8reiz9e/M1dB1tK0IYptEFJTRCJKPKAliI4Q6" +
       "ZQbRInZ7Bh\n9icSODGF6lMYJyawoUiqchwAtdQUajCVuZRE0gY2x7GpqQsU" +
       "sMFM69hgPO2XMVQraymTGGmZaIZJ\nUF3sqLQgBdJEUQMxxSR9MVQ+q2A1Yd" +
       "6MTqCSGCqbVaU5AGyK2VoEGMXAfvoewKsVENOYlWRso5Qe\nU1Jgie1ujKzG" +
       "bYcAAFArkpjMa1lWpSkJXqAGSyRVSs0FJoihpOYAtExLAxeCtqxIFIAqdUk+" +
       "Js3h\nOEHNbrgx6xNAVTGzUBSCNrnBGCXw2RaXzwRvjZbXfnLv2Ec7mM9LE1" +
       "hWqfwVgLTNhTSOZ7GBUzK2\nEM+l/Q+OHEm3ehEC4E0uYAum/5IfXRt77/R2" +
       "C6alAMzozFEsk7j8cVfr1uX+d6pKqBiVumYqNBRy\nNGdeHeNf+jI6RHNTli" +
       "L96Lc//nT850duexz/3YsqR1C5rKnpZGoEVeFUYoA/V8BzTElh6+3o7KyJ\n" +
       "yQgqVdmrco39D+aYVVRMzVEOz7pE5tlzRkcIVcDlgesgsv4a6I2gxmvHYxO6" +
       "kgBDJUaPDS3gFPHr\nBPWlMJmmcSBrCYiA6aMmg5mWNQNPYwo1rSR1dboQdo" +
       "Yy3bDo8dDsdeeeCoE6rKmAEZcfO/PKrUOH\n7rnb8iSNPi4uQb3A3+/w93P+" +
       "fsrfz/j7KX9/Pn/k8TDOm3MtTV2XoBn2j6f76u7zmc95UckUqlKS\nyTSRZl" +
       "QMmSmpqraIE3HCQrNeSAMWfRC6tTMQxSBOXAVCLGvAtAsG2uWOVifHR+BJgh" +
       "BcPvHp796P\nLz5DA4sGQiOlbokGbj1myVbbPnHjwZvu3lVCgRZLqccAtO38" +
       "1OPy+/cefua1X791mZMVBLXlJWs+\nJk02t/hjhibjBBQzh/zX/jP8wQNlvc" +
       "96USlkMNQwIkHkQUHY5uaRk3R9dgGjxgLMmlnNSEoq/WRX\nnWoyb2iLzhsW" +
       "PevYcx0YoAauMrgu4WHbSm/0YwO9bbRijdrTpQMrj+fuKA++/uOal5lR7Eq6" +
       "QSi5\nE5hYeVnvuGPSwBjev/X1sQe+evauzzFfcGcQVK6nZ1RFzjD5NnvA9x" +
       "sL1Ah/c+ODD7Wfet129kaH\ner9hSEvU15nbl7d+4xfSt6B+QB6bynHM0rSK" +
       "caoCpGZskxwaOGxVHatG3XrqzJ3tf/njq7yOCf3R\ngfpb/GT6uS+eXvZSE1" +
       "dBp5LMq+38Yp2SPnlY9wA3spCnb6qYPautFA4RjhkKhcIgUANwop3VryT8\n" +
       "MU2W1JHB77xQs3x/uuugJco6AWBkMJ7Z/ur32z/dwUTgHMuFUsn/r1iQjKud" +
       "1Kc/YYIGi6g/e8M9\nHZGgLwryV8hWE2fuaiSofbWyYhEaEDACliH2CoaIsA" +
       "8ReusrXsxoxNcVJKgkbai2iLUsVqicgARW\nbxHDYMxQkmC8Bd7Rnp36ZzDx" +
       "7p5By/zN4qQkAg6HP8VtG9/7gKWBKxgKtE0Xk/u3fe/dZ86MN1qV\nxZotLs" +
       "5r7yKONV8w09XqGdBh52ocGPRLe3Y+cWL87RlLk4bc2j2USiejj7yB26+slQ" +
       "v0ihKYgCAz\nmV5R0W+HBL91On6LETRUpN+6e3yhYJSgdeA4CJgUZB1EtO3C" +
       "JtGFrs9ctHFBtKgj2gRB+4sULRTs\n9oXCkEKVSSWJs3UVxKpjYtGG5rfmOv" +
       "p+iN1oARWihxUpinpy8dDZy1o/+qYXeVcpIwXmtSyFuPx0\nSduH3ueb2ljr" +
       "KJ2RTKvSuAfd/Dk2ZzxlVqvRrcLbz3/3EyC4RLDt/Yiu64JhuxzD3nQBDNvZ" +
       "5QtF\newgqoyxNRvtItk99G67H7f5UoE+Jzp8VZOzWbffsWaE2SbriT2oJrP" +
       "qHJyfHhrEEL3P0DAt6Hr0A\nenYFfaEeqEoV84yXaTc7eu9gzz6qHGtUiCm0" +
       "i4PQWcg98e2nTrYHieTMLf968eHqHVZjpDitjEyF\nu9DlYMXlm4+fiixPXK" +
       "9Y5cFdsFzAx39y7cPnXiVvW+UuO6tQbjsz+QJeJwljVM9rC/XlTz2S9KKK\n" +
       "KVTH1mpSilwnqWk6E0xBlJoD/GUM+p34PXflZLXivuws1uqumAJb95TklDd4" +
       "zm3NzmC0Hq5tcDXy\ngGt0BZwHsV66xBDa2H13doyp0g2NgHw4kXEXCh6jX3" +
       "DiK9jjav6WvQev7H3hnbM/VD5iDb6aJXM/\nxeCSV7E3Qrko0XSTro+EBTqn" +
       "1Daqm1a/6LTZdveGuwk6+BljeVyb0Yg5ecNkfkRHwh3dnb4eKIjr\nJodHJv" +
       "y2spTbbYLyJ2Bxlq8jlQw5KyYIn/VOFaV9SfwIOVk6PtQ/SElfbw2m9E5yfH" +
       "YRXJs40qbC\nPvsSvd0CRY2AbIfNbJkuRG4zXE2cXFNhcl/m5NiQuSqxFk4Q" +
       "2b/5xL7CiYlF0IqY6ZyiFOxl3253\n/BmMXBB/0goV9YWhPlUzfzI5KKuHbK" +
       "HoP/eupOJWuJq5is2FVTzFVayeJ0Sne0Hp1V1wOfcqsn/z\nST7CSRaYF3i+" +
       "PSr0hGCu6To7g8EiR81omBkNmlcDM1qOGJTZd92yZY04tpLaF8O1hau9pbDa" +
       "P+Bq\n253E1TPXcx+sREW0z5OCfUKM+HxuE4y6jRbqKtJo3ZbRoHLUMqNxJS" +
       "ibpxydnGhjcl7KO6HTLFt5\no4QiunWlXS02A991w4e1d0ov3ejlXfUA6EI0" +
       "3aeCoKrTYN1EDrMpye4lG67f/tf9XY993t1h6Yqy\nVeywuWhx+YUnT/8p+s" +
       "abJ6FrTqGKq0cnBvpjQ1Dvtq/KLi7XL7RcUzKv/JJ1Ad7s8rYec5H6cltc\n" +
       "tYFJ2khN5jS6HTk7AHSa2s2jZHehHQDB9CvMKecdYn4GzWAOk6tWr2uhHmfY" +
       "eoWgA6sFmEk0Q5rD\n00mc1IylaboJnDZkPNg/OkL3rvS9oZ5IR7jL1xm+nK" +
       "D11q6WLQFibE7nWWEPt8KeNbLCb8EKRLPW\nB2L+/UEwQa9jgteKzLHOSEco" +
       "xApTvc11t7nDCgjWRgvZoReuALdD4P+zg5ep6hU1e1soIkFHsz8X\nq1l3Rz" +
       "jii/DVPaW4T+R6RuAacri+UzzXSNgXhdJXsaCYCj1koGRheRE+/47qADwyQt" +
       "dZqOePljfp\nykuWsU7y1mULGj2OsdZlwUJepBEc4V6MrFE0fwirXsioFZfh" +
       "5wQvhB0v/LvYdhuiUd0JA89Fbu45\n0T1WyC60I3Zzu3SvkV0+gfgAySbsgb" +
       "CQHNvh6uNy9K2NHJ5SgmpAjsP5CxBPjeAaZ9PNU0vQcJE1\nN9zR0+0LBbug" +
       "6NZni+5hYVlQsOjQtdY+bo59a2SOOpjCQJbh3LmzkDR0VBrg0gyskTSbwQMg" +
       "zaSz\nCCkkyaVwHeCSHFgjSbbBME7tUnCKpEJsWkUIMah2C0HVmTdFdoZ7nW" +
       "1CTztBI0VHWijU6QtFaH+v\ny4YaVwPB0rshv3zQ84LmvBNr61xV3rV802Uv" +
       "6vW/svbS7LPPyhiqnE2rqrhtIDyX6waeVZgzKq1N\nBMsYAYIu/WzHbFDO6Q" +
       "+1jcc63/PAVLzzvMiwImO/ImKUoJZVEIEV/RExYDhoKowBVYw/ifB9MEzl\n" +
       "wkP4OP+IoFdAdwZQ+rhPFwPlSmEl62zRXfHZTyXHsSoRnLhKMq2WSmMiw7dZ" +
       "7T2GCR3LCj1GyTz6\nfOk19/3+v2yGts8s6GG7bAZYGw/0pyR1yWSbT/QbPY" +
       "uU04YBhNkagnu6xrQoWofrLeJOS5ZX2+SR\nsSHXZgsslqIXZLFEyZTSxVJR" +
       "R7gnDHRRITMx0XmWsw0XqsQ9nOP/AI5AYqsvIgAA");
}
