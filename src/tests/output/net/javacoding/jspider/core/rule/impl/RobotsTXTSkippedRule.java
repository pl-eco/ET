package net.javacoding.jspider.core.rule.impl;

import net.javacoding.jspider.api.model.Decision;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.DecisionInternal;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class RobotsTXTSkippedRule
extends net.javacoding.jspider.core.rule.impl.BaseRuleImpl
{

    
    public net.javacoding.jspider.api.model.Decision apply(
      net.javacoding.jspider.core.SpiderContext context,
      net.javacoding.jspider.api.model.Site currentSite, java.net.URL url) {
        return new net.javacoding.jspider.core.model.DecisionInternal(
          Decision.RULE_ACCEPT,
          ("robots.txt was skipped for site - so all resources are accep" +
           "ted"));
    }
    
    public RobotsTXTSkippedRule() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1XXWwUVRS+22233XaxtBRoaKGbAkojnYXSn0B9sG6LbLvQ" +
       "2i0RaskynbnbDr07\nM87cabf8RSMC8mBiwL8ENT4YEmN8kIgvJkgQ/0lMHw" +
       "Q1JBp80ChEH4zEYPDcOzud2e2WmkiTnblz\n7zn3fOec75x7+84NVGIaqF4y" +
       "BTqtY1OIJgZEw8RylIimOQRTSelSSXDgTJ+qFSFfHBUpMkWVccmM\nyCIVI4" +
       "ociXV3ZgwU1jUyPUY0mt1nzi5bVt+e+upYb50fVQ6jSkVNUJEqUlRTKc7QYR" +
       "RK4/QoNswu\nWcbyMKpSMZYT2FBEouwHQU0dRtWmMqaK1DKwOYhNjUwywWrT" +
       "0rHBbTqTcRSSNNWkhiVRzTApWhzf\nJ06KEYsqJBJXTNoZR4GUgolsPokOI3" +
       "8claSIOAaCy+KOFxG+Y2QrmwfxcgVgGilRwo5K8YSiQiQa\n8jVmPV7TBwKg" +
       "WprGdFybNVWsijCBqm1IRFTHIglqKOoYiJZoFlihaMW8m4JQmS5KE+IYTlJU" +
       "my83\nYC+BVJCHhalQtDRfjO8EOVuRlzNPtvoDoX9ODPwV5jkvlrFEGP5SUF" +
       "qVpzSIU9jAqoRtxVuWcCq2\n26ovQgiEl+YJ2zJdaz/YGf/5fIMtU1dApn90" +
       "H5ZoUrrdXr9ypuunoJ/BKNM1U2FUyPGcZ3Ugu9KZ\n0YHNy2Z3ZIuCs/jR4C" +
       "e7n3ob/1qEymIoIGnESqsxFMSqHM2OS2EcV1Rsz/anUiamMVRM+FRA498Q\n" +
       "jpRCMAtHAMa6SMf5OKMjhErh54NfHbL/FrEH8GpQG9WoObRrKDGh6DqWBy2C" +
       "BZ2ih1RMRxgTJE0G\nDozsM3VFxsaIpBl4xAChESWtk5HC6hlmt3LK52MFnF" +
       "9+BLi6TSOwWVI6c/2Lgz19zx23k8kImEVM\n0RYAILgAhCwAgQEQGACBARAK" +
       "AUA+Hze9PDfaLH0yq7Lf3utc/Hyzea4I+YdRUEmnLSqOEgzVKRKi\nTWE5ST" +
       "k9qzylwBkI9A2NApMBT5LARrxyILyTBmrMZ6xb5zEYiUDDmcN3vr6ZnDrLyM" +
       "XIUMN2t6FB\naidsbKGmxJ7evccb/UxoqphlDUTXLLx7Urp5YvvZb768ts6t" +
       "DIrWzCnYuZqs4PLhDxiahGVoaO72\nL/+97feTJZvfL0LFUMXQx6gI7IOmsC" +
       "rfRk7hdTpNjAULNCtSmpEWCVtyOk85HTe0KXeG02cRe1TZ\nTGLBygPI+9+t" +
       "ZwIbrnxYcYl77LTKSk9PTWBqF16VG+shA2OYv/bKwMkXbxx7ggc6G2mKAro1" +
       "ShQp\nw4Es90FilxRoAkJtzamXmk5fcTK5xN29yzDEaZbIzNMzK1/9VHwNGg" +
       "QUqqnsx7wOEbeEHAPs+SAf\nr/cssu/GrAgjV34NbWVHhJOZ9OiBPy++Xh62" +
       "wTCdeq+N1fx5f9ZDNl7n7Owan9Uw0Mr5Wi8/No7t\n+iN0VPx4j90gq3MLrE" +
       "e10m1vXMVND4ekAhUdpJreTPAkJq5n+da28yPJca3y8YYft7afOZTvGu8r\n" +
       "2NHpiW7PVUtKF949/33b1e+OAIphVLqjPxHtivcA4Ia7mktKVZN1j/nHlc+K" +
       "+IFol9CcgzRXqdPr\nJnDZwHAPUFnA2EyQ5zLMsS8G5BXw64Pf8mwb5m+2WM" +
       "0eS2y6s0drQYL4uft+cL/W6759KNlH2MHT\n1482/fDt5ewx57k+uVK/JI9Y" +
       "5549P8PdDMJFRjR3uC7ARYqNfPxyARXOu6HrTLnd3mM0q9natmkj\nAKoGS+" +
       "ziJSiyENckkcS637xQMfOC1d5rQ1nkEYh1JzMNl99quhPmELIWA56TNPtdOi" +
       "kaO1wSsVcv\nRT3/53Da0rJpfUt7c2sHRaWSfcnj8a2hqOluZ06Cj6MejUft" +
       "SAx6ItHCF/rYI3EPcLZubm5vo6hC\nsgxoqDShUOxgXTsPVlFXhLQmYyLMSm" +
       "dx7vbg3OTiHL4HONs7mjtaKfJbBnHwhXhPZCB3DsYXbndR\nikpEXSfTXsSS" +
       "B/EGF7F8DxBv3NjcAZG9j9t8wAzbZbsQEdzgdmNJMYGnKENRTSEz7FyonfOv" +
       "h31B\nlhpn9q67qFd9zs/S2UtsGfA/ZRHiaSfe1hLQDZxSeGDK7CPSjhKZnw" +
       "y5lyWKitmLOzlh62oUhRfS\nBTX28qrBqV93FzXQYC+vhgV3zcIaUIbZkVce" +
       "wnpfrjxF5e6HV/QAEA9E2fCg7qXPIZc+LZt1J7ct\n/+1i+YhoYpbHGHxk9H" +
       "8BFsTWto4OAAA=");
}
