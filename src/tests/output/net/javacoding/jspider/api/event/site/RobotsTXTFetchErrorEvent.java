package net.javacoding.jspider.api.event.site;

import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;

public class RobotsTXTFetchErrorEvent
extends net.javacoding.jspider.api.event.site.SiteRelatedEvent
{

    protected java.lang.Exception exception;
    
    public RobotsTXTFetchErrorEvent(net.javacoding.jspider.api.model.Site site,
                                    java.lang.Exception exception) {
        super(site);
        this.exception = exception;
    }
    
    public java.lang.String getComment() {
        return "robots.txt was unreachable on site \'" + site + "\'";
    }
    
    public net.javacoding.jspider.api.model.Site getSite() { return site; }
    
    public boolean isError() { return true; }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcRxWfO9tnn+3Gn01N7MQXx6W1at/l/IUdSxDLduRL" +
       "LvHV5zbN4eq6tztn\nb7K3u92dsy+mRBRK0vaPSlULLSKkKioKoAoQUcsfIE" +
       "LUlu9I4D/aAmoFSlUVQaoihBpBUXgzs3c7\nt2cnSEkt7Xpu5r15b97H773Z" +
       "Fy+jGttCXbIdJsdNbIenkgnJsrEypUm2vQBTafm1mmDi7AHd8CNf\nHPlVha" +
       "CmuGxHFIlIEVWJxKYnChYKmYZ2fEkziLNPxS57dn20+ttT+zurUFMKNal6kk" +
       "hElacMneAC\nSaHGHM5lsGVPKgpWUqhFx1hJYkuVNHUNCA09hVptdUmXSN7C" +
       "9jy2DW2FErbaeRNbTGZxMo4aZUO3\niZWXiWHZBDXHj0orUiRPVC0SV20yEU" +
       "eBrIo1xX4QnUBVcVST1aQlINwaL54iwnaM7KPzQF6vgppW\nVpJxkaX6mKqD" +
       "Jbq9HKUT9x4AAmCtzWGybJREVesSTKBWrpIm6UuRJLFUfQlIa4w8SCFo26ab" +
       "AlGd\nKcnHpCWcJqjDS5fgS0AVZGahLATd6iVjO4HPtnl8JnhrLtD438cTH4" +
       "aYz6sVLGtU/1pg2uFhmsdZ\nbGFdxpzxSj78dOxIvsuPEBDf6iHmNJO3/+ie" +
       "+HvnuzlN5wY0c5mjWCZp+aPRru3rk+8Eq6gadaZh\nqzQUyk7OvJpwViYKJk" +
       "Tz1tKOdDFcXPzZ/M+PfOG7+G9+VBdDAdnQ8jk9hoJYV6accS2M46qO+exc\n" +
       "NmtjEkPVGpsKGOw3mCOrapiaIwBjUyLLbFwwEUK18Pjg2YX4XxN9gUPnjYxB" +
       "7IX7FvZhIi/PWJZh\nzaxgnYRNgvbqmCzSaJANBeJg8ahtqgq2FiVTXcSUaB" +
       "HUx4ubb1Gg8ptWfT6ayN401CBmZw0NNkzL\nZy/9+qGZA489yp1KA9HRnKBP" +
       "gxJhV4mwo0QYlAgzJcJUifBmSiCfj4m/rdzy1JUKzbi//3Ci+YkB\n+2U/qk" +
       "qhoJrL5YmU0TBkqqRpxipW0oSFaouQFiwaIZQbMxDVoFNag41YFoGpVyzU44" +
       "1eN+djMJIg\nJNdPXP3d++nVczTQaGC00925auDmY1y3xr7k/fsfeLSnihKt" +
       "VlMPAmnv9XdPy+8/fvDc67956043\nSwjqrUjeSk6afF71E5YhYwXAzd3+mX" +
       "/PfvBUzfhLflQNGQ2YRiSIRACIHV4ZZUk4UQQ0aizgbMga\nVk7S6FIRherJ" +
       "smWsujMshG5h42YwQAM8NfBsdcK4jb7oYit9tfGAo/b0nIHB5ZUvBXa/8ZOG" +
       "15hR\nisjaJEBwEhOepy2uOxYsjGH+rWcTT33l8qnPMl84ziAoYOYzmioXmH" +
       "63+cD3bRtgRrij/emv9p1+\no+jsNnf3ScuSjlNfFx5e3/61X0jfADyBvLbV" +
       "NczS1s8k+YGpAxe3nJk6yFGIY9ZDpy+d7PvzHy46\nuCbUS5fqr+lH8i9/+f" +
       "y6n5o4CJVLsg8Vk4xVTjrysWoCbmQhT2eCzJ71PI+jxOEci+4eAoVaQRKt\n" +
       "tGFVCccNWdJi089faFh/Mj+6n6tyi0AQm04Xui9+q+9qiKngSAwI0On8rl2R" +
       "rENu/tN/gwTFbhSJ\n9kTH+4dGB4ZHCDUu4cHVTtDt10CXnKFgLZwsUke4Gf" +
       "YIZhhmC0P0NXGTlBz+1MDoKIjABRmb1C5F\nTXnQUPwJzxTXinFH3/1sPEDz" +
       "gcUMYtr2OCQUlrwIvI82GsWczmU+969XztSHeIxSnq4S4nSKoVfG\nlZYfXD" +
       "s9tJ48rHKXe0uwh3jtp/ecuXKRvM0S0IUNKm1noVLBeyUB0cZeX2kJ/OC5nB" +
       "/VplAza6Mk\nndwraXmanikIXXvKmYxD6Inr5U0Nz4qJEix2eSFLEOsFLLc0" +
       "wbg8S1yM2gJPDzwtDka1eDDKh1hY\nxxlDL3vfUUKUoGkZBPTDSqEiCpwInB" +
       "cicNCTiNzg03vHL7xz+fvqhyzZ6llHOUk5HNWDbEZAgCrD\ntGnvIjTPzk69" +
       "c6Y9wcQOE1TPxEYHR6IQorM3HO6D0f6xgUFI7y0Ls7FkuHRYKi0pnv4EdE6V" +
       "h6Sq\nOSZGrSz8tgg5oudz4iJ0ErWH52MLCzOH6PafYYWCneuTToa4SdTlJB" +
       "DYdvtmjShrok/d94/Gk9Kr\n9/Pgby1vMagGI8+9ifv2Nsob9DVBYpgDGhhK" +
       "czPUK+0ga9CLwdh0uPsv+0bPft6bolW0uxJTtJwt\nLV/43vk/jbz5x0dAix" +
       "SqPTSXnJqMz4DC3dcUl5ZbVjrvrlpWf8miyMmWimtFOdNEeY7UWxhuRfpC\n" +
       "WaaEyqr5Dng6HEd1bFTNBR9tAnTXRUHQu34Jkykjl4PIE3PJFnJpxEVzcjPQ" +
       "fHC4PxodGNoN2O0K\nv8MOcZsUcb3ZjVl+3UJsRS0z0jZ4uhwjdX1MRlqDDA" +
       "E9vfXuYcFCo66FvnhTLDRGLTQIYNLsSC6Z\nh8oY28gU9PghxxShj8kUJ8EU" +
       "qs1U9Za/hKXmoF9ZcS6VL6X+uVt5965pjgAd4scKkXB28CrubXvv\nA174yv" +
       "uvDcqmR8iTO15499yl+XaOIvx6v6vihi3y8Cs+O0ujSXFs57UkMOpX79r54o" +
       "n5tzN+xwYZ\nsEHGMDQMVRQFOPAjqEkdm/mTdrYdFd9a+BcBuWf9gTtfMVt+" +
       "xS4MpVt7HfR/2bymiVVVGAdMC2dV\npk0dr7E8JJ+9dt/m3grFZu8Zzvt1gk" +
       "LX4yWohv0X+c7AXXlzPoKq4C3SP0/Q1o3pwa7OSKR/Aapg\nOT1glvtDJD0L" +
       "0oCUDr9tiqn6HSFVo2YRYEb/vws0zb55rEnQeTB30qhpF4pu0sSySpv8wjd/" +
       "XH33\nE7//D6sKtTL/TEY/DUHzsKLCXpFJXdKO26wfo2v0piznLbgFElY+He" +
       "822HxH/imoU+w9SrJ6F44k\nZirbj8Hxm4I+4/3RkYEovRLQ/uPGvzVAm/KJ" +
       "jSzGTiE2I/Q8i47Y/wFg+QGy6BQAAA==");
}
