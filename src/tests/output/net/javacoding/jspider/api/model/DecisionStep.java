package net.javacoding.jspider.api.model;

public interface DecisionStep {
    
    public int getRuleType();
    
    public java.lang.String getRule();
    
    public int getDecision();
    
    public java.lang.String getComment();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1Xa2wUVRS+u9tuu+1i6QNo6JNSxAa6C0Wq0D80bQkLC127" +
       "GGQpWWZn7rZDZ2fG\nmTvt8rCRiBb9YULAV4IaEw2JIf6QgH9MkAC+IonpH1" +
       "Cj0WAIRjEYYyQGg+feO9udnS4QNWGTuXPn\n3nPuOfec7zz2xHVUahqoUTRD" +
       "ZI+OzVBfPCYYJpb6FME0t8JSUrxQGogd36RqXuSJIq8sEVQVFc2w\nJBAhLE" +
       "vhSH9P1kCtuqbsGVE0Yp8z65S1i29NfDG1scGHqhKoSlbjRCCy2KepBGdJAg" +
       "UzOJPChtkr\nSVhKoGoVYymODVlQ5L1AqKkJVGPKI6pALAObQ9jUlHFKWGNa" +
       "OjaYzNxiFAVFTTWJYYlEM0yC5kZ3\nC+NC2CKyEo7KJumJIn9axopkPokmkS" +
       "+KStOKMAKE86O5W4TZieH1dB3IK2RQ00gLIs6xlIzJKlii\nxc0xc+P2TUAA" +
       "rGUZTEa1GVElqgALqIarpAjqSDhODFkdAdJSzQIpBC2846FAVK4L4pgwgpME" +
       "1bvp\nYnwLqALMLJSFoHluMnYS+Gyhy2cObw36g3+/EPuzlfm8RMKiQvUvA6" +
       "ZmF9MQTmMDqyLmjDet0NHI\ndqvRixAQz3MRc5reJR88Hr12poXTNBShGUzt" +
       "xiJJire6G5ume38M+Kga5bpmyhQKBTdnXo3ZOz1Z\nHdA8f+ZEuhnKbX409P" +
       "H2p9/FP3tReQT5RU2xMmoEBbAq9dnzMphHZRXz1cF02sQkgkoUtuTX2DeY\n" +
       "Iy0rmJrDD3NdIKNsntURQmXweOB5EPFfkA4EPdCPRdkEFeIE6yGdoLCKyTBF" +
       "gKhJ4Pvh3aYuS9gY\nFnR5OKNJWBku5MhSEVUTHg+NVXekKQDLDZoC/Enx+J" +
       "XP9w9sev4Q9xvFmq0cQZ0gM5SXGbJlhkBm\niMkMOWUij4dJW1BoS+ocicbQ" +
       "L+/3zH2x0zztRb4ECsiZjEWElIIh9gRF0SawlCQMfNUOoDN8ATiD\nKcApqJ" +
       "BU4CAWF2C8cQO1ufGYj+IIzAQA2fTk7S9/TU6cpNChrq6jp3PVwHFjXLdgR3" +
       "znxl2H2nyU\naKKE+iDL4m8BleK233qaCXLnZ1L7/jj3RkUrP5/yNOYOAGFu" +
       "Tpodbj7jX3Hpw8oLzOK5RFLlyDhx\nTDgsq/O6bjUwhvVvX40deen61A6mKN" +
       "fUR1C5kIJrCyIhYNhc3iHIr1spRRYdN6ktEjmh+rqjL3cc\nu1T0Ak13CniW" +
       "rKae+C34nHB+Jw/LmkLHD6hWZvWbl3HHuqBYBFwBoumdCh7HSl49t7TNLBHm" +
       "LF21\nreWH9d3Hn3IrWkIhjnM8A32bC9mS4tn3znyz+vLXB0GLBCrbMhjv64" +
       "0OgMItdxWXFKvHGx7zjcqf\nelkapimtSPouZOpxXhOqgIGh+qjUYHQlkJ0N" +
       "2ZihiViCEpWX+8pfG24cKV1zyotKIC9DZSIC5BNI\n881u4QWptCeHJioKOC" +
       "vTmpERFLqVqyUVZNTQJvIrLEvMYfO5YMlKeJrhqbGTEXvTzRo61PKcwqjb\n" +
       "2LiEI9BL50vp0GFjzUPH5eCX2jyCew1D2EODLXtguum1T4TXIUVDqjTlvZhl" +
       "QlQQd/YJdFzn2KTf\nPQRVjmAyZCns2iClwen9mCFnIHuP2+XlVOL3FdLVZf" +
       "0co/XOtsVJuKHrNm6vvXaDITUAPYRgbpmB\n6+wa5hJyuPntqyevDNVxnPNC" +
       "v3hWrXXy8GLP7hPUaaQtupsERn1+2aITk0Pfpby2HcIE+SDaIc6Z\nuqsRs1" +
       "Z3gTeb4Km3vVn/P73p9sU9HbWFoDLbUXDBeqeTeLnmxtt/7MpzHd9/ddFuAB" +
       "weylP9lDxo\nnX72zDQLRZd7WItJZx7WdkGksErCA46OFbwabieognGuXNG1" +
       "phs0qgFRtCcNyVIoqomCEul/62zl\n9GGreyPXZY6DINKfzLZcfKfjdivTwR" +
       "bpdzQZ9nfZuGDkoaPTV4KgR/9l/V7b9fDylSs7u9ZAM2rb\ncKnZytMJM3Yd" +
       "bLDgooUyxDvCYghoth+Ue99PBKR4qOauRpcixZRshafdVrL9fis5BrgAJfu0" +
       "TAar\nhJFs44ghTsQ8wnZ20MH6D/5c1U39uaqLoNq8sBmX0lN3oSxBQScb7Q" +
       "HqZ/1N4s282Da966FzevVn\nrErMNNzlAMi0pSiOIuQsSH7dwGmZXa6cJ39+" +
       "030Etd6r2yOolL2ZHfZyvkn473FnPkhQMDrpD8Bf\npuL0kCvsmZP+ILTChf" +
       "TgkvyHk3QKpAEpnR7Si4QITyZZ/R8vRra9wQ4AAA==");
}
