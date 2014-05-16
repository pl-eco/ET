package net.javacoding.jspider.core.event.impl;

import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEventVisitor;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class ResourceParsedOkEvent
extends net.javacoding.jspider.core.event.impl.URLRelatedBaseEventImpl
{

    
    public ResourceParsedOkEvent(net.javacoding.jspider.core.SpiderContext context,
                                 java.net.URL url) {
        super(context,
              url);
    }
    
    public java.lang.String
      toString(
      ) {
        return "resource parsed : " +
        url;
    }
    
    public void
      accept(
      java.net.URL url,
      net.javacoding.jspider.core.event.CoreEventVisitor visitor) {
        visitor.
          visit(
          url,
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
      ("H4sIAAAAAAAAAK1Ye2wbRRqfOI7zMqR5lAaSNGkJHBGxndhJShoEhDSlbt3G" +
       "jQN3DUFmsztOt1nv\nLruzjsujgAotIARUvCUeAoEqIXR/XAX3B0gFAQfHQ+" +
       "Lyx/E4cQIVIdAdiNMJgXiofDOzG48dtwG1\nkXZ3PPO95vt+3zff5PmvUZVt" +
       "oXbZDpO9JrbDY6mkZNlYGdMk256CqbT8RlVt8vA23fChigTyqQpB\nDQnZji" +
       "gSkSKqEolvGslbqMs0tL1zmkFcOcukbDz354V3D25tq0QN06hB1VNEIqo8Zu" +
       "gE58k0CmZx\ndhZb9qiiYGUaNeoYKylsqZKmXg+Ehj6Nmmx1TpeIY2F7EtuG" +
       "lqOETbZjYovp9CYTKCgbuk0sRyaG\nZRO0KrFHykkRh6haJKHaZCSBAhkVa4" +
       "p9HdqHKhOoKqNJc0B4VsLbRYRJjGym80Bep4KZVkaSscfi\nn1d18ERnKcfS" +
       "jru3AQGwVmcx2W0sqfLrEkygJm6SJulzkRSxVH0OSKsMB7QQdM4JhQJRjSnJ" +
       "89Ic\nThPUWkqX5EtAVcvcQlkIWl1KxiRBzM4piZkQrYlA8Je7kt93sZj7FS" +
       "xr1P5qYFpbwjSJM9jCuow5\n4w9O+IH4LqfdhxAQry4h5jSj5/31ysSXRzs5" +
       "TVsZmonZPVgmafnnofaOxdHPayupGTWmYasUCkU7\nZ1FNuisjeRPQfNaSRL" +
       "oY9hZfmfzbrluew//xoZo4CsiG5mT1OKrFujLmjqthnFB1zGcnMhkbkzjy\n" +
       "a2wqYLDf4I6MqmHqjgCMTYnsZuO8iRCqhqcCnnWI/62iL4LWUGg6lox5VkzM" +
       "j+ewTsImQZfomMxQ\nKMiGAiCY2WObqoKtGdmw8AymVDNq1tRmTiAgT1U3LF" +
       "RU0BwuzUAN4LrF0EBcWj587O0bx7fdeQeP\nJ8WgazRBF4MJ4YIJYdeEMDUh" +
       "zEwIUxPCZU1AFRVM+Zpil9MYKjTV/vuXkVX3hOwXfahyGtWq2axD\npFkNQ4" +
       "pKmmYsYCVNGEYbhXxgMAQMB2cBzmBRWgNBLH3AxzkLrS+FbSHZ4zCSAIuL+4" +
       "6//0164QhF\nGEVEC5XOTYP4znPbgj2pa7Zee8f6Skq04KehA9LulaWn5W/u" +
       "2n7kn+98ckEhPQjqXpa1yzlp1pWa\nn7QMGStQ1QriH/5xy7f3Vw2/4EN+SG" +
       "UoZkQCCEJlWFuqoyj7RrxKRp0FnPUZw8pKGl3yyk8d2W0Z\nC4UZBqAz2Jhi" +
       "tR6eKnhWu/htpi+62ERfzRxu1J8le2B18of9gb4PXq5/gznFK6kNQu1NYcIT" +
       "tLEQ\njikLY5j/5JHk/Q9+ffBqFgs3GAQFTGdWU+U8s29NBcS+uUyxCLe2PP" +
       "BQz2MfeMFuLkgftSxpL411\n/tbFjkfflB6HQgIJbavXY5avPqbJB0yt2BM5" +
       "Pradlx9erG587NiBnk8/es8taMJBWaD6Kn2b8+Lt\nRxd91MW1cGRJ9g4vxd" +
       "iRSUcV7BiBMDLI05la5s86nsX9xOXs7x8YBIOaQBM9YsOqEk4YsqTFNz31\n" +
       "av3iIWdoKzflDIEgvimd73zv2Z7jXcwEV2NAqJnu7+qcZO0oZD/9RAm64tSq" +
       "0Mb+4d5YLDQ4QFC1\nzA90FrEWgnpOVlxSbDwmcES4LzYKvhhiCzH6Gjktlg" +
       "4OhYZiBFU6luZZGWSIoaZeOZnw0EbfvWwc\nolnAkIKYeetdElqMSqvuZtpX" +
       "eJmcnb3hu9eeqOviyKQ87YKY810pBUXeKoS/40RnM+srDv7pf8ED\n0uvXcC" +
       "Q0FRffcd3JDj75Ie65LCiXqfe1xDBDGvhKK+yiVNt21rN422j4Y+dnm4cO31" +
       "S6DZo37WLe\nFLOl5Vf/fPRfgx9+fBtYMY2qd0ykxkYT42Bw50nVpeXGXNvO" +
       "yt3qWwzMbnld1mkVM42I24RMszA0\nivpUUaZ1FdW5dnha3TrXWq7OCTE6AR" +
       "hWRMoUQTXE4A2eCPCrBYBvKAB85tQBHh3o7e8PRS+CI9VT\n/Ae7i3vDg/sq" +
       "Bnd61oY5BWIrO4vcMwxPh+uejt/nHq+qChvOCBu+qLDhudOw4eHeaCwU6+MZ" +
       "TYVe\nKiqeFxQPFxRrp0VxLBoaHIKil1OhyMJVw/VvdOWOagyGTNBVnHVlKM" +
       "3CcSjJMjYJZF2bmHVJS81C\njc+5HfgL0//vU764cBOvDa3izU4k3BI9jrub" +
       "v/yWVYiSM6tMm1+i5NDaZ744cmyyhdcXfhc6d9l1\nROTh9yG2laBJK9y6k2" +
       "lg1K9fuO75fZP/nvW5LthKkD9n0AtogNnbh/JwuykbH9oHtC67kvKLk7x+\n" +
       "8doLXjMb/87aq6XLTQ2clhlH04QqIlaUgGnhjMrsqOFdEwfYLQSd/9s6aLCe" +
       "flh0b+bM+wlatyIz\nQVXsKzIeIKjtJIygin5EjjvhelueAwDsjkT6uwk6s5" +
       "ieoLrCD5H0Xsg9IKXD+0wx+Q4JyTdgeulx\nyW+8cMBZPIk1iWDlcsnm2RKH" +
       "eYqdFqH3SZlYVml7lH/6Jf/Oe/7xEzs1vEaE3qZlO8IyNDKqS9pe\nW7Xdlo" +
       "PeMWTHgv6ZsOPVjXS9zSXy23Ob+L+OJV3dU7uS4xzNA94mh6LDG069rMT6eq" +
       "MbQjFoB/1T\nW+KpU72g7bPQ2eWcxTbglnfUxErFmYVjgbYQ4qLpWvMr3sZh" +
       "wy8SAAA=");
}
