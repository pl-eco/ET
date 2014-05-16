package net.javacoding.jspider.api.event.engine;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.JSpiderEvent;

import et.util.MyUtility;

abstract public class EngineRelatedEvent
extends net.javacoding.jspider.api.event.JSpiderEvent
{

    
    public int getType() { return JSpiderEvent.EVENT_TYPE_ENGINE; }
    
    public void accept(net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.visit(this);
    }
    
    public java.lang.String toString() {
        return super.toString() + " " + this.getComment();
    }
    
    public EngineRelatedEvent() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1XfWwURRSfu16vn1BaClRaaIEqNNC7UloC1D9s2ms4OODo" +
       "AUotHtvdubKwt7vu\nzl2PD/GLL1ExBBRNUKPRkBjiHxLwD02QAH6TaP8Q1G" +
       "A0GIJRCMYYiWLwzcxub3t3UJJ6ye3Ozryv\nee/33rw5ehXlmwaqEU0f2axj" +
       "09cRCQuGiaUORTDNVTAVFc/mF4WPLFU1N3KFkFuWCCoLiaZfEojg\nlyV/sL" +
       "MtZaA6XVM29ysaseRkSVk04+bAl7uXVOehsh5UJqsRIhBZ7NBUglOkB5XGcb" +
       "wPG2a7JGGp\nB5WrGEsRbMiCIm8BQk3tQRWm3K8KJGFgsxubmpKkhBVmQscG" +
       "02lPhlCpqKkmMRIi0QyToHGhjUJS\n8CeIrPhDsknaQsgbk7EimY+i7SgvhP" +
       "JjitAPhBND9i78TKK/i84DebEMZhoxQcQ2i2eTrIInajM5\nhnZcvxQIgLUg" +
       "jskGbUiVRxVgAlVwkxRB7fdHiCGr/UCaryVAC0GTbysUiAp1Qdwk9OMoQVWZ" +
       "dGG+\nBFRFzC2UhaAJmWRMEsRsckbMHNFa4S39d2/4rzoWc4+ERYXaXwBMUz" +
       "OYunEMG1gVMWe8kfAdDK5N\n1LgRAuIJGcScpv3e91eHrpys5TTVOWhW9G3E" +
       "IomKN+fXTBls/7koj5pRqGumTKEwbOcsqmFrpS2l\nA5onDkmkiz578aPuj9" +
       "c+8Q7+1Y0Kg8grakoirgZREValDmtcAOOQrGI+uyIWMzEJIo/Cprwa+wZ3\n" +
       "xGQFU3d4YawLZAMbp3SE0Dj4u+BfjfhvLH0QVBlQ+0FGN1YEgqVAEqvEpxN0" +
       "v4pJL8WBqEmAgN6N\npi5L2OgVdLkXU6JezPh6c7GnqNayAZeLpm9m8imA1M" +
       "WaAsKi4pFLn28LLH1mDw8lhZ9lL0GLwABf\n2gCfZYAPDPAxA3zcAF+2Acjl" +
       "YqonDfc1DZ5Ec+y399rG7Ws0T7hRXg8qkuPxBBH6FAy5KSiKNoCl\nKGHgLH" +
       "ckAsMfgLe0D3AM9kQVEMTyBpybNND0TLymszwIIwFAOLj91lfXogPHKLQoFC" +
       "qpdG4aBHYT\nt620IbJuyfo90/Mo0YCHxgxI60eWHhWv7V127JsvLs5K5wVB" +
       "9Vnpms1J0y3T/LChiViCcpYWf+jv\nxdcP5C887kYeyGGoYkQAv0NJmJqpY1" +
       "jatdkljDoLOEtimhEXFLpk151issHQBtIzDD5j6KOcI4k6\nK8NAVv1uPO1t" +
       "Ov9hyVm2Y7tQljkqagQTnnblaV+vMjCG+Ysvhw+8eHX3w8zRlqcJ8uqJPkUW" +
       "U8yQ\nSS4I7PgcJcBXVXnwpYbD5+1Ijk9LbzcMYTMNZOrJwSmvfCK8CuUB0t" +
       "SUt2CWhYhpQrYC+pzNxnMc\ni/R7ukVCwZWZQ130gLAjE+/b+ufp14rruDGU" +
       "p8apYwZ73sd36CaoUOgDAAgiA+8sW0najiFmA025\nXQ1m58fuh34v3SWcWc" +
       "crZcXwXAuoiXjr6xdwwwOlYo7kLiKa3qhAGivpTWZqW8bOJnuXZQ/W/tQ1\n" +
       "/8hjmbvMoyUG2zyBjmXD2aLiqXdPft964bsdYEUPKli+ItLRHgqAwbV3VBcV" +
       "y5PVK/M2yJ+62cnI\nsynrRB3O1ObcJsDawNAQqNRhdKaIhbWO2U5rcQn8q6" +
       "y6jOw3Xaygj/EW8rNC6HLG7Tb4GRFcnQQV\n9GPCUg5OOaf/woYchyMpaZ2Z" +
       "x3v+aJIuz+7kUa5y9mJOwsXNt3D9+CvXWayLoDESzOVDAc8+mDOU\n7J/61u" +
       "Vjl7orOVJ49zIjq4Fw8vAOhu2lVKdYnXYnDYz6zOxpR7d3/9DntnywiKA8aJ" +
       "0g55m5rYh5\nqn1YfKjfKq34VOaKD3105XS3a6h4Vzndy7sHvu1thy/tavjx" +
       "23NWP+LwbZrql+iOxImdJwcZDDMc\nyzpeOnKxLhCKMTu40mAr5idxL7E45y" +
       "5c2AIGVYAm2iH7ZMkX0kRBCXa+capkcH9i/hJuyhgHQbAz\nmqo993bDrTpm" +
       "gqXR62h5rO+CpGCkY67T1zqCAqPpIxY1N81pntfYMg/gmpRBG7TMVG4lQY0j" +
       "tgdM\nxhrONXJGrKE4EEWsE7a8TOcs3QR5khq9V3CUNOVCSY2Vych+3z1K7j" +
       "pjofoUEo2344ygh8fWdMS2\nlS08Qh9k1J5vmTN3bmPzAuiCbLUzzTpe0ewY" +
       "jGPHHm2PfJwCpeD2kC2OHpFVWXcwflMQpw+un3Va\nL/+MtRVD3Xwh4CuWUB" +
       "RHOXWWVq9u4JjMHFDIuwXujW0EzbzLvhEiygdsN1s5/+ME1Y3ET1A+ezv5\n" +
       "noKL0e35oNDA00m/E+5zuekB6dbISb+HoLHD6QkqTn84SZ8FbUBKh8/pTqQ8" +
       "70DKPNpROZI8omNR\npnUg9eYHnpX7vv6H5XqByG/A9NYHl2qWgf52VVA2m7" +
       "Jp3Y5pSywmDGj3CGsPrACVmFwiv+VVO+/k\nQ7rqV60NB3gNj9q2zW9Z2Dxq" +
       "6LbOmdva2NwEgYqsDge6R3eZ2G6ge3J5illvJT2qYGVzbDofaP/j\nXNRtY+" +
       "6+fi2JsBlmBK8PLzi8tOB/8FJLU2MLeMmzanEwMkonUfMOWaL+Ay0AuH24EQ" + "AA");
}
