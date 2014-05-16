package net.javacoding.jspider.core.util.html;

import net.javacoding.jspider.core.util.URLUtil;

import et.util.MyUtility;
import java.net.MalformedURLException;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.util.StringTokenizer;

import et.util.MyUtility;

public class URLFinder {

    final public static java.lang.String basePattern = "<base href=";
    final public static String[] patterns = { "href=", "src=", "background=" };
    
    public static void findURLs(
      net.javacoding.jspider.core.util.html.URLFinderCallback callback,
      java.lang.String line) {
        URLFinder.findBase(callback, line, basePattern);
        for (int i = 0; i < patterns.length; i++) {
            java.lang.String pattern = patterns[i];
            URLFinder.findURLs(callback, line, pattern);
        }
    }
    
    protected static void findBase(
      net.javacoding.jspider.core.util.html.URLFinderCallback callback,
      java.lang.String line, java.lang.String pattern) {
        java.lang.String lineLowerCase = line.toLowerCase();
        int pos = lineLowerCase.indexOf(pattern);
        if (pos != -1) {
            java.lang.String url = "";
            try {
                url = URLFinder.extractURL(line, pos + pattern.length());
                java.net.URL baseURL = URLUtil.normalize(new java.net.URL(url));
                callback.setContextURL(baseURL);
            }
            catch (java.net.MalformedURLException e) {
                callback.malformedContextURLFound(url);
            }
        }
    }
    
    protected static void findURLs(
      net.javacoding.jspider.core.util.html.URLFinderCallback callback,
      java.lang.String line, java.lang.String pattern) {
        java.lang.String lineLowerCase = line.toLowerCase();
        int pos = lineLowerCase.indexOf(pattern);
        while (pos != -1) {
            java.lang.String uri = "";
            try {
                uri = URLFinder.extractURL(line, pos + pattern.length());
                java.net.URL baseURL = callback.getContextURL();
                if (!URLUtil.isFileSpecified(baseURL)) {
                    baseURL = new java.net.URL(baseURL.toString() + "/");
                }
                java.net.URL foundURL =
                  URLUtil.normalize(new java.net.URL(baseURL, uri));
                callback.urlFound(foundURL);
            }
            catch (java.net.MalformedURLException e) {
                callback.malformedUrlFound(uri);
            }
            pos = lineLowerCase.indexOf(pattern, pos + pattern.length());
        }
    }
    
    protected static java.lang.String extractURL(java.lang.String string,
                                                 int pos) {
        char c = string.charAt(pos);
        java.lang.String ret = "";
        if (c == '\'' || c == '\"') {
            string = string.substring(pos + 1);
        } else {
            string = string.substring(pos);
        }
        if (string.length() > 0) {
            c = string.charAt(0);
            if (c == '\'' || c == '\"' || c == '>') {
                ret = "";
            } else {
                java.util.StringTokenizer st =
                  new java.util.StringTokenizer(string, " \"\'>");
                ret = st.nextToken();
            }
        }
        int p = ret.indexOf('#');
        if (p > -1) { return ret.substring(0, p); } else { return ret; }
    }
    
