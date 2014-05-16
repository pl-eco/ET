package net.javacoding.jspider.core.model;

import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.Constants;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class SiteInternal
  implements net.javacoding.jspider.api.model.Site
{

    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected int
      id;
    protected boolean
      handle;
    protected java.net.URL
      url;
    protected java.lang.String
      host;
    protected int
      port;
    protected int
      hashCode;
    protected boolean
      isBaseSite;
    protected boolean
      hasRobotsTXT;
    protected boolean
      useCookies;
    protected boolean
      useProxy;
    protected int
      state;
    protected boolean
      obeyRobotsTXT;
    protected boolean
      fetchRobotsTXT;
    protected java.lang.String
      userAgent;
    
    public SiteInternal(net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                        int id,
                        boolean handle,
                        java.net.URL url,
                        boolean isBaseSite) {
        this(storage,
             id,
             handle,
             url,
             Site.
               STATE_DISCOVERED,
             true,
             true,
             true,
             Constants.
               USERAGENT,
             isBaseSite);
    }
    
    public SiteInternal(int id,
                        net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                        java.net.URL url) {
        this(storage,
             id,
             true,
             url,
             false);
    }
    
    public SiteInternal(net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                        int id,
                        boolean handle,
                        java.net.URL url,
                        int state,
                        boolean obeyRobotsTXT,
                        boolean useProxy,
                        boolean useCookies,
                        java.lang.String userAgent,
                        boolean isBaseSite) {
        super();
        this.
          storage =
          storage;
        this.
          handle =
          handle;
        this.
          id =
          id;
        this.
          url =
          url;
        this.
          host =
          url.
            getHost();
        this.
          port =
          url.
            getPort();
        this.
          state =
          state;
        this.
          obeyRobotsTXT =
          obeyRobotsTXT;
        this.
          useProxy =
          useProxy;
        this.
          useCookies =
          useCookies;
        this.
          userAgent =
          userAgent;
        this.
          isBaseSite =
          isBaseSite;
        hashCode =
          (host +
           port).
            hashCode();
    }
    
    public int
      getId(
      ) {
        return id;
    }
    
    public void
      setId(
      int id) {
        this.
          id =
          id;
    }
    
    public int
      getState(
      ) {
        return state;
    }
    
    public java.lang.String
      getHost(
      ) {
        return host;
    }
    
    public int
      getPort(
      ) {
        return port;
    }
    
    public boolean
      isRobotsTXTHandled(
      ) {
        return state ==
          Site.
            STATE_ROBOTSTXT_HANDLED ||
          state ==
          Site.
            STATE_ROBOTSTXT_UNEXISTING ||
          state ==
          Site.
            STATE_ROBOTSTXT_ERROR ||
          state ==
          Site.
            STATE_ROBOTSTXT_SKIPPED;
    }
    
    public java.net.URL
      getURL(
      ) {
        return url;
    }
    
    public Folder[]
      getRootFolders(
      ) {
        return storage.
                 getFolderDAO().
                 findSiteRootFolders(
                 this);
    }
    
    public net.javacoding.jspider.api.model.Folder
      getRootFolder(
      java.lang.String name) {
        Folder[] folders =
          this.
            getRootFolders();
        for (int i =
               0;
             i <
               folders.
                 length;
             i++) {
            net.javacoding.jspider.api.model.Folder folder =
              folders[i];
            if (folder.
                  getName().
                  equals(
                  name)) {
                return folder;
            }
        }
        return null;
    }
    
    public Resource[]
      getRootResources(
      ) {
        return storage.
                 getResourceDAO().
                 getRootResources(
                 this);
    }
    
    public Resource[]
      getAllResources(
      ) {
        return storage.
                 getResourceDAO().
                 getBySite(
                 this);
    }
    
    public Cookie[]
      getCookies(
      ) {
        return storage.
                 getCookieDAO().
                 find(
                 id);
    }
    
    public java.lang.String
      getCookieString(
      ) {
        Cookie[] c =
          this.
            getCookies();
        java.lang.StringBuffer sb =
          new java.lang.StringBuffer(
          );
        for (int i =
               0;
             i <
               c.
                 length;
             i++) {
            net.javacoding.jspider.api.model.Cookie cookie =
              c[i];
            sb.
              append(
              cookie.
                getName());
            sb.
              append(
              "=");
            sb.
              append(
              cookie.
                getValue());
            sb.
              append(
              "; ");
        }
        return sb.
                 toString();
    }
    
    public boolean
      getUseCookies(
      ) {
        return useCookies;
    }
    
    public boolean
      equals(
      java.lang.Object object) {
        if (object instanceof net.javacoding.jspider.api.model.Site) {
            net.javacoding.jspider.api.model.Site other =
              (net.javacoding.jspider.api.model.Site)
                object;
            return other.
                     getHost().
                     equalsIgnoreCase(
                     host) &&
              other.
                getPort() ==
              port;
        } else {
            return false;
        }
    }
    
    public int
      hashCode(
      ) {
        return hashCode;
    }
    
    public boolean
      getUseProxy(
      ) {
        return useProxy;
    }
    
    public void
      registerNoRobotsTXTFound(
      ) {
        state =
          Site.
            STATE_ROBOTSTXT_UNEXISTING;
    }
    
    public void
      registerRobotsTXTError(
      ) {
        state =
          Site.
            STATE_ROBOTSTXT_ERROR;
    }
    
    public void
      registerRobotsTXT(
      ) {
        this.
          state =
          Site.
            STATE_ROBOTSTXT_HANDLED;
    }
    
    public void
      registerRobotsTXTSkipped(
      ) {
        this.
          state =
          Site.
            STATE_ROBOTSTXT_SKIPPED;
    }
    
    public void
      setUseCookies(
      boolean useCookies) {
        this.
          useCookies =
          useCookies;
    }
    
    public void
      setUseProxy(
      boolean useProxy) {
        this.
          useProxy =
          useProxy;
    }
    
    public void
      setObeyRobotsTXT(
      boolean obey) {
        this.
          obeyRobotsTXT =
          obey;
    }
    
    public boolean
      getObeyRobotsTXT(
      ) {
        return this.
                 obeyRobotsTXT;
    }
    
    public boolean
      getFetchRobotsTXT(
      ) {
        return fetchRobotsTXT;
    }
    
    public void
      setFetchRobotsTXT(
      boolean fetchRobotsTXT) {
        this.
          fetchRobotsTXT =
          fetchRobotsTXT;
    }
    
    public java.lang.String
      translateState(
      ) {
        switch (state) {
            case Site.
                   STATE_DISCOVERED:
                return "DISCOVERED";
            case Site.
                   STATE_ROBOTSTXT_ERROR:
                return "ROBOTSTXT_ERROR";
            case Site.
                   STATE_ROBOTSTXT_UNEXISTING:
                return "ROBOTSTXT_UNEXISTING";
            case Site.
                   STATE_ROBOTSTXT_HANDLED:
                return "ROBOTSTXT_HANDLED";
            case Site.
                   STATE_ROBOTSTXT_SKIPPED:
                return "ROBOTSTXT_SKIPPED";
        }
        return "<ERROR_UNKNOWN_STATE>";
    }
    
    public java.lang.String
      toString(
      ) {
        return "[Site: " +
        url +
        " - " +
        this.
          translateState() +
        (isBaseSite
           ? " *"
           : "") +
        "]";
    }
    
    public java.lang.String
      getUserAgent(
      ) {
        return userAgent;
    }
    
    public void
      setUserAgent(
      java.lang.String userAgent) {
        this.
          userAgent =
          userAgent;
    }
    
    public void
      setBaseSite(
      boolean isBaseSite) {
        this.
          isBaseSite =
          isBaseSite;
    }
    
    public boolean
      isBaseSite(
      ) {
        return isBaseSite;
    }
    
    public boolean
      mustHandle(
      ) {
        return handle;
    }
    
    public boolean
      getMustHandle(
      ) {
        return handle;
    }
    
    public void
      setHandle(
      boolean mustHandle) {
        this.
          handle =
          mustHandle;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVbC2wb5R3/7LzTNGmSPlKatmmbri3Ejh9xnDQICElKQt0m" +
       "jVNKQ1G42Jfk2ovP\nvfucpoWVIR4tCKF2lMFYeU2dWk0VMN4aY4B4DEYrsQ" +
       "hB2QCxlQETFIEQK2Js7P89znc+nxNqyZHO\nvtx93///+7//33fn42dQgaai" +
       "2ojmxrvjoubuCPcJqiZGO2RB0wbg0lDklYKSvqPrY4oTOULIKUUx\nqghFtM" +
       "aogIVGKdrY09k2qaK6uCLvHpUVzOmkUVm74vtdJ/ZdvigPVQyiCikWxgKWIh" +
       "1KDIuTeBCV\njYvjw6KqtUejYnQQVcZEMRoWVUmQpT0wUIkNoipNGo0JOKGK" +
       "Wr+oKfIEGVilJeKiSnnqF0OoLKLE\nNKwmIlhRNYzmhLYLE0JjAktyY0jScF" +
       "sIFY5IohzVdqK9KC+ECkZkYRQGzg/pUjRSio3ryHUYXioB\nTHVEiIj6lPwd" +
       "Ugw0sdQ6Iylx/XoYAFOLxkU8piRZ5ccEuICqGCRZiI02hrEqxUZhaIGSAC4Y" +
       "nZeR\nKAwqjguRHcKoOIRRjXVcH7sFo0qoWsgUjOZZh1FKYLPzLDYzWau3sO" +
       "y/t/WdraM2z4+KEZngL4JJ\nSyyT+sURURVjEZFN/DbhPtSzNVHrRAgGz7MM" +
       "ZmPaVz69OfTp80vZmEU2Y3qHt4sRPBT5vrl28VT7\nRyV5BEZxXNEk4gopkl" +
       "Or9vE7bZNx8Ob5SYrkplu/+UL/q1t/9lvxMycq7kGFEUVOjMd6UIkYi3bw\n" +
       "8yI4D0kxkV3tHRnRRNyD8mV6qVCh/4M6RiRZJOoohPO4gMfo+WQcIVQEhwOO" +
       "zxD7KyMfGJWHJSz2\nEBeKCbI7jpEnJuJtxAMiShRsv227Fpeiorotoqjitn" +
       "ElKsrbUqdMEh4VuxwOEqzWUJPBL7sVGQgM\nRY6e/vN1Xetv3c8MR5yNo8PI" +
       "DUzdBlM3Z+omTN2UqdvMFDkclN2CVG0S80RJFH3+WNucO1zaU06U\nN4hKpP" +
       "HxBBaGZRGiT5BlZZcYHcLU/SpNrk49DNyzbBg8FTAMyUCIRgaob0JFy60eac" +
       "RxD5wJ4GZT\ne39484uhXY8T5yHGnkuoM2hguh0MW9ma8NWXX7N/eR4ZtCsf" +
       "jJAHQ+tnpj4U+eK2DY+//cb7qw3P\nx6g+LSDTZ5KAssLvU5WIGIWEZZC/+7" +
       "vuL+8saH3SifIhSiFPYQG8C4J+iZVHSmC16UmKKAtmzhpR\n1HFBJrf0zFKK" +
       "x1Rll3GFusxsej4HFDALjgI4lnHXXEo+yM0q8lHNHIzo0yIDTYHf3ljoeecP" +
       "s16h\nStGzZYUprYZFzGKv0jDHgCqKcP39e/ruvOvMvquoLZgxHBgVxhPDsh" +
       "SZpPgWOMD21TZ5wF0z99Av\n1hx+Rzd2tUG9XVWF3cTWkzdMLf7ln4T7IEdA" +
       "rGrSHpGGYgHlRIpbjaiT7OrYwDILy0PXHT59y5oP\n3z3Jc5WpBhqj/jV0U+" +
       "Kpm5+fchIVl0A1ErSNelDRakjOHLRCgBmpy5MrJVSfpSxuvRgV05lBfyvg\n" +
       "qQJGpHi6pag7pEQEuafzoRdnTR1MNF/OkMw2DejpHJpcevI3a36oowg4w0JT" +
       "NuT/F00I6kYj3MmX\nD6PWc000a/3eBl+zq6kJoyIN3BvKCTXRXIx80+UPPt" +
       "YN19xhdh7u6wFpF5m136dK4wB6gheLJwe/\n9kQ/vqCTiV1jbkLMA7t9P4j1" +
       "1Z9+Sb3PYgObimRhcnDJkY8fP90/lwU0K9sr0iqneQ4r3dR0ZfFJ\nkGHZdB" +
       "zo6JcvWHZ8b/8Hw0ySqtSU2RVLjAceOCWuuaQsYpOX86C5gICgcgWostfGWV" +
       "xcDEYYVhRZ\nFGL6AC+90cgcqzvpWE0eet1PPnqyNHvQ4woGAU5ClXWTl9F4" +
       "I3bf3B8i1zr1gCWfDfTcRRIJDTZE\nQS2nV5ekJZ6VPPGssEs85OMntqTzWP" +
       "om/15kln2zIbvXkP2KrGQPNPibXAGf4fKEVIuZ26DBzWdw\nuypLboEmV7OX" +
       "aZqQ2TCzUjdlUGqAK3XVuSm1lJIuNUsoGhL6DQlHspKw1ZpCqD6pCakTmflu" +
       "N/g2\nGXx3ZMnX5MNUswZP48PMXTG4BwzuEJRt2XD3Bjwub3MzRiUJTVTbR8" +
       "UY1iNpDo0k0gS5Wb//I6NJ\n4ENId2Rt/NaRNYzeWowPX/vNS/eX1rFSSebU" +
       "UjIV1hycMmsosnPPYf9UeIvEMpc1l1oG7/nj5vu/\nPYk/YJk42b0Qbssm0w" +
       "FeIZgaq5a3JyoLH31g3ImKBtEcukKDtHaFICdIlzAIFVTr4BdDUALN91PX\n" +
       "S6w4tyW7s1prMjextfZNRuaF89RibbRK5bxNKufBVW4JLgei5fUGOqGefq5K" +
       "NjYlcVXBgE+MTlpK\nKHe5fUY3ELB0A0zbnZe0vvjRmUeks7Til9KVajuZwH" +
       "GX0CumLiRPiWtkTWRalHNK9b1xjRUyCEZW\nOVtb/X6M1p6ze3s9QfBvlw+y" +
       "ZNlAd0/YbQrt/Yake2H5lS4RwcGViaqoo5Ub8UDKo/kmRF9+f1d7\nZzJpVF" +
       "DJr0uxzzw45vBJc+ztc4h83Ij1numiTKQWw1HJSVXak7qbkyocE2JRtvjrzE" +
       "RuPhNDF8eO\n3L2cXLLUcte4z3CNZnr9VoxKWdn3eJqC2ZjN54F+Lujye4A0" +
       "NRvPjPcbSfLnyUxpJ855cFRzcart\nxTnCxckfUzRslueoIU9Ql0f3wkB2Xu" +
       "j3NAT8rgDoooSKQ1gSysc4+6RAOJNAC+CYywWaay/Qw7pA\ncUXF0/rOIu6K" +
       "SP9OJ/Y7Tqx4TNDGOkCoaQku4x6E9O90gk9wgpAwLxU0kWhoWodcwYVG+nc6" +
       "yac5\nyTLA2K8MK1gbuHJgWqIEZw0nWmNP9Pc6TiiGHYqyQ2JpMCNJsiJdyE" +
       "kutCf5nK5LIAmL68nd0xKs\n4e6L9O90gi9wggVQLvD0lqnn5kb6dzq1lzi1" +
       "2cqwuPvH6ZF0xbWcaq091Vc51fIREUfGfhzZpTyv\nIf07nezrnKylV+Ghe8" +
       "II3Za0VBRsyaY983laG1poASlnmUjnS8ifNAPZS64cgKKypb9nYKBroxHP\n" +
       "FBvvaalMDaZWx2EW4B1DgKa43oWtzLCEFWDVauyAkSXf4kx7o3S5t+/Kr8pu" +
       "EV6+2sm7tEsAPVbi\nLlmcEGWjYbMS2UC3gvXepGLL0r+vaz76U2vHVk/2+M" +
       "wdW+q0ociLDz//t8Cpv94EXdggKtrYG+5o\nD3VBTV06LbuhSOXEok15Y9Jr" +
       "tK/gzVPaBnbqpLbUlqlUFXFCjQ2kNE51KasSEnRB7nlBi+dRE5os\nmKHvnb" +
       "Ep/icE7KiIe1hdR3TMP1JQEP9v4yjazg2Fg/kSJT0zlM9J7iBQrAv3/AmFPC" +
       "phq3aPHUaS\n4y7mGC/OkabOQhSApsLJ7GYHhGSzDg6kI0dA/gfRDEC6UzsE" +
       "R4Gx/mpOrr8chdmkl2boT70uH3QG\nczijVVod81eaP+wkJ856GZf8stxI7i" +
       "hlkvfprYQdDrJ8X89xrM8RjkpYRUlGde+mnSyNoE47SKRT\n6OWQenMEqQbi" +
       "A1SzuT9k9omlhk8EDZ+ow+jS6XyCrz+2jYvjirqbOkdne2/PeJz4RpOnwedz" +
       "+QPn\nYzRLgztuxpUQ32AnPKn1YS58OEfC10MdBBj9ioLX0Yc3Gtl9N+2B0h" +
       "1ukmpv2rX+zOras79yIuc0\ne9A2D/SSFIYij+XVf+V8dn49fe6QPwx9I03g" +
       "1ieh6Q86U55fUuFnpaiqchpVma3aaFi1JVmPV81Y\nj5lq4vG4vnJoamkxZY" +
       "qsFhEtLWRJ1OQHb6jGY5LmTjWDnUM0wLGFS7nl3BzCkdabONqSuggY+7aO\n" +
       "C7PJei3BBr8PZMFGncYz+x4kydmpQpvQdRiWajXQdWLU9WPiT4KI20YexSfU" +
       "iCkCvWSTNegKekHp\nVXoIGvwJB6+d4lfDMcwVP5yjSOxmJYOg0YFrZKDjgh" +
       "Qo1dNAMetvk2Fdf9LT18zo6TrrVF83ZcDN\n2fhHawupik2w/F9oFTFZHjNV" +
       "pBEu7EiO9L4VowoA1S7LM6k9ExKz2ocNtTeRBY4jnKrJFkOT0ew2\nwHxElf" +
       "5WjGosqKfVZB0c2zn+7TnS5BgszgATX2XbKLFyGhBmJe40lBg4hyzNGKfq25" +
       "Q7Etnsp3u9\n3gYf6Juk6Qo9TXMJ7fRMtjliXMRYjvS8m3ksQ8H28c3a+5mh" +
       "PVONuiErb/N6qLcFmLeZOc7c1i6H\n41quimtzpIqbWQnZnLq3kymFX8/RXH" +
       "9uaGxq54GkjpuN536Og1np2BckD6pIRBcq9KGC7vGmpzXs\nacPM+rgdiIg7" +
       "E4KcWRFkwbefK2J/jsxyr3WjMVNKup0DuT1HQB6CVpv5h7FRl6mzOsCxHMgR" +
       "lmMQ\nRKo4Kmlg+o1Kcgm0TknEaO/8dSa3PcSBHcoRsEcwmq8DS8LqUlVFzQ" +
       "iLpLl7OKx7cgTrKYwq02Bl\nRHQ+HIc5osM5QvScyYJJROEdUjwuZragF44H" +
       "ObAHs0o81GtnRvcy5ELNmgttIZGZRzikI7mE9AZZ\n6aaGny0gNxzHOKBjuQ" +
       "Q0BVkVAPVad8ZtUZFd8eMc1fEcudS7rOtPA5Sxhj3KAT2aI0AfQtQBoHXp\n" +
       "u/x2iC6E4wmO6IlcGu4TgKXZwbK1HNk5eYbDeiZHivoCo3KsCjFNFrBItzbN" +
       "DcI3RoNgvNLh+Hc2\nLSh5eNrkdQWCyZ2CVLaEum0DtgSO17gWXsuRFr4DOb" +
       "GS1oQ6HYb8RhPqdGb38Jg1obB6rNRZzdx9\n1sFxggt/IjfCOwsxKmPdRdqj" +
       "K+dsQwHG6tlZnp0CmqgCfBjNM7ObWQmk9rzJlfBmVuFpFmm+IZKx\njHUuyE" +
       "6klga/10XeJihJeQI3c4/rrAKtayY1ZMwCPjje4tK/lcPk5FzCypz5ObgtIP" +
       "K4+hQHdCpH\nPrky/ZF8JijvcSjv5QhKA0AZT2i423hdJVOyPs2hnM4RFD9b" +
       "J26YGY0Hjk84mk9y6TRrwfXBaQw4\nX6NJ8GxzoJCXzWvSftLEfngTWT51ze" +
       "qX4pWvs710/ccxxSFUPJKQZfMbZqbzwrgqjkhUkGL2vhkL\n7Q6Mls34wwyM" +
       "Cug3Ecd5KZu4DqNF00zEKJ98mWf0wGrDfgZGRfzMPD4EdTZ1PLiV8Y95aC9G" +
       "eTCU\nnPbRzbe7JvnTDP1NsHBcjEjkXffJXz+bv+mOv/yHPoUuirAfgJEfPU" +
       "W0xglJk3BjOxhgt0ZfByT3\nyO9FIglVhYRDn8Jzhc7SGEX2I6dF5rffkrzq" +
       "B7b2dSVfgEu+v9AayOr9Bb+vocXlhVqQT95fOPdf\n1OxV0UI7jVCU3PHpG3" +
       "AE70HO5v8MjftCojcAAA==");
}
