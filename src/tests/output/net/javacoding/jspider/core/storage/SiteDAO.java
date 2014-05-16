package net.javacoding.jspider.core.storage;

import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public interface SiteDAO {
    
    public net.javacoding.jspider.api.model.Site createSite(
      java.net.URL siteURL);
    
    public net.javacoding.jspider.api.model.Site find(java.net.URL siteURL);
    
    public void save(net.javacoding.jspider.api.model.Site site);
    
    public Site[] findAll();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVXX2wcxRmfu7PPPvuI/8QECzuxYxwRJ/adbc6Og19wbae5" +
       "+IgPXywa4/SY252z\nN97bXXbnzhdKIxApCX2IikgoiLSohSpShXgAAQ8gpS" +
       "hJC6iRKr9AW7UCpUJUbRAIIRCiSr+Z2fPu\nrS+GCDhp92Znvn/z/fl9M89f" +
       "QdWWidolK0KPGMSKjKeS2LSIPK5iyzoAU2npYnUoeXZK0/3Il0B+\nRaaoIS" +
       "FZURlTHFXkaHxitGiiTkNXjyyoOrXlrJFy+y1fLf/5+L62AGqYQw2KlqKYKt" +
       "K4rlFSpHMo\nnCO5DDGtMVkm8hxq0giRU8RUsKrcD4S6NoeaLWVBwzRvEmuG" +
       "WLpaYITNVt4gJtdZmkygsKRrFjXz\nEtVNi6LGxGFcwNE8VdRoQrHoaAIFsw" +
       "pRZes+dBQFEqg6q+IFINyUKO0iyiVG97B5IK9TwEwziyVS\nYqlaUjTwRIeX" +
       "Y3XH3VNAAKw1OUIX9VVVVRqGCdQsTFKxthBNUVPRFoC0Ws+DFopuvqZQIKo1" +
       "sLSE\nF0iaolYvXVIsAVWIu4WxUHSjl4xLgpjd7ImZK1rTwfD/fp78vJPHvE" +
       "omksrsrwGmLR6mGZIlJtEk\nIhi/yEdOxQ/m2/0IAfGNHmJBM7bt1dnEh+c6" +
       "BE1bBZrpzGEi0bT01XD75pWxf4UCzIxaQ7cUlgpl\nO+dRTdoro0UDsnnTqk" +
       "S2GCkt/mHmjwcf/D35jx/VxlFQ0tV8ToujENHkcXtcA+OEohExO53NWoTG\n" +
       "UZXKp4I6/wZ3ZBWVMHcEYWxgusjHRQMhVAOPD54WJH517EVRKKVQMjE2HTEo" +
       "6tMInWfBl3QZwj5/\n2DIUmZjzkm6SeQsSFgI4v0pfZLIbln0+VqTeElMhH/" +
       "fqKnCnpbOX335gcurREyJgLMlsqyjaCRoj\njsaIrTHCNEZsjRFbI/L5uK6b" +
       "yl3IYiKz0vnvi6ONJ/usV/woMIdCSi6XpzijEig5rKr6MpHTlOdc\nkyu/eV" +
       "pBToYzkJ5gQFoFQbwcwGcFE3V509Ap3jiMMOTWytGrf/kovfwSyxgW4RYmXZ" +
       "gG8VoStoV7\nUof23XuiK8CIlquY64u87G5iWrze28MAoCQ/l/nJZ+d/Xdcp" +
       "5DOe9pIAUOblZKDwxcPB/nder7/I\n/V3CjwYX0KQIFdnY5Nh6wCQE5v/xZP" +
       "Lx01eO38MNFZYGKKrFGdg2lijkyyrcUBQ08hlVkVw72Vih\nYCKtLaee6Dnz" +
       "TsUNbL5WnXOMOv6jT8KP4AuHRDU2lwd+Usvnhp55l/TcEZYqpFaI6kafSgpE" +
       "dczz\naruT41/J0w13d7y/Z/jsT72GVrEEJyWeyfE7y9nS0hsvnPv70Lt/Ow" +
       "ZWzKGa/dOp8bHEJBjcsa66\ntNRUaLsrsKi86efoy5CsAmqXM426twngbxJo" +
       "OhpzGJsJFdembNLUJSJDZ3L0/vLLvR8/Xr37ZT+q\nAjiGhkQxwAig+xav8j" +
       "IEHS1lE1MFnPVZ3cxhlS2VWkgdXTT1ZWeGY8QNfNwInqyHZwc8YRuD+D9b\n" +
       "bGavjQJROHUXf28TGehn41vZq8fONR9790JcNjoZPGaa+AgrtuJDK5uf+hP+" +
       "FSAzIKSl3E84APq4\nLIYgre5gCjwX6P/AmcuP9Lz310t2h3CdPByqf6eP5V" +
       "/52bkVHrQQnAGwtd8JCJxB2MjH+zL4lGOO\nCA171wnUnKA258DQrl1gUDNo" +
       "YmeWiCJHErqE1fjEb96oX3ksP7xPmHKDiyA+kS52XPpdz9VOboKt\nMehqQv" +
       "Z3TQGb+52SYH+TFA1fF8jfPjDYO7i7L9ZPUQ0IJ7MzCR6BForC3PUMwGGyPC" +
       "7sfQeLrV3o\n7HuUojrJJJgSJpyT/EB4I+nyxjBf2MNed1G0az1blZyhzo8t" +
       "EI3GYcRMjY30xvr7hnbvoKibLirW\nagdZINTe0faeiMcI2Mm2a3QhbCiRnC" +
       "4TlbcgxMmHy5K5G54NdjJv+JbJXHJaKU9dHjrk8tBux0M/\nvv5oxnoHb+u7" +
       "LeZEk8mZ+vro3U3Z2UKT3VYRl1UjjlVZin64nlUUW0vzy7q5ND9BJJie1lJ8" +
       "FQgP\nwBJYOTTQGxvoG4pBHLdcO47MHKZvtlJguuBptAPT+P0FxnBcMNLvuO" +
       "C+6w/MMA/MIGWARXnJzn59\nVA4zclwgACFtbkxLmkoOkKBgH3xfnvu0X/5g" +
       "54TAklb3hcpNuHfwKune+OHHvJl6kK3C6dqj5LEt\nz33w0uWZFtGKxRXklj" +
       "W3ADePuIbwjYQNdhjYup4GTn1h59bnj878M+O3HRAFBxR0du8Lcnv7K+VC\n" +
       "OzzNdi40f0e5gMoOceuE6CEoNZapY6rKzmsu3/N+xXZ2bHnqyvb2z5/2I/86" +
       "HaXCpWhVQlp6MdD9\nif+1Td28pVdlsCWajvc2ufayWHYH5BbXlzmvYR3nuS" +
       "vhpKsSBnivmTWM1fKIjYzEnPL4xfWXx0jv\nwEDf4AhcmG1n3mp1irMPKoKH" +
       "bUp2pm1dc9sXd1Kpa+Xe7eeNpreEi0r3xlrom9m8qroOVe4DVtAw\nSVbhO6" +
       "wVhxmx3Scgub/B3YXhrBjx3Z8WzE9R1LYOM+Q0+3NznKFoU2UO0GCP3PTPUL" +
       "ShnB66r/Ph\nJv0tRQEgZcNnjVJHbOS9nV2RIuLkUzT+D7b3UEyPEQAA");
}
