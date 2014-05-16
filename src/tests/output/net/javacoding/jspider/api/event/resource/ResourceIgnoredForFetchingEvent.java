package net.javacoding.jspider.api.event.resource;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.FetchIgnoredResource;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;

public class ResourceIgnoredForFetchingEvent
extends net.javacoding.jspider.api.event.resource.ResourceRelatedEvent
{

    
    public ResourceIgnoredForFetchingEvent(net.javacoding.jspider.api.model.Resource resource) {
        super(resource);
    }
    
    public net.javacoding.jspider.api.model.FetchIgnoredResource
      getResource(
      ) {
        return (net.javacoding.jspider.api.model.FetchIgnoredResource)
                 resource;
    }
    
    public java.lang.String
      getComment(
      ) {
        return resource.
                 getURL() +
        " ignored for fetching";
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
      ("H4sIAAAAAAAAALVYe2wURRif6+P6hNIHUCilBeqjsb3rXR8Gmxib0oaDA85e" +
       "fVBqju3uXLuwt7vu\nzrUHKhHlJSYkCL4S1Gg0JMb4h0T9QxM0vh8k2j8ENR" +
       "gNhmAUgjFGohj8Zma3u7ctXEjqJbs3N/N9\n33zP38x3r51HhaaBlohmgGzT" +
       "sRnojccEw8RSryKY5iBMJcSPCktiR9eqWh7yRVGeLBFUERXNoCQQ\nIShLwc" +
       "iq7oyBGnVN2TaqaMSSM03KbSsuT3y5d01dPqoYQhWyGicCkcVeTSU4Q4ZQeQ" +
       "qnRrBh9kgS\nloZQpYqxFMeGLCjydiDU1CFUZcqjqkDSBjYHsKkp45Swykzr" +
       "2GB72pNRVC5qqkmMtEg0wyRoXnSL\nMC4E00RWglHZJN1R5E/KWJHM+9EOlB" +
       "9FhUlFGAXCBVHbiiCTGOyn80BeKoOaRlIQsc1SsFVWwRMN\nXo4pi5vWAgGw" +
       "FqUwGdOmtipQBZhAVVwlRVBHg3FiyOookBZqadiFoMVXFQpExbogbhVGcYKg" +
       "Wi9d\njC8BVQlzC2UhaL6XjEmCmC32xMwVrQ3+8n/3x/5qZDEvkLCoUP2LgG" +
       "mph2kAJ7GBVRFzxkvpwOHI\nxvSSPISAeL6HmNP03PD2XdFzxxs4Td0MNBtG" +
       "tmCRJMTLXUvqJ3t+LsmnahTrminTVMiynEU1Zq10\nZ3TI5gVTEuliwF58b+" +
       "DjjQ+/in/NQ8UR5Bc1JZ1SI6gEq1KvNS6CcVRWMZ/dkEyamERQgcKm/Br7\n" +
       "De5Iygqm7vDDWBfIGBtndIRQETw+eJYh/qmgL4KW0dRMGyKOjKqagaV+zejH" +
       "RByDsPeNY5UEdILW\nqpgM06QQNQnmh7eYuixhY1jQ5WFMiYYNS8hwTmkZql" +
       "HFhM9HS9tbmApk8WpNAdkJ8eiZzx/sW/vY\nPh5mmpqWLQRFQJ+Ao0/A0icA" +
       "+gSYPgFbn0AOfZDPxzRZmB0WGmeJluNvb3TPO9BqvpWH8odQiZxK\npYkwom" +
       "AoY0FRtAksJQjL40pXzbBUhTwvH4GUh40SCghiJQZxGDfQcm9qO4AQgZEA+T" +
       "q548pXFxIT\nx2gW0qypodK5apADW7lu5c3x+9Zs3rc8nxJNFNDwAmlTbukJ" +
       "8cL+dce++eL0zU4JEdQ0rbKnc9LK\n9KofMzQRS4B8jvin/1598VDhyjfzUA" +
       "GUOwAeESBNAT2WevfIqtBuG+2os4CzLKkZKUGhSzZElZIx\nQ5twZlg2zWHj" +
       "eeCAMngK4am2crySvuhiFX1V89yj/vTYwLD00qP+tpPvln3EnGLDboULn+OY" +
       "8CKu\ndMIxaGAM86efiR168vzeTSwWVjAI8uvpEUUWM0y/hT6IffUMgBKorT" +
       "n8VPORk3awqx3pPYYhbKOx\nzuycrH/2E+E5ABsoelPejllN+6bCXottkX29" +
       "6zhEcUB78MiZPc0/fnvCAj3XYepQ/ZLYlX5r9/HJ\nPOriEjjWBHO9XW/sWK" +
       "UjHztqIIws5elMCfNnKS/pELE4O8LhNlCoCnaix3BAlgJRTRSUyKoX3y+b\n" +
       "PJjuWsNVmeMiiKxKZBpOvNJ8pZGpYO3od+Gq9btoXDDWO1BAv8IEDc4iPt0W" +
       "urWlo721q42gYpuL\nxa+GoOZr4E5Kk7AyBTd2yOm7hY1baSqycCHmr+UWCU" +
       "UELw720wuAXU6pkQf+/OD50kaeHpRniUvM\njZYUZyN7FWJQf7VDlF0A9t77" +
       "e/ke4cP7eDiqshGwT02nOl84hZvvKBdnQOASoumtCvhWcazw7raO\nXS5sMy" +
       "ruafipv+voQ14z8uk54E7ebLaE+P7rx7/vPPXdLtBiCBWt3xDv7Yn2gcIN19" +
       "wuIVaO192Z\nPyZ/yjLKwrhpV6Jspm63mZDuBoYbnTqYle6NWWBDozrfApv5" +
       "M4GNK0ZXSYacmbKOoLJRTAbcyRjk\nRTfoKroQW2inr7tmuSTCoZZQqLWjk6" +
       "AalyI3mY3cQXZ5dOYsDybY2scWgxj7miy3LoVnkeXWRf+T\nWzcRVArW9Gqp" +
       "FFjp9uqIy6vtjlfF2fZqJ/VqOwBNtaPHNKfOY6cBvVgE+GV8Jn+1wFNv+av+" +
       "+vxl\nHyEu+1Mu+zsc+9XZtn9lS7i9taOdAKrLgPLQD1k2t+a83zEZd3Ou3K" +
       "GW4SgWRBHrBMCmzg02MUNO\nwfkybnUIbw790SadvWUVh8Rad+fpJlwdvoKb" +
       "qs9dZMDoOS9naEM8mxxc+vLZY2cGajis8l5txbR2\nyc3D+zVmSrlOgX3ZtX" +
       "Zg1B/esuy1HQM/jORZLuglqGBcow2yn+nbhjIAhzmCRG8jtdOaZ97iicsn\n" +
       "N9/8gV75GbvkTbVhxXBmJ9OK4oJRN6T6dQMnZaZRMb+78ZR75NqHa/al3nsy" +
       "7+QydhPUmEsGQYXs\n2823D7raq/MRlA9vN/3j0IzPTA+ZbI3c9AcImptND8" +
       "jj/HCTHoTdgJQOn9DdJXnIKcnQSt2uk9uv\nvw8awIpAsMTCSzOpxnULi+tY" +
       "lOlFLfPSOwV3Hvj6H3Z0Fon8fxDa+4tmkJVqsEcVlG2mbFr/kdBu\nR0wbcJ" +
       "Mn7I5hRbvM5BJ5r1/n/mdmaq+mwY2xPp7bHeAXZmSovS3UOcto097WEg63hr" +
       "ugDgZXR+Kz\n2kXuMNCimfzIbLNgGVUxTJnrwDm9YrkXdUu1/wDJHfEE+BIA" +
       "AA==");
}
