package net.javacoding.jspider.core.util;

public class StringUtil {

    
    public static java.lang.String replace(java.lang.String string,
                                           java.lang.String pattern,
                                           java.lang.String replacement) {
        java.lang.String replaced = null;
        if (string == null) {
            replaced = null;
        } else
                  if (pattern == null || pattern.length() == 0) {
                      replaced = string;
                  } else {
                      java.lang.StringBuffer sb = new java.lang.StringBuffer();
                      int lastIndex = 0;
                      int index = string.indexOf(pattern);
                      while (index >= 0) {
                          sb.append(string.substring(lastIndex, index));
                          sb.append(replacement);
                          lastIndex = index + pattern.length();
                          index = string.indexOf(pattern, lastIndex);
                      }
                      sb.append(string.substring(lastIndex));
                      replaced = sb.toString();
                  }
        return replaced;
    }
    
    public static java.lang.String replace(java.lang.String string,
                                           java.lang.String pattern,
                                           java.lang.String replacement,
                                           int start) {
        java.lang.String begin = string.substring(0, start);
        java.lang.String end = string.substring(start);
        return begin + StringUtil.replace(end, pattern, replacement);
    }
    
    public StringUtil() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJ1XbWwURRie3l2vHxz2g6+GFlqgKrW9K7S9o6V/aEqRwrXU" +
       "HqCUkmNvd64s7O2u\nu3PtgUg0Il8/MAgoRtSYaEgM8YcE/GOCBPCbxPSHoA" +
       "ajwRCMQjDGSAwG35nZ626vR5v2kt2dm3nf\ned7vd+b0bZRrGqhCNANkp47N" +
       "QHukRzBMLLUrgmmuh6moeDm3oOfUWlVzoZwwcskSQUVh0ayXBCLU\ny1J958" +
       "rWlIGqdE3ZOaBoxNpnzC7LF90f+mb/mnI3KupDRbIaIQKRxXZNJThF+pAvgR" +
       "MxbJhtkoSl\nPlSiYixFsCELirwLCDW1D5Wa8oAqkKSBzV5sasogJSw1kzo2" +
       "GGZ6Mox8oqaaxEiKRDNMgorD24VB\noT5JZKU+LJukNYy8cRkrkvks2oPcYZ" +
       "QbV4QBIJwdTmtRz3asX0XngbxQBjGNuCDiNItnh6yCJSoz\nOUY0rl4LBMCa" +
       "l8BkmzYC5VEFmEClXCRFUAfqI8SQ1QEgzdWSgELQ3IduCkT5uiDuEAZwlKCy" +
       "TLoe\nvgRUBcwslIWgWZlkbCfw2dwMnzm8tc7r++9Qzz9VzOceCYsKlT8PmO" +
       "ZnMPXiODawKmLOeC8ZONa5\nKVnhQgiIZ2UQc5q2Rz/eEL51vpLTlGehWRfb" +
       "jkUSFe+HKuYNt/1a4KZi5OuaKdNQGKU582qPtdKa\n0iGaZ4/sSBcD6cVPez" +
       "/b9MIH+HcXyu9EXlFTkgm1ExVgVWq3xnkwDssq5rPr4nETk07kUdiUV2P/\n" +
       "wRxxWcHUHF4Y6wLZxsYpHSGUB08OPC2I/x6hL4J83MUbqDQ6QX4Vk37qf1GT" +
       "YLp/u6nLEjb6Rc3A\n/VTkfid9im5fNJSTQ/M0M8sUCMnVmgLcUfHUja92d6" +
       "w9eID7jMaZJRhBtYAYsBEDFmKAInIj2Ygo\nJ4dhzRltReoWiWbPHx+1Fh/2" +
       "m+dcyN2HCuREIkmEmIIh6wRF0YawFCUs7EocIc4iC8LSF4MIBZyo\nAhuxjA" +
       "CzDRpoYWYk2vnbCSMBwmt4z4Nv70SHztCgoU6eSXfnooHLdnDZfDWRLWu2Hl" +
       "jopkRDHuoN\nIK2eePeoeOdQ15nvvr6+2I54gqrHJOJYTppImeL3GJqIJShU" +
       "9vav/7v67tHclrMu5IHshPpEBIgq\nSPb5mRijEqo1XZyosYBzWlwzEoJCl9" +
       "IVpZBsM7Qhe4bFy3T6KuGhQ42VISCra/de8i65+sm0y0zj\ndAksctTKCCY8" +
       "oUpsW683MIb56yd6jh6/vX8zM7RlaYK8ejKmyGKKCTInBxw7I0tyB8pmHnut" +
       "5uTV\ntCdn2Lu3GYawkzoy9eLwvDc+F96CxIcENOVdmOUXYkgoDUDftWxc51" +
       "ik/xdaJDS4MpNmFS39ac8k\nYs/9ffHtwiouDOWpcGIsYu/HLA3peHF6Zxt8" +
       "hMNA8x5WUlk72P/Mn759wqUtvPCVjk6wDjWZCL5z\nDdes8IlZUriAaLpfwY" +
       "NYsTXLROtirSatWtHTlb+sCp16PlM1Fy0kOM3T0d41mi0qXvjw/I/Baz/s\n" +
       "BSn6UF73ukh7W7gDBK4cFy4qlgyWP+XeJn/hYo2Op9CYBjmaqdWpJsSygaG/" +
       "q9RgdKaA+bKKyV4M\nkpfCsxGeMqu8si9dLKWvGVa4j/Gbi/kNwtNkZ47s0e" +
       "NmpG6wTZnTNrwT8b61++SNfTU/f3/F6m2O\nM5NN9Vt0b/Lcy+eHmQ0K4PQi" +
       "mN22fnB6oqMcdqKA9Gel0ta0kBf7MLE4Q6GlQRCoFJDoaSsgS4Gw\nJgpK58" +
       "p3L0wbPpIMreGiTHcQdK6MpiqvvF/zoIqJYCF6He3T+p83KBjddoTRTxdBoU" +
       "n1puUNTXWN\nQX9TMzMunWf2nAlnLpbUtPhbrYUtrOEKbnAoGGIL3fS1cSrw" +
       "wSX+UBNBedCI4fDElIs4sfocWMts\nrM1TwQqF/M2ANc3AOm28CayyJhaZuB" +
       "61g4QWl1O4mEO4Jls4kaBlkxMuGKxraPQHm58gqHESvT5g\nycS0QEyAFaOy" +
       "LQZPk5VtTZPJNvp6MrtdPIzM47RDwrZDQ4NtB3XSTgo21DWG/E0tI/E4Jh4M" +
       "B1Sj\nDWVOBSq41B8KjhN7Qw4sh3tTU8EKLfM3B7PEHtSHcmfB6jHkBKT5oH" +
       "UeP9v31xLpZu1KXijKnPc8\nJ+Hqhge4esatu6zxZJStLIf+DJAj89+7eeZG" +
       "70zetvjNaNGYy4mTh9+OmJF8Om2cC8ZDYNSXahec\n3tP7U8xlpRT42A3XMv" +
       "A0Ezc4cRIOZE/CAw4vLbW9dHAqXlra7G+BYlhswTxuVvGOxhMMHF9oc9Cz\n" +
       "T9mYazO/3IkLh7cuvqiXfMnOiyMXsHwo4/GkojhaprN9enUDx2WmVD4/BnIN" +
       "XyGoaqKqQJCHfpj+\nhznbqwSVj8MGHPTj5DgOd+jsHGB6a+SkP0HQI6PpwU" +
       "L2Hyfpm+BuIKXDk3qWLsNbcEr/H01nCyDS\nEAAA");
}
