package net.javacoding.jspider.api.event.site;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.JSpiderEvent;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;

abstract public class SiteRelatedEvent
extends net.javacoding.jspider.api.event.JSpiderEvent
{

    protected net.javacoding.jspider.api.model.Site site;
    
    public SiteRelatedEvent(net.javacoding.jspider.api.model.Site site) {
        super();
        this.site = site;
    }
    
    public net.javacoding.jspider.api.model.Site getSite() { return site; }
    
    public void accept(net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.visit(this);
    }
    
    public java.lang.String toString() {
        return super.toString() + " " + this.getComment();
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcxRWfO9tnn23ir3yY2IkdYwoW9p19Zxsb/4PlD8XJ" +
       "JT58TiCu6bHenbM3\n2dtddufO55RGrUoJUAmJBuhXGkRFFYlGFBGR/tGqaQ" +
       "T0O1LrP4C2ArUKQlRtEFVVEbVU6ZuZvdu5\nPcemWLW067mZ9+a9ee/3PmbP" +
       "XUUVtoVaZTtEVkxsh8YSccmysTKmSbY9C1NJ+fWKYPzsft3wI18M\n+VWFoL" +
       "qYbIcViUhhVQlPjY/kLNRuGtrKomYQZ5+SXe665ePl35zc11KG6uZQnaoniE" +
       "RUeczQCc6R\nOVSbxukFbNmjioKVOdSgY6wksKVKmnocCA19DjXa6qIukYyF" +
       "7RlsG1qWEjbaGRNbTGZ+MoZqZUO3\niZWRiWHZBNXHjkpZKZwhqhaOqTYZia" +
       "FASsWaYj+ITqCyGKpIadIiEG6P5U8RZjuGJ+k8kFeroKaV\nkmScZyk/pupg" +
       "iTYvR+HEnfuBAFgr05gsGQVR5boEE6iRq6RJ+mI4QSxVXwTSCiMDUgjaecNN" +
       "gajK\nlORj0iJOEtTspYvzJaAKMrNQFoK2ecnYTuCznR6fCd6aDtT+5/H4R+" +
       "3M5+UKljWqfyUw7fYwzeAU\ntrAuY854LRN6aupIptWPEBBv8xBzmtFbf3go" +
       "9v7FNk7TsgbN9MJRLJOk/PFg667V0XeDZVSNKtOw\nVQqFopMzr8adlZGcCW" +
       "jeXtiRLobyiz+d+dmRL76A/+pHVVMoIBtaJq1PoSDWlTFnXAnjmKpjPjud\n" +
       "StmYTKFyjU0FDPYbzJFSNUzNEYCxKZElNs6ZCKF6eHzwdCD+V0df4O2ESvAM" +
       "1iSClYks1knIJGhI\nx2SeokA2FPD//FHbVBVszUumOo8p0TyojedLWXNUXt" +
       "2yz0cD1xt2GmB0r6HBRkn57JVfPTSx/7FH\nuRMp8BxNCRoE4SFXeMgRHgLh" +
       "ISY8RIWHvMKRz8fE7ii2MHWZQiPrby+P1D/RY1/wo7I5FFTT6QyR\nFjQMES" +
       "lpmrGMlSRhkGwQ4M9QB5CtXQD0gi5JDTZi0QImzVqow4tSN7anYCQB9FZPXP" +
       "/tB8nl8xRQ\nFABb6e5cNXDnMa5bbVfi/n0PPNpRRomWy6mngLRz492T8geP" +
       "Hzj/xq/fvt2NBoI6S4K0lJMGmVf9\nuGXIWIEk5m7/9X/t/fBUxfArflQOkQ" +
       "u5i0iAOEgEu70yioJtJJ+4qLGAsyZlWGlJo0v5bFNNlixj\n2Z1h0LmJjSlU" +
       "a+CpgGebA9cm+qKLjfTVxIFG7ek5A0uL174c6H3zxzWvM6PkM2idkGoTmPB4" +
       "bHDd\nMWthDPNvfyN+6umrJz/LfOE4g6CAmVnQVDnH9NvhA983rZEbQs1bn3" +
       "qm6/SbeWc3ubuPWpa0Qn2d\n+9Lqrm/+XPoO5A2IX1s9jll4+gpub8b5LSfG" +
       "DvBsw3PTQ6evPNL1p99fdvKXUBddqr8kH85c+MrF\nVT81cRAqlGQfzAcXq5" +
       "B05GNVA9zIIE9ngsye1Tx++4jD2R/pj4BCjSCJVtSQqoRihixpU+PPXapZ\n" +
       "fTIzuI+rcpNAMDWezLVd/l7X9XamgiMxIKRI53dlVrIOunFP/0UIGv20meeu" +
       "vuHuyFBP9E5CjUo4\nqLYSdOs62SRtKFhjiSTvV/ruZuMeijfmE8SM0uGQ0L" +
       "D3ZrZJWrDzMZNe+Pw/Xz1T3c4xQHlaC65t\nEV1bxJWUHzx+OrqauFflJvWW" +
       "Mg/x8Z8cOnPtMnmHAdwNSyptT65UwcOSkDGG3sg2BF56Nu1HlXOo\nnrUjkk" +
       "4OS1qGwn8OoGGPOZMxcK24XtwccNSNFNJOqzclCGK9CcFN+TAuRqGbA7bA0w" +
       "xPg5MDGjw5\nwIcYbCYYQyd731aI2KBpGQT0w0pOhESYY3y/gPE+D8a5rcfv" +
       "Hr707tUfqB8xHFezpmyUcjhaB9mM\nEFxlhmnT8i/0n85OndOmPcLE9hNUzc" +
       "T2RaMDwwRNfjK4zxgLBrFn75udxERecjEfjXT3DfT0wUbB\n2b1TCVYYqZiY" +
       "c+IT0HCUHoyq41gUNTK0bWF5ijo1NKFn0uIiFOTymYnRcbrtEEu6uVJz+wmq" +
       "khag\nxEgyK49d+WBx46nViSWw9a4b9XasLz15399rH5Feu5/HQWNxNafaDT" +
       "z7Fu66u1Zeo3UIEsPs0cBw\nmhusXmkHWM+bx2XdvW1/nhw8+wVvtJbRBkaM" +
       "1mK2pHzpxYt/HHjrDw+DFnOo8uB0Ymw0NgEKt60r\nLik3ZFvuKVtSf8FQ5Q" +
       "ROSadezDRSHC7VFoaLhj5bFDTtRYXzZnh2OE7csVbhpK/PrJvzNkyISwRV\n" +
       "LmKS8ASWIQRWlC1E6cvcTGqPRLv7+noiA3BdciTeZrdzKzBYIiYHF5mgG54W" +
       "xwQt/5sJ8qVYOFVO\nOFW/e6qVTZ3qzu5ItKc/CnbMqkAE90GnZvVs2AGzPQ" +
       "5zro1dRaB/kWQZm8Rbg+KWmoainHVuSK/M\n/aNXee+OcR57zeLNWyTcG7mO" +
       "O5ve/5BXn+ImY43a5RHy5O7n3zt/ZWYrj19+V72l5Loo8vD7KjtK\nrUkzyJ" +
       "71JDDq1+7Yc+7EzDsLfscEn4M0ljXoB4IA07d3LczshqfNwUzb/ylsvgqpkh" +
       "j8Xi0i7GsC\nwgZchJ3aDMKifTRuor1wqcmLLAROHmv1burnFBTr9d7NaDPb" +
       "XPIZhV/25Y7VB25/1Wz4JbsjFC7k\nVdDypTKaJhZ6YRwwLZxS2dGreNnndv" +
       "j2+i2bewEUi/q3OO8Zgto34iWogv0X+Z4jaOeN+Qgqg7dI\n/zxB29emh1h2" +
       "RiL9WYK2FNNDG+D+EElfAGlASoffN0V8nBPw0UvvPUJdT5hYVmlbnvvuj8rv" +
       "eeJ3\n/2bFpVLmH7DoRxvoSViOCY/qkrZisw6PrtG7rZyx4N5GWBV2nFNj8x" +
       "35R5oWsaUpyOqcPRKf8HY1\nkYGhwU0hljU0EUBsReJQfGLm038OgNbn5rVM" +
       "xNQWGxx6gEN5eZ88A+9LsBkmi0f9i4IVhjd1lQEr\n9Pf29IMVymlbtwkjUL" +
       "0uONv8F7NUoXxQFQAA");
}
