package net.javacoding.jspider.core.storage.memory;

import net.javacoding.jspider.core.storage.spi.FolderDAOSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.FolderInternal;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.SiteInternal;

import et.util.MyUtility;
import java.util.*;

import et.util.MyUtility;

class FolderDAOImpl
  implements net.javacoding.jspider.core.storage.spi.FolderDAOSPI
{

    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected java.util.Map
      parents;
    protected java.util.Map
      children;
    protected java.util.Map
      byId;
    protected java.util.Map
      siteRoots;
    
    public FolderDAOImpl(net.javacoding.jspider.core.storage.spi.StorageSPI storage) {
        super();
        this.
          storage =
          storage;
        this.
          parents =
          new java.util.HashMap(
            );
        this.
          children =
          new java.util.HashMap(
            );
        this.
          byId =
          new java.util.HashMap(
            );
        this.
          siteRoots =
          new java.util.HashMap(
            );
    }
    
    public FolderInternal[]
      findSubFolders(
      net.javacoding.jspider.core.model.FolderInternal folder) {
        java.util.Set folders =
          (java.util.Set)
            children.
              get(
              folder);
        if (folders ==
              null) {
            return new net.javacoding.jspider.core.model.FolderInternal[0];
        } else {
            return (FolderInternal[])
                     folders.
                       toArray(
                       new net.javacoding.jspider.core.model.FolderInternal[folders.
                                                                              size()]);
        }
    }
    
    public FolderInternal[]
      findSiteRootFolders(
      net.javacoding.jspider.core.model.SiteInternal site) {
        java.util.Set rootFolders =
          (java.util.Set)
            siteRoots.
              get(
              new java.lang.Integer(
                site.
                  getId()));
        if (rootFolders ==
              null) {
            return new net.javacoding.jspider.core.model.FolderInternal[0];
        } else {
            return (FolderInternal[])
                     rootFolders.
                       toArray(
                       new net.javacoding.jspider.core.model.FolderInternal[rootFolders.
                                                                              size()]);
        }
    }
    
    public net.javacoding.jspider.core.model.FolderInternal
      createFolder(
      int id,
      net.javacoding.jspider.core.model.FolderInternal parent,
      java.lang.String name) {
        net.javacoding.jspider.core.model.FolderInternal folder =
          new net.javacoding.jspider.core.model.FolderInternal(
          storage,
          id,
          parent.
            getId(),
          name,
          parent.
            getSiteId());
        byId.
          put(
          new java.lang.Integer(
            id),
          folder);
        parents.
          put(
          folder,
          parent);
        java.util.Set set =
          (java.util.Set)
            children.
              get(
              parent);
        if (set ==
              null) {
            set =
              new java.util.HashSet(
                );
            children.
              put(
              parent,
              set);
        }
        set.
          add(
          folder);
        return folder;
    }
    
    public net.javacoding.jspider.core.model.FolderInternal
      createFolder(
      int id,
      net.javacoding.jspider.core.model.SiteInternal site,
      java.lang.String name) {
        net.javacoding.jspider.core.model.FolderInternal folder =
          new net.javacoding.jspider.core.model.FolderInternal(
          storage,
          id,
          0,
          name,
          site.
            getId());
        java.util.Set roots =
          (java.util.Set)
            siteRoots.
              get(
              new java.lang.Integer(
                site.
                  getId()));
        if (roots ==
              null) {
            roots =
              new java.util.HashSet(
                );
            siteRoots.
              put(
              new java.lang.Integer(
                site.
                  getId()),
              roots);
        }
        roots.
          add(
          folder);
        byId.
          put(
          new java.lang.Integer(
            id),
          folder);
        return folder;
    }
    
    public net.javacoding.jspider.core.model.FolderInternal
      findById(
      int id) {
        return (net.javacoding.jspider.core.model.FolderInternal)
                 byId.
                   get(
                   new java.lang.Integer(
                     id));
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1Ze2wUxxmfOz/PNhg/AAcbMMQtkPjOr7vzGf8RjG3KwYEd" +
       "H5DgOLqs98b2wt7t\nsjtnnwlFrUogTaVIaZK2aSlRX0Kt0hco9I+0pYikrx" +
       "QpsVSSpkqaChQRtaBEVQpKU9FvZndv5/YO\nm3C1tOu53W/me/2+x8y+cBWV" +
       "6BpqEnUfmVWx7uuPDguajuP9sqDru+BRTHylxDN8cntScSNXBLml\nOEHVEV" +
       "FviwtEaJPibeGB3rSGmlVFnp2UFWKuk7PKxrs/mfnTsW2NRah6FFVLySgRiC" +
       "T2K0mC02QU\nVSVwYhxrel88juOjqCaJcTyKNUmQpYNAqCRHUa0uTSYFktKw" +
       "PoJ1RZ6mhLV6SsUa42k9jKAqUUnq\nREuJRNF0gpZE9gnTQluKSHJbRNJJbw" +
       "SVTkhYjusH0GFUFEElE7IwCYTLIpYWbWzFti30OZBXSCCm\nNiGI2JpSvF9K" +
       "giVWO2dkNG7ZDgQwtSyByZSSYVWcFOABqjVEkoXkZFuUaFJyEkhLlBRwIWjF" +
       "LRcF\nonJVEPcLkzhGUIOTbth4BVQeZhY6haClTjK2EvhshcNnnLeGSqv++8" +
       "Tw9Wbm8+I4FmUqfxlMWuWY\nNIInsIaTIjYm3kj5ngnvTTW5EQLipQ5ig6bv" +
       "M7/YHblydrVB05iHZmh8HxZJTPwk2LRyru+yp4iK\nUa4qukShkKU58+qw+a" +
       "Y3rQKal2VWpC991svfjPx27xd+hP/hRuVhVCoqciqRDCMPTsb7zXEZjCNS\n" +
       "EhtPhyYmdEzCqFhmj0oV9hvMMSHJmJqjFMaqQKbYOK0i488F15A5XkRvEC9b" +
       "FDmOtYG+oXBClX0q\nQRuTmIxRCIhKHJw/tk9XJaAYExUNj+kAW3DjGISEos" +
       "2OOSanKbvqGZeLxq0z6mSA6FZGHxNPXvrj\nocHtX37c8CHFnSkoQSFg77PZ" +
       "+0z2PsreZ7L3Gex9WeyRy8UYL882MfVZnIbWP0/1LnnSq59xo6JR\n5JESiR" +
       "QRxmUMISnIsjKD4zHCMFnD4Z/BDjBbNQ7wBWliMizEwgVsOq2htU6Y2sEdhp" +
       "EA2Js7fPO1\na7GZ0xRRFAH1dHVDNPDnfkO2qg3Rh7c98vjaIko0U0xdBaQt" +
       "C68eE689seP0xVffXm+HA0EtOVGa\nO5NGmVP8YU0RcRyymL381z/e+sHTJT" +
       "0vulExhC4kLyIA5CATrHLyyIq2XitzUWPBzMoJRUsIMn1l\npZsKMqUpM/YT" +
       "Bp5FbLwEDFAJVwlcTSZel9EbfVlLb3UG1Kg9HTqwvHjjS6Xtb/yy8hVmFCuF" +
       "VnO5\nNoqJEZA1tjt2aRjD87e/Mfz0s1ePPcR8YTqDoFI1NS5LYprJt9wFvq" +
       "/Lkxx8DfXPfG3D8TcsZ9fZ\nq/dpmjBLfZ3+4tzK534nfBsSBwSwLh3ELD5d" +
       "Gbc3YGvJwf4dRroxktOh45eObnj3LxfMBMYVRpvq\n/diR1JnHzs65qYk9UK" +
       "IEfacVXqxE0pGLlQ1wI4M8feJh9qwwIriDoAo2s6O9JxAEiWqBFa2pPinu\n" +
       "iyiiIIcHvnOucu6pVHCbIcsijiA8EEuvvvCDDTebmQwmy1IuSZq/y6YFbacd" +
       "+vRfJ0H9d55+NnZ2\ntnZ2e/0BgspMSuaueoI6byerwDNf1BhHh8OWq+m9lY" +
       "29FILMTYjZaa1JQjOBM91toUXcCqPE+KMf\nnT9R0WzAgs5pYsvQ/qaR93bW" +
       "rJh44ODxrrnoA5JhZGd5cxAf/PXuEzcukHcY5u1IpdzWpHMF3CNw\nSSR0cb" +
       "qm9GfPJ9yobBQtYS2KkCR7BDlFI2IU0KL3mw8j4Gz+fXbDYACxN5OJmpxZgm" +
       "PrzBF2HYBx\nNjDttLAYrjVwVZtpodqRFlyIAWmQTWhh93WZIPaomkJAPhxP" +
       "OyDSZiB/O4/8DgfyDXsPbOo5d/nq\nT6XrDN0VrFnro1NMyT3sCRdzRYqq07" +
       "aA60vNlVqGVL2X8fVn+AY6/R2FBUHQ3xro8gbbCaratTUc\ntdBN2URsrQ9D" +
       "L5KrG5XINCyqZaBbzDIY9a1vMJlK8C+hWBePDPYN0JVDRjqm901ZvloBV405" +
       "qSa/\nrx6kt8+BaKoA9YPovEMe4h3Syd7s4GzVBQljcwG2CnS0hrwdActUpg" +
       "CUy5gtD/25x0oki+yMvkNQ\nb6V1o2Eiy1T5tI6bWpeLU5IcB0a82pO82l25" +
       "aocKg0gg2NrR6e0EiCxielsiUD5TnEhMc3obv5Wi\ny+GqMxWty69o0lS0eH" +
       "w2HOeVPMAr6c9RMhgoTMnu7tauDm8XrOJhSlL2lIdmirKwcrT1qDeVq8+v\n" +
       "XNpUzgOVDY8oSjZ6H+U1DORoGChQw2CIuRHyxWIj0i0ZKKNDvFAOXdO52RFZ" +
       "tcwud01mR8IpdJRX\nqF21gsJ/u9U1owGrrxpaeattHtuiHnvww6qjwssPG+" +
       "WvNruvp9ko8PybeMOmKjHPNsJDFNUr42ks\n2zXayW0H2/5a5aj6gdV/3xI8" +
       "+fl8RbqJL9LZ02LiuZ+c/WvgzbeOgBSjqGznULS/LzIIAq+el11M\nrJluvL" +
       "9oSvo9KyRmvczZtGdP6s2ukhUaJiktuSurVjZntdB9cK0yMbwqXwtNb5/N2+" +
       "q4cv3/HOf/\noJGOu+jtm4UBuau91Q8lC6pg6QR7ZQGrfT5gJZQ4lk1Ihekh" +
       "SFKQF27anoVomQBwRVPjxlSdbiK4\nXpo16tSkR2a2X13fdP1bbuSep5XOc1" +
       "iRWSEmnipq+dD90rIWtn0qHhd0w1HOU57cQ5yssxkmeGWW\nX++ax6+8x07y" +
       "HutgOeuEqqqZp/7uYLvtxx8W7MeODi9N3MuzTbxObzagihivr2apshmudaYq" +
       "6wqG\n6M95hXts1U4VqFpPqz/EVCumWdUCqG9hgEaB/Pbh+WOC6pjtzNRtYZ" +
       "S++14OAm5lNt4gv+INEsqL\ngA7bTGcLNhNFQBA6/zxazAuDEbjaTX3aPx0M" +
       "ipgBi5y7qWFNSsCGc9o8/3tx9F/t8ffuHTDKSQN/\nrswTbu28iVvqrnxg7K" +
       "Oywz7PLszB5KlV33/v9KWReqMkGSexd+cchvJzjNNYpmKVSovimvk4MOqX\n" +
       "713zwuGRd8bdJmi+QlARZBBIn0zcAO/+1zj3d3fbjn69MEf7Q63+bm8wRE9G" +
       "WJvMcMUz/jPPOGQz\nvlgw4+52bwiaHlYJrUBcYu9TjEPrhUPtPLT9ooYFgr" +
       "fYRccU/m+88EFb+HcLFh7CIwS7lqU850xc\nMCPmC46dcN1nBsd9dxQc9Oer" +
       "vIpXOBVDnIrvF9iUdjFg+M1ESVc8w7O9yrPl8HitYLbBoLe7m9gN\n0lsLQ+" +
       "DyPBD4iBc0YAv674IFBQh0hz41BO6BK2JCIHJHZZJBYGGjfAw7QJq8N2fv11" +
       "wuziA9NmBc\n7gL3aUFqED/ERI3F1WGMNOxTs2bRo9WGnK96xrcnce3cI+vP" +
       "qzV/MFou6/tQeQSUSskyf8bEjUtV\nDU9ITP1y48TJ0LmcoHtu/4MEJENjQI" +
       "3jKjOWqIQCcBtLZB9IWZMXE9Q4z2RAO/3Hz6ghaFn+GcDB\nHPH0kDsXZ9OD" +
       "m+0fPOlyKDNASocNmb0fl3iNw7+02U9bR0tRFYsSPTJOf/el4vuffP0/bL9T" +
       "Jhqf\nV+knRVFvm5YgWbT1QYs0q7OzRvqOfngRUxqtLmxjaPqqUjdWND4hNv" +
       "IHaxleLbv2Dg/mnq3RtPR/\nOFOgxYfuuAv5XHVYQ3flsxKT3AxzdsxGddht" +
       "MvwfNV9W7BQfAAA=");
}
