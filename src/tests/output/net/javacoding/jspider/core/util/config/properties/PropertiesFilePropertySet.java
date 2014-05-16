package net.javacoding.jspider.core.util.config.properties;

import net.javacoding.jspider.core.util.config.PropertySet;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import java.io.*;

import et.util.MyUtility;
import java.util.*;

import et.util.MyUtility;

public class PropertiesFilePropertySet
  implements net.javacoding.jspider.core.util.config.PropertySet
{

    protected static java.util.HashMap
      instances =
      new java.util.HashMap(
      );
    protected java.util.ResourceBundle
      props;
    protected java.lang.String
      fileName;
    
    private PropertiesFilePropertySet(java.lang.String jspiderHome,
                                      java.lang.String configuration,
                                      java.lang.String fileName) {
        super();
        this.
          fileName =
          fileName;
        try {
            java.io.InputStream is =
              new java.io.FileInputStream(
              jspiderHome +
              File.
                separator +
              "conf" +
              File.
                separator +
              configuration +
              File.
                separator +
              fileName);
            props =
              new java.util.PropertyResourceBundle(
                is);
        }
        catch (java.io.IOException e) {
            System.
              err.
              println(
              "[Config] " +
              fileName +
              " couldn\'t be found -- using all default values !");
            props =
              null;
        }
    }
    
    public static synchronized net.javacoding.jspider.core.util.config.PropertySet
      getInstance(
      java.lang.String jspiderHome,
      java.lang.String configuration,
      java.lang.String fileName) {
        if (instances.
              get(
              fileName) ==
              null) {
            instances.
              put(
              fileName,
              new net.javacoding.jspider.core.util.config.properties.PropertiesFilePropertySet(
                jspiderHome,
                configuration,
                fileName));
        }
        return (net.javacoding.jspider.core.util.config.PropertySet)
                 instances.
                   get(
                   fileName);
    }
    
    public java.lang.String
      getString(
      java.lang.String name,
      java.lang.String defaultValue) {
        java.lang.String value =
          null;
        try {
            value =
              this.
                getProperty(
                name);
        }
        catch (java.util.MissingResourceException e) {
            value =
              defaultValue;
        }
        return value;
    }
    
    public java.lang.Class
      getClass(
      java.lang.String name,
      java.lang.Class defaultValue) {
        java.lang.String className =
          null;
        if (defaultValue ==
              null) {
            className =
              this.
                getString(
                name,
                name);
        } else {
            className =
              this.
                getString(
                name,
                defaultValue.
                  getName());
        }
        java.lang.Class retClass =
          null;
        try {
            retClass =
              Class.
                forName(
                className);
        }
        catch (java.lang.ClassNotFoundException e) {
            retClass =
              defaultValue;
        }
        return retClass;
    }
    
    public int
      getInteger(
      java.lang.String name,
      int defaultValue) {
        java.lang.String stringValue =
          this.
            getString(
            name,
            "" +
            defaultValue);
        int value =
          0;
        try {
            value =
              Integer.
                parseInt(
                stringValue);
        }
        catch (java.lang.NumberFormatException e) {
            value =
              defaultValue;
        }
        return value;
    }
    
    public boolean
      getBoolean(
      java.lang.String name,
      boolean defaultValue) {
        java.lang.String stringValue =
          this.
            getString(
            name,
            "" +
            defaultValue);
        boolean value =
          new java.lang.Boolean(
            stringValue).
            booleanValue();
        return value;
    }
    
    protected java.lang.String
      getProperty(
      java.lang.String name)
          throws java.util.MissingResourceException {
        if (props ==
              null) {
            throw new java.util.MissingResourceException(
              name,
              name,
              name);
        } else {
            return props.
                     getString(
                     name);
        }
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1331419258000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZfWwUxxWf87eNwR8Y4mCDDRgRGt/Zd+ezz1hVcYyJDQd2" +
       "bPNliI713tgsrHcv\nu3P2maa0UQkk+SNqRPpNQ1slQqroJ4JKTVVKSZq2CV" +
       "JiqUmaKGkrUETVEKVqq9A2EX0zs3s7t3dg\nInyWdj03Ox9v3vu933szc/oa" +
       "KjQNVC+bPjITx6avZ3hQMkwc61El0xyBqqj8YmHp4Kktmp6HPBGU\np8QIqo" +
       "jIZktMIlKLEmvp39iVNFBjXFdnJlSdWONkjLJ+9cfTrxzbXJePKkZRhaINE4" +
       "koco+uEZwk\no6h8Ek+OYcPsjsVwbBRVaRjHhrGhSKpyCBrq2iiqNpUJTSIJ" +
       "A5tD2NTVKdqw2kzEscHmtCsjqFzW\nNZMYCZnohklQZeSANCW1JIiitkQUk3" +
       "RFUNG4gtWY+RA6jPIjqHBclSag4dKIvYoWNmLLJloPzcsU\nENMYl2Rsdyk4" +
       "qGigiQZ3j9SKm7ZAA+haPInJfj01VYEmQQWq5iKpkjbRMkwMRZuApoV6AmYh" +
       "aNlN\nB4VGJXFJPihN4ChBte52g/wTtCplaqFdCFribsZGApstc9lMsNZAUf" +
       "knTwx+1MhsXhDDskrlL4ZO\nK1ydhvA4NrAmY97xesL3dP/uRH0eQtB4iasx" +
       "b9O95ufbI1fPN/A2dVnaDIwdwDKJyh+31y+f7b5S\nmk/FKInrpkKhkLZyZt" +
       "VB60tXMg5oXpoakX702R9/PfTb3V/6Af57HirpR0WyriYmtX5UirVYj1Uu\n" +
       "hnJE0TCvHRgfNzHpRwUqqyrS2W9Qx7iiYqqOIijHJbKflZNxhFAxPB54xhD/" +
       "W0hfBNUNGjpFqYLN\nTdDX+jUzjIkvTtA2DZO9FA6yHgMg7D1gxpUYNvbKuo" +
       "H30hVASRtXJvbGU6PsvcWASSpOxbTHQ/3a\n7ZUqQLhPV2H4qHzq8h8e7t3y" +
       "+GPcxhSX1kIIioBIPkcknyWSj4rElcpF8jki+W4qEvJ4mDB3pZuF\n2jlG3f" +
       "H9n3VVPuk1z+Wh/FFUqkxOJog0pmJwY0lV9WkcixKG4yrBZxhUAeflYwB5kD" +
       "CqwkDMxcAO\nUwZa5Ya2Qwj9UJIAr7OHb7z6QXT6DEUhRU0NHZ2LBhg4yGUr" +
       "Xzf84OZ9j63Kp42mC6h5oWnT3KNH\n5Q+e2Hrm9ZffucdxIYKaMjw7syf1TL" +
       "f4oE0Zx4D5nOG//t++D48Xdp7NQwXg7mAOIgFMgT1WuOdI\n89Aum+2osqDn" +
       "gnHdmJRU+smmqDKy39CnnRoGqIWsXAkKKIenEJ56C+OL6Yt+rKavxRx+VJ+u" +
       "NTAu\nvf7lotY3frngRaYUm3YrBH4GvHAnrnLMMWJgDPXvfGPw+FevHdvDbG" +
       "EZg6DiuKFMSRBEmIB3ecD4\ni7Mwiq+25umvrTvxhm3txc7w3YYhzVBjJx+Z" +
       "Xf7Nl6TvANuA15vKIcycOp9NlQ+darE9ZG/PVs5R\nnNEePnH56Lq//OmSxX" +
       "pCNHVa/S16JHHu0fOzeVTHpRDXJHOb7XMsrtKSh8UasCPDPK0pZQot427t\n" +
       "J1bPQCAUBIGqYSYah31KzBfRZUnt3/i9Cwtmn0q0b+aiLBQa9G+MJhsuPbfu" +
       "RiMTwZqxSCBW63fx\nlGRsc+iA/gsQtHN+aWq9v7M5GPaG2glaYA3Vp09yyN" +
       "VAzGb2ob7u4/GRfWjhalgvqKGNfQjSV1dO\nhAyFvR1hAppkHROGZGsqLIr0" +
       "OUGkkCPShpyIFG71doYIKqGByDZU2HYA+m5mZS/1TAZexGRcZTWh\nBOmODJ" +
       "toPmSzy+TY5/998ZmyRu4stE99ygfqRB9I6xWVHzp0Ijg7vFPh2HNnCq7Gh3" +
       "61/Znrl8i7\njAocAqOzrUxmCrhDErg1/PpUVdFPTk7moeJRVMmyPUkjOyQ1" +
       "QYliFHzI7LEqI8xyzvf03Iu7Z1eK\noOvd5ClM66ZOJ2RCOd1dHbZcAk8HPB" +
       "UWW1a42NKDmH8NsA5N7L2Wc1seIAogQUA+DJlmkckS5iTU\nKpZApgjAHQ4A" +
       "2zpd1MA1v3FD54Ur136sfMTcv4xlwN20h7WGUlYjcFK+HjdpriUk+9ZITQNx" +
       "s4tN\n22ZP2x5oywFJBNuagwFvG/DegflMSXwpFa41G4lkTGDS6NTRde0U9X" +
       "wYcspMdVIlWFZF1QzxixzS\n6tUSk+JHSKoKhnq7N9r8JoS3Psncv1WK87hJ" +
       "35tT6FkEz2p4Kq2RKrOjB2eih9HAMKClkOojDSkH\nBKrysw+7HCOG2+bfiJ" +
       "2hZn+nNwAjl4309Q8zC7F5D9ri0R+SrZpaRzV0S5cwZHxfQovxnDubhlbA\n" +
       "U2VpqCq7hlj7CYEyRYVMCQoJuBTiDwP375hnhQRamzu8gVYIKkwfIo1PCzIe" +
       "phWwzyveOdQ/MtK7\njdE8U0Iyi8GBIuKJMRUowmJ5JxDUW5mrsOYjAl2E47" +
       "bqg7frZMJ6kkA2y2+2k2S74GO7/lF+VHrh\nQR4WqtO3AdRRQiffxOs2lMtZ" +
       "diKlRI97VTyFVSd2uWfbynbYNk1X7Gz466b2U19wB68iuh8Sg1d6\nt6h84U" +
       "fn3w69+dYRkGIUFW8bGO7pjvSCwA23nC4qV03VPZC/X/kdo1UrjmScC6R36k" +
       "qPHmUGJglD\nG0mLIY0pjDcwSHOcI/t/RsadgYh8Wn6EvkYIKjdnNBnyeg2y" +
       "2lj2VMHOcwWUfMtBSbvfyWq+nQOi\nb20OhbwdwfRsMCPNOikIFHAE+m5OBO" +
       "oIsTRrjszvWUGkoCPScwTtmn+ROju8fn/g06d+x0GvEOT6\nxRBnyX9akL/V" +
       "kf+HOZE/6Af5wcg1gjAQgjn+6bRHOVV/JQX+BfB8Fp41FvjXZAM/fX0xqxLy" +
       "eC4l\nLvissOAOZ8HncoChjuZA2BvsJI63p0HnF4IkYUeS53MiSZvf2w4hpz" +
       "yGx6WEypPh20TPT0FOMFjm\nRuw3wgLanQVcnH/shNubA53e9uBnCFpE9ium" +
       "LyUPW0M21KyHp9VCTesdo+ZlZ6kdAvO8Mv+2ags3\nB9q9wY6boeZVQRKBcF" +
       "7LiSTBTm+ow4UaO1uocNJdFvDnBtJLwFxgONZaXNJbwpKEOPN2Tpbk93tD\n" +
       "kNRV2YKk8c8fsyEpDM/9FpLuv2MkXRYWK/DPlflfbIc/C5JcW/hBQ5lUiDJl" +
       "nd+fHf1na+y9ezfy\nXK1WvBcSG/YFbuCmxVc/5Jv39MOsLFt/1yRPrXj2vT" +
       "OXh2p4vsdvUlZnXGaIffhtClNfeZxmnCtv\nNQNr/cK9K08fHnp3LM/C3uME" +
       "5SsagTSZiRuaG61/hg0Li1MET/CDifezoWMDPNstdGy/Y3Rcd9AR\nFsLxf+" +
       "YfHeFQc7CV7a1dPHM1znVzDbYeY7quYkmzteafW2v/4lq7j3ekNZ+4tbbIYu" +
       "Q9ltb23Exr\nE1ln82RsZzwlgtacE0FPaQ42s/7mYMjb1i5qLbtSsohZIYgZ" +
       "Su26Vjkb3q2KaYKU9r63NynjOM06\nWe8CnsTZ8ogD1wgDOzHBsyQn6/e3ed" +
       "vCPIezv6VxaBglCbr7poPQ4/fajOtifqkpr5rdd8/FeNXv\n2bVG6uKxJAIZ" +
       "b0JVxRM3oVwUN/C4wmBTws/fuFbqCAp8+mMjwK/zg+rSs4wPt4Kgtbc5HKEX" +
       "jLQg\n9l9JUONc/QFW9J/YrYmgult0gx70n9hjLUFLs/cAj7ZKYnuaVKW3Bx" +
       "04P8SmXmBRaEqLvhSAhcN6\nfqBKGbpGODEbjmNZobcTye8/X/DAk6/9j+2V" +
       "i2V++09vvGWzZUoxFdLSrUnqjMnOb+k3escnJwwD\nazxYWxZfYPIR+Q13nX" +
       "hEmZqraWT3YG/GKWU4mKsDLj/N8+mBznxfoB420N3ZlMkWKB4y0qXus4T4\n" +
       "P6BqhqHaIQAA");
}
