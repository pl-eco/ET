package net.javacoding.jspider.core.logging.impl;

import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogProvider;

import et.util.MyUtility;

public class SystemOutLogProvider
  implements net.javacoding.jspider.core.logging.LogProvider
{

    
    public net.javacoding.jspider.core.logging.Log createLog(
      java.lang.String category) {
        return new net.javacoding.jspider.core.logging.impl.SystemOutLogImpl();
    }
    
    public SystemOutLogProvider() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1WXWwUVRS++9PdbrvQHwo0tNCmoLSR7raEVqAx2pQ2LGzb" +
       "lcUoa8lyO3N3O3R2\nZpi5024RiUYE5MHEgH8JanwwJMb4IBFfTJAg/pOYPg" +
       "hqSDT4oFGIPhiJweC5d2a6s9sFmugmO3Pn\n3vN/vnPOfecaqjB01CwYETqj" +
       "ESMykExg3SDigIwNYydspYULFaHEqe2K6kWeOPJKIkU1ccGIipji\nqCRGY1" +
       "v68jpq1VR5Jiur1JYzT8rm1TenvzqyrcmHalKoRlKSFFNJGFAVSvI0hcI5kh" +
       "snutEvikRM\noTqFEDFJdAnL0n4gVJUUqjekrIKpqRNjBzFUeYoR1humRnSu" +
       "09mMo7CgKgbVTYGqukFRbXwvnsJR\nk0pyNC4ZtC+OAhmJyKKxDx1EvjiqyM" +
       "g4C4TL4o4XUS4xOsT2gbxKAjP1DBaIw+KflBSIREspx5zH\na7YDAbAGc4RO" +
       "qHOq/AqGDVRvmSRjJRtNUl1SskBaoZqghaIVtxUKRJUaFiZxlqQpaiylS1hH" +
       "QBXi\nYWEsFC0tJeOSIGcrSnLmytZoIPzPscRfrTznfpEIMrM/CEyrSph2kA" +
       "zRiSIQi/GGGTkR22U2exEC\n4qUlxBZN/z0fPBL/+WyLRdNUhmZ0fC8RaFq4" +
       "2du8crb/p5CPmVGpqYbEoFDkOc9qwj7py2uA5mVz\nEtlhxDn8aMcnu556m/" +
       "zqRZUxFBBU2cwpMRQiijhgr4OwjksKsXZHMxmD0Bjyy3wroPJvCEdGkgkL\n" +
       "RwDWGqYTfJ3XEEJB+Hvg34is32L2AFwlZwxKcqMmjavZhK5OSSLRIxpFDyqE" +
       "jjEkCKoIGBjba2js\naExQdTImq9ks25RymjxWXkKeqa6Z9nhYDZdWoAxw3a" +
       "rKQJgWTl394sDg9ueOWvlkGLSNpugBsCFS\nsCFi2xBhNkRsGyLMhkg5G5DH" +
       "w7UvL445S6LIau239/pqn+80zniRL4VCUi5nUjwuE6hRLMvqNBHT\nlIO0zl" +
       "UQHIcA4vA44Bm0p2UQxOsHgjylo7ZS3BaqPQYrDGCcPXjr6+vp6dMMYgwSDU" +
       "y6ZRokeNKy\nLdyR3L1tz9E2HyOa9rPcAemau0tPC9ePDZ/+5ssr7YX6oGjN" +
       "vLKdz8nKrtR8CKVARGhrBfEv/731\n9+MVm973Ij/UMnQzigGD0BpWleooKr" +
       "8+p5WxYAFndUbVc1hmR07/qaITujpd2OEIWsQedRaYWLBK\nDORd8MYzga5L" +
       "H1Zf4B47DbPG1VmThFrlV1eI9U6dENi/8kri+IvXjjzOA21HmqKAZo7LkpDn" +
       "hiz3\nQGKXlGkFkcaGEy91nLzkZHJJQXq/ruMZlsj807MrX/0UvwZtAsrVkP" +
       "YTXo2Ia0KOAva8j6/XuQ7Z\nd5tNwsBVWkZDbFA4mcmNP/Hn+derWi1jGE+z" +
       "W8dq/rzX9pCt2x3JBeXNc0hrJI6SwYFhq+VZDfLA\nyauHO3749qLdRF3DuU" +
       "D1S/qQeebZs7NeltUQjElsjDhlzcc0W3n46ALk8CpjOyHucJXVOTZTm7O7\n" +
       "p3ej5U8DRdGFNARXC8iDKytvN0r4GDzy2B/hw/jj3ZY/9cWtYlAxcz1vXCYd" +
       "D4WFMu0pRFWtUyZT\nRC7kqFTbMB+xTpJqHm35caj31JOlSeJN0h3yYra0cO" +
       "7ds9/3XP7uEFiRQsGR0eRAf3wQDG65o7q0\nUDfV9LBvQvqMp8JuBvMuBsVM" +
       "fW43IUk6gXuNsrMoSa3c9lqwvBr+HfBvsMcKf7PDevZYYhUue2wo\nC3WP7T" +
       "773mhlfriQ+fu7IC71gDF2oYtIIqRWwHJsy5vnqmdfMHu3WUlb5CKIbUnnWy" +
       "6+1XGrlXts\nYy3gmtD2d3AK6yOFZLLXCEVb/+PQ27y+a936ns4NXRRVCpiS" +
       "rKrPONit5d2BTZGIda26e/HHIBSC\nTkAQaHHHaJerOjbxg1H2SP0/HnR3d2" +
       "7ohovgnOq1RquFAseXtQusQ5SnqKGcItYuG+fdy63bo9A2\nu6f9vFb3OR8x" +
       "cze8SkhixpRlFzbdOA1oOslIPDqV1uSwQjVOUftCrxEU+dmLe4ktdpj/qxfA" +
       "TlHQ\nXrmZJyhqugMzqGMvN8ck3MjKc4AGe+Wmhwvn4mJ6iqoKH27SfRT5gJ" +
       "Qtda0MKK3+ndf+BUSp0dx4\nDQAA");
}
