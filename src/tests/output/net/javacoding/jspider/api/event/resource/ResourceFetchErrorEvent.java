package net.javacoding.jspider.api.event.resource;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.FetchErrorResource;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;

public class ResourceFetchErrorEvent
extends net.javacoding.jspider.api.event.resource.ResourceRelatedEvent
{

    protected int
      httpStatus;
    
    public ResourceFetchErrorEvent(net.javacoding.jspider.api.model.Resource resource,
                                   int httpStatus) {
        super(resource);
        this.
          httpStatus =
          httpStatus;
    }
    
    public net.javacoding.jspider.api.model.FetchErrorResource
      getResource(
      ) {
        return (net.javacoding.jspider.api.model.FetchErrorResource)
                 resource;
    }
    
    public int
      getHttpStatus(
      ) {
        return httpStatus;
    }
    
    public java.lang.String
      getComment(
      ) {
        return "resource " +
        resource.
          getURL() +
        " couldn\'t be fetched [" +
        httpStatus +
        "]";
    }
    
    public void
      accept(
      net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.
          visit(
          this);
    }
    
    public boolean
      isError(
      ) {
        return true;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcRxWfO5/v/JX4s4kbO7GTGhor9p19ZxsaS6XWxZEv" +
       "ucSuz03J4XJd787Z\nm+ztbndnz5fQWiBCk/aPSlVLASm0oi1EoAhQQ8sfIE" +
       "LVlu9I4D/aAmoFCqqKoFURQkRQFN7M7N7u\nrc+xKjmWdm88896bN+/3vmYv" +
       "vodqTQN1i2aUnNKxGU1mZgTDxFJSEUxzDqZy4mu19TMXDqtaEAXS\nKChLBD" +
       "WnRTMmCUSIyVIsdWC8ZKBeXVNOLSoaseWskbL/tg+Xf3P2UFcNas6iZlnNEI" +
       "HIYlJTCS6R\nLGoq4MICNswJScJSFrWqGEsZbMiCIp8GQk3NojZTXlQFYhnY" +
       "nMWmphQpYZtp6dhgezqTadQkaqpJ\nDEskmmES1JI+IRSFmEVkJZaWTTKeRu" +
       "G8jBXJfACtoJo0qs0rwiIQbks7p4gxibGDdB7IG2RQ08gL\nInZYQidlFSzR" +
       "4+con7jvMBAAa6SAyZJW3iqkCjCB2rhKiqAuxjLEkNVFIK3VLNiFoB3rCgWi" +
       "Ol0Q\nTwqLOEdQp59uhi8BVT0zC2Uh6BY/GZMEmO3wYeZBazrc9L9HZ/7dyz" +
       "APSVhUqP4RYNrlY5rFeWxg\nVcSc8ZoVfTJ13OoOIgTEt/iIOc3Ex354T/rd" +
       "yz2cpqsKzfTCCSySnPjhWPfO1Ym/1NdQNep0zZSp\nK1ScnKE6Y6+Ml3Tw5m" +
       "1liXQx6iz+dPZnxz//Hfy3IKpLobCoKVZBTaF6rEpJexyBcVpWMZ+dzudN\n" +
       "TFIopLCpsMb+B3PkZQVTc4RhrAtkiY1LOkIoAk8Ann2I/zXTF0G3Ute0DBEf" +
       "xERcmjQMzZgsYpVE\ndYKSKibz1BlETQI3mD9h6rKEjXlBl+cxJZo3bOb5da" +
       "WUqAbNy4EADWV/ICrgtVOaAjJz4oWrv3pw\n8vAj5zis1BVt3QmaAD2irh5R" +
       "W48o6BFlekQdPaLr6IECAabB9krzUzwlGnZ/f2G85bFB86Ugqsmi\nerlQsI" +
       "iwoGAIV0FRtGUs5Qjz11ZPbDCXBH9uWgDXBrVyCghioQT2Lhpoj9+F3cBPwU" +
       "gAv1xduf7b\n93PLl6i3Ue/ooNK5aoD1Sa5bU3/mvkP3n9tTQ4mWQxRGIO3b" +
       "WHpOfP/RI5de//Vbe91QIahvTQSv\n5aQR6Fd/xtBELEGGc8V/5T9THzxRe8" +
       "eLQRSCsIbERgRwR8gSu/x7VETiuJPVqLGAszGvGQVBoUtO\nKmogS4a27M4w" +
       "L9rCxi1ggEZ4auHZZvtyO33RxTb6auc+R+3pOwPLmde+GB5648eNrzGjOOm1" +
       "2ZOH\nM5jwYG114ZgzMIb5t74688SX3zv7GYaFDQZBYd1aUGSxxPTbHgDs26" +
       "skjmhnx5NP9Z9/wwG73ZU+\nYRjCKYp16QurO7/2c+HrkFQguE35NGaxG2Q7" +
       "BYGpEzsiJ5NHeCriievB81cf7v/T76/Yyc1TNF2q\nv+bOWC996fJqkJq4Hs" +
       "qXYB514oyVTzoKsJICMDKXpzP1zJ4NPJSHic05Eh8aBoXaYCdabqOyFE1r\n" +
       "oqCkDnzj5cbVx62xQ1yVLR6C1IFcqefKN/uv9zIV7B3Dnvxp/x8pCsZRNwXQ" +
       "nzhB6U3IR/uH7xhI\njA6Ogrg6h5rh1kFQ/w3yTEGTsFJOL3DwLi8SM4ZcAP" +
       "2LdqV5MfvPIemdfQe4BTq9HYyXcCp+Hfe1\nv/sB80QfHlXKmW+Tx3c9/86l" +
       "q7MdPLh5zb9tTdn18vC6z2Bs0ktwht032oFRv7pv98WV2bcX+Ena\nKtPnpG" +
       "oVRp95E/ff1SRWSds10JlAcLBzjTrBQd8DbDxIg5Y5NmIq7bFJaO70V4qDtC" +
       "VyEk9h4XP/\neuXphl4eSJSnu5wWK1Cp4MqJD5w+n1jN3Cvzs/it6yM+/ZN7" +
       "nr52hbzNsSnnNrrb7tJaBY8JnrT7\nydeLreHvP1MIokgWtbCGT1DJMUGxaA" +
       "7JQnyZSXsyDfHhXa9sv3jojpdzd7cfXs+2/qzqYgHjylB2\nE+lWeHbC02on" +
       "0lZfIg0gFnvTjKGPvW8vp7163dAI6IelEkENS4TotHG2GNWdLAWz3T5uw+oi" +
       "322j\nDnjtXK/PY9539tP/aHpYePW+oO0id8GmRNMHFYh2xfUWv5AjrK11DN" +
       "N8b8+fD45deMjvLuxy4XWX\nSrac+PJ3L/9x9M0/nAEXyKLI0elMciI9Cdj3" +
       "3HC7nNha7Lq7Zkn+BctxNnJrmvFKpvFKvBoMDHcJ\nda4Ctd6K8kfbuE4btc" +
       "5q5c9j+nWCbsOIFAhqXMRk1psmY7wMLHnKQJwtJOhL3qQkHR8ZGB4eHEkQ\n" +
       "1OFR4HazlxvGSdiJDRO2K9oRghjzZyuM2QtPt23M7ptkTI2gLXCWqcowqabN" +
       "Llsj5PzeBG2KELGg\nTVIrFMDiXmQf8iA74iK7sknIJuIU2cQQQe3u/muAbW" +
       "G9Ec2BUX4FrWanAXj6bDv1fTQ7BeyC4Tn3\nOc+5R91zP7JZ5x4biCeYR0eK" +
       "MvQ6cPu3zzq44e2GyTjGuTaG9gytuaKIdQ7rfp2zfIqgUFGjn0h4\nRR6qZl" +
       "Lq/Httk+69Sa73FJhANplx/ApGFjRNwVALbR2HEVSW7esYlfbQnWs+7fAPEO" +
       "Ke1fv3vqK3\n/pJdTcofCeqg08xbiuItjZ5xWDdwXmZK1vFCyV3juRu3hpVX" +
       "UH9f+SyX8S2CejeSQVAt+/XyfZug\nHevzQZMFby/9RYK2VacH89ojL/33CN" +
       "paSQ+Zwf3HS/oC7AakdHhJ94bODzyhM6Q7fn3nR7+1z2JF\ngHaCwUu7gw7P" +
       "3SGjY1Gm14vSsz8K3f3Y7/7LymtE5F/p6Jcp0Yyx0IpNqIJyymRNFl2jd3TR" +
       "MuD+\nSVh7YaPdaHKJ/EtUl/e7YXmvvrnjM5O8Yx4Bu3CnTCTiY5uVFT4xEI" +
       "8PUnGhualUZlO+dawY6NZq\ndmNnsWMbtbEeeKubZmkv713UbZX+D3w0oMmG" +
       "FQAA");
}
