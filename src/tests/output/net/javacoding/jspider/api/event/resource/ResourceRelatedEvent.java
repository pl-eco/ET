package net.javacoding.jspider.api.event.resource;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.JSpiderEvent;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

abstract public class ResourceRelatedEvent
extends net.javacoding.jspider.api.event.JSpiderEvent
{

    protected net.javacoding.jspider.api.model.Resource
      resource;
    
    public ResourceRelatedEvent(net.javacoding.jspider.api.model.Resource resource) {
        super();
        this.
          resource =
          resource;
    }
    
    public java.net.URL
      getURL(
      ) {
        return resource.
                 getURL();
    }
    
    public void
      accept(
      net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.
          visit(
          this);
    }
    
    public java.lang.String
      toString(
      ) {
        return super.
                 toString() +
        " " +
        this.
          getComment();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfUwcxxWfO+DgAJtPx9iAAYc0QeHugAMMQaqMAMtnn83l" +
       "Dpyakl6W3TlYe293\nszt3nElqtWoap5EaKYrTD8lJ+m21ctOoVtJKrepaSf" +
       "ptqeWPJG2VqJWjKFXrKFVVxWpTuW9mdu/2\n9s7QNhRpl7mZN++9ee/3PmYv" +
       "XENVpoE6RDNITunYDE4lYoJhYmlKEUxzDqaS4stV/tj5w6rmRZ4o\n8soSQQ" +
       "1R0QxJAhFCshSKTE/kDNSta8qpZUUjFp8SLnfd+v7qr84caq9ADQuoQVYTRC" +
       "CyOKWpBOfI\nAqpP4/QSNsxJScLSAmpSMZYS2JAFRV4DQk1dQM2mvKwKJGNg" +
       "M45NTclSwmYzo2ODybQno6he1FST\nGBmRaIZJUGP0hJAVQhkiK6GobJKJKP" +
       "KlZKxI5v3oNKqIoqqUIiwD4S1R+xQhxjF0gM4Dea0Mahop\nQcT2lsqTsgqW" +
       "6HLvyJ+49zAQwNbqNCYrWl5UpSrABGrmKimCuhxKEENWl4G0SsuAFIJ235Qp" +
       "ENXo\ngnhSWMZJgtrcdDG+BFR+Zha6haAdbjLGCXy22+Uzh7dmffX/ejT2Xj" +
       "fzeaWERYXqXw2b9rg2xXEK\nG1gVMd94PRM8Gzme6fAiBMQ7XMScZvK2781H" +
       "377UxWnay9DMLp3AIkmK7492dK5PvumvoGrU6Jop\nUygUnZx5NWatTOR0QP" +
       "MteY50MWgv/jj+k+Of+Bb+sxfVRJBP1JRMWo0gP1alKWtcDeOorGI+O5tK\n" +
       "mZhEUKXCpnwa+w3mSMkKpubwwVgXyAob53SEUCM8HnhuQ/yvib4AVxSaGUPE" +
       "cawIBEszWaySoE7Q\nfhWTRYoEUZMAA4snTF2WsLEo6PIipkSLhrVzsTyLHJ" +
       "XdsOrx0CB2h6ACeD2oKcAwKZ6/+osHZw5/\n5hHuUApCS2uCPgxKBAtKBC0l" +
       "gqBEkCkRtJUIllMCeTxM/M5iq1M3SjTa/vLdicbHAuYLXlSxgPxy\nOp0hwp" +
       "KCIUoFRdFWsZQkDKZNjpBgSAQY1y8BokGnpAKMWASBmbMG2utGbiHeIzASAI" +
       "7rp2/8+p3k\n6kUKMgqKVsqdqwYuPsl1q+9L3Hvovkf2VlCi1UrqPSDt3Zx7" +
       "Unzn0SMXX/nl63cUIoSg3pLALd1J\nA8+tfszQRCxBYiuw//w/Dr77RNX481" +
       "5UCdEM+YwIgEJIDnvcMooCcMJOZtRYsLMupRlpQaFLdgaq\nJSuGtlqYYRDa" +
       "xsYUvnXwVMGz04LwDvqii8301cIBR+3pOgNLldc/5Rt49Yd1LzOj2Fm1wZF+" +
       "E5jw\nGG0quGPOwBjmX/9C7Iknr535KPOF5QyCfHpmSZHFHNNvpwd831ImXw" +
       "TbWs9+ru/cq7azWwrcJw1D\nOEV9nfvkeucXfyo8BbkEYtqU1zALWU/e7W3Y" +
       "ZjkzdYRnIJ6vHjx39eG+P/z2ipXTHLWyQPWn5EOZ\nFz59ad1LTeyHqiWYR+" +
       "0gY1WTjjyskoAbGeTpjJ/Zs5bH8SCxdg4PDo+AQs0giVbZoCwFo5ooKJHp\n" +
       "L1+uW388M3qIq7LNQRCZTua6rny970Y3U8GS6HOkTet3dVYwjhbin/4bIijy" +
       "QTPRXUOD/eGhwPA4\nQTU2KXNaK0F9G2SYtCZhJZ9YbD/Tdz8bByj+mI8QM9" +
       "Jei4SmAXfGO0CLuh1D6aUH/v7i07XdHBN0\nT0fe1e1OVxftSor3r50Lryfu" +
       "kbmJ3eXORbz2o/mnr18hbzDAF8KUSuvJlSp4THBkkLFXsk2+555J\ne1H1Am" +
       "pkLYugkmOCkqHhsABQMaesySi42rle3EBwFE7k01CHO0U4xLoTRKEUwLgYlY" +
       "WcsB2ebnha\nrJzQ4soJHsRgNMM29LL37fkI9uuGRkA/LOXc0Ahx3B924H7Y" +
       "hXtu7+n945ffvPYd+T2G7VrWvE3S\nHZbmfjbjCLgKTTdpm+DoUy1OvbO6Oc" +
       "HEDhNUy8SC1NF9/1MIHMBEXHGEwL7+ofFAGHhtmzsYSeTr\nJpUWdRz+NPQo" +
       "pWekmlkGRs0MfNtZGqM+Ds6ombRzEep2ZXxmcpqyHmM5OVdqfS/IFJagAgki" +
       "q559\nduwUwqvDCi0we+fN2kHWyp75yF/rHxZeupeHRXNxsafajTzzGu7bXy" +
       "+W6TD8RNMDCthQKcSuW9oR\n1ibbMG24p+uPB0bPf9wdvBW0z3EGb/G2pHj5" +
       "2Uu/H3ntdw+BFguo+uhsYmoyOgMKd20oLik2Zdvv\nrliRf8YAZsVRSXNfvG" +
       "miOHpqDQx3E3WuKIa6i+oqram7LCfuKldX6etDG6bATfPjCtTMZUzm41Fn\n" +
       "iGmOEBtlC2H60rck8Y/0Dw4GhsJQ6bng281ubgs7/9czHNMiAKuIzeIiw/TD" +
       "02kZpvO/M4xdvx2H\nXXMcdl/hsA9syWHH+4fCgWE4bHVWhroKF0zrkIFN22" +
       "jG4xjftbkjs+BIQRSxTtwFK2bIaajoWevK\n9fzC3wakt+6c5pHZ5rzKOwkP" +
       "Dt3AvS1vv8tLVXGHUqbQuYQ8vudrb128Gm/l0c0vv7eW3D+de/gF\nmB2lXq" +
       "f5pWcjCYz6pTt7LpyOv7HktUzwMUhyWY1+cfAxfQfKYacDnh4LOz3/p6D6LC" +
       "RSovGLuhNp\nZx1IGysg7cmtQFo4zMJqDG5GtuiSwGosFAhOgaDGtpZjSLvi" +
       "tpJvNPxLgrh3/b47XtSbfs4uG/nb\nfg30jqmMojg7BMfYpxs4JTMz1PB+gd" +
       "vkqY37veIbpbsjOMd5fImg7s14EFTF/jv3fZWg3TffR1AF\nvJ3034C7eXl6" +
       "iG9r5KT/JkHbi+mhhyj8cJJeAGlASoff1p2YedaBmTC9SDk6gYSORZn2+bmv" +
       "/KDy\n7sd+809WjqpF/pWMfhmChoblndCkKiinTNYi0jV6WRYzBlwECavblp" +
       "PqTM6Rfwlqd/ZDeVm9c8dj\nM+6WaGBwcEtuBeHh/sGRwNAAeCsxH5uJf/Dv" +
       "DdA87SpnMnYMZ4tEDzRvy/3Ps/ShBJthsnhmeM5p\nlbEtssrwQGAYrFJJG8" +
       "UtMArV8/sWu38D9tX7WtUVAAA=");
}
