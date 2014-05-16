package net.javacoding.jspider.api.event.resource;

import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;

public class MalformedURLFoundEvent
extends net.javacoding.jspider.api.event.resource.ResourceRelatedEvent
{

    protected java.lang.String
      malformedURL;
    
    public MalformedURLFoundEvent(net.javacoding.jspider.api.model.Resource resource,
                                  java.lang.String malformedURL) {
        super(resource);
        this.
          malformedURL =
          malformedURL;
    }
    
    public java.lang.String
      getComment(
      ) {
        return "malformed url found in " +
        resource.
          getURL() +
        ": " +
        malformedURL;
    }
    
    public java.lang.String
      getMalformedURL(
      ) {
        return malformedURL;
    }
    
    public net.javacoding.jspider.api.model.Resource
      getResource(
      ) {
        return resource;
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
      ("H4sIAAAAAAAAALVYXWwcVxW+u17vetdu/BMndWI7dl2X1iie9dpZp8lKEGM7" +
       "yibr2PU6LTGutuOZ\nu/YkszPTmTv2JpRQRNqUgipQCy1SmqoIFKmCFlFRHk" +
       "CEqJS/NlLrh/6qFah9AEEqeECNoKice2fG\nc3e8TpBwLM347sy595z5zved" +
       "e2Z+eBnVWibqkCyBnDCwJYzmp0TTwvKoKlrWDFwqSC/VxqfOH9L0\nMArlUF" +
       "iRCWrMSVZSFomYVORkdixTNlG3oasnFlSduOusWWXvzR8vv3LmYHsNapxFjY" +
       "qWJyJRpFFd\nI7hMZlFDCZfmsWmNyDKWZ1GzhrGcx6YiqspJMNS1WdRiKQua" +
       "SGwTW9PY0tUlathi2QY2mU/vYg41\nSLpmEdOWiG5aBDXljolLYtImiprMKR" +
       "bJ5FC0qGBVtu5Fp1BNDtUWVXEBDLfmvKdIshWT++l1ME8o\nEKZZFCXsTYkc" +
       "VzRAois4Y/WJew+BAUyNlTBZ1FddRTQRLqAWJyRV1BaSeWIq2gKY1uo2eCFo" +
       "+7qL\nglGdIUrHxQVcIKgtaDfl3AKrOIOFTiFoS9CMrQQ52x7IGZetyWjDfx" +
       "6e+qib5TwiY0ml8cdg0o7A\npGlcxCbWJOxMvGILj2WP2h1hhMB4S8DYsRm5" +
       "5WdHcn++0OXYtFexmZw/hiVSkD4e7uhcGfkgXkPD\nqDN0S6FUqHhyltUp90" +
       "6mbACbt66uSG8K3s1fTf/m6P3P4L+GUV0WRSVdtUtaFsWxJo+64xiMc4qG\n" +
       "nauTxaKFSRZFVHYpqrPfAEdRUTGFIwpjQySLbFw2EEIxOEJw3IScvzp6gnAn" +
       "RLWomyUsH5nO7ddt\nTR5fwhoRDII+p2EyR7kg6TKwYO6YZSgyNudEQ5nD1G" +
       "gO6K7bpoTn1lukTP03LodCVMhBGarA2QO6\nCksWpPPv/+G+8UNfe8hJKiWi" +
       "GzlB+yAMwQ9DcMMQIAyBhSF4YQjVw0ChEAvgxkrsaTJlqrm//STT\n9Ei/9U" +
       "IY1cyiuFIq2UScVzFoVVRVfRnLBcLI2swJg/ERyNwwD7yGqAoqLMR0BGAvma" +
       "gnyF9f9VkY\niUDKlVOfvPphYfl5SjVKjVa6uhMaJPq4E1tDX/7ug/c81FND" +
       "jZYjNIdg2nvt1QvShw9PPP/6y+/e\n5uuEoN418l07k8ovGP6UqUtYhvLmL/" +
       "/4vw78/dHaPT8NowhoGqoaEYGLUCJ2BH1UyDDjlTQKFsys\npwkTVXrLq0MJ" +
       "smjqy/4VRqIb2LgJAKiHoxaORpfIDfREb7bQ02aHchTPwDOwgnnlq9GBN35R" +
       "/xID\nxautjVwRzmPiKLXZT8eMiTFcf/eJqUe/ffnMF1gu3GQQFDXseVWRyi" +
       "y+G0OQ+81VqobQ1vrYd/rO\nvuEle7O/+ohpiidorstfWen87m/FJ6GigLIt" +
       "5SRmwg0zT2GY1Ia9JcdHJ5w65FSt+86+/2DfH9+6\n5FY2bsf0rf5SOG2/8M" +
       "CFlTCFOA57l2gd9mTG9k46CrH9BNLIKE+vxBmeCUfJKeLO3JXanYKAWsAT\n" +
       "3WsFRRZyuiSq2bGnL9avfMsePuiEcgNnkB0rlLsu/aDvk24WgusxyhVP93ds" +
       "STQP+xWA/hsk6ND/\nX432pgZ3Dg33p4cIqvOMWdpaCeq7SpUp6TJWhWl+Rt" +
       "IBZC8HyCC7MURPmQ0LN53u372LQAvC2Xgh\nNzEO0XIkOPu0x0F63snG/VQb" +
       "jD+IxdvjmtASFazH+2nb4em7NP/Ff754LtHt8JXO6VitPu08DStm\nFaR7T5" +
       "4dWsnfpTjpD27IAeOTvzxy7sol8h4To19CqLebymsDvFPkqtvtry81R3/8VC" +
       "mMYrOoiTVV\nokbuFFWbSnUWaGyNuhdzQEP+fmWL4ygks1oiO4Lli3MbLF7+" +
       "RgXjSsX49WoTHD1wJNx6lQjUqxBi\nFHfS2svOt65Wl7hh6gTiw3K5GgtcGk" +
       "5zNBwI6NLBfGzfnosfXH5O+YhpL8FazBE6w40+zq5wBaFG\nNyzazHDdtLtS" +
       "76RhZZhbIGaCuU0NpgeGNobzg4M7U+n+wd2w3c4cyOYF/pGpz3wAhlPQU619" +
       "Whqj\nCzdqYVTc5ItlXLNL/E3oMSLT4yNjdPnPst2DPd2nXKn4aupwlQQId6" +
       "7Xn7Le+szn/9HwoPjrux0V\ntFT2HdR9+qk3cd++BqlKuxMnutGvAlyqL9Wg" +
       "twnWt3usbLyr60/7h89/KajVCG26eK1WTitIF5+9\n8E76zbdPQxSzKHZ4Mj" +
       "86khuHgLuu6q4gNS+131GzqPyOccmVzZq3jcpJmUqxJEwML0vaTIVkuiu2\n" +
       "+B1wNLtZaq62xXM5WqfiXbMcQtyJBUxG9VIJ2McryuIUNeQXdkJQbgNIPjTg" +
       "kPzT0HuQRcUS/CAY\nCRHzqFTgcQscW1w8tlwnPKDGNEIoE+uUmS9zoOzyQb" +
       "l/g5Sf2plK9Q+B8tsCMdxqdTt8WRecm+HY\n5oKz7TqBc5qgegisWhvwdQ6Y" +
       "tA/MNzYImDQDJk1QK+e/ApTbq4FCFdTpgtJ5nUD5JrRSRHfaDx6R\nxzlEhn" +
       "1EntggRPYwRAZgk/CcBzgCTN5afTrtvtvWfBFyvltIPSv33Pai0fx79lKz+m" +
       "2hDnrUoq2q\n/G7PjaOGiYsKe+w6Z+93MDh39a6y8t012JI+6azxNEHd11qD" +
       "oFr2n5/3fYK2rz+PoBo48/bnAa/q\n9gTF3BFv/wxBmyrtoZT6P3jTH4E3MK" +
       "XDZw2eI8/5HBneY3hd7Wf+99d9TwrTWBWhQ2LppZtzK9cQ\n5A0sKfTFpPy9" +
       "n0fueOS1f7NNKyY5H/foBy3ocJYUeAFJjmiiesJifSO9R9/uJduEN1fCdnc3" +
       "2/WW\ns6LzAaudb5BWffXOHJ0ar9IjDW8M/Z3tIwUFIUJ7pI34RgJt1LZqqL" +
       "En4Zsl+kxzruP/AtjSg1ei\nFQAA");
}
