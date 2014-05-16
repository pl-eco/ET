package net.javacoding.jspider.api.event.site;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;

public class SiteDiscoveredEvent
extends net.javacoding.jspider.api.event.site.SiteRelatedEvent
{

    
    public SiteDiscoveredEvent(net.javacoding.jspider.api.model.Site site) {
        super(site);
    }
    
    public java.lang.String getComment() {
        return "site " + site + " discovered";
    }
    
    public void accept(net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.visit(this);
    }
    
    public net.javacoding.jspider.api.model.Site getSite() { return site; }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYaWwbRRQe53DONs1RCCRt0jZAQ2M7zkVDfkCUpKpbt3Hj" +
       "cDSkcje743Tb9e6y\nO+s4BQoIaKFChaqcEodAoEoI8YOq5QdIBZX7kCA/OF" +
       "UEKkIgDoEQAnGovJnZza4dpwFFRFpnPfPe\nvDfvfe+bN372B1RsGqhRNINk" +
       "WsdmcCAeEwwTSwOKYJqjMJQQXysuix3drGoFyBdFBbJEUFVUNEOS\nQISQLI" +
       "Uig30ZAzXrmjI9qWjEXmfOKpev+Wvq3QObGgpR1RiqktU4EYgsDmgqwRkyhi" +
       "pTODWBDbNf\nkrA0hqpVjKU4NmRBkfeCoKaOoRpTnlQFYhnYHMGmpqSpYI1p" +
       "6dhgNp3BKKoUNdUkhiUSzTAJWhbd\nLaSFkEVkJRSVTdIXRf6kjBXJvB7tQ4" +
       "VRVJxUhEkQPC/q7CLEVgxtoOMgXi6Dm0ZSELGjUrRHViES\nTbkasztu2QwC" +
       "oFqSwmSXNmuqSBVgANVwlxRBnQzFiSGrkyBarFlghaAL510UhEp1QdwjTOIE" +
       "QfW5\ncjE+BVJlLCxUhaDluWJsJcjZhTk582Rr2F/598HYb80s50USFhXqfw" +
       "korcxRGsFJbGBVxFzxdyt4\nX2S71ViAEAgvzxHmMv0XvXBV9JuTTVymIY/M" +
       "8MRuLJKE+FdP44qZ/q/KCqkbpbpmyhQKWTtnWY3Z\nM30ZHdB83uyKdDLoTL" +
       "488vr2W57B3xWg0gjyi5pipdQIKsOqNGC/l8B7VFYxHx1OJk1MIqhIYUN+\n" +
       "jX2HcCRlBdNw+OFdF8gu9p7REUIl8PjgaUb8byn9gAzEZYIHZVPU0hAraSiN" +
       "VRLUCepTMRmnQBA1\nCSAwvtvUZQkb44Iuj2MqNA6e4/G82hlqtWrK56Plm1" +
       "t8CiB1o6bAWgnx6Jm3bxzafNedPJUUfra/\nBPWC/aBrP2jbD4L9ILMfpPaD" +
       "eewjn49ZPj871DR3Ei2x75/vW3YoYJ4oQIVjqExOpSwiTCgYSlNQ\nFG0KSw" +
       "nCsFntqQMGP8Bu5QTAGNxJKLAQKxuIbdpAq3Ph6hZ5BN4EwODMvrPv/5iYOk" +
       "aRRZFQR1fn\nrkFe93DfKlvjOzbtvHN1IRWaKqIpA9GWhVdPiD8e3HLsw3dO" +
       "r3XLgqCWOdU6V5NWW677MUMTsQRs\n5i7/4B8bfzpS3Hu8ABVBCQOJEQGgB4" +
       "ywMtdGVtX1OQxGgwWaFUnNSAkKnXJop5zsMrQpd4ShZwl7\nXwYBqICnGJ4a" +
       "G7d0DNHJGvpRy7FG45mzB8aPv9/mb//opYrXWFAcKq3ycG4cE16Y1W46Rg2M" +
       "Yfz0\nQ7Ej9/9w4DqWCzsZBPl1a0KRxQzz73wf5L42D0kE6+vue6D1kY+cZN" +
       "e6q/cbhjBNc525dWbFw28I\njwKBQCGb8l7M6tQ3m/Z67Cw5NLCF0w4nqRsf" +
       "ObO/9YtP3rOJzHNAulLfJm63TtxxcqaAhrgMjirB\n3OrUFzsq6ZuPHR+QRg" +
       "Z5OlLG4lnOSzhMbM2ujq7LwKEasESP1qAsBaOaKCiRwSdeqZg5bPVs4q4s\n" +
       "8QhEBhOZpveebj3bzFywLfo9XGl/L0kLxla39Om/DoIGF8E/l4d72jrDga52" +
       "QuNKOK7qCLroHJyS\n0iSsMDpxUks/29h7gEKOpQWxuKy2RWjl5/LbBnp4O2" +
       "WTmrjh11OPlTdzGFCdRs8yF9uruIacWYj1\nivkOQHZ4H7j258r9wqs7eNhr" +
       "spluSLVS3Y9/jFuvrBTzMGsZ0fSAAjFU3F3kWtvCGgNnG1XXNH25\noefoTb" +
       "nbKKT87gVptlpCfOW5k591f/zp7eDFGCrZOhwf6I8OgcNN5zSXEKvTDdsKd8" +
       "lvMuTYXDan\nnclW6vNuE2BtYOjG1NEsWDdnkcpKeOpsUqnLRyqeHM0DhgWR" +
       "soWg8klMBrRUCpDJREK8tkY9tbWe\nTXTSj6sWifyO9rZwONAJyK917V5iNv" +
       "NwOIWwjNERPdmCvMNDbGZTVnza4Km341P/3+LjcJhnvwnP\nfnvd/e5c7H67" +
       "2jo6A12dBGhEBjloqu09BhZsINgaV3OthVN5HXC/IIpYJ4D6Bi/qY4acAkJL" +
       "223m\n8bFf2qWv1w3y2qz3Xl+8ghs7zuKW2m9+YhWaQ9B5etkcI4dXPvX1sT" +
       "Mjdby+ecO/Zk7P7dXhTT/b\nSqVOGWbVuSww6VfXrXp238jnEwV2CAaAT9Ma" +
       "vWX5mb/t+WDTAE+jDZvG/6msoO0oAXjHHW63MTbt\nYqy73cXYXoKumAdjwP" +
       "rjumJNyuo49Atk2CK6RWJsgB4j4fVtXeFAd8+lBC3hmLGt0mXXowxUWR5Y\n" +
       "0gO/fs6dk9+MxNUzO9ee0qvfYn3U7O2lFI7FpKUoHgbzsplfN3BSZnss5e0R" +
       "3/At5z7T3D7ZexDe\nzHVvI6h5IV2Citl/r95+uATOr0dQIXx65e+Cu2t+eU" +
       "ii/eaVv5ugpdnywKHuF6/oPWANROnrvboX\nCIc9ZNOjO4zQ8++vFCMY0GCn" +
       "k9ZKnaexietYlGnvk3nyxaJthz74k51SJSL/uYBekUUzxMgo1K8K\nyrQpm/" +
       "ZPCfQCIVoGNMeEHed2ditMviK/Ejd4f8CYtdUyuj02xKu3C+LBNhdu7+roXS" +
       "x/9raFuwPh\nbgDI6MZIfFEXr30GuiBfnJjvNiPQNh7Ybal7ANFuxTup2678" +
       "A9RLMxv/EQAA");
}
