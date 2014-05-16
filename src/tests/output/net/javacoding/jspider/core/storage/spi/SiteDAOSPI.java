package net.javacoding.jspider.core.storage.spi;

import net.javacoding.jspider.core.model.SiteInternal;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public interface SiteDAOSPI {
    
    public net.javacoding.jspider.core.model.SiteInternal find(
      java.net.URL siteURL);
    
    public net.javacoding.jspider.core.model.SiteInternal find(int id);
    
    public void create(int id,
                       net.javacoding.jspider.core.model.SiteInternal site);
    
    public void save(int is,
                     net.javacoding.jspider.core.model.SiteInternal site);
    
    public SiteInternal[] findAll();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcxRWfu7PPX5f4I8axsBPnwygx2He2zzYGt1KMP5RL" +
       "jvjwYQHG0TG3O2dv\nsre77M6dLxAiqoaE9g8kRKBFEKq20KhVVKREwB8gBc" +
       "R3VSTkf4BWoFapolRtUCKEQAgU3szsevfO\nhwkptbR7s7PvzXvz3m9+761P" +
       "XkCVlonaJStMDxjECo8lE9i0iDymYsu6HaZS0puVNYkTuzXdj3xx\n5Fdkiu" +
       "rjkhWRMcURRY7ExkcKJtpk6OqBeVWn9jorVrl569eLfz26qy2A6mdRvaIlKa" +
       "aKNKZrlBTo\nLAplSTZNTGtUlok8ixo1QuQkMRWsKveBoK7NoiZLmdcwzZnE" +
       "miaWruaZYJOVM4jJbTqTcRSSdM2i\nZk6iumlR1BDfh/M4kqOKGokrFh2Jo2" +
       "BGIaps3YsOoUAcVWZUPA+CLXFnFxG+YmSSzYN4rQJumhks\nEUelYr+iQSQ6" +
       "SjWWd9y5GwRAtSpL6IK+bKpCwzCBmoRLKtbmI0lqKto8iFbqObBC0bXfuSgI" +
       "VRtY\n2o/nSYqi1lK5hHgFUjU8LEyFomtKxfhKkLNrS3LmydZUMPTNLxNfbO" +
       "I5r5CJpDL/q0BpY4nSNMkQ\nk2gSEYpf5sLHYnfl2v0IgfA1JcJCZvS6l2bi" +
       "5890CJm2MjJT6X1Eoinp66H2DUuj/6oJMDeqDd1S\nGBSKds6zmrDfjBQMQH" +
       "PL8orsZdh5+er0W3c9+CfyHz+qjqGgpKu5rBZDNUSTx+xxFYzjikbE7FQm\n" +
       "YxEaQxUqnwrq/BnCkVFUwsIRhLGB6QIfFwyEUBVcPrhakPirZTeKQkmFkvHR" +
       "qWQiFjYoGtAInWP5\nl3QZMj+3zzIUmZhzkm6SOQswCzmcg7k5r1qBWalf9P" +
       "nYcS09bCogc6euwiIp6cTZvxyc2P2Lh0Xq\nGNxs/yjqB8Nh13DYNhxmhsO2" +
       "4TDMhV3DyOfjJtcXx5QlSWZn6b+nRhoe6bFe9KPALKpRstkcxWmV\nwBnEqq" +
       "ovEjlFOQgbPYDnOAOQhtKAV/AjpcJC/HxAEPMm2lKKS/c0x2CEAWxLhy6//2" +
       "lq8TSDEEt5\nM1tduAYJ3C98C3Ul9+665+EtASa0WMFyUeDncD2zUhrEScYI" +
       "zvrZ9P2fv/5M7SaxPtNpdxYAY6Wa\njCW+/Hmw94NX6t7kYXcIpd7DPElCBT" +
       "wbXV9vNwmB+Y9/nXjs8QtH7+aOCk8DFFXjNGwbS5RCYB3+\noSho5NKqInl2" +
       "sq7MCQq3Nh97ouvpD8puYMN3HXxOWkfvvBQ6gt/YK45nU3HiJ7RcdvA3H5Ku" +
       "HSGp\nDMJqqG70qCRPVNe9Umu3ckJ0Il1/R8c/J4dOPFDqKC9LxNGZGLu1WC" +
       "0lvfbnM38f/PBvh8GLWVS1\nZyo5NhqfAIc7VjWXkhrzbbcFFpR3/JyOGbWV" +
       "ofFipRHvNqEamASqkMYCxmZqCishmzB1ichQqly7\nv/pq58XHKm96wY8qgJ" +
       "+hQlEMvAJ0v7HUeBGljjhoYqZAsy6jm1mssldOTamlC6a+6M5wqljDxw0Q\n" +
       "yTq4uuEK2aTEf9nLJnZbJ4iFS2/h9+sEAv1svI3dumys+di9G/KyzkXwqGni" +
       "A+ywFX62tOHJt/Fx\noGqgTEu5j3BG9PG1GIO0epMpCF6Ug4NPnz3S9Y+P3r" +
       "NLhqcVcaX+nTqce/GhM0s8aTXQFGBrj5sQ\naErYyMcLNcSUc45IDbvXCvIc" +
       "p7ZmNBq9ERxqAkusiQkrcjiuS1iNjf/2tbqlR3NDu4QrazwCsfFU\noeO957" +
       "oub+Iu2BaDnqpkP1flsbnHPRLsZ4Kin14N5d/c198d7esZ6KeoCmyQmek4T0" +
       "QzVBSeAUbn\nMFmcHnbfwVJsn3f2PEJZ1dJEF3KLCEfCE44h/mKS3W6jaMeV" +
       "OKtkDdXxNgZjcDc63N032BPtv56i\nNXRBsXgpWTYLXodXqz9ZXSYqrzwxRn" +
       "YaVhHXGyoC8ja41tpAXvs/AtmJlIvRNi9GE6aShczm7c7m\nhdnPeuVzN4wL" +
       "bLR6O2av4M7+y6Rz3fmLnBxLkFqmfSox8ujGZ8+dPjvdLKhV9JhbV7R5Xh3R" +
       "Z/K9\nhwxG7ptXs8Cl37hh88lD05+k/TY6IhQFoMBAaeHuDn4/nu4ogyfFg6" +
       "dhF0/7KPrJanjiaZ+b5M2L\nk3iBpehQz8AQYGmjwJLdnswTaqNuexcHFzMy" +
       "Uw4qA3A12FBp+JGg4nfFsHfz1LP5m9zN56765A91\nR6M9g72UUSnl6Jn5/r" +
       "RAZxyUTIKpKAR7DaGShlXyOvtwEwnuLRetfria7Gg1/Z+jdcSN1kCvG62j\n" +
       "Vx2tYc6Twz8sWg8ycZzn4gfLhaQTrmY7JM0/UkhQUR+6inePAOkzeI+qKms5" +
       "PXTDSy47zIcXd1/Y\n3v7FU37kX6UolvnQW14hJZ0KdF7yv9zSybuSijS2RN" +
       "0s/UJe+QFc9F3LPa4rCt76VYLnxcJTHiz0\n8XI5YxjQSdbyyb6+Pi+ZHL/6" +
       "4jRwIytO/cNAKA1FxQkCjApgz0UUa9JbV/w/Q3x1S1uW7tn+utH4\nrgiY82" +
       "VcDY1AJqeqni7R2zEGDZNkFL7fatGdic3/nqJtV/hNBhwNdx6K3wnlP0BpuA" +
       "Jl1jyIkVf5\njxS1raIMR4P9eDVOUtRSXgMs2COv/PMUrS2WhyC7D17RU7A5" +
       "EGXD04bTLDTwFod9MIZFH1gwvgXf\nlj+arhIAAA==");
}
