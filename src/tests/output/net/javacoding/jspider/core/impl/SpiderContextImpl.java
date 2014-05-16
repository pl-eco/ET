package net.javacoding.jspider.core.impl;

import net.javacoding.jspider.Constants;

import et.util.MyUtility;
import net.javacoding.jspider.spi.Rule;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.site.UserAgentObeyedEvent;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Cookie;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.Agent;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.dispatch.EventDispatcher;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.SiteInternal;

import et.util.MyUtility;
import net.javacoding.jspider.core.rule.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.rule.impl.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.Storage;

import et.util.MyUtility;
import net.javacoding.jspider.core.throttle.Throttle;

import et.util.MyUtility;
import net.javacoding.jspider.core.throttle.ThrottleFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.Base64Encoder;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.URLUtil;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.http.CookieUtil;

import et.util.MyUtility;
import java.io.IOException;

import et.util.MyUtility;
import java.io.InputStream;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.net.URLConnection;

import et.util.MyUtility;
import java.util.HashMap;

import et.util.MyUtility;
import java.util.Map;

import et.util.MyUtility;

public class SpiderContextImpl
  implements net.javacoding.jspider.core.SpiderContext
{

    protected net.javacoding.jspider.core.Agent
      agent;
    protected java.net.URL
      baseURL;
    protected net.javacoding.jspider.core.dispatch.EventDispatcher
      eventDispatcher;
    protected net.javacoding.jspider.core.throttle.ThrottleFactory
      throttleFactory;
    protected java.util.Map
      throttles;
    protected java.util.Map
      spiderRules;
    protected java.util.Map
      parserRules;
    protected java.util.Map
      robotsTXTRules;
    protected net.javacoding.jspider.core.storage.Storage
      storage;
    protected net.javacoding.jspider.core.util.http.CookieUtil
      cookieUtil;
    protected java.lang.String
      authenticationString;
    protected boolean
      useProxyAuthentication;
    protected boolean
      useProxy;
    protected net.javacoding.jspider.core.rule.Ruleset
      generalSpiderRules;
    protected net.javacoding.jspider.core.rule.Ruleset
      generalParserRules;
    protected java.lang.String
      defaultUserAgent;
    protected net.javacoding.jspider.core.logging.Log
      log;
    
    public SpiderContextImpl(java.net.URL baseURL,
                             net.javacoding.jspider.core.dispatch.EventDispatcher eventDispatcher,
                             net.javacoding.jspider.core.throttle.ThrottleFactory throttleFactory,
                             net.javacoding.jspider.core.storage.Storage storage) {
        super();
        this.
          baseURL =
          URLUtil.
            normalize(
            baseURL);
        this.
          eventDispatcher =
          eventDispatcher;
        this.
          throttleFactory =
          throttleFactory;
        this.
          storage =
          storage;
        this.
          cookieUtil =
          new net.javacoding.jspider.core.util.http.CookieUtil(
            );
        this.
          throttles =
          new java.util.HashMap(
            );
        this.
          spiderRules =
          new java.util.HashMap(
            );
        this.
          parserRules =
          new java.util.HashMap(
            );
        this.
          robotsTXTRules =
          new java.util.HashMap(
            );
        this.
          generalSpiderRules =
          RuleFactory.
            createGeneralSpiderRules();
        this.
          generalParserRules =
          RuleFactory.
            createGeneralParserRules();
        this.
          log =
          LogFactory.
            getLog(
            net.javacoding.jspider.core.SpiderContext.class);
        net.javacoding.jspider.core.util.config.PropertySet props =
          ConfigurationFactory.
            getConfiguration().
            getJSpiderConfiguration();
        this.
          defaultUserAgent =
          props.
            getString(
            ConfigConstants.
              CONFIG_USERAGENT,
            Constants.
              USERAGENT);
        log.
          info(
          "default user Agent is \'" +
          defaultUserAgent +
          "\'");
        net.javacoding.jspider.core.util.config.PropertySet proxyProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            CONFIG_PROXY,
          props);
        useProxy =
          proxyProps.
            getBoolean(
            ConfigConstants.
              CONFIG_PROXY_USE,
            false);
        if (useProxy) {
            java.lang.String proxyHost =
              proxyProps.
                getString(
                ConfigConstants.
                  CONFIG_PROXY_HOST,
                "");
            java.lang.String proxyPort =
              proxyProps.
                getString(
                ConfigConstants.
                  CONFIG_PROXY_PORT,
                "");
            System.
              setProperty(
              "http.proxyHost",
              proxyHost);
            System.
              setProperty(
              "http.proxyPort",
              proxyPort);
            log.
              info(
              "Using proxy " +
              proxyHost +
              ":" +
              proxyPort);
            useProxyAuthentication =
              proxyProps.
                getBoolean(
                ConfigConstants.
                  CONFIG_PROXY_AUTHENTICATE,
                false);
            if (useProxyAuthentication) {
                java.lang.String proxyUser =
                  proxyProps.
                    getString(
                    ConfigConstants.
                      CONFIG_PROXY_USERNAME,
                    "");
                java.lang.String proxyPwd =
                  proxyProps.
                    getString(
                    ConfigConstants.
                      CONFIG_PROXY_PASSWORD,
                    "");
                java.lang.String plain =
                  proxyUser +
                ":" +
                proxyPwd;
                authenticationString =
                  "Basic " +
                  Base64Encoder.
                    base64Encode(
                    plain);
                log.
                  info(
                  "Authenticating against proxy, user:" +
                  proxyUser);
            }
        }
    }
    
    public void
      setAgent(
      net.javacoding.jspider.core.Agent agent) {
        this.
          agent =
          agent;
    }
    
    public synchronized void
      setCookies(
      net.javacoding.jspider.api.model.Site site,
      Cookie[] cookies) {
        if (cookies !=
              null &&
              cookies.
                length >
              0) {
            storage.
              getCookieDAO().
              save(
              site,
              cookies);
        }
    }
    
    public void
      preHandle(
      java.net.URLConnection connection,
      net.javacoding.jspider.api.model.Site site) {
        connection.
          setDefaultUseCaches(
          false);
        connection.
          setUseCaches(
          false);
        connection.
          setRequestProperty(
          "Cache-Control",
          "max-age=0,no-cache");
        connection.
          setRequestProperty(
          "Pragma",
          "no-cache");
        if (useProxyAuthentication) {
            connection.
              setRequestProperty(
              "Proxy-Authorization",
              authenticationString);
        }
        java.lang.String cookieString =
          site.
            getCookieString();
        boolean useCookies =
          site.
            getUseCookies();
        if (useCookies &&
              cookieString !=
              null) {
            connection.
              setRequestProperty(
              "Cookie",
              cookieString);
        }
    }
    
    public void
      postHandle(
      java.net.URLConnection connection,
      net.javacoding.jspider.api.model.Site site) {
        this.
          setCookies(
          site,
          cookieUtil.
            getCookies(
            connection));
        storage.
          getSiteDAO().
          save(
          site);
    }
    
    public net.javacoding.jspider.core.Agent
      getAgent(
      ) {
        return agent;
    }
    
    public java.net.URL
      getBaseURL(
      ) {
        return baseURL;
    }
    
    public net.javacoding.jspider.core.dispatch.EventDispatcher
      getEventDispatcher(
      ) {
        return eventDispatcher;
    }
    
    public void
      throttle(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.core.throttle.Throttle throttle =
          null;
        throttle =
          (net.javacoding.jspider.core.throttle.Throttle)
            throttles.
              get(
              site.
                getHost());
        if (throttle ==
              null) {
            throttle =
              throttleFactory.
                createThrottle(
                site);
            throttles.
              put(
              site.
                getHost(),
              throttle);
        }
        throttle.
          throttle();
    }
    
    public net.javacoding.jspider.core.rule.Ruleset
      getGeneralSpiderRules(
      ) {
        return generalSpiderRules;
    }
    
    public net.javacoding.jspider.core.rule.Ruleset
      getGeneralParserRules(
      ) {
        return generalParserRules;
    }
    
    public net.javacoding.jspider.core.rule.Ruleset
      getSiteSpiderRules(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.core.rule.Ruleset ruleSet =
          (net.javacoding.jspider.core.rule.Ruleset)
            spiderRules.
              get(
              site);
        if (ruleSet ==
              null) {
            return generalSpiderRules;
        } else {
            return ruleSet;
        }
    }
    
    public net.javacoding.jspider.spi.Rule
      getSiteRobotsTXTRule(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.spi.Rule rule =
          (net.javacoding.jspider.spi.Rule)
            robotsTXTRules.
              get(
              site);
        if (rule ==
              null) {
            rule =
              new net.javacoding.jspider.core.rule.impl.RobotsTXTSkippedRule(
                );
        }
        return rule;
    }
    
    public net.javacoding.jspider.core.rule.Ruleset
      getSiteParserRules(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.core.rule.Ruleset ruleSet =
          (net.javacoding.jspider.core.rule.Ruleset)
            parserRules.
              get(
              site);
        if (ruleSet ==
              null) {
            return generalParserRules;
        } else {
            return ruleSet;
        }
    }
    
    public net.javacoding.jspider.core.storage.Storage
      getStorage(
      ) {
        return storage;
    }
    
    public void
      registerRobotsTXT(
      net.javacoding.jspider.api.model.Site site,
      java.io.InputStream inputStream) {
        try {
            net.javacoding.jspider.core.rule.impl.RobotsTXTRule robotsTxtRule =
              new net.javacoding.jspider.core.rule.impl.RobotsTXTRule(
              defaultUserAgent,
              inputStream);
            ((net.javacoding.jspider.core.rule.Ruleset)
               spiderRules.
                 get(
                 site)).
              addRule(
              robotsTxtRule);
            robotsTXTRules.
              put(
              site,
              robotsTxtRule);
            eventDispatcher.
              dispatch(
              new net.javacoding.jspider.api.event.site.UserAgentObeyedEvent(
                site,
                robotsTxtRule.
                  getObeyedUserAgent()));
        }
        catch (java.io.IOException e) {
            log.
              error(
              "i/o exception while reading robots.txt",
              e);
        }
    }
    
    public void
      registerRobotsTXTError(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.core.rule.impl.RobotsTXTErrorRule robotsTxtRule =
          new net.javacoding.jspider.core.rule.impl.RobotsTXTErrorRule(
          );
        ((net.javacoding.jspider.core.rule.Ruleset)
           spiderRules.
             get(
             site)).
          addRule(
          robotsTxtRule);
        robotsTXTRules.
          put(
          site,
          robotsTxtRule);
    }
    
    public void
      registerRobotsTXTSkipped(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.core.rule.impl.RobotsTXTSkippedRule robotsTxtRule =
          new net.javacoding.jspider.core.rule.impl.RobotsTXTSkippedRule(
          );
        ((net.javacoding.jspider.core.rule.Ruleset)
           spiderRules.
             get(
             site)).
          addRule(
          robotsTxtRule);
        robotsTXTRules.
          put(
          site,
          robotsTxtRule);
    }
    
    public void
      registerNewSite(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.core.model.SiteInternal sitei =
          (net.javacoding.jspider.core.model.SiteInternal)
            site;
        sitei.
          setBaseSite(
          URLUtil.
            getSiteURL(
            baseURL).
            equals(
            site.
              getURL()));
        net.javacoding.jspider.core.util.config.PropertySet siteProps =
          ConfigurationFactory.
            getConfiguration().
            getSiteConfiguration(
            site);
        sitei.
          setUseCookies(
          siteProps.
            getBoolean(
            ConfigConstants.
              SITE_COOKIES_USE,
            true));
        sitei.
          setUseProxy(
          siteProps.
            getBoolean(
            ConfigConstants.
              SITE_PROXY_USE,
            true));
        sitei.
          setObeyRobotsTXT(
          siteProps.
            getBoolean(
            ConfigConstants.
              SITE_ROBOTSTXT_OBEY,
            true));
        sitei.
          setFetchRobotsTXT(
          siteProps.
            getBoolean(
            ConfigConstants.
              SITE_ROBOTSTXT_FETCH,
            true));
        sitei.
          setUserAgent(
          siteProps.
            getString(
            ConfigConstants.
              SITE_USERAGENT,
            defaultUserAgent));
        sitei.
          setHandle(
          siteProps.
            getBoolean(
            ConfigConstants.
              SITE_HANDLE,
            false));
        if (sitei.
              mustHandle()) {
            log.
              info(
              "using userAgent \'" +
              sitei.
                getUserAgent() +
              "\' for site \'" +
              site.
                getURL() +
              "\'");
            if (!siteProps.
                   getBoolean(
                   ConfigConstants.
                     SITE_PROXY_USE,
                   true) &&
                  this.
                    getUseProxy()) {
                log.
                  info(
                  "Using no proxy for " +
                  site.
                    getURL());
                java.lang.String nonProxyHosts =
                  System.
                    getProperty(
                    "http.nonProxyHosts");
                if (nonProxyHosts ==
                      null) {
                    nonProxyHosts =
                      site.
                        getURL().
                        getHost();
                } else {
                    nonProxyHosts +=
                      "|" +
                      site.
                        getURL().
                        getHost();
                }
                System.
                  setProperty(
                  "http.nonProxyHosts",
                  nonProxyHosts);
            } else {
                if (this.
                      getUseProxy()) {
                    log.
                      info(
                      "Using proxy for " +
                      site.
                        getURL());
                }
            }
        } else {
            log.
              info(
              "site " +
              sitei.
                getURL() +
              " must not be handled.");
        }
        spiderRules.
          put(
          site,
          RuleFactory.
            createSiteSpiderRules(
            site));
        parserRules.
          put(
          site,
          RuleFactory.
            createSiteParserRules(
            site));
    }
    
    public boolean
      getUseProxy(
      ) {
        return useProxy;
    }
    
    public java.lang.String
      getUserAgent(
      ) {
        return defaultUserAgent;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1357971813627L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVbe3AcxZnvXcl6Y1mSsR1sbNmIgGB3tTv7tkiIkGUsWNuK" +
       "1kqCYkqMZkfy2LMz\ny0yvvPaB63Lx4ZAqqHMlJJc78jwupK6SXIAKVI6rcC" +
       "TA5UVV7D9wXqSSkCJJBaeSIilILne+r3t6\ntmdmZyU0Krs8u6vZ7v6+3+97" +
       "dPfXs1+8iNaZBtommTF8oiKbsfHilGiYcmlcFU3zENyak55f1zn1\n6O2aHk" +
       "ahAgorJYx6C5I5UhKxOKKURib3jNYMNFjR1ROLqo7ZOA2j7L7mr8e/d+a2rS" +
       "2odxb1KloR\ni1iRxnUNyzU8i3rKcnleNsyxUkkuzaI+TZZLRdlQRFU5CQ11" +
       "bRb1m8qiJuKqIZvTsqmrS6Rhv1mt\nyAaVad8soB5J10xsVCWsGyZGGwpHxS" +
       "VxpIoVdaSgmHi0gNoWFFktmXejU6ilgNYtqOIiNNxUsFGM\n0BFH9pL70LxL" +
       "ATWNBVGS7S6txxQNmNjh7VFHPHQ7NICu7WUZH9Hrolo1EW6gfkslVdQWR4rY" +
       "ULRF\naLpOr4IUjK5qOig06qiI0jFxUZ7DaIu33ZT1FbTqpLSQLhhd6W1GRw" +
       "KbXeWxmcNaB9t6/vfDU28M\nUpu3lmRJJfq3Q6ftnk7T8oJsyJokWx3frMY+" +
       "OnlHdVsYIWh8paex1Wbs2qdmCr9+ZofVZqtPm4Pz\nR2UJz0l/zWy7+vzYLz" +
       "tbiBodFd1UiCu4kFOrTrFvRmsV8OZN9RHJlzH7y/+afuGOv/03+bdh1DGJ\n" +
       "2iRdrZa1SdQpa6Vx9rkdPhcUTbbuHlxYMGU8iVpVeqtNp38DHQuKKhM62uBz" +
       "RcRH6OdaBSHUDlcI\n/ncj698N5AWjgWJFKckGc/bJckWNVTBKaTI+TNxA0k" +
       "vgAIePmrTVYUk35MMKNDrs061GhPUeD4VI\n1HpjTgUH3aer0GdOevSV79wz" +
       "cfv9H7IsSLyOqYmRAIJjXHCMCY4RwTEiONYgGIVCVORmN7XEViUS\nUq89Pr" +
       "rhwaj5ZBi1zKJOpVyuYnFelSEURVXVj8ulOUx9sc/h99TdwFd75sFtQY85FQ" +
       "aiYQJcLhlo\nl9c9eVBPwicRfO78qUvf/93c8SeIJxHLbySjW6qBHY9ZuvUM" +
       "F++87a4P7WohjY63EhNB06GVR5+T\nfvfh/U+89N2Xr+dhgNFQQ3Q29iTR5V" +
       "V/ytAluQTZiw//8b/s+/1H1uW/GkatELKQtLAIrgYZYLtX\nhivKRu2MRciC" +
       "nt0LulEWVfKVnWa68BFDP87vULe5gn7eAAQQ/1wH1yLz03eSF/JlP3kZsJyM" +
       "8OnB\nQPPhmx9si1/4z+7nKSl26ux15NiijK1A7OPmOGTIMtx/+R+nPvLQxT" +
       "Pvp7ZgxsCorVKdVxWpRvXb\nHALbD/gkhdiWjR/92PDDF2xjD/DRxwxDPEFs" +
       "XfvA+as/8d/iJyFhQOCaykmZxmUrldQKnbbI9pAT\n4/utNGMlpXsefuW+4Z" +
       "/98EWWuBwTIm/1m7nT1Sf//pnzYUJxJ0xNonnADiw6NZJPITpdgBmpy5M7\n" +
       "nZTPLit2Exh10J6peBL06QdBZCaNKaVYQZdEdXLPZ5/tPn+2mrnN0uQKR4PJ" +
       "PXO1HS/+6/ClQaoB\nE9jmSI3s7/Yl0TjAQ568CRi9I0jC2Z0RIkI+mopj1D" +
       "4vmvLMdIGaaSNGPdQAJJnYN0csjLs5xhS9\nnyQvo2vQICVEs0nwMnlJ1vAe" +
       "xYS0Kx2B5QLTJLVcRiux5rEJn85M4zGucZprfAtG7wyqcTYdTcQz\noDKJRI" +
       "xVea9IMsSJt6Sy3Sd2yKczU3kfVznDVZ7E6OagKifiuWhCAJrbTRAGCwlb1x" +
       "uX05W1jRWt\ndzuIyWuEfo6S5EIDEFHFd7EmJMd7p7C9ZFlmJ8jy/N/86Zuf" +
       "6hq0Ap702UaH6YO42eqMY1evOenu\nkw8nzxffq1gB5F2weBqf/PrMp958Ef" +
       "+UZjOeg4m0nbVGBd8jOqaH3EtLfW1f+XQ5jNpn0Qa66BQ1\n/B5RrZJcNwt5" +
       "wBxnNwsQyM7v3UtAK8WM1ueYbd787xDrzf58bofP7pTDE/56uK6CK8ISfsST" +
       "8EOI\nJolZ2mGIvl5XT8+dFXBC0E8u1TBaBzbWsNMR77IdMZnLeTKaxfWed+" +
       "Wf/eXFf1feoFmriy69x0gH\npnUnvePIpC16xSSLPMcug400dLBijlKpKcwy" +
       "cD6ezQSN00QyF0mkowIkt65D+yaLMQqODC/aSE/B\nerIREdGDUYn6qZutp8" +
       "mQWDM2oVXLzi9hydU6PTG2xw6nncuF05itQS9tPtNgwigbOepvQp28HPYk\n" +
       "a2Ypg1sqT+/P10lMkAQfjERBSEVS6WgaZpgeSiKTTASYXBHy5zHykmuGLsYu" +
       "ZL83ojvB0PlOBAzl\nPXWU+bgXZSIfGGU8GUkIUSGL0UaK0qMBEXRvo2J11D" +
       "cvh3qEoR7xR/1BG7XfXMJQ38dRJzyo47ng\nAZJORYRkNJmzUXs0IILONCpW" +
       "R723GeptcMUZ6rg/6gcY6k57cNOJ9x84XqEBby443jS1MqzS1rvw\nUhFnnc" +
       "pQjHZIX8HXovvFSjPQ2+FKMNAJf9CfYKC7LXWnqx7YD3PYSQ9sIZ0JusKCrh" +
       "GY+yE4NlDU\nDuFExifd+tSt+/HlgAoMqOAP9F9soBVSKWoE+nkONNUANB8c" +
       "aNYF1CGcyHjUrc/KQHfClWRAk/5A\nv8SArjf0eR2bh953qAHrVzjWtDdjkd" +
       "ALiDWRA6wCpOUBitUtn4h5rEGrt2baFEOc8kf8lD0FOZeR\nDOp/cKgZL9R4" +
       "4OScyKfpPF6fgphkIuBprkgd3f5m6IbgSjN0aX90zzJ0XZKuH1PkGYh5J8Dn" +
       "OMCs\nNy9lA8+xiWQyIqSjyTTkWgqQCycynnep48pM8eUWGzRhHcG4Eht39f" +
       "ajhtSyMoyajD81LzJqNopV\nfASmQUWipVurwOkk6fucpJyXpHTw5C0IkUw6" +
       "mgOS3mat5nzUINLONVHRRdwGvqDj3/oRQxZiWUZM\n1p+YHzJiNlVNecrQay" +
       "fGXNK9+5kpQynDdn6J1VS/Ovt6vPTqjXus/cwWZ63e2XCfcEkeGvj1762d\n" +
       "jLs64bMP8gg5u/2RV594ZXqjVeqyqtvXNBSYnX2sCje1Z0+lBhh2LieBtn7u" +
       "xp1fPDX903kLSb+7\nmEiWzelP/0AefleP5FO1bJ/XdVWG/RNqo9gSzeyxA6" +
       "4cs0fO3x6vMnt02PYgf/+s2YDDcOXZgHn/\nAX/DBuyH1btsiGrRf/Z+jfu9" +
       "dwEezwf3+2wikshHk7A03Uz9vlEJIuuir3oun79+uWRhQPMY7SM3\n3aAQqn" +
       "Yzqnb7U/UnD1VT/vP/m7y80bCKj2cDU5XL+VI15Z70/+yrXn36eL0Z/LfDNc" +
       "rgj/rDv8Tg\nbyjJC2JVxTMw+phnSx0Kc/DexbyQCbyYFzJ0lkzC4vZKCt6r" +
       "AhHd4qNaHfiFZsA3wXUTA36TL/BQ\nJwPeourOuSDUw7F6F/JCKhkYa5pu1x" +
       "IwF3RQrCCVSLvCUsDl9dct5/XQeJHcLFideqlzvp1VsMhr\nxFGZCjmBbea7" +
       "7WzFljW8nCwXEJJRr252Qkez6Zn3/aHnPvG5O8OssPYLsj3RK1EV9qAqr7F5" +
       "B9lP\nDyTtclLve3f8fG/m0Xu9RbaN5IDJOSm5u81Jz375mR+nf/Cj05CqZ1" +
       "H7gYPF8bHCBGT1HcuKm5P6\nlra+u+WI8i1aDGL1roZjVHenUXeVq8uQcdXQ" +
       "DrlqXYOuw41r4VKYPyoef6RmdFjRU6oMNVpyuO6i\nQqJeag3dEDgJxdN0MZ" +
       "exa0xkyPKKhdPQtaAG5F6eLX5SsTr9HKPWJZ2czFtTYxyR26FddUq2wLUH\n" +
       "LrssVfajpLH2FyafAXyPeUKTYN+rKSflkr+eYauDk7WbOGsCZ+0dwVnLR1Lx" +
       "aAo2Ca2mguvF6Wub\nRJRYUWJlvSSrsSJpbaCNjoUTPTAiDnT6+O0Xr9/2xj" +
       "+HUXiZIx2fw/L6CHPS4y1Dfwg/vWmIHuO1\nknIXdUvvUwaNDxG4ng2gRuiu" +
       "myzJFhvNTOZk+lbOdLKyUlbjvFhrfl/HnyHD7rVTd8HHNcB3FxRN\npNuF4R" +
       "p4nipri/iI1y9bALTtlmky1kTN12dA4QG+4B5XdU0mB8j2d9bBrqLH6s+EwJ" +
       "c1P9VDuyzV\nqazmUW7H1YpB934AKhF1fPYFVtke1ewJKxHP5binS2vx9HQi" +
       "moFFSru1qzNX1hMmui5IDtymoYQ3\nC5DESE567cq1ubrE6BPiGnc8ftAX0g" +
       "MDT0BizETTcbqd1TQgl+yOGPGbnMeN4+6vmT5Vrg8/xgst\nrUWftBDNJFjK" +
       "IYONrWyKo/TIRN4naiX6oIi/JW6G6zSzxOk1W+IDHHmWI/+74PUGISJko+mE" +
       "yxJk\nSOciPXQfl+pw/DNrkZpORjPC6vi+F5Ss6CZegfCtcN3PCL9/dYS/5W" +
       "zxIBCy6JyiGVEPcaLynKiP\nBScqG0kk6GFEny3uOnPQWheR4cvNCHiAEfDA" +
       "ZSLgn8AWoNEtDYdPoc/WKUjGOQWfC0xBKmFTMMAF\nukjI+ZFAjljOMhLOXi" +
       "YSPk+3j7j58wahL3EyHCvKLwcnI03ISAEZWxsFu0i52Y+Ua+B6iJHy0OpI\n" +
       "8VkuP8nBORZ+TwUHl6fL5dTqssLjoIV9WNM0J5Bz8M8w4J+5TN7wddhug1Fu" +
       "Xa4yFHqec+aYuV4I\nzFkmTh0CONvuK9vlE683o+YRRs0jl4ma77io8a8Ehc" +
       "5xaviDLqHzwalJ+VDjkL0yNeTA8guMmi+s\nOVx+xPE5JtEfB8eXiyRzNBes" +
       "JlxesnIW2Ss1cdFfcD0dS4xX1qInsUPOylkewSsbgSTyx5gRHluz\nEX5bB5" +
       "dy5KzXgpdks5FkNprKrM4Iv4KdDuNiuuFcjmn6OtfUMXX8cS2asqnjaj/RdU" +
       "PYy/AdTfaV\n8Earw80C5mvMVl9bs63+jzPgcMRLwWvC6SAB8xceMP6JK9zG" +
       "9eSJK9y+Fj09AbOqrEXORb7BjPCN\ny5PQw93W8q/YcPAb7q+TkebLv/BA8B" +
       "NfmsVJLXuAC3SRsN+PhAm4XmAkvLA6Ehp3XeGtHBSPxfC2\n4KAgdaeipOrN" +
       "PdEpb5DL41kqvHMt8lLpaAY8qlvRKlWg0ZDFsh3pA3bRZZJ/t7ILbIY9iSEv" +
       "KiYG\nz7Qzyd3NFmDkMZhzzB7n1poZwjHOD59KwyPBn/nKR5J5GnGryAzhGz" +
       "Da1MDAhGHoRlMaSLXvAqPh\nwppp4M9fZxxuMhqYhkQ6kkrQssxqaIC5b0sD" +
       "DcVjSqUil5oSQZ4yeJkR8fKaidjLiXBk4FuDP+mY\niCSFaGp19aDwLRj12k" +
       "QckI8XWU9f/IOAoNWCb71fhiR9AMIdcuaM8+y7mS4dTJeOy6TLDEY9li4N\n" +
       "p6Dhw3XrZR3Z9c7gx5/WlCFYm466SNekcYFUc/saupPfm2xp+Imj9UM8adf5" +
       "u67/ZqXv21b93/6x\nXEcBdSxUVdX5eLbjc1vFkBcUymOH9bC2BVrCaHCl32" +
       "eB+5E3wkl43uq2AIuCZbpBD/Lm7KFAlvLv\ngVE7++RsD1LXu9vDXM//cDbV" +
       "MWrR6EMC4Qo9QBBr7PzFfoy6WJElhfzYpfa5p1vf/eC5/6Gnge2S\nxTj5Ca" +
       "RkjiwpEGQjY5qonjDpk/TkO/KDMalqGGA4ehrK6Ow2rRGtnzxudT46Xpc1dO" +
       "iOqQnv0+NC\nJr3G83RyxtxKzpiD/bTulIHe5scM1ZZlQvoYOdH7KBP1/zM0" +
       "VLi4OwAA");
}
