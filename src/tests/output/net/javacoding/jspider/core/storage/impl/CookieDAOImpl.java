package net.javacoding.jspider.core.storage.impl;

import net.javacoding.jspider.core.storage.CookieDAO;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.CookieDAOSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.SiteInternal;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Cookie;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;

class CookieDAOImpl
  implements net.javacoding.jspider.core.storage.CookieDAO
{

    protected net.javacoding.jspider.core.logging.Log
      log;
    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected net.javacoding.jspider.core.storage.spi.CookieDAOSPI
      spi;
    
    public CookieDAOImpl(net.javacoding.jspider.core.logging.Log log,
                         net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                         net.javacoding.jspider.core.storage.spi.CookieDAOSPI spi) {
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
    }
    
    public Cookie[]
      find(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.core.model.SiteInternal si =
          TypeTranslator.
            translate(
            site);
        return spi.
                 find(
                 si.
                   getId());
    }
    
    public void
      save(
      net.javacoding.jspider.api.model.Site site,
      Cookie[] cookies) {
        net.javacoding.jspider.core.model.SiteInternal si =
          TypeTranslator.
            translate(
            site);
        spi.
          save(
          si.
            getId(),
          cookies);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVYfWwUxxUf39nnT/AHhLjYYANOAAWffR82Bv8RrrYRBwd2" +
       "fCYUx9FlvTtnFvZ2\nN7tz54OmKFVJSKIqVQRtEpUkStsItUrTKjT0j1SlKE" +
       "mTNqVqrCrQVolaEUWpWqJEVQVqU9E3M7u3\ne3uHsbCl3RvPvjfv+zdv5uUr" +
       "qMo0ULtoBslhHZvBoeSYYJhYGlIE05yAqZT4VlXt2OldquZDFQnk\nkyWCGh" +
       "Oi2SMJROiRpZ748GDeQJ26phyeUTRirVOyytZ1X8z+7vjONj9qnESNspokAp" +
       "HFIU0lOE8m\nUUMGZ6axYcYkCUuTqFnFWEpiQxYU+QgQauokajHlGVUgWQOb" +
       "49jUlBwlbDGzOjaYTHsygRpETTWJ\nkRWJZpgENSUOCjmhJ0tkpSchm2QwgQ" +
       "JpGSuS+SA6ivwJVJVWhBkgXJGwrehhK/Zsp/NAXieDmkZa\nELHNUnlIVsET" +
       "HV6OgsVdu4AAWKszmBzQCqIqVQEmUAtXSRHUmZ4kMWR1BkirtCxIIWjlDRcF" +
       "ohpd\nEA8JMzhFUKuXbox/Aqpa5hbKQtBtXjK2EsRspSdmrmiNBhr+98TY1U" +
       "4W80oJiwrVvxqYVnuYxnEa\nG1gVMWe8lg2ejO/PtvsQAuLbPMScJnbHz/cm" +
       "PjnXwWnaytCMTh/EIkmJX/S3r5qLfVTrp2rU6Jop\n01QospxFdcz6MpjXIZ" +
       "tXFFakH4P2x1+N/3r/wz/C//ChmjgKiJqSzahxVItVacgaV8M4IauYz46m\n" +
       "0yYmcVSpsKmAxv4Hd6RlBVN3BGCsC+QAG+d1xP8q4OmyxkvpC+plSNMOyXg4" +
       "NhrP6EpQJ2hAxWSK\npoCoSRD8qYOmLkvYmBI1A0+ZkLYQxikZiKc8rHkqrH" +
       "G2ooJWrbfmFEjQHZoCC6XE05d/+9DIrscf\n4xGkWWepSVA/CA86woOW8CAV" +
       "HrSEB6nwYJFwVFHBxN5e7F4aL4mW1T9fHWx6sts860P+SVQrZzJZ\nIkwrGM" +
       "pRUBRtFkspwvKx2ZX7LOUgXxumIXVBl5QCC7FSAX/mDLTWm6JOYcdhJEDezR" +
       "29/odPU7Nn\naDbR6C+nq3PVIJaHuG4NG5P373zgsbV+SjRbScMEpF03Xz0l" +
       "fvrE7jPvv/vBBqcUCOoqqdBSTlph\nXvXHDE3EEiCYs/zT/9nx2YmqLa/5UC" +
       "WULQAXESDdAAVWe2UUVdqgjVrUWcBZn9aMjKDQTzbU1JED\nhjbrzLDUWcLG" +
       "TeCAeniq4Gm1cnU5fdGPLfS1jCca9afHBoaJ174R6L34i/q3mFNs+Gx04WwS" +
       "E16M\nzU44JgyMYf6DZ8ZOfPvK8ftYLKxgEBTQs9OKLOaZfrdXQOyXlQGGYO" +
       "vyk9/ZeOqiHexlzuoxwxAO\n01jnvz636tm3hecANKB4TfkIZrXpZ5L8wNSK" +
       "7SVHhnZzqOHA9NCpy49u/OufLljg5doUHaq/p45l\nzz5ybs5HXVwL25Ng7r" +
       "GLi22PdFTBtgwII0t5OlPL/FnH6zdELM6+UF8IFGoBSXQ7DcpSMKGJghIf\n" +
       "fvF8/dxT2f6dXJUlLoL4cCrfceGljdc7mQqWxIALH63/q3OCscepe/oTJih2" +
       "q8izNdy7Kby5OxIl\nyK9oPPGWE7R+PjABuhk6mbDoe7j9W132h9mHCH0NLl" +
       "K7SH93H2hXbdHZGoYXAncwF0zycXIs7lY2\n5lI24ij75UUq29ffvRnC4Qce" +
       "W9HoQhUtLAeq2gVD35vYuJsWMkt2xAxYa5FQPPVuGdtpG2SDUWb6\nq/9+4/" +
       "m6Tl5clKe9UDNt7pop4kqJDx45FZlL7pN5rnobBA/xkV/uff7aBfIhQw4H76" +
       "i0NflSBe8V\nXFA88H6uOfDTFzI+VD2JmliTJ6jkXkHJUlyZhJozh6zJBNSM" +
       "+3txy8XLebCA5+1erHWJ9SKts5fC\nuLi8HXClG/8KeJoscG3ygGsFYvWYZA" +
       "xd7L2+AIW1uqER0A9LeVetWem430nH6IAHO7irh7dtOf/R\nlZ/IVxk+1LFO" +
       "N0Y5LKVr2YwLtPyabtKeytXUWyt1jermIBMLdVXHxIaikS2Qt9tuPfdDmwa6" +
       "Q/0E\n1UzsiCcpRND1J7mlR6F7KzWIqmE5ErWwJFvKcJ/GMjiiZjPuj9DgVO" +
       "8bj09MjOyhCw/wfYy+9xSF\nZw08zRZfc/nwpOlrrwdRrDjIrjhsYR/uc7so" +
       "uigXhcFF4V6CGpiLLFoq46CjDP2XQf/dN7Kwg3vE\n9kw5C3XLwgIMWdaZLt" +
       "Dr9VoX7V2UdZEITYCQnQDAR9cnXImjdDxNUOX4SGyYjrcz6/KlhYJsWHOQ\n" +
       "r93q7FyGPOwK02bdRtruhSBtQe88lNmqG52V2Dnv+Fc+b3hUePN+joAtxQ0y" +
       "TdC+Fy7hjdsaxDLd\neC3R9G4F57DiwLRX2m52hrQRqXFfx9+295/+mhenff" +
       "RM4MbpYraUeP6Vc3/pu/TnY6DFJKreM5oc\niiVGQOGOecWlxOZc2z3+A/I7" +
       "DFAsyCw5+RYzDRYDZZ2B4eCuThTBZWdRL7oOnpVWtq4s14vS151l\nd7uK0r" +
       "ifcCVwn7Nrn1zUrt2/KdzHGiDoKkmhv7jjBskkwE6d0SSsBJNAffN9+luEHi" +
       "1VifbcrtaT\n9bXUccdmd13Z0H71uz7km6fzLHOuL6yQEl/1d33ue31FFztt" +
       "VE4LJg+H90Kk9L6j6BqDqVtfFL3m\neaLnjsuLrrhEC/V4oybScSGPha7rBf" +
       "5I1NWNvbTIuIZC3ZE+gpZQ/683O3m2Irb+N4vsDFm4iuzf\nhWepzypSlzd+" +
       "7PLGZseaVxZjTSS0KQzW9FpZStd7hi39XMGQTnjunMcQt4o/c6k4wLaL7xdH" +
       "Iero\nfXaRekfC3dEB2OFE9sm8ecn8kBop5LC3QR0z5AwchXLWpdRrk//qlT" +
       "6+a5jDc6v7stNNuCN8HXct\n++Qz3poWF1iZxtYj5KnVP/j4zOXx5Rzi+fXg" +
       "upIbOjcPvyJkhjTodJNZM58ERv3mXWtePjr+4bTP\ncsAj4ICcRu9kA0zfXg" +
       "Qt45Ii19JjcmvJ7Sy/QxTXzj2w4Q29+TccD+x7vho4TKaziuLudF3jgG7g\n" +
       "tMzk1/C+l6fKOwRtWOjVEuhNf1hU3+bs74K/FsDuaccs5t8T1DYPM4ijP26O" +
       "9whaUZ4DJFgjN/0f\nCVpaTA8dkfOPm/Qi9DJASoeXChjX5LSs/PiRt4Debn" +
       "aTOhZlevbPf+/1ynuefO+/bLutFvkVOb0W\nhgY9J0NR98RUQTlsstMO/UYv" +
       "0MSsYWCVsL7EilO9yVfk18Bt7v6+IKtrYv/YSEmLH+2NEHT34jo8\nKORK2u" +
       "Dd+oUjHAa+VM4/TGd3y0+1Fy1x/wcAoiIE0hgAAA==");
}
