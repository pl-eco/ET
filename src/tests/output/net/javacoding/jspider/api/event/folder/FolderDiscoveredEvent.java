package net.javacoding.jspider.api.event.folder;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Folder;

import et.util.MyUtility;

public class FolderDiscoveredEvent
extends net.javacoding.jspider.api.event.folder.FolderRelatedEvent
{

    
    public FolderDiscoveredEvent(net.javacoding.jspider.api.model.Folder folder) {
        super(folder);
    }
    
    public java.lang.String
      getComment(
      ) {
        return "folder " +
        folder +
        " discovered";
    }
    
    public net.javacoding.jspider.api.model.Folder
      getFolder(
      ) {
        return super.
                 getFolder();
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
      ("H4sIAAAAAAAAALVYe2wURRifa6/Xp5Q+hGoLLVCVxvauvT5UGqNNH+nBAUev" +
       "qNSaY7s7Vxb2dtfd\nuevhAzUqrxiUgK+IGo2GxBj/kKh/aILE9yvR/iGowW" +
       "gwROMjGmMkisFvZnZv965XGkO9ZPfmZr7X\nfI/ffHMv/oyKTAM1iKafbNex" +
       "6e+PRgTDxFK/IpjmKEzFxHeKSiOH16haAfKEUYEsEVQZFs2AJBAh\nIEuB0E" +
       "Bv2kBNuqZsn1Q0YsmZIWXVirNTH+9aXV+IKsdQpaxGiUBksV9TCU6TMVSRwI" +
       "kJbJh9koSl\nMVSlYixFsSELinwbEGrqGKo25UlVIEkDmyPY1JQUJaw2kzo2" +
       "mE57MowqRE01iZEUiWaYBC0MbxVS\nQiBJZCUQlk3SG0a+uIwVybwV7UCFYV" +
       "QUV4RJIFwUtncRYBIDQ3QeyMtkMNOICyK2WbzbZBU80ZjL\nkdlx8xogANbi" +
       "BCZbtIwqryrABKrmJimCOhmIEkNWJ4G0SEuCFoIunVUoEJXogrhNmMQxgupy" +
       "6SJ8\nCahKmVsoC0EX55IxSRCzS3Ni5orWel/FP3sjfzaxmHslLCrU/mJgWp" +
       "rDNILj2MCqiDnjmaT/YGhT\nsqEAISC+OIeY0/Rd9trG8PdHGzlNfR6a9RNb" +
       "sUhi4tmehiXTfd+VFlIzSnTNlGkqZO2cRTVirfSm\ndcjmRRmJdNFvL7458u" +
       "6mu1/APxagkhDyiZqSTKghVIpVqd8aF8M4LKuYz66Px01MQsirsCmfxn6D\n" +
       "O+Kygqk7fDDWBbKFjdM6QqgYHg88jYh/FtAXQYuHNEXCxoBsiloKvCUNprBK" +
       "/DpB16mYjNNUEDUJ\nkmB8q6nLQDku6PI4pkTjccY6PouENNVdOeXx0CLOLU" +
       "EF8nWY8cXEw6c+vGNwzZ7dPKA0CS2rCboW\nbPA7NvgtG/xgg5/Z4Oc2+PPa" +
       "gDwepn1xttNpFCVabD+93LtwX5v5agEqHEOlciKRJMKEgqFIBUXR\nprAUIy" +
       "xLq1wVwRIRsrhiAhIaTIopIIgVEHg5ZaDluYnrlHsIRgJk4/SOc5/+Eps6Qn" +
       "OM5kQtlc5N\ngwhv47ZVtERvWb159/JCSjTlpcED0ua5pcfEX/auPfL5RydX" +
       "OgVCUPOMup3JSesu1/yIoYlYAlxz\nxD/61/CvB4queaUAeaGYAc6IAEkI2L" +
       "A0V0dW/fXaWEadBZzlcc1ICApdsgGojGwxtClnhmXQRWy8\nEBxQDk8RPNVW" +
       "BtM5RBer6auG5xv1Z84eGFKeudfXfvyN8neYU2xQrXShbxQTXqJVTjhGDYxh" +
       "/uRj\nkQMP/7zrZhYLKxgE+fTkhCKLaWbfYg/EviYPXPjrag8+0nLouB3sGk" +
       "d6n2EI22ms0/dML3n8PeFJ\ngBIoaVO+DbOK9WTCXodtkYP9azkAcbi649Cp" +
       "nS3ffPGJBWmuo9Kh+iF2X/LV+49OF1AXl8KhJZjr\n7BpjhyYdedhBAmFkKU" +
       "9nSpk/y3gZdxCLs6ujsxMMqgZN9JD1y5I/rImCEhp45lj59P5kz2puykUu\n" +
       "gtBALN34yfMt55qYCZZGnws1rd/FKcFY55Q//QoSNHyBOLSqo6e1s7OtqwdC" +
       "xilZxGoJuuI86JLQ\nJKxYsGKHmL5b2biNph4LD2L+WW6RUATIxbohepzb5Z" +
       "OYuP2Pt54qa+LpQHkaXGIut6Q4iuxV8PmS\n2Y5Edpzvuum3ip3C27dw91dn" +
       "I96gmkx0P30Ct1xfIeZB2VKi6W0K+FJxdpGrbS1rFextVN7Y+O1Q\nz+E7c7" +
       "dRSLHenazZbDHx2EtHv+o+8eV9YMUYKl63PtrfFx4EgxvPqy4mVqXqNxRukd" +
       "9nGWRh2owG\nJ5up171NSG8DQ3+mjmald1MWuCyFp9YCl9p84OKK0SzJMGem" +
       "rCWobBKTfi2RgOxkJAFeY6OuGuti\nC530tXEeKiDY3trR0dbZTlCNo/sKs4" +
       "m7xC6HhQya6Cnn530fYiurs3xE24c6y0d1/5OPbgZPgJ1D\nTrFaLppwuajb" +
       "cZE4Hy7qYi4CoKvOqM54iCq5Op83WuFpsLzR8N+8YaO7a3vbXNvrcbanzMf2" +
       "rm4N\nAgZ2EgBZGUBXy4Bg25wtFpNxA+eaO3iTALOCKGKdABbUu7EgYsgJgP" +
       "uU1Y6/MvZ7u3T6ygGOWHXu\na56bcDh4DjfXfP8rw62c4ytPz5+jZP/S504f" +
       "OTVSy1GPX4xWzLibuHn45YhtpUKnuLvsfBoY9dtX\nLntxx8jXEwWWC/oJ8q" +
       "Y0ehv1MXvbURquOnlDQ1uCuhn3U36LEpdPb175ll71Aeu0MjedEjg440lF\n" +
       "cWGbG+d8uoHjMrOjhDdQPLnuPv955+6msw/Kuzj/vQQ1zcVPUBH7dvPthEvj" +
       "7HwEFcLbTb8H7rr5\n6SF3rZGb/gGCFmTTA8I6P9ykD4I2IKXDh3R34e13FV" +
       "6QdpCu7iWqY1GmDU762de9G/Z99jc7gopF\n/u8AvRGLZoDVVKBPFZTtpmxa" +
       "/xzQW4KYNKADJuystgJUbnKJ/AZc7/6/IqOreXRTZJAnYRdsh9nW\nEey6qn" +
       "0+oKC7taO7LQiiiqIbI4MjF3zN2mGgS/I5jG3CAkfatEO1LnCOGNqTuBd12x" +
       "4bmFb9N6NG\nsCIQyyKOUgfcnuuYD89d0xoMtgWhkfSODoeiF+44auUTlrR/" +
       "AcbWGpLvEgAA");
}
