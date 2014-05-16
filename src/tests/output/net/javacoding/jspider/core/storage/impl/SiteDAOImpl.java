package net.javacoding.jspider.core.storage.impl;

import net.javacoding.jspider.core.storage.SiteDAO;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.SiteDAOSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.SiteInternal;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

class SiteDAOImpl
  implements net.javacoding.jspider.core.storage.SiteDAO
{

    protected net.javacoding.jspider.core.logging.Log
      log;
    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected net.javacoding.jspider.core.storage.spi.SiteDAOSPI
      spi;
    protected int
      counter;
    
    public SiteDAOImpl(net.javacoding.jspider.core.logging.Log log,
                       net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                       net.javacoding.jspider.core.storage.spi.SiteDAOSPI spi) {
        super();
        this.
          log =
          log;
        this.
          storage =
          storage;
        this.
          spi =
          spi;
        this.
          counter =
          0;
    }
    
    public net.javacoding.jspider.api.model.Site
      createSite(
      java.net.URL siteURL) {
        int id =
          ++counter;
        net.javacoding.jspider.core.model.SiteInternal si =
          new net.javacoding.jspider.core.model.SiteInternal(
          id,
          storage,
          siteURL);
        spi.
          create(
          id,
          si);
        return si;
    }
    
    public net.javacoding.jspider.api.model.Site
      find(
      java.net.URL siteURL) {
        return spi.
                 find(
                 siteURL);
    }
    
    public void
      save(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.core.model.SiteInternal si =
          TypeTranslator.
            translate(
            site);
        spi.
          save(
          si.
            getId(),
          si);
    }
    
    public Site[]
      findAll(
      ) {
        return spi.
                 findAll();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVZe2wUxxkf353fBr94FRtsiClY+M6+O59tsNTEsY04OGzH" +
       "Z0JxHF3We3NmYe92\nszt3PiilrUpCGqmRoqRtqtDQVqlQo4hGoaR/JC1FCe" +
       "kTqfEfSfoIagVK0wcRUVqB2lT0m5nd2729\nwxDO0q7Hs9833/s334xfvILK" +
       "dQ21irqPHFSx7huOTgiajuPDsqDrUzAVE8+XV0+c3JlSXKgsglxS\nnKD6iK" +
       "h3xwUidEvx7vDIYFZD7aoiH5yTFWKsU7DK1rs+mf/tsR0tblQ/jeqlVJQIRB" +
       "KHlRTBWTKN\n6pI4OYs1fSgex/Fp1JjCOB7FmiTI0iEgVFLTqEmX5lICSWtY" +
       "n8S6ImcoYZOeVrHGZJqTEVQnKimd\naGmRKJpOUENkv5ARutNEkrsjkk4GI6" +
       "giIWE5rj+MjiB3BJUnZGEOCFdETCu62Yrd2+g8kNdIoKaW\nEERssngOSCnw" +
       "RJuTI2dxx04gANbKJCb7lJwoT0qACdTEVZKF1Fx3lGhSag5Iy5U0SCFo9U0X" +
       "BaIq\nVRAPCHM4RtAqJ90E/wRU1cwtlIWg5U4ythLEbLUjZrZojVfU/e/xiW" +
       "vtLOaeOBZlqn8lMK11ME3i\nBNZwSsSc8Xra93R4b7rVhRAQL3cQc5qhDT/Z" +
       "HfngbBunaSlCMz67H4skJn7S17pmYehytZuqUaUq\nukRTIc9yFtUJ48tgVo" +
       "VsXpFbkX70mR9/Pvnm3i+/gP/hQlVhVCEqcjqZCqNqnIoPG+NKGEekFOaz\n" +
       "44mEjkkYeWQ2VaGwv8EdCUnG1B0VMFYFso+NsyriP2Xw+I1xPX0RtCQqETwy" +
       "NB5OqrJPJagvhckM\nTQBRiUPoZ/brqhTH2oyoaHhGh6SFIM5IQDyTx5ilgu" +
       "rny8poxTrrTYbk3K7IsExMPHnp14dHd37t\nMR49mnGGigT1gmifJdpniPZR" +
       "0T5DtI+K9tlEo7IyJnRlvmNppOK0oP758mDDE179FRdyT6NqKZlM\nE2FWxl" +
       "CIgiwr8zgeIywTG21Zz5INMrVuFpIWNInJsBArEvBkRkPrnclplXQYRgJk3M" +
       "KRG7/7MDZ/\nmuYRjfsyujpXDaJ4gOtW1xl9cMdDj613U6J5Dw0QkHbcevWY" +
       "+OHju06//Zv3NllFQFBHQW0WctLa\ncqo/oSkijgN2Wct/6z/brz5VvuWMC3" +
       "mgYAGyiACJBvW/1ikjr8YGTbyizgLO2oSiJQWZfjJBpobs\n05R5a4YlzhI2" +
       "bgAH1MJTDk+rkaUr6Yt+bKKvZp5m1J8OGxgaXv9qRc87r9WeZ04xgbPehrBR" +
       "THgZ\nNlrhmNIwhvn3npl46htXjj3AYmEEg6AKNT0rS2KW6beyDGLfXAQSfK" +
       "uWPf3NzuPvmMFutlYf0jTh\nII119isLa779C+E7ABdQtrp0CLOqdDNJbmBa" +
       "hc0lR4d3cZDhkHT4+KVHO//8+wsGbNm2Q4vqb7Gj\n6VceObvgoi6uho1J0M" +
       "fM0mIbIx2Vsc0CwshSns5UM3/W8Or1E4Mz1BP0g0JNIIlupD4p7osooiCH\n" +
       "R753rnbhyXTfDq7KEhtBeCSWbbvwg84b7UwFQ2KFDRmNvyszgjZmVT39FSDo" +
       "7jtDna2BYFegzxsM\nEuSWFZ52ywjauBiQAN0cnYwY9N3c+q026wPsQ5C+Bk" +
       "vSLRjyhkC3SoPK1C9wO0AHc74oH0cnwnZV\nh2yqBi1V7y1J1VDI27cF3Agc" +
       "n15NvhioaRYKfXexsZcWMEtyxJRfb5BQHHVuFNto42OCUHL2C/9+\n/bmadl" +
       "5UlKeVLeOB1Gyx10oeV0x8+NDx4EJ0j8Rz1NkSOIgP/Wz3c9cvkIsMMSyco9" +
       "LWZQsVvF+w\nQfDA25nGipdOJF2ocho1sLZOSJH7BTlN8WQaak0fNiYjUCv2" +
       "7/lNFi/jwRyOtzox1ibWibDWDgrj\n/LK2QHUpPCvgaTRAtdEBqmWI1WGUMX" +
       "Sw98YcBFarmkJAPxzP2qrMSMW9VioGBhyYwV09cs+Wc5ev\n/Ei6xnChhvW2" +
       "Q5TDULqazdjAyq2oOu2ibG28sVLHuKoPMrG9BNUwsf7efn8fQZ+707zv7Rrw" +
       "0gWq\npraHoxQa6OrT3M4j0K0VmkOVMNyImliKLWVoTyPpG02lk/aP0NRU7p" +
       "kMT02NjtGFB/juRd9jecFZ\nx+lNvmLBSdDXbgeWGFGQbFHYwj48YHNQsOfO" +
       "gSEY6Ood8IZCBNUxDxmkVMR+S5cj9O9ZgjyTo0Mj\ndHz3zQxdA0+zYWhzcU" +
       "M1w9AcEhlGpm2o11NgZG/fnRvZ29/lD3n9A2YaABtdPsN1oEOm2LabGbUa\n" +
       "nuWGUcuLG3XYjJ6opOlxzYlhE5qUhF0yY5xUzkx/3BN/f/MIx7BV9hOwnXB7" +
       "4AbuaP7gKkev/F2/\nCPY5hDy59vn3T1+aXMZbSH5mvKvg2Gbn4edGFo06NQ" +
       "s2rFtMAqN+Y/O6F49MXpzlljTlN+m0XEIn\n3sWd99SJRc4DbjjZQgvGg86c" +
       "ny1EKGTuJ9aW02q00rbk+bqtQvpVc4PbfDsbnJEr1Nw1NzuUMlOP\nff6juk" +
       "eFNx50GTvdIyCTKKpXxhksW5uec5Fd7Axu4nv9nra/bOs7+cViu16rPWPy2W" +
       "LiuVNn/xh6\n9w9HwY/TqHJsPDo8FBkFl7ctKi4mNmZa7nPvk37J4NnYgApu" +
       "DvKZBvO3nRoNk7SWmsrbfNrzOvqN\n8Kw1KmRtsY6evj5btHcoKwzmCRsShK" +
       "z+57slwFxPV6DfGxygkAYfdk9GzBSpY+BO8wQmb93dPAuQ\nJGpYIJgKsCv9" +
       "Q5vSvZbSL5SktN/vDULT1myJ3Ki383CYBmy4SY4L0LcllTjmh2nEyJ/JCxrd" +
       "lDYY\nQdtQctB+bLN/i2X/mRLs7+8KgP0BK2h0wedvHaSXCL0nScXt6r1mU2" +
       "/AUu+nJalHwwPt/xIqLBcY\nuuypYv5ug6fT8Hdnyf4+bxnU22MZ9GYJ26Sf" +
       "+Ru6CQ/1N7Pj1s4+R8mFDK+FL6mc4ShMZhR6XcvR\nvaeYP1rg8Rn+8H06f6" +
       "C8rWER7d6C5KHRGZJleqlg22jZwZ1i2tH5nVc2tV571oVcixyti1xZ5laI\n" +
       "iS+7Oz5yvbqig12neGYFnSOl86638Co374aWaVyb56P6RXxkz4Y/2bIhwDqS" +
       "U6qq5iaDfr+VIhdL\nSJE+mvOBfoIaDK/m0h7B6aHWRk3vSVYVXMzz62Nx/c" +
       "JDm15XG3/F/WVe8VZFUFUiLcv2I49tXKFq\nOCExc6v4AYjbfpmgTbd7swh5" +
       "SX8xZ1zi7H+Frug22B2ducH8d4JaFmEGcfSXneMKQSuKc4AEY2Sn\nv0rQ0n" +
       "x62IKsP+ykH0NLBaR0+K9cD9RgnV74OTRrFIJ57omqWJTo5U/2+6967nvirf" +
       "+yTqFS5P8d\nof8RgJNaRgJI6B5KCfJBnR176Td6gyqmNQ2nCOuUjDjV6nxF" +
       "/h+AFvtBLyerY2rvxGjhWa83VHKX\nDyt4aJd/p/fNcCr8TDHvMI3tZz+qu2" +
       "gI+z9u4D6ayxoAAA==");
}
