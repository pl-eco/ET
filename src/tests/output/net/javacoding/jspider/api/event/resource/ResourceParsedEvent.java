package net.javacoding.jspider.api.event.resource;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.ParsedResource;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;

public class ResourceParsedEvent
extends net.javacoding.jspider.api.event.resource.ResourceRelatedEvent
{

    
    public ResourceParsedEvent(net.javacoding.jspider.api.model.Resource resource) {
        super(resource);
    }
    
    public net.javacoding.jspider.api.model.ParsedResource
      getResource(
      ) {
        return (net.javacoding.jspider.api.model.ParsedResource)
                 resource;
    }
    
    public java.lang.String
      getComment(
      ) {
        return resource.
                 getURL() +
        " parsed (handled)";
    }
    
    public void
      accept(
      net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.
          visit(
          this);
    }
    
    public java.lang.String
      toString(
      ) {
        return this.
                 getComment();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYe2wURRifa6/Xp5Y+wGIpLVjUSnvX6xUQGx9NKenBAWev" +
       "Pqg153Z3rl3Y2113\n59rDB9GogCSSEPAZhWg0JIb4h0T9QxM0gm8S7R8+o9" +
       "FgjMZHNMZIFIPfzOz25rZXGgM22e3c7vd9\n8z1+329m9vDPqMS20CLZDpJt" +
       "JraDfYm4ZNlY6dMk2x6CR0n5eEl5/NB63ShCvhgqUhWCqmOyHVIk\nIoVUJR" +
       "Rd05O1UItpaNvGNIM4dmZYueqS05Mf7FzXWIyqh1G1qieIRFS5z9AJzpJhVJ" +
       "XG6VFs2b2K\ngpVhVKNjrCSwpUqaegcIGvowqrXVMV0iGQvbg9g2tAkqWGtn" +
       "TGyxOd2HMVQlG7pNrIxMDMsmaF5s\nizQhhTJE1UIx1SY9MRRIqVhT7NvRdl" +
       "QcQyUpTRoDwQUxN4oQsxhaS5+DeIUKblopScauin+rqkMm\nmr0a0xG3rgcB" +
       "UC1NYzJuTE/l1yV4gGq5S5qkj4USxFL1MRAtMTIwC0EXz2oUhMpMSd4qjeEk" +
       "QQ1e\nuTh/BVLlLC1UhaD5XjFmCWp2sadmQrU2Bar+2R3/s4XV3K9gWaP+l4" +
       "LSYo/SIE5hC+sy5oqnMsH9\n0c2ZRUUIgfB8jzCX6V32yg2x7482c5nGAjKb" +
       "RrdgmSTl0ysXNU31flteTN0oMw1bpVDIi5xVNe68\n6cmagOYF0xbpy6D78v" +
       "XBtzbf8zz+sQiVRVFANrRMWo+icqwrfc64FMYxVcf86aZUysYkivwaexQw\n" +
       "2G9IR0rVME1HAMamRMbZOGsihErh8sG1DPG/anqDClBoZiwZ867on8A6CZoE" +
       "XatjMkKBIBsKQGBk\ni22qCrZGJFMdwVRoxHIURwpayNKZqyd9PtrC3gbUAK" +
       "0Dhgb2kvKhk+/d1b/+wV28nBSCjs8EXQ0+\nBHM+BB0fguBDkPkQdH0IFvAB" +
       "+Xxs9ovyU05rqNBW++nFnnl7OuyXi1DxMCpX0+kMkUY1DC0qaZox\niZUkYR" +
       "itEfqBwRAwXDUKcAaXkhoYYu0DOZ6w0FIvbHPNHoWRBFic2n7mw1+Sk0cowi" +
       "gi6ql17hrU\ndyv3raotceu623YtLaZCk35aOhBtndt6Uv5l94YjH7//5eW5" +
       "9iCodUbXztSkXed1P24ZMlaA1XLm\nH/1r4Nd9JatfKkJ+aGUgMyIBBIEZFn" +
       "vnyOu+HpfJaLJAszJlWGlJo69c+qkg45YxmXvCEHQBG8+D\nBFTCVQJXnYPf" +
       "GnqjL2vprY7jjebTEwPjyVP3BTo/ea3yOEuKS6nVAvcmMOENWpMrx5CFMTz/" +
       "8rH4\nvod/3nkLq4VTDIICZmZUU+Us8+8iH9S+rgBZBBvq9z/S9uQnbrHrct" +
       "Z7LUvaRmudvXeq6fG3paeA\nSKChbfUOzPrVN132Buya7O/bwOmHk9VdT57c" +
       "0fb1ZyccQhMWypzUD8n7My8/cHSqiKa4HJYsyd7o\n9hhbMunIx5YRKCODPH" +
       "1SzvJZwds4TBzN7q5wBByqhZnoEhtUlWDMkCUtuubpNyqn9mZWruOuXCAI\n" +
       "RNcks80nnms708JccGYMCJzp/C6dkKyNufan/7oIGjhHHroqvKo9Eu7ovpKg" +
       "MleS1ayeoLaz8Eva\nULA2TStumem9nY07KPxYiRDL0VJHhLKAl+/W0gXdba" +
       "H06J1/vHmgooVDguosEsxc6ljJTeS+hbw3\nzbYosgV9582/Ve2Qjt3KS1Cb" +
       "z3r9eia94uCnuO26KrkA05YTw+zQIJ9aLgrvbBvYZsENo/qm5m/W\nrjx0tz" +
       "cMP+V7EbD5akn5jReOfrHi08/vBy+GUenGTYm+3lg/ONx81umScs1E4/XF4+" +
       "o7DEUOr83Y\n4uQr9YhhAsQtDDs0fSgP4i15BHMZXPMdgplfiGCEGs0ChjmR" +
       "soGgyjFMBkUwhnijDQmN1s1eROjt\nhvPQBl3h9nC4I7KaoHph8svsFp4Uty" +
       "VCc7YEN+saQExxXV4SF8O10Eniwv8pibcQVAFx9BnpNMQn\n5nBUyOHKXA5l" +
       "gqLnmsNId3t4RUfXqitg7SDjqh30eAD5m8cInu4VgnzvXChB7XA1OQlq+m8J" +
       "clcF\nIeC0EPCqXMD6+QDN6vauSEd3hAA5q0DWcGRx4uyYc2vGbNzIteaupw" +
       "orqiTL2CTAH40if8QtNQ3L\nxISziX9p+PdO5bvlazjLNYiHQ1FwoOsMbq37" +
       "/lfGdZ5lr8BJwTPJ3sXPfnfk5GA9Z0p+nLpkxolG\n1OFHKhZKlUm5esnZZm" +
       "DSx5YvObx98KvRIicFfQT5Jwx6hg0wfztn660lDnSW/E+9dQ8slcTg8BWB\n" +
       "tlMA2pU5oO06D0CLRBg7dcJu2515mproHGMoS1BdAV26qWqYcb7np1B56dRt" +
       "l79p1rzL9qrTJ8Uy\n2HqkMpomrAziKhEwLZxSWcBlfAvKo99z9v1C/nnEu9" +
       "l4iNvYS1DLXDYIKmH/Rb39cPCeXY+gYriL\n8o8StKCwPHSyMxLlnyDownx5" +
       "oNfcD1H0KZgNROnwgCmi46CAji7T5Ylr/vsRbhBrEnHKSzupXthM\nJkwsq3" +
       "S/mX3mVf/1ez76m+0GSmX+qYZ+npDtEKOqUK8uadts1XY+49BDm5yx4EBC2L" +
       "bJqXalzS3y\nzxGN4sej6blahzbH+3lvd0NeWJDhrk6K1nMHPltSwiug94cG" +
       "oolzPvRut9DCQvliMTi8gWoZd16Y\nW6ro7lB8aTru/Au1Do0mgxMAAA==");
}
