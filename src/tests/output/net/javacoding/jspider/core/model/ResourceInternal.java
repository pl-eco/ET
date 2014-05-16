package net.javacoding.jspider.core.model;

import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.exception.InvalidStateForActionException;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.URLUtil;

import et.util.MyUtility;
import java.io.InputStream;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.util.*;

import et.util.MyUtility;

public class ResourceInternal
  implements net.javacoding.jspider.api.model.ParsedResource,
             net.javacoding.jspider.api.model.ParseErrorResource,
             net.javacoding.jspider.api.model.ParseIgnoredResource,
             net.javacoding.jspider.api.model.ForbiddenResource,
             net.javacoding.jspider.api.model.FetchIgnoredResource,
             net.javacoding.jspider.api.model.FetchErrorResource
{

    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected int
      site;
    protected java.net.URL
      url;
    protected java.util.Date
      discoveryTime;
    protected net.javacoding.jspider.core.model.FolderInternal
      folder;
    protected int
      state;
    protected int
      id;
    protected int
      httpStatus;
    protected int
      size;
    protected int
      timeMs;
    protected java.lang.String
      mimeType;
    protected java.util.Date
      fetchTime;
    protected HTTPHeader[]
      headers;
    protected net.javacoding.jspider.api.model.Decision
      spiderDecision;
    protected net.javacoding.jspider.api.model.Decision
      parseDecision;
    
    public ResourceInternal(net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                            int id,
                            int siteId,
                            java.net.URL url,
                            java.util.Date discoveryTime,
                            net.javacoding.jspider.core.model.FolderInternal folder) {
        super();
        this.
          site =
          siteId;
        this.
          storage =
          storage;
        this.
          id =
          id;
        this.
          url =
          url;
        this.
          discoveryTime =
          discoveryTime;
        this.
          folder =
          folder;
        this.
          state =
          Resource.
            STATE_DISCOVERED;
    }
    
    public ResourceInternal(net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                            int id,
                            net.javacoding.jspider.api.model.Site site,
                            java.net.URL url,
                            java.util.Date discoveryTime,
                            net.javacoding.jspider.core.model.FolderInternal folder) {
        this(storage,
             id,
             ((net.javacoding.jspider.core.model.SiteInternal)
                site).
               getId(),
             url,
             discoveryTime,
             folder);
    }
    
    public ResourceInternal(net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                            net.javacoding.jspider.api.model.Site site,
                            java.net.URL url,
                            java.util.Date discoveryTime,
                            net.javacoding.jspider.core.model.FolderInternal folder) {
        this(storage,
             0,
             site,
             url,
             discoveryTime,
             folder);
    }
    
    public void
      setFetched(
      int httpStatus,
      int size,
      int timeMs,
      java.lang.String mimeType,
      java.util.Date fetchTime,
      HTTPHeader[] headers) {
        if (state !=
              Resource.
                STATE_DISCOVERED) {
            LogFactory.
              getLog(
              net.javacoding.jspider.api.model.Resource.class).
              error(
              "error in state transition for resource " +
              url +
              ":\n" +
              this);
            throw new net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException(
              ("cannot set resource fetched - it\'s not in the discovered st" +
               "ate - was ") +
              state);
        }
        this.
          httpStatus =
          httpStatus;
        this.
          size =
          size;
        this.
          timeMs =
          timeMs;
        this.
          mimeType =
          mimeType;
        this.
          fetchTime =
          fetchTime;
        this.
          headers =
          headers;
        state =
          Resource.
            STATE_FETCHED;
    }
    
    public void
      setFetchError(
      int httpStatus,
      HTTPHeader[] headers) {
        if (state !=
              Resource.
                STATE_DISCOVERED &&
              state !=
              Resource.
                STATE_FETCH_ERROR) {
            LogFactory.
              getLog(
              net.javacoding.jspider.api.model.Resource.class).
              error(
              "error in state transition for resource " +
              url +
              ":\n" +
              this);
            throw new net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException(
              ("cannot set resource fetch error - it\'s not in the discovere" +
               "d state - was") +
              state);
        }
        this.
          httpStatus =
          httpStatus;
        this.
          headers =
          headers;
        state =
          Resource.
            STATE_FETCH_ERROR;
    }
    
    public void
      setParseError(
      ) {
        if (state !=
              Resource.
                STATE_FETCHED &&
              state !=
              Resource.
                STATE_PARSE_ERROR) {
            LogFactory.
              getLog(
              net.javacoding.jspider.api.model.Resource.class).
              error(
              "error in state transition for resource " +
              url +
              ":\n" +
              this);
            throw new net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException(
              ("cannot set resource parse error - it\'s not in the fetched s" +
               "tate - was ") +
              state);
        }
        state =
          Resource.
            STATE_PARSE_ERROR;
    }
    
    public void
      setParsed(
      ) {
        if (state !=
              Resource.
                STATE_FETCHED &&
              state !=
              Resource.
                STATE_PARSED) {
            LogFactory.
              getLog(
              net.javacoding.jspider.api.model.Resource.class).
              error(
              "error in state transition for resource " +
              url +
              ":\n" +
              this);
            throw new net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException(
              ("cannot set resource parsed - it\'s not in the fetched state " +
               "- was ") +
              state);
        }
        state =
          Resource.
            STATE_PARSED;
    }
    
    public void
      setFetchIgnored(
      ) {
        if (state !=
              Resource.
                STATE_DISCOVERED &&
              state !=
              Resource.
                STATE_FETCH_IGNORED) {
            LogFactory.
              getLog(
              net.javacoding.jspider.api.model.Resource.class).
              error(
              "error in state transition for resource " +
              url +
              ":\n" +
              this);
            throw new net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException(
              ("cannot set resource fetch_ignored - it\'s not in the discove" +
               "red state - was ") +
              state);
        }
        state =
          Resource.
            STATE_FETCH_IGNORED;
    }
    
    public void
      setParseIgnored(
      ) {
        if (state !=
              Resource.
                STATE_FETCHED &&
              state !=
              Resource.
                STATE_PARSE_IGNORED) {
            LogFactory.
              getLog(
              net.javacoding.jspider.api.model.Resource.class).
              error(
              "error in state transition for resource " +
              url +
              ":\n" +
              this);
            throw new net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException(
              ("cannot set resource parse_ignored - it\'s not in the fetched" +
               " state - was ") +
              state);
        }
        state =
          Resource.
            STATE_PARSE_IGNORED;
    }
    
    public void
      setForbidden(
      ) {
        if (state !=
              Resource.
                STATE_DISCOVERED &&
              state !=
              Resource.
                STATE_FETCH_FORBIDDEN) {
            LogFactory.
              getLog(
              net.javacoding.jspider.api.model.Resource.class).
              error(
              "error in state transition for resource " +
              url +
              ":\n" +
              this);
            throw new net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException(
              ("cannot set resource forbidden - it\'s not in the discovered " +
               "state - was ") +
              state);
        }
        state =
          Resource.
            STATE_FETCH_FORBIDDEN;
    }
    
    public int
      getId(
      ) {
        return id;
    }
    
    public void
      setInt(
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
      getFileName(
      ) {
        return URLUtil.
                 getFileName(
                 url);
    }
    
    public java.net.URL
      getURL(
      ) {
        return url;
    }
    
    public net.javacoding.jspider.api.model.Site
      getSite(
      ) {
        return folder.
                 getSite();
    }
    
    public net.javacoding.jspider.api.model.Folder
      getFolder(
      ) {
        return folder;
    }
    
    public java.lang.String
      getName(
      ) {
        return url.
                 getFile();
    }
    
    public java.util.Date
      getDiscoveryTime(
      ) {
        return discoveryTime;
    }
    
    public Resource[]
      getReferers(
      ) {
        return storage.
                 getResourceDAO().
                 getRefereringResources(
                 this);
    }
    
    public Resource[]
      getReferencedResources(
      ) {
        if (state !=
              Resource.
                STATE_PARSED) {
            throw new net.javacoding.jspider.core.storage.exception.InvalidStateForActionException(
              "cannot get referenced resources if not parsed");
        }
        return storage.
                 getResourceDAO().
                 getReferencedResources(
                 this);
    }
    
    public int
      getHttpStatus(
      ) {
        if (state ==
              Resource.
                STATE_DISCOVERED) {
            throw new net.javacoding.jspider.core.storage.exception.InvalidStateForActionException(
              "cannot get http status for a resource that\'s not fetched");
        }
        return httpStatus;
    }
    
    public int
      getHttpStatusInternal(
      ) {
        return httpStatus;
    }
    
    public void
      setHttpStatus(
      int status) {
        this.
          httpStatus =
          status;
    }
    
    public HTTPHeader[]
      getHeaders(
      ) {
        return headers;
    }
    
    public int
      getTimeMs(
      ) {
        if (state <
              Resource.
                STATE_FETCHED) {
            throw new net.javacoding.jspider.core.storage.exception.InvalidStateForActionException(
              "cannot get timing for non-fetched resource");
        }
        return timeMs;
    }
    
    public int
      getTimeMsInternal(
      ) {
        return timeMs;
    }
    
    public int
      getSize(
      ) {
        if (state <
              Resource.
                STATE_FETCHED) {
            throw new net.javacoding.jspider.core.storage.exception.InvalidStateForActionException(
              "cannot get size for non-fetched resource");
        }
        return size;
    }
    
    public int
      getSizeInternal(
      ) {
        return size;
    }
    
    public java.lang.String
      getMime(
      ) {
        if (state <
              Resource.
                STATE_FETCHED) {
            throw new net.javacoding.jspider.core.storage.exception.InvalidStateForActionException(
              "cannot get mime type for non-fetched resource");
        }
        return mimeType;
    }
    
    public java.lang.String
      getMimeInternal(
      ) {
        return mimeType;
    }
    
    public java.util.Date
      getFetchTime(
      ) {
        if (state <
              Resource.
                STATE_FETCHED) {
            throw new net.javacoding.jspider.core.storage.exception.InvalidStateForActionException(
              "cannot get fetch time for non-fetched resource");
        }
        return fetchTime;
    }
    
    public java.util.Date
      getFetchTimeInternal(
      ) {
        return fetchTime;
    }
    
    public java.lang.String
      toString(
      ) {
        java.lang.StringBuffer sb =
          new java.lang.StringBuffer(
          );
        sb.
          append(
          url.
            toString());
        sb.
          append(
          "\n  STATUS : ");
        sb.
          append(
          this.
            translateState(
            state));
        sb.
          append(
          "\n  ");
        sb.
          append(
          "\n  SPIDER DECISION : ");
        net.javacoding.jspider.api.model.Decision sd =
          this.
            getSpiderDecision();
        if (sd ==
              null) {
            sb.
              append(
              "\n  ");
            sb.
              append(
              "[Not yet taken]");
        } else {
            DecisionStep[] steps =
              sd.
                getSteps();
            for (int i =
                   0;
                 i <
                   steps.
                     length;
                 i++) {
                net.javacoding.jspider.api.model.DecisionStep step =
                  steps[i];
                sb.
                  append(
                  "\n  ");
                sb.
                  append(
                  step.
                    toString());
            }
        }
        sb.
          append(
          "\n  ");
        sb.
          append(
          "\n  PARSE DECISION : ");
        net.javacoding.jspider.api.model.Decision pd =
          this.
            getParseDecision();
        if (pd ==
              null) {
            sb.
              append(
              "\n  ");
            sb.
              append(
              "[Not yet taken]");
        } else {
            DecisionStep[] steps =
              pd.
                getSteps();
            for (int i =
                   0;
                 i <
                   steps.
                     length;
                 i++) {
                net.javacoding.jspider.api.model.DecisionStep step =
                  steps[i];
                sb.
                  append(
                  "\n  ");
                sb.
                  append(
                  step.
                    toString());
            }
        }
        sb.
          append(
          "\n");
        switch (state) {
            case STATE_DISCOVERED:
                break;
            case STATE_FETCH_ERROR:
                sb.
                  append(
                  "  HTTP Status: ");
                sb.
                  append(
                  this.
                    getHttpStatus());
                Resource[] referers =
                  this.
                    getReferers();
                sb.
                  append(
                  "\n  REFERERS: " +
                  referers.
                    length);
                for (int i =
                       0;
                     i <
                       referers.
                         length;
                     i++) {
                    net.javacoding.jspider.api.model.Resource referer =
                      referers[i];
                    sb.
                      append(
                      "\n    ");
                    sb.
                      append(
                      referer.
                        getURL());
                }
                break;
            case STATE_FETCH_IGNORED:
                break;
            case STATE_FETCH_FORBIDDEN:
                break;
            case STATE_FETCHED:
                sb.
                  append(
                  "  HTTP Status: ");
                sb.
                  append(
                  this.
                    getHttpStatus());
                sb.
                  append(
                  ", Content size: ");
                sb.
                  append(
                  this.
                    getSize());
                sb.
                  append(
                  ", Mime Type: ");
                sb.
                  append(
                  this.
                    getMime());
                sb.
                  append(
                  ", Fetch time: ");
                sb.
                  append(
                  this.
                    getTimeMs());
                break;
            case STATE_PARSE_ERROR:
                break;
            case STATE_PARSE_IGNORED:
                break;
            case STATE_PARSED:
                sb.
                  append(
                  "  HTTP Status: ");
                sb.
                  append(
                  this.
                    getHttpStatus());
                sb.
                  append(
                  ", Content size: ");
                sb.
                  append(
                  this.
                    getSize());
                sb.
                  append(
                  ", Mime Type: ");
                sb.
                  append(
                  this.
                    getMime());
                sb.
                  append(
                  ", Fetch time: ");
                sb.
                  append(
                  this.
                    getTimeMs());
                referers =
                  this.
                    getReferers();
                sb.
                  append(
                  "\n  REFERERS: " +
                  referers.
                    length);
                for (int i =
                       0;
                     i <
                       referers.
                         length;
                     i++) {
                    net.javacoding.jspider.api.model.Resource referer =
                      referers[i];
                    sb.
                      append(
                      "\n    ");
                    sb.
                      append(
                      referer.
                        getURL());
                }
                if (state ==
                      STATE_PARSED) {
                    Resource[] references =
                      this.
                        getReferencedResources();
                    sb.
                      append(
                      "\n  REFERENCES: " +
                      references.
                        length);
                    for (int i =
                           0;
                         i <
                           references.
                             length;
                         i++) {
                        net.javacoding.jspider.api.model.Resource reference =
                          references[i];
                        sb.
                          append(
                          "\n    ");
                        sb.
                          append(
                          reference.
                            getURL());
                    }
                    EMailAddress[] emails =
                      this.
                        getEmailAddresses();
                    sb.
                      append(
                      "\n  E-MAIL ADDRESSES: " +
                      emails.
                        length);
                    for (int i =
                           0;
                         i <
                           emails.
                             length;
                         i++) {
                        net.javacoding.jspider.api.model.EMailAddress email =
                          emails[i];
                        sb.
                          append(
                          "\n    ");
                        sb.
                          append(
                          email.
                            getAddress());
                    }
                } else {
                    sb.
                      append(
                      ("\n  EMAIL ADDRESSES and REFERENCES not known [Resource not p" +
                       "arsed]"));
                }
                break;
        }
        sb.
          append(
          "\n");
        return sb.
                 toString();
    }
    
    protected java.lang.String
      translateState(
      int state) {
        switch (state) {
            case Resource.
                   STATE_DISCOVERED:
                return "DISCOVERED";
            case Resource.
                   STATE_FETCH_ERROR:
                return "FETCH_ERROR";
            case Resource.
                   STATE_PARSE_ERROR:
                return "PARSE_ERROR";
            case Resource.
                   STATE_FETCHED:
                return "FETCHED";
            case Resource.
                   STATE_FETCH_FORBIDDEN:
                return "FETCH_FORBIDDEN";
            case Resource.
                   STATE_FETCH_IGNORED:
                return "FETCH_IGNORED";
            case Resource.
                   STATE_PARSE_IGNORED:
                return "PARSE_IGNORED";
            case Resource.
                   STATE_PARSED:
                return "PARSED";
            default:
                return "?!? UNKNOWN STATE ?!?";
        }
    }
    
    public java.io.InputStream
      getInputStream(
      ) {
        return storage.
                 getContentDAO().
                 getInputStream(
                 id);
    }
    
    public void
      setBytes(
      byte[] bytes) {
        storage.
          getContentDAO().
          setBytes(
          id,
          bytes);
    }
    
    public java.util.Date
      getFetchTimeStamp(
      ) {
        return fetchTime;
    }
    
    public java.lang.String
      getStateName(
      ) {
        return this.
                 translateState(
                 state);
    }
    
    public net.javacoding.jspider.api.model.Decision
      getSpiderDecision(
      ) {
        return storage.
                 getDecisionDAO().
                 findSpiderDecision(
                 this);
    }
    
    public net.javacoding.jspider.api.model.Decision
      getParseDecision(
      ) {
        return storage.
                 getDecisionDAO().
                 findParseDecision(
                 this);
    }
    
    public void
      setState(
      int state) {
        this.
          state =
          state;
    }
    
    public void
      setMime(
      java.lang.String mime) {
        this.
          mimeType =
          mime;
    }
    
    public void
      setTime(
      int ms) {
        this.
          timeMs =
          ms;
    }
    
    public void
      setSize(
      int size) {
        this.
          size =
          size;
    }
    
    public int
      getSiteId(
      ) {
        return site;
    }
    
    public ResourceReference[]
      getOutgoingReferences(
      ) {
        return storage.
                 getResourceDAO().
                 getOutgoingReferences(
                 this);
    }
    
    public ResourceReference[]
      getIncomingReferences(
      ) {
        return storage.
                 getResourceDAO().
                 getIncomingReferences(
                 this);
    }
    
    public EMailAddress[]
      getEmailAddresses(
      ) {
        return storage.
                 getEMailAddressDAO().
                 findByResource(
                 this);
    }
    
    public EMailAddressReference[]
      getEmailAddressReferences(
      ) {
        return storage.
                 getEMailAddressDAO().
                 findReferencesByResource(
                 this);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1360121340052L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVcDXBc1XW+b9f6tfwn/9uyLdvCxqBd7f8PLo5VS4ply7Yi" +
       "CYwVM/LT7pO0sH+8\nvSvLrusxEwdcmkkgcQidmp923JBJ3MLEATpAIQTSQB" +
       "u3icsQtxkgqZk0geKSYTImTVr33J+37+7b\n93a9T12GXa3fvnfOd75z7rnn" +
       "nvvenvsQ1eVU1BbLufGRrJJz7xgelNWcEt+RlHO5ETg0Fvt+XdPg\nk7vTGQ" +
       "eSBpAjEcdowUAs1xWXsdyViHf192ydUVF7NpM8MpnMYC6nRMotG39/+If371" +
       "rtRAtG0YJE\nehjLOBHbkUljZQaPopaUkhpX1Fx3PK7ER9GitKLEhxU1IScT" +
       "R+HETHoUteYSk2kZ51UlN6TkMslp\ncmJrLp9VVKpTOziAWmKZdA6r+RjOqD" +
       "mMFg7cJU/LXXmcSHYNJHJ46wCqn0goyXjuHnQcOQdQ3URS\nnoQTlw1oVnRR" +
       "iV195Dic3pwAmOqEHFO0S+bcnUgDE+uMVxQs7tgNJ8ClDSkFT2UKquakZTiA" +
       "Whmk\npJye7BrGaiI9CafWZfKgBaNVlkLhpMasHLtbnlTGMFphPG+QfQVnNV" +
       "FayCUYLTWeRiWBz1YZfCZ4\na199y/88MHi1nfp8TlyJJQn+BrhoreGiIWVC" +
       "UZV0TGEXfpJ3n+4/kG9zIAQnLzWczM7pvuG52wZ+\n+fI6ds5qk3P2jd+lxP" +
       "BY7PehtjUXu99rchIYjdlMLkFCochy6tVB/s3WmSxE87KCRPKlW/vyu0N/\n" +
       "f+DEN5UPHKixH9XHMsl8Kt2PmpR0fAf/3ACfBxJphR3dNzGRU3A/mpOkh+oz" +
       "9N9Ax0QiqRA66uFz\nVsZT9PNMFiHUAC8J/j+P2H/LyBt4m4RmXo0p/SSM0n" +
       "LSncUokFbwQRIFsUwc/H/wrlw2EVfUg7GM\nqhxMZeJK8mDpZTNE14LDkkQG" +
       "rXHIJSE+d2aSIGQs9uTlfzjWu/tPTjEHkqDjKDHygWK3rtjNFbuJ\nYjdV7D" +
       "YqRpJEVS4vZpa4Kk5G1H9+e+vCL7pyzzqQcxQ1JVKpPJbHkwqMRDmZzBxW4m" +
       "OYhuIiIexp\ntEGotoxD1AKOsSQIoqMEqJxW0QZjdOpjuh8+yRByF49f+9GV" +
       "scPnSSARxy8h0hk0cOPdDFvLluE7\ndx06tcFJTjo8BxzihFM7Kksfi115YM" +
       "/5t/7x7Rv1UYBRR8ngLL2SDC4j/EE1E1PikLx08V/7750f\nfaUu+owDzYER" +
       "CzkLyxBpkADWGnUUDbKtWsIiZMGVcycyakpOkq+0LNOMp9TMYf0IDZt59PNC" +
       "IGAu\nvOrgFeJh6iJv5MtW8raYBRnh02ADTYeffK7e85MX536fkqJlzgVCih" +
       "1WMBuHi3R3jKiKAsfffmTw\nK1/98P7PUl8wZ0gY1Wfz48lEbIbiWy6B7xeb" +
       "5AT3iiWnH95y5ieasxfr0rtVVT5CfD1z78U1f/YD\n+VHIFzBuc4mjCh2W9V" +
       "RTPVy0QtFE9u7Yw7IMy0nHzly+b8vP/vUCz1vCfKif9auxk/lnP//yRQeh\n" +
       "uAlmJjm3VxtYdGYknyQ6W4AbaciTI02Uz2Y2dr2YXxn0eT0AqBU0kZnUnYi7" +
       "BzIxOdnf8xevzL34\nUD60i0GZJ5zQ3zM2s+7CX2251k4hcI31Qmrk/26Ylt" +
       "W9+pgnf3wY3Won49wSCHb6Iq5ACKOGHMQ4\nzC/UT0sqJBJ+rhuOuYfZ5+HB" +
       "frB4teiCQTWRAuDTfPZ4ZvRjT/wXN/cw01eIVYl44k7fNaVj8S8/\noiFocI" +
       "TJFGVQ8tDas784f3loCRvVbB7fWDKVitewuZz6ryU7AzasL6eBnv3azevPHR" +
       "96Z5xZ0lqc\nN3vT+VTw8UvKlu0tMZME7YRqA0YFCxNydBtlvItFUI8QQV76" +
       "hZ+89c7Cv6GIKxwEvXk1qfm2hY4u\n4uDbhgZE9bsF9T5d/cAs1IfDriionx" +
       "dP5GKZaUU9MpJIFYJsvj7Me2SsiFCGBCh+HcowRtvsQomG\nXV5vBMifoPOo" +
       "BsJTecrsoxdo0rRcRt476WeaY2keQhT8Bnp0bUlOvoXn5IhZTiZvm0xFaylO" +
       "oGdM\noCeg03PIrqeCIWMiIOIiJQEaF/QGdb3KLPQGQ64QRAhkdFwIjBssfC" +
       "JDwmEuGU4Ux8vdArCQDiw5\nC2ChsCscYCOHiOoX1WUFdWFd3T2zUBcOuaIB" +
       "40ghQgdFxXlBcURXPG13XIDiaAjGRbgwLoi4/ZVj\n/LMWMb6Nx/gfVBfjdV" +
       "R0nWjqCd1Un0c39V67HIc8pjEuqvy8oFLIv/fNQmUg4gqGeXgTWQlR3wOC\n" +
       "PiHh/uks9AWjrlDIImq/JKgTkuqDs1AH00skVDFqTwuKhXT1VbtRC4ojEZfX" +
       "E602ao/xU8gixLjG\n6iNtA62CT43/0W9efay5nVWk5Jo2KmaBscopumosds" +
       "/RM/6Lw/sTrDYwViuGk4++dNtjn1zA77Ba\np7BIINrWz5QCvF0W1i+Rt6YX" +
       "1T/9eMqBGkbRQtoUkdP4djmZJ8X4KBSquR384AAUmuL3xS0KVgNv\nLSyC2o" +
       "zlkqDWuDzRaxv4XFwT6yuS+fBaD68VPDOsMGQGCdEi9iy9oIO+by6sH5qyag" +
       "YDPiU+YyhS\neWh9Uw8tj9dQdDO6e7ZHX3nvw6cSV2lh3Uy7Q93kCg68iR4R" +
       "qn1nJpsjfQihEcYldezL5litCJm6\nmar1BvyRsO2qxO/v9AZdPijgW0Z29g" +
       "+7hcT0Ld3e4ypaVmoWAcMpRa003Fg9RbxKy1DxS5iw5gz1\ndvcUpvUF1PzH" +
       "i7y0HF6r+EWrzL30HHn7upDPtlkJI/2RNi6szVzY81xYoTjlPv07wacsLZ7T" +
       "6fb6\ng3bp9gU8nd6IywcLtUZKN0+SL+n58hmaNK1sImG8htu0xtym17hNJh" +
       "Uvt+4HgnV+o3WegMeudd6Q\nlwYTlLit1LqSnPy6WaKmFg9aWdwBr7Xc4rXm" +
       "Fv8Tt1isq7mpPxZMDZSY6g/ZNjXIxg04ci41VZ8E\nLhZNCdS4/VbGkUy0jh" +
       "u3zty4S9y4OkiAFQJ+KbzaubR2c2k/5dL46t5SFImtDVzUBnNR73BRzVMY\n" +
       "Z0nDPZ8rK5KM7Y1c5EZzkT/Xx/bR8qau5JGBtL+lwt7TogJDnO0pj40E1g1c" +
       "3A3m4v6Di2tMgbhC\n84uH2ftCmAWNYeYPBWyvXz3BTpYu5tEo03QTDR8IWI" +
       "6TA+chX+8f6h8Z6d2rLWMW6vmYbQSU8/cm\nTsAmcwJ+wwlomlBwbMqYUz4R" +
       "GAiVMBCI2B1o/kiQDjSgcD4baJp2ouO3IpzKuYSE3WZu5WZzK69x\nKxumFJ" +
       "nkEtKoFDpFtBlIGD95ePeHN7Zd/XMHcpRp15nsgxQkjMW+7ez4teOFZR20RT" +
       "tnXM6x6sW4\ngVS6P1S07UPpn1uSVqzsFJwm1QtOC2e1oLm54tp358jI4E7K" +
       "TzYrLESjnpIMG7afYaPe4sqEO4Tg\nbtb9U3C6mb9JJG/hPGwx9be0kPt7Pg" +
       "PVo8QSuQTUqgJLiwWWIgWWtlRkSZNlhY4kmps4upvM0S3X\n5vIs2fE0A7dK" +
       "ABel1yyl+mhU8JUuFdwprCHETo60tiDBGw0WzOuqaB7bhNU8J0rcIEgMFST6" +
       "r09i\nr6pmVDOpmwSperAGr09q/2Qaos0U7U2CXN29Vu1nXW5fRh1PxONK2k" +
       "yoWxAarQJsH0lmZcD6BHd7\nqqCWyi2ilnSa11jt0dIu8/13/LrlPvm1Ox18" +
       "6boddONM1pVUppWkvoo1CtlDc5O2YFuwf93P+0JP\n/rFxGdtF9hjFZWzxZW" +
       "OxV/7m5Z8GL/3bSViajqKGvfuGd3QP9EI+XVdW3Vhs0fTqzzinEq/TtRZf\n" +
       "UZZspBdftLV4HdmsKjivpkeKVpPtRX2mw/DazofudsPQpcNPGH3mvdRCOcLe" +
       "RB8LPXif3uKUbPfg\nQ4HOUNAV8Qj1AhH6saizX9Cpdy+lXbPQGfG5oiHj/E" +
       "ybMpKjQOY4vJJlyBQxDgoYwzTVNRZPP3rD\nTBqy3dgJdEYjrE2vTTEVmzoS" +
       "jIzmnILpIFPYtHxLll32KahmpzPkvha25eJBlIFbi8JpB7z2cgb2\nVhdODg" +
       "rDUQgigVs3Yo1+K8kitzGdRr/HjFu9OSjZ7rWHI52BEG0OXj+1d8Lkp1FL8x" +
       "c5eMCMRLJ+\nuoObekd1JGoKK6JJMjT6RGWJZjW8DnE0h2qEJgf+0dDELZGQ" +
       "lsEURzJVIyRHMVQ43Et89iqLJ8vx\nZGuE516GR5z6LfGQtd8MxzNTIzynoI" +
       "gl/GglgyUY0rM6wcGcqBGYL2FUN6ngftYBsKLkJEdxsjoU\nEuubUtGVoTwM" +
       "aZHcBpXGloyQlf4pjuVUjRh5FKZGYGS40GGxyi9f4EC+UCMgZzGaC0D6EkmF" +
       "rCbF\nDP0tPRkH9K0T6Zzt9RVpRXpdfi9GSwSVm3PtrPwhGj4244H0cR7kPD" +
       "xYIx6ehrgAUMV3B0jPCRTo\nmzjS32L06XIU8B72wZSSyqhHClz0dO/rT2Up" +
       "FX5fpz/sCgZgKbBA5V+7mX6ipd8qLk9zGk7XiIYX\nYaYkcVm81Sy9KvAgFI" +
       "iv2Q+FCAkFXxCjhVxdURgkzOwnHaNHuP2P1Mj+18FQEpvGtq70zwIDQrn6\n" +
       "I4z6ZhUJYW+n3+8K+iEQWsVA6Cu6YWPzdawNyflWdcEZTtuZGtH2FgsbYwZ5" +
       "WyBNv2VAesd+DzxE\nwybMwub6sgdpJj/B7X+iRvb/OwPUY7H/If1KIEK/hU" +
       "F63/6+B0ulAYxWGvUWMTJoxghpSp7ljJyt\nESNX2LzC7vRUc4aFAkGxuAwK" +
       "kburAnfRKpphGm10VcHbg15vQFhW/A6jT9lrEXuDnX6fKxCEUbsQ\nTyVybs" +
       "FUM8bJwugb3NZv1IjxaxgtK8BIx4RujgX5VoAE8h2NOvlBtkr7rYFPvTJwNN" +
       "vm0xfsDERd\nYZIFVxfzWWSIVeX4FLfkqdpQ65gPizBAtLN428kMDen/PsvR" +
       "PFsjNEsxWlqERmPSEhXpRD/PUT1f\nHaqqqmtHG1utFhFlXmSTLbSXOKSXak" +
       "TURohTQhTfVykdBUvLgBBHQacwCvxCr0IfBXpx6HDb339g\nST2E0WIddiGd" +
       "m7FI7lj4HjfgezVi0cdKohF9T9Nqln2DI3mjRkiiGC0qIKkY9GRL6gJHdKFG" +
       "iLZr\n5fJR61VcO7ze5DjerBGOT8MyguOoyAupBy9xPJdqhGcv42VPcRnkuE" +
       "0YR3oR7bjd/jwM1bPXFfDA\nvNGizRt7eOPXtBgkpc+73Ph3a2T8KHMGwaFh" +
       "FUmQBRL0WtAxbvsOH5+fpg1YS60wqK1cHJPZ8zLn\n43KN+JgA50zyVp2hMH" +
       "akBDKiOhlp+2SEKRkeNkcWdFYuisnM/T5n4v0aMaHyzoeGyiw8juiMhPTt\n" +
       "BcdR24z4A5SRCEZrzHRXZobcyXaFM3OlRswcx6gRZ9gdIyIbwt3JIb1yd9xn" +
       "nw3WeAA2Fmn6yo8S\nsm8O5bt0iBHA/pox8PX/h/rpAYzmY1VO55IyVmhzUC" +
       "TjIZ2MsJA5vmw7fUai5IYHfwjS52KaPot1\nW2aNzWARb2BLNWpgOx4GKkjP" +
       "OJ3NY/CTIqdEKh4VqBDyxmO2b/oJ086CH0qM5cVaC9FBtcDKkz2o\nl8i4hZ" +
       "MsEop0jJN0rDqSeNCwipVv64nbe+NHsKJt7/mLds0i+lMDjr+2fweUp9MHcR" +
       "HGqI6oqrxp\n5jgL4xcK/z88wiLWvOaHyVc6wRk5UaOw+Q6rEQtpDgI5lRUj" +
       "5wWBLCG/vmifrIA2/a4qUVw5ubYD\nF3zjQ6py4+O6Ofkum4DpmDa06BzCnb" +
       "kRIcG+bp8OmmD9PjYBF3RWLkVIUuHbLlKNtl0cP2TRMWx1\n55XjXwQ6hM7G" +
       "m7bpiPq0vLKqRLHIibTUKofwHSCpRjtAjkusdzlocb+X412BEmGZ+zP7lIS0" +
       "gmSl\nUW9lRkgO4XtBUpV7QdVNxe+xjKZNhJZdDIlvyUhVbskIOV5j+r8Epv" +
       "VdFsdHth+18AQ6fQGamuak\ntFVRZcs/IE9hFNZRlrc+SHwvRqpyL6Y6N1xl" +
       "YEbKgVkP4vgOh1TlDkd1YP6XgeHLfXMwq0DcExzM\nE7UZss461pIh22Zl9t" +
       "RDgIA32KUatfmdLSzN78vjyQwEZqFna9ZtayuDRxgGzqXCMAhVcXukNgIK\n" +
       "IAw9On1IOVfaHlI+2qMLBjBaa2p32XYd8Qjvuks12gZwrmEe6U/HMqnr8YgV" +
       "HtEjmwSP0PvgnMsN\n3OrdHOeN9rkNiNyWWlCWW+BBOsdtOVcjbjtZ+dCbkh" +
       "PJ7nhcBVJNeV1eBovIa1DgVb8R2FUx0nv3\n6AAMjtC3WZ1R+46gNVyAl7TF" +
       "5pZ1wjYw+Glu+NM1csKtrG4QUZUN8vYymERn9AnO0PcZQ1U5wyr1\n6Kt15y" +
       "77D07SUjIElfUGS/t178xAWWeUQn5nZkXJL5ux39+Kbbh46MZXs4veYM+GaL" +
       "+R1TiAGify\nyaT41KvwuT6rKhMJ6ttG+j6PkTmI0fqKPzIBy0v6l5Dj3Mcu" +
       "HMZodZkLoZIhf8QrbsdomfkVMFvz\nT+L5BzCaX3w+eEr/h3jqQYyccCr5eG" +
       "chIoQnnNhzxDP8iR3tWdXhLFSz5JdvZv7yhTmf+eKPf0dv\nDG+Isd+GI7+H" +
       "Fst1TUO9i7u6wSlHcvSxZfId+fmoWF4FV2J6YzwneW6OSWS/f7ZafEi3oKtj" +
       "5MBg\nr8lzurYfgyLP6YbInixQTp6GsfdLW8dVtNKMGgoX8f9a+e3+3+Gq/g" +
       "+0nQBhxk8AAA==");
}
