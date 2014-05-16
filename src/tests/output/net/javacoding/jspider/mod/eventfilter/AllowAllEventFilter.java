package net.javacoding.jspider.mod.eventfilter;

import net.javacoding.jspider.api.event.JSpiderEvent;

import et.util.MyUtility;
import net.javacoding.jspider.spi.EventFilter;

import et.util.MyUtility;

public class AllowAllEventFilter
  implements net.javacoding.jspider.spi.EventFilter
{

    
    public boolean filterEvent(
      net.javacoding.jspider.api.event.JSpiderEvent event) {
        return true;
    }
    
    public AllowAllEventFilter() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVXa2wURRyfu2uvvfawT6ChhZZSCQ10DxCKtCba9BGuXNuz" +
       "h1FqybG3O9du2dtd\ndufaA5FoREA+mBDwlaDGRENiiB8k4BcTJIBvEtMPgh" +
       "qMBkMwCsEYIzEY/M/MXm9ve4UPNtm92Znf\n/zH/d0/cQMWWiRokSyC7DGwJ" +
       "3bGoaFpY7lZFy9oCW3HpQnEgenyzpnuRJ4K8ikxQRUSyQrJIxJAi\nh8I9nR" +
       "kTNRm6umtM1YnNZxaXjmV3pr4+0F/vQxUjqELRYkQkitStawRnyAgKpnAqgU" +
       "2rS5axPIKq\nNIzlGDYVUVV2A1DXRlC1pYxpIkmb2BrGlq5OUmC1lTawyWRm" +
       "NyMoKOmaRcy0RHTTIqgyMiFOiqE0\nUdRQRLFIZwT5kwpWZWsn2ot8EVScVM" +
       "UxAC6IZG8RYhxDfXQf4GUKqGkmRQlnSYp2KBpYotFNMXPj\nls0AANKSFCbj" +
       "+oyoIk2EDVTNVVJFbSwUI6aijQG0WE+DFIIWzckUQKWGKO0Qx3CcoDo3LsqP" +
       "ABVg\nZqEkBM13wxgn8Nkil88c3hryB/89FP27ifm8SMaSSvUvAaIlLqJhnM" +
       "Qm1iTMCW+nhaPhrekGL0IA\nnu8Cc0zXgx89Ebl+ppFj6gtghhITWCJx6U57" +
       "w+Lprl8CPqpGqaFbCg2FvJszr0btk86MAdG8YIYj\nPRSyh58Mf7r1uffxb1" +
       "5UGkZ+SVfTKS2MAliTu+11Cawjiob57lAyaWESRkUq2/Lr7BvMkVRUTM3h\n" +
       "h7UhknG2zhgIoRJ4PPBUIf4XpC/wQJeq6lPw6p3EGulTVHCzYBD0iIbJKA0E" +
       "SZchBEYnLEORsTma\n0uVRTKFJBh0tSJ6hYiumPB6av+7sUyFUN+kqMItLx6" +
       "9+uad380sHuS9p/NkKE9QBCgg5BQRbAQEU\nEBwKCAUUQB4PE70w39jUezJN" +
       "st8/7Kx8uc067UW+ERRQUqk0ERMqhuQUKTMsxwmLzipHJrAAhOgN\nJiCQQZ" +
       "+4CoxY4oB1J03U7A7YXJqHYSVCFE7vvfvNzfjUSRpbNBZqKXeuGnh2B9ct2B" +
       "rb1r/9YLOP\ngqaKqNMA2nJ/7nHp5qGBk99+dWVFLjEIapmVr7Mpab651Y+a" +
       "uoRlqGc59q/9s+nWkeKNp7yoCJIY\nyhgRIfigJixxy8jLu85sDaPGAsrypG" +
       "6mRJUeZQtPGRk39ancDgufefRVxSOJGsulICt/t1/wr770\ncfkFduNspaxw" +
       "lNQYJjzvqnK23mJiDPtXXo8eeeXGgaeZoW1LE+Q30glVkTJMkYUecGxNgRog" +
       "1NUe\nfbX12KWsJ2ty3LtMU9xFHZl5fnrxG5+Jb0J9gDy1lN2YpSFiklBWAH" +
       "2vZOtVjkP63WxDaHC5c6iP\ndoisZ1KJZ/4691ZZE1eG0jQ4ZSxj7+X2Del6" +
       "RZZzTnjDTKTV4ayQ3u4BXut4Zdxz7Or+1p++u2hX\nT0dXzqF+je9Ln37xzL" +
       "SXejUA/VG0BrM5zfozXXlYz4LIYVlGdwLswmW8bHQQVMoo2ze08+vUErR8\n" +
       "jmIAP4Ij8TNwgcVzdQ7W9Q489Udwv3h+G79FdX6B6NXSqfVvX8atjwWlAhUp" +
       "QHSjTYXao+Y845Y2\nwDpq1jUVTzb+3Nd+/Fm3a1hddBo6nywunf3gzA/rL3" +
       "+/D7QYQSWDQ7HurkgvKNx4T3FxqWqy/nHf\nuPI5c4BdAmbNAflEnc5rgmtM" +
       "DGOMtiXPNU1M90rQvByetfA8YHcR9ksPq+mrhqcrfa0rGOAe+/r0\n+2Hu74" +
       "GcvzeAWaohsOj4JiiyENElUQ33vHO2fPpwur2f+2yeAxDuiWcaL77XereJXd" +
       "gOML+jH9vf\nJZOiOZjzJf0ZJKj3//S4jjXrVj20pm3dRoKKGTgbq21zxKoI" +
       "scqAQn+M7TB29y8EYQI1kwllBGCj\nemfoRE0lBVedtIecUyN/rpavrezhxq" +
       "pzDs9O4Ka1d3FLzfVbLMxdmVpgknIJObzk3Wsnrw7X8iTh\n4+ayWROfk4aP" +
       "nOw+QYOm6dJ7SWDo8yuXntg7/GPCa9vhUYJKErquYhGmLD9TeQ3KEFRTwD20" +
       "KNfN\nGvv5cCo1T29fcc6o+oI1spkBshSiJplWVUcuOPPCb5g4qTBFSnl/4u" +
       "Erz12cXJMKuNHxxVwtcR5j\nMFfPzYMgX8oe0m38BPw7UBgPJrJXTnyKoAfy" +
       "8QSV5T6cUChzPoDS5c6Z6lvJ2hsdgwRe6zPGf1j8\niBOdDQAA");
}
