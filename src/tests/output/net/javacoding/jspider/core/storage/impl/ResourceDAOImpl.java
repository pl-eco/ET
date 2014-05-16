package net.javacoding.jspider.core.storage.impl;

import net.javacoding.jspider.core.storage.ResourceDAO;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.ResourceDAOSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.impl.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.URLUtil;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.util.Date;

import et.util.MyUtility;

class ResourceDAOImpl
  implements net.javacoding.jspider.core.storage.ResourceDAO
{

    protected int
      counter;
    protected net.javacoding.jspider.core.logging.Log
      log;
    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected net.javacoding.jspider.core.storage.spi.ResourceDAOSPI
      spi;
    protected int
      folderCounter;
    
    public ResourceDAOImpl(net.javacoding.jspider.core.logging.Log log,
                           net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                           net.javacoding.jspider.core.storage.spi.ResourceDAOSPI spi) {
        super();
        this.
          log =
          log;
        this.
          storage =
          storage;
        this.
          spi =
          spi;
        this.
          counter =
          0;
        this.
          folderCounter =
          0;
    }
    
    public net.javacoding.jspider.api.model.Resource
      registerURL(
      java.net.URL url) {
        net.javacoding.jspider.core.model.FolderInternal folder =
          this.
            ensureFolders(
            url);
        int id =
          ++counter;
        net.javacoding.jspider.core.model.ResourceInternal resource =
          spi.
            getResource(
            url);
        if (resource ==
              null) {
            net.javacoding.jspider.core.model.SiteInternal site =
              storage.
                getSiteDAO().
                find(
                URLUtil.
                  getSiteURL(
                  url));
            if (site ==
                  null) {
                log.
                  warn(
                  "unable to register resource " +
                  url +
                  " because Site object wasn\'t found");
            } else {
                resource =
                  new net.javacoding.jspider.core.model.ResourceInternal(
                    storage,
                    id,
                    site,
                    url,
                    new java.util.Date(
                      ),
                    folder);
                spi.
                  create(
                  id,
                  resource);
            }
        }
        return resource;
    }
    
    public void
      registerURLReference(
      java.net.URL url,
      java.net.URL referer) {
        spi.
          registerURLReference(
          url,
          referer);
    }
    
    public Resource[]
      getAllResources(
      ) {
        return spi.
                 findAllResources();
    }
    
    public Resource[]
      getRefereringResources(
      net.javacoding.jspider.api.model.Resource resource) {
        net.javacoding.jspider.core.model.ResourceInternal ri =
          TypeTranslator.
            translate(
            resource);
        return spi.
                 getRefereringResources(
                 ri);
    }
    
    public Resource[]
      getReferencedResources(
      net.javacoding.jspider.api.model.Resource resource) {
        net.javacoding.jspider.core.model.ResourceInternal ri =
          TypeTranslator.
            translate(
            resource);
        return spi.
                 getReferencedResources(
                 ri);
    }
    
    public ResourceReference[]
      getIncomingReferences(
      net.javacoding.jspider.api.model.Resource resource) {
        return new net.javacoding.jspider.api.model.ResourceReference[0];
    }
    
    public ResourceReference[]
      getOutgoingReferences(
      net.javacoding.jspider.api.model.Resource resource) {
        net.javacoding.jspider.core.model.ResourceInternal ri =
          TypeTranslator.
            translate(
            resource);
        return spi.
                 getOutgoingReferences(
                 ri);
    }
    
    public Resource[]
      getRootResources(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.core.model.SiteInternal si =
          (net.javacoding.jspider.core.model.SiteInternal)
            site;
        return spi.
                 getRootResources(
                 si);
    }
    
    public Resource[]
      getBySite(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.core.model.SiteInternal si =
          TypeTranslator.
            translate(
            site);
        return spi.
                 getBySite(
                 si);
    }
    
    public Resource[]
      findByFolder(
      net.javacoding.jspider.api.model.Folder folder) {
        net.javacoding.jspider.core.model.FolderInternal fi =
          TypeTranslator.
            translate(
            folder);
        return spi.
                 findByFolder(
                 fi);
    }
    
    public net.javacoding.jspider.api.model.Resource
      getResource(
      java.net.URL url) {
        return spi.
                 getResource(
                 url);
    }
    
    public void
      setSpidered(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLSpideredOkEvent event) {
        spi.
          setSpidered(
          url,
          event);
    }
    
    public void
      setIgnoredForParsing(
      java.net.URL url)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException {
        spi.
          setIgnoredForParsing(
          url);
    }
    
    public void
      setIgnoredForFetching(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLFoundEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException {
        spi.
          setIgnoredForFetching(
          url,
          event);
    }
    
    public void
      setForbidden(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLFoundEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException {
        spi.
          setForbidden(
          url,
          event);
    }
    
    public void
      setError(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.ResourceParsedErrorEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException {
        spi.
          setError(
          url,
          event);
    }
    
    public void
      setParsed(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.ResourceParsedOkEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException {
        spi.
          setParsed(
          url,
          event);
    }
    
    public void
      setError(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLSpideredErrorEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException {
        spi.
          setError(
          url,
          event);
    }
    
    protected net.javacoding.jspider.core.model.FolderInternal
      ensureFolders(
      java.net.URL url) {
        java.net.URL siteURL =
          URLUtil.
            getSiteURL(
            url);
        net.javacoding.jspider.core.model.SiteInternal site =
          storage.
            getSiteDAO().
            find(
            siteURL);
        String[] folderNames =
          URLUtil.
            getFolderNames(
            url);
        net.javacoding.jspider.core.model.FolderInternal folder =
          null;
        if (folderNames.
              length >
              0) {
            folder =
              (net.javacoding.jspider.core.model.FolderInternal)
                site.
                  getRootFolder(
                  folderNames[0]);
            if (folder ==
                  null) {
                int id =
                  ++folderCounter;
                folder =
                  storage.
                    getFolderDAO().
                    createFolder(
                    id,
                    site,
                    folderNames[0]);
            }
            if (folderNames.
                  length >
                  1) {
                folder =
                  this.
                    ensureRecursively(
                    folder,
                    folderNames,
                    1);
            }
        }
        return folder;
    }
    
    protected net.javacoding.jspider.core.model.FolderInternal
      ensureRecursively(
      net.javacoding.jspider.core.model.FolderInternal folder,
      String[] folderNames,
      int depth) {
        net.javacoding.jspider.core.model.FolderInternal subFolder =
          (net.javacoding.jspider.core.model.FolderInternal)
            folder.
              getFolder(
              folderNames[depth]);
        if (subFolder ==
              null) {
            int id =
              ++folderCounter;
            subFolder =
              storage.
                getFolderDAO().
                createFolder(
                id,
                folder,
                folderNames[depth]);
        }
        if (depth +
              1 <
              folderNames.
                length) {
            subFolder =
              this.
                ensureRecursively(
                subFolder,
                folderNames,
                depth +
                  1);
        }
        return subFolder;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1327344960000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVbCXAkVRl+M8lmk02WbPaGDewVZFczk7lnsouuIQdkmd3E" +
       "zC64cSF0el6yvXS6\nh+43s7OrLloiIFVShaCCIoolUqWWKBRYJZYIiAeKx1" +
       "olnqgFXqUollrgVfi/o6ffzPTMZOlUdU+n\n+733H9//f+/o1597Ea2wLdSv" +
       "2mFysoDt8GhuWrFsnB/VFds+BLfm1KdWdE3ff7lhBlEgi4JanqDe\nrGoP5R" +
       "WiDGn5ocmxvWULbSuY+slF3SSinbpW9uz874nv3rR/SxvqnUW9mpEjCtHUUd" +
       "MguExmUc8S\nXprHlj2Sz+P8LOozMM7nsKUpunYKCprGLFpra4uGQooWtmew" +
       "beolWnCtXSxgi8l0bmZRj2oaNrGK\nKjEtm6A12eNKSRkqEk0fymo22ZtFHQ" +
       "sa1vP2deg0asuiFQu6sggFN2YdK4ZYi0MT9D4UX6WBmtaC\nomKnSvu1mgGe" +
       "2Fpbo2LxwOVQAKquXMLkmFkR1W4ocAOt5SrpirE4lCOWZixC0RVmEaQQdF7D" +
       "RqFQ\nZ0FRr1UW8RxBm2vLTfNHUKqLuYVWIWhDbTHWEmB2Xg1mElpTHT3/u2" +
       "X65W0M8/Y8VnWq/0qodEFN\npRm8gC1sqJhXfKUYvmPySLE/iBAU3lBTmJcZ" +
       "ufBLh7N/eGwrL7PFo8zU/HGskjn1v6n+88+MvNDV\nRtXoLJi2RkOhynKG6r" +
       "R4srdcgGjeWGmRPgw7D782840j7/oM/lMQdU6iDtXUi0vGJOrCRn5UXK+E\n" +
       "66xmYH53amHBxmQStevsVofJ/gd3LGg6pu7ogOuCQo6x63IB8b8AHPeI63X0" +
       "RFAfDc2ipeKxkanJ\npYIeLhC0x8DkKA0C1cwD/EeP2wUtj62jqmnhozYELg" +
       "B5VIPCR+sql6nA3hOBAM3c2rzTIUgvM3Vo\nak69//mn3zF++ftu5ijSyBOq" +
       "EpQB8WFXfFiID1PxYSE+TMWHa8SjQIAJ3lTtZIpanibXnx/cu+bW\nkP1IEL" +
       "XNoi5taalIlHkdQ1Iqum6ewPk5wqKyT8oAFngQtT3zEMCgzZwODbGEAa+WLL" +
       "SjNlDd9J6E\nKwWi78zpV3/wl7kTD9GYojGwnrbOVQNEr+W69ezOXbX/mpt3" +
       "tNFCJ9opWFB0oHXrc+pfbjnw0I+/\n88tdbkIQNFCXp/U1aZ7Vqj9tmSrOA4" +
       "+5zX/435e9dPuK4YeDqB2SF+iLKBB0wAUX1Mqoyre9DndR\nZ0HN7gXTWlJ0" +
       "+sghnFXkmGWecO+w4FnNrteAA7rhWAHHDhGx/fREH66lp3U81Kg/a2xgzPjK" +
       "ezoi\nz36l+ynmFIdEeyW2zWHCU7LPheOQhTHc/+Wd07d/8MWb3sawEGAQ1F" +
       "EozuuaWmb6bQoA9us86CG8\nef0dH9p997MO2Ovc1kcsSzlJsS6/+8z5d31T" +
       "+RhQB6SwrZ3CLEPbmKQ2qLQZO02Ojx7ghMPp6R13\nP3/j7l//9BlBYVLX6J" +
       "b649wNxUfe+9iZIHVxF3RSin3QSS/WSdKrAOs4AEYW8vROF/PnKp7BUSJq\n" +
       "JiOJDCi0FiTRTjWs5cNZU1X0ybF7H+8+c1sxtZ+rsloqMDk2V976zH27X93G" +
       "VBASOySWFP+vLCnW\nQTfz6U+MoNHXzj57YpnBeCQUTxPUpps89NYTdFEzQo" +
       "Fyi/RmVpQf4h7YI3lgmD2I09Ne//oNh5Kg\n30pR0tExthzSg3vhHL/OTU/K" +
       "6o646iYjrrqX+FY3ORxKU3dCLUfV1HJVlRoEdZ3EoedBdh2iCc2C\nHjEjdo" +
       "gilFdrO48JOihySGlp/u3/fPKeVdt4ktE6/awZOl7cIudOVa059bpTd8fP5K" +
       "7UeMzWDhdq\nCp/66uF7XnmGPMcYxOU9Km17uV7BKxSJkjM/LvV1fOHjS0G0" +
       "chatYUM+xSBXKHqR8sss5J49Km5m\nIXfk59UDMJ7Weyu83l/LuZLYWsZ1e1" +
       "W4rk5zl2TPgeM8ODYIkt1QQ7IBxPIyxyoMsPNFFUrsKlgm\nAf1wvgwRrZpF" +
       "OhStxWDa0pYg60tiFPbw7N8j+d+9YYxjsFke3csFL4u9igfW/eEl7v1qFvPA" +
       "rkbI\nbRd86ncPPT+znneJfDy8s25IKtfhY2LmnJ5CGWzY3kwCK/31N2z/3O" +
       "mZ5+a5JWurBx3jRnEp+fGf\n4N1v7lE9xjhtMGqHLoWnLO/I6PlgFS4bxYGc" +
       "33pcVHo6LNGd4IMFib6SNQTO43zszcOPv/DiA9rL\njKRXsUnHCK0hIqaL3Z" +
       "F6jjazYNPhrTS/Ei0NTBVs7roEQauY2Gg0Ohz1Rz6J+GA0FYoOE9R56LLJ\n" +
       "HCVqKmKRG3saxtL1NlFNhMPQWgbLOaz/pbnEIJEfAgztM+MjY7TVTCMMtsOx" +
       "SVTa5I2BLTCoonSB\nQ0nCIcUeHHNdFMukCBrz4aJoMjoYS4Ti4Oke5iNRns" +
       "o54SpE/72OnvY1s3KzsHKzt5XvdCLN6QmE\nhe+SLEzXWZhM+QuCaCw+mAlF" +
       "o04QQFUq4t1cj4phE40M2yboDTm/9YbdJAxbvcCmJqOcxejNq1ir\n5XrqQ0" +
       "5H5fZl/WLMLnnmVskziYLTew4tp/eUHEG56PxGs2HGQze99W89Nypfvyooul" +
       "GYfncRsxDS\ncQnrbo9a28gBNvl3Oo/eK7f+ZiJ1/ztru9T1dCIn03l1tTn1" +
       "8c8/9vPkT352A5DcLFp5cCo3OpId\nh8Tb2lTcnNpX2vKWtmPatxj9iN6tbs" +
       "miutLe6j5tlYVJ0TIOVfVs26qmD7vgGBDwD3hNH+jpdZ4D\nk0A9oJ+QBlkx" +
       "d5B1r78Qj6cG47FQHHiurWjpTpj0MN6isXJ4Jtt66HQ3Qd0WXoTJBbaggqz1" +
       "ZySt\no67Wn/WtdTQaSkQIWi/JvcjexkFxzNjdINoVGB4umXnszuE5jd5VBd" +
       "8eOBICvsTZwRdkzgnKjnhY\nckTGdcQj/hyRjA3G06FEgsNHG7xPFvplSag0" +
       "j3jUt9BEis8jLDbpZnx1X+s4+WI1XpUZOyt8pMAb\nuBo6xpJJV1P5ACXihc" +
       "1FcGQENpmzwwZVkWgTbb8BU/ZFTEZ03XGBTef70piRzakpA9xw4vIXd/W/\n" +
       "/NEgCjaZ9XqsLFZamFMfbBv4W/DRjQNspaN9XrE5r9QuydavuFYtpDLNu6t8" +
       "ta6Jr+Rg+aEbLKkI\n65weKBQKlZvxqMQ6P/IZQSx/KetsrvFwJYe9UN8Hx8" +
       "XCkot9E+rPJXsl037hz7RUZDCRDKViMGaw\nxEPmytbx9ixBG8EbPCvoyrcb" +
       "dvTxM3WgNnKFbORvJSOjXqDGXct/79tyADUVh57U24yW2I4Ig0Z8\nY/tXye" +
       "yka+FLPi1MvlZs/yRjC4yXb4VtI1fIRv5LMjLhhW3Ctfw/vi2vw7bKjKbYXg" +
       "rHhDBowi+2\ngTbJbLcnDbT7szAdGUzGQ+nI2WP7KkEbwCmThmousXB3ejUP" +
       "aPubeEK2cbVkY7oyem+0TFc/nqko\nUR0QbioE+ny7CwIiDVOjCzxtbxkP+4" +
       "UX9vuOh3NdX6XdIWbgPJ8GJl5jPAQ28HiYKpJFcznx0MgT\nso07JRtZ3xzo" +
       "rUY25Rp+oW/DJWTrrWiKbBSOKWHPlG9kQ5LVLpcFwj4NHKbL4IkMoW8/SGUN" +
       "/MKW\nyZWD0q3h303QGsqRpklakXwjT8k+GJZ8EPci+bTrGJ/vB8AxdFYFEs" +
       "+tNaAp6K+H45Aw5ZBv0Ecl\ngyV6H/NnWyZB57mJqACdthhrjeU+0AVcccnJ" +
       "nBMo9SA2sly26YBkU9oLRMnQKd+GUhBhjLK2onnL\nlD0ibDjiG70rXUszEh" +
       "m/1adRkLJJlrIdfJ3MSdpGL9fcpJ1g5VtDnSOoZ0Ez8pecnHAl1KPdyFOy\n" +
       "D1TJB54TKXcqHsC+HSNSdoOsfFPA6bLU1cKMq30DviQZK3G04c+u4YS8LEVb" +
       "bb28ENAI6majU0Fa\nkpZFSUt3xhMo+dbSWYaS5Facz5D3QuBNcMwLBObPDo" +
       "H6laXAack2aYB3vU/bMoOxTCie9F5ZCrxH\nEiqNPW7wLTSeDqWApVfgEjaI" +
       "k+bDzZatWUm+JefwTDbHnuD81LXj9H7rqDkFUWNj4tSjRZ7wAo3W\nWxCgLf" +
       "hOm9sk/0k9+Ad8vpKJ1K8HenvAQ6U7JZUylTnHgeW8McBlmGnQvRXhSaMEbe" +
       "TpJkZ8yFIM\nvuVi3HnOBL0f8oVuIFs0oI38hGnRPZHQdkPXj8JxXLj+uO98" +
       "uVeyU2LiT/p1fWowngklGiXMp12p\nw+4eicD9/qUmIGNStRmTWH7GTJhFI9" +
       "8kWTxC5QHJGLaqFPgIu/8x6IeqkJ3ARD3WDFq6yG4IaA3f\n0D4i6eUu6QW+" +
       "5NPJ0chgbDgUTzWA9lFJqtS5fMW/VAgouszOoaVtfnbZED0hKZWQIHoQxjkA" +
       "EWAz\nr+Xz2GiIDF15sgQylm9kvi2pI3VST/v1UWIwlgzFYw2Q+Z4kVeqlvu" +
       "9fajwRSiVqk27fMpPOaZLv\nBR+3LNM6u/x7VrIrLYH7FEGdAC5rsSGwdKW1" +
       "JIAt+Qb2OUkVaRbzK78uhuFHKhSPNwD2eUmqxOEv\n+Jca5wu81cBe/JqAbT" +
       "oE8UD1zxWjopGIhOrP4D6gyhttCCsdVJ4SsJ7yDevfJV2kedw/fDo4Fmua\n" +
       "r69IUiX+/pd/qTRf64aVy4VVGlaefbIGA5JRcQnWv7ZKVrqFJA7H9QLV6xuh" +
       "eni5qnRKqrgsHOzy\n69/0YCIeSkbOZrYWbCdoNTbsooXFhFtWdI2kqDurDP" +
       "b5VzSaCCUhEDZWia7bORBpFhnywsIkfRtr\nKLoXdnSWcLvA7vazw87ZjS25" +
       "ZIvrEulNbLDfp0sSaTaAdJdWaKMbWPvu6gd9VZFtYo2s5w5JTz4a\nqtp0lv" +
       "a/6SwdCw1DrPVyfemLdjv8tjLdLxXcCSHIL9F1DpZr3E14/Isizww5SKtvF9" +
       "uyghyJqm1X\nQWCPBQ2gpvd2l8FfOjYW+UcuTPa2siehggbrXA1GddPA9LsP" +
       "5xn/HkMzw5WPuuBh2VPFu7iKTFZj\nMl/u/oYgHViqVB0PR/Gdv6jsLlrF3E" +
       "lLcJ//mEtHGIbdEobMka3V3kRQH0/eGawWYeJYwvpJOQAn\npAB0u67gpQSN" +
       "+wq8BN3tmE69HsiDHNPscJ0SLHOoz3prqtNPMTbXfQfIv1ZTd5y5ZteThb5v" +
       "830f\nzhdlnVnUuVDUdXkXtXTdUbDwgsZYpJPvqea2HyBo13I/YCKonf5QDw" +
       "WzvPo0QTuXUb16t6lTOUfQ\nliaVQRz9kWtcAa70rgESxJVc/ghB51SXB2Zx" +
       "/5GLHgUigKL08iqW0W8si807zqbdXAGrGv2WpPzJ\nR9vfcusP/8P2Aq5U+Y" +
       "eX9GND1R4qabZGhkYg60/abNc8fUY/yALQLRgEsL2QApNum7fIPy7cIm9V\n" +
       "rsgaOHRkerxut3JsOOGXFVlwxqCZdrpT1c93bKctdK6Xm5jqgv/ZDmZqREEI" +
       "/D/seAfyLzsAAA==");
}
