package net.javacoding.jspider.core.rule.impl;

import net.javacoding.jspider.api.model.Decision;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.DecisionInternal;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class RobotsTXTErrorRule
extends net.javacoding.jspider.core.rule.impl.BaseRuleImpl
{

    
    public net.javacoding.jspider.api.model.Decision apply(
      net.javacoding.jspider.core.SpiderContext context,
      net.javacoding.jspider.api.model.Site currentSite, java.net.URL url) {
        return new net.javacoding.jspider.core.model.DecisionInternal(
          Decision.RULE_IGNORE,
          ("robots.txt fetch resulted in an error - all resources in sit" +
           "e are ignored"));
    }
    
    public RobotsTXTErrorRule() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVXXWwURRyf67XXXntYWgo0tNCmgNJI96TpB9AX61Hk2oPW" +
       "XolQS47t7ly7dG53\nnZ1tr3xFIwLyYGLArwQ1PhgSY3yQiC8mSBC/SUwfBD" +
       "UkGnzQKEQfjMRg8D+zt93ttaVGLtnZ2Zn/\nf/6///fcOzdQkUVRrWJJbNLE" +
       "lhRL9snUwmqMyJY1AEsp5VJRuO9Mj24UoEACFWgqQ+UJxYqqMpOj\nmhqNb+" +
       "nIUlRvGmRyhBgsd86sUzavvj3x1bHumiAqH0Tlmp5kMtOUmKEznGWDKJLBmW" +
       "FMrU5Vxeog\nqtAxVpOYajLR9gOhoQ+iSksb0WVmU2z1Y8sg45yw0rJNTIVM" +
       "dzGBIoqhW4zaCjOoxdDixD55XI7a\nTCPRhGaxjgQKpTVMVOtJdBgFE6goTe" +
       "QRIFyWcLWIihOjW/k6kJdqAJOmZQW7LIVjmg6WqMvnmNZ4\nTQ8QAGtxBrNR" +
       "Y1pUoS7DAqp0IBFZH4kmGdX0ESAtMmyQwtCKeQ8FohJTVsbkEZxiqDqfrs/Z" +
       "Aqqw\nMAtnYWhpPpk4CXy2Is9nPm/1hiL/nOj7q174vFDFCuH4i4FpVR5TP0" +
       "5jinUFO4y3bOlUfLddW4AQ\nEC/NI3ZoOtd+sDPx8/k6h6ZmDpre4X1YYSnl" +
       "dlvtyqnOn8JBDqPENCyNh8IMzYVX+3I7HVkTonnZ\n9Il8U3I3P+r/ZPdTb+" +
       "NfC1BJHIUUg9gZPY7CWFdjuXkxzBOajp3V3nTawiyOColYChniG8yR1gjm\n" +
       "5gjB3JTZqJhnTYRQMTwBeFYg57eIDwxV9RvDBrMGdg10UWrQfptgyWRos47Z" +
       "EI8DxVAhAob2Waam\nYjqkGBQPUSAa0jImGZqLOctllk8EAjx581OPQJxuMw" +
       "gclVLOXP/iYFfPc8cdR/Lgy6FlaCOIlzzx\nUk68xMVLXLzExUuzxaNAQAhe" +
       "PtPO3HEqz6/f3utY/HyTda4ABQdRWMtkbCYPEwx5KRNiTGA1xURg\nVviSQM" +
       "QeBG5kGGIY0KQIHCRyBgw7TlFDfqx6GR6HmQwBOHX4ztc3UxNneVjxMKjipz" +
       "vQwKljDrZI\nY3JP997jDUFONFHI/QWkaxY+PaXcPLH97DdfXlvn5QRDa2al" +
       "6mxOnmr58PuooWAVSpl3/Mt/b/v9\nZNGm9wtQIeQvVDAmQ9xBOViVL2NGyn" +
       "W45YsbCzjL0gbNyIRvuTWnlI1SY8JbEcGziA8VThxxY+UB\nFJXv1jOhh658" +
       "WHZJaOwWyXJfNU1i5qRchWfrAYoxrF97pe/kizeOPSEMnbM0QyHTHiaakhVA" +
       "lgfA\nsUvmSH+puurUS42nr7ieXOKd3kmpPMkdmX16auWrn8qvQWmAFLW0/V" +
       "hkIBKSkCuAjw+K+XrfJv9u\nyJHw4MrPoK28ObieyQwf+PPi66X1DhjOU+uX" +
       "sVqM9+c05PN17sme8GkOilbOV3RFwzi264/IUfnj\nPU5prJyZYF26nWl94y" +
       "pufDiizJHPYWaYTQSPY+Jpli9tu2hGrmrlj9f9uLXtzKF81URVwS5PV2z7\n" +
       "TLaUcuHd89+3Xv3uCKAYRMU7epOxzkQXAK67q7iUUjFe81hwVPusQLRCJ4Vm" +
       "tdCZTB1+NSGWKYYb\ngM4NxlfCwpf1AvtiQF4GTw88y3IFWLz5ZiUfljjhzo" +
       "eWOQMkKNQPgvrVfvWdduQ0r4Onrx9t/OHb\ny7kG57s4eVS/pI7Y5549PyXU" +
       "DMMVRrZ2eCrAFYrPAuJaARkuqqGnTKlT3OMsx9nS2toOgCpBEr9y\nSZoqJQ" +
       "xFJvEtb14om3rBbut2oCzyEcS3pLJ1l99qvFMvIOQkhnw9NPddPC7THV4Q8V" +
       "c3Q7H/35g2\nNzevb25ramlnqFhxLnfCulUMNd6t3yTFPObjeNSxQ7/PDhvF" +
       "Rg8fkveMsmVTU1srQ2WKTaGYsqTG\nsIt07TxIZVOTMoaKiTRNnUO524dyk4" +
       "dy8J5RtrU3tbcwFLQpcdFFRDXkEHf2JxYudDGGimTTJJN+\nvIoPb5uHV71n" +
       "vBs2NLWDVe8TEh+w6p10XSgEPMNuwYpmQXyiLFySZwvh3aB61l8N50KsNEzt" +
       "XXfR\nrPhcdNDpS2sJRH3aJsRXRPwFJWRSnNaEUUqcxuhYiMwfBjMvSAwV8p" +
       "dQcczhNRiqX4gX2PjLzwa9\nvuYubMDBX34OG/6zzM0B6Zeb+enBqPfNpGeo" +
       "1Pvwkx6AoANSPj1o+kPnkC90Wk3Xs83/7TL5iGxh\n7sc4fGTNfwF4265pfg" +
       "4AAA==");
}
