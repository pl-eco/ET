package net.javacoding.jspider.core.task.work;

import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.resource.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.EMailAddressInternal;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEvent;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.impl.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.WorkerTask;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.html.URLFinder;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.html.URLFinderCallback;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.EMailAddressUtil;

import et.util.MyUtility;
import java.io.*;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class InterpreteHTMLTask
extends net.javacoding.jspider.core.task.work.BaseWorkerTaskImpl
  implements net.javacoding.jspider.core.util.html.URLFinderCallback
{

    protected net.javacoding.jspider.api.model.FetchedResource
      spideredResource;
    protected java.net.URL
      url;
    protected java.net.URL
      contextURL;
    
    public InterpreteHTMLTask(net.javacoding.jspider.core.SpiderContext context,
                              net.javacoding.jspider.api.model.FetchedResource resource) {
        super(context,
              WorkerTask.
                WORKERTASK_THINKERTASK);
        this.
          spideredResource =
          resource;
        url =
          spideredResource.
            getURL();
        contextURL =
          url;
    }
    
    public void
      prepare(
      ) {
        
    }
    
    public void
      execute(
      ) {
        net.javacoding.jspider.core.event.CoreEvent event =
          null;
        try {
            java.io.InputStream inputStream =
              spideredResource.
                getInputStream();
            java.io.BufferedReader br =
              new java.io.BufferedReader(
              new java.io.InputStreamReader(
                inputStream));
            java.lang.String line =
              br.
                readLine();
            while (line !=
                     null) {
                URLFinder.
                  findURLs(
                  this,
                  line);
                line =
                  br.
                    readLine();
            }
            event =
              new net.javacoding.jspider.core.event.impl.ResourceParsedOkEvent(
                context,
                url);
        }
        catch (java.io.IOException e) {
            LogFactory.
              getLog(
              net.javacoding.jspider.core.task.work.InterpreteHTMLTask.class).
              error(
              "i/o exception during parse",
              e);
            event =
              new net.javacoding.jspider.core.event.impl.ResourceParsedErrorEvent(
                context,
                url,
                e);
        }
        catch (java.lang.Exception e) {
            LogFactory.
              getLog(
              net.javacoding.jspider.core.task.work.InterpreteHTMLTask.class).
              error(
              "exception during parse",
              e);
            event =
              new net.javacoding.jspider.core.event.impl.ResourceParsedErrorEvent(
                context,
                url,
                e);
        }
        finally {
            this.
              notifyEvent(
              url,
              event);
        }
    }
    
    public void
      urlFound(
      java.net.URL foundURL) {
        if (EMailAddressUtil.
              isEMailAddress(
              foundURL)) {
            java.lang.String emailAddress =
              EMailAddressUtil.
                getEMailAddress(
                foundURL);
            net.javacoding.jspider.api.model.EMailAddress address =
              context.
                getStorage().
                getEMailAddressDAO().
                find(
                emailAddress);
            if (address ==
                  null) {
                address =
                  new net.javacoding.jspider.core.model.EMailAddressInternal(
                    emailAddress);
                context.
                  getEventDispatcher().
                  dispatch(
                  new net.javacoding.jspider.api.event.resource.EMailAddressDiscoveredEvent(
                    this.
                      spideredResource,
                    emailAddress));
            }
            context.
              getStorage().
              getEMailAddressDAO().
              register(
              spideredResource,
              address);
            context.
              getEventDispatcher().
              dispatch(
              new net.javacoding.jspider.api.event.resource.EMailAddressReferenceDiscoveredEvent(
                this.
                  spideredResource,
                address));
        } else {
            this.
              notifyEvent(
              url,
              new net.javacoding.jspider.core.event.impl.URLFoundEvent(
                context,
                url,
                foundURL));
        }
    }
    
    public void
      malformedUrlFound(
      java.lang.String malformedURL) {
        context.
          getEventDispatcher().
          dispatch(
          new net.javacoding.jspider.api.event.resource.MalformedURLFoundEvent(
            context.
              getStorage().
              getResourceDAO().
              getResource(
              url),
            malformedURL));
    }
    
    public java.net.URL
      getContextURL(
      ) {
        return contextURL;
    }
    
    public void
      setContextURL(
      java.net.URL url) {
        this.
          contextURL =
          url;
    }
    
    public void
      malformedContextURLFound(
      java.lang.String malformedURL) {
        context.
          getEventDispatcher().
          dispatch(
          new net.javacoding.jspider.api.event.resource.MalformedBaseURLFoundEvent(
            spideredResource,
            malformedURL));
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZfWwUxxUfn+3zBwZj4xCCDTbESbDwffnwF1bVOP6oDw64" +
       "+I4AjtGx3h3bi/d2\nN7tz9kFTq1WTQPNHpIi0TSUa1DYVUhs1UWlSVa1KUE" +
       "LbpEVqLJWkrUI/SCOqFEpVVUFtKvpmds87\nt3fGtNcg7d549r15b97H770Z" +
       "XriKyk0DNYmmnxzRsekfiMcEw8TSgCKYZgKmkuL58qrY6Z2q5kEl\nUeSRJY" +
       "Jqo6IZkAQiBGQpEBnsyxioRdeUI1OKRux18lbZfvdHc784tqOxFNWOoVpZjR" +
       "OByOKAphKc\nIWOoJoVTE9gw+yUJS2OoTsVYimNDFhT5KBBq6hiqN+UpVSBp" +
       "A5uj2NSUWUpYb6Z1bDCZ2ckoqhE1\n1SRGWiSaYRK0OnpYmBUCaSIrgahskr" +
       "4o8k7KWJHMR9A8Ko2i8klFmALCtdHsLgJsxcAwnQfyahnU\nNCYFEWdZymZk" +
       "FSzR7OZY3HHrTiAA1ooUJtPaoqgyVYAJVG+ppAjqVCBODFmdAtJyLQ1SCFq/" +
       "5KJA\nVKkL4owwhZMErXPTxaxPQFXFzEJZCLrDTcZWAp+td/mM89Yeb82/n4" +
       "x92MJ8XiZhUaH6VwDTRhfT\nKJ7EBlZFbDHeSPufiRxIN3kQAuI7XMQWTf89" +
       "398bvXK22aJpLECzZ+IwFklS/KiracNC/3tVpVSN\nSl0zZRoKOTtnXo3ZX/" +
       "oyOkTz2sUV6Ud/9uOroz858Nlv4Q88qDKCvKKmpFNqBFVhVRqwxxUwjsoq\n" +
       "tmb3TE6amERQmcKmvBr7G8wxKSuYmsMLY10g02yc0RFCFfCUwHMIWf/W0xdB" +
       "DREaPrqBCR5J7Iom\nBHPGrxO0XcVknMaBqEkQAeOHTV2WsDEuagYeJ0A0Pq" +
       "cZM+OFmDNUZu1cSQlNXnfqKRCnI5oCSyXF\n05fffHRo5xeOW46kwWdrS1AP" +
       "iPc74v22eD8V76fi/VS8P188Kilhgu/MtTN1nETz6y/f7Vv9lM98\nxYNKx1" +
       "CVnEqliTChYMhLQVG0OSwlCQvMOi4JWOxB4NZMQAyDNkkFFmI5A4adNdBmd6" +
       "w6GR6BkQAB\nuDB/85fXknNnaFjRMGigq1uqgVNnLN1q2uIHdxw6vrmUEs2V" +
       "UX8BaevyqyfFa0/uOnPx5+9ucXKC\noNa8VM3npKnmVj9maCKWAMqc5b/8z5" +
       "HrJ8p7X/agMshfQDAiQNwBHGx0y8hJub4sfFFjAeeKSc1I\nCQr9lMWcajJt" +
       "aHPODAuelWy8GgywAp5yeO61g3YTfdGP9fS1xgo1ak/XHhg43vi8N/j2j1ac" +
       "Z0bJ\n4mgtB7hxTKysrHPckTAwhvl3n42d+OLVYw8zX9jOIMirpycUWcww/e" +
       "4sAd+vKYAQ/nUNz3yp7eTb\nWWevcVbvNwzhCPV15nMLG77yU+GrgB6QxaZ8" +
       "FLMk9TBJHmBah7NLDg3ssjDHQqhHT15+ou33v75g\noxhXHR2qPycfS7/y+N" +
       "kFDzVxFdQpwdydTS9WJ+mohNUOcCMLeTpTxexZbWVwiNicPcFwCBSqB0m0\n" +
       "rvplyR/VREGJDH7t3IqFp9NdOyxVVnIEkcFkpvnCN9tutjAVbIleDijtvytm" +
       "BWO3k/n0p4Oggf8d\nfbaHw+3hoK8T1K8QrQrOvNVAUNutQCXOxgMcR8Cyw3" +
       "bODh3sQ5i++orWsjPs6+4mqBJ6Bi1t2OUb\n1Awuoaagy/6UJmHFP4yJOI2l" +
       "UZsxG4703c7GPpomLJQQ28Nmm4SilRuSh2m3kU311MSn//Hac9Ut\nVuhSni" +
       "a2TCkEQCMfkTlcSfGRoyfDC/F9shUJ7jrsIj76473P3bhALrG8dNCEStuUyV" +
       "fwIYEDup6L\ns3Xel06lPKhiDK1mvZSgkocEJU2zdgwi2hywJ6MQkfz33M7G" +
       "Spa+RbRsciMZJ9aNY06tgnFu8jjQ\ntQqeADxNNnQ1uaCrBLFojzKGVva+bx" +
       "FoqnRDI6AfljLQI1oB4DicD89RJzw7elxpatl98P7ec+9d\nfVH+kKViNesu" +
       "+ymHvYMqNsPhQ6mmm7SP4Rppe6XWPbrZx8RuI6iaiQ2FukK9xeVCb7i9u9vX" +
       "G4Z2\nMDESifvd26Xy4gXMMA/tVP5uqY62yVE9C8dVDH+p1/1DajrFf4RWo2" +
       "x0qH+QivikVUzo+1M5XlwL\nzwabaUNhLybpazdBpWlD4b0zwXmnl31IcIYL" +
       "guGGijBcT6g91BH2hTq6AEaY6UA8FSJamtDhwSys\n1DArUGzZOxpdaqt0e8" +
       "32VpsLb3XG3mq1ja6wGr9jlYPLYN6OQ50EPVDMjnvbe3wdECm1bLuOClSQ\n" +
       "lqPUPJ16GKrAvtFIIjG0m/4ps30zPe+1EdEBzSa75eI2c4RzX7eetWT3reoI" +
       "K/PTJKVQMw/DOQuK\nCrSWtHXMQHpuWOpcw85kx/b/reYJ4fWDFozW5/awNH" +
       "Y7T72D2+6vEQu0zFVE030KnsWKg/VuabvY\neS8La7X7mv8w3HX6M26wr6CN" +
       "Ow/2uWxJ8dx3zv62853fPAZajKGK3XviA/3RIVC4+ZbikmLdbOOD\npdPyzx" +
       "gQ2bibd0rNZerLRdtqiIe0oSZyMLclp128C54tdghvKdQuct5fomQuW0+PQ1" +
       "hBaOoC1G5X\nYYwZcgoanFn7zPny2N+D0vtbBy2PruPvMnjCkY6buHXNletW" +
       "Scxt2AoUVJeQpzc+//6Zy6MNVlRY\np/+78w7gPI91A8D2UqPTuNx0KwmM+v" +
       "Wtm16YH7004bFtMA/QOavRKxcv0zeImKkez3PGVtsZWz8m\nZzwLzsAZLKYJ" +
       "s9eJQnrQ80O/rUf/f6dHST4sfMOBhW1dTkv4fHFlsKuzvaPTF6Yt4aSWViUb" +
       "1eTl\nLXAKWADuhynXkibogidmmyBWtAledEzQGXZM8FJxJugJtoe3+ToB32" +
       "vgnEhPi1jK1hcA3tVOIbcu\nppY3zbfhKO8stZyNNsKTsG2U+JjC9QcErZzC" +
       "ZKBg9XyVM2unY9ZzRZp1W3so5AsHCVqbI/k+s8XC\nUxZnS+XNftsg+4sOmj" +
       "e43XF582aRu+uhBz6aN9me5zZS5jx4weRtsWRMfAKecdsE40Wb4FecCbod\n" +
       "E1wssoPuaN8W8nUFXXlDV/7e8rZ4C5r9RTbHIlyqwCGkPl8wvdtYl3e3bt0A" +
       "i5sXDm15Ta97g10Z\nLd7SVkYB3NKKwh+guLEX1p+UmVKV1nHKstrvCLrntm" +
       "4EoSbRH7bNSxbvHwlqWY4X2OgPz/Ynghpv\nwQYc9IfnuALpVZgDCpQ94uk/" +
       "IGhVLj30r84fPOk1iG0gpcO/6nw4Xeca1K7FBvU2b08fEEy8DwbY\noN6MpH" +
       "SFdgIN3JEqrmNRpjc9ma//sOzBp976F+vcsvcq9H8D4Iw4K5syCfSrgnLEZK" +
       "dv+o1el4pp\nw8AqYS2u7eAVprWidfvfyB8xF2W1Jg7EhgqcMnv+H6dMeuNS" +
       "Rs8OxVwyw8HzrkJWYprbUMGOl3QP\n47bA/wDF5qshzxoAAA==");
}
