package net.javacoding.jspider.core.rule;

import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.rule.impl.RuleSetImpl;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.spi.Rule;

import et.util.MyUtility;
import java.util.ArrayList;

import et.util.MyUtility;
import java.util.List;

import et.util.MyUtility;
import java.lang.reflect.Constructor;

import et.util.MyUtility;
import java.lang.reflect.InvocationTargetException;

import et.util.MyUtility;

public class RuleFactory
{

    protected static net.javacoding.jspider.core.rule.Ruleset
      generalSpiderRules;
    protected static net.javacoding.jspider.core.rule.Ruleset
      generalParserRules;
    
    public static synchronized net.javacoding.jspider.core.rule.Ruleset
      createGeneralSpiderRules(
      ) {
        if (generalSpiderRules ==
              null) {
            net.javacoding.jspider.core.util.config.PropertySet props =
              ConfigurationFactory.
                getConfiguration().
                getJSpiderConfiguration();
            net.javacoding.jspider.core.util.config.PropertySet jspiderProps =
              new net.javacoding.jspider.core.util.config.MappedPropertySet(
              ConfigConstants.
                JSPIDER,
              props);
            generalSpiderRules =
              RuleFactory.
                createRules(
                jspiderProps,
                "spider",
                null);
        }
        return generalSpiderRules;
    }
    
    public static synchronized net.javacoding.jspider.core.rule.Ruleset
      createGeneralParserRules(
      ) {
        if (generalParserRules ==
              null) {
            net.javacoding.jspider.core.util.config.PropertySet props =
              ConfigurationFactory.
                getConfiguration().
                getJSpiderConfiguration();
            net.javacoding.jspider.core.util.config.PropertySet jspiderProps =
              new net.javacoding.jspider.core.util.config.MappedPropertySet(
              ConfigConstants.
                JSPIDER,
              props);
            generalParserRules =
              RuleFactory.
                createRules(
                jspiderProps,
                "parser",
                null);
        }
        return generalParserRules;
    }
    
