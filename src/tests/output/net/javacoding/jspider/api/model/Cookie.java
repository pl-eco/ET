package net.javacoding.jspider.api.model;

public class Cookie {

    protected java.lang.String name;
    protected java.lang.String value;
    protected java.lang.String domain;
    protected java.lang.String path;
    protected java.lang.String expires;
    
    public Cookie(java.lang.String name, java.lang.String value) {
        super();
        this.name = name;
        this.value = value;
    }
    
    public Cookie(java.lang.String name, java.lang.String value,
                  java.lang.String domain, java.lang.String path,
                  java.lang.String expires) {
        this(name, value);
        this.domain = domain;
        this.path = path;
        this.expires = expires;
    }
    
    public java.lang.String getName() { return name; }
    
    public java.lang.String getValue() { return value; }
    
    public java.lang.String getDomain() { return domain; }
    
    public java.lang.String getPath() { return path; }
    
    public java.lang.String getExpires() { return expires; }
    
    public boolean equals(java.lang.Object other) {
        if (other instanceof net.javacoding.jspider.api.model.Cookie) {
            net.javacoding.jspider.api.model.Cookie otherCookie =
              (net.javacoding.jspider.api.model.Cookie) other;
            if (otherCookie.name.equals(this.name)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public int hashCode() { return name.hashCode(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZe2wUxxmf8+Pssw1+4ADBBhtwS1zwne3zE0dqLNsIw4Ed" +
       "25DiEl3We2N7Ye92\n2Z2zD0ppqqaQ8EfUCPoUIWrVCqmK0gdK2qoPigJt0x" +
       "YpsdQkfRA1IoqIWqKkVRvUpKLfPPZmb++w\nuUpY2r317Dfzze97f7PP3kDF" +
       "toXqVTtIDpvYDg6MjyqWjWMDumLbEzAUVS8XB0bP7UwYBcgXQQVa\njKDKiG" +
       "qHYgpRQlosNDzYl7JQo2noh2d0g4h1slbZuvGj+d+f2FFXiConUaWWGCcK0d" +
       "QBI0Fwikyi\nijiOT2HL7o/FcGwSVScwjo1jS1N07QgQGolJVGNrMwmFJC1s" +
       "j2Hb0OcoYY2dNLHFeDqDEVShGgmb\nWEmVGJZNUFXkgDKnhJJE00MRzSZ9Ee" +
       "Sf1rAesw+hY6gwgoqndWUGCFdGHBQhtmJoGx0H8jINtmlN\nKyp2phQd1BIg" +
       "iQbvjDTipp1AAFNL4pjMGmlWRQkFBlAN35KuJGZC48TSEjNAWmwkgQtBa267" +
       "KBCV\nmop6UJnBUYJWe+lG+SugCjCx0CkE3eMlYyuBztZ4dObS1oi/4r8nRz" +
       "9oZDovimFVp/svgUnrPJPG\n8DS2cELFfOLNZPD08L5kfQFCQHyPh5jT9H/s" +
       "R3si1y80cJq6HDQjUwewSqLqR131axf63woU0m2U\nmoatUVPIQM60Oire9K" +
       "VMsOaV6RXpy6Dz8pdjv9r36Hfx3wpQ6TDyq4aejCeGUQAnYgPiuQSeI1oC\n" +
       "89GR6Wkbk2FUpLMhv8H+B3FMazqm4vDDs6mQWfacMhFCJXD54Pok4n/0f0RQ" +
       "6YBhHNRw0CSoOYHJ\nfqp71YiB1vcfsE0thq39iqntjxsxrO93aFN02cp5n4" +
       "/6p9e7dDDF7YYOM6PquWu/PTq084nHua6o\nfYkNEbQJuAUlt6DgFgRuQcYt" +
       "yLkhn4/xWZUpOaqKGPWYv/+wr+rJFvuFAlQ4iQJaPJ4kypSOwdMU\nXTfmcS" +
       "xKmKlVu8yaWROYYsUUWCUwj+qwEPMCENWchTZ4rU/67DA8KWBSC8duvfxudP" +
       "48NRSq2Fq6\nOt8aqOkg31tF8/jDOx55fEMhJZovAoEXAGnT0qtH1XdP7jr/" +
       "6u+u3ietnKCmLOfLnkmdx7v9UctQ\ncQyCk1z+q//Z/t6p4t7nC1AReCTEJK" +
       "KAJYGDr/PyyHCiPicgUWHBzPJpw4orOn3lRJEyMmsZ83KE\n2coy9lwFAiiH" +
       "qxiuGmGGlfRGX9bQ2wpuWVSeHgws3N38gr/1tZ+VX2ZCcSJjpSuEjmPC/axa" +
       "qmPC\nwhjGr35t9NSXb5z4NNMFV4aPIL+ZnNI1NcX2t8oHul+Rw+eDq2tPf6" +
       "X5zGuOslfI1fstSzlMdZ36\n/MLar/9aeRriAfilrR3BzO0K0mpfjZ0lhwZ2" +
       "8SjCY87RM9eON//1j1dEXHLlO0n1TvSx5AtfvLBQ\nQEUcgMyj2Lsdb2KZjz" +
       "75WDYANTKTpyMBJs8y7rBt4O1sZldvJ+ynBhjRRBnUYsGIoSr68OA3L5Yv\n" +
       "PJXs2sF3ssxFMDwYTTVc+U7zrUa2A8HQ74p84v+SOcXaLf2c/rQT1H7HoWVr" +
       "W+eWtp6W9l7C4wVT\nTC0kSiZy6r1BnpTYixBHtlUi62LjYXrry5dvuK2lI0" +
       "xQ8ZyiJxmAHscu6H0Le26h9sp0ihjrDWx0\nXZZ93yvsuzaXfdPbx3MuXcyW" +
       "LnaDG5LguiW4bXmBa2/NECrD5uaxQ/LokTx25ssjW4BuJiOSSa9k\nMpovk4" +
       "7Ols4e8NyYEYeYlcVlwuHS3doquezJl0tXa0s3OEw6iWbw2Cd5tEkek/ny6A" +
       "639HQTSO0p\nU7O4pd+BxfULEpqovMl3Gy0dnSgfn/rMv148W9bIoxadUy+s" +
       "CyobdzDKmBVVDx05E14Yf0jjUcBb\nVHmIj/xiz9mbV8gbLCTLREK5rU9lb3" +
       "Cv4spxPa/OVfu//0y8AJVMoipWGCsJspcaDwTsSQhm9oAY\njEA0cr/PLFN5" +
       "nOxLJ8p6bxJzsfWmMFmVwHNm3JRZazlca+AKCK8OeLzah1ik09iEJnbflM4x" +
       "AdMy\nCOwPx1LuoCZsyZBe0eqJylzUgw/0Xnzrxve0D1jkLWPdQT+dIDYdYC" +
       "OubFBomDatQ12NkFipacS0\n+xjXDiKySGdHbzgvu+1q29LW2dIGoSQwsX14" +
       "POiIzxTYjkGRm42Bchayo6kfLGO5DOhDiWTc/ZIu\nNTbUP8gcghcE9B7LUE" +
       "cdXGViUlludRylt4NOPHIL/XNS6NyBD0l5dHfmJY9wO5VHeytBZUwe6dj3\n" +
       "qDsQHlkUS71IHMj5zcZyXGARYc8N5gkJpj0LTHd+YLoYGAh85QyMjLEnMyLu" +
       "4nCop1QIOBW54XxJ\nwGHx1Q3mlAQTzgLTmxeYjtZMS3VC+WlXWF8cyFq4lg" +
       "kgy3ID+YYA4gRxN5anJZYOL5aetvywdDDF\nQClVwbC4UsbZzAziQpRy1RlI" +
       "JpR6kUwg2qy9XZvNjghOfOr9iuPKpYd5IqjJbMCo03Y+8zpufqBC\nzdHeBY" +
       "hhtuh4DusyW3m57WLHD05grnyo4c1tXec+601XJbTJdKerzGlR9eJzF/7c+f" +
       "qfHoNdTKKS\n3SPjA/2RIdhww6Lsomr1XN2DhbPab1hcFZkj69Akc1JfZr4o" +
       "szBJWomJjKzRmFEL1okLOb93Xgs6\nSX/JiuAHYAEzmOz2ZJYfyyqlXVYpPy" +
       "Go7zZ2pxoWFoY3rhHoFgm2EopOi2OojtvbW8I9nyBoucqN\nUnBk5obY+s9l" +
       "IKdBrUEgb7hLyH8OEGEfe73x/ZKEHpbQL/9/0LsZ9F6AXimh702XuLmwU7wb" +
       "BfaN\ndwn7S+BksJHBrHzwsgTfIcG/kl8igC6srSUMQaomzWOT3cjt/bawab" +
       "zcJGBvukuw/8CNfdSTN/4i\nQXdK0FfzA91LQdMuqUpwWBpyI1ybBeTNdwny" +
       "m1BbwIaGsjPMdYna1fi+k19qCTNVQ2pZIZksDZzq\nNySAh/ID7uOVsRvI+x" +
       "KIq8n9R35AwFG7IEZB3WWQWWzlODrgjcLSEr8B1Q4+lFR029srjVpaXCPa\n" +
       "nDhTfn7yn62xtzcP8hS52v2twk24vf0Wblpx/T3eJWUe3+TosTxMnlr37bfP" +
       "Xxur5WmWn+5vzDpg\nd8/hJ/wMSoVJE/36xTgw6kub1z97bOyNqQIhgnPgZ1" +
       "OGoWNouZCfbbktlx3Qg477hR3cf3ccwFcE\n1jGr2LMDoHBG8KHJJvkQQYVa" +
       "gjgb7ETQYfm5QdBzutVZX3749wl1w8Ij971oVr/Ejj/T3xBKI6h0\nOqnr7o" +
       "7Q9ew3LTytMVClvD9ktuurJqhxqcNssEn2y3ZdxeeBaa65/TxABnc3/SqCVu" +
       "amB1WJJzf9\nGsjVmfQQR+Q/btK1wA1I6eM6Vtb+mxpNrauPGzexqtEzwtS3" +
       "flr04JOvfMiqphKVfySjH4ag3ZzT\nbI2E+iFxHrZZ707f0XN2NWlZOEFYeS" +
       "mkWW7zFfmHoDp3t5rm1TSxb3Qou2HN70BRNKzQ1RXR0jmP\nTw/Qyt6bSwRs" +
       "W8LkWcNKN3hYrP8/JSZxlLccAAA=");
}
