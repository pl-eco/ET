package net.javacoding.jspider.core.event.impl;

import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEvent;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEventVisitor;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

abstract public class BaseCoreEventImpl
  implements net.javacoding.jspider.core.event.CoreEvent
{

    protected net.javacoding.jspider.core.SpiderContext
      context;
    
    public BaseCoreEventImpl(net.javacoding.jspider.core.SpiderContext context) {
        super();
        this.
          context =
          context;
    }
    
    public java.lang.String
      getName(
      ) {
        return this.
                 getClass().
                 getName();
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
    
    public net.javacoding.jspider.core.SpiderContext
      getContext(
      ) {
        return context;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcRxWfO9tnn3ONP5M4tR3bqfthxb6L72Injv+pOTvK" +
       "JZfY9TkpMY6u6905\nZ5O93e3u3PliigHRJm3/qFS1QJFCA4gSgSKKGiX8AS" +
       "JEbfmOBP6jLaBWoFRVEaQqQqgRFIU3M7u3\ne3tXm2KwtHvjmffmvXnv9z5m" +
       "L95ENaaBOkQzTE7r2AzHU1OCYWIprgimOQNTafHVmuDUhYOq5ke+\nJPLLEk" +
       "ENSdGMSAIRIrIUSYyPFgzUrWvK6QVFI9Y+ZbvsvevDxV+dPdBehRpmUYOspo" +
       "hAZDGuqQQX\nyCwKZXF2HhvmmCRhaRY1qRhLKWzIgiIvAaGmzqJmU15QBZIz" +
       "sDmNTU3JU8JmM6djg8m0J5MoJGqq\nSYycSDTDJKgxeVLIC5EckZVIUjbJaB" +
       "IFMjJWJPNhtIyqkqgmowgLQLg5aZ8iwnaM7KPzQF4vg5pG\nRhCxzVJ9SlbB" +
       "El1ejuKJew8CAbDWZjE5oRVFVasCTKBmrpIiqAuRFDFkdQFIa7QcSCHozo/c" +
       "FIjq\ndEE8JSzgNEFtXropvgRUQWYWykLQJi8Z2wl8dqfHZy5vTQZC/3py6o" +
       "Nu5vNqCYsK1b8WmLZ5mKZx\nBhtYFTFnvJULP5s4luvwIwTEmzzEnGbs7u8f" +
       "Sb57tYvTtFegmZw/iUWSFj8c7uhcGXs7WEXVqNM1\nU6ZQKDk58+qUtTJa0A" +
       "HNm4s70sWwvfjj6Z8c+9x38J/9qC6BAqKm5LJqAgWxKsWtcS2Mk7KK+exk\n" +
       "JmNikkDVCpsKaOx/MEdGVjA1RwDGukBOsHFBRwg1wuODpxfxvyb6IqjlE4KJ" +
       "45qBJ/JYJYmsroR1\ngvaqmMxRGIiaBACYO2nqsoSNOREI5zClnJOBdK4Cc4" +
       "GKbFj0+WjseiNPAZju1xTYKi1euPGLRyYO\nPvE49yPFnqUsQXtAfNgRH7bE" +
       "h6n4MBMfpuLDZeKRz8cEbyk1M/WbRMPrLy+NNj41YF7xo6pZFJSz\n2RwR5h" +
       "UMYSkoiraIpTRhuGxyxQCDHuA2NA8QBm3SCmzEQgbsmjfQdi9UnQBPwEgA/K" +
       "0s3/71e+nF\nSxRVFAWtdHeuGvj0FNct1Jc6fuChx7dXUaLFauouIO1de/e0" +
       "+N6Thy699ss373NCgqDeskgt56SR\n5lV/ytBELEEmc7b/8j/2v/9MzchlP6" +
       "qG8IUERgSAHWSDbV4ZJRE3amcvaizg3JDRjKyg0CU75dST\nE4a26Mww8NzB" +
       "xhSvG+CpgWeLhdlN9EUXm+mrhUON2tNzBpYbb30hsPP1H254lRnFTqMNrnyb" +
       "woQH\nZZPjjhkDY5h/87mpZ7548+ynmC8sZxAU0HPziiwWmH5bfOD7lgoJIt" +
       "zW+uyX+s69bju7xdl9zDCE\n09TXhc+vdH7lp8JXIXlAEJvyEmYx6iu6vQ3b" +
       "W07ED/GUwxPUI+dunOn7w2+vW0nMVRwdqj+lH81d\neezqip+aOAhlSjAP2+" +
       "HFyiQd+VjpADcyyNOZILNnPY/gQWJxxvYMxUChZpBEy2pYlsJJTRSUxPjX\n" +
       "r21YeTo3fICrcoeLIDGeLnRdf6HvdjdTwZIYcOVJ6//avGAcdiKf/kQJiv/3" +
       "2WdvdLA/OjIwtJOg\nWpEXcOatVoL6VksqKTa2Sr7tYPruZ+MBCjzmHMSss9" +
       "0iofHvTXL7aPm2gyc7/+m/v/x8fTcHA+Xp\nKPq43e3jEq60+PDSudhK6kGZ" +
       "29Zb2DzESz868vyt6+QthnQnPqm0nkK5gkcFV+rY81q+KfC981k/\nqp1Fja" +
       "w5EVRyVFByNA5mASNm3JpMgo/d66WtAoffaDH/dHhzg0usNzM42R/GpXB0ks" +
       "FGq3i1WMmg\nxZMMfIjhZ4Ix9LL3vcXQDeqGRkA/LBU8yIhwvB904T3qwTs3" +
       "9/j9I9fevvmi/AHDdD3r0sYoh6V4\nkM24Aq1K003aD7gaUmun3kndHGVidx" +
       "FUz8QORmO7d68P+rFd/YNDA1EIoNDM/kQqbJ2Sikk6h16G\nJqT8bFQjy66o" +
       "mWFuI0tb1LXhCTWXdS9Cha6enhgbpzvvYTm4UG50P0F1wjxUHEFkKvTZIeNE" +
       "lR0K\nLjccd7lhULdDd8fa/UDRGAVwXudHdY+s8z37yb+GzgivHOex1VzaKt" +
       "CzDp1/A/fdHxIrdCZBoukD\nCohUnATglXaIddU21hse7PrjvuELn/FmgCra" +
       "H7kzQClbWrz23au/H3rjd4+CFrOo9vBkKj6WnACF\nu1YVlxab8u0PVJ2Qf8" +
       "ZgagVj2V2glGm0NATrDQxXGXWmJBC7S6pyOzxbLUhsrVSV6eueVfPomkkW\n" +
       "9K5dwIRGlBsipgsiu9hCjL7IOuvGUP/g4EAUQrDRknmv2c3tYKOw0YkIfi9C" +
       "bEUuMcwIPJ2WYTo/\nnmH8PG7cZ112nXXIOetn13nWkf5obCAGNbIqZyj28U" +
       "LseDTSjkwn3Uo85lJi2FHizLqViEUHhobB\nyXkZmgK4DluKRD9GtB/lrGuD" +
       "aQnaN0EUsU68lXfKkLPQk+StW+Ll2b/tlN7ZMc6zQ5v764ObcH/0\nNu5tef" +
       "d9XnNLe6wKFdsj5Olt33zn0o3pVp5h+H39rrIrs5uH39nZUUI6zXE9q0lg1K" +
       "/s6Lm4PP3W\nvN8ywTyk7bxGP5IEmL47K+H3bnh6LPz2/J8C+zkoehBk8fIq" +
       "fN4Ftd0O1L62zsIYo7Edg9huccQW\nw5tVMQRtQVMZL23f28q+HvFvHOL2lY" +
       "fue1lv+jm7FRW/Q9RBk5vJKYq7o3GNA7qBMzI7ax3vb/jB\nv0XQPf/ZpRec" +
       "SH+YcV7gzN8mqGdNZoJq2K+b8SJB7aswgij64+Z4kaDNlTkgjq2Rm/4lgjaW" +
       "0oPv\nnX/cpJchHQEpHV7RK+Rc3mBS6Le6+peUjkWZ3kYK3/hB9QNP/eafrO" +
       "zZzQ79YAXtF0swkTFVUE6b\nrJ+la/RKL+YMuK4S1h9YHtpg8h35B6p2d/dW" +
       "lNU7c2xqokIDN/y/aOAGh8DutIFbz4cQ6PK2VrIS\n09zdy9EzHLEE/ht2gp" +
       "ukchUAAA==");
}
