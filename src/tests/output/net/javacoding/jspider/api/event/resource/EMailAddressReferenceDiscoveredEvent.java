package net.javacoding.jspider.api.event.resource;

import net.javacoding.jspider.api.model.EMailAddress;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.FetchedResource;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;

public class EMailAddressReferenceDiscoveredEvent
extends net.javacoding.jspider.api.event.resource.ResourceRelatedEvent
{

    protected net.javacoding.jspider.api.model.EMailAddress
      eMailAddress;
    
    public EMailAddressReferenceDiscoveredEvent(net.javacoding.jspider.api.model.FetchedResource resource,
                                                net.javacoding.jspider.api.model.EMailAddress emailAddress) {
        super(resource);
        this.
          eMailAddress =
          emailAddress;
    }
    
    public net.javacoding.jspider.api.model.FetchedResource
      getResource(
      ) {
        return (net.javacoding.jspider.api.model.FetchedResource)
                 resource;
    }
    
    public void
      accept(
      net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.
          visit(
          this);
    }
    
    public net.javacoding.jspider.api.model.EMailAddress
      getEMailAddress(
      ) {
        return eMailAddress;
    }
    
    public java.lang.String
      getComment(
      ) {
        return "email address ref found in \'" +
        resource.
          getURL() +
        "\' : \'" +
        eMailAddress.
          getAddress() +
        "\'";
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
      ("H4sIAAAAAAAAALVYfWwcRxWfO9tnn32NP5uY2ImdxDRx47vz+WI7jiVay3YU" +
       "J+f46nNTcri6rnfn\n7E32dre7c+dLSCMQpSn9o6hqaUGEVhRQBKqgEDWV+E" +
       "qj9IuPSOA/2gJqBUpVFUGqIoQaQVF4M7vn\nnVufYyP1LO16bva9mTfv/X5v" +
       "3sxz11CVaaB20QyREzo2Q6OJuGCYWBpVBNOcga6U+EqVP37ukKp5\nkSeGvL" +
       "JEUH1MNMOSQISwLIUnxobzBurUNeXEvKIRe5wVo+zb8fHib88cbKtA9UlUL6" +
       "sJIhBZHNVU\ngvMkiQIZnJnDhjkiSVhKokYVYymBDVlQ5JMgqKlJ1GTK86pA" +
       "sgY2p7GpKTkq2GRmdWywOQudMRQQ\nNdUkRlYkmmES1BA7JuSEcJbISjgmm2" +
       "Q4hnxpGSuSeT86jSpiqCqtCPMguDFWWEWYjRjeT/tBvFYG\nM420IOKCSuVx" +
       "WQVPdLg1llfcdQgEQLU6g8mCtjxVpSpAB2qyTFIEdT6cIIaszoNolZaFWQja" +
       "vOqg\nIFSjC+JxYR6nCGp1y8WtTyDlZ26hKgTd6hZjI0HMNrtixkVryhf47y" +
       "PxjzpZzCslLCrU/mpQ2upS\nmsZpbGBVxJbi9WzoiYmj2XYvQiB8q0vYkhn5" +
       "9It3x96/2GHJtJWQmZo7hkWSEj8eaN+yNPKuv4Ka\nUaNrpkyhULRyFtW4/W" +
       "U4rwOaNy6PSD+GCh9fmn716Bd+gP/mRTUTyCdqSjajTiA/VqVRu10N7Zis\n" +
       "Yqt3Kp02MZlAlQrr8mnsN7gjLSuYusMHbV0gC6yd1xFC1fB44NmJrL9a+iLo" +
       "tvFJQVYA2gBdc9lh\nY7IpajloS+M5rJKQTlBcxWSWIkPUJMDE7DFTlyVszA" +
       "q6PIup0CyMoGUNEc+ub8g8ta1+0eOhJHdT\nVAE8H9AUmCAlnrv661Pjh77y" +
       "sBVwClJ7VQQdBqNCjlEh26gQGBViRoUKRoXWYxTyeJg5m4qjRMMu\nUXb+/S" +
       "fDDY8GzQteVJFEfjmTyRJhTsHAakFRtEUspQiDdSNHIYZcgH1gDhgANqYUGI" +
       "gxDsKSM9B2\nN9Kd/DABLQGsXDp943cfpBbPU1BSELXQ0S3TABLHLdsC3Yl7" +
       "D9738PYKKrRYSaMNol1rj54SP3hk\n8vwbv3l7l8MogrpWEH2lJiWq2/y4oY" +
       "lYgkToDP/Uvw98+HjV0AteVAnsh/xHBEAtJJOt7jmKCDtc\nSH7UWaBZl9aM" +
       "jKDQT4WMVUsWDG3R6WGQuoW1G8ABdfBUwdNoQ34DfdGPTfTVbAGQ+tO1BpZa" +
       "r3/J\n1/vmz+teYU4pZOF6Ll0nMLE43eiEY8bAGPrf/nr88a9dO/M5Fgs7GA" +
       "T59OycIot5Zt8mD8S+uUR+\nCbW2PPFk99k3C8FudkYfMQzhBI11/otLW77x" +
       "mvAtyD2QA0z5JGYU97KZvKDUigtDjo9OWhnLym+n\nzl59qPvPf7hi50Bub3" +
       "Wk/pp6MHvhyxeXvNTFftjlBPNwgXRsl6UtD9t5IIwM8rTHz/xZa/E6QmzN\n" +
       "PZGBCBjUBDPRXTkkS6GYJgrKxNi3L9UtPZYdOGiZcgsnMDGWyndc+V73jU5m" +
       "gj2jj0uz9u/qnGAc\ndvIB/ddH0NFPOlPti+zp6e8NDu4hqKagyoLYQlDvTT" +
       "JQRpOwEtqPibiApWleMWx5aR/npT72IUpf\nwwQly7GGwYFgpBciE8AZR6Ww" +
       "kOCaC+EnKoCYvntYO0jJxQCI2Nq22yI0x7nT+35a4RQSRGbu8/+6\n/HRtpw" +
       "V4qtO+nL7aeBwXaaXE+0+ejS4l7pEt/Lj3fpfwyV/e/fT1K+QdxmYnB9HZtu" +
       "VXGnhE4NLj\n3jdyjb7nn8l4UXUSNbD6TVDJEUHJUq4ngQfmqN0ZAxzz34ur" +
       "KYtiw8s5tt2d/7hp3dnP2fegXUw5\nJ+HRBLcLnoCd8AKuhOdBjCMxptDF3j" +
       "uX05NfNzQC9mEpTyEy6YKIDdlpDrK9LmJbPh+7c+jSu9d+\nJH/EyFvLqtkR" +
       "qmFb72c9XEap0HST1k1c4W6P1DWlm8NsWqBeLZs20tc3VBaOR/t6BvcGh3ph" +
       "9545\nMJEI8Q6gFiRcTjkNxdzKtVOLbeejJgbMDSx/0/iHxtVshv8IBUzl9P" +
       "jIGB3+DrYZsbXeZhPH4Va7\nzSvw95bVCmNW1J/57D8CDwkv32txoqm4jKHT" +
       "9z/zFu6+MyCWqKX8RNODCjhPcYjrnm2SHRgKGK2/\np+Mv+wfOPeBmLju28c" +
       "wtVkuJl3548U/9b/3xQbAiiaoPTyVGR2LjYHDHTadLiY25trsqFuTXGbJs\n" +
       "Eq045hQrDRdTp9bAcEpTZ4oI1FlUMdwOT7MdpeZSFQMXo1Xy35rJEeyum8ek" +
       "1J5gcgSLOnsCKcu+\nNtQTiQT3AJ9aOGt2mp2Wl+i8exGzQS5yUQ88m2wXbf" +
       "r/XOSxczu34lPcivudFT9QjhX3RXv6osE9\nUQK1gwy1BBzC17H/WUcJNsYR" +
       "S2vtEEMS9QmiiHXi3sfihpyBKiZnH0tfSP6zV3pv95jF2Vb+uoMX\nPNB3A3" +
       "c1v/+htYMVV2Ul9j/XJI9t/e57569Ot1i8ty4Idqw4o/M61iUBW0pAp5ln28" +
       "1mYNIv7972\n3Onpd+a8tgvmIL/lNHor42P29pbC0m542mwstZWJbl+Fyh0A" +
       "Pr7KnvYkB8ABB4BPlQWAg4xyAMBW\nl0VFtLujlKu2wtNhu6qjTK76Jmy0YN" +
       "iolsmAwbyXnuW8NOh46TvlKFajAz2R/mDf4O0QOLIgmyGX\nScDXBmdftW6p" +
       "VvPYDttjO8rkse/DqYBolg28v57n/LXX8dePy1K89FNURWnxUjClCE7naDrq" +
       "Ws9g\n9MjZuuLC1LrWE7cv3bfrst74K3aSX756q4GDWTqrKHyFyrV9uoHTMn" +
       "NJjVWvWv55kaDudV/fuE9e\nF6wxfkpQ51pjEFTF/vN6vyBo8+p6BFXAm5d/" +
       "iaCNpeVhI7FbvPxlgjYUywOtnB+86KswG4jS5ms6\nj5/XHfz0D+kF2H9m/T" +
       "dehf18GisCscNLE3kLV7YmdCzK9DSef/ZnlXc9+vv/sNKqWrTuvul9L1Tl\n" +
       "bKcMj6iCcsJkZx36jV5piVkDMERYDWpHu860RrTud9v4on55rq6Zo/HxFXV9" +
       "lB5Ny0ANlkoi/bAX\n0br+k780hIPAp0p5lK2SL/fpemdtM/4HFwDBLt0YAA" +
       "A=");
}
