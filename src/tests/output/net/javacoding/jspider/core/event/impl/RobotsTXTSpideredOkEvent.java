package net.javacoding.jspider.core.event.impl;

import net.javacoding.jspider.api.model.HTTPHeader;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEventVisitor;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.net.URLConnection;

import et.util.MyUtility;

public class RobotsTXTSpideredOkEvent
extends net.javacoding.jspider.core.event.impl.URLSpideredOkEvent
{

    protected java.net.URL
      robotsTXTURL;
    
    public RobotsTXTSpideredOkEvent(java.net.URL robotsTXTURL,
                                    net.javacoding.jspider.core.SpiderContext context,
                                    java.net.URL url,
                                    int httpStatus,
                                    java.net.URLConnection urlConnection,
                                    java.lang.String mimeType,
                                    int timeMs,
                                    int size,
                                    byte[] bytes,
                                    HTTPHeader[] headers) {
        super(context,
              url,
              httpStatus,
              urlConnection,
              mimeType,
              timeMs,
              size,
              bytes,
              headers);
        this.
          robotsTXTURL =
          robotsTXTURL;
    }
    
    public byte[]
      getBytes(
      ) {
        return bytes;
    }
    
    public java.lang.String
      toString(
      ) {
        return "robots.txt spidered : " +
        url +
        " (" +
        httpStatus +
        "," +
        mimeType +
        "," +
        timeMs +
        " ms," +
        size +
        " bytes )";
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
      ("H4sIAAAAAAAAALUZaWwU1/l5fR/gA0Oc2GADbsDFu96D9YF/NI5tZMOCjddc" +
       "rtPNePbZDMzuTGbe\n2gtNUauSkOQHUpT0JolaNUKtojYNIlGbKhQl6Rmk1q" +
       "1yVUSpiFDSlChRVYHaVPR7783svJ1dm0Td\nIM3s85vvvt/jqauo1DRQi2z6" +
       "yFEdm77B6LhkmDg+qEqmOQlbMfnl0srxMzuTmgcVRZBHiRNUG5HN\nrrhEpC" +
       "4l3jU61J82UJuuqUfnVI1YdHKobNv48cIrJ3c0F6PaKVSrJKNEIoo8qCUJTp" +
       "MpVJPAiRls\nmAPxOI5PofokxvEoNhRJVY4BoJacQg2mMpeUSMrA5gQ2NXWe" +
       "AjaYKR0bjKe9GUE1spY0iZGSiWaY\nBNVFDkvzUleKKGpXRDFJfwSVzSpYjZ" +
       "v3oOOoOIJKZ1VpDgDXRGwtuhjFru10H8CrFBDTmJVkbKOU\nHFGSYIlWN0ZG" +
       "4/adAACo5QlMDmkZViVJCTZQAxdJlZJzXVFiKMk5AC3VUsCFoNuWJApAFbok" +
       "H5Hm\ncIygJjfcOP8EUJXMLBSFoNVuMEYJfHaby2eCt8bKav770Pi1Nubzkj" +
       "iWVSp/OSCtcyFN4Fls4KSM\nOeL1lO/R0YOpFg9CALzaBcxhBj733N7Iu+db" +
       "OUxzHpixmcNYJjH54+6WtYsD71QWUzEqdM1UaChk\nac68Om596U/rEM1rMh" +
       "TpR5/98VcTvz741R/j9z2oYhSVyZqaSiRHUSVOxgetdTmsI0oS892x2VkT\n" +
       "k1FUorKtMo39DeaYVVRMzVEGa10ih9g6rSOEyuEpgmcL4v8a6AscOqHNaMSc" +
       "PDAZ1ZU4mCs+dmR4\nHieJTydoIInJNI0GWYtDHEwfNhnMtKwZeBpTqGkloa" +
       "vTS9NIUwFqF4qKaCa781CFoB3RVMCIyWcu\n//7e4Z0PPsC9SiPREp2gL4AU" +
       "PkcKnyWFj0rhY1L4qBS+paRARUWM/y3ZtqfOjNOc+8cz/XWnvOaz\nHlQ8hS" +
       "qVRCJFpBkVQ65Kqqot4HiMsGCtFxKDxSMEc80MxDUIFVOBEMsjMPa8gTa449" +
       "fJ+lFYSRCU\ni8dv/PGD2MJZGmo0NBopdS4aOPoIl62mI3rXjrsf2FBMgRZK" +
       "qA8BtP3m1GPyBw/tOvvqHy5tdvKE\noPac9M3FpOnnFn/c0GQch/LmkP/Wv0" +
       "c+fKS075wHlUBOQ1UjEsQilIh1bh5ZadhvlzRqLMCsntWM\nhKTST3YdqiKH" +
       "DG3B2WExtIKt68AA1fCUwnOrFchr6It+bKCvVTziqD1dOrCCef3rZf7Xfln9" +
       "MjOK\nXVtrhSIcxYRnar3jjkkDY9i/9O3xR75x9eQXmS8sZxBUpqdmVEVOM/" +
       "luKQLfr8pTNXxNjY9+s+P0\na7azVznUBwxDOkp9nf7a4trv/EZ6DCoKZLap" +
       "HMMscasYpypAasI2yeHBXbwO8ap17+nL93e8/cZF\nq7IJHdOBei92IvXsfe" +
       "cXPdTEldC7JHO3nWWsd9JVEesn4EYW8nSnktmziidygFiYgUCPHwRqAE60\n" +
       "1/qUuC+iyZI6OvT9C9WLD6e6d3BRVggAo0OxdOvFJztutDERLI5lQvG0/i6f" +
       "l4zdTgGgP0GCdvzf\ntWhbMNgZ6vaGgViNYUPtnYgwzzXCJvMJLTb2ZhdXe5" +
       "ugdoB9CNFXf6GECoe8PVsJKpf5xGHL07Fc\n3eOEBgUMS9gBQdigI+ydhRK2" +
       "p9vbGyKoOGWwvtsLYdAsxuW4oSTAm/NW0z039U9//MqWIR4PTeIw\nJwKOBG" +
       "/g9lXvfsjy0hWdeTq7i8nD63545ezliUZe6vj4szFnAhFx+AjEDFajp0GH9c" +
       "txYNAvbVn/\n1PGJt2a4Jg3ZzWQ4mUqEn3gdd9xRI+dpYcUwpEGpYHqFRW+N" +
       "C94KOd7aQ1CkIN4K+APeQLCXoBXg\nL4iWJFQDyDQ7xNaIIe/6bEm4X5Bwqy" +
       "PhgYJJGPJ7A1vDBFUklATOVH0Qro4JR9utj8+hdH8He9Hy\nLoQSK6EU9cTC" +
       "zqubW659z4M8yxS5PPNlhkJMfqa4/SPP82vaWWMrmZFMXgfdg3nu3J01TjPb" +
       "Veu8\nLWy3fncSIHiUYDsUQrquC+YNO+bFBTNvd5830AuFu5QyNhmHL2V66X" +
       "PwXLB7aJ5eKgbCEUHSbt12\n0pYlipSkK76EFseqb2RycnwES7CZpW2vUJy0" +
       "gmnbG/IG/VCeyg8xjqbdlum7k629VEXWUhFTa4MF\nQqc294S6nTrcHnkSM1" +
       "/+14uPV7XxFk5xWjIDWVYFzMKKyfccOx1ajO5XeN1wVzIX8LEX9j5+/SJ5\n" +
       "i9fBzFRFua1P5wq4TxIGvt5X5+vLnn4i4UHlU6iOnTOlJNknqSk6vUxBxJqD" +
       "1mYEOrP4PfvUx4eG\n/szU2OIupQJb9zzn1D1YZw8Rzgi3Ep5WeBqtsGt0hV" +
       "0RYl3/OENoZ+9NmYGrUjc0AvLheDpfI7ei\n9YQTad19rlGF23zojr4L71z9" +
       "qXKNjSNVLLkHKIYlfSXbEcpHsaab9HwnXDBYlNrHdJM3k602256+\ncF9BWu" +
       "5Wf2cg7A32wPljcmQ06hMVphzvcxnhOBwyc3WlEiLn5AehtNKprrR5iR8hS0" +
       "smhgeGWH9n\n4zTT7XYrUZxcarHyCOy7dqkDO+udJw98VHO/9NJdHivpImAm" +
       "ouleFWygOvnnJrKLFVQ71Gr3t/5t\ne/eZr7gTsISeLcUEzEaLyRd+cv6v4d" +
       "ffPAFJNYXKd49FBwciw2CC1mXZxeT6+eY9xYeU37IAsXIh\n51YlG6k/OwOq" +
       "DExSRnIyKw/aso4yLfA0W8ZvzneUEUy/RBm7aY17DLrrHCZ3Oh2AJ4mU3X96" +
       "nIr8\nJEE9y8Uui9qBOQjRUXr0huIbCHcGQ95Q3+cJWskP5TZHxMh+N0frVk" +
       "vr1s9I6x+B1kTjo4NYGp4W\nVO51VP5ZQdI1FOgMBLx04qq3eW8y23gYUC7T" +
       "+azRB89GyxobP501PExhj6jfzwX9+hz9flEY/bib\n/eIJQOD9gtDg/Q7v84" +
       "XiHQp6w93Q3ucVODJqhj2FBG9+RTQIS0ZoH0e9efyco2OaLGOd5Axx8xq9\n" +
       "a+ZDnD+fR9vg2WR5dNNnFN+vEFQLOTaxRAf8s+AK4dT6l0+d2f5gZ7DHG/ZD" +
       "Zq/OZPaEqw31IujG\nTUs5j155NOVcw/PLYnnD4t2bX9Trf8cHbvtCtyKCKm" +
       "ZTqirOE8K6TDfwrMIUreDTBdf6TYJu/2T3\nheBG+sMs8wZHvkTQ+psiwyjN" +
       "fkXEtwlqXgYRWNEfEeMyHL7yY0B0WysR/gqU1Wx4gqqcP0TQ9yA3\nAZQu/6" +
       "6LEfG+MBP1Zib4vk94vQqOdnk1bR3D7FkjqmNZoZdA6R88X7Ln1J/+wxqnfa" +
       "1B//MARieW\nuV0DSUk9arKBlH6jN6lyyjCAKBscLCdXm5wi/8+CZnHyyvBq" +
       "nzw4Ppw7fPUWcPgKwOm0hA5fBbiM\nhvHs1nwmY2qIQxhV6JTF93/fcTZpCx" +
       "sAAA==");
}
