package net.javacoding.jspider.core.task.work;

import net.javacoding.jspider.api.model.HTTPHeader;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEvent;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.impl.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.WorkerTask;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.http.HTTPHeaderUtil;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.URLUtil;

import et.util.MyUtility;
import java.io.*;

import et.util.MyUtility;
import java.net.*;

import et.util.MyUtility;

public class SpiderHttpURLTask
extends net.javacoding.jspider.core.task.work.BaseWorkerTaskImpl
{

    protected java.net.URL
      url;
    protected net.javacoding.jspider.api.model.Site
      site;
    
    public SpiderHttpURLTask(net.javacoding.jspider.core.SpiderContext context,
                             java.net.URL url,
                             net.javacoding.jspider.api.model.Site site) {
        super(context,
              WorkerTask.
                WORKERTASK_SPIDERTASK);
        this.
          url =
          url;
        this.
          site =
          site;
    }
    
    public void
      prepare(
      ) {
        context.
          throttle(
          site);
    }
    
    public void
      execute(
      ) {
        net.javacoding.jspider.core.event.CoreEvent event =
          null;
        java.net.URLConnection connection =
          null;
        java.io.InputStream inputStream =
          null;
        int httpStatus =
          0;
        HTTPHeader[] headers =
          null;
        try {
            connection =
              url.
                openConnection();
            if (connection instanceof java.net.HttpURLConnection) {
                ((java.net.HttpURLConnection)
                   connection).
                  setInstanceFollowRedirects(
                  false);
            }
            connection.
              setRequestProperty(
              "User-agent",
              site.
                getUserAgent());
            context.
              preHandle(
              connection,
              site);
            long start =
              System.
                currentTimeMillis();
            connection.
              connect();
            if (connection instanceof java.net.HttpURLConnection) {
                httpStatus =
                  ((java.net.HttpURLConnection)
                     connection).
                    getResponseCode();
                switch (httpStatus) {
                    case HttpURLConnection.
                           HTTP_MOVED_PERM:
                    case HttpURLConnection.
                           HTTP_MOVED_TEMP:
                        java.lang.String redirectURL =
                          connection.
                            getHeaderField(
                            "location");
                        this.
                          notifyEvent(
                          url,
                          new net.javacoding.jspider.core.event.impl.URLFoundEvent(
                            context,
                            url,
                            URLUtil.
                              normalize(
                              new java.net.URL(
                                redirectURL))));
                        break;
                    default:
                        break;
                }
            }
            inputStream =
              new java.io.BufferedInputStream(
                connection.
                  getInputStream());
            java.io.ByteArrayOutputStream os =
              new java.io.ByteArrayOutputStream(
              );
            java.io.InputStream is =
              new java.io.BufferedInputStream(
              inputStream);
            int size =
              0;
            try {
                int i =
                  is.
                    read();
                while (i !=
                         -1) {
                    size++;
                    os.
                      write(
                      i);
                    i =
                      is.
                        read();
                }
            }
            catch (java.io.IOException e) {
                LogFactory.
                  getLog(
                  net.javacoding.jspider.core.task.work.SpiderHttpURLTask.class).
                  error(
                  "i/o exception during fetch",
                  e);
            }
            java.lang.String contentType =
              connection.
                getContentType();
            int timeMs =
              (int)
                (System.
                   currentTimeMillis() -
                   start);
            headers =
              HTTPHeaderUtil.
                getHeaders(
                connection);
            if (httpStatus >=
                  200 &&
                  httpStatus <
                  303) {
                event =
                  new net.javacoding.jspider.core.event.impl.URLSpideredOkEvent(
                    context,
                    url,
                    httpStatus,
                    connection,
                    contentType,
                    timeMs,
                    size,
                    os.
                      toByteArray(),
                    headers);
            } else {
                event =
                  new net.javacoding.jspider.core.event.impl.URLSpideredErrorEvent(
                    context,
                    url,
                    httpStatus,
                    connection,
                    headers,
                    null);
            }
            context.
              postHandle(
              connection,
              site);
        }
        catch (java.io.FileNotFoundException e) {
            headers =
              HTTPHeaderUtil.
                getHeaders(
                connection);
            event =
              new net.javacoding.jspider.core.event.impl.URLSpideredErrorEvent(
                context,
                url,
                404,
                connection,
                headers,
                e);
        }
        catch (java.lang.Exception e) {
            LogFactory.
              getLog(
              this.
                getClass()).
              error(
              "exception during spidering",
              e);
            event =
              new net.javacoding.jspider.core.event.impl.URLSpideredErrorEvent(
                context,
                url,
                httpStatus,
                connection,
                headers,
                e);
        }
        finally {
            this.
              notifyEvent(
              url,
              event);
            if (inputStream !=
                  null) {
                try {
                    inputStream.
                      close();
                }
                catch (java.io.IOException e) {
                    LogFactory.
                      getLog(
                      net.javacoding.jspider.core.task.work.SpiderHttpURLTask.class).
                      error(
                      "i/o exception closing inputstream",
                      e);
                }
            }
        }
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcRxUf353PPtuN44+mbuzEjnuFWI33/O04/oM6tiNf" +
       "comvPqchV1fX9e6c\ns/He7nZ37nwxaQSiNKESlap+QKXQiIoSCVWAiFr+AB" +
       "GitnxHAv/RFlArUKqqCFIVIdQIisKbmT3f\n3N45QQ2ctHtzM+/Ne/M+fu/N" +
       "vXQVVTs26lAciZywsCNNJuKy7WB1UpcdZx6mUsrr1aH4+QOG6UNV\nMeTTVI" +
       "IaY4oTUWUiRzQ1Ep0az9uoyzL1E0u6Sdx9ynbZc9fHK78+vb/djxqTqFEzEk" +
       "QmmjJpGgTn\nSRI1ZHBmEdvOhKpiNYmaDIzVBLY1WddWgdA0kqjZ0ZYMmWRt" +
       "7Mxhx9RzlLDZyVrYZjILkzHUoJiG\nQ+ysQkzbIWhz7LickyNZoumRmOaQ8R" +
       "gKpjWsq87D6BTyx1B1WpeXgHBLrHCKCNsxso/OA3mdBmra\naVnBBZbAsmaA" +
       "JTq9HOsnDh8AAmCtyWByzFwXFTBkmEDNXCVdNpYiCWJrxhKQVptZkELQ1g03" +
       "BaJa\nS1aW5SWcIqjNSxfnS0AVYmahLATd7iVjO4HPtnp8JnhrNtjw78fjH3" +
       "UxnwdUrOhU/xpg2u5hmsNp\nbGNDwZzxWlZ6Ono02+FDCIhv9xBzmom7f3A4" +
       "9v7FTk7TXoFmdvE4VkhK+XikY9vaxLshP1Wj1jId\njYZCycmZV+Puynjegm" +
       "jesr4jXZQKiz+Z++nRz38b/8WHaqMoqJh6NmNEUQgb6qQ7roFxTDMwn51N\n" +
       "px1Moiigs6mgyX6DOdKajqk5gjC2ZHKMjfMWQqgGnip4TiL+aaMvgloSlqZi" +
       "e4YQ6/BcbF52liWL\noDEDkwUaBoqpQgAsHHcY1YJi2niBANHCimkvL1TgzV" +
       "OJjStVVTR1vYmnQ5TOmDrwpJTzV355cvrA\nl89wN9LQc3UlaBSkS0Xpkitd" +
       "otIlKl2i0qUy6aiqism9o9TI1GsqTa6/fn988xO9zis+5E+ikJbJ\nZIm8qG" +
       "NISlnXzRWspgiLyiYhA1jgQdQ2LEIAgzIpHTZiCQNWzdmo2xuoxfSOwkiG6F" +
       "s7df03H6RW\nLtCYojHQSnfnqoFHl7luDT2JB/c/dKbbT4lWAtRZQBq++e4p" +
       "5YPHD15441dv7ywmBEHhsjwt56R5\n5lU/bpsKVgHHitt/9Z8zHz5VPfayDw" +
       "UgeQG+iAxBB1iw3SujJN/GC9hFjQWc9WnTzsg6XSoATh05\nZpsrxRkWO7ex" +
       "8WYwQD081fB0uxG7nb7oYjN9tfBIo/b0nIEh47UvBvve/FH968woBRBtFNA2" +
       "gQlP\nyaaiO+ZtjGH+7a/Fn3rm6ukHmC9cZxAUtLKLuqbkmX53VIHvWyrAg9" +
       "TW+vSzPWffLDi7pbj7hG3L\nJ6iv819Y2/bcz+SvA3RACjvaKmYZ6meS/MDU" +
       "hgtbTk8e5IDD4enk2SuP9fzxd5ddCBNKY5Hqz6lH\ns6986eKaj5o4BEVKdg" +
       "4VsosVSTqqYoUD3MhCns6EmD3reAL3E5dzdGxsGBRqBkm0qEqaKsVMRdaj\n" +
       "U9+4VL/2ZHZkP1flNoEgOpXKd15+sed6F1PBlRgUUNL9XZOT7UPFxKdfAwTt" +
       "/cTYs2ewb9fAWO9w\nH0E1Cq/ezFmtBPXcCFL4VpMCR4SbYY9ghhG2MEhf47" +
       "eq5PBA7/AYQf6srRcUbGBxQrUESlGHCUGH\n0aIOe29Vh5H+3lEwFIQfwQUl" +
       "7t7ASrKlSRlTxbqUAOpCBtD3LjbupZnJohcxnbtdEgqQ3iKwj3Y3\nBXTJLH" +
       "7uH68+X9fFs4XydLBtfBBz7WISlHCllIdXzw6uJY5oPPi8dd9DvPrjw89fu0" +
       "zeYVBQBDAq\nbUe+XMH7ZQFbd7+Rawp+71zGh2qSaDPr3WSD3C/rWQoUSUgi" +
       "Z9KdjEESiOulnRTPz/F1gO7wgqcg\n1gudxeoI49J8LaLlJni2wLPVRcutHr" +
       "SsQizBEowhzN6fXse2kGWbBPTDal4ISzcCjwoROOgBA27q\nqXvHLr179bva" +
       "Ryzh61gDO0E5XKVDbEZAIb9pObRVEnp1d6fwrOWMM7FDBNUxsf39o6OQLZOf" +
       "PNz7\n+wd3DQz1DowSVDs/E01IcEIqIskPewr6svIzUU1cW6JmFmebWI5Sd0" +
       "rTRjYjLkLXEpibnpiiu36G\nFyb6PlTiHtpytbtM7ZXdk6avw2Jauk7QBCcM" +
       "sYUHBPsMj96affqGdg0N9g7BLiFmHyqdyjjuakLH\nDMX3sbMxjT7l5ngRBj" +
       "pcCIAY2bZR/87uHqc/+7eGx+TXHuTp21zarlHTDp97C/fc26BUaA5DxLR6\n" +
       "dZzDehFjvNIOsntNIZ0aj3T+ad/I+UcqgUyHCDKlbCnl0ncu/mH4rd8/Clok" +
       "Uc2h2cTkRGwaFO68\nobiU0pRrv89/TPs5ywY338tuY6VM46VZXmdjuEwa8y" +
       "W53lXSGd0JT9gNpnClzkjw0QZQfVMcfwQK\nqWVjS4Z7rQeQ47aWgVqec+9W" +
       "Lyf/3qe+d88U92ibeGcXCWcGruNwy/sfcigu7U0qALlHyJPbv/ne\nhStzrT" +
       "wq+C33rrKLpsjDb7rsLA0WjcsdN5LAqF+7Z8dLp+beWfS5NgCcCuRM+tdCkO" +
       "nbh5ipVsuc\nsdN1xs7/kzO+As7AeaxkeTqeQQDVTWXZTHvOtrI/PPi1XOle" +
       "e2jnq1bTL1grv351roXOLJ3VdbHK\nCOMgREBaYyrU8prDEenZjfuF0osaGJ" +
       "B+sUM9w3mfI6jrZrzARr9EtrMEtd+ADTjol8hxjqAtlTnA\nmu5IpH+BoE2l" +
       "9ICyxR8i6YtQPICUDr9liVB9XoDqAavQW+3+7y61e2UHH4EBtqk3oxlLp2Hb" +
       "KpSn\nhIUVjXbg+Rd+GLjvid/+i8FMoeGlf9FAVc1pANuRCUPWTzisRaFr9B" +
       "qrZG24ohGGx66D6x2+I/9L\npl0syuuywvNH49MV6vLu/0ldhi0DtO7cwt0f" +
       "avidlYzEFBcrNT2C4sr7D84XV+9jFAAA");
}
