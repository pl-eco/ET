package net.javacoding.jspider.core.impl;

import net.javacoding.jspider.Constants;

import et.util.MyUtility;
import java.io.File;

import et.util.MyUtility;

public class CLI {

    
    public static void printSignature() {
        System.err.println(Constants.VERSIONSTRING);
        System.err.println("Build: " + Constants.BUILDTIMESTAMP);
        System.err.println("Started from " + new java.io.File("."));
    }
    
    public CLI() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAIVWW2wUVRj+99Jtt6yWXoCGFlpKJTTIbmMCCfbFZilhYaFr" +
       "FwMsxWV25mw7cHZm\nnDm7XVCJRiPIg4kBRRMvLyYkhvhgg76YoAG8P5g+CN" +
       "FgYjCERCEYYyQGg/85M7s7O1vKJjNz9pz/\ndv7/+y9nb0KTZUKvbEXZYYNY" +
       "0Xg6JZkWUeJUsqxduJWVLzWFU2e2a7offEnwqwqDtqRsxRSJSTFV\niSU2j5" +
       "RN6Dd0eniK6syR0yDl8dV3Z74/tq0nAG0ZaFO1NJOYKsd1jZEyy0CkQAo5Yl" +
       "qjikKUDLRr\nhChpYqoSVY8goa5loMNSpzSJFU1iTRBLpyVO2GEVDWIKnZXN" +
       "JERkXbOYWZSZbloMFicPSiUpVmQq\njSVVi40kIZRXCVWsZ+AoBJLQlKfSFB" +
       "IuTVZuERMSY1v4PpK3qmimmZdkUmEJHlI19ESfl6N648Ht\nSICszQXCpvWq" +
       "qqAm4QZ02CZRSZuKpZmpalNI2qQXUQuD5fcVikQthiQfkqZIlkG3ly5lHyFV" +
       "WLiF\nszBY4iUTkjBmyz0xc0VrPBT570Tqn34R86BCZMrtb0amlR6mCZInJt" +
       "FkYjPeKUZPJfYWe/0ASLzE\nQ2zTjD7y6VPJG+f7bJqeeWjGcweJzLLy3Y29" +
       "K+ZGfwsHuBkthm6pHAp1NxdRTTknI2UD0by0KpEf\nRiuHn098ufeFD8nvfm" +
       "hJQEjWabGgJSBMNCXurJtxnVQ1Yu+O5/MWYQkIUrEV0sV/dEdepYS7I4Rr\n" +
       "Q2LTYl02AKAZHx8+HWD/WvmLQVM8mYgaDNZohE3ywMu6giGfPGgZqkLMSVk3" +
       "yaRaMOikICxzgW0z\nPh/PTG9eUQThVp0iW1Y+c+3b58a2v3rcjhJHlmMKg0" +
       "FUFa2pijqqolxVlKuKoirw+YSSZfUO4xFQ\neKL88fHI4tfWW5/4IZCBsFoo" +
       "FJmUowQTTKJUnyFKlgmEtbvQLECECIzkEIyoOUtRkAA/eqhkwoAX\ndLVUTe" +
       "BKQiTNHb33w63szCzHB49nF5dum4bROWTbFhlK79924PhAgBPNBLnjkXTwwd" +
       "Kz8q0TO2Z/\n/O7q2hq40V8NOdfIyXPGa37K1GWiYE2qiT/979bbJ5s2nfND" +
       "EBMRSxGTEECY1yu9OupyZ6RSh7iz\nkHNRXjcLEuVHleLRyqZNfaa2I4DyEH" +
       "+125jhzvIYKErYnZdCw5c/W3RJ3LhS7dpcZTFNmJ077TVf\n7zIJwf2rb6VO" +
       "vnHz2D7haMfTDEJGMUdVuSwMWebDwHbOk8fR7q5Tbw69c7kSyc6a9FHTlA7z" +
       "QJZf\nnFvx9lfSu5jjmGuWeoSIVAKhCSoK+HudWD/qOuT/BxwSDi5vtmzhVb" +
       "4SmULu2b8vvNfabxvDeXrd\nOlaL9xrnhny9tiK5przKYcKK+1VPUfmP7fkz" +
       "8op0cb9d4zrqE2xMKxY2vH+FDD0RkefJ3TDTjfWU\nlAit3cyrbYfoKpWrte" +
       "3u+3XLxjPPe68mKgip8IzFd9SzZeUvPjr/84YrP72MVmSgeed4Oj6aHEOD\n" +
       "+xZUl5XbSz1PBqbVr/2ip9kp1NAL65lG3NdELJsEW7nGHcZ3wiKW/cL2xU4F" +
       "HcIn4lRS8eWHHfzV\n6cC9IW5+ETeEpyXGi4XR80BoxRk8bGBzZunq5IH9yu" +
       "3PlKkWsLmUnO53LvPXsHJ93WY76t3uqcpN\nuPWxe2Sw88ZtEfswjjiStbMK" +
       "gMYW61Hy+soPrs9em+iykWPPIasbRgE3jz2LiCtFDI7dVQtpENQX\n1606e3" +
       "Til5zfccUmBsGSzoe/kLB3GMoMAthDeFp3Nwx/9ogiD8wdWHvBaP9GlMLqGN" +
       "GCvTxfpNSF\nBjcyQoZJ8qrQ2mJXOLsj7mHQ/6Cuhlbyj4jmbpttH4OeBdiQ" +
       "g3/cHE/jJDg/B4NmZ+WmlxAm9fQM\nWmt/3KTovwCS8iWxE7UL51NRFXn3jN" +
       "qDT9n4H7ybMpuYCwAA");
}
