package net.javacoding.jspider.core.util.html;

import java.net.URL;

import et.util.MyUtility;

public class RobotsTXTLine {

    final public static java.lang.String ALLOW = "allow:";
    final public static java.lang.String DISALLOW = "disallow:";
    final public static int ROBOTSTXT_RULE_ALLOW = 0;
    final public static int ROBOTSTXT_RULE_DISALLOW = 1;
    protected int type;
    protected java.lang.String resourceURI;
    
    RobotsTXTLine(java.lang.String resourceURI, int type) {
        super();
        this.type = type;
        this.resourceURI = resourceURI;
    }
    
    public boolean matches(java.net.URL url) {
        java.lang.String path = url.getPath();
        if (path.length() == 0 && resourceURI.equals("/")) {
            return true;
        } else {
            return url.getPath().startsWith(resourceURI);
        }
    }
    
    public int getType() { return type; }
    
    public java.lang.String getResourceURI() { return resourceURI; }
    
    public static net.javacoding.jspider.core.util.html.RobotsTXTLine parse(
      java.lang.String line) {
        if (line == null) {
            return null;
        } else {
            line = line.trim();
            java.lang.String lineLowerCase = line.toLowerCase();
            java.lang.String resourceURI = "";
            int type = 0;
            if (lineLowerCase.startsWith(DISALLOW)) {
                resourceURI = line.substring(DISALLOW.length()).trim();
                type = RobotsTXTLine.ROBOTSTXT_RULE_DISALLOW;
            } else
                      if (lineLowerCase.startsWith(ALLOW)) {
                          resourceURI = line.substring(ALLOW.length()).trim();
                          type = RobotsTXTLine.ROBOTSTXT_RULE_ALLOW;
                      } else {
                          return null;
                      }
            if (resourceURI.length() > 0) {
                return new net.javacoding.jspider.core.util.html.RobotsTXTLine(
                  resourceURI, type);
            } else {
                return null;
            }
        }
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwUxxWfO9vnT/AHDrixwcYYJS722Wf7/IGVNI5txMFh" +
       "O3d2ANfRZb03thf2\nbpfdOfugKS1qAiSVUkUh/RJJmigVUoWaqij0j7ahNE" +
       "mbtEVK/AekqYhoiWiqlihVVYHaVPS92d27\nvb3jQ1fV0u6Nd96b9+b93tfM" +
       "yaukSNdIg6h72X6V6t7h8ISg6TQ6LAu6PgmfIuJbRaUTJ7bHFTdx\nBYlbij" +
       "JSGRT1jqjAhA4p2hEYGUxqpElV5P3zssLMdbJW2bzhs6XfHdlWX0Aqp0mlFA" +
       "8zgUnisBJn\nNMmmSUWMxmappg9FozQ6TarjlEbDVJMEWToAhEp8mtTo0nxc" +
       "YAmN6iGqK/IiEtboCZVqXKb1MUgq\nRCWuMy0hMkXTGakK7hEWhY4Ek+SOoK" +
       "SzwSDxzElUjur7yEFSECRFc7IwD4Srg9YuOviKHVvwO5CX\nSaCmNieI1GIp" +
       "3CvFwRKNTo7Ujlu2AwGwFscoW1BSogrjAnwgNYZKshCf7wgzTYrPA2mRkgAp" +
       "jNx9\n00WBqEQVxL3CPI0wUuekmzCmgKqUmwVZGLnLScZXAszudmBmQ2vcU/" +
       "GfpyauNXHMC6NUlFH/YmBa\n52AK0Tmq0bhIDcbrCe+xwO5Eg5sQIL7LQWzQ" +
       "DG38yVTw4zONBk19Dprx2T1UZBHxs96GtctDH5UW\noBolqqJL6AoZO+eoTp" +
       "gzg0kVvHl1akWc9FqTvwj9avdXf0D/6iYlAeIRFTkRiwdIKY1Hh81xMYyD\n" +
       "UpwaX8fn5nTKAqRQ5p88Cv8fzDEnyRTN4YGxKrAFPk6qhJBieFzwDBPjrwRf" +
       "EC8hZVZh+uSuSVzd\nqzLij1M2gy4gKlEAf2aPrkpRqs2IikZnUOuZBRaTZx" +
       "x8SZRUueRyYcg6A04G79yqyLBKRDxx+TeP\njW5/8qgBH7qcqSMj3SDZm5bs" +
       "NSV7UbJhL5TszZBMXC4uc02mYRGpKAbU3348WPV0u37aTQqmSakU\niyWYMC" +
       "tTCERBlpUlGo0w7onVNq/nzgaeWjELTguKRGRYiAcJWHJRI81O50yHdABGAn" +
       "jc8sEb734S\nWTqFfoS41+Lqhmqg9V5Dt4rW8CPbHj3aXIBES4UIEJC23H71" +
       "iPjJUztOnf/txXvTQcBIS1ZsZnNi\nbDnVn9AUkUYhd6WX/9a/tn76bNHAa2" +
       "5SCAELKYsJYGuI/3VOGRkxNmjlKzQWcJbPKVpMkHHKSjJl\nbEFTltJfuN+s" +
       "4OMqMAAaoQie1aaXrsIXTtbga5XhZWhPxx54Nrz+NU/nhZ+Vv8WNYiXOSluG" +
       "DVNm\nhGF1Go5JjVL4fvHbE88+d/XIFzkWBhgkydVa4wLIV+XIBN662mPfbD" +
       "1+wcJ4VXrRIU0T9iPEyUPL\na7/za+F5yBIQrbp0gPJgdHMBbmCqo9aSo8M7" +
       "jNxiZKLHjl8+3Hrp9+fMbGWrgmmqv0QeT5x+4syy\nGy1bCvVI0MesgOL1EE" +
       "cuXiMAPe7p+KWUm7HMiNlOZnL29HX7QKEakIT10ytFvUFFFOTAyEtny5ef\n" +
       "SfRuM1RZYSMIjESSjee+33qjiatgSvTYEqL5f/GioI2lYx1/fIzcn1eq2ewb" +
       "aPP1t3f3MlIOBVdJ\naCKdCgU4WLVQUjkMGMheo3zBpurtVp7QpBjotmiWhd" +
       "em/9EZvbJpxNhdnb3dsBNu7bpBW1Z9/Cl3\nLoetc9Qeh5Bn1r1y5dTlUK0R" +
       "r0aB3pBVI+08RpHmEFWoSdjD+ltJ4NRvblp/8mDow1ljJzWZGXE0\nnoj5X3" +
       "yftj5QIebIvQXQRjDi4fvyW46P70183IbxYEYF/t9skmA6dKb7Ldi/WLkkNv" +
       "ulf77xQlmT\nESTI08CX8ThRyeCKiPsOHO9eDu+UjL04resgPvD61AvXz7EP" +
       "DWxS6QqlrU9mK/iwYMuk/ecXqz0/\nejHmJsXTpIp3Z0KcPSzICUwL0xA7+r" +
       "D5MQi+b5/P7JWMsBxMpeMGJ7w2sc5EmcYCxplhms6NdfB4\n4Skzc2OZIze6" +
       "XBxAqGqb8cMYZ2zh73uMjFbAQKwUF0A7j5qYlSURBjrvdpMwNRQMju/k9GY9" +
       "35nO\nDV39jtxgQDDywMDZj66+Kl3j8V/GW9ch5DA3U8q/2JJSgaLq2CTZun" +
       "RzpZZxVTf8vZuRMi7W5+vs\nyz9N+LvbevztfkhwgTwaCy+3xj16ExO0ecqa" +
       "jP9RvV2WqQ5CP5dtEdyHiRCp4d67Mp2RMArtkxB5\nhaHRoRFct88obvgOZI" +
       "DeA0+5yVSeA/TSqKSncY/mwB3HYXxN4msKwC4ZCYSz8N5jw3uAT+y2QdHb\n" +
       "mT8UnRwKAHY8HygsXW1oWJ9Qyb227eD/s7e0ph+eFaY1V2RZM9UccLgCcLaa" +
       "p1rNn773yrVDR/rd\nWMWLFjH2AVZboRlL4Anx8Mnn1pYfu/R1nuuslffdER" +
       "y1ofEHxyfDsOFIaCo4Gknt5b6bbaMfnpXm\nNlZmbwMH6IY8h++/Ix3WOHSw" +
       "mzSnGih2DTxVphpVTjUIL/RfyZaOTqtqCoOESaMgOpXzbipnPTzV\nppzq3H" +
       "KewNehHE2B6d1HbZ1OZ5Z39wzk7d3d/W0+f3sX9CNVk1sDYa9NPkp5MlMlh4" +
       "cmc1iHw2JV\n2HQRbrDaUo2svdn5mDcCR3b9veKw8OYjbrNafwF2zhS1XaaL" +
       "VE4XbuciO/h1gFWjKnc2/nFL74kv\nOyt3IZ7w7JU7ky0inv3hmT/43//gcY" +
       "iWaVI8Nh4eHgqOQrw03lJcRKxerH+oYEF6m5cSs4hmXWJk\nMg1mls4yjbKE" +
       "Fp/MKKBNKT/C3LnBDB9i/ToPF/j6Rs7+x2Ue0Wwu9ZLNpbr4RBe+Xs7blbp6" +
       "2rr6\n2rt7oCFLaLLV0lbwTIOZcyoUvH1z9jwjxTGBiQtU5/MDqsFzP3yfVR" +
       "SZQgNjtno+wme+m2GjOjPe\niPV75zYimSenm+v4KugCidyC6r5cejTDs9HU" +
       "Y+P/SY/TjKwEPUK5U8bPbfj2pPF9Pf9U0dfm83F8\n12RKhdJmOC/PDE5rQK" +
       "tAuuBpNa3Rmssa2YnEbcvvd+rSb9u23Jve8jt5b7nH19bd347pld9W8f3d\n" +
       "HpdfQpOl4kWtXbd3bbr507q9x8iDeegG7T2o19vX1tPV3tv3eUYG8ulNuJLc" +
       "/gQK2YqMSbwVqMu6\nfTbuSMXm5UfvfUOtfoffsaTuMUvg7DyXkGX7gcA29q" +
       "ganZO4MUqM44FhmQuMbLwj7QEF/OHGO2/w\nfsBI0+14gQ1/7GwXGam/BRtw" +
       "4I+d4xIjq3NzQDIwR3b6yxCbmfRQr9P/2EmvQMIEUhz+Wc1xE2Ac\nzrBy1t" +
       "o69rBKRQlvOJIv/7Twoaff+zcvPcWicfOPt91wTFmUdIl1DMGpab/Oz4I4h7" +
       "eDYkLTaJzx\n0mvCU64bKxq32/X2U05KVsvk7onR7INOT///2H/4/GBy7D/y" +
       "vEmF08znctmG62vmHX5mQc0FU9Z/\nAa5DXHGlGQAA");
}
