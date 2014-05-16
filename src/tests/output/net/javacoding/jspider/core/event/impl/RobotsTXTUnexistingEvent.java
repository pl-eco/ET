package net.javacoding.jspider.core.event.impl;

import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.HTTPHeader;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.net.URLConnection;

import et.util.MyUtility;

public class RobotsTXTUnexistingEvent
extends net.javacoding.jspider.core.event.impl.URLSpideredErrorEvent
{

    protected java.net.URL
      robotsTXTURL;
    
    public RobotsTXTUnexistingEvent(java.net.URL robotsTXTURL,
                                    net.javacoding.jspider.core.SpiderContext context,
                                    java.net.URL url,
                                    int httpStatus,
                                    java.net.URLConnection urlConnection,
                                    HTTPHeader[] headers,
                                    java.lang.Exception error) {
        super(context,
              url,
              httpStatus,
              urlConnection,
              headers,
              error);
        this.
          robotsTXTURL =
          robotsTXTURL;
    }
    
    public java.lang.String
      toString(
      ) {
        return "robots.txt spidered : " +
        url +
        " ERROR : " +
        error.
          getClass() +
        (httpStatus !=
           0
           ? " (HTTP Status: " +
         httpStatus +
         ")"
           : "");
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
    
    public java.net.URL
      getRobotsTXTURL(
      ) {
        return robotsTXTURL;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALUYC2wUx3V8/n/AHwxxYoMNuAEX7uy78/mDKzUX28iGA4xt" +
       "SHAcXda7Y7Owt7vZ\nnbMPQlGrkJBGaiQU+lNookZtkVrUVkFJVaUqQfm1aZ" +
       "FSVwLaKlEroihVS5SoqkBtKvpmZvd2bv0B\nqdeTdndu5v3m/WfOXUfFtoWa" +
       "ZDtEjpjYDvWPjUiWjZV+TbLtcZhKym8Wl4+c3akbAVSQQAFVIag6\nIdvtik" +
       "SkdlVpHx7oy1ioxTS0IzOaQRw6C6hs2/jZ3G9P7mgsRNUTqFrVx4hEVLnf0A" +
       "nOkAlUlcKp\nKWzZcUXBygSq1TFWxrClSpp6FAANfQLV2eqMLpG0he1RbBva" +
       "LAWss9MmthhPdzKBqmRDt4mVlolh\n2QTVJA5Js1J7mqhae0K1SV8ClUyrWF" +
       "PsR9FxVJhAxdOaNAOAaxLuLtoZxfbtdB7AK1QQ05qWZOyi\nFB1WddBEsx8j" +
       "u+PWnQAAqKUpTA4aWVZFugQTqI6LpEn6TPsYsVR9BkCLjTRwIeieJYkCUJkp" +
       "yYel\nGZwkqMEPN8KXAKqcqYWiELTaD8Yogc3u8dlMsNaekqr/PD1yo4XZvE" +
       "jBskblLwWkdT6kUTyNLazL\nmCPeTIdODx9INwUQAuDVPmAOE//cz/YlPrrQ" +
       "zGEaF4HZM3UIyyQpf9bVtHY+/kF5IRWjzDRslbpC\nzs6ZVUeclb6MCd68Jk" +
       "uRLobcxddG3zrw5R/ivwVQ2TAqkQ0tndKHUTnWlX5nXArjhKpjPrtnetrG\n" +
       "ZBgVaWyqxGD/QR3TqoapOkpgbErkIBtnTIRQKTwF8GxC/FdHX2DQUWPKIPb4" +
       "g+P7dJwBDwR7D85i\nnYRMguI6JpPUG2RDgfnJQ7apKtialA0LT2IKNammTG" +
       "1yaRoZKkD1XEEBjWR/HGrgtEOGBhST8tlr\n7xwb3PnVp7hVqSc6ohP0RZAi" +
       "5EkRcqQIUSlCTIoQlSK0lBSooIDxvytX99SYCo25v7/UV/NM0H4l\ngAonUL" +
       "maSqWJNKVhiFVJ04w5rCQJc9ZaITCYP4IzV02BXwOjpAaEWByBsmcttMHvv1" +
       "7UD8NIAqec\nP37r3Y+Tc+epq1HXqKfUuWhg6MNctqq2sYd3PPLUhkIKNFdE" +
       "bQigrbennpQ/fnrX+cu/eW+zFycE\ntS4I34WYNPz84o9YhowVSG8e+W/+a+" +
       "iTZ4t7Xw6gIohpyGpEAl+EFLHOzyMnDPvclEaVBZiV04aV\nkjS65OahCnLQ" +
       "Mua8GeZDK9i4BhRQCU8xPHc7jryGvuhiHX2t4h5H9enbA0uYNx8v6bjyi8o3" +
       "mVLc\n3FotJOExTHik1nrmGLcwhvn3vjXy7Nevn3yI2cIxBkElZnpKU+UMk+" +
       "+uArD9qkWyRqih/vQ32s5c\ncY29yqMetyzpCLV15ivza7/9tvQdyCgQ2bZ6" +
       "FPPAZZxKAakBuyQH+3fxPMSz1rEz155s+/MfLjmZ\nTaiYHtRfkyfSrzxxYT" +
       "5AVVwOtUuyd7tRxmonHRWwegJmZC5PZ8qZPit4IIeJgxkO9/aAQHXAidba\n" +
       "kKqEEoYsacMD371YOX8q3bWDi7JCABgeSGaaL32/7VYLE8HhWCIkT+d/6axk" +
       "7fYSAP1ECNrxP+ei\nbZHI1mhXMAbEqqws1GiCWa4eJplNaLJxJ9v5trcJ2+" +
       "5lC1H66suXULHOYHeMoFKZdxyuPG3L5b0x\nNu4XMBxh41lhIx0dnrD350vY" +
       "7u5gTydBhWmL1V3qBo2iX45YagqsOesU3Zcn/tGhfLhlgPtDg9jM\niYBDkV" +
       "u4ddVHn7C49HnnIpXdx+TUuu99eP7aaD1Pdbz92bigAxFxeAvEFFZlZmAP65" +
       "fjwKDf2LL+\n3PHR96f4Tupyi8mgnk7FXriK2+6rkhcpYYXQpEGqYPuKidYa" +
       "EawV9qy1l6BEXqwV7ogEw5FeglaA\nvcBbdMgGEGmui60RXV5YhuwpWIplKK" +
       "qHE3M7r29uuvFcAAWWySGLtG9ZCkn5pcLWTwOvrmlldaNo\nSrJ5mvH3vQvb" +
       "2pxulSmvMlsTHofna24tWKQmiCp/SFB5xHQ1sWWJYJNMNZQyFKyFhsbHR4aw" +
       "BJOm\naQo0ejyzJfNmtmg4GI5Bui09yDja4gZkgXnUY67kjXksGgx39RBUjC" +
       "0LTimOhnjJot1PaDAjY5M6\nilv16HsrGwep5lnFQkzYDQ4IbYr8DeB2anC3" +
       "o0hNPfbP15+vaOEVkuI0ZfudnASTg5WUHz16Jjo/\n9oDKw9KfKHzAR3+57/" +
       "mbl8j7PM1kmxbKbX1moYD7JaGf6rk8W1vy0xdSAVQ6gWrYMU7SyX5JS9Pm\n" +
       "YAI81u53JhNQ+MT13EMVr8l92aasyZ+pBLb+dslLKzDOrdFeh7QSnmZ46p1o" +
       "qPdFQwFiRTXNEFrZ\ne1O2nyk3LYOAfFjJLFYnHR98TCiJ3b5OgOt84L7eix" +
       "9c/4l6g1X7ChbccYrhSF/OZoT0UWiYNj0+\nCed3h1LrHtPmubrTZdvZEe7N" +
       "S0WLdoG/ByPd0N6PDw2PhcQNU47HfEo4Dme4hXulEiLvYAWutFKI\nFqgN4i" +
       "Ikj6LRwfgAK5+sW2V7u9cJFC+Wmpw4Av2uXeo8zErTyQc/rXpSeuPhgBN0CV" +
       "ATMcygBjrQ\nvPjzE9nFEqrratUPNP9le9fZL/kDsJAe3cQAzEVLyhd/fOFP" +
       "sat/PAFBNYFKd+8Z648nBkEFzcuy\nS8q1s417Cw+qv2IO4sTCgkuLXKS+3A" +
       "iosDBJW/p4Thy05JwUmuBpdJTfuNhJQVD9EmnstjnuNEFl\nxOB3JWKQPCck" +
       "6k4vUZ/JTyvWvTUcDkYgTde6vDfZLVwhbsqu8ZyQQyC2cipHQ71OtkDu9841" +
       "FGBK\nCIh7/oGw55i357P5Cdbw1kg0GO0Q20+B948E3l0e73P54h2NBGNdUJ" +
       "NnVTiveIUxcvv7iX4YMkL7\nOertfepF2i7KtMyy5e0mR9kJuWPWoBedvJns" +
       "WMyiLfBsdCy68f/k8z+HY/MMJqNL1IfXBFN0e6a4\nSFD3cqZgRojPgKKG6Y" +
       "0OeHlndGukOxjr+DxBq7kufVyZFyCoVQ1LGY+etxsW3AHzm0p5w/wjm183\n" +
       "a3/N21H3NrEMTqXTaU0Tq60wLjEtPK2yjZbx2st3/TZB997ZZRWYkX6YZt7i" +
       "yO8QtP62yLQpo18R\n8RJBjcsgAiv6ETHehc5/cQzwbmckwv+eoJW58ARVeH" +
       "9E0MsQmwBKh1dM0SOuCh1DV7bt/sId3u2B\nofmJFyuDtCllhs045xS3GI+Z" +
       "WFbpJUTmxVeL9j7zu3+zyuIeq+nlNfQWLHjb47qkHbFZx0bX6E2e\nnLYsIM" +
       "oqq2PnSptT5JfVjWJrkuXVOn5gZHBhd9KTx+4kHAMb0u4kD5eh0L/cvZjK2D" +
       "bELoVu6AmH\n738BdZAwJIsZAAA=");
}
