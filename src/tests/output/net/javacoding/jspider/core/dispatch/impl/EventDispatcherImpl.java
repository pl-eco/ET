package net.javacoding.jspider.core.dispatch.impl;

import net.javacoding.jspider.api.event.EventSink;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.JSpiderEvent;

import et.util.MyUtility;
import net.javacoding.jspider.core.dispatch.EventDispatcher;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.PropertySet;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.ConfigConstants;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.spi.EventFilter;

import et.util.MyUtility;
import net.javacoding.jspider.mod.eventfilter.AllowAllEventFilter;

import et.util.MyUtility;

public class EventDispatcherImpl
  implements net.javacoding.jspider.core.dispatch.EventDispatcher
{

    protected java.lang.String
      name;
    protected boolean
      filter;
    protected EventSink[]
      eventSinks;
    protected net.javacoding.jspider.spi.EventFilter
      engineEventFilter;
    protected net.javacoding.jspider.spi.EventFilter
      monitorEventFilter;
    protected net.javacoding.jspider.spi.EventFilter
      spiderEventFilter;
    protected net.javacoding.jspider.core.logging.Log
      log;
    
    public void
      initialize(
      ) {
        log.
          debug(
          name +
          " intializing...");
        for (int i =
               0;
             i <
               eventSinks.
                 length;
             i++) {
            net.javacoding.jspider.api.event.EventSink eventSink =
              eventSinks[i];
            eventSink.
              initialize();
        }
        log.
          debug(
          name +
          " intialized.");
    }
    
    public void
      shutdown(
      ) {
        log.
          debug(
          name +
          " shutting down.");
        for (int i =
               0;
             i <
               eventSinks.
                 length;
             i++) {
            net.javacoding.jspider.api.event.EventSink eventSink =
              eventSinks[i];
            eventSink.
              shutdown();
        }
        log.
          debug(
          name +
          " shutdown.");
    }
    
    public EventDispatcherImpl(java.lang.String name,
                               EventSink[] eventSinks,
                               net.javacoding.jspider.core.util.config.PropertySet props) {
        super();
        log =
          LogFactory.
            getLog(
            net.javacoding.jspider.core.dispatch.EventDispatcher.class);
        log.
          debug(
          name +
          " configuring...");
        this.
          name =
          name;
        this.
          filter =
          props.
            getBoolean(
            ConfigConstants.
              FILTER_ENABLED,
            true);
        this.
          eventSinks =
          eventSinks;
        if (filter) {
            java.lang.Class engineEventFilterClass =
              props.
                getClass(
                ConfigConstants.
                  FILTER_ENGINE,
                net.javacoding.jspider.mod.eventfilter.AllowAllEventFilter.class);
            java.lang.Class monitorEventFilterClass =
              props.
                getClass(
                ConfigConstants.
                  FILTER_MONITORING,
                net.javacoding.jspider.mod.eventfilter.AllowAllEventFilter.class);
            java.lang.Class spiderEventFilterClass =
              props.
                getClass(
                ConfigConstants.
                  FILTER_SPIDER,
                net.javacoding.jspider.mod.eventfilter.AllowAllEventFilter.class);
            log.
              debug(
              "EventFilter for engine events = " +
              engineEventFilterClass.
                getName());
            log.
              debug(
              "EventFilter for monitor events = " +
              monitorEventFilterClass.
                getName());
            log.
              debug(
              "EventFilter for spider events = " +
              spiderEventFilterClass.
                getName());
            try {
                engineEventFilter =
                  (net.javacoding.jspider.spi.EventFilter)
                    engineEventFilterClass.
                      newInstance();
                monitorEventFilter =
                  (net.javacoding.jspider.spi.EventFilter)
                    monitorEventFilterClass.
                      newInstance();
                spiderEventFilter =
                  (net.javacoding.jspider.spi.EventFilter)
                    spiderEventFilterClass.
                      newInstance();
            }
            catch (java.lang.InstantiationException e) {
                log.
                  error(
                  "InstantiationException on EventFilter",
                  e);
            }
            catch (java.lang.IllegalAccessException e) {
                log.
                  error(
                  "IllegalAccessException on instantiation of EventFilter",
                  e);
            }
        } else {
            log.
              info(
              "Global event filtering is DISABLED");
        }
        log.
          debug(
          "EventDispatcher " +
          name +
          " configured.");
    }
    
    public void
      dispatch(
      net.javacoding.jspider.api.event.JSpiderEvent event) {
        boolean mustDispatch =
          false;
        if (filter) {
            net.javacoding.jspider.spi.EventFilter eventFilter =
              spiderEventFilter;
            if (event.
                  isFilterable()) {
                switch (event.
                          getType()) {
                    case JSpiderEvent.
                           EVENT_TYPE_ENGINE:
                        eventFilter =
                          engineEventFilter;
                        break;
                    case JSpiderEvent.
                           EVENT_TYPE_MONITORING:
                        eventFilter =
                          monitorEventFilter;
                        break;
                    case JSpiderEvent.
                           EVENT_TYPE_SPIDER:
                        eventFilter =
                          spiderEventFilter;
                        break;
                    default:
                        eventFilter =
                          spiderEventFilter;
                }
                if (eventFilter.
                      filterEvent(
                      event)) {
                    mustDispatch =
                      true;
                }
            } else {
                mustDispatch =
                  true;
            }
        } else {
            mustDispatch =
              true;
        }
        if (mustDispatch) {
            for (int i =
                   0;
                 i <
                   eventSinks.
                     length;
                 i++) {
                net.javacoding.jspider.api.event.EventSink sink =
                  eventSinks[i];
                sink.
                  notify(
                  event);
            }
        }
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1357973083285L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZfWwcxRWfu7PPn8SxncRubMdOMBAH++zz+TNW27i2Qy65" +
       "xI7PEGKcXtZ7c/Ym\ne7vL7px9CcEqakoofyAhKC1qSkTVKhJF/SAi/EHbEA" +
       "GlhUZqLRVoKxBVEKWiQdCqTdRSpW9mdm/3\n9s5OqriWdm88+968N+/j997s" +
       "PnsJFRo6qheNADmiYSMwFB0TdAPHh2TBMCZgKia+WlgydnqXonqR\nJ4K8Up" +
       "ygiohotMcFIrRL8fbw8EBaR02aKh+ZkVVirpOzytabP5v/9YmddT5UMYkqJC" +
       "VKBCKJQ6pC\ncJpMovIkTk5j3RiMx3F8ElUqGMejWJcEWToKhKoyiaoMaUYR" +
       "SErHxjg2VHmOElYZKQ3rTKY1GUHl\noqoYRE+JRNUNglZHDglzQnuKSHJ7RD" +
       "LIQAT5ExKW48a9aAH5IqgwIQszQLguYu2ina3Yvp3OA3mp\nBGrqCUHEFkvB" +
       "YUkBSzS6OTI7bt4FBMBalMRkVs2IKlAEmEBVXCVZUGbao0SXlBkgLVRTIIWg" +
       "9Usu\nCkTFmiAeFmZwjKBaN90YfwRUJcwslIWgtW4ythL4bL3LZw5vjfrL//" +
       "Pw2OUm5vOCOBZlqn8RMG1w\nMY3jBNaxImLOeCUVeDy8P1XvRQiI17qIOc3g" +
       "LS/cGfnwXCOnqctDMzp9CIskJn7WU9+wOPh+iY+q\nUayphkRDIWvnzKtj5p" +
       "OBtAbRvC6zIn0YsB6+NP6L/V95Bn/kRcVh5BdVOZVUwqgEK/Ehc1wE44ik\n" +
       "YD47mkgYmIRRgcym/Cr7H8yRkGRMzeGHsSaQWTZOawihIrg8cBHE/9Yi9s/a" +
       "kTmskGHJAGpxFuvh\npCYHNIK+qGAyRQNBVOMQAlOHDE2KY31KVHU8FTfJpy" +
       "Sgnsq7QppKrpj3eGgKuxNQhmjdocqwXkw8\nffH1YyO7vv4QdycNQVNngj4P" +
       "OgRsHQKmDgGqQ8DSIUB1COTRAXk8THpNtsmpD+M01f763MDqR9qM\ns17km0" +
       "QlUjKZIsK0jCFFBVlW53E8RliMVjrygYUhxHD5NIQzqBSTYSGWPmDjOR1tco" +
       "etnexhGAkQ\ni4sLV3/zcWz+DI0wGhFr6OpcNfDvYa5beUv0wM6DD23yUaL5" +
       "Auo6IG2+9uox8eOHd5958413Ntvp\nQVBzTtbmctKsc6s/pqsijgOq2ct/81" +
       "87PnmssP95LyqAVAYwIwKEICDDBreMrOwbsJCMGgs4yxKq\nnhRk+siCn1Iy" +
       "q6vz9gyLoJvYeDUYoAyuQrhGzfgN0Rt9WEVv1TzeqD1de2A4eeWr/o63flr2" +
       "KjOK\nBakVDuyNYsITtNJ2x4SOMcy/862xx75x6cQ9zBemMwjya6lpWRLTTL" +
       "8aD/i+Og9YBGrXPP5Ey8m3\nLGdX26sP6rpwhPo6/cBiw5OvCd8BIIGENqSj" +
       "mOWrj0nyAVMttpYcGdrN4YeD1bGTFx9see/3F0xA\ncxRKm+ovseOps187t+" +
       "ilJi6BkiUYe6wcYyWTjjysjIAbWcjTmRJmz1KexkGCihlnZ7AD9KkCQbTC\n" +
       "BqR4IKKKghwefvp82eKjqZ6dXJObHATh4Vi68cL3W642MQ1MgX4HZJr/F80J" +
       "+h47++lPJ0E7bhCG\ntnYHW0PBti5YimELc9caqLvMETSnA7zG0chxGJB5h9" +
       "rv+PyuS5vrL3/bi7zL2C9PxcqsEBOf8zV/\n6n1xXTPLmYJpweAmdpf63Eqe" +
       "VaCZK8oy+dAKV7eVB3nygRG2cwd+wXZgULNMsGUJdBU0KYCpLTmo\nRgGUNA" +
       "3QmG8+2NHVy1YI0duXVsZDXV1tPT0ElWJLoOHUfrutfact+o6VEd3T19bXTV" +
       "ChpquaYZkm\ntFzhYdkLwJeQZihAshYPYMJCAnpvZeM26hGWxYjtY5NJQguF" +
       "uyRup4FgoWxy+r5/vPxUaRNHDcpT\nz5YpgiCtc4JBFldMvPfoydBidJ/Es9" +
       "DdDbmIj/78zqeuXCDvMki0gZxK25jOVfAuwVFj+t6cq/T/\n+FTSi4om0WrW" +
       "0QoKuUuQUxQwJyGSjSFzMgJo4Hye3V9ynBrIFKp6dxFxiHWXELtXgHE2btlV" +
       "YxVc\n6+GqMbOkxpUlHsSQ5m7G0Mzut2UwvgSCgoB+OJ52wocZll/OhGVHpw" +
       "sVuamHt/Wff//Sj6TLDPlK\nWa4PUgZT6RI240ATH4QgbSAdJxhzpeZRzRhg" +
       "UrusRAx19AOo3XHDKdDV2tcW7IVVJ3aEowHLpjFz\nwwvQsuZujKpjGhRVsW" +
       "BbZePpiJJKOh8CdBTtGw9PTIzsoSv38UJN79EsNzXAVWvy1eZ302F6myQU\n" +
       "N2WASnc6jOlSEkrKnNnvPz/59474B7cP83SodZ4jnYQ7Oq/i5uoPP+GJkI3w" +
       "edLIJeTRDd/74MzF\n8TW83eInr5tzDj9OHn76Ys4s19Kwh43LSWDUr9y+8d" +
       "mF8Xen+U6qshtaau/uU2/jlm3lYp4mumha\nVWUM6Yf8HMCXsv8tZqog6zfX" +
       "/mnT/m6g3pq1UM0yCzkT6H47gUJs/mAmtjs7+gkK32hsB4MdraFQ\nWxeUlm" +
       "oW3bbagXvSB6jIBYJ8MFyg4xmI+fGRwWE63pZBcI/ZfjOD0dsxyxonckHDC5" +
       "UkISkCO5K2\nAGr4ZazMkFlGo2h8+5DjPij1lkO66dx96YxAL1/JqkXVdmYN" +
       "yaqC6RnFesbPDpIayLyOgIfpHNUB\nzZ1psps1FTaan//huT92v/2H4xA8k6" +
       "hoz2h0aDAyAnHW6IpLN1/lXN1e36z0SwZvJoDnvHTIZhrI\nhu1SHZOUrkxk" +
       "gXcTNzKzCr3dumxhvWbVfRJcIlLD5Wn9ePlBaUdz05MTiX0rGIkhOHW4IpGK" +
       "ezor\npejM8aWylLZ9dWZy1eXP0tNmllZC6EFJZxpt54DpyL5n7Ozrcu052B" +
       "dageaqr6811NfWDc3VOr5l\ntzZU6A/yqUkfSJa7bl2iF4OfgIsnn71oONSb" +
       "9qrPb68zpr2qkqoiwYl4CYOdtQ3WnWOw3hUwWH+Q\nGQzQqoYZLFcdKvWFvI" +
       "oyk9HbT5YLnAbTEA35DfEzK3C45kvY4SXbDu5kCfavROD092YHTo42VOj5\n" +
       "fGpe2wrr4Go0rdCY3wqvmVbwyeqMc9+v2/vude+7p2MFWrHePtqK0cM22zaI" +
       "p1Le4JowULBy4rbl\nzidAPEMnI5ypIu0AUWTjZL2jrpk7/J29Q/uY2HVdL+" +
       "FcO6JtTcNSr3BZS3Pi7k/LHxReOeA1YRrK\nYQlRtTYZcFC2z0nuRbLLScW+" +
       "xj9t7zl9v/ug5GPjJ7LeHdHk32h6fqPL88xOK1Br3iP0EA+9G63F\n2F30C+" +
       "ZU+oWCV/0OlEdH2i1tMXXc8n/S8SNwsjGbInF1nr16+XM+RShY7DUV2fu/Ke" +
       "LJjat/ZuKq\ns9s+wF9eiRoTbO3sZmW1kNVPK2jbrvluY2fUBo9rG+1vsANL" +
       "H2406Bmq8+hEX/LV5nxv4l9FxE2L\nBze/rFX+ir8Hsr5cFEdQcSIly87jrG" +
       "Ps13SckJgWxfxwy4zqgVaz5brfj0Pw0R+6N4+H8xcS1Hw9\n/I6dO9mLCapb" +
       "hh0E0h8nRxngeX4OOKSYIyf9KoJWZdNDdtn/OEkrASOBlA6rGIafSpvv86yD" +
       "a1TD\nokTfVKa/+2LB3kd++2/WtBaJ/Bsf/a4Fh+45yZBI+yC070cM9gaDPq" +
       "Nv+8WUroOrGYKZbikz+Ir8\nO1ad88yekdU8sX9sxH1sh+qxcg1lCCK/gFaL" +
       "G/5aAgf9z+WzF9uDiQTsOE93M2tK/S8+fIYxox0A\nAA==");
}
