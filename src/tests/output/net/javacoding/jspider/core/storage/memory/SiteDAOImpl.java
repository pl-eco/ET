package net.javacoding.jspider.core.storage.memory;

import net.javacoding.jspider.core.storage.spi.SiteDAOSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.SiteInternal;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.util.HashMap;

import et.util.MyUtility;
import java.util.Map;

import et.util.MyUtility;

class SiteDAOImpl
  implements net.javacoding.jspider.core.storage.spi.SiteDAOSPI
{

    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected java.util.Map
      byURL;
    protected java.util.Map
      byId;
    
    public SiteDAOImpl(net.javacoding.jspider.core.storage.spi.StorageSPI storage) {
        super();
        this.
          storage =
          storage;
        this.
          byURL =
          new java.util.HashMap(
            );
        this.
          byId =
          new java.util.HashMap(
            );
    }
    
    public net.javacoding.jspider.core.model.SiteInternal
      find(
      int id) {
        return (net.javacoding.jspider.core.model.SiteInternal)
                 byId.
                   get(
                   new java.lang.Integer(
                     id));
    }
    
    public net.javacoding.jspider.core.model.SiteInternal
      find(
      java.net.URL siteURL) {
        return (net.javacoding.jspider.core.model.SiteInternal)
                 byURL.
                   get(
                   siteURL);
    }
    
    public void
      create(
      int id,
      net.javacoding.jspider.core.model.SiteInternal site) {
        byURL.
          put(
          site.
            getURL(),
          site);
        byId.
          put(
          new java.lang.Integer(
            id),
          site);
    }
    
    public void
      save(
      int id,
      net.javacoding.jspider.core.model.SiteInternal site) {
        java.net.URL siteURL =
          site.
            getURL();
        byURL.
          put(
          siteURL,
          site);
        byId.
          put(
          new java.lang.Integer(
            id),
          site);
    }
    
    public SiteInternal[]
      findAll(
      ) {
        return (SiteInternal[])
                 byURL.
                   values().
                   toArray(
                   new net.javacoding.jspider.core.model.SiteInternal[byURL.
                                                                        size()]);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1Ze2wUxxkfn882Zxv8gICLDRjjFtzYd36e7fgfTrYpBwd2" +
       "fCYEx9Flb2/OLOzt\nbnbnzmeaolShIU2rSBG0IS0FtWpFW6UvUFJVaUtpkr" +
       "Zpi9RaFUmbJn2QRlQJUaKqArWp6Dczu7d7\ne4d5OEi7npv9vvnev5lveOYy" +
       "KjN01CQafjKnYcM/HB0XdAMnhmXBMCZhKia+VOYbP7VdUT2oJII8\nUoKgmo" +
       "hoBBICEQJSIhAeGcrqqFlT5bkZWSXmOgWr3LXhg9nfHt7WWIpqplCNpESJQC" +
       "RxWFUIzpIp\nVJ3CqTjWjVAigRNTqE7BOBHFuiTI0gEgVJUpVG9IM4pA0jo2" +
       "JrChyhlKWG+kNawzmdZkBFWLqmIQ\nPS0SVTcIqo3sEzJCIE0kORCRDDIUQe" +
       "VJCcsJ40F0EJVGUFlSFmaAcGXEsiLAVgxsofNAXimBmnpS\nELHF4t0vKeCJ" +
       "dW6OnMWt24EAWCtSmOxVc6K8igATqJ6rJAvKTCBKdEmZAdIyNQ1SCFp93UWB" +
       "aIkm\niPuFGRwjqMFNN84/AZWPuYWyEHSHm4ytBDFb7YqZI1pj5dX/e3z8Sj" +
       "OLuTeBRZnqXwFMa11MEziJ\ndayImDNeTfuPhvekmzwIAfEdLmJOE/roD3dF" +
       "Lp1dx2kai9CMxfdhkcTED4JNa+ZDb/pKqRpLNNWQ\naCrkWc6iOm5+GcpqkM" +
       "0rcyvSj37r488mfrHn4W/jtz1oSRiVi6qcTilh5MNKYtgcV8A4IimYz44l\n" +
       "kwYmYeSV2VS5yn6DO5KSjKk7ymGsCWQvG2c1xP+VwNNljpfRF0FLoxLBI6Gx" +
       "cEqT/RpBAwom0zQB\nRDUBoZ/eZ2hSAuvToqrjaQOSFoI4DQWh6nPTeaxZKq" +
       "pmtqSE1qy74mRIz62qDAvFxFMXf/3Q6PbP\nPsbjR3POVJKgIAj328L9pnA/" +
       "Fe43hfu5cL9DOCopYWJX5TuXRitBi+qd00O1T3QYz3lQ6RTySalU\nmghxGU" +
       "MxCrKszuJEjLBsrHNkPks4yNbqOCQu6BKTYSFWKODNjI5a3Alql3UYRgJk3f" +
       "zBa797NzZ7\nhuYSjf0KujpXDSK5n+tW3Ra9f9sDj7WUUqJZLw0SkLbeePWY" +
       "+O7jO85c+M3rm+xCIKi1oD4LOWl9\nudUf11URJwC/7OWf+s/W946UDT7rQV" +
       "4oWoAtIkCyAQasdcvIq7MhC7Oos4CzKqnqKUGmnyygqSR7\ndXXWnmGps5SN" +
       "a8EBVfCUwdNgZuoK+qIf6+lrOU806k+XDQwRrz5S3vnKj6teYk6xwLPGgbJR" +
       "THgp\n1tnhmNQxhvnXj40f+cLlw/exWJjBIKhcS8dlScwy/VaVQOyXF4EFf8" +
       "OKo19sO/6KFezl9uohXRfm\naKyzn55f8/Qvha8AZEDpGtIBzCqzJBf2Bmwt" +
       "OTq8gwMNh6WHjl98tO2vfzxvQpdjS7Sp/hk7lH7u\nM2fnPdTFPticBGOnVV" +
       "xsc6SjErZhQBhZytMZH/NnJa/fLoIqGWdXZ7B/EDSqB1F0N/VLCX9EFQU5\n" +
       "PPLVc1XzT6aD27guSx0E4ZFYdt35b7Rda2Y6mCLLHfBo/q7ICPpOu/Dpn26C" +
       "QrcLPXd1d7Z393X0\n9hBUYdKxYK0gqPtmEAXm/FE+jo6HrUDTdzsbd9AEZE" +
       "FCzEstJgnFATfUbaGbt1VEqfgn//3Cicpm\nnhSUp4ktUwqebXTGOo8rJj54" +
       "4HjPfHS3xF3s3tZcxAd+uuvE1fPkDZbxdp1SaeuzhQreIzggZOBC\npq78+y" +
       "dTHlQxhWrZ0URQyD2CnKb1MAW5YgybkxEItfN7/kGBp+FQDoea3BjhEOtGCH" +
       "sPgHF+Wtqg\nQLer9fDUmqBQ6wKFEsTSaJQxtLL3xlwJ+zRdJaAfTmRdKRLg" +
       "eb/dmfdBV95zf49sHjz35uXvSVdY\nbleyQ1qIspia+9iMo+JKVc2gxwHHed" +
       "RcqXVMM4aY3N6c3L7BLii+zbdfAl3tAx3dnQRVT24NR63U\npjIitskH4QBS" +
       "aBhVx/QqqmcZt4yBFw2sf1RJp5wfYZeu2D0Rnpwc3UkXH+BgTN+b82JFwbvO" +
       "5Ksr\nHqt76esTBJXF53ZNRJzhuM8Zjn72ZYfDUz2DiwGL3mB7f3dHfz8syF" +
       "zFpFMR05YqB+mvSYK8E6Oh\nEQtJltqAvkPQrmf2Ku4my13FzE6aZnvjc+GE" +
       "02rJafVAodU9i8mP3m7Ijy5AWZ9pdJiB8z5TDzqO\n0xcb1WQLywhZoGfjYp" +
       "O5cTlsIE4b+rRbh2GuNINhHa25XhfAOpjD975f/ajw4v0cJevzD380b/tO\n" +
       "vorbNleLRU6aPqJqHTLOYNmGcre0Haw7slCrZve6v20JnvqUG8tZj+rE8ny2" +
       "mHjuu2df63v1T4dA\niylUsXMsOhyKjILC6xYUFxPrMo13l+6VfsXwxoTVgp" +
       "4un2koH0wrdQwtqTKZB6nNeeesVnhWm/m6\nutg5i74+VnRHtI8teVvZuC6l" +
       "YK/PmE3Xs1P/6ky8decID1KDs5l3Em7tvoZbl196j29i+YeXIlug\nS8iTa7" +
       "/+1pmLEyt4oHn7u6GgA3Xy8BaYmVit0VRbv5AERv3ineufOTjxRtxjngLmCC" +
       "qF3hsOiEzd\nvhufGx4htEFT8or+iKNgBrrZlx76Orqo81CwvauroycIqEXl" +
       "bTSaeSZY5ehfqBxTagLLrBDD9GZB\nEWTE+B7OS5w2eNaaibP29hLH4YUTTi" +
       "8EbS+cXIwXeuBUONjR20n3P/hg7TFgfzXDcuoEmLxx3L5U\nJG7fdGrcZ2v8" +
       "rUVqDHHr7XLHjS58rFgUaDPfYkah5dai4GEGeujPzzkN+4HTsAHbsNOLMqy3" +
       "vQcM\nGyC07SGsrI/d2O/fgdoSdSwQflY7rHGWz8MqGZVe9vHK6yzmmQA8G0" +
       "3PbPxwPHPO4ZnBTtszP1+U\nZwZZkgZvzTM/oeRChpH/qJj5G+DpMM3vuDXz" +
       "Ud52v4ASL0Nh0TQNyTLtxh3QzjpeCpyHZrdf3tR0\n5cse5FmgJy1y35dbIS" +
       "aeLm193/P8ylZ2D+GNCwbfzNwXpYX3oHnXm0zjqjwfrVrAR864/8EZ9x52\n" +
       "hjumaVputre/t9/OhguLOpv2MeDuI6jW9GwOAxC0LlUOanrJ0FBws83vX8WW" +
       "+Qc2vaDVvcx9Zt2R\nLoFOPJmWZWe/5RiXazpOSszkJbz74vb/maCP3/zFHF" +
       "QlHzCXvMaX+AvsxzexhKs5M5n/TlDjAsxQ\nCvSPk+MfBK0szgESzJGT/hJB" +
       "y/LpIbj2Dyfp27DrAykdvpM73tba/RJvhLNmQVidVlTDokQvT7Jf\ne9579x" +
       "O//y871FWI/L8Y6LU6dIkZCRAgEIINd85gfTf9Rq8gxbSuY4Ww068ZqyqDr8" +
       "iv0RudTWZO\nVuvknvHRwj6zZ+BD6J6gkfDSRuL2L22hF/1IMQ8xrZ0dJ9V/" +
       "lynu/zdrTHoUGgAA");
}
