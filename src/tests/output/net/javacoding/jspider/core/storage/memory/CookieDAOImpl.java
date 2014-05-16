package net.javacoding.jspider.core.storage.memory;

import net.javacoding.jspider.core.storage.Storage;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.CookieDAOSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.SiteInternal;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Cookie;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import java.util.*;

import et.util.MyUtility;
import java.sql.*;

import et.util.MyUtility;

class CookieDAOImpl
  implements net.javacoding.jspider.core.storage.spi.CookieDAOSPI
{

    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected java.util.Map
      cookies;
    
    public CookieDAOImpl(net.javacoding.jspider.core.storage.spi.StorageSPI storage) {
        super();
        this.
          storage =
          storage;
        this.
          cookies =
          new java.util.HashMap(
            );
    }
    
    public Cookie[]
      find(
      int id) {
        Cookie[] cookies =
          (Cookie[])
            this.
              cookies.
              get(
              new java.lang.Integer(
                id));
        if (cookies ==
              null) {
            cookies =
              (new net.javacoding.jspider.api.model.Cookie[0]);
        }
        return cookies;
    }
    
    public void
      save(
      int id,
      Cookie[] cookies) {
        this.
          cookies.
          put(
          new java.lang.Integer(
            id),
          cookies);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVYe2wcxRmfO58f50f8SoIbO7HjuCQu9p3fj/ifuLbTXHyO" +
       "jc8hxBgd6905Z5O9\n3WV37nxOISptIIBUqgjoQwRQq1ZREW0REalaqqYR0H" +
       "ek1n8AbQVqFYSo2iBQVSVqqdJvZvZuH3dx\n0trSrudmvtd8j998sy9eQcWm" +
       "gZpEM0RWdGyGxmIzgmFiaUwRTHMOpuLiG8XBmbOTquZHvijyyxJB\n1VHRDE" +
       "sCEcKyFI6Mj2QM1KJrysqSohFLTp6U3Ts+Wf7tqf2NRah6HlXLaowIRBbHNJ" +
       "XgDJlHlUmc\nXMSGOSpJWJpHtSrGUgwbsqDIx4FQU+dRnSkvqQJJGdicxaam" +
       "pClhnZnSscF0ZiejqFLUVJMYKZFo\nhklQTfSokBbCKSIr4ahskpEoKknIWJ" +
       "HM+9EJVBRFxQlFWALCzdHsLsJMYngvnQfychnMNBKCiLMs\ngWOyCp5o9nLk" +
       "dtw2CQTAWprE5IiWUxVQBZhAddwkRVCXwjFiyOoSkBZrKdBC0JYbCgWiMl0Q" +
       "jwlL\nOE5Qg5duhi8BVZC5hbIQtMlLxiRBzLZ4YuaI1nRJ5X8en7nawmIekL" +
       "CoUPtLgWmbh2kWJ7CBVRFz\nxmup0FORw6kmP0JAvMlDzGlGP/3Dg9EPLjRz" +
       "msYCNNOLR7FI4uInA01bV0ffCxZRM8p0zZRpKrh2\nzqI6Y62MZHTI5s05iX" +
       "QxlF382ezPD3/hBfw3PyqLoBJRU1JJNYKCWJXGrHEpjKOyivnsdCJhYhJB\n" +
       "AYVNlWjsN7gjISuYuqMExrpAjrBxRkf8zwfP7da4hr6gXsY07ZiMx0enI0ld" +
       "CekE7VYxWaApIGoS\nBH/hqKnLEjYWRM3ACyakLYRxAUpCM1YWPMwZqq562e" +
       "ejdeutOgVSdJ+mgKi4ePbyrx+YmHzsUR5D\nmneWoQQNgfqQrT5kqQ9R9SFL" +
       "fYirD7nUI5+PKb7N7WIaM4mW1t9fHql5otM870dF8ygoJ5MpIiwq\nGEpSUB" +
       "RtGUtxwnKy1pH/LO0gZysXIX3BmrgCgli5gE/TBmr1pqld3BEYCZB7qyeu/+" +
       "7D+PI5mlE0\nAzZS6dw0iOcxbltle+ze/fc92lpEiZYDNFRA2nZz6XHxw8en" +
       "zr35m3d22eVAUFteleZz0irzmj9j\naCKWAMVs8V/7176PniwefsWPAlC6AF" +
       "5EgJQDJNjm1eGqtpEsclFnAWdFQjOSgkKXsnBTTo4Y2rI9\nw5Knio1pblbA" +
       "UwxPg5Wvm+iLLtbRVz1PNepPzx4YLl77UknXWz+peIM5JQuh1Q6sjWHCC7LW" +
       "Dsec\ngTHMv/P1mSefvnLqHhYLKxgEleipRUUWM8y+23wQ+/oC4BBq2PjUV9" +
       "vPvJUNdr0tfdQwhBUa68xD\nq1u/8QvhWQAOKGBTPo5ZffpyYW/AWZETY1Mc" +
       "bjg4PXDm8iPtf/7DJQvAHAejTfXX+MnU+YcvrPqp\ni4NwRAnmgWx5sSOSjn" +
       "zs2IAwspSnM0Hmz3Jewd0ElTPO7q6h4QGwqA5U0TM1JEuhqCYKSmT8mxcr\n" +
       "Vk+nBvZzW6ocBJHxeKb50nfar7cwGyyVJQ6QtH6XpgXjgF369F8PQWP/P/zs" +
       "7unu6Bns7OsnqNSi\nZOHaSFDPraAKzIVifBybiWRDTd8dbNxJU5CFCTE/tV" +
       "okFAm8cLeXHuLZMkoufv6frz1X3sLTgvI0\nMTF+8G2jM9ourrh4//Ezvaux" +
       "QzJ3svd48xAf/+nB565dIu+ynLcrlWrbnsk38C7BASJDb6ZrS156\nPulHpf" +
       "OohrUogkruEpQUrYh5yBZzzJqMQrCd6+6GgSfiSA6Jmrwo4VDrxQj7HICxOz" +
       "FtWNgAz3Z4\n6ixYqPPAgg+xRJpgDG3svTNXxEHd0AjYh6WMJ0XCPPMnnZnf" +
       "58l87u/xPcMX37vyA/kqy+5y1qyN\nUhbL8iCbcdRckaabtC1w9KWWpLZp3R" +
       "xhevtyevu7B4YI+ux6iqCnY6izp4ugyrl9kVg2uamWqL3p\nE9CK5G+NGoRs" +
       "x0LWbGAARkMbmlBTSecinNWlh2Yjc3MTB6jwIQ7I9L3HFa0t8NRbfPWFo3U3" +
       "fX0O\n5IlsL6YzJPc4Q9LPVqYc3hocXp+3evtd3rIMoFoWbHtO0N9zBAVmJ0" +
       "bHs5BSZWP7lMC2UZ3JzzqU\nxQgbRpospHds8qhzk716VkXfraJWblcMtwy0" +
       "9UbtM2v9T939ceUjwuv3clipc/dLNMz9z7+N2/dU\nigXasyDR9E4Fp7FiY5" +
       "9X2xS7VmTLvPpQ81/2Dpx9sBD4NTnBz80WFy9+/8Kf+t/+40mwYh6VHpiO\n" +
       "jY1GJ8Dg5jXVxcXadOOdRUfkX7ICtXAo7zLkZhpxo0+5geEup865MKjF1Zq0" +
       "WJmNsv+9rQl93V7w\nCLFPehf2zxhyEo7HtHVbeWX+H13S+3eM8yA1OG/BTs" +
       "J9PddxW/0HH3HUd5/3Bc4Mj5LT2779/rnL\nsxt5oPm9cUfe1c3Jw++ObIuV" +
       "Ok217WtpYNSv37H9xROz7y76rWNTI6gILq3QUzFz+29+0K4QerNR\nJdruOR" +
       "zBWiqq5uTy5JVdTVef8SP/Gk1PgWtlTkJcfLmo7WP/q5vbWKMbWBRMHnrvfT" +
       "z/uu26RTNz\nK1yZUrtGpjgx4MtODBjKYcDOG2CAAGWf1CSsWMWv63pOQN9g" +
       "/wDj76Wv0+tsqgY6urs7e6E1q6Ix\n2Gm28OpATEPatdcQPK3WXlv/t6rwc1" +
       "CgPx9ik4/lJG+FZ8cakp1efMb24nBXL4Plr3hcM2i75tn1\nuaa3r6NnmPeb" +
       "1klx81x+GnLZFNI8fR7UOcMXYTKt0e9XvCa6EDQoVS519DrRkPcli39vEVtX" +
       "79v1\nml77K5682W8iZdBzJ1KK4uyrHOMS3cAJmRlVxrss7sIXCPrMrV/CwW" +
       "Q+YBv5LhfxPYCRWxDhacIs\n5pcIalyDGVxF/zk5zhG0uTAHaLBGTvrzBG1w" +
       "00N+2D+cpD8CsAJSOvxxriZr7K6IN7wZC5my/VRM\nx6JMr0mZb70auPOJ3/" +
       "+bnUWlIv+kSD+jQTeYluE6FB5VBWXFZP01XaMfG8SUARdpwg5tK1YVJpfI\n" +
       "P5s1OpvJnK62ucMzE/n95OA6+0nWIXVD+Qdoh7SeLzTQdH6qkJOY4c7Wkm7h" +
       "oKXwvyVjqAUHFgAA\n");
}
