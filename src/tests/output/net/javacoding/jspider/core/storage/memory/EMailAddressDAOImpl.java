package net.javacoding.jspider.core.storage.memory;

import net.javacoding.jspider.core.storage.spi.EMailAddressDAOSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.*;

import et.util.MyUtility;
import java.util.*;

import et.util.MyUtility;

class EMailAddressDAOImpl
  implements net.javacoding.jspider.core.storage.spi.EMailAddressDAOSPI
{

    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected java.util.Map
      byResource;
    protected java.util.Map
      addresses;
    
    public EMailAddressDAOImpl(net.javacoding.jspider.core.storage.spi.StorageSPI storage) {
        super();
        this.
          storage =
          storage;
        this.
          byResource =
          new java.util.HashMap(
            );
        this.
          addresses =
          new java.util.HashMap(
            );
    }
    
    public void
      register(
      net.javacoding.jspider.core.model.ResourceInternal resource,
      net.javacoding.jspider.core.model.EMailAddressInternal address) {
        java.util.Map map =
          (java.util.Map)
            byResource.
              get(
              new java.lang.Integer(
                resource.
                  getId()));
        if (map ==
              null) {
            map =
              new java.util.HashMap(
                );
            byResource.
              put(
              new java.lang.Integer(
                resource.
                  getId()),
              map);
        }
        net.javacoding.jspider.core.model.EMailAddressReferenceInternal reference =
          (net.javacoding.jspider.core.model.EMailAddressReferenceInternal)
            map.
              get(
              address.
                getAddress());
        if (reference ==
              null) {
            reference =
              new net.javacoding.jspider.core.model.EMailAddressReferenceInternal(
                storage,
                resource.
                  getId(),
                address.
                  getAddress(),
                0);
            map.
              put(
              address.
                getAddress(),
              reference);
        }
        reference.
          incrementCount();
        addresses.
          put(
          address.
            getAddress(),
          address);
    }
    
    public EMailAddressInternal[]
      findByResource(
      net.javacoding.jspider.core.model.ResourceInternal resource) {
        EMailAddressReferenceInternal[] refs =
          this.
            findReferencesByResource(
            resource);
        java.util.ArrayList al =
          new java.util.ArrayList(
          );
        for (int i =
               0;
             i <
               refs.
                 length;
             i++) {
            net.javacoding.jspider.core.model.EMailAddressReferenceInternal ref =
              refs[i];
            al.
              add(
              ref.
                getEMailAddress());
        }
        return (EMailAddressInternal[])
                 al.
                   toArray(
                   new net.javacoding.jspider.core.model.EMailAddressInternal[al.
                                                                                size()]);
    }
    
    public EMailAddressReferenceInternal[]
      findReferencesByResource(
      net.javacoding.jspider.core.model.ResourceInternal resource) {
        java.util.Map map =
          (java.util.Map)
            byResource.
              get(
              new java.lang.Integer(
                resource.
                  getId()));
        if (map ==
              null) {
            return new net.javacoding.jspider.core.model.EMailAddressReferenceInternal[0];
        } else {
            return (EMailAddressReferenceInternal[])
                     map.
                       values().
                       toArray(
                       new net.javacoding.jspider.core.model.EMailAddressReferenceInternal[map.
                                                                                             size()]);
        }
    }
    
    public net.javacoding.jspider.core.model.EMailAddressInternal
      find(
      java.lang.String address) {
        return (net.javacoding.jspider.core.model.EMailAddressInternal)
                 addresses.
                   get(
                   address);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1Ze2wUxxkfn98P8IvwiE1siNvgxnf23fn8wFGDY5ty+IyN" +
       "D0hwnF7We2OzsHe7\n2Z2zzzS1GoVAitpIKOlLpUFtUyG1UdMGkapNVYpImr" +
       "Ypauo/8qqSpiJCiRpSoqoCtanoN7O7t7N7\nhwFxlndvbuabmW++7/f95pu5" +
       "Zy+gYl1DjaLuI/Mq1n0D0TFB03F8QBZ0fQdUxcSXi8vHjg8nFQ8q\niCCPFC" +
       "eoOiLq7XGBCO1SvD082JfWULOqyPMzskLMcbJG2Xj7p3N/OrS1oRBVT6BqKR" +
       "klApHEASVJ\ncJpMoKoETkxhTe+Px3F8AtUmMY5HsSYJsrQfBJXkBKrTpZmk" +
       "QFIa1sexrsizVLBOT6lYY3NalRFU\nJSpJnWgpkSiaTlBNZK8wK7SniCS3Ry" +
       "Sd9EVQybSE5bj+EFpAhRFUPC0LMyC4MmKtop2N2L6Z1oN4\nhQRqatOCiK0u" +
       "RfukJFiiyd0js+KWYRCArqUJTPYomamKkgJUoDpDJVlIzrRHiSYlZ0C0WEnB" +
       "LATd\netVBQahMFcR9wgyOEbTaLTdmNIFUOTML7ULQLW4xNhL47FaXzzhvjZ" +
       "ZU/e/w2KVm5vOiOBZlqn8p\ndLrN1WkcT2MNJ0VsdLyc8j0V3p1q9CAEwre4" +
       "hA2Z/s/8Ymfkg1NNhkxDDpnRqb1YJDHx067GtYv9\n75cXUjXKVEWXKBQcK2" +
       "deHTNb+tIqoHllZkTa6LMafzv+u91f+TH+hweVhVGJqMipRDKMynEyPmCW\n" +
       "S6EckZLYqB2dntYxCaMimVWVKOw7mGNakjE1RwmUVYHsYeW0ioy/AnjuNstV" +
       "9AUeGBoRJBmgDdDV\nB/tHwwlV9qkEbUpiMkmBICpxgMDkXl2V4libFBUNT+" +
       "oAXnDmJASGos1P5hwiTaeunisooDHsjkAZ\n4LpFkWHAmHj83B8fHhr+6uOG" +
       "PykGTaUJ+jwo4bOV8JlK+KgSPlMJn6GEL4cSqKCATb/KaXTqxTgN\nto+e76" +
       "t5wqu/4EGFE6hcSiRSRJiSMQSpIMvKHI7HCENpLRcRDIiA4qopADToFJNhIB" +
       "ZAYOVZDa13\nA9cO9zCUBEDj4sKV1z6OzZ2gGKOYWEFHN1QDD+8zdKtqjT6w" +
       "9cHH1xdSobki6jwQbbn26DHx48Mj\nJ15/9Z0NdoAQ1JIVt9k9ady51R/TFB" +
       "HHgdfs4b/1ny0XnyzuPelBRRDMQGdEABACN9zmnsMRf30W\nl1FjQc/KaUVL" +
       "CDJtsgioguzRlDm7hkFoGSvXgAEq4SmGZ5WJ4Hr6oo119FVvAI7a07UGxpSX" +
       "Hy3p\neOPXlS8zo1ikWs2xbxQTI0RrbXfs0DCG+ne+PfbkNy4cup/5wnQGQS" +
       "VqakqWxDTTb1UB+L4+B134\nVq946putR9+wnF1vj96vacI89XX6kcW133lF" +
       "+B5QCYS0Lu3HLGILMm5fja0hhwZGDAIy6Orho+cO\ntr731lmT0rit0pb6MH" +
       "Yg9cJjpxY91MTlsGkJ+jYryNimSUsFbCMBNzLI05pyZs8KI479BFWwnv6O\n" +
       "Xn8QNKqDqegu65PivogiCnJ48PunKxePpLq2Gros4wTCg7F009kftV5pZjqY" +
       "U5ZwtGl+L50VtG02\nAdCPAEHhm6Wijf7etmDQG4JVlJryzGkrCApcD8NAnS" +
       "9qlKNjYcvh9N3Gyl4KROYsxKy13hShfOCm\nvs10c7eCKTH1pX+febqi2QAH" +
       "7dPIhikECzfwPnf0iokP7T8aXIzeKxmmdm97LuH9v9n59OWz5F2G\nfDte6W" +
       "zr0tkK7hI4Kul5fba25GfHEh5UOoFqWOoiJMkuQU7RuJgAzOgDZmUEXM63Ox" +
       "MJA459GT5q\ndHMFN62bKew9AcpOeNrksByedeYnsj45cihADE5DrEMLe9+R" +
       "CeVyVVMI6IfjaRdE2g38D/P473Dh\n37D34Kbe0+9feE66xDBewZK4ftrF1L" +
       "yc1XCRV6ioOk0XuHzVHKllVNX72LydmXlD/qA/H6EQ7GwL\n9Xi7QgRV7dgS" +
       "jloYp5NF7LUvQKaSvUKql2leVMegt5yxGfWwbyiZSvCNsH0XjQ/1D9KRewxq" +
       "pu9N\nDo+thafG7FST22P30dcXwA5T8zSLTmmiwzP3857xs5YRzmihjnwYLR" +
       "RoCwS9wSDsGMxotip0vkmH\ncrRml0Uvy2y2HxHUq1mhEZ5a0wq1ua0QN61Q" +
       "Lhi6wT9nhBneCIFsI/Tmwwhd/rZgj7ezm6DlzAgZ\nTeh0e3jVmAnoa4qtOJ" +
       "0dc8hiSJtEG83djluWxi2ro1e1jLrxejnbtQ7G3Rpae7WjBTsWHbrvk6qD\n" +
       "wksPGNRa58wcKcZDx97ErZuqxBzpajlRVK+MZ7Fs8797thF25LKorvrepr9v" +
       "7jr+ZfcGUESTZn4D\ncHaLiad/euqvoTffPgBaTKDSbaPRgf7IECjctOR0Mb" +
       "F2tmF74R7p94ykTC7OOig6O/U5GbhCw3DO\nTe5w8HCzI0nbDs8aE89rciVp" +
       "9PXZnNuohy3fw6PgMR7cXawlSF8H8wHqQKgtEPJSlijTeHa5VmqQ\nUOJY9l" +
       "kxH6ZH8KQg82p/jVe721b763lSOxTw9oDapWbUWVp3XVtrfkhL82snNY8wE8" +
       "1Auoo1d3oy\npkkJyONmzYP2yYl/dcTP3zloxNBq/gKHF9wSuIJb6j+4aCQm" +
       "zsQ0R1rjmuTIbc+cP3FufIURh8aV\nx+1Ztw58H+Pagy2mSqVMsG6pGZj0S3" +
       "eue3Zh/N0pj2mEOdjUZhV6z1TC9O1AzFYLDvgPw9Nqwr/1\nxuBfkE2CP+Rw" +
       "FOBw9Ew+cNTpb+vs9XZ3cvCnYx++NhyOwTYwDRa6x96V4eTFuZqdbqghD8wN" +
       "X9jQ\neOm7HuRZ4vyR484nM0JMfL6w5RPPiytb2JmzaErQDe5xX5Zl34U5rr" +
       "iY4pUOXzUt4SveC8/xXuhi\nW/IRVVUztZ3doR7bNz/Pk2/8fm83ZGqrnIa+" +
       "Q282ODgX+L4IT9BcUPCmwfdLbtnBkL3AX+Ulq/K3\ndfV4e4M3Dr6TkDdTm2" +
       "QuGPR7nMnhTxw22bCETfjVnuFX25nJN+6+MUrNKGVxqwsnvbYZX8mTGQEn\n" +
       "vRDD665mkyUR0wnPXaZ17rppxPyZs2Fn0F7qa3lJQTvagt3GOd617dXYBxHj" +
       "zvraIHqV0OvSZJzX\n/i1e+4Ct/dt50h4cFQrAsYDOm3EKIxMEJ8/6HP3ond" +
       "HqrB8wjGt2cf3igxvOqLV/MGjRugovi6Cy\n6ZQs88dmrlyianhaYsstMw7R" +
       "xtrfI+hz13/fCjugUWBG+psxxDnYgq9jCNcZ2+x8nqCGJTqDt+gH\n3+NDgl" +
       "bm7gEzmCVe/iPYs5zy4G77Cy/6T4IKQZQWL6o5QGbcZ6TNPc86J0dVLEr0Li" +
       "z9gxeLtj/x\nl/+yNLtUNH5Jor+ewGF/VtIl0t4PxDCvs+sT2kZvlMWUBoFL" +
       "2HnE9FWlboxo/FrSwN8VZOZq2bF7\nbCj7uiDUk79DXxDGKqKHvpu/k1/Q0J" +
       "pcFmOr4O8P6Hp2mtP+HxPAxW8LHAAA");
}
