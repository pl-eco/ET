package net.javacoding.jspider.core;

import net.javacoding.jspider.api.model.Cookie;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.dispatch.EventDispatcher;

import et.util.MyUtility;
import net.javacoding.jspider.spi.Rule;

import et.util.MyUtility;
import net.javacoding.jspider.core.rule.Ruleset;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.Storage;

import et.util.MyUtility;
import java.io.InputStream;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.net.URLConnection;

import et.util.MyUtility;

public interface SpiderContext {
    
    public void setCookies(net.javacoding.jspider.api.model.Site site,
                           Cookie[] cookies);
    
    public void preHandle(java.net.URLConnection connection,
                          net.javacoding.jspider.api.model.Site site);
    
    public void postHandle(java.net.URLConnection connection,
                           net.javacoding.jspider.api.model.Site site);
    
    public net.javacoding.jspider.core.storage.Storage getStorage();
    
    public net.javacoding.jspider.core.Agent getAgent();
    
    public void setAgent(net.javacoding.jspider.core.Agent agent);
    
    public java.net.URL getBaseURL();
    
    public net.javacoding.jspider.core.dispatch.EventDispatcher
      getEventDispatcher();
    
    public net.javacoding.jspider.core.rule.Ruleset getGeneralSpiderRules();
    
    public net.javacoding.jspider.core.rule.Ruleset getGeneralParserRules();
    
    public net.javacoding.jspider.core.rule.Ruleset getSiteSpiderRules(
      net.javacoding.jspider.api.model.Site site);
    
    public net.javacoding.jspider.spi.Rule getSiteRobotsTXTRule(
      net.javacoding.jspider.api.model.Site site);
    
    public net.javacoding.jspider.core.rule.Ruleset getSiteParserRules(
      net.javacoding.jspider.api.model.Site site);
    
    public void throttle(net.javacoding.jspider.api.model.Site site);
    
    public void registerRobotsTXT(net.javacoding.jspider.api.model.Site site,
                                  java.io.InputStream inputStream);
    
    public void registerRobotsTXTError(
      net.javacoding.jspider.api.model.Site site);
    
    public void registerRobotsTXTSkipped(
      net.javacoding.jspider.api.model.Site site);
    
    public void registerNewSite(net.javacoding.jspider.api.model.Site site);
    
    public boolean getUseProxy();
    
