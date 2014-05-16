package net.javacoding.jspider.api.event.site;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;

public class RobotsTXTMissingEvent
extends net.javacoding.jspider.api.event.site.SiteRelatedEvent
{

    
    public RobotsTXTMissingEvent(net.javacoding.jspider.api.model.Site site) {
        super(site);
    }
    
    public java.lang.String getComment() {
        return "robots.txt is missing for site " + site;
    }
    
    public net.javacoding.jspider.api.model.Site getSite() { return site; }
    
    public void accept(net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.visit(this);
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYe2wURRif6+P6hNKHUmmhBeqj2t61V9qAjdGmlHBwpWev" +
       "KNSac2937ljY2113\nZ6+HImJAQGNQ4jtBjUZDYox/SMQ/NEGC+DbR/uEzGg" +
       "3GaHxEY4xGMfjNzG5373qlmsZLdm9u5nvN\n9/h9M/fcj6jUNFCzaAbITh2b" +
       "gcFYVDBMLA0qgmmOwVRcPF1aET26UdWKkC+CimSJoJqIaAYlgQhB\nWQqG1/" +
       "ZnDdSqa8rOlKIRW84MKVeuPDv57oENTcWoZhzVyGqMCEQWBzWV4CwZR9VpnE" +
       "5gwxyQJCyN\no1oVYymGDVlQ5FuAUFPHUZ0pp1SBWAY2R7GpKRlKWGdaOjaY" +
       "TmcygqpFTTWJYYlEM0yCFkW2Cxkh\naBFZCUZkk/RHkD8pY0Uyb0a7UXEElS" +
       "YVIQWEF0acXQSZxOA6Og/klTKYaSQFETssJTtkFTzRks8x\nveO2jUAArGVp" +
       "TLZp06pKVAEmUB03SRHUVDBGDFlNAWmpZoEWgpbMKhSIynVB3CGkcJygxny6" +
       "KF8C\nqgrmFspC0AX5ZEwSxGxJXsw80RrxV/99d/T3VhbzEgmLCrW/DJiW5T" +
       "GN4iQ2sCpizviHFXggvNVq\nLkIIiC/II+Y0Axe/tDny7YkWTtNUgGYksR2L" +
       "JC6e7WteOjXwdUUxNaNc10yZpkLOzllUo/ZKf1aH\nbL5wWiJdDDiLr46+vn" +
       "XPs/j7IlQeRn5RU6y0GkYVWJUG7XEZjCOyivnsSDJpYhJGJQqb8mvsN7gj\n" +
       "KSuYusMPY10g29g4qyOEyuDxwdOK+GchfRG0eFRLaMQc2zI2LJsmBHsog1US" +
       "0Am6SsVkgqaCqEkw\nP7Hd1GUJGxOCLk9gSjQBtuOJWfizVHPNpM9HSzi/AB" +
       "XI1vWaAtLi4tEzb+8a2njXQR5OmoK2zQT1\ngwUB14KAbUEALAgwCwLUgkBB" +
       "C5DPx3QvznU4jaBEC+2HF/oXHeo0jxeh4nFUIafTFhESCoYCFRRF\nm8RSnL" +
       "AMrfVUA0tCyODqBCQzKIorIIgVD3g4Y6AV+UnrlnoYRgJk4tTuc+//FJ88Rv" +
       "OL5kMDlc5N\ng+ju4LZVt8du3HDTwRXFlGiyhAYOSNvmlh4Xf7p7+NiH73x+" +
       "mVscBLXNqNmZnLTm8s2PGpqIJcA0\nV/zDf67/+f7SNS8WoRIoZIAyIkACAi" +
       "4sy9eRU3v9Do5RZwFnVVIz0oJClxzwqSTbDG3SnWH5s4CN\nF4EDquAphafO" +
       "zl46h+hiHX3V82yj/szbA0PJP/b6uz56peo0c4oDqDUe5I1hwsuz1g3HmIEx" +
       "zH/+\nSPT+B388cAOLhR0Mgvy6lVBkMcvsW+yD2NcXgIpAY8MDD7Uf+cgJdr" +
       "0rfcAwhJ001tk7ppY++obw\nGMAIlLMp34JZtfqmw96IHZFDg8McfDhU7Tpy" +
       "Zn/7l5+8Z8OZp026VN/F91nH7zwxVURdXAENSzA3\nORXGGiYd+VgTgTCylK" +
       "czFcyflbyIu4nNuSrUGwKD6kATbbABWQpENFFQwmufPFk1ddjq28BNWeAh\n" +
       "CK+NZ1vee6b9XCszwdbo9yCm/bssIxib3OKnXyGC1s0Lg67s7uvo6elcBYJK" +
       "KB2LVgNBF58HV9Ka\nhJVADKid4NJ3Bxt30qRjgUHMMytsElr7+Ri3jjZxp3" +
       "DSiVt/O/V4ZStPBMrT7BFziS3FVeSsgreX\nztYIWRM/sOWX6v3Cazdyx9fl" +
       "Yt2QaqV7n/gYt19TLRZA1wqi6Z0KeFFxd5GvbZgdEJxt1Fzf8tW6\nvqO35W" +
       "+jmGK8N01z2eLiyedPfNb78af7wIpxVLZpJDY4EBkCg1vOqy4u1maari3eJr" +
       "/JcsdGsxnH\nmlymfu82IbENDKcydSwnsVtzYGUZPA02rDQUghVPjGZJhjkz" +
       "ZZigyhQmg1o6DZnJSIK8usY81dXD\nFnroa/O8cz/U1dHd3dnTRVC9q/lSs5" +
       "U7xCmFRQySaHcL8LMeYisbcjy0BJ5G20ON/5OHbiCoDOyM\nOWVquyfhcc8q" +
       "1z0iQVfP4h4o4AldsVKyOgHgT0YsolskyiYoIoRCHb3dnX19lxO0gJ8hbK1U" +
       "7OpC\nu++Ap9neffN/272D4p4N7fBsqNfdkDL/eK/uCAHW9YAfMzJQwvXCjn" +
       "HnnMcoJuM6zjV3qFLQ/wRR\nxDqBum/y1n3UkNMA6hn7wP3i+K9d0jdXrOXo" +
       "1Oi9yHkJ14fO4bb6b39mGJXXpAqc6vOUHF729DfH\nzow2cITjV5+VM24fXh" +
       "5+/WFbqdYpxi4/nwZG/doVy5/bPfpFosh2wSB0lIxG75t+Zm8XysJlpmBo\n" +
       "aONvnHED5fckccXUTZed0mvfYuep6btMObTHpKUoHhzzYppfN3BSZnaU82MS" +
       "T6095+9s7onZ2w5v\n57x7CWqdi5egUvbt5dsPV8LZ+QgqhreX/i64yRamh7" +
       "y1R176ewhamEsPSOr+8JLeC9qAlA7v070l\nd9hTct26UxV9/+5yQaFhFAOQ" +
       "YImFk+ZLg+eAE9OxKNMzUPapl0uuPfTBX6xXlYn8zwN6YRbNICvI\n4IAqKD" +
       "tN2bT/WKAXCdEy4JBMWFO3o1tlcon8gtzk/TtjWlfb2NboEM/gVeAPtrnu7t" +
       "Vd8z8xhdZ0\nhEKdoT5IkbH14dg8L2G7DXRRIV8x+21IpUd6qPKFbiOi5xbv" +
       "om4b8w/3fUcVERIAAA==");
}
