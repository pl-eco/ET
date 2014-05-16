package net.javacoding.jspider.api.event.resource;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.FetchedResource;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;

public class ResourceFetchedEvent
extends net.javacoding.jspider.api.event.resource.ResourceRelatedEvent
{

    
    public ResourceFetchedEvent(net.javacoding.jspider.api.model.Resource resource) {
        super(resource);
    }
    
    public net.javacoding.jspider.api.model.FetchedResource
      getResource(
      ) {
        return (net.javacoding.jspider.api.model.FetchedResource)
                 resource;
    }
    
    public java.lang.String
      getComment(
      ) {
        net.javacoding.jspider.api.model.FetchedResource fetchedResource =
          (net.javacoding.jspider.api.model.FetchedResource)
            resource;
        return "resource " +
        resource.
          getURL() +
        " fetched [" +
        fetchedResource.
          getMime() +
        "]";
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
      ("H4sIAAAAAAAAALVYe2wURRif6+P6xNIHUCjQAlVpaO/a61GFJoamLeHggKNX" +
       "VErJsd2daxf2dtfd\nufZAJKK81IQE8ZmgRqMhMcQ/JOAfmiABfJNo/xDUYD" +
       "QYglEJxhiJYvCbmd3e3vagRvCS3Zub+b5v\nvudv5rvDv6B800AzRdNHtujY" +
       "9HVGI4JhYqlTEUyzF6Zi4un8osihFaqWgzxhlCNLBJWFRdMvCUTw\ny5I/1N" +
       "WeMlCdrilbBhWNWHLGSVk879rIZ3uW1+Sisj5UJqtRIhBZ7NRUglOkD5UmcG" +
       "IAG2aHJGGp\nD5WrGEtRbMiCIm8FQk3tQxWmPKgKJGlgswebmjJMCSvMpI4N" +
       "tqc9GUaloqaaxEiKRDNMgiaHNwnD\ngj9JZMUflk3SHkbeuIwVyXwIbUe5YZ" +
       "QfV4RBIJwatq3wM4n+pXQeyItlUNOICyK2WfI2yyp4otbN\nMWZx/QogANaC" +
       "BCZD2thWeaoAE6iCq6QI6qA/SgxZHQTSfC0JuxA044ZCgahQF8TNwiCOEVTt" +
       "povw\nJaAqYm6hLARNcZMxSRCzGa6YOaK12lv695ORP+pYzPMkLCpU/wJgmu" +
       "1i6sFxbGBVxJzxatL3TGhd\ncmYOQkA8xUXMaTrufGdt+NLxWk5Tk4Vm9cAm" +
       "LJKYeK1t5qzRjh+KcqkahbpmyjQVMixnUY1YK+0p\nHbJ56phEuuizF9/v+W" +
       "Ddo2/in3JQYQh5RU1JJtQQKsKq1GmNC2AcllXMZ1fH4yYmIZSnsCmvxn6D\n" +
       "O+Kygqk7vDDWBTLExikdIVQAjweeOYh/yugL8oqmZtIQ8VJMxCEsdQ9jlfh0" +
       "gpaomPTTTBA1CXKg\nf5OpyxI2+gVd7seUqN+wOPuzi0jRvctGPB5axO4SVC" +
       "Bfl2kKCIyJhy58sq17xRN7eUBpElpaE3Qf\nKOFLK+GzlPCBEj6mhM9WwpdN" +
       "CeTxsO2nZXqdhlGi1fbz2+2T9zWZx3JQbh8qkhOJJBEGFAxVKiiK\nNoKlGG" +
       "FpWu4oCZaJkMalA5DRoFNMAUGsgsDNwwaa687cdL2HYCRAOo5uv/755djIEZ" +
       "pkNCmqqHSu\nGoR4M9ettCG6YfnGvXNzKdFIHo0ekNZPLD0mXn5y5ZEvPz0/" +
       "P10hBNWPK9zxnLTw3OpHDE3EEgBb\nWvzzfy67ciB/0dEclAfVDHhGBMhCAI" +
       "fZ7j0yCrDdBjPqLOAsiWtGQlDoko1AxWTI0EbSMyyFJrHx\nZHBACTz58FRa" +
       "KVxOX3Sxgr4qecJRf7psYFB59XFv89n3Sk4zp9ioWuaA3ygmvEbL0+HoNTCG" +
       "+fMv\nRA48+8ue9SwWVjAI8urJAUUWU0y/aR6IfWUWvPBVVz3zXMPBs3awK9" +
       "PSOwxD2EJjndoxOuvFD4WX\nAEugpk15K2Yl6xkLezW2RXZ3ruQIxPFq28EL" +
       "uxu+++qMhWmOszJN9WNsZ/LYruOjOdTFRXBqCeYq\nu8jYqUlHHnaSQBhZyt" +
       "OZIubPYl7HLcTiDLYsagWFKmAnesr6ZMkX1kRBCXW9eqJkdH+ybTlXZZKD\n" +
       "INQVS9WeeaPheh1TwdrR64BN63fBsGCsStc//QoQFLpVJFrcck9ja6ApuIig" +
       "QpuUBa2KoIabIExC\nk7AyBix2nOm7kY2baP6xGCHmpLkWCYUBN+ItpYe6XU" +
       "OJgYd/P/lycR3PCcoz0yHmLktKeiN7FRw/\n60YHIzvU9zz4a+lu4dQGHoOK" +
       "TNjrVpOJha+cww1LSsUsWFtENL1JAYcqaSvcu61kFwbbjLIHar9f\n2nboEb" +
       "cZuRTxnRmbyRYTT7x1/JuF577eCVr0oYJVq6OdHeFuULj2ptvFxPLhmjW5Q/" +
       "JHLI0sYBt3\nzclkaneaCTluYLilqb0ZOV6XgTDz4ZliIcyUbAjjiNENkmHC" +
       "TFlJUMkgJj3OZPTzSut1VFqQLbTS\n19rbUQeBlsaWlqZgM0FVjt3vNuu4V+" +
       "yaaJ6wJiy5tgTEOJdnuHE2PNMtN07/n9y4nqBiMKRTSyTA\nQKcXBxxebEt7" +
       "UbwtXlxIvdgKXqxMbz7OiZMZztMrg4/forM5qdFyFLK//72T7MPBYXTCYfSi" +
       "tNHq\n7TC6tbkx0NoUbCUA0jKANnQvlqFNE97RmIz7OdfEQZXhZBVEEesEYK" +
       "TGCSMRQ07AcTFs3eeP9v3W\nLF1c0MXBrtrZJzoJlwWu4/rKS1cY5LmOvyxN" +
       "g2uT/bNfv3jkQk8VB0zeWc0b19w4eXh3xUwp1Slk\nz7nZDoz61II5h7f3fD" +
       "uQY7mgk6C8YY22s16mbzNKQclmiwy9UVSP6295FybOHd04/6Re/jG7qI11\n" +
       "SoVw7saTiuJARSdCenUDx2WmRiG/f/HkeuzmZ2Xmbdx90O7gMnYRVDeRDILy" +
       "2beTby80njfmIygX\n3k76p6CvyU4P6WuNnPT7CLojkx6AJf3DSbofdgNSOn" +
       "xadxbfAUfxBXS7OP5DA9ODFYFY4aXpU+W4\nSUV1LMr0spV67d28Nfu++Iud" +
       "hAUi/6uCtuei6Wf16e9QBWWLKZvW3xi0YxGTBtzGCbsyWNEuMblE\n3o7XOP" +
       "88GdurvnddpJsndBD8woxsCQbvDd4WXGlpDASaAm2Q8b3LQtFb7/m2G2h6No" +
       "8xKyyoRRUM\nMu5IQzS9GzkXdUuffwC7Tuz8hRIAAA==");
}
