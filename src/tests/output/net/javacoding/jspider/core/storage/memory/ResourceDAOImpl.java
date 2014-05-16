package net.javacoding.jspider.core.storage.memory;

import net.javacoding.jspider.core.event.impl.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.ResourceDAOSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.URLUtil;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.util.*;

import et.util.MyUtility;

class ResourceDAOImpl
  implements net.javacoding.jspider.core.storage.spi.ResourceDAOSPI
{

    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected java.util.Map
      knownURLs;
    protected java.util.Map
      byId;
    protected java.util.Set
      spideredResources;
    protected java.util.Set
      ignoredForFetchingResources;
    protected java.util.Set
      ignoredForParsingResources;
    protected java.util.Set
      forbiddenResources;
    protected java.util.Set
      fetchErrorResources;
    protected java.util.Set
      parseErrorResources;
    protected java.util.Set
      parsedResources;
    protected java.util.Map
      referers;
    protected java.util.Map
      referees;
    protected java.util.Map
      byFolder;
    protected java.util.Map
      rootResources;
    
    public ResourceDAOImpl(net.javacoding.jspider.core.storage.spi.StorageSPI storage) {
        super();
        this.
          storage =
          storage;
        spideredResources =
          new java.util.HashSet(
            );
        ignoredForFetchingResources =
          new java.util.HashSet(
            );
        ignoredForParsingResources =
          new java.util.HashSet(
            );
        forbiddenResources =
          new java.util.HashSet(
            );
        fetchErrorResources =
          new java.util.HashSet(
            );
        parseErrorResources =
          new java.util.HashSet(
            );
        parsedResources =
          new java.util.HashSet(
            );
        knownURLs =
          new java.util.HashMap(
            );
        this.
          byId =
          new java.util.HashMap(
            );
        this.
          referees =
          new java.util.HashMap(
            );
        this.
          referers =
          new java.util.HashMap(
            );
        this.
          byFolder =
          new java.util.HashMap(
            );
        this.
          rootResources =
          new java.util.HashMap(
            );
    }
    
    public void
      create(
      int id,
      net.javacoding.jspider.core.model.ResourceInternal resource) {
        java.net.URL url =
          resource.
            getURL();
        knownURLs.
          put(
          url,
          resource);
        byId.
          put(
          new java.lang.Integer(
            id),
          resource);
        if (resource.
              getFolder() ==
              null) {
            java.util.Set set =
              (java.util.Set)
                rootResources.
                  get(
                  URLUtil.
                    getSiteURL(
                    url));
            if (set ==
                  null) {
                set =
                  new java.util.HashSet(
                    );
                rootResources.
                  put(
                  URLUtil.
                    getSiteURL(
                    url),
                  set);
            }
            set.
              add(
              resource);
        } else {
            java.util.Set set =
              (java.util.Set)
                byFolder.
                  get(
                  resource.
                    getFolder());
            if (set ==
                  null) {
                set =
                  new java.util.HashSet(
                    );
                byFolder.
                  put(
                  resource.
                    getFolder(),
                  set);
            }
            set.
              add(
              resource);
        }
    }
    
    public void
      registerURLReference(
      java.net.URL url,
      java.net.URL refererURL) {
        net.javacoding.jspider.core.model.ResourceInternal resource =
          (net.javacoding.jspider.core.model.ResourceInternal)
            knownURLs.
              get(
              url);
        if (refererURL !=
              null) {
            net.javacoding.jspider.core.model.ResourceInternal referer =
              (net.javacoding.jspider.core.model.ResourceInternal)
                knownURLs.
                  get(
                  refererURL);
            this.
              storeRef(
              referers,
              resource,
              referer,
              refererURL,
              url);
            this.
              storeRef(
              referees,
              referer,
              resource,
              refererURL,
              url);
        }
    }
    
    public ResourceInternal[]
      findByFolder(
      net.javacoding.jspider.core.model.FolderInternal folder) {
        java.util.Set set =
          (java.util.Set)
            byFolder.
              get(
              folder);
        if (set ==
              null) {
            return new net.javacoding.jspider.core.model.ResourceInternal[0];
        }
        return (ResourceInternal[])
                 set.
                   toArray(
                   new net.javacoding.jspider.core.model.ResourceInternal[set.
                                                                            size()]);
    }
    
    protected void
      storeRef(
      java.util.Map map,
      net.javacoding.jspider.core.model.ResourceInternal key,
      net.javacoding.jspider.core.model.ResourceInternal data,
      java.net.URL referer,
      java.net.URL referee) {
        java.util.Map refmap =
          (java.util.Map)
            map.
              get(
              key.
                getURL());
        if (refmap ==
              null) {
            refmap =
              new java.util.HashMap(
                );
            map.
              put(
              key.
                getURL(),
              refmap);
        }
        net.javacoding.jspider.core.model.ResourceReferenceInternal rri =
          (net.javacoding.jspider.core.model.ResourceReferenceInternal)
            refmap.
              get(
              data.
                getURL());
        if (rri ==
              null) {
            rri =
              new net.javacoding.jspider.core.model.ResourceReferenceInternal(
                storage,
                referer,
                referee,
                0);
            refmap.
              put(
              data.
                getURL(),
              rri);
        }
        rri.
          incrementCount();
    }
    
    public ResourceInternal[]
      findAllResources(
      ) {
        return (ResourceInternal[])
                 knownURLs.
                   values().
                   toArray(
                   new net.javacoding.jspider.core.model.ResourceInternal[knownURLs.
                                                                            size()]);
    }
    
    public ResourceInternal[]
      getRefereringResources(
      net.javacoding.jspider.core.model.ResourceInternal resource) {
        ResourceReferenceInternal[] refs =
          this.
            getIncomingReferences(
            resource);
        java.util.ArrayList al =
          new java.util.ArrayList(
          );
        for (int i =
               0;
             i <
               refs.
                 length;
             i++) {
            net.javacoding.jspider.core.model.ResourceReferenceInternal ref =
              refs[i];
            al.
              add(
              ref.
                getReferer());
        }
        return (ResourceInternal[])
                 al.
                   toArray(
                   new net.javacoding.jspider.core.model.ResourceInternal[al.
                                                                            size()]);
    }
    
    public ResourceReferenceInternal[]
      getOutgoingReferences(
      net.javacoding.jspider.core.model.ResourceInternal resource) {
        java.util.Map map =
          (java.util.Map)
            referees.
              get(
              resource.
                getURL());
        if (map ==
              null) {
            return new net.javacoding.jspider.core.model.ResourceReferenceInternal[0];
        } else {
            return (ResourceReferenceInternal[])
                     map.
                       values().
                       toArray(
                       new net.javacoding.jspider.core.model.ResourceReferenceInternal[map.
                                                                                         size()]);
        }
    }
    
    public ResourceReferenceInternal[]
      getIncomingReferences(
      net.javacoding.jspider.core.model.ResourceInternal resource) {
        java.util.Map map =
          (java.util.Map)
            referers.
              get(
              resource.
                getURL());
        if (map ==
              null) {
            return new net.javacoding.jspider.core.model.ResourceReferenceInternal[0];
        } else {
            return (ResourceReferenceInternal[])
                     map.
                       values().
                       toArray(
                       new net.javacoding.jspider.core.model.ResourceReferenceInternal[map.
                                                                                         size()]);
        }
    }
    
    public ResourceInternal[]
      getReferencedResources(
      net.javacoding.jspider.core.model.ResourceInternal resource) {
        ResourceReferenceInternal[] refs =
          this.
            getOutgoingReferences(
            resource);
        java.util.ArrayList al =
          new java.util.ArrayList(
          );
        for (int i =
               0;
             i <
               refs.
                 length;
             i++) {
            net.javacoding.jspider.core.model.ResourceReferenceInternal ref =
              refs[i];
            al.
              add(
              ref.
                getReferee());
        }
        return (ResourceInternal[])
                 al.
                   toArray(
                   new net.javacoding.jspider.core.model.ResourceInternal[al.
                                                                            size()]);
    }
    
    public ResourceInternal[]
      getBySite(
      net.javacoding.jspider.core.model.SiteInternal site) {
        java.util.ArrayList al =
          new java.util.ArrayList(
          );
        java.util.Iterator it =
          knownURLs.
            keySet().
            iterator();
        while (it.
                 hasNext()) {
            java.net.URL url =
              (java.net.URL)
                it.
                  next();
            java.net.URL siteURL =
              URLUtil.
                getSiteURL(
                url);
            if (site.
                  getURL().
                  equals(
                  siteURL)) {
                al.
                  add(
                  this.
                    getResource(
                    url));
            }
        }
        return (ResourceInternal[])
                 al.
                   toArray(
                   new net.javacoding.jspider.core.model.ResourceInternal[al.
                                                                            size()]);
    }
    
    public ResourceInternal[]
      getRootResources(
      net.javacoding.jspider.core.model.SiteInternal site) {
        java.util.Set set =
          (java.util.Set)
            rootResources.
              get(
              site.
                getURL());
        if (set ==
              null) {
            return new net.javacoding.jspider.core.model.ResourceInternal[0];
        } else {
            return (ResourceInternal[])
                     set.
                       toArray(
                       new net.javacoding.jspider.core.model.ResourceInternal[set.
                                                                                size()]);
        }
    }
    
    public net.javacoding.jspider.core.model.ResourceInternal
      getResource(
      int id) {
        return (net.javacoding.jspider.core.model.ResourceInternal)
                 byId.
                   get(
                   new java.lang.Integer(
                     id));
    }
    
    public net.javacoding.jspider.core.model.ResourceInternal
      getResource(
      java.net.URL url) {
        return (net.javacoding.jspider.core.model.ResourceInternal)
                 knownURLs.
                   get(
                   url);
    }
    
    public synchronized void
      setSpidered(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLSpideredOkEvent event) {
        net.javacoding.jspider.core.model.ResourceInternal resource =
          this.
            getResource(
            url);
        resource.
          setFetched(
          event.
            getHttpStatus(),
          event.
            getSize(),
          event.
            getTimeMs(),
          event.
            getMimeType(),
          null,
          event.
            getHeaders());
        resource.
          setBytes(
          event.
            getBytes());
    }
    
    public synchronized void
      setIgnoredForParsing(
      java.net.URL url)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException {
        net.javacoding.jspider.core.model.ResourceInternal resource =
          this.
            getResource(
            url);
        resource.
          setParseIgnored();
        ignoredForParsingResources.
          add(
          url);
    }
    
    public synchronized void
      setIgnoredForFetching(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLFoundEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException {
        net.javacoding.jspider.core.model.ResourceInternal resource =
          this.
            getResource(
            url);
        resource.
          setFetchIgnored();
        ignoredForFetchingResources.
          add(
          event.
            getFoundURL());
    }
    
    public synchronized void
      setForbidden(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLFoundEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException {
        net.javacoding.jspider.core.model.ResourceInternal resource =
          this.
            getResource(
            url);
        resource.
          setForbidden();
        forbiddenResources.
          add(
          event.
            getFoundURL());
    }
    
    public synchronized void
      setError(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.ResourceParsedErrorEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException {
        net.javacoding.jspider.core.model.ResourceInternal resource =
          this.
            getResource(
            url);
        resource.
          setParseError();
        parseErrorResources.
          add(
          url);
    }
    
    public synchronized void
      setParsed(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.ResourceParsedOkEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException {
        net.javacoding.jspider.core.model.ResourceInternal resource =
          this.
            getResource(
            url);
        resource.
          setParsed();
        parsedResources.
          add(
          resource);
    }
    
    public synchronized void
      setError(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLSpideredErrorEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException {
        net.javacoding.jspider.core.model.ResourceInternal resource =
          this.
            getResource(
            url);
        resource.
          setFetchError(
          event.
            getHttpStatus(),
          event.
            getHeaders());
        fetchErrorResources.
          add(
          url);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVcC3AcxZnuXb0sW37J8lN+yLZwcLK72vcDhTuELdnCK0tI" +
       "sgmKEzGaHUmDRzvr\nmV49fJxDCg6Ci+IugcDdhcAdSY5U4koIEJKCVIAjcH" +
       "c5U8ep7gjJVbhcQaWSSkiRyqWgLqS4v3t6\ndnpnZh/2CFfN7ni2u////77/" +
       "//vvnhldeAs16RraKeohvFSQ9NChsRFB06XcIUXQ9XG4NCm+2NQ6\n8uixvO" +
       "pHvizyyzmM1mdFvScnYKFHzvUMHu5d1FBXQVWWZhQVs3Eco1y1/72Fi3de19" +
       "mA1k+g9XJ+\nDAtYFg+peSwt4gnUNifNTUma3pfLSbkJtDEvSbkxSZMFRT4L" +
       "DdX8BGrX5Zm8gIuapI9KuqrMk4bt\nerEgaVSmeTGL2kQ1r2OtKGJV0zHakL" +
       "1ZmBd6ilhWerKyjnuzqHlalpScfgadQw1Z1DStCDPQcEvW\ntKKHjtgzQK5D" +
       "89UyqKlNC6Jkdmk8LecBiT32HiWLu49BA+jaMifhWbUkqjEvwAXUbqikCPmZ" +
       "njGs\nyfkZaNqkFkEKRjsqDgqNVhUE8bQwI01itM3ebsT4CVq1UlhIF4w225" +
       "vRkYCzHTbOOLaGm9v+eH7k\nnS7KeWNOEhWifwt02m3rNCpNS5qUFyWj47vF" +
       "0H2DNxZ3+hGCxpttjY02fVd850T2F8/uMdp0urQZ\nnrpZEvGk+F5y567lvj" +
       "dbG4gaqwqqLhNXKLOcsjrCfuldLIA3bymNSH4MmT8+N/rSjbd+TfqVH60a\n" +
       "RM2iqhTn8oOoVcrnDrHzFjjPynnJuDo8Pa1LeBA1KvRSs0r/D3BMy4pE4GiG" +
       "84KAZ+n5YgEZ/3xw\n/Dc730A+MNpIXLOoidLhvuHBuYISKmD00byETxEnEN" +
       "Uc0H/qZr0g5yTtlKhq0ikdHBeIPAVBoWpL\npxzdF4nI9Qs+H4lde+Qp4KZH" +
       "VQUGmxQffeOHt/Qfu+szBo/E95iyGF0FCoQsBUJMgRBRIMQUCBkK\nhGwKIJ" +
       "+Pit5aDjRhLkcC7NeP9264J6g/5UcNE6hVnpsrYmFKkSAwBUVRF6TcJKaeuZ" +
       "GLAup84Llt\nU+DEoM+kAgPRoAFk5zW0z+6sVogPwpkAHrh87v1XfjO58ATx" +
       "K+IHHWR0QzVg9bShW9vBsU9cd9Nn\n9jWQRguNhDBo2l179EnxN+eHnnj1X3" +
       "96pRUUGHU7YtXZk8SaXf0RTRWlHOQya/gH/u/o2/c2Zb7t\nR40QwJDCsACO" +
       "B/lgt11GWcz1mvmLgAU910yr2pygkJ/MpLMaz2rqgnWFus9aek48dA0cTXAk" +
       "mNce\nIB/kx3bysclwNoKnzQaaHd+9rTn8o++teZGCYibS9VzGHZOwEZYbLT" +
       "rGNUmC6z/965F7P//WnR+n\nXDAyMGouFKcUWVyk+m31AfebXFJEaFvHffcf" +
       "fPBHJtmbrNH7NE1YIlwvfnp519/8k/BFSB8Qxrp8\nVqJR6ivRvk0yh+w/NG" +
       "QkHSNF3fLgG3cc/NmPX2ZpjJserVa/nLy9+NRfPLvsJxC3wkQl6MfNAKMT\n" +
       "JTnz0ckDaKQuT660UjxXGzEcwWg17RkJpyIx0KgdRJGZNSTnQllVFJTBw3//" +
       "/JrlzxaT1xm6rOUa\nDB6eXNzz8lcOvt9FdWAim7lUyf7fMi9ox63gJ19RjP" +
       "q9pKCrYulANBWMJzBqYW0pYR0YRevJLHAt\nNGacj40MmmSTzwA9DxInpEQh" +
       "itQ+1oTkAnvKGyCTuRlIc1N/9vsXHlrdZTgG6bOTDrMO0O3k+S7r\nNSmeOf" +
       "tgbHnsBtmA2T7N2Rqf/f6Jh959Gb9Ovd6KVSJt76JTwZMCl0bSr85vbH7s4T" +
       "k/aplAG2ip\nIuTxSUEpkpiYAH/RD7GLWaCb/728cDBcsbeUi3ba8wQn1p4l" +
       "rLkAzstd00oM6+DYC0c7SwzttsTg\nQ9SV+mmHbvr5oVIYtxY0FYN+Um7R5i" +
       "I9hu8fs3w/mcnYfN/A+/A1mefffOub8jvUv1fToq2PdGGa\nt9IrXNQ1qAWd" +
       "lAdcfcpG6h4u6L1UbrwkN5FMg/sOeAqDSDgaiKeDCRiobfzo4Jjp4ERS1jL8" +
       "HJQl\nTvOIUsgCFzxnHU1jhN5Qf744x/8Ic3bjaH/fYTJy2sjJ5POaMrp2wt" +
       "HBOnW40/Ux8nEECDqdVxfy\nJ0azOs/Kx7mMFA7TX4YswFLxtGfAUqlALB6M" +
       "xzBaRwErqUFkneL1IhdOmlllrZXgh4RCJfu3wrGZ\n2b/Z3f4cs79xamkwx5" +
       "s+w5secZoe9256LBCLBWMpMJKaTjQgYmaZNtRg8jFVyb5uZiMyv5325Zl9\n" +
       "Gw3dpJypSBnPZ3hjo3Zjk2GYmQ57MjYeDqSDUQiLLUZY2JUhEjU3Lc+RX8Yh" +
       "dG4YHRwf7z/u4gCQ\nJysBFIJjOwNouztAtzCAOmE9CabkBlRtQMLiLNjoCt" +
       "WneKhiDr9IprxOpZFMArCKAVZdFKsqehHh\nt1ZXveREZythRObWHQyjHe4Y" +
       "3cEw2mEJIkv6ShDdxUMUd0LkudqIpDMEIgjBPTaI7GoR2eerKl4b\noCvg6G" +
       "QAdboD9FcMoHYot6fkXE7KuwJzLw9MwgFMyjMw0XCExFkSo60UGKc6ROZ9ro" +
       "rWBuIAm1KQ\n+e0E4m8ZEJumiSP2a5qquSLxRR6JpAOJdMYzEhHiIlGIxm0G" +
       "Ek59iNCH3FWtD4tdDItd7lh82cSi\nQLa/KmPxKI9FyukVnjNKNJwqw8JFHy" +
       "L0q+6q1sZiHxy7GRa73bH4BsNiPRXgPgl9i8ch7fQJ79ER\niREcoNbosHAo" +
       "n4Med6pY236SFLqY/V3u9n+X2b9Ko6t1rczwZ3jDMw7DI1HPpUYsGojGgzEY" +
       "aC21\n3NSCiPoep1XtkqOTrQKQ+e209R/LbS0n+UV+jeusKMNJz7ZGY262Gj" +
       "y+xGlVn637ma373W29aNo6\ntTRAd9l4W/+Nt9VRQiZTSa8OnU6Vm2oqQSS9" +
       "wilV29QuVk0i89tp6qvM1LWaqmLXAP4xb6+jikzF\nvK8WknFqMGSydoNbXh" +
       "Ui7yd2/WymLzpXp8jcSyCfAW6PwMfb9ia/Pk0XzDI0We/uBmcM3eHQ0K5K\n" +
       "G+70ZsGdH/tt2x3CDz5hbEC0l++tksVg4uHXpIPXtIkum7mtWC0EFWleUqxd" +
       "Eru0IXojwtwQWH/D\nnv8ZSD765/Ztkg6ypcxvk5R3mxSf/8az/5V47Se3gx" +
       "YTqOX48Nihvmw/KLynqrhJceN85/UNs/I/\n06U827Fw3D4p79Rbvk+xWpNw" +
       "UcuPl+1WdJVtY2bgSDGnTtmcmnoD+Tjgutnkp+b77btEI5o8J2N5\nnt3f+P" +
       "bE78K5n3/ksEHSNv6+Gd/waPR9qXvTL9429ofK9wZddpdsQj67+8s/f+KN0Q" +
       "6DaONO037H\nzR6+j3G3iZrYViCutreaBNr6Bx/Ze+Hc6OtTfrbB9kuMGuQ8" +
       "xqiZqpvgQsGHuDCPGvVKjFz3eU1n\niUQgFgkmkjRJc/FbaxdxTs1JSinCBs" +
       "ndubyg1N5F/B2YJ2qSgA0x7xSMLu/B+nteJbc2DePDiF5+\nu8y3roZjiPnW" +
       "0OX5FgdpOwdpLGlBuskrpGR7JRUkmxUNRU0x0Wyji2cCqbmxwvTYzuvBUbtj" +
       "BfSI\nJ4PJMCZxS2sNkExG3lqTJt86qNc0aUbWMe1Vut9Bflvtxk0fHCcZNy" +
       "cvjRufI/P7ruAwiccsTA54\nnr2TgXgsmARumqet2gHoCdd2dmNer9vVfXuB" +
       "9GmI82vNMkVDHVy6ojdJSDK4feHYW1fufOcLfuSv\nchvD5XZxaYRJ8fGG7t" +
       "/6n9nSTW9dNU4JupGg7ffZnbfRy+6OU6bWlPHaWYVXnrEYz1iUFC++pkKh\n" +
       "ULoaT8XTFo+JFeAxEgkmYZzNPMQf0ruMKcruoqTeOg3HJ5kpn6zkokdcaW2i" +
       "tDbxBl/NG5yxTPsT\nr6ZloN4y9qIa5oxt1ile7rWc3ETYkntoBeRC2kpAnd" +
       "dwWlqiBPJyj/ByI5bcoysgN5EJpiFNNZLN\neYfgLC84agkeWgHB6WgwA57b" +
       "wvIjTY687Ot52VweGvVaVYPsTCIYIUsvJlyqMzNnYKYmw0uQkytm\n4zAcCn" +
       "N15dKyMSor0KsociNGG0js9SlK2crE1+NIIJVU4aGe4qBOhl0TCBdlOe93jd" +
       "Ikg5C7Kdvt\nVlTMIsSeYTjMJ00Knic6hbc6btk359m+SDSQiAVTaa6wo5jW" +
       "JnYWoy0zEjbmfM2+4exCbyU4eEPn\neUNjbvTyyWxxJcwHelMQLXvcbalK8g" +
       "1wnGVWnfVM8q2c7Skug33a+75LNJCMBNPJSyf5Fpg5AZjh\nIp5RKSyswHPj" +
       "uLsKGryd53k7I6X1em/964iSGmaVZXMRbt65B6Mj3sCLR0gtmIp/GKMdeFbW" +
       "Q654\nVHKP2xggt3l2j/t52Lgc94D3LcjI5brH5wz3GMyL6lw97lEJDd7Ov+" +
       "PtTNMUcLeNXy44HlkJ6yEF\npKGg2e1qSs00fzcz6m7PFH+NMz3NrTW/7tnI" +
       "ePhy0/w/8Gke8MjVSvOV4OANfZI3NOGa5rky6qmV\nMN+R5stsqUryVXDcz6" +
       "y63zPJ3+dsz3Bz+bOerUyEA/EwLc0bdRmXNmhCtRPrGDSvf8X6NEatAOO1\n" +
       "S2NMiosXVMKLR+KHPBLukz2Hz8WVwAe8IAFB0F5SvyrxZLfiS8yQL3km/j8s" +
       "c9NhzrD/9L73HgvE\nU3S7ghJPBn2hNo2vQGVOosF+z8CFzUog8Oa9zpvnzm" +
       "bCMvpnK2E0W9tvt1tRldQeOC4wey5cFqnk\nv3+oje+bGK2h2YbbL2VY/YrD" +
       "KsIVtL/2/uQSLWjjkAM6ONklQCgrlZaCjzFUHvPs6v/L28e5+u+9\n25ckOY" +
       "7YR3ZNz9S3GH67MhPv8Zpyc84fvdaN0UgqEEsGE1GoGzeYdeMoP/faadgGxz" +
       "E4nmQ0POlG\nA21ddpPMT84PYtSmL+XFWU3Ny2elnDsmzu1t/yrefqvk8Ld6" +
       "ZioNs5Gxci4xxQteywu29rP961ZC\ncCIMBTtGTdK8lMfmPJipNg/SliGZDH" +
       "FiNDvGnnUbPt1Prtf0ML8PPEyXsNnvjNuOyzZWSjzN+H36\nUvglQipUa874" +
       "8+/iwbXWCv7d3sFNEnATtePPRatuTqtouLTwG6rnRq20KEoF8qR8aDA/D4Pk" +
       "yHtp\n0rgm5I0H6PvN36mkrZD+yDtB9kfLKvIyAsdzjJfnVogXl2jr4RGwVj" +
       "H+sGdeMtFAwqhtXKMtzgu2\n0pzf+2PVIDgZpqV1ebTF64+2AbWYz1UJNBdX" +
       "upq3J06KDf8B+gMkws1lzJuPXVak/ggcLzHqX/rg\nqB/gNeYS7RHvDKQD8W" +
       "gwnqlA/TFeMJdosyshGHwuFTapJ6Nm6qZwlNcrzVF4DZnLJDxgPgZZkbnj\n" +
       "cFxkzF384JjjnrRPx6xizX/KK4DRcDwQS9NXc1yZu4kXbO1p+YWVEAwLBvL4" +
       "YnnQ/mmdQWsOabw9\nTB9KvLT4lXnTohz5J8h9CwnTISsSn4VjmRG//MERr/" +
       "FKWlWsX/eMfyQciGWC8WQF4hd4wdaiye95\nv5sIjqeDqYSd+I9eFvFVyyMX" +
       "1m/l7UpyrCsYtQLrxqgVaSfF8WuM9tc+ONrv4rW07kb7z3tHP1k1\n3u/hBX" +
       "NV21+uhGAS746SuF7auZL4MoL9Ac6ueJij/TZHsIOHr7fpT14a3eb4qwXGu/" +
       "XivuWbrnyh\nsPFfjAcazPffV2XRqumiovDvznHnzQVNmpapy6wy3qQz9HwQ" +
       "ow/X/7I1Rs3GCTHV/wVjiIcx2l/H\nEOUv2pmdH8Gos0pnjBrJF9/jKxhtce" +
       "8BEtgZ3/6rGK0rbw/UWP/hm34dnDRPX9/xXyiV6hust96M\nlxoX2dMq5vty" +
       "YwVJlMnLsIuPPNN4/T3//gf6FGGLaPz5CPInE0S9Z16Gmr2nLy8oSzp9h5L8" +
       "Rl4p\nF4uaBo5FH7dkXK3RjRGNP5HQyb8wWJLVPX7jSL/jncFUOu311SjjTQ" +
       "UYppE80urtXfxzGtruBhRV\nniU1+vogMeMEE/n/IrLi7fdDAAA=");
}
