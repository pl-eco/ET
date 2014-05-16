package net.javacoding.jspider.core.throttle.impl;

import net.javacoding.jspider.core.throttle.Throttle;

import et.util.MyUtility;

public class DistributedLoadThrottleImpl
  implements net.javacoding.jspider.core.throttle.Throttle
{

    protected int milliseconds;
    protected long lastAllow;
    
    public DistributedLoadThrottleImpl(int milliseconds) {
        super();
        this.milliseconds = milliseconds;
        lastAllow = System.currentTimeMillis() - milliseconds;
    }
    
    public synchronized void throttle() {
        long thisTime = System.currentTimeMillis();
        long scheduledTime = lastAllow + milliseconds;
        if (scheduledTime > thisTime) {
            try {
                Thread.sleep(scheduledTime - thisTime);
            }
            catch (java.lang.InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        lastAllow = System.currentTimeMillis();
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1Xb2wURRSfu7Z3bSn0DwUqbWmBIjTQO6QUgX7Qpi1ycMDR" +
       "KyBnybHdnSsLe7vL\n7tz1ioh/QEA+kBjwX4KQGA2JIcZIwA8a0QD+J9F+AN" +
       "RANBiCUQnGGIli8M3M3t3eXil8oMlu53be\nm3nz3u/33ptjv6Mi00B1oukj" +
       "Qzo2fZ3hkGCYWOpUBNPshU9R8WxRSejoclVzI1cQuWWJoPKgaPol\ngQh+Wf" +
       "IHutpTBmrUNWVoQNGItU7eKoun3xr8es+y2gJUHkHlshomApHFTk0lOEUiqC" +
       "yO4/3YMDsk\nCUsRVKliLIWxIQuKvA0ENTWCqkx5QBVIwsBmDzY1JUkFq8yE" +
       "jg22Z/pjEJWJmmoSIyESzTAJqghu\nFpKCP0FkxR+UTdIeRJ6YjBXJ3Ip2oI" +
       "IgKoopwgAITgymT+FnK/qX0O8gXiqDmUZMEHFapXCLrIIn\nGpwamRM3LQcB" +
       "UPXGMdmkZbYqVAX4gKq4SYqgDvjDxJDVARAt0hKwC0GT77goCBXrgrhFGMBR" +
       "gmqc\nciE+BVIlzC1UhaAJTjG2EsRssiNmtmit8pT9ty/0dyOLeaGERYXa7w" +
       "WlKQ6lHhzDBlZFzBVvJnwH\nA+sTdW6EQHiCQ5jLdMx4f03w2qkGLlM7gsyq" +
       "/s1YJFHx1oK6+uGOn0sKqBnFumbKFAo5J2dRDVkz\n7Skd0DwxsyKd9KUnP+" +
       "75dP0zb+Nf3ag4gDyipiTiagCVYFXqtMZeGAdlFfOvq2IxE5MAKlTYJ4/G\n" +
       "foM7YrKCqTs8MNYFsomNUzpCyAuPC575iP+V0xdB9V2AOkPuh/BKQU2QejcZ" +
       "GiEKDsR1xacT9JiK\nSR8FhKhJAIW+zaYuS9joEzUD9xFLuE8G6b5RV0pRS8" +
       "oHXS5KaSchFUDvUk2BdaPi0Stfbu9e/sJe\nHl4KSesMBHWDLb6sLT7LFh+1" +
       "xZe2xUdt8Y1iC3K5mBWTckNBYytRCv72XnvF/hbzpBsVRFCJHI8n\niNCvYK" +
       "CuoCjaIJaihGG30sYTBk/Adlk/wBxMiyqwEKMV+D5poGlOOGeTQABGAmB0eM" +
       "ftb65HB49T\n5FGkVNPVuWkQ9y3ctrLm8IZlG/dOK6BCg4U0pCDadPfVo+L1" +
       "fSuOn//q0qwsbQhqymNzviZlo9P8\nkKGJWIJsl13+lX+W3jhQtOiEGxUCxS" +
       "HJEQGgCRljinOPHFa2pzMcdRZojolpRlxQ6FQ6LZXSyA5m\nvzAkjWXjCnDA" +
       "GHiK4GmwcF1HX3Syir7Gc9xRfzrOwPLnzZ2euRc+HHOWOSWdasttOTmMCSdu" +
       "ZTYc\nvQbG8P3Sq6EDL/2+5wkWCysYBHn0RL8iiylm3yQXxH78CEnEV1N98O" +
       "XmQxfSwR6fXb3DMIQhGuvU\ns8P1r30mvA4JBohuytsw47ErE/ZanF6yu3NF" +
       "yJDjkEqSVq47EflzrnR1dhfPYzX2GmoXXDrvNm4a\nf+0GO38JFDTBXJlhXH" +
       "5CdWzy4pQ3rx6/0lPNIcWrzvS8xG/X4ZWHxaRMT8EZpo62A5M+M3vqsR09\n" +
       "l/v5SapySdutJuJtRy7i5kfLxBESRgHURggJO1dbOiT0PYeNWyhUmDsRM2ma" +
       "JUIZ68xRS2hRTsM9\n3v/kX6cPlzby8FGdOraM2xmVHK2ouHXbodbh8DqZn8" +
       "XpXYfwto/WHL55jlzmsckwiu42NZVv4FrB\nRvaF55OVnnePxN3IG0EVrOUQ" +
       "VLJWUBIUuRFoGsxO62MQjc2Zz20AeLVrz2SMOmd4bds6uZyNBYyp\nNB2XOO" +
       "g7zqJulUXfKgd9XUingy6m0MTeMzNkK9EhrYN9WEoRaNNkBdIuhtPwlqaVU5" +
       "++H8nZrx6e\nCdZ+E0bebxl9LYEdILGTDpr32Qp+nUNkPoHSq6kDaXAtYFux" +
       "oz1oYSgLs7oMY2vs2OCu5UzafujK\n7uYfvztntSY2umalfonuSpx8/tSwmy" +
       "ZFB1dZ80tHLtYQAkyiuQ4v5QV4DbE0WxfMX8SRW01Qyz3V\n1XQNpbStv1N7" +
       "xii75/E/ynYLZza4LV61wa5E01sUnMRKlmLORVawbjSNpvJ1DT8tWXD0KSfH" +
       "WANh\n92OuWlT85J1TP7Rd/H4X8CaCvCtXhTs7gt3g1YZRt4uKlcna1QWb5M" +
       "+Zfy245/XQuUrtuSAvNTBc\nAdTeHM83ZqBXA89MeGZY0JsxYqXKw7mbjpsB" +
       "3+aQKkIMVKgE0ujJ7K6ZTiSoOB3YPGAnNXqR4sCe\ni4BZtaN0U7R61eRdsP" +
       "g1QJw2vHHWab3yC9YUZFr1YuiXYwlFsacH29ijGzgmMzOLebLg2IXK3HzP\n" +
       "DSAcg/5jZzK4fhL6nXvRd7rGUh8CP4yiDhvSf3aN7XBrG1mDIK81sss/TdC4" +
       "XHmCSrM/7KLPQW0D\nUTrcmaFxBWsiaNr28axBmVoNuYReh32y5AvrWIRba6" +
       "Ar9cYHhav3f/svg7pX5BddermDu3NShiuJ\nv0MVlCGTVQk6R1tbMWFA20YY" +
       "1a1QjTH5ivwyV2u/emf2aupdH+qmTeRYmyWBrmiq4dxbzbcbmQlW\n8vLYLl" +
       "LWb29SMFbaS3opg+VD81pbHyZo5X26nCxumztnYctCiGHv0kD4vt00dhjogZ" +
       "Hcz1yCsgUP\nnDMuGzva09gndcus/wEpDn1VEBEAAA==");
}
