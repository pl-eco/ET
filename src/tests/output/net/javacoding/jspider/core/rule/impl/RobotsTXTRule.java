package net.javacoding.jspider.core.rule.impl;

import net.javacoding.jspider.api.model.Decision;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.DecisionInternal;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.SiteInternal;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.URLUtil;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.html.RobotsTXTLine;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.html.RobotsTXTLineSet;

import et.util.MyUtility;
import java.io.IOException;

import et.util.MyUtility;
import java.io.InputStream;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class RobotsTXTRule
extends net.javacoding.jspider.core.rule.impl.BaseRuleImpl
{

    protected java.lang.String
      effectiveUserAgent;
    protected java.lang.String
      obeyedUserAgent;
    protected RobotsTXTLine[]
      forbiddenPaths;
    
    public RobotsTXTRule(java.lang.String userAgent,
                         java.io.InputStream is)
          throws java.io.IOException {
        super();
        net.javacoding.jspider.core.util.html.RobotsTXTLineSet lineSet =
          RobotsTXTLineSet.
            findLineSet(
            is,
            userAgent);
        this.
          effectiveUserAgent =
          userAgent;
        if (lineSet ==
              null) {
            this.
              obeyedUserAgent =
              null;
            forbiddenPaths =
              (new net.javacoding.jspider.core.util.html.RobotsTXTLine[0]);
        } else {
            this.
              obeyedUserAgent =
              lineSet.
                getUserAgent();
            forbiddenPaths =
              lineSet.
                getLines();
        }
    }
    
    public java.lang.String
      getObeyedUserAgent(
      ) {
        return obeyedUserAgent;
    }
    
    public net.javacoding.jspider.api.model.Decision
      apply(
      net.javacoding.jspider.core.SpiderContext context,
      net.javacoding.jspider.api.model.Site currentSite,
      java.net.URL url) {
        java.lang.String path =
          url.
            getPath();
        net.javacoding.jspider.api.model.Decision decision =
          new net.javacoding.jspider.core.model.DecisionInternal(
          );
        if (context.
              getStorage().
              getSiteDAO().
              find(
              URLUtil.
                getSiteURL(
                url)).
              getObeyRobotsTXT()) {
            for (int i =
                   0;
                 i <
                   forbiddenPaths.
                     length;
                 i++) {
                net.javacoding.jspider.core.util.html.RobotsTXTLine forbiddenPath =
                  forbiddenPaths[i];
                if (forbiddenPath.
                      matches(
                      url)) {
                    decision =
                      new net.javacoding.jspider.core.model.DecisionInternal(
                        Decision.
                          RULE_FORBIDDEN,
                        "access to \'" +
                        path +
                        "\' forbidden");
                    break;
                }
            }
        }
        return decision;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK0Ya2wUx3l857cNxsYBGpvYOCbBiu+M8d35wGoV1zbi8IEv" +
       "PvNyjI713pxZ2Nvd\n7M7ZZ5qiVKUhTaVIUZI2VWnSVq2QqqipgkJ+UJWgvP" +
       "qiav0j0FZJUxGhRA0pqKpAbSr6zezu7eze\nYVpTS7s33vm++d6veekKqjB0" +
       "1CoaQTKvYSM4lEwIuoHTQ7JgGBPwKSW+VVGTODmqqD5UFkc+KU1Q\nQ1w0et" +
       "ICEXqkdE9seCCvo3ZNlednZJVY5xSdsuXez+Z+c3x7ix81TKIGSUkSgUjikK" +
       "oQnCeTqD6L\ns9NYNwbTaZyeRI0Kxukk1iVBlo4AoKpMoiZDmlEEktOxMY4N" +
       "VZ6lgE1GTsM6o2l/jKN6UVUMoudE\nouoGQSvih4RZoSdHJLknLhlkII4qMx" +
       "KW08Yj6Cjyx1FFRhZmAHBV3Jaih53Ys5V+B/BaCdjUM4KI\nbZTyw5ICmmjz" +
       "YhQk7hwFAECtymJyUC2QKlcE+ICaTJZkQZnpSRJdUmYAtELNARWC7r7loQBU" +
       "rQni\nYWEGpwha44VLmFsAVcPUQlEIussLxk4Cm93tsRlnrbHK+n8/mbjezm" +
       "xensaiTPmvAqR7PEjjOIN1\nrIjYRLyRCz4b25dr9SEEwHd5gE2YwfWv7Yp/" +
       "dLbNhGkpATM2fQiLJCV+FmlduzD4YY2fslGtqYZE\nXcElObNqwtoZyGvgza" +
       "sKJ9LNoL35+vjb+x77Mf6rD1XHUKWoyrmsEkM1WEkPWesqWMclBZtfxzIZ\n" +
       "A5MYKpfZp0qV/Q/qyEgypuqohLUmkINsndcQQlXwlMGzH5l/rfQF8TKuTqvE" +
       "mNg7MZ6TcVAjKKxg\nMkVdQFTTYPypQ4YmpbE+Jao6ntIBaErKavKUBy9PKT" +
       "XMlZXRkPUGnAzeuU2V4ZSUePLSrx4dGf36\nE6b5qMtZPBLUB5SDDuWgRTlI" +
       "KQcp5SClHHRRRmVljOZqt2KppdI0oD55ZWDFUwHjtA/5J1GNlM3m\niDAtYw" +
       "hEQZbVOZxOEeaJjZzXM2cDT62fBqcFRlIyHMSCBDQ5q6MOr3M6IR2DlQAet3" +
       "D05u8+Tc2d\non5E7d5MTzdZAyseNnmr70ru337giQ4/BZorpwYC0M7bn54S" +
       "P31yx6l3f/3eBicICOosis1iTBpb\nXvYTuiriNOQu5/hv/XPb1WcqNr/qQ+" +
       "UQsJCyiACOBvF/j5eGK8YG7HxFlQWYdRlVzwoy3bKTTC05\nqKtzzhfmN8vY" +
       "egUooA6eCniilpcG6YtuNtHXStPLqD49MrBseOOrlRsv/KzuLaYUO3E2cBk2" +
       "iYkZ\nho2OOSZ0jOH7e88nnnnuyvGHmS0sYxBUqeWmZUnMM/5Wl4HtV5ZICc" +
       "E1zc9+s+vEBdvYK53TB3Vd\nmKe2zn9lYe233xG+C+kCwtaQjmAWlT5GyQdI" +
       "a7B95MjQDjPJmCnp0ROXHu/64A/nrbTFlUMH6uPU\nsdzpr51d8FEV10BhEo" +
       "yddmSxwkhXZaxYgBmZy9MvNUyftWbw9hILMxTu2wwMNQElWkiDUjoYV0VB\n" +
       "jg1//1zdwtO5yHaTlWUcQGw4lW87/6Oum+2MBYtiJZcZrf+rZgV9pxP09GcT" +
       "QV9YUs7ZEop0bwoH\nQpTznIH1wRmsEGaqZqiszAg0noNmFWMbPaasWxxZQx" +
       "vZRh99DdwJJ6G+QLifgOiGzYLpB5IajCla\njgAXWMjarkTf3WwdoK5mRT/H" +
       "4hDHYq9WfOTYSF7EGtUsA++wDqb5yZt/t9KGwg7u7PSX/vHGC7Xt\nprNSnF" +
       "ZG3A8mb+F90IWVEh85cqJvIblHMm3vLbUe4CM/3/XCjfPkfRaJTv6g1Nblix" +
       "ncLXCpLfru\nbGPlT1/M+lDVJFrB2iVBIbsFOUfjdBJ82BiyPsbBB/l9d/Ni" +
       "hsdAIT+2enMXR9abuZzCBGt3uDjJ\najk8G+Bps5JVmydZlSHm3wmG0Mne9x" +
       "dSS42mqwT4w+k8sI0zGVhLs3iXy48tX9jNhWbEE5qm5ocf\n3HzuwysvS9dZ" +
       "+NWyFnKQYlgy1LAvXE7wq5pBmxWuW7ZO6hzTjAFGNkRQLSPbG4r2gmt/fomx" +
       "Ee2O\nBvogSFdPbIslg8WiUlp7SirhKHRMxbJSDi2VoybmjsudYB9Rcll+E/" +
       "qKqj3jsYmJkZ2UTtSsIPQ9\n6jLkeng6LLyO0oYU6WscSoo6jedxuqSpMpyp" +
       "+tnGXk6LfRuXnGEike7ecIAe0MzU6OGBUpopZu0o\n/Q79ePn4yODwovIHLB" +
       "0g+7dYftWSfzmU9WkJpiElAS2mQcsxV5VYyaNF6djc6JUNrde/40O+RYpS\n" +
       "iWa/cEJKfMXfec13ZlUna0TKpwXDDETvlFQ8BLlmG2aZOpe4LYuIy9tzlrNn" +
       "tMieoaXXrmhfdygS\niPTZYeHWafDh/H5KbI4gv7XM2jVg0TaZdR0HSZZrk+" +
       "nYULLSjNJXzrbuY8VpykcgK0qKwCasLshT\nlTJWZoA9T6lI6FJWooFrGu3V" +
       "yb9vTF9+YNgsFWv4AZ4H3LbpJu5c+dFVs0i4/aNEifEQefqeH14+\ndWm82e" +
       "yAzZH33qKpk8cxx15m1XotDzKsW4wCg37zgXUvHR1/f9qUpMk9Y9BME37xIu" +
       "56sF4sMc34\nwSdBY0yuMP1K8gUr2G2fq6qz9DUkqwqmE4q912xX/MKVA2zm" +
       "i+wJRZW3yA7m/U5RPfeTs38KX/zj\nMeBzElXtHEsODcZHQKQ2jwq8eI2zLQ" +
       "/5D0q/YGXFqqNFFwtupAF39azVMcnpyoSrhrabnse0Ql/3\nleyKEJMNlW6Z" +
       "7E36//PgpyJVXInmz+wCUL4Qx9FouDiOe+80jiEvrywRx5TQ94oyJgtnlojz" +
       "nPTI\nEbDVllxHa291E8Ic9Pjea/WPC2/u91ma+AaISVQtIONZLDsdofcQt8" +
       "Ua9rT9ZWvk5Je9LaHpn8+5\nhrP74Bm08uZgqeHs/2DOl6EXmMFk7NZV9jTX" +
       "HIec/v21pVfXcHdvb6AvSlBLMeX7jXbTiVkBRSW0\nMgpP3NJK/H/Tit/qvj" +
       "npznLSRRzpXl+ydP0wJ0UCIWjhqkTzVtMOlK7FakmSrYc4DIvBtzkG+x0G\n" +
       "37kTBkObA5EwQXViTtdB50mJFKJ5/S2YFDQpmFXTWA4WoC0Gz3MMRh0Gf3sn" +
       "DEb6A/3QEftzumwz\nVs/SDOVu13j89n59BtKUoGnyPM/qBY7VsMPqxTthFV" +
       "y5H3S5nBEreO/tbO6ocxiLkgGTJc2ay1zn\n0+uNNUX36eatr9ixcGDDG1rj" +
       "L81mzb6ZrY6j6kxOlvmJiltXajrOSEwV1eZ8Zerlg1vb3X0fCM0t\n/WHS/d" +
       "nEvURQ++1wAY3+8GiXIfoXQQMM+sNjfEzQqtIYEGrWiof/BIzihoci5PzDg/" +
       "4NXA1A6fKq\nxjvMNa4jDRcuBjb9d3enX4QOmtoxBv/krcbdnq6SGpidXvPk" +
       "f3Cm/KGnfv8vVvTtjEHv/mFYnAXH\nID2D0BPOG2wQp3v0rtSKW1aeLNPWGe" +
       "aJ5l1/Cz9rFmh1TuxLjBSPm6GlD0pmQQ5FwFy0IC/xXhkm\nz8+V0g3jl58v" +
       "KecHLFr/Ad3q04ezGgAA");
}
