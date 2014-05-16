package net.javacoding.jspider.core.event.impl;

import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEventVisitor;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class ResourceParsedErrorEvent
extends net.javacoding.jspider.core.event.impl.URLRelatedBaseEventImpl
{

    protected java.lang.Throwable
      error;
    
    public ResourceParsedErrorEvent(net.javacoding.jspider.core.SpiderContext context,
                                    java.net.URL url,
                                    java.lang.Throwable error) {
        super(context,
              url);
        this.
          error =
          error;
    }
    
    public java.lang.String
      toString(
      ) {
        return "resource parse error : " +
        url;
    }
    
    public void
      accept(
      java.net.URL url,
      net.javacoding.jspider.core.event.CoreEventVisitor visitor) {
        visitor.
          visit(
          url,
          this);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1YfWwcxRUf39l3PsfEHzGJg53YDi5g4buz7+KvWCoY21Eu" +
       "ucTG5yTN1ehY7805\nm+ztLrtz54uhUVEhgVRCQtAvKU1UVJSqRYAaQf9o1T" +
       "QC+h2p9R9AW4FaBSGqNoiqqohaqvTNzK53\nbm3HkWpLuzeeeW/em3nv95s3" +
       "+9I1VGWZqFW2IuSEga3IaGpSMi2cHVUly5qGroz8VlVo8sI+Tfeh\niiTyKV" +
       "mC6pKyFc1KRIoq2WhibLhkonZDV0/MqTqx51k2y647P5v/7em9LX5Ul0Z1ip" +
       "YiElHkUV0j\nuETSqDaP87PYtEayWZxNowYN42wKm4qkKgsgqGtp1Ggpc5pE" +
       "Cia2prClq0Uq2GgVDGwym05nEtXK\numYRsyAT3bQIqk8ek4pStEAUNZpULD" +
       "KcRIGcgtWs9Qg6ifxJVJVTpTkQ3Jx0VhFlM0Z3034Qr1HA\nTTMnydhRqTyu" +
       "aLATbV6NpRV37gMBUA3mMTmqL5mq1CToQI3cJVXS5qIpYiraHIhW6QWwQtAd" +
       "q04K\nQtWGJB+X5nCGoGav3CQfAqkQ2xaqQtDtXjE2E8TsDk/MhGhNBGr/e2" +
       "by03YW88osllXqfxCUtnuU\npnAOm1iTMVe8Xog8nzhSaPUhBMK3e4S5zMjn" +
       "fnQw+dGlNi7TsoLMxOwxLJOM/Fl/67bFkQ9CfupG\ntaFbCk2FspWzqE7aI8" +
       "MlA7J589KMdDDiDP5s6udHvvx9/Dcfqk6ggKyrhbyWQCGsZUftdhDaSUXD\n" +
       "vHcil7MwSaBKlXUFdPY/bEdOUTHdjgC0DYkcZe2SgRAKwlMBTwfif/X0BQGl" +
       "qVkwZcxRMW6aujle\nxBqJGASNaJjM0GyQ9Szkwcwxy1Cy2JyRdRPPYCo1o+" +
       "QNdWb1OUrUgbr5igqKZC8OVUjaPboKM2bk\nC1d//dj4vqef4lGlmWi7TtB9" +
       "4EXE9SJiexGhXkSYFxHqRWQ1L1BFBbO/pXzvaTCzFHN//+Fw/TNh\n63Uf8q" +
       "dRSMnnC0SaVTFgVVJVfR5nM4Qla4MADJaPkMy1s5DX4FRGhYkYjmCziyba4c" +
       "1fF/UJaEmQ\nlIsnb/zu48z8RZpqNDWa6OzcNQj0ce5bbVfqob0PP7XDT4Xm" +
       "K2kMQbRz7dkz8sdn9l98+zfv3ePi\nhKDOZfBdrknh53V/0tRlnAV6c6f/xr" +
       "/3fPJc1dBrPlQJmAZWIxLkIlDEdq+NMhgOO5RGNws0N+R0\nMy+pdMjhoRpy" +
       "1NTn3R6WQ7exNk3aDfBUwbPFTuQm+qKDjfS1iWcc3U/PGhhhXv9KoOedn2x4" +
       "i22K\nw611AgmnMOFIbXDDMW1iDP3vfXPyua9dO/1FFgs7GAQFjMKsqsgl5t" +
       "+WCoj9phVYI9Lc9PzXu86+\n4wR7kzv7iGlKJ2isS48vbvvWL6RvA6MAsi1l" +
       "ATPg+pklPyg1Y2fK8dH9nIc4az129uqprj//4YrN\nbMKJ6Ur9NfNE4fUnLy" +
       "366BaH4OySrAMOytjZSVsV7DyBMLKUpz0htp81HMi9xNbs7e2LgUONYIme\n" +
       "tRElG0nqsqQmxr5zecPis4X+vdyV2wSBxFim1Hblxa4b7cwF22JAIE/7/2BR" +
       "Mg+4BEB/YgTt/b+5\naFespzveH+4bICgo88OdBa2JoK6bUUyKtUcFjSjfjl" +
       "3CdsTZQJy+htfL2b6hcH8/Qf6CqTqO1rK8\nod4enEqKvowIvux0fXlgvXzp" +
       "HwwPxgmqwrTf8YZnMSXEyDTFLKVNBwj03c3aYQpQlsSIubrDFqE8\n6T0Tdt" +
       "PaxyGZ/Oyj/3rjXE07Bw3VaV2iwBYRC2VaGfmRhbPxxdRhheegtyrwCC/89O" +
       "C561fI+4wR\nXB6j1jpKyx08JAkUO/h2sSHw6vm8DwXTqJ5VdpJGDklqgfJF" +
       "GrBkjdqdScCCOF5eZ3GYDi/xdKuX\nQwWzXgZ1D0tol8PWJc2N8GyHp9EmzU" +
       "YPaVYghrMUU+hk77uXKC5kmDoB/3C2VJYBduodEVKv18MK\nfLPH7h+6/MG1" +
       "V5RPGfJrWIE7QjVst0OsR6Ajv25YtJQSanl7ps4JwxpmZnc6ZgcGBgEliXVI" +
       "81j3\nYLh3kKCa6T2JVIQtlFpKO6s+CQXc8sVRl5C7r5A0G11cjGuFvDgI9U" +
       "zw8FRienr8AJ16Nzut2Hru\nslHhAqfVBg3s6bbV6mFWy5/+wj9qT0lvPsQT" +
       "vrG8zqEe9J1/F3fdXyuvUF2FiG6EVdgg1UWl19p+\ndk9wErDucNtfdvdf+J" +
       "IXlj5a44mwLFfLyJdfvvSnvnf/+AR4kUbBAxOp0ZHkODjcdlNzGbmh2PKg\n" +
       "/6jyS5Y9NkKW3W7KlYbLcVFjYricadNl6GgvKyla4dlqB2rrSiWFEKNVyG1N" +
       "5oOcriY6v1SJCFoQ\nENTnkvej60Pefd29veEYpHWDY/tuq51viEPk9W7Ccg" +
       "nERoyyHRqyOQQ5v7e+Qz47QYQ1Pymsud9d\n86l1WXO8pzsWD8d7+OFJ571P" +
       "tH1GsD3g2v7qetmOx8J9QEnBogKFjXtcxta+yIxCk010iKuunVOP\nQwkqyT" +
       "I2iPdUnDSVPNRVRfv6+1r6nz3ZD+8d4yTRLH5WEQX3xG7gzk0ffcLPw/I6cY" +
       "XT1GPk2e3f\n/fDi1akmTjT8Q8Sdy74FiDr8YwRbSq1Bqa7jZhaY9Jv3drx0" +
       "cur9WZ+9BQpBlUWdfv0JMH97EJxT\nzauFiJbfzcs+CfEPF/KOxYfvecNo+B" +
       "W71Sx9XKiGIjVXUFXxpBXaAcPEOYW5Us3PXZ5m5wm669bu\nrrAA+sMCfI4r" +
       "v0BQx5rK9GCiv6LiiwS13EQRTNEfUeN7BG1eWQNy2G6J8j8gaGO5PByZ7j+i" +
       "6MuA\nQBClzVcMEYKvChDsMRyEfP4Wr/pQ/E5hVYKK5AHJ4oBJQD9NnybhgE" +
       "4ZWFboraT0wo8rH3zm9/9h\nJ4hT/NOvWVBgMJBGRzRJPWGxeo2O0au9XDDh" +
       "2krYUWtHeoPFZ+Rfr1rE+mTJVuf0kcnxZSXK0M71\nIZfe7thAOA4XsUpao6" +
       "zD1xGoabautGVsGWLlQhck23b/B2Dz25qcFQAA");
}