    public static net.javacoding.jspider.core.rule.Ruleset
      createSiteSpiderRules(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.core.util.config.PropertySet props =
          ConfigurationFactory.
            getConfiguration().
            getSiteConfiguration(
            site);
        net.javacoding.jspider.core.util.config.PropertySet siteProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            SITE,
          props);
        return RuleFactory.
                 createRules(
                 siteProps,
                 "spider",
                 generalSpiderRules);
    }
    
    public static net.javacoding.jspider.core.rule.Ruleset
      createSiteParserRules(
      net.javacoding.jspider.api.model.Site site) {
        net.javacoding.jspider.core.util.config.PropertySet props =
          ConfigurationFactory.
            getConfiguration().
            getSiteConfiguration(
            site);
        net.javacoding.jspider.core.util.config.PropertySet siteProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            SITE,
          props);
        return RuleFactory.
                 createRules(
                 siteProps,
                 "parser",
                 generalParserRules);
    }
    
    protected static net.javacoding.jspider.core.rule.Ruleset
      createRules(
      net.javacoding.jspider.core.util.config.PropertySet props,
      java.lang.String purpose,
      net.javacoding.jspider.core.rule.Ruleset generalRules) {
        net.javacoding.jspider.core.util.config.PropertySet rulesProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.
            RULES,
          props);
        int rulesCount =
          rulesProps.
            getInteger(
            purpose +
            "." +
            ConfigConstants.
              RULES_COUNT,
            0);
        net.javacoding.jspider.core.logging.Log log =
          LogFactory.
            getLog(
            net.javacoding.jspider.core.rule.RuleFactory.class);
        java.util.List rules =
          new java.util.ArrayList(
          );
        for (int i =
               0;
             i <
               rulesCount;
             i++) {
            java.lang.String prefix =
              purpose +
            "." +
            (i +
               1);
            net.javacoding.jspider.core.util.config.PropertySet ruleProps =
              new net.javacoding.jspider.core.util.config.MappedPropertySet(
              prefix,
              rulesProps);
            java.lang.Class ruleClass =
              ruleProps.
                getClass(
                ConfigConstants.
                  RULE_CLASS,
                null);
            net.javacoding.jspider.spi.Rule rule =
              null;
            if (ruleClass !=
                  null) {
                try {
                    Class[] paramTypes =
                      new java.lang.Class[1];
                    paramTypes[0] =
                      net.javacoding.jspider.core.util.config.PropertySet.class;
                    Object[] params =
                      new java.lang.Object[1];
                    params[0] =
                      new net.javacoding.jspider.core.util.config.MappedPropertySet(
                        ConfigConstants.
                          RULE_CONFIG,
                        ruleProps);
                    java.lang.reflect.Constructor constructor =
                      ruleClass.
                        getDeclaredConstructor(
                        paramTypes);
                    rule =
                      (net.javacoding.jspider.spi.Rule)
                        constructor.
                          newInstance(
                          params);
                }
                catch (java.lang.NoSuchMethodException e) {
                    log.
                      debug(
                      "rule " +
                      ruleClass.
                        getName() +
                      " hasn\'t got a config-param constructor");
                }
                catch (java.lang.SecurityException e) {
                    log.
                      info(
                      "SecurityException finding constructor");
                }
                catch (java.lang.InstantiationException e) {
                    log.
                      info(
                      "InstantiationException finding constructor");
                }
                catch (java.lang.IllegalAccessException e) {
                    log.
                      info(
                      "IllegalAccessException finding constructor");
                }
                catch (java.lang.reflect.InvocationTargetException e) {
                    log.
                      info(
                      "InvocationTargetException finding constructor");
                }
                if (rule ==
                      null) {
                    try {
                        rule =
                          (net.javacoding.jspider.spi.Rule)
                            ruleClass.
                              newInstance();
                    }
                    catch (java.lang.InstantiationException e) {
                        log.
                          error(
                          "InstantiationException on Rule",
                          e);
                    }
                    catch (java.lang.IllegalAccessException e) {
                        log.
                          error(
                          "IllegalAccessException on Rule instantiation",
                          e);
                    }
                }
                if (rule ==
                      null) {
                    log.
                      error(
                      "rule couldn\'t be instantiated");
                } else {
                    log.
                      debug(
                      "added rule " +
                      rule.
                        getClass().
                        getName() +
                      " to " +
                      purpose +
                      " ruleset");
                    rules.
                      add(
                      rule);
                }
            } else {
                log.
                  error(
                  "cannot find rule class \'" +
                  ruleProps.
                    getString(
                    ConfigConstants.
                      RULE_CLASS,
                    "<unknown>") +
                  "\' for " +
                  purpose +
                  " rules");
            }
        }
        if (generalRules ==
              null) {
            return new net.javacoding.jspider.core.rule.impl.RuleSetImpl(
              Ruleset.
                RULESET_GENERAL,
              rules);
        } else {
            return new net.javacoding.jspider.core.rule.impl.RuleSetImpl(
              Ruleset.
                RULESET_SITE,
              generalRules,
              rules);
        }
    }
    
    public RuleFactory() {
        super();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcRxWfu7PPPtupP/JJ7MRumkAs7LUd353tWEUx/qBO" +
       "LvHhS5vWuLqud+cu\nm+ztbnbn7LNpIxBtUlqpUmkpIEILf0CkqmoREUUgRB" +
       "qV0vIRUVkibYHylf4BglTwB2qEisqb2T3v\n7N75s8LSjud23pv35r3f+5h9" +
       "7gaqtEzUIlkCmTewJQynkqJpYXlYFS3rOLxKS69URpIXj2h6EAUS\nKKjIBN" +
       "UnJKtLFonYpchd4yODBRO1Gbo6n1V14uxTssvB296f+9X5w80hVD+F6hUtRU" +
       "SiSMO6RnCB\nTKG6HM7NYNMakmUsT6FGDWM5hU1FVJUFINS1KdRkKVlNJHkT" +
       "W5PY0tVZSthk5Q1sMpnFlwlUJ+ma\nRcy8RHTTIqghcUqcFbvyRFG7EopFBh" +
       "MonFGwKltn0FkUSqDKjCpmgXBboniKLrZj1xh9D+Q1Cqhp\nZkQJF1kqTisa" +
       "WKLVz7F04r1HgABYq3KYnNSXRFVoIrxATbZKqqhlu1LEVLQskFbqeZBC0M5l" +
       "NwWi\nakOUTotZnCZoh58uaS8BVYSZhbIQtNVPxnYCn+30+Yzz1kS47r+PJN" +
       "9rYz6vkLGkUv2rgGm3j2kS\nZ7CJNQnbjDfzwpPj9+RbgggB8VYfsU0ztO8H" +
       "dyb+ernVpmkuQzMxcwpLJC29H2/ZtTj0TiRE1ag2\ndEuhUPCcnHk16awMFg" +
       "xA87alHemiUFx8afJn93zuWfz3IKoeR2FJV/M5bRxFsCYPO/MqmCcUDdtv\n" +
       "JzIZC5NxVKGyV2Gd/QZzZBQVU3OEYW6I5CSbFwyEUBU8AXgWkP23nQ4EbZrM" +
       "q3hMpHCcFwyCBA2T\naQoASZfB9dOnLEORsTkt6SaeNoF22sNQoALq5wIBGq" +
       "n+OFMBlHfoKrCnpYvXf3H/6JEvPmx7jSLN\nUY2gDhApuCIFR6RARQpUpMCJ" +
       "RIEAE7bda0jqGZkG0D++N9jwWKf1YhCFplBEyeXyRJxRMQSeqKr6\nHJbThC" +
       "GvkUM5Axcgs24GQAoapFXYiAUFWG7WRHv8YHRDeBxmIiBs8ewHr7+bnrtEcU" +
       "P9vIXubqsG\nXjtt61bXnrr38H0P7wlRorkK6hAg3bv67mnp3UeOXrr2y7f3" +
       "u6AnaG9JLJZy0ljyq580dQnLkKvc\n7b/ynzv++UTlwPeDqAICFFIUEQFYEO" +
       "+7/TI8MTVYzE/UWMBZm9HNnKjSpWJSqSEnTX3OfcMAs4kO\njTZ2qLF8CrLU" +
       "dvML4e43flz7CjtxMQvWc+kyhYkdU42urY+bGMP7t7+afOLLN85/hhnasTRB" +
       "YSM/\noypSgSmyPQCO3VwmvoUdW558qv3CG0VPbnZ3HzJNcZ46svD5xV1fe1" +
       "X8BsQ+xKClLGAWYohJQkUB\ndPw4m3dwi/T3HoeEgssfNWM0+xc9k5v57L9f" +
       "frqmzVaG8rSwbYKgWDMusowOH/VwpaUzCxd6F1Mn\nFDuN+fOij3jhJ3c+ff" +
       "Mq+QOztOt8Ku3WQqmCd4kcLvuvzTaGv/tMLoiqplADq22iRu4S1Tz1wxRU\n" +
       "J2vYeZlAmzzr3kpjp9XBJXC3+IHHifXDzk0nMKfUdB6xkcZoGsBkW+Hphucj" +
       "Tv5j/+liEx02FwLI\noJMBxnAbGz9qQydIUMQwdQL6YairYYu1BwXQP4vBTq" +
       "KaYvmKJikL/LKD94t9LLu23H/h+rn2P711\n1ak/XF/jUv0t/WD+xYcuLwZp" +
       "7ESgwxCtY+7hoMOhswCr+iA67T1sjZ2OP0kczmi0LwoKNYEk2hEJ\niuy4fu" +
       "TQwJV3brygvMfE1LCGY4hyOHIi7A0nOKQbFi1tXG/l7LR3wrBoktnECRkfSR" +
       "dar367/YM2\ntr+jdZgrk87vqlnRPMaXghqmd0937EA/QX3rK0UHowMd0f7O" +
       "eJyg6fVUFKHUix+z2ohoZjFpK7NI\nlR0u6/yzUN9LbU0t5GAONTHX38JSCo" +
       "W9MKrlc/wi2KBicnRohEnZQtD+NZ0Ear+dS+kYLYH8TkfA\nzvKQnywDeTq/" +
       "nQ6f4HDOGmcH53TtkI23ExzeYmxhhPNkb9/6PRmLfShPcnqWepJbpKreXfZ4" +
       "dOUY\nHZLMroVSC7Hsvr+Yx91U31KsASbatVwPy/rv83f/q+6c+NN77WzQ5G" +
       "1nKCxiz7yJ2w/VSWU6pgjR\njU4Vz2LVrSN+aUdZb19MmfUnWv88Fr/4gL+Q" +
       "sBsWn7C8bGnpyvOXfxd787cPghZTqOrYRGp4KDEK\nCreuKC4tNc42fzp0Un" +
       "mNZQAnp5fcSLxMg95MXmNiuFBpxz0prm0J3K3wDMHT4oC7xQduNyA8fgsx\n" +
       "vzFkE1RnzWsS9CcaVHB55bK9ak3PQX6UTCwS/KnSqsBFyxwXLXFfdk7okqiO" +
       "j3zrSu3i4/n44aCz\n9RgdCusPowP9Hb09nfEYQbcupxnEh21mBnbEFD1VYu" +
       "N9jo33rdvGdDjzIS37gN+yy+Shc65l+7vZ\nwjwdzq/fcL195Q3nTSwrGA5S" +
       "OToIj+AYTlib4YKu4cqbJeDcGrhTP86dOuae+ksbqJ9xmnVjkK+h\npSW4WI" +
       "L2LZOCRUMRcrqMVSEF1Ku78VG47tvWpPTLRMfXudNE3dNc2NBpeuA00EfsLi" +
       "t1bQ6MOg6M\n/v8c+B33yAMcbC9uoGwe8DiQ7vLU6n75pscvy8TW85xfBlwl" +
       "X9iQkqV+WXNg0ZZGdHyDiv/X6Jfb\nV/BLyE5c/JF/yPmFC6wfbeDI/R3RHn" +
       "bkSrhHGFYxsnpXam5YHwAXpoySpTd29iURrlS8hi9xGsZd\nDa9sSMN4d2df" +
       "lKAqI29Cl74U/Q1ur2p/DOQVeJVToM9V4LUNKdAX7xyAjq/O6caW+rDk6hC+" +
       "RFCt\nDaYS4P6aU5FLKK9vSMUDPZ0DEF1bOFk+uEKVruXY6AeEHSWfn+2PpN" +
       "Kexfv2v2w0/px9dFn6kFkN\n16RMXlX5Oy03DxsmzijsaNX2Ddc+5zWC2lbr" +
       "lSEvmEWr/sZme4ug5hXYgIP+4zl+T9C28hwAHmfG\n0/+RoFu89HA5cH/wpH" +
       "8hKKTZV5nrRhkA2tfkgvE/EdJJHBoYAAA=");
}
