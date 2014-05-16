package net.javacoding.jspider.api.event.resource;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.ForbiddenResource;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;

public class ResourceForbiddenEvent
extends net.javacoding.jspider.api.event.resource.ResourceRelatedEvent
{

    
    public ResourceForbiddenEvent(net.javacoding.jspider.api.model.Resource resource) {
        super(resource);
    }
    
    public net.javacoding.jspider.api.model.ForbiddenResource
      getResource(
      ) {
        return (net.javacoding.jspider.api.model.ForbiddenResource)
                 resource;
    }
    
    public java.lang.String
      getComment(
      ) {
        return resource.
                 getURL() +
        " is forbidden";
    }
    
    public void
      accept(
      net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.
          visit(
          this);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYe2wURRif6+P6hNIHUiylFapSbe9614dCE0MtJRwccPTq" +
       "g1pz7u3OtQt7u+vu\nXHsgElFeakKC+Ex8RKMhMcQ/JOgfmqAR35po//AZjQ" +
       "ZjNArBGKPxEfxmZre7t73SEOsluzc3833f\nfM/fzHfHzqBi00BLRDNAdujY" +
       "DPTHY4JhYqlfEUxzCKYS4pvFZbGjG1StAPmiqECWCKqKimZQEogQ\nlKVgZE" +
       "1v1kDNuqbsGFU0YsmZJmXV8r8nPjiwvqEQVQ2jKlmNE4HIYr+mEpwlw6gyjd" +
       "NJbJh9koSl\nYVStYizFsSELirwTCDV1GNWY8qgqkIyBzUFsaso4JawxMzo2" +
       "2J72ZBRVippqEiMjEs0wCVoQ3SaM\nC8EMkZVgVDZJbxT5UzJWJPN2tBsVRl" +
       "FxShFGgfCSqG1FkEkMrqXzQF4ug5pGShCxzVK0XVbBE01e\njimLWzYAAbCW" +
       "pDEZ06a2KlIFmEA1XCVFUEeDcWLI6iiQFmsZ2IWgS2cUCkSluiBuF0ZxgqB6" +
       "L12M\nLwFVGXMLZSFooZeMSYKYXeqJmStam/2V/9wX+72ZxbxIwqJC9S8Bpq" +
       "UepkGcwgZWRcwZ/8gEHoxs\nzSwpQAiIF3qIOU3f5S/fEP3hZBOnachDszm5" +
       "DYskIf7ds6Rxsu+7skKqRqmumTJNhRzLWVRj1kpv\nVodsvmRKIl0M2IuvDb" +
       "619a7n8U8FqDSC/KKmZNJqBJVhVeq3xiUwjsoq5rObUykTkwgqUtiUX2O/\n" +
       "wR0pWcHUHX4Y6wIZY+OsjhAqgccHTzPinyr6AnVpamYMEa/VjKQMGa4OjGOV" +
       "BHSCrlcxGaG5IGoS\nZMHINlOXJWyMCLo8ginRiGHxjswkJEv3r5rw+Wghe8" +
       "tQgZxdpykgMiEePf3eroEN9x7kQaWJaGlO\n0GpQI+CoEbDUCIAaAaZGwFYj" +
       "kF8N5PMxBRbl+p4GU6I19/OLvQsOtZsvFaDCYVQmp9MZIiQVDLUq\nKIo2ga" +
       "UEYcla7SoMlo+QzJVJyGvQKqGAIFZH4OxxAy3z5q9T9REYCZCUk7vPf3Q2MX" +
       "GcphpNjToq\nnasGgd7Odatsjd+6/raDywop0UQRjSGQtswuPSGevW/j8U/e" +
       "/2qFUycEtUwr3+mctPy86scMTcQS\nwJsj/pE/1507UrzyRAEqgpoGVCMC5C" +
       "JAxFLvHjll2GtDGnUWcFakNCMtKHTJxqFyMmZoE84MS6J5\nbLwAHFABTzE8" +
       "tVYiV9MXXayhr1qectSfHhsYYP5xj7/j01cr3mROsbG1ygXCcUx4pVY74Rgy" +
       "MIb5\nrx6NHXnozIFbWCysYBDk1zNJRRazTL9FPoh9bR7UCNTXPfhw6+Of2s" +
       "GudaT3GYawg8Y6u2ey8bG3\nhScAUaCyTXknZoXrmwp7PbZFDvRv5DjEUWvX" +
       "46f3t37z+YcWsrlOTIfqx8TezEv7Tk4WUBeXwdkl\nmJvsMmNnJx352HkCYW" +
       "QpT2fKmD/LeSWHiMXZFe64BhSqgZ3oWRuQpUBUEwUlsubp1ysmD2d61nNV\n" +
       "5rkIImsS2aYPn2s938xUsHb0u8DT+l0yLhibHASgX2GCNvx3NFoVuqats6u9" +
       "G8wotYlZ2OoIar0A\nyqQ1CStT4GJHmr7b2LidZiCLEmJuWmaRUCDwot5aer" +
       "jbVZRO3vHbG0+WN/OsoDxLXGKusKQ4G9mr\n4PrGmQ5IdrgfuPmXyv3CqVt5" +
       "FGpygW9AzaS7n/oMt66uFPPgbRnR9HYFXKo4Vnh328guDrYZVTc1\nfbu25+" +
       "idXjMKKeq7czaXLSG+/sLJL7s/+2IvaDGMSjZtjvf3RQdA4aYLbpcQq8cbth" +
       "SOye+wRLKg\nbdp1J5ep120mZLmB4bamDuVkeXMOxlwFz0ILYxbmwxhXjGZI" +
       "hlkzZSNBFaOYDLqTMchrbchVa9ey\nhU76umFuKiEcaguF2rugrupc+19pNn" +
       "O/2FURnrUqpiTbMhDjXZ/jyqXwLLZcufh/cuUtBJWDKf1a\nOg0muj2ZdDwZ" +
       "6nA8Kc6RJ7upJzs7CKp1tp/myAUM7+nVIcDv1Pnc1AZPo+Wmxotzk31IuMxO" +
       "u8wO\nOWarc2T2yrZwZ3tXJwG4lgG+oZuxTG2f9b7GZNzIuWYPrAxnrCCKWC" +
       "cAJw1uOIkZchoOjnHrfn9i\n+NcO6fur13DQq3f3jW7CdeHzuKX2h3MM+jwH" +
       "YZ4mwrPJ4aXPfn/89GAdB07eaS2f1uy4eXi3xUyp\n1Cl0X3ahHRj1qasvO7" +
       "Z78OtkgeWCfoKKxjXa3vqZvh0oCx1h/tjQ20X9tI6X92XissnbVryhV7/L\n" +
       "Lm1TvVMpnMGpjKK48NGNlX7dwCmZKVLK72I8we6+8KmZezf3Hrl7uIx9BDXP" +
       "JoOgYvbt5jsIrejM\nfAQVwttNfz/4Kz89JLA1ctMfImh+Lj3Ai/PDTXoYdg" +
       "NSOnxAdxfgEReC9+h2eVx38e3MIFYEgiUW\nXppAda5bVVzHokwvXtlnXina" +
       "cujjv9iZWCLyPy9owy6aQVahwT5VUHaYsmn9sUG7FzFjwM2csMuD\nFe0Kk0" +
       "vkDXqD+++Uqb1ahrbGBnhKd4FfmJGhzhAFwbnAls6OtnC4PdwDWT+0LhKfix" +
       "5wt4EW5/Ma\ns8SCXFTDgGO+A9X0puRe1C2N/gXvL3QwmxIAAA==");
}
