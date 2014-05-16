package net.javacoding.jspider.api.event.engine;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.Storage;

import et.util.MyUtility;

public class SpideringStoppedEvent
extends net.javacoding.jspider.api.event.engine.EngineRelatedEvent
{

    protected net.javacoding.jspider.core.storage.Storage
      storage;
    
    public SpideringStoppedEvent(net.javacoding.jspider.core.storage.Storage storage) {
        super();
        this.
          storage =
          storage;
    }
    
    public boolean
      isFilterable(
      ) {
        return false;
    }
    
    public java.lang.String
      getComment(
      ) {
        return "Spidering stopped";
    }
    
    public void
      accept(
      net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.
          visit(
          this);
    }
    
    public Resource[]
      getResources(
      ) {
        return storage.
                 getResourceDAO().
                 getAllResources();
    }
    
    public Site[]
      getSites(
      ) {
        return storage.
                 getSiteDAO().
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
      ("H4sIAAAAAAAAALVYfWwUxxWfO9vnz+AvjF1ssAEnxsK+8wc2NlbVWLaRjQ/s" +
       "+AwpjqPL3u6cWdjb\nXXbnzgclqFVoIPkjUpSkHypN2ioVVRX1I4hUKlUoCm" +
       "naJEit/0jSVolaEUWpWqJEVQVqU9E3M7u3\ne3tnO1WMpd0bz7438+a93/vN" +
       "m3nhBioyDdQkmkFyXMdmcCQyLRgmlkYUwTRnoSsqvlpUOn1+UtX8\nyBdGfl" +
       "kiqDIsmiFJIEJIlkITo0NpA7XomnJ8QdGINU7OKLu3fbr45pm9jQWocg5Vym" +
       "qECEQWRzSV\n4DSZQxUJnIhhwxyWJCzNoWoVYymCDVlQ5BMgqKlzqMaUF1SB" +
       "JA1szmBTU1JUsMZM6thgc9qdYVQh\naqpJjKRINMMkqCp8REgJoSSRlVBYNs" +
       "lQGAXiMlYk8xg6hQrCqCiuCAsguCFsryLERgztof0gXiaD\nmUZcELGtUnhU" +
       "VsETzV6NzIpbJ0EAVIsTmBzWMlMVqgJ0oBpukiKoC6EIMWR1AUSLtCTMQtDG" +
       "ZQcF\noRJdEI8KCzhKUINXbpp/AqlS5haqQlCdV4yNBDHb6ImZK1pTgYr/Pj" +
       "59s4XFvFDCokLtLwalzR6l\nGRzHBlZFzBVvJYNPTxxKNvkRAuE6jzCXGb77" +
       "FwfCH15u5jKNeWSmYkewSKLip/1Nm5aG3y8toGaU\n6JopUyhkrZxFddr6Mp" +
       "TWAc0bMiPSj0H7469nfnPoqz/Gf/ejkgkUEDUlmVAnUClWpRGrXQztsKxi\n" +
       "3jsVj5uYTKBChXUFNPY/uCMuK5i6IwBtXSCHWTutI4SK4fHBswPxv0r6Iqg+" +
       "ossSplGOEE3XsTSW\nwioJ6gR9ScVknkJB1CT4PH/EZJLzgi7PYyo0j9UFmH" +
       "5+mRHSdO7KRZ+PJrE3BRXA67imgF5UPH/9\n9ZNjk4+d5QGlILSsJuiLYEPQ" +
       "sSFo2RAEG4LMhiC3IZjXBuTzsdnrs51OoyjRZPvHi0NVT3SaL/lR\nwRwqlR" +
       "OJJBFiCoYkFRRFW8RSlDCUVrsyggERUFwRA0DDfFEFBmIJBF5OGWirF7hOuk" +
       "9ASwA0Lp26\n/fuPoosXKMYoJtbT0blpEOGj3LaK9siDex86u7WACi0W0uCB" +
       "aOvqo0fFjx7fd+GtN97d7iQIQa05\neZurSfPOa/60oYlYAl5zhv/mv8c/fq" +
       "po8KIfFUIyA50RASIA3LDZO0dW/g3ZXEadBZrlcc1ICAr9\nZBNQGTlsaItO" +
       "D0PQXaxdBQ4oh6cInjoLwbX0RT/W0Fctxxv1p2cNjClvPRLoevtX5a8yp9ik" +
       "Wuli\n3wgmPEWrnXDMGhhD/7vfmn7qmRtnHmCxsIJBUEBPxhRZTDP76n0Q+9" +
       "o8dBFsWP/0N9rPvW0Hu9YZ\nfdgwhOM01umvLW369mvCd4FKIKVN+QRmGevL" +
       "hL0B20OOjezjBMTp6uS564+2/+WP1yxKc22VjtTf\noqeTL3398pKfurgUNi" +
       "3B3G/nGNs0acvHNhIII4M87Sll/izjadxNLM3ugYE+MKgGZqKbbFCWgmFN\n" +
       "FJSJ0e9fKV96Mtm/l5tyl0tgYjSabr72w/bbLcwEa8aAizWt/4tTgrHfSX/6" +
       "00PQ+Ofkod3dgx29\nvZ07BwgqNgHusAuxkK0naMcy9CJqBg5assEI/7XjTN" +
       "8drN1J8cdihJiTtloilAa8hLeH7ul2DiVi\nX/nXK8+WtXBMUJ2mTKgb3aHO" +
       "0oqKx06c612K3C9zF3t3O4/wiZcPPHvrGnmPAd5JUzrblnSugQcF\nF4MMvJ" +
       "WqDvzsuYQfFc+hKlaxCCo5KChJmg5zABVzxOoMQ6jd37PrB47CoQwNNXkpwj" +
       "WtlyCcnQDa\n2ah0OGEdPJvhqbY4odrDCT7EYDTGFFrZuy2TwaW6oRGwD0tp" +
       "DzZCHPaTLtjv9MCeu3v03sEr79/4\nqXyTQbuMlW7DVMMyvJT1uPKtQNNNWi" +
       "S4qlRrpNYp3Rxi0+60p+3r37VrDRJgZ1dHd19nD+RSxez4\nRMRGNp0q7Cz8" +
       "FFQnueujVlm+RTUMd+sYg9HwBsfUZML9EXbswpmx4VE68gCjY7aee6y8cFKn" +
       "yUob\n8Omm5So9VqWe+fInFY8KVx/kkK/J3sjp9H3PvYPb760Q8xQPpeCFTg" +
       "U8pDh56Z1tH6uAbQhW3t/8\n1z395x/2JiY7h7gTM1stKl75yeU/973zp9Ng" +
       "xRwq3j8VGRkOj4HBzStOFxWrU433FRyWf8vQY+VI\nTt2erTSUnRllBoZjhz" +
       "qblR8tWXvmFnjqrSjV59szXTFaht5W5T7I+wrZ3CMrcEqgNZSXyaYNOQFU\n" +
       "n7JK8Ytz/+ySPtgxysPa4D7iuQXHe27j1toPP+Yclr115WFAzyRPbn7+gwvX" +
       "Z9ZzaPBD0bacc4lb\nhx+M2IIqdArOLSvNwKSv7tjywqmZ92J+yxEPQELFNE" +
       "3BQIgowMkDMZfFsoJCSavRCkrjHQpKkqCy\nBUxGtEQCiMBNbCddxNbPPvTS" +
       "18NrQDY9uzq6uzt7uwiqdeZuM1s4Tu2dt8ohEX7GzOejDniaLR81\n/38+sm" +
       "sn15rPuNa8y1nz2TVYc293Rw9UGL0Q+5QMJQ0c7a11dq56gGFjHORaq4f0EQ" +
       "oqUcQ6D6ei\nc5VjQLwpjd5/cMh15XPnPfBss9y57Q5B7hngAQg7ve9IGiI2" +
       "aTnuym5W8tLcOb04eWN7083v+JF/\nhaI0z0VAZoSo+GJB6yf+Sxta2UGkMC" +
       "aYnAG9Nyi5FyRZ9x7M7PIsR9Wu4Cg3or7nQtSAboe8fYWQ\nJzQJK0HbO7qu" +
       "2yP0dO3scTD5/Fpgso/lIVS9de6AZDJxOVJqsxbedocQ8iOCSsCgiEwAHbTj" +
       "XJYJ\nlSuY4Pb9z12+H8z4/u5VfU/nzfZ7r+P3i2vh90Gb/6rtZTo+hzqzLq" +
       "8iPRo25NxT8ts0cevSQ9tf\n0at/x4Fu33iVwAEqnlQUd5nsagd0A8dl5qsS" +
       "XjRzx10iqO0z3qoAm/AG89Avuf7LBLWspk9QEft1\n610haOPyegQVwNstf5" +
       "WgDfnlgWWtllv+NYLWZcvD7uf84xZ9HWYDUdp8Q3eD6k0XqHozoNr9WS+h\n" +
       "xtjPDFYEYoU1bfGfXVRHdCzK9LSc/sGlwvue+MN/WOFXLPKrZnq9CucCtoWE" +
       "hlVBOW6ygxb9Rq+c\nxKRhwKCsQraiXG7yEfl1aqP7WJGZq3X20PRY7smif8" +
       "1OFt19sP3Qk8XnvrGDM8gX8rmLLcF90qCL\nOWDN+j9mHToJKRgAAA==");
}
