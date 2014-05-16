package net.javacoding.jspider.api.event.resource;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.ParseIgnoredResource;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;

public class ResourceIgnoredForParsingEvent
extends net.javacoding.jspider.api.event.resource.ResourceRelatedEvent
{

    
    public ResourceIgnoredForParsingEvent(net.javacoding.jspider.api.model.Resource resource) {
        super(resource);
    }
    
    public net.javacoding.jspider.api.model.ParseIgnoredResource
      getResource(
      ) {
        return (net.javacoding.jspider.api.model.ParseIgnoredResource)
                 resource;
    }
    
    public java.lang.String
      getComment(
      ) {
        return resource.
                 getURL() +
        " ignored for parsing";
    }
    
    public void
      accept(
      net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.
          visit(
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
      ("H4sIAAAAAAAAALVYe2wURRif6+P6lNIXFEppgfpoaO/a64OUJsamlPTKQY9e" +
       "fVBKzu3uXFnY2113\n59orKhFfoCYkiM8ENRoNiSH+IVH/0AQN+JZE+4eiBq" +
       "PBEIxiNMZIFIPfzOx297alDUm9ZPfmZr7v\nm+/5m/nu2EWUaxpohWgGyKSO" +
       "zUBPLCoYJpZ6FME0h2AqLr6fWxA9uknVspAvgrJkiaCSiGgGJYEI\nQVkKhj" +
       "d0pQ1Up2vK5JiiEUvODCnr11ye+Gx/f3U2KhlGJbIaIwKRxR5NJThNhlFxEi" +
       "dHsWF2SxKW\nhlGpirEUw4YsKPIeINTUYVRmymOqQFIGNgexqSnjlLDMTOnY" +
       "YHvakxFULGqqSYyUSDTDJGhxZJcw\nLgRTRFaCEdkkXRHkT8hYkcy70F6UHU" +
       "G5CUUYA8IlEduKIJMY3EjngbxQBjWNhCBimyVnt6yCJ2q9\nHNMW128CAmDN" +
       "S2KyU5veKkcVYAKVcZUUQR0Lxoghq2NAmqulYBeCll9VKBDl64K4WxjDcYKq" +
       "vHRR\nvgRUBcwtlIWgSi8ZkwQxW+6JmStaA/7ifx+N/lXHYp4jYVGh+ucB00" +
       "oP0yBOYAOrIuaMl1KBJ8Lb\nUiuyEALiSg8xp+m+/q1bIxdO1HKa6lloBkZ3" +
       "YZHExcsdK2qmun8syKZq5OuaKdNUyLCcRTVqrXSl\ndcjmJdMS6WLAXnx38I" +
       "Nt972Kf85C+WHkFzUllVTDqACrUo81zoNxRFYxnx1IJExMwihHYVN+jf0G\n" +
       "dyRkBVN3+GGsC2QnG6d1hFAePD54ViH+KaEvgupoaqYMEYfHVM3A0kbNoPUB" +
       "Ue8dxyoJ6AT1q5iM\n0JwQNQnmR3aZuixhY0TQ5RFMiUYMS8bIfMLSVJ+SCZ" +
       "+PFra3LBXI4T5NAdFx8ei5T+7p3fTIAR5k\nmpiWJQT1gToBR52ApU4A1Akw" +
       "dQK2OoG51UE+H1NkaWZMaJAlWou/vN61+GCT+WYWyh5GBXIymSLC\nqIKhhg" +
       "VF0SawFCcsiUtdBcPyFJK8eBTyHTaKKyCI1RcEYdxAq7157aBBGEYCJOvU3i" +
       "uf/xqfOE5T\nkKZMBZXOVYME2M11K26I7ei/88DqbEo0kUNjC6T180uPi78+" +
       "uvn4l5+evcmpH4LqZ5T1TE5all71\no4YmYglgzxH/9N99vx3O7XwjC+VArQ" +
       "PaEQFyFKBjpXePjPLssqGOOgs4ixKakRQUumTjUyHZaWgT\nzgxLpuvYeDE4" +
       "oAieXHjKrQQvpS+6WEZf5Tz1qD89NjAgvfSAv/mrd4reZ06xMbfEBc4xTHgF" +
       "lzrh\nGDIwhvmzz0QPP3lx/3YWCysYBPn11Kgii2mm31IfxL58FjQJVFU88V" +
       "TDka/sYJc70rsNQ5iksU7v\nm6p59kPhOUAaqHhT3oNZQfumw16FbZG9PZs5" +
       "PnE0u+fIuYcbvv/6tIV4rpPUofop/mDqzYdOTGVR\nFxfAmSaYW+xyY2cqHf" +
       "nYOQNhZClPZwqYPwt5RbcQi7MtFOoAhcpgJ3oGB2QpENFEQQlvePG9oqlD\n" +
       "qY5+rsp1LoLwhni69vQrDVfqmArWjn4XqFq/88YFY4uDBPQrRFBs4dBpfcu6" +
       "xrZQU3snQfk2Ewtf\nBUENc6BOUpOwMg02dsTpu5GNm2gmsmgh5q7VFgkFBC" +
       "8KbqSHv11NydG7/zz5fGEdzw7Ks8Il5gZL\nirORvQohqLnaAcoO//13/F78" +
       "sHBqB49GWSYA9qqpZPsLZ3DDLcXiLPhbQDS9SQHXKo4V3t02s4uF\nbUbJ7b" +
       "U/bOw4eq/XjGx6CrhzN5MtLr732olv28988yBoMYzytgzEerojvaBw7Zzbxc" +
       "XS8eqt2Tvl\nj1hCWRA34zqUydTlNhOy3cBwm1OHMrK9LgNraFQrLaypnA1r" +
       "XDG6SjLMmymbCSoaw2TQnYxBXnND\nrppbxxZa6evWha2IUEtjS0tTWztBFS" +
       "49bjTruH/s6miftzrYpdvaxhaDGHt/hldXwrPM8uqy/8mr\n2wkqBGt6tGQS" +
       "rHQ7ddTl1E7HqeICO7WdOrW1maByR40ZPl3MjgJ6qwjwa/hs7mqEp8ZyV821" +
       "ucs+\nP1zmJx3zW5sd89UFNr+zMdTa1NZKANFlQHhohCyTm+a92jEZt3Gu+Q" +
       "MtwzEsiCLWCSBNtRtpooac\nhLNl3GoN3hj+o1k6v3YDx8Mqd8vpJuwLXcH1" +
       "5Rd+Y6joOStn6T88mxxa+fL54+cGKzim8iZtzYw+\nyc3DGzVmSrFOUX3VXD" +
       "sw6lNrVx3bO/jdaJblgh6CcsY12hn7mb7NKA1XsbljRC8iVTOaZt7aiaun\n" +
       "7rzppF76MbvfTbdf+XBcJ1KK4oJQN5z6dQMnZKZQPr+28YS7f+6DNfM67z2V" +
       "93EZD0ETM58MgnLZ\nt5vvAHSzV+cjKBvebvrHoAmfnR4S2Rq56Q8StCiTHm" +
       "DH+eEmPQS7ASkdPq67C/KwC4/adbtMbr72\nDmgQKwLBEgsvTaQK1wUspmNR" +
       "pne09Etv52w9+MU/7NjME/n/H7TnF80gq9Rgtyook6ZsWv+N0EZH\nTBlwiS" +
       "fsfmFFu8jkEnmPX+3+R2Z6r/qhbdFentpt4BdmZEtbW6htYbGmtbkxFGoKdU" +
       "AVDPWFYwvZ\nPu410LLZvMgssyAZlTFAWeRAOb1cuRd1S7P/ANzCS+juEgAA");
}
