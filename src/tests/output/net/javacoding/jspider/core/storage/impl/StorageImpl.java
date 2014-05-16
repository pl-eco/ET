package net.javacoding.jspider.core.storage.impl;

import net.javacoding.jspider.core.storage.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.PropertySet;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.SummaryInternal;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Summary;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;

public class StorageImpl
  implements net.javacoding.jspider.core.storage.Storage
{

    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected net.javacoding.jspider.core.storage.SiteDAO
      siteDAO;
    protected net.javacoding.jspider.core.storage.ResourceDAO
      resourceDAO;
    protected net.javacoding.jspider.core.storage.DecisionDAO
      decisionDAO;
    protected net.javacoding.jspider.core.storage.CookieDAO
      cookieDAO;
    protected net.javacoding.jspider.core.storage.EMailAddressDAO
      emailAddressDAO;
    
    public StorageImpl(net.javacoding.jspider.core.storage.StorageProvider provider,
                       net.javacoding.jspider.core.util.config.PropertySet props) {
        super();
        this.
          storage =
          provider.
            createStorage(
            props);
        this.
          siteDAO =
          new net.javacoding.jspider.core.storage.impl.SiteDAOImpl(
            LogFactory.
              getLog(
              net.javacoding.jspider.core.storage.SiteDAO.class),
            storage,
            storage.
              getSiteDAO());
        this.
          resourceDAO =
          new net.javacoding.jspider.core.storage.impl.ResourceDAOImpl(
            LogFactory.
              getLog(
              net.javacoding.jspider.core.storage.ResourceDAO.class),
            storage,
            storage.
              getResourceDAO());
        this.
          decisionDAO =
          new net.javacoding.jspider.core.storage.impl.DecisionDAOImpl(
            LogFactory.
              getLog(
              net.javacoding.jspider.core.storage.DecisionDAO.class),
            storage,
            storage.
              getDecisionDAO());
        this.
          cookieDAO =
          new net.javacoding.jspider.core.storage.impl.CookieDAOImpl(
            LogFactory.
              getLog(
              net.javacoding.jspider.core.storage.CookieDAO.class),
            storage,
            storage.
              getCookieDAO());
        this.
          emailAddressDAO =
          new net.javacoding.jspider.core.storage.impl.EMailAddressDAOImpl(
            LogFactory.
              getLog(
              net.javacoding.jspider.core.storage.EMailAddressDAO.class),
            storage,
            storage.
              getEMailAddressDAO());
    }
    
    public net.javacoding.jspider.core.storage.SiteDAO
      getSiteDAO(
      ) {
        return siteDAO;
    }
    
    public net.javacoding.jspider.core.storage.ResourceDAO
      getResourceDAO(
      ) {
        return resourceDAO;
    }
    
    public net.javacoding.jspider.core.storage.DecisionDAO
      getDecisionDAO(
      ) {
        return decisionDAO;
    }
    
    public net.javacoding.jspider.core.storage.CookieDAO
      getCookieDAO(
      ) {
        return cookieDAO;
    }
    
    public net.javacoding.jspider.core.storage.EMailAddressDAO
      getEMailAddressDAO(
      ) {
        return emailAddressDAO;
    }
    
    public net.javacoding.jspider.api.model.Summary
      getSummary(
      ) {
        Resource[] resources =
          this.
            getResourceDAO().
            getAllResources();
        int knownURLs =
          resources.
            length;
        int parsedResources =
          0;
        int ignoredForFetchingResources =
          0;
        int ignoredForParsingResources =
          0;
        int fetchErrorResources =
          0;
        int parseErrorResources =
          0;
        int forbiddenResources =
          0;
        int unvisitedURLs =
          0;
        for (int i =
               0;
             i <
               resources.
                 length;
             i++) {
            net.javacoding.jspider.api.model.Resource resource =
              resources[i];
            switch (resource.
                      getState()) {
                case Resource.
                       STATE_DISCOVERED:
                    unvisitedURLs++;
                    break;
                case Resource.
                       STATE_FETCH_ERROR:
                    fetchErrorResources++;
                    break;
                case Resource.
                       STATE_FETCH_IGNORED:
                    ignoredForFetchingResources++;
                    break;
                case Resource.
                       STATE_FETCH_FORBIDDEN:
                    forbiddenResources++;
                    break;
                case Resource.
                       STATE_FETCHED:
                    break;
                case Resource.
                       STATE_PARSE_ERROR:
                    parseErrorResources++;
                    break;
                case Resource.
                       STATE_PARSE_IGNORED:
                    ignoredForParsingResources++;
                    break;
                case Resource.
                       STATE_PARSED:
                    parsedResources++;
                    break;
            }
        }
        return new net.javacoding.jspider.core.model.SummaryInternal(
          knownURLs,
          parsedResources,
          ignoredForFetchingResources,
          ignoredForParsingResources,
          fetchErrorResources,
          parseErrorResources,
          forbiddenResources,
          unvisitedURLs);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALWZfWwcRxXAx19nn+3E30mondh1TOOAfefz3Tlx/Ac52Q65" +
       "5BK7PrclxuG63p1z\nNtm7vezO2eeQRqB+JO0fraqmfIjQCCQUCVBBVA0SIE" +
       "IoLZ9B4D/6hVqBWhBfqSgSaiitypvZ3dvZ\nvXXr2oql3Vvvzpv39jfvvXkz" +
       "++3rqErXUIeoB8hSDuuB0eSkoOlYGlUEXZ+GWynx2Sr/5KWDWbUc\nlSVQuS" +
       "wR1JAQ9aAkECEoS8H42EhBQ105VVmaV1Ri9lPSy57t7yz+5uyB9grUMIMa5G" +
       "ySCEQWR9Us\nwQUyg+ozODOHNT0mSViaQU1ZjKUk1mRBkU9BQzU7g5p1eT4r" +
       "kLyG9Smsq8oCbdis53NYYzqtmwlU\nL6pZnWh5kaiaTlBj4riwIATzRFaCCV" +
       "knIwnkS8tYkfST6AyqSKCqtCLMQ8NNCestgqzH4D56H5rX\nymCmlhZEbIlU" +
       "npCzQKLTLVF8456D0ABEqzOYHFOLqiqzAtxAzYZJipCdDyaJJmfnoWmVmgct" +
       "BN2y\nYqfQqCYniCeEeZwiaIu73aTxCFr5GRYqQlCbuxnrCcbsFteYcaM14a" +
       "t/96HJt7rYmFdKWFSo/dUg\ntM0lNIXTWMNZERuCN/KB8/Ej+Y5yhKBxm6ux" +
       "0Sb20e/fkfjrlU6jTbtHm4m541gkKfGdoY6ty7HX\n/RXUjJqcqsvUFRxvzk" +
       "Z10nwyUsiBN28q9kgfBqyHP5l67sjnvon/UY5q4sgnqko+k40jP85Ko+Z1\n" +
       "NVwn5Cw27k6k0zomcVSpsFs+lf0PONKygikOH1znBHKMXRdyCKFqOMrg+Awy" +
       "/jbSE0EbkuCIMDDx\nTE4J5AgaymIySx1AVCUY+tnjek6WsDYrqhqe1Y22sz" +
       "I0nnUIFqiihsWyMhqx7nhTwDn3qwp0kxIv\nvfar0+MHHzxnjB71ONNEgiKg" +
       "OmCrDpiqA1R1wFQdoKoDnGpUVsaUbnaCpSMl0YD65/dGGh/u1y+X\no4oZ5J" +
       "czmTwR5hQMgSgoirqIpRRhntjEeT1zNvDU+jlwWrAkpUBHLEiA5IKGut3OaY" +
       "d0HK4E8Ljl\nM+/97o3U4lPUj+i4t9LeDdNgFE8YttXvTB49cPe57graaLGS" +
       "DhA07fng3lPiGw8deur5X7/SawcB\nQT0lsVkqSWPLbf6kpopYgtxld//Ft/" +
       "f/67Gq4afLUSUELKQsIoCjQfxvc+twxNiIla8oLJCsS6ta\nRlDoIyvJ1JJj" +
       "mrpo32GOs4FdNwKAOjiq4NhmeulmeqIPm+mpxXAzytP1Diwb3rjXN/DCj+qe" +
       "ZVCs\nxNnAZdgkJkYYNtnDMa1hDPdf+dLkY49fP/tpNhbmYBDky+XnFFksMP" +
       "s2l8HYt3ikhMCW1vNf2Hnh\nBWuwW+zeY5omLNGxLnx+eeuXfy58FdIFhK0u" +
       "n8IsKsuZpnIQ2oKtLsdHDxlJxkhJpy+89sDOP750\nzUxb3HRot/pb6r785f" +
       "uvLJdTxH6YmAT9sBVabGKkV2VssoBhZC5P7/gZz1ojekPElAwNRIfBoGbQ\n" +
       "RCfSgCwFEqooKPGxr12tW340P3TAMGUD1yA+lip0XvvGzve6mAmmRh+XGc3/" +
       "qxcE7bAd9fRnkKBP\nrC3r7BkM9w1G+yPDBPRo6gKVYUPVSlB4NdnE7G2Slw" +
       "0aOPbYOIYG2IMwPY2sy9hoqH9oN0FVYGxO\nX5WlzIsgANPyPA1UVlCAu1oe" +
       "Sc997LqfRgrzJsTs7zab0ITlzsj7aIVhRXtm7rP/eeaJ2i7De6lM\nB+vGBz" +
       "7QzjulQyolnjx1IbycvEs2nME997oan/rxHU/cuEZeZaFpJxSq7dZCqYF3Cl" +
       "yu2/38QpPv\nuxcz5ah6BjWy+knIkjsFJU8DdwacWh81bybAKfnnzmrGiJeR" +
       "YsLscCczTq07ldlTFVw748fOXnRO\nvRWORjN7NbqyVxliDp9gAj3svKOYa/" +
       "zgFATsw1KBoGrTj3iPnOICNOwKUAP32N7hq69f/478FgvC\nWlZIxqiEabif" +
       "3eEyQwW4IS1ZuJrZ7KlnIqePMLURS200PLyLoNhavX+4D+zuD4Ug3Oun98eT" +
       "VhBS\nHUn7jc9AkVT6YtQcEypqZg63kSVZOq6B8Ww+wz+EWqJyajw2ZgXY4G" +
       "pSAdyz0kFyMm7MM/T8Scfo\n0nmpyVTV5D26Aj0dpi8kEzwWm+CHUOKGMMIe" +
       "TBfpRgYG1p5bwuG+ULR/0GZr6KYasG0K/feoReXj\nq0qQtqAXjtsM4hZ5Lx" +
       "wZE0cdrI3UvCa6keQ4JNESJOuYG8K7GJIhWGQxJJx+quWk0yQHmuBq0Ew5\n" +
       "hVfC02LiafHGs2ThgZQk6zBPuvCc5vAMleCJrB1PJOTEw+mnWu5xmvTh8Yw5" +
       "hb3wdMPRauJp9cZz\nv4kHpgz1hOz2nXMcnF0lcIbWASfK4ADejQxOUTvV8S" +
       "BvjgNM/2rAjPKiXlgCcLSZWNq8sTxqYmnA\nGUFWYpIEnqy74Jzn4OwugbN7" +
       "HXCGKZwwZKtWBsdlA9X0eKlpDlCrKs7GD5V00MDe7DazsrGLnw5z\n9cS9/k" +
       "Xu9QdzHy7pGb8FmGO3rrQPwfZQzn7qzfoHhJ8dNUqgZucSlM5K0Ysv4p1760" +
       "WP1a6fqLl+\nBS9gxa7T3NoOsf0ZqyRpuKvzT/uGLt3jVah18IWaUywlXn3y" +
       "yh+iL758H1gxg6oPTyRHY4lxMLjz\nfdWlxKaF9tsrjsm/YNWEWTOV7Co5hU" +
       "aclVKthkley0476qUux2qvE44u09u7vFZ73IivUO5+YC38\nJEG185gkSyfk" +
       "p20v2RWyq/zL65h2BvtCof4wrKZabJU79C6DBO38BGKKvuXAsAOOHhNDz03C" +
       "8ANI\nZ2DTlPdEfJVDMWij+ClBe9eIIhruC4f6I7s+BizIMVkPOJXT3hdXYt" +
       "Frsui9SSyeM1iMec+61zgW\nYZvFb9eRNAeYW8BKdbNTrcM17vXCsR2OPhNH" +
       "303CsQyFI9g16jXLvsTBiNgwXl4HjAiDESWojVfq\nQPGIF4ogHAMmioGbhO" +
       "JVWDSCVa7ZhwfyZw5I1Abyl3UA2U2BRGB51V6q2oHlK15YaA6NmFgiNwnL\n" +
       "380cms9kBG2Jx/Emh2PIxvHvteOIOnOoobKIwZrLe1eYywVYyWVUCSsBUxLB" +
       "grqO00D36LaUfBQy\nPl2I3ct39z6Ta/ol2/osfl6oSaCadF5R+F0A7tqX03" +
       "BaZjRqjD0BA83bK1tZsqsNi1b6w97uv4b4\nuwRtX4W4a7vAEC5D4EzvIwzq" +
       "6A8vUUHQJm8J0GBe8e19kEOd7cFH7H/4pn6CKqApvawtFmON9hLe\n2JqhFV" +
       "crt/hP5iBP0o3Hwtd/WHn7w7//H6tEqkXjyxz9GiXqwQXIpCQYywrKks52gu" +
       "gzunsv5jUN\nZwkr2cxxqtONHo2vT+38vkdRV8/0kclx99ZHZGB4He7M5kHq" +
       "zpW0YF7rp44zGvqIFxxmsBn9bP+D\nmj5rKvs/j5CXnkYdAAA=");
}
