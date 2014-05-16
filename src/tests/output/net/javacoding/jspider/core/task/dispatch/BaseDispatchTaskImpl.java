package net.javacoding.jspider.core.task.dispatch;

import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.DispatcherTask;

import et.util.MyUtility;

abstract public class BaseDispatchTaskImpl
  implements net.javacoding.jspider.core.task.DispatcherTask
{

    protected net.javacoding.jspider.core.SpiderContext
      context;
    protected boolean
      running;
    
    public BaseDispatchTaskImpl(net.javacoding.jspider.core.SpiderContext context) {
        super();
        this.
          context =
          context;
        running =
          true;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVXb2wbRRYfO4kTJ6b500ADSdu05EQjGjtNoSREQg1J2rh1" +
       "WxOnlIYgM94dp9uu\nd5fdWccNUIGAFviAhPgvlSIQqBJCAlHR+8DpehVwiD" +
       "+VIB/g7gPoTkWI010RJ4SogFPvzcyud702\n7Yda2t3x7Htv3rz3e795+8Y5" +
       "1GCZqEey4vSgQaz4eCaNTYvI4yq2rBmYykofNETTx7drehiFUiis\nyBS1pi" +
       "QrIWOKE4qcSE6MlkzUa+jqwXlVp46dKis3X/vbwqdHtnXXodZZ1KpoGYqpIo" +
       "3rGiUlOoti\nBVLIEdMak2Uiz6J2jRA5Q0wFq8oiCOraLOqwlHkNU9sk1jSx" +
       "dLXIBDss2yAmX9OdTKGYpGsWNW2J\n6qZFUVtqPy7ihE0VNZFSLDqaQpG8Ql" +
       "TZugcdQnUp1JBX8TwIXpVyd5HgFhNb2DyINyvgppnHEnFV\n6g8oGkRidVCj" +
       "vOO+7SAAqo0FQvfp5aXqNQwTqEO4pGJtPpGhpqLNg2iDbsMqFF3zu0ZBqMnA" +
       "0gE8\nT7IUdQXl0uIVSEV5WJgKRVcGxbglyNk1gZz5srUrEvvf4+mfe3nO62" +
       "Uiqcz/RlBaFVCaJnliEk0i\nQvG8HX86udfuCSMEwlcGhIXM2B/+uDv13anV" +
       "Qqa7hsyu3H4i0az026aelUtj30TrmBtNhm4pDAoV\nO+dZTTtvRksGoPmqsk" +
       "X2Mu6+/Mv0X/c+8Dr5dxg1JVFE0lW7oCVRlGjyuDNuhHFK0YiY3ZXPW4Qm\n" +
       "Ub3KpyI6/w/hyCsqYeGIwNjAdB8flwyEUBtcIbiuRuK3jN0AV7dii0woFghL" +
       "+2awdSBZMNS4QdFm\njdA5hgRJlwEDc/stQ5GJOSfpJpmjIDgnO1pztU2U2N" +
       "qtC6EQK+JgCaqA1yldBYNZ6fjZj++b3P7Y\noyKhDISO1xTdAk7EPSfijhNx" +
       "5kScORF3nYjXcgKFQnz5FZVRZ2mUWbX95+3RticGrJNhVDeLokqh\nYFOcUw" +
       "lUKVZVfYHIWcph2u4rCY5EgHEsB4gGn7IqGOIVBGEummhtELlevSdhhAGOS4" +
       "cufPZ9duEE\nAxkDRSezLlyDFB8QvsX6M3dtu/vRtXVMaKGeZQ9E+y5tPSt9" +
       "//iOE1988tU6r0Io6qsq3GpNVnhB\n99OmLhEZiM0z/9wvUz881TDyThjVQz" +
       "UDn1EMKARyWBVco6IAR10yY8ECzZa8bhawyl65DNRM95n6\ngjfDIXQFHzP4" +
       "tsDVANcKB8Kd7MZedrDbcgE4Fs/AHjhVnn8oMvjln1o+4EFxWbXVR78ZQkWN" +
       "tnvp\nmDEJgfmvnk8/9cy5I3fyXDjJoChi2DlVkUrcvxUhyP3yGnwR7+p8+t" +
       "n+o1+6yV7uWR8zTXyQ5br0\n4NLKFz7ELwKXQE1byiLhJRsqp72LuCYnx3cI" +
       "BhJ8dd/Rs4f7//H3Mw6n+c5KT+pf2Yftk4+cWgqz\nEEfh1MLWTrfI+KnJRi" +
       "F+kkAaOeTZTJTHs1nU8QbqaG4YGRkBhzpgJXbKxhU5ntIlrCYnXj7dsvSk\n" +
       "vWmbcOUKn0ByIltafea1/gu93AVnxYiPNp3/jUVs7vTqnz2GKEpeLhPdPDS4" +
       "fuPQwI0bKWqUxKnO\nc9ZJUf/FCCbDx04f4KaZ3dfz8QCDH08R4jFa64gwFg" +
       "gS3hZ2prslVMjd+9N7x5p7BSSYTg83E4bA\ndvszXaGVle5ZPLpxKbNHEREO" +
       "nnYB4cU/7z52/gz9muPdq1K22ppStYO3Yx+BDH9RbI+89VIhjBpn\nURvvWL" +
       "BGb8eqzaphFpBijTuTKci0/31l/yBAOFpmoZ4gQ/iWDfKDdxLAuBKUHiWwU6" +
       "zPOd2Q+/RR\nQghxFE1yhT5+v65cwFHD1Cn4R+RSABkJgfrtPtQPB1Avwj2x" +
       "eeT0N+feVH7myG7mrdsY03Acj/IZ\nX7nV6YbFmgRfl+pY6ttlWKN82RvcZW" +
       "8YvAkKb+ry8b9h/fDA0CBFsZmpZCbu7JQtlfI2fgi6k+r9\nMa+c2KIOjrtl" +
       "nMBYeuOTml3wv4QTu3HPdHJmZnInMz4sCJndN1dkbBVc7Y5ee+2M3cFuW8Ge" +
       "aWsa\n7DpYGmlTKQB1FJ3e7p3ZHwflb6+fEKXR5f9m8AtODV0gfcu/+0EURS" +
       "UV1iipwCJPrnr12xNnpzvF\nuSq67GurGl2/jui0eVJjRgn2sOZiK3Dp969f" +
       "88ah6a9zYicdlZ0LC/iNL/2N9G+OSTXapcacrqsE\nShFFBGx5AkrV4A9T1I" +
       "RzcP5jicOg36Uuj916nMPHVw77feVwk+FSaOKSPZqLSOj64S8Lw8rfa+95\n" +
       "CI7c8d/YYfz+XWGHWDGsS3VjQCVFonocGzSyg3/NuHTSumf1P7dsOn5/kGQR" +
       "1HpnrTphh3NX1aei\n+KCR1i7dve49o/0j3vOUPzqa4AjL26rqZyrfOGKYJK" +
       "/wLTQJ3hJxXLjEuVPR2EKm3CHfRVHYWKSo\n91I2KPAmPPxq91PUfRE10GAP" +
       "v8YD8I1QWwPw5oz88g9RtKxSnqJm749f9DBFdSDKhkfKcGrz6EWc\nHgwvnT" +
       "5iyhhEUljDUXrl3frbnvj8V069LouxT1Tg1qICjUViTMPqQYsfVuwd69ol24" +
       "SOlHLAOWlq\nsYRF8Una7afm8lp9M3vTk9XsDN3J1stn5yFg52EIPSPny//o" +
       "AR6/ula4+Bb8bM02s9tZ9v8+VYZH\nbREAAA==");
}
