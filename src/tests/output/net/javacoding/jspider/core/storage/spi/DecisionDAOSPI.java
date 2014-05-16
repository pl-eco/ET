package net.javacoding.jspider.core.storage.spi;

import net.javacoding.jspider.core.model.ResourceInternal;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.DecisionInternal;

import et.util.MyUtility;

public interface DecisionDAOSPI {
    
    public void saveSpiderDecision(
      net.javacoding.jspider.core.model.ResourceInternal resource,
      net.javacoding.jspider.core.model.DecisionInternal decision);
    
    public void saveParseDecision(
      net.javacoding.jspider.core.model.ResourceInternal resource,
      net.javacoding.jspider.core.model.DecisionInternal decision);
    
    public net.javacoding.jspider.core.model.DecisionInternal
      findSpiderDecision(
      net.javacoding.jspider.core.model.ResourceInternal resource);
    
    public net.javacoding.jspider.core.model.DecisionInternal findParseDecision(
      net.javacoding.jspider.core.model.ResourceInternal resource);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYb2wbRRYfO4nzp6ZJ3FAi0jalgCBHvA6N6yTkA4QkVd24" +
       "jYlBQBrkbnbHybbr\n3WV37LgFKv62gAAJUf5eryckTpUA8QEEfEEqCLg70C" +
       "Gd8gXuTodARYjTAQIhBEKg8mZmNzvemBQI\nRNr1ePa9eW/f7ze/ec6zn6EG" +
       "x0YbFEciByzsSKO5rGw7WB3VZce5GqbyypsNzdkTE4YZRqEMCmsq\nQa0ZxU" +
       "moMpETmppIjw1XbLTZMvUDc7pJ3HWWrXLZ+d8v/OPIzq461DqNWjUjR2SiKa" +
       "OmQXCFTKNo\nERdnse2MqCpWp1G7gbGaw7Ym69pBMDSNaRRztDlDJiUbO1PY" +
       "MfUyNYw5JQvbLKY3mUFRxTQcYpcU\nYtoOQW2ZfXJZTpSIpicymkOGMyhS0L" +
       "CuOjeiQ6gugxoKujwHhusz3lsk2IqJ7XQezFs0SNMuyAr2\nXOr3awZUojvo" +
       "sfTGF0yAAbg2FjGZN5dC1RsyTKAYT0mXjblEjtiaMQemDWYJohB07k8uCkZN" +
       "lqzs\nl+dwnqDOoF2WPwKrZlYW6kLQ2UEzthJgdm4AMwGtyUj0h3uz32xmmN" +
       "erWNFp/o3gtCngNIUL2MaG\ngrnjtyXpaPr60oYwQmB8dsCY24xc+PI1mU9O" +
       "dnObrho2k7P7sELyyvepDRsXRz5qrqNpNFmmo1Eq\nVL05QzXrPhmuWMDm9U" +
       "sr0oeS9/DVqb9ef+vT+P9h1JRGEcXUS0UjjZqxoY6640YYZzQD89nJQsHB\n" +
       "JI3qdTYVMdl3KEdB0zEtRwTGlkzm2bhiIYQa4QrB1YH4Xwu9AQHHsKI5kMLY" +
       "yGQum5YsggYNTGYo\nBxRTBfRn9jmWpmJ7RjFtPOMAbwHHGZibCbpWaLTWhV" +
       "CIbtvgptOBoTtMHRbKKydOvX3z+MQ9d3MI\nKe3cPAlKQXDJDy65wSUaXHKD" +
       "SzAnVQdHoRALe051fSlgKt1Xnz4/3PZA3HkpjOqmUbNWLJaIPKtj\n2I+yrp" +
       "sLWM0TRsh2gfyMc0DY6CxwF3LJ67AQ2ytQ0LKNtgQ56u/sNIxkIN7iodP//D" +
       "y/8AKlE4W/\ng67OUwMw9/Pcoj25G3buvXtLHTVaqKe4VNiePIdGCRZyO1UH" +
       "b/3i7E1fv368ZTNfn/ps8BaAYEFP\nqhjf3hHpe/eVNW+y0nvi0iqoUA4TTt" +
       "V2P9erbYxh/r+PZR96+LMje1iiPNM6gprkWXhtWSEECutp\nEUERqzSra4rw" +
       "Jutq7Caps+PoIz3H3q35Aht/SgSYgB257svoYfmNG/hWjVUDP26Uitv+/B7u" +
       "uSKq\n1GBZMzGtuI7LWPfTC0bbxcTRq3Trtd0fbk+duCWYaD3lOvZ8xkd3Vb" +
       "vlldeeO/mfbe/9+07IYho1\n7p7MjY5kxiHh7hXD5ZX2ctdVdfPa38NMmqnM" +
       "1ZD0aqdh8TXhZLAxnEgGLRidaa4sp2zWNhWswrHl\nx330ux1fPNQw9GIY1Y" +
       "NWw2lFZNAYkP5NweBV8jrssYmGAs81BdMuyjp95J0vLWTeNhf8GSYXZ7Fx\n" +
       "G1RyDVx74Iq6AsU+6cMYva3j4sKst7D7hZyBYTq+iN56XK6F6L0XcFnnM3jE" +
       "tuUDdLNVblvc+Pjf\n5D+BbIN8OtpBzNQxzNcCp04RTC72/Gi4+dipwz0f/O" +
       "sd9/gQ2hLf6n/5O0sv3XVykYHWDA2C7Oz2\nAYEGhY5C7NCGmjLN4dDQewsX" +
       "0DHievb3D/VDQjGIRBsaSVOljKnIenrsydfWLD5YSu3kqZwlGKTH\n8pXud/" +
       "7Sc3ozS8GNGBFOKPd7Y1m2d/tbgn6MEzTya6X/sku39vYPxFNbQQ+gCTJLtt" +
       "uPdBC0dSVJ\nL5oq1qUp1yVN9cOQ+a68ktdjl1CPJHuwnd52rzLbVDI+OATZ" +
       "qu6zX5Ctt5yXbTXv6P0Kyl1XyOj3\nYWirHLmMc2wtzx/A7RLZlrW1ImBUdv" +
       "uVF6e/6lM/vmSMo9wp9sGi4Y6tp/EF6z75gslcgHM1mqJA\nkAc3PfXxC6em" +
       "OrhI8s7x/GXNm+jDu0f2WlGLyvR5K0Vg1m9cct6zh6benw275UgQVF82abse" +
       "Yfn2\nIVa1VJUWTMO11tWCtavUAg8Tb5sL9CoI9Nrm02tuVfRK9van4qlLhc" +
       "1A15wQ4+4X4qb8uPoq46b6\n44ODAq3pmlNnJuheaH0oQdlvozHBd08taDJw" +
       "tbnQtP1G0ISYWUgs0QGhRIN+iQ6uqkSp3uRQfCAZ\nhObMJYI+KVYAMgf2sJ" +
       "DvbUK+A36+txN0+Ur5MlGZCUog5Ar635vsi6eSfyCoj8xrzlIDPIeJ8GYX\n" +
       "90jLE2PA1wJvAq6YC17s9wPvvqViJPv6/GLcvyrwBnuTg/GB/l8O3mHgN61R" +
       "Fb/FdI8K2A356T78\n67EbYNj1A3aJM2O3bN9NoQpBa6srQLvyzmX/zOA/uZ" +
       "Uti3svft1qf4v1bUs/i5vg5C+UdF1oC8UW\nMWLZuKCxAjTxdoxX448EXfQz" +
       "f4gRVAd3VrEnuPNxOEF+hjNBje5IdH6SoK4VnOHgoB+ix1MEra/t\nARHckW" +
       "h/AupabU9Qi/9FNH0aXg5M6fAZy2sQ2lhXSX8hSrzxq1g/AhClHXerEgAA");
}
