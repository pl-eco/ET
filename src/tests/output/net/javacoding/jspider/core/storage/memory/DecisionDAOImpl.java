package net.javacoding.jspider.core.storage.memory;

import net.javacoding.jspider.core.storage.spi.DecisionDAOSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.ResourceInternal;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.DecisionInternal;

import et.util.MyUtility;
import java.util.Map;

import et.util.MyUtility;
import java.util.HashMap;

import et.util.MyUtility;

class DecisionDAOImpl
  implements net.javacoding.jspider.core.storage.spi.DecisionDAOSPI
{

    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected java.util.Map
      spiderDecisions;
    protected java.util.Map
      parseDecisions;
    
    public DecisionDAOImpl(net.javacoding.jspider.core.storage.spi.StorageSPI storage) {
        super();
        this.
          storage =
          storage;
        this.
          spiderDecisions =
          new java.util.HashMap(
            );
        this.
          parseDecisions =
          new java.util.HashMap(
            );
    }
    
    public void
      saveSpiderDecision(
      net.javacoding.jspider.core.model.ResourceInternal resource,
      net.javacoding.jspider.core.model.DecisionInternal decision) {
        spiderDecisions.
          put(
          new java.lang.Integer(
            resource.
              getId()),
          decision);
    }
    
    public void
      saveParseDecision(
      net.javacoding.jspider.core.model.ResourceInternal resource,
      net.javacoding.jspider.core.model.DecisionInternal decision) {
        parseDecisions.
          put(
          new java.lang.Integer(
            resource.
              getId()),
          decision);
    }
    
    public net.javacoding.jspider.core.model.DecisionInternal
      findSpiderDecision(
      net.javacoding.jspider.core.model.ResourceInternal resource) {
        return (net.javacoding.jspider.core.model.DecisionInternal)
                 spiderDecisions.
                   get(
                   new java.lang.Integer(
                     resource.
                       getId()));
    }
    
    public net.javacoding.jspider.core.model.DecisionInternal
      findParseDecision(
      net.javacoding.jspider.core.model.ResourceInternal resource) {
        return (net.javacoding.jspider.core.model.DecisionInternal)
                 parseDecisions.
                   get(
                   new java.lang.Integer(
                     resource.
                       getId()));
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1ZfWwUxxWfO9vnDwz+hBBssAG3hOI723f22Yf7B5ZtysGB" +
       "Lz4TwHF0We/NmYW9\n283u3PlMU5QqaaBRRRWRNqlEE6VqipRGbRUU8kerUE" +
       "TSpB+oqaWSpG3SD1KUqiVKVVVBbSr6ZmbP\nO7d3gCODtOu52Tfz3rz3e7+Z" +
       "N7xwFVWYBmqVTR+Z07HpG45FJcPEiWFVMs0J6IrLr1VUR0/vSmtu\n5Iogt5" +
       "IgqC4im10JiUhdSqIrPDKYM1C7rqlzM6pGrHmKZtm68ZPZXx3b2VKG6iZRnZ" +
       "KOEYko8rCW\nJjhHJlFtCqemsWEOJRI4MYka0hgnYthQJFU5AoJaehI1mspM" +
       "WiIZA5vj2NTULBVsNDM6NpjOfGcE\n1cpa2iRGRiaaYRJUHzkkZaWuDFHUro" +
       "hiksEI8iQVrCbMB9BRVBZBFUlVmgHBVZH8KrrYjF3baT+I\n1yhgppGUZJwf" +
       "Un5YSYMn2pwjFlbcsQsEYGhlCpOD2oKq8rQEHaiRm6RK6ZmuGDGU9AyIVmgZ" +
       "0ELQ\nmhtOCkJVuiQflmZwnKDVTrko/wRS1cwtdAhBK51ibCaI2RpHzIRojX" +
       "lq//dY9ON2FvPyBJZVan8l\nDFrnGDSOk9jAaRnzgdcyvifCBzKtboRAeKVD" +
       "mMsMfeblvZEPzrVxmZYSMmPTh7BM4vInwda180Pv\nV5dRM6p0zVQoFApWzq" +
       "Iatb4M5nRA86qFGelHX/7jT8d/duCh5/Hf3agqjDyypmZS6TCqxunEsNWu\n" +
       "hHZESWPeO5ZMmpiEUbnKujwa+w3uSCoqpu7wQFuXyEHWzumI/3PBs8Vqr6Av" +
       "ghpGsKyYYMLI0Fg4\npas+naDPpzGZoiCQtQSEf+qQqSsJbEzJmoGnTAAuBH" +
       "IKkkIz5qaKhueoyrpZl4vmrjPzVIDpDk2F\nyeLy6cu/eHB011eP8zhS7FnG" +
       "ErQVDPDZBvgsA3zUAJ9lgI8b4HMYgFwupvqOQkfTyCVogv3jxcH6\nE17zrB" +
       "uVTaJqJZXKEGlaxZCYkqpqszgRJwyZDUIWMPABcmunAcRgT1yFiVjSgGezBt" +
       "rgBKud4mFo\nSYDA+aPX3/wwPnuG4orioJnOzk2DqB7mttVujt238/7jG8qo" +
       "0Gw5DRiIdtx69rj84WO7z1z65bt3\n2UlBUEdRrhaPpLnmND9qaDJOAJfZ0z" +
       "/5nx0fnawIveRG5ZDAQGFEAuABH6xz6ijIucE8f1Fnwchl\nSc1ISSr9lCed" +
       "GnLQ0GbtHgaf5axdDw5YBk8FPHdaqF1JX/RjI301cbBRfzrWwNjx2sOe7rd+" +
       "suw1\n5pQ8kdYJjBvDhKdlgx2OCQNj6H/3qejJb1w9di+LhRUMgjx6ZlpV5B" +
       "yz7w4XxL6pBEX4Vjc/8c3N\np97KB7vJnn3IMKQ5Guvcl+fXfut16dtAH5DG" +
       "pnIEsyx1LYR9Nc5POTq8m5MOp6gHT11+dPOf3rlo\n0ZiwPdpSf4s/kjn7lX" +
       "PzburiatioJHNPPsHYRklbLrZ5QBgZ5GlPNfNnDc/hHoJq2Mie7oH+IFjU\n" +
       "CKrozupTEr6IJktqeOTZ88vmH88Ed3JblgsC4ZF4ru3ic5uvtzMbLJUegSqt" +
       "35VZydhjJz/94ydo\ndCkUtNXf0+kPeXv7Caq0ZFnAmgnyL4ZZoM8X4+1YNJ" +
       "wPNn13sraXgpAFCjFPbbBEKBc4KW873czz\niZSa/uK/Lzxd086BQce0smnK" +
       "wLstYrwLRsXlB46cCszH9inczc5tziF85JW9T1+7SN5jqLdzlWpb\nnys28B" +
       "5JoJGBS9kGz4+eSblR5SSqZ0cVKU3ukdQMzYlJwIs5bHVGINzi98KDA4fi4A" +
       "IXtTp5QlDr\nZAl7L4B2ITRtYqDb13p46i1iqHcQgwsxKI2yAR3svWkhjat1" +
       "QyNgH07kHBDp4tjfJWI/4MA+9/fI\nttD596/+UPmY4buGHdqG6BDL8mrWI2" +
       "Rdmaab9HggnE+tmTrGdHOQ6e1d0Ns30B8iaGRpaeDvHPD6\nuwmqndgRjuXh" +
       "TfVE7GUfhUNJ8eKoSZZnUSND3QpGYjS4vtF0JiV+hB27ct94eGJidA+dfICT" +
       "Mn1v\nK4jXBi6fH1cqXvvp6wvA0nyh+TWZYnDuFYPTy77sFvwW6l8qfQSCnY" +
       "GAt3eAoGbuuEJbqMKpYhOP\n0v4JgsrHR4dG8nyz3Kb+3ZJ+I8dQIDdZjmkq" +
       "7Zik5ZgVOq1eSvpFEf3S5/RLqHvJtNrbzfwC/m1i\nfik0heo7VGQg7Z2mL8" +
       "b/dbnifER59rQJttXaBYXFEXFxfj3v3+Bi+VxYDeN0A629UYnByqNj+/9Z\n" +
       "+6j06n2cchsLT5M0AfqeeRtv3lYrlzi+VhNN96o4i1V7X3Bq281KrzwF1u1r" +
       "+/P24OkvOTeGcnqI\nFjeGwmFx+fwPzv2+7+3fPQJWTKLKPWOx4aHIKBjcdl" +
       "N1cbkh23J32UHlDUZeFkcXFYyFgwYLmbnG\nwFDvpicK+Lm94OC2H54WC9Yt" +
       "pQ5u9PXZkturmy3fLSLgmIiAEPsSoK/jSz4t9HcG+rxB4MkqqN+1\njCEv7r" +
       "iQ0hJY9Y1bQ8K0DE9LqmjyCcHkgW7b5K/fBpODfu8AZGJVQsy0xZmcny9v8q" +
       "1POA/D7m5K\nWRwrpDzHqSVqKCk42mWtevulyX91J65sGeEptFq8xxEFd/iv" +
       "446mDz7i55XCs2qJ045DyePrvnvl\nzOXxZp6G/OZjY9HlgziG336wZdXqlA" +
       "jW30wDk351y/oXjo6/N+223DEHLJ/V6HWTh9nbjZjXHipA\n/z542iz0ty0Z" +
       "/c+JUPLbUPrekje7ns5Ar7cvJKCfzvs1UfnzovKArfz7t0F5sMc7EBRwTOc9" +
       "eWtE\nPgslOkVkVNxt6IdTpWIRhmejFYuNny4WruK96KzojqDtjpeX7I6+zt" +
       "5+b7/fGYtbu+NFSNAkIDVW\nfFSxjH5FNLrPNvrcbTC6p8fbHyCopdiCTWY7" +
       "3ydYWEuFZgc8m6zQbFpyaF4XVhkSGPeNJa8y1Nkb\n9Pb3fPrQXACkUsdEi8" +
       "5Fls2/FiMjbGxv3gabaWQATmuKDHAEBuqgOscE9OZiddHVOb/glTfM33/X\n" +
       "Bb3h5+xCaOEStgrK+2RGVcUCTmh7dAMnFbbmKl7OcQdcIuhzi7/xA9LlDeap" +
       "3/Ip3gHWX8QUjmrP\nGvwHgO5NBgPZ0z/iiD8StKr0CNBgtUT5v8C5uFAeYm" +
       "7/EEX/SlAZiNLmlYVjbr1dfPHKmu5bzULZ\nFtMhePRGJvedH5fffeI3/2UH" +
       "u0qZ/x8GvbeHsjML4SVdQ7Djz5mskKff6L2mnDEMnCbsBGzFapnJ\nZ+T39C" +
       "1i1bqgq2PiQHS0qHANdffcnkIjAJRSTguNpd0IQ4F7ZylPMevFMpauY6+l8v" +
       "/Ry6T9fRoA\nAA==");
}