    public URLFinder() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1ZfWwUxxWfuzNn/AHGNjhWMMaA04LwnT/OPmPcpjG2CYYD" +
       "GxuSxhhd1ntz9sLe\n7mZ3zj4IRa1CQpI/KkWhbdrQpJ9CiqK0AkGlpipBSZ" +
       "p+UVWuFGirpK1IUaoWlCitQFEi+mZm93Zu\nz9j4FKTdG8+8N+/Ne7/3McvL" +
       "19Aiy0R1shUmhwxshXtHhiTTwoleVbKsPTAVl99cVDJ0aoem+5Ev\nhvxKgq" +
       "CKmGw1JyQiNSuJ5oG+7oyJGgxdPTSh6sTeJ2+Xzes+mf798e0rA6hiFFUo2g" +
       "iRiCL36hrB\nGTKKylM4NY5NqyeRwIlRVKlhnBjBpiKpymEg1LVRVGUpE5pE" +
       "0ia2hrGlq1OUsMpKG9hkMp3JGCqX\ndc0iZlomumkRtCx2QJqSmtNEUZtjik" +
       "W6YyiYVLCasB5BR1EghhYlVWkCCGtizima2Y7NW+k8kJcq\noKaZlGTssBQd" +
       "VDSwxGovR/bEjTuAAFiLU5hM6llRRZoEE6iKq6RK2kTzCDEVbQJIF+lpkELQ" +
       "3bfd\nFIgWG5J8UJrAcYJqvXRDfAmoSphZKAtBK7xkbCfw2d0enwneGgyWf/" +
       "r00I0G5vOiBJZVqn8xMNV7\nmIZxEptYkzFnvJkOnxh4KF3nRwiIV3iIOU3P" +
       "PT/bG3v//GpOs3IWmsHxA1gmcfmTaN2qmZ73SgJU\njcWGbikUCjknZ14dsl" +
       "e6MwaguSa7I10MO4uvDf/qoa++hP/tR4sHUFDW1XRKG0AlWEv02uNiGMcU\n" +
       "DfPZwWTSwmQAFalsKqizv8EcSUXF1BxBGBsSmWTjjIEQKobHB88+xP+V0xdB" +
       "ZXuHY1sBDtgMGwS1\napiMUffLegIcP3bAMhRYGpN1E49RjccmSUodE3gyVE" +
       "LFtM9HQ9UbaCqgcpuuAmFcPnXlt0f6dzz1\nJHcbhZqtG0HNIDXsSg3bUsNU" +
       "KrcTlRrOSkU+H5N3V64xqXcSNIj+c7p72ddD1jk/CoyiEiWVShNp\nXMUQfJ" +
       "Kq6tM4EScMfZUC0hnAAJ3l4wBUUCKuwkYsMMB6UyZa6wWkG8YDMJIAZTNHb/" +
       "3xenz6DMUO\n9fVyujtXDTx3kOtWvmFk//aHn1wboETTRdQpQNo4/+5x+frT" +
       "O8+8/bt31rvAJ6gxLx7zOWk8edUf\nMnUZJyBfudt/6+NtHzy7qOusHxVBkE" +
       "KaIhKAC2K+3isjJ666nRxFjQWcZUndTEkqXXISSymZNPVp\nd4ZhZgl9VXL4" +
       "UGN5FGTp7eZjwZZLvyh7k53YyYQVQsocwYTHVaVr6z0mxjD/znNDz37j2vF9" +
       "zNC2\npQkKGulxVZEzTJG7fODY6lliPFy7/MQ3N5y85Hiy2t29xzSlQ9SRma" +
       "/NrPr2W9J3If4hDi3lMGZh\nhpgk5Aig741s3CQs0r/X2iQUXN7A2UorgOOZ" +
       "1Pij/3v9hdIGrgzlqWPb+EGxldhh6e/dmcMVlx85\nfDIyM/KgwlOZNzd6iA" +
       "//cu8LNy+Sd5mlXedTaWsy+Qo+IAm43PT2VGXwpy+m/Kh4FC1j9U3SyAOS\n" +
       "mqZ+GIUKZfXakzG0JGc9t9rw1NqdBXedF3iCWC/s3IwCY0pNxyUcaYxmGZis" +
       "Fp5ueJbaOZD90sUq\n+qrO+AAhZV8YlyzcMGni5BfpbBfjXsfen+M4ChCQrW" +
       "gSKzzrAVQWaxgywEx5hyQCtVID99SK7uGn\n42XmyMkrT2z4+58v2qVIaHFc" +
       "qn/Fj6XPPX5+xk9DqASaDcna5Z4Rmh068rEGADwVzz1zKU/MvcTm\n3NQaaQ" +
       "WFqkASbY7CSsJGQN99XRfeu/YT5QYTU8p6jx7KYcspYTOC4IBuWLTKCW2WvV" +
       "PjoGHRXLNE\nEDLQF8+svvjjDbca2P621kGhYtp/F09J5i6xKJQyvVtbI10R" +
       "gjYvuC5tbos0RSKh9naCdi+wvIQF\nJ37eaiCSOYFJgzhLlezL9fZRqO35xq" +
       "UmsbGGqpivl7JUQuEe7tfSKXERDl003N/Tx0y/HHpDl5T3\nYTxX0nd7DqSD" +
       "8Cy3N1rmhTQy6GBkFhTT8b0MwvT1JYAvNHAcujQhC6BkSY9i8tj0jmvr6248" +
       "70f+\nOTA5S/+W3SEunw40fuh/taaR1ZkiakIGW2/jm9/X5rSrDN5lOWaod4" +
       "4/ixkYYQ8PijEhKNrYQr8L\nt/aW9sLg1tHU1hVqbyFocKFwc4wuYM2ZCu/L" +
       "7KcK7icoYA8H6Wt3tqT47B6CoYK+9jkuT+S73O+6\nHLwdVLE2QSa9ZWTIVF" +
       "IQmVN213x29KOWxNWNfTxV1Yq3MZFwW9st3Fj9/ge8gOQiY5by4xHyTP2P\n" +
       "rp65Mryctzb8/rIu7woh8vA7DPNnuZGBM6yZSwKjfmPjmpePDr87zk9Slds8" +
       "0mDsePEy3nBfuTxL\nixoANILF2Lk66OxoJusCv12O7bCtdsO2V9U1TFtPZ4" +
       "23hIoezt4fYTGT50wouKJHdjLcuwX3wivn\n/9px+S/HQM9RVLxrcKS3J9YP" +
       "R1rtMYGXr3Jq5e7ApPJrlortGpt3S8xl6s6trKUmhkuutien1jRw\n2DGr5G" +
       "POx+E2Zz80b7P0KFRcmRpzltzIKybKuFHd0ZUf1QUWERbVkU6CdnyGUU2Ve1" +
       "zIttmwrmCH\nPWI3hq456hw7mWjV7S7GDOLHv/xh+RPSG/v9tt3gPlpCdCOk" +
       "4imsuv2md5Ncn1c8uPofW6OnvuJt\nOIvYOJPNuVCz0DZ4auycW+PJuW65yk" +
       "9CdsmZ1fFiPNkp+ztCyo54+piYLkvqQN/3L5TNPJOObneO\nfj99PV+Y19ua" +
       "Im2hjk3gIthapTdCB3edC4RBr8hvH+YHwmF4IT9JXz8sVNdoS6izlfBvAaw4" +
       "zB9P\nJ+Bo0MEmYCeLEUwanCkF+0zp9EMaz3UtyOP0FfYnhHrb6fV36HQ4s2" +
       "HqBCIVJ+bwfYC3JqK5zgrm\nirrmOleQuSItTZGOULRVcC3d7HuiwJ8LAjtd" +
       "ga8WKjAaCXW2i/4RhZ0XhG1yhb1WqLDOaKgLmpBi\nw+1U7wAPr9h42GJ3Yy" +
       "/dzu0h2+2hBcT66YX5+6JrkXYhPP5QkEXaO+b394wgsMMV+KdCBc7p70uC\n" +
       "MAHNlwsVVpi/3xLi/7b+vheeLba/t3xG/p4lt/9TKNyC+a8WZJFotCnSFepo" +
       "Y5dy5860m77U+a3y\nN2gYcIaYkkwcw9g6XhN0FDB5vVAd21pDUdCx2pUGbQ" +
       "LvrZjCrJvJ8tBPULV5/4nBP7XLa2ceXv+6\nUfkbfp1yPocvhht2Mq2q4lcR" +
       "YRw0TJxU2NEW828k/Jz/JeieO6pwAG/6w0zxEee9QVDDfLzARn9E\nto8JWj" +
       "kHG3DQH5HjU4JqZueAOLBHAr0PEbQ0lx787P4hkgag0wdSOixil6jHMsb/Af" +
       "5L7VGIGgAA\n");
}
