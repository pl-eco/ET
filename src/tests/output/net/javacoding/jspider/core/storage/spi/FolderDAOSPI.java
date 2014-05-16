package net.javacoding.jspider.core.storage.spi;

import net.javacoding.jspider.core.model.SiteInternal;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.FolderInternal;

import et.util.MyUtility;

public interface FolderDAOSPI {
    
    public net.javacoding.jspider.core.model.FolderInternal findById(int id);
    
    public FolderInternal[] findSubFolders(
      net.javacoding.jspider.core.model.FolderInternal folder);
    
    public FolderInternal[] findSiteRootFolders(
      net.javacoding.jspider.core.model.SiteInternal site);
    
    public net.javacoding.jspider.core.model.FolderInternal createFolder(
      int id, net.javacoding.jspider.core.model.FolderInternal parent,
      java.lang.String name);
    
    public net.javacoding.jspider.core.model.FolderInternal createFolder(
      int id, net.javacoding.jspider.core.model.SiteInternal site,
      java.lang.String name);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYf2wb1R1/thMnTkzzs2lG0iaUohIR20maOAn5Y2T5obo1" +
       "jRuDumZB7vnuOb32\nfHfcPScu66pNFAr7YxuibENjoGmbqiHEJBDljzEVVG" +
       "BjotKUf2CbNm3qhJi2TqBpAk1M3fe9d5d7\ndlwH4RHpLu/efb/v++vz/XF+" +
       "7hqqty3UK9tRcsrEdnQmnZIsGyszmmTb98BWRn6jPpS6cFA3/MiX\nRH5VIa" +
       "glKdsxRSJSTFViidmpooX6TUM7taIZxDln0yl33vrJ2tvnDvQEUMsSalH1NJ" +
       "GIKs8YOsFF\nsoTCeZzPYsueVhSsLKE2HWMljS1V0tQHgNDQl1C7ra7oEilY" +
       "2F7EtqGtUsJ2u2Bii8l0N5MoLBu6\nTayCTAzLJqg1eUJalWIFomqxpGqTqS" +
       "QK5lSsKfb96AwKJFF9TpNWgLAr6VoRYyfG5uk+kDepoKaV\nk2TsstSdVHXw" +
       "RF85x4bFew4CAbA25DE5bmyIqtMl2EDtXCVN0ldiaWKp+gqQ1hsFkELQzTc8" +
       "FIga\nTUk+Ka3gDEHd5XQp/gqoQswtlIWg7eVk7CSI2c1lMROitRAM//ebqY" +
       "/6WczrFCxrVP8GYNpVxrSI\nc9jCuow548eF6PnE0UKvHyEg3l5GzGmmb3v5" +
       "3uT7l/o4TU8FmoXsCSyTjPxJvHfn+vRfQwGqRqNp\n2CqFQonlLKop581U0Q" +
       "Q0d22cSF9G3ZevLr559OvP4r/7UWMCBWVDK+T1BAphXZlx1g2wTqo65rsL\n" +
       "uZyNSQLVaWwraLBncEdO1TB1RxDWpkSOs3XRRAg1wOWDqwvxvxC9EbRt3tAU" +
       "bM1OL6RTiahJUFzH\nZJkiQDYUiP3yCdtUgWBZNiy8bANqIYrLsLdcylikkl" +
       "rWfD6asuUJpwE69zPyjHzh6m9Ozx189BEe\nPgo5R0eCRkF01BMddURHqeio" +
       "IzoKe1FRNPL5mNAdpZ6loVJoRv3jhanWb0Xsi34UWEIhNZ8vECmr\nYchESd" +
       "OMNaxkCINimwB7hjaAajgLqAVNMhocxLIEXLlqod3l6PRyOgErCSC3fub6b/" +
       "+ZWXuRAokG\nvpOezlWDMJ7kuoUH0vcdOPbI7gAlWqujESmybNxBpZS7cZ7W" +
       "Bff8fPar/778dFM/P5/y9LoHgLBy\nTlorPn4wOPTOK81vMMe7ZaVFqD9pTD" +
       "hI2zxd77Ewhv0/fj/1+BPXzn2FKco1DRDUKGXBbEkmBBzr\nViGCgmYhq6my" +
       "YElHhTyKdnee/+7AU+9UNGDnjdKfla5zX/4w/LD0+n08SdtLAz+nF/Jjz7yL" +
       "B+4K\nyxUwFiKGGdHwKtY89cql3c3KouvpliN9f5mPX/hauaKsOWGXZ27m7l" +
       "K2jPza85f+MPbu78+CFkuo\n4dBCemY6OQcK91UVl5HbVnsOB46rv/azokwL" +
       "XIViXso0JZoJPcHC0It06jC6EypuhmzKMmSsQMPy\n5H7vP/s/eLx+8iU/qo" +
       "MqDX2KSFBdoOjvKhdeUlinXDRRUcDZnDOsvKTRV25naSLHLWPN22HF4ia2\n" +
       "bgVPNsMVgSvslCb2n75sp7cOXloY9W52v40j0E/Xe+ltwMGaj94HIS4dHoKn" +
       "LUs6RZOt+I31nU/+\nSvohFGwonLb6AGZ10cfOohWkRwxmylLzUJpXnd7x0t" +
       "K/hpT37pjlkOsWZxKRcP/Idbyn4/0PGPBC\nMCBI9qEN9G1uUGVCHtv1k/de" +
       "vLrYyWHLu/itmxqpyMM7OXNQ2KSJc0s1CYz69Ttuee7M4p+y1BLK\nFyMoAM" +
       "kLacvUHSt1Jb3fRcPh5CZ9noLMz8FJXzqVUEBkt+g23h25OaefuvrwwJ9/d8" +
       "Xpt4LPPKq/\nZc4WLj50aZ1hvcxhbKKjKx+bcgCKrFRzRNN7E+86KeJw7hsd" +
       "HgOF2kESnQCjqhJNGrKkJWZ/9Frz\n+mOF+AGuyk0CQWI2U+y78tOB6/1MBU" +
       "diUGjpznPDqmR5sTTpv8MEffGzdcs7h0cGh4cjo2PQd1xX\n7rX7edoyp3cS" +
       "NFStHeYNBWtOI0zQ2qtLGmKc8ZK8moVrm5NX22rMKxcMbsrQ50M8BhkhBuPs" +
       "xSK9\nHavBQ6ODo2OReByAmWNv6HlHtkbnUZhpqEvThSw/0aYNUQAfKwgUe2" +
       "fXDl67vfejH/iRvwr2Kgyj\nGydk5BcCez70/6JrD6uZdVnJ5vAsn+I3D+kl" +
       "szdTvLkkbl+oEjfR8ScFx8cZKo+YpuluTsbH4140\n8jVFA/AanyBoR6lzN1" +
       "BbCXxzcLU6RrR+fuBbE3ww6ZlbrMHc+ODYUCQ+TmijINjNyOjWGZkGcjcf\n" +
       "twbr/QR1MH8C16JhEBex9N3KJjzcyJWiLx4UfDFRCQ9Cdj5Uk4MoHiYJ6q2g" +
       "f1VQ3AtXu2NJ+/8J\nFAE+ktLHedEb3/a8MTLsGf6dGgyfGBydjIwP0TFXgh" +
       "mIfRYcEWWeF2SOeDKfqEnm+EhkYh/hQ56L\nxlY25NAPlij/Tt8ab48SFJYt" +
       "LBHsRErQ+2lB7yFP72dq0htAMgFNbrsodAMdzHWVIHIYrk4HIp2f\nM0R+Jp" +
       "g96pn97Gc3e2SIQoR2LlY86GmnRYnPCxLHPIk/r0lifCIyPkm8r4AntwbDj6" +
       "uA4aKg4z5P\nx5dr0pGCYbg6GKBmh0VG+jnaven3O/4rk7x7/djtl822t3jz" +
       "dX8JaoTZLVfQNOF7SPw2CpoWzqnM\nyEb+HcIt/iVBez/l7w8wMcOdeeUVzv" +
       "wqDOqfgpmgBmclMl8mqKcKMwSV/hM53iSoqzIHSHBWIv1b\nMBOV0hPU5D2I" +
       "pG+DcUBKl1fMCpWGj+5F83+aK2vznhUAAA==");
}
