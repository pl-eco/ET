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
import java.io.*;

import et.util.MyUtility;
import java.net.*;

import et.util.MyUtility;

public class FetchRobotsTXTTaskImpl
extends net.javacoding.jspider.core.task.work.BaseWorkerTaskImpl
{

    protected java.net.URL
      url;
    protected net.javacoding.jspider.api.model.Site
      site;
    
    public FetchRobotsTXTTaskImpl(net.javacoding.jspider.core.SpiderContext context,
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
            ((java.net.HttpURLConnection)
               connection).
              setInstanceFollowRedirects(
              true);
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
                        return;
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
            try {
                int i =
                  is.
                    read();
                while (i !=
                         -1) {
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
                  net.javacoding.jspider.core.task.work.FetchRobotsTXTTaskImpl.class).
                  error(
                  "i/o exception during fetch robots.txt",
                  e);
            }
            java.lang.String contentType =
              connection.
                getContentType();
            int size =
              connection.
                getContentLength();
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
                  new net.javacoding.jspider.core.event.impl.RobotsTXTSpideredOkEvent(
                    url,
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
            } else
                      if (httpStatus >=
                            400 &&
                            httpStatus <
                            500) {
                          event =
                            new net.javacoding.jspider.core.event.impl.RobotsTXTUnexistingEvent(
                              url,
                              context,
                              url,
                              httpStatus,
                              connection,
                              headers,
                              null);
                      } else {
                          event =
                            new net.javacoding.jspider.core.event.impl.RobotsTXTSpideredErrorEvent(
                              url,
                              context,
                              url,
                              httpStatus,
                              connection,
                              headers,
                              null);
                      }
        }
        catch (java.io.FileNotFoundException e) {
            headers =
              HTTPHeaderUtil.
                getHeaders(
                connection);
            event =
              new net.javacoding.jspider.core.event.impl.RobotsTXTUnexistingEvent(
                url,
                context,
                url,
                404,
                connection,
                headers,
                e);
        }
        catch (java.lang.Exception e) {
            event =
              new net.javacoding.jspider.core.event.impl.RobotsTXTSpideredErrorEvent(
                url,
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
                      net.javacoding.jspider.core.task.work.FetchRobotsTXTTaskImpl.class).
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
      ("H4sIAAAAAAAAALVYfWwcxRWf+/DZZx9x7DiJwXZsB9NiEd/Zjn1OclXL4Y/m" +
       "kkt8+BxCDqNjvTtn\nb7y3u+zOnS8uRK0KJEUqEuKjIAWiotJIFWqrRtA/Wj" +
       "WNgH5Hav0H0FagVkGIqg2iqiqilip9M7Pn\n3ds7J5WSWtq98cx78968j997" +
       "s69cQnWmgTpFM0yO6dgMj6dTgmFiaVwRTHMWprLim3XB1Jn9quZF\nniTyyh" +
       "JBzUnRjEgCESKyFElMxEoG6tE15diCohFrn6pd9tz66fJvTuzr8KHmDGqW1T" +
       "QRiCyOayrB\nJZJBoTzOz2PDjEsSljKoRcVYSmNDFhR5BQg1NYNaTXlBFUjB" +
       "wOYMNjWlSAlbzYKODSazPJlEIVFT\nTWIURKIZJkEbk0eFohApEFmJJGWTxJ" +
       "IokJOxIpkPouPIl0R1OUVYAMItyfIpImzHyBSdB/JGGdQ0\ncoKIyyz+JVkF" +
       "S3S7OdZO3LcfCIC1Po/JorYmyq8KMIFauUqKoC5E0sSQ1QUgrdMKIIWgW9bd" +
       "FIga\ndEFcEhZwlqB2N12KLwFVkJmFshC02U3GdgKf3eLymcNb04HQfx5Pfd" +
       "LDfO6XsKhQ/euBaZuLaQbn\nsIFVEXPGy4Xw04kjhU4vQkC82UXMaeK3/fBQ" +
       "8sNz3ZymowbN9PxRLJKs+Gm0s2s1/n7QR9Vo0DVT\npqFQcXLm1ZS1EivpEM" +
       "1b1naki+Hy4k9nfnbky9/Bf/WihgQKiJpSyKsJFMSqNG6N62GclFXMZ6dz\n" +
       "OROTBPIrbCqgsf/BHDlZwdQcARjrAllk45KOEKqHxwOPgvhfK32BulOYiIsz" +
       "2rxGzNl7Z2cFcymR\n15WwTtDnVUzmaCyImgRRMHfU1GUJG3OiZuA5AoRzy5" +
       "qxNLfeBiUqu3nZ46FJ7E5BBeJ1r6bAdlnx\nzMVfPTS5/2snuUNpEFpaE/Q5" +
       "UCFsqxC2VAhTFcJUhTBVIVxbBeTxMOFbK21OnSjRXPvbD2Ibnxgw\nX/MiXw" +
       "YF5Xy+QIR5BUOOCoqiLWMpS1iQtjgSgsUhBHFoHuIZNMoqsBHLHzBy0UDb3X" +
       "FrZ3sCRgIE\n4+rxK7/9KLt8loYYDYk2ujtXDRy8xHUL9afv3/fAye0+SrTs" +
       "p74D0r5r754VP3r8wNm3fv3u7XZ+\nENRXlbbVnDTt3OqnDE3EEsCavf03/r" +
       "X346fqdr/qRX7IZUAzIkAMAjRsc8uoSL9YGcqosYCzKacZ\neUGhS2X8aSSL" +
       "hrZsz7AAuomNN4IBmuCpg6fDCuCt9EUXW+lrEw83ak/XGRhQXv5qYPDtHze9" +
       "yYxS\nxtRmB/imMeEZ2mK7Y9bAGObffS711DOXTtzHfGE5g6CAXphXZLHE9N" +
       "vqAd9vqoEW4fa2p5/tP/V2\n2dmb7N3jhiEco74ufWW16/mfCy8AkkBGm/IK" +
       "ZgnrY5J8wNSOy1tOjh/g+MPR6qFTFx/r/9PvL1iI\n5qiUNtVfso8UXnv03K" +
       "qXmjgINUswD5ZTjNVMOvKwOgJuZCFPZ4LMno08i4eIxblrMLobFGoFSbTG\n" +
       "hmUpnNREQUlMfPN80+qTheg+rspNDoLERLbUfeHl/is9TAVLYsABmtb/9UXB" +
       "OGhnP/0ZJuiL14dC\ne4Z37tg5MjA6SlC9yCs681gbQf1XA5c0G487OCLcFn" +
       "tsW4wNsoWd9BW7IZqOjg1ERwjyFQylrGWI\nRQxV9dBM0qlI3KHIkK3IXTdE" +
       "kWh0YAxMBtFIcFmT29axl6DL4bwmYSWcBupyQtD3DjYeoInKghkx\nxbdbJB" +
       "Qv3YVhivY+ZbDJz3/pn6+/2NjDk4fydLJtvBCCHc6cqODKig+unNq5mj4s81" +
       "h0dwUu4pWf\nHHrx8gXyHkMGG8+otN5StYL3CA6o3fVWsSXw/dN5L6rPoI2s" +
       "sxNUco+gFChuZCCnzHFrMgk54Vyv\n7LN4usbW8LrTjaUOsW4ktSsmjCvT1w" +
       "bPDfBsgafNAs82F3h6EMu3NGPoY+/PrkFdUDc0AvphqeSI\nTSsMjziwYcyF" +
       "DdzUE3fuPv/+pe/Jn7D8b2TtbZxyWEoH2YwDlHyabtJGytHJWzv1TetmjImF" +
       "LGlk\nYoeGh6I3ACZ2j+0YHhkYHiOoYXZvIh2GU1IxGX7g49C5VZ+LaoPsdg" +
       "qiZQNLVurS8KRayDsXoZvx\nz0zGJ+iuX+C1ir4PVrioHZ7NFtPm2i7K0dch" +
       "Z2pajpAdjtjFFu6zbQS+uX4bjQ7uGBkeGImCIGYj\nqgGVc9TSho4ZuE+x8z" +
       "GtPmPlug0HnRYUQKx0rdflsxvKiXv/HnpMeON+nsatlV0cNe/o6Xdw/50h\n" +
       "sUbjGCSaPqDgIlZsrHFLO8BuP+W0aj7c/eep6JmHa4FNpxNsKtmy4vnvnvvj" +
       "6Dt/eAS0yKD6g9Pp\n8XhyEhTuvqq4rNhS7Ljbtyj/gmWFlfdVd7ZKplhltj" +
       "caGK6c6mxFzvdUNEw3w9NlBVRXrYbJ4aN1\nIPuaeP4wlFbdwLoAt18XMKcM" +
       "OQ8lvmjdwF7N/GNQ+uCOCe7RdufN3km4d/gK7tv04ccckitblhqA\n7hLy5L" +
       "ZvfXD24kwbjwp+F7616jrq5OH3YXaWkE7jsvdqEhj1G3f0vnJ85r15r2UDwC" +
       "t/UaMfIAJM\n30HETLVS5Yxeyxm9/ydnfB2cgUtYLPB0PIkAsrfUzmjaj7ZX" +
       "fRvhN3hx++oDt7+ut/yStflrt+wG\n6NpyBUVxlhzHOABhkJOZHg28AHFoen" +
       "b95qHyJgdWpD/sZM9w3ucJ6rkWL7DRHyfbKYI6rsIGHPTH\nyXEaDFWbA0xq" +
       "jZz0LxG0oZIe4Nb+x0n6MlQRIKXDb+tOzD7jwOyoXm60dv1vt967BBMfhgE2" +
       "yh6l\nsdvmqFNpHYsy7c5LL/3If/cTv/s3w5pyH0y/5kCJLcqA3ZG4KijHTN" +
       "av0DV6xRULBlzfCANly8FN\nJt+Rf73pcFboNVl9s0dSkzWK9NANK9KwrZ8W" +
       "oOv9QABV/eZa1mIncNZuehbREvpfkBxOCJcUAAA=");
}