    public java.lang.String getUserAgent();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1afWwUxxWfPX+DqbExYNkGm6+C4e7s+7TBEY2xTTAc4PhA" +
       "SVxTs94bm8V7t9vd\nOfugKUpUAkmlRoqShlRNmlZtg5qm/SM06R+pRKNAvy" +
       "NVqFXSRq1akUaJUqpEbZS0SkXfzOzXne/s\nbsBYmt317pt5b37vvd+82b3n" +
       "rqEKQ0etkhEkJzRsBPuTw6Ju4FS/IhrGIbg1Ll2uqBk+vy+j+pCQ\nQD45RV" +
       "BdQjI6UyIRO+VU59BAb05H7ZqqnJhSVGKOM2eUHRs+nv3N2b0tZahuFNXJmS" +
       "QRiSz1qxmC\nc2QU1aZxegLrRl8qhVOjqD6DcSqJdVlU5JMgqGZGUYMhT2VE" +
       "ktWxMYINVZmhgg1GVsM602ndTKBa\nSc0YRM9KRNUNgpYnjoszYmeWyEpnQj" +
       "ZIbwJVTspYSRmfR6dQWQJVTCriFAiuSliz6GQjdu6m90F8\niQxm6pOihK0u" +
       "5dNyBpBoK+xhz3jjPhCArlVpTI6ptqryjAg3UAM3SREzU51JosuZKRCtULOg" +
       "haDm\nkoOCULUmStPiFB4nqKlQbpg/AqkaBgvtQtDKQjE2EvisucBnLm8drK" +
       "z975eHP2xnPi9PYUmh9ldB\np7UFnUbwJNZxRsK840fZ4GND92RbfQiB8MoC" +
       "YS7Tt+nHhxNvX2zjMi1FZA5OHMcSGZc+jreuudL3\nZk0ZNaNaUw2ZhkLezJ" +
       "lXh80nvTkNonmVPSJ9GLQe/nTkZ/fc9yx+14eqh1ClpCrZdGYI1eBMqt+8\n" +
       "roLrhJzB/O7ByUkDkyFUrrBblSr7H+CYlBVM4aiEa00kx9h1TkMIVUEToN2O" +
       "+N8qeoB8SWpyCutm\nsAc1grZlMBmjISCpKXD+2HGDSYxJqo7HCqRzdPy6WU" +
       "GgiVqYZgrE5B5VAflx6fzVX907uO+hB7nT\naKCZlhHUAfqCjr6gqS9I9QXz" +
       "9CFBYJpW54NIvZKiyfP353uXPxwwXvShslFUI6fTWSJOKBiSTlQU\ndRanxg" +
       "mLunpXhLPAgqisnYAABfXjCgzEEgJQm9HR+sJAdNJ3CK5EiK4rp67/9h/jsx" +
       "dozFAfN9LR\nuWngsWluW21H8sjeow+uL6NCs+UU/BxLvNVUSyF2uykFWOOn" +
       "J77wwSvfWNLOx6d9Wq0BQFlhT0oL\nH32psuu1nyy9zNC2GKTORTVJTHg81j" +
       "u2HtIxhvt/emL40a9eO/tZZii3tIyganECpi1KhACwFuEQ\nVKllJxRZcs1k" +
       "RZGUCTY1PvZ4x5OvFZ3AmlKZzljq7N3v154RLx3h+diQ7/jBTDYde/p13HF7" +
       "rVQk\nsGqIqgUUPIMVx7xCbfsZA1pI193V9tfd8fNfLDS0kYY3tvoM9u/P7z" +
       "YuvfzDi2/EXv/jabBiFFUd\nOJjs70sMgsFt86obl+pnWu4sOyb/wsf4l3JZ" +
       "Ed7O79TrnibQv45h2clQwOidmtzckB3WVQmnYG1y\n9J77z573Hq3Y/oIPlQ" +
       "Mhw5JERCAS4Pe1hcrzOLTXiiaqCnounVT1tKjQR9YisoQc09VZ5w5jiGXs\n" +
       "ejkguRRaN7Qmk4XYmT5soIcVnE+Y9Hp23MQj0EevN9NDhxlrAj36wS8rnAju" +
       "03XxBE223P1X1nzt\n5+JTwM3AkYZ8EjMK9PGxoFOT25mc0Tn/3/vk1TMdf/" +
       "nDq+Ya4ao9HKl3xk9nX3zg4hXmtBqoAkTj\ngOMQqELolcBWZsCUcQ53DT0u" +
       "4Zw5QFAV6xnpAXMaQA+tWYJyKphQJVEZGvjWy0uvPJKN7+WGLHMJ\nDA2M59" +
       "pe/W7H9XZmgKmv0rUImf9XzYj6ASch6GmQoKgHet8RjvrD3YFInFAUCXdpI0" +
       "GbSlC2qMnB\ntJrCSjBJpYGdXAAy71D8Ts/uu7al9cOv+5BvHvyKFAH2COPS" +
       "82Ub3/e9tGojC+DyCdHgEBdWT3OL\no7yah7liqR2cn4bmnyc4meAu7sA7bQ" +
       "du1yxYNi8IS7+qTstY0yg7sd6hcDzGuu+mh8Pe3RPpCcSi\nYIvERjbys4Me" +
       "2Xpv0i39v5egJVArcEsM8FGLOxeGdTkNMTRjlkwvjP6zK/XWtgEehU3uUtwt" +
       "uCd8\nHW9c8fZ7jIQLPFqkLitQ8sja77x14epII6dwXrxumFM/uvvwApZNp1" +
       "aji8i6+TQw6Uvb1j13auTP\nEz4Thk4I6RmV7hgqmb1diKEVz2OqndCazWBo" +
       "vkGmsnxhkZArlqatWIp2ObGgeI2FuD8cD8S6wL3A\n5xngKmACKzJXMZKk4X" +
       "l4JNGf/9g0QreNCDlGGN6NiIUD8ZDJF3SIfQuHJBQSNZqO94iZFK9ejxZz\n" +
       "xmegtZrOaF08Z9xn4xB2cLjfKw49lDdjoTxn0IE0t6oHbFURR9UZ76pikUA8" +
       "7A3yk2AZLBdkAczb\noK01MV97kzBHedXvPDZ+BWycwiQJpTbsHN3APW4DF3" +
       "WAO0fQHfMBR0RjemxW1afHBrAEtw9mOJQg\neAgeAZQRWO0igWhkK2yCJRPg" +
       "AgMa+f6o5H7F4LJBs08xTFugtZuYtt9qTJ+CUh6m1DeFM8SN6DM2\noq7l6P" +
       "wNI9od9ofigUgUEF1JjslG0AWrYwOAum4+UJlkMSg3QVtvQrn+JkEpMDHBDc" +
       "4FG5y4A86P\nPOYpDa4YK6UqRDofOsb3F3bYD8BhhglWyTSlIbXRxGHjrQ6p" +
       "l3ia7oIaDBYXN26XbNy6HdwuExSf\nDzc5rSljbLpDcAXAxSL+cDgQDUMMrS" +
       "6MIbdSiKJa9zJXDKhOxKs8ZJ1vJVC/BloBmwdnYG4DsqGJ\nRDqGdTdgv7MB" +
       "63EA+/2N81rEHwkFYtsBwWYXeMUMaeRRXTIVU6Z4sKBzMbC3Qttigr3lVoP9" +
       "BjAO\nzPEODFswUeGIjGQVqHhdeL9p473dwftvHhM72uUPhSA+YfNcVOFmo5" +
       "3v0S2At8wHsA5dgqwfLkp5\nW82GrPOtBPXdPFDZe/S5oP7LAjXmqmY/8Apq" +
       "uAioLoU2qHTwd4oB1YX4Zg5Z58VZG67bs3XKRQF5\nnS3bx0W7vdVw/+Z8Qr" +
       "faxeNbqLKNc2p6ofqG+SQW80e6oOQEPmkrZOQCa0q6hzJx0HRPcNHcIzTY\n" +
       "CDiVorDCq3vi/kh3IBr35B6hlqBGE5ARdUIlxqG7D9mYmOY12+Y5OwChxbt5" +
       "NFcgetYU0zeHf9pK\n8A+cGPOUyqYu011di+euzTYeTqUlbPGKR88nyCZhnZ" +
       "NNxYlN6LSNc2pkAfbbu71lEx3dyaVwtz8S\nCYRCoVLJ5DKmZDJtgBY2vRNe" +
       "PO/ssAFw6jmh16N3Yl2sDo568w6IV9M3y4TMs1sdhBY1YYjeJBjm\nviEQ9t" +
       "gwOFWaMOQVhrA/EoW9phsGt5L9thKnNBEOeFcSjQXiPQQtlTNaFnayOhbTFg" +
       "/wN+eyGhxy\nni3siV0E1et4SjYIRKXFMyVdQt0QN10SX7zIPGKhFXdqDuFz" +
       "XtGK+qMh9gbNS2TeRdCqOXgM6rqq\nlwQlAq3HBKVn8UCxXyvGXau/19eKsf" +
       "gnAQVq16Y5oCSnZU3DqZKwBKDtMGHZsXiwnLBhcVVsJ73C\n0jM3fReGhX6F" +
       "tWA5gGeTZs+iaND3GbeZaNx2k9D4fwt94X5gDFh/Dht4WFdzJ5jMmMb7iYDf" +
       "hKoq\nWMxYL89DpSaw05zAzls9gYcJquUT0AvfdQnn7ABwFV1PeAyAONug0G" +
       "VspVvPnGJrOSNZ+lODIP8x\nDcoRtCxvNPodvmnOb5T4L2mk9VeObnlFq/8l" +
       "/9Bl/dqlOoGqJ7OK4voQ7P4oXKnpeFJmKFfzD7B8\n5t8kqGWezScEMz1R04" +
       "WneY9vA7sV7wEgmldu+WcI+lS+PEFLnH/cot8jqAxE6eWzWhG4+AfXnPY/\n" +
       "11Ip9QgmAAA=");
}
