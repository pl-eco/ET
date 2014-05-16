package net.javacoding.jspider.core.task.work;

import net.javacoding.jspider.api.event.resource.ResourceForbiddenEvent;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.resource.ResourceIgnoredForFetchingEvent;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.dispatch.EventDispatcher;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.impl.URLFoundEvent;

import et.util.MyUtility;
import net.javacoding.jspider.core.rule.Ruleset;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.Storage;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.WorkerTask;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.URLUtil;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class DecideOnSpideringTask
extends net.javacoding.jspider.core.task.work.BaseWorkerTaskImpl
{

    protected net.javacoding.jspider.core.storage.Storage
      storage;
    protected net.javacoding.jspider.core.event.impl.URLFoundEvent
      event;
    protected net.javacoding.jspider.core.dispatch.EventDispatcher
      eventDispatcher;
    
    public DecideOnSpideringTask(net.javacoding.jspider.core.SpiderContext context,
                                 net.javacoding.jspider.core.event.impl.URLFoundEvent urlFoundEvent) {
        super(context,
              WorkerTask.
                WORKERTASK_THINKERTASK);
        this.
          event =
          urlFoundEvent;
        this.
          eventDispatcher =
          context.
            getEventDispatcher();
        this.
          storage =
          context.
            getStorage();
    }
    
    public void
      prepare(
      ) {
        
    }
    
    public synchronized void
      execute(
      ) {
        java.net.URL url =
          event.
            getURL();
        java.net.URL foundURL =
          event.
            getFoundURL();
        java.net.URL currentSiteURL =
          URLUtil.
            getSiteURL(
            url);
        java.net.URL siteURL =
          URLUtil.
            getSiteURL(
            foundURL);
        net.javacoding.jspider.api.model.Site currentSite =
          null;
        if (currentSiteURL !=
              null) {
            currentSite =
              storage.
                getSiteDAO().
                find(
                currentSiteURL);
        }
        net.javacoding.jspider.api.model.Site site =
          storage.
            getSiteDAO().
            find(
            siteURL);
        net.javacoding.jspider.api.model.Resource foundResource =
          storage.
            getResourceDAO().
            getResource(
            foundURL);
        net.javacoding.jspider.core.rule.Ruleset spiderRules =
          context.
            getSiteSpiderRules(
            site);
        net.javacoding.jspider.api.model.Decision spiderDecision =
          spiderRules.
            applyRules(
            context,
            currentSite,
            foundURL);
        storage.
          getDecisionDAO().
          saveSpiderDecision(
          foundResource,
          spiderDecision);
        switch (spiderDecision.
                  getDecision()) {
            case Decision.
                   RULE_IGNORE:
                storage.
                  getResourceDAO().
                  setIgnoredForFetching(
                  foundURL,
                  event);
                eventDispatcher.
                  dispatch(
                  new net.javacoding.jspider.api.event.resource.ResourceIgnoredForFetchingEvent(
                    foundResource));
                break;
            case Decision.
                   RULE_FORBIDDEN:
                storage.
                  getResourceDAO().
                  setForbidden(
                  foundURL,
                  event);
                eventDispatcher.
                  dispatch(
                  new net.javacoding.jspider.api.event.resource.ResourceForbiddenEvent(
                    foundResource));
                break;
            case Decision.
                   RULE_ACCEPT:
            case Decision.
                   RULE_DONTCARE:
            default:
                context.
                  getAgent().
                  scheduleForSpidering(
                  foundURL);
                break;
        }
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1358042367297L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1Ya2wU1xW+XtvrJxgbAw422BiTYoFn/cCLzapqXD+CYcGO" +
       "14TiGm3GM9f24NmZ\nyczd9dpNUaOSkOZHqig0bSUa+katUJMWJf3RqhQl6R" +
       "up9Y8kbZWoFVGUqiVKVVVBbSp6zp3ZndnZ\ntUEilmb2+s4597y/e+69dIOU" +
       "WiZpkiyBLRnUEgZj46JpUXlQFS1rEqbi0qulFeMXD2t6gBRFSUCR\nGamJSl" +
       "ZIFpkYUuTQ6FAkbZIWQ1eX5lSdOevkrXJg54eLvzt7qLGY1EyRGkWLMZEp0q" +
       "CuMZpmU6Q6\nQRMz1LQGZJnKU6RWo1SOUVMRVWUZCHVtitRZypwmsqRJrQlq" +
       "6WoKCeuspEFNLjMzGSXVkq5ZzExK\nTDctRjZET4kpMZRkihqKKhaLRElwVq" +
       "GqbD1MTpPiKCmdVcU5INwczVgR4iuGRnAeyCsVUNOcFSWa\nYSlZUDTwRLOf" +
       "I2tx22EgANayBGXzelZUiSbCBKmzVVJFbS4UY6aizQFpqZ4EKYxsXXVRICo3" +
       "RGlB\nnKNxRhr8dOP2J6Cq4G5BFkY2+cn4ShCzrb6YeaI1Fqz+35PjH7TwmJ" +
       "fIVFJR/zJg2u5jmqCz1KSa\nRG3Gm0nh3OiJZFOAECDe5CO2aQZ2/fhY9N0r" +
       "zTZNYwGasZlTVGJx6cNw07aVgbcrilGNckO3FEyF\nHMt5VMedL5G0Adm8Ob" +
       "sifhQyH38+8YsTn/s+/XuAlI+SoKSryYQ2SiqoJg864zIYRxWN2rNjs7MW\n" +
       "ZaOkROVTQZ3/D+6YVVSK7gjC2BDZPB+nDUJIGTxF8Bwh9l8DvhjZMkQlRaZj" +
       "WsyAH4z2pGgtCAYj\nH9com8ZUkHQZpqdPWZxiWtJNOs2AaHpRNxemV+FPo+" +
       "SaxaIiLGF/AaqQrQd1Fejj0sXrv3lk+PAX\nnrDDiSno6MxIBDQQXA0ERwMB" +
       "NRBQAwE1EApqQIqKuOwtuQ7HCMpYaP/4UWTDUx3WSwFSPEUqlEQi\nycQZlU" +
       "KBiqqqL1I5zniG1nqqgSchZHD1DCQzyImrsBAvHvBwyiSt/qR1S30URiJk4s" +
       "rpW79/L754\nGfML86EeV7dVg+gu2LpVt8dOHnroidZiJFoswcABadvtV49L" +
       "7z155PJrv31zt1scjLTl1Ww+J9ac\nX/1xU5eoDJjmLv/l/xx8/5nS/hcDpA" +
       "QKGaCMiZCAgAvb/TJyai+SwTF0FnBWzepmQlTxUwZ8Ktm8\nqS+6Mzx/1vHx" +
       "BnBAFTyl8Ox0snc7vvBjHb422tmG/vTZwFHy5ueDna//tOpV7pQMoNZ4kDdG" +
       "mV2e\ntW44Jk1KYf7Nr4w/86UbZz/NY+EEg5GgkZxRFSnN9dtSBLHfWAAqhI" +
       "b6c8+2n389E+yN7uoDpiku\nYazTj65s++ovxa8BjEA5W8oy5dUa4JICwNRA" +
       "M0sODx6xwceGqkfOX3+8/S9/vObAmWebdKn+Fj+T\nfOmxKysBdHEFbFiidT" +
       "RTYXzDxFER30QgjDzlcaaC+7PSLuIu5nD29oW7QaE6kIQbrKDIQlSXRHV0\n" +
       "6BtXq1aeToYP2aqs8xCMDsXTzde+036rhavgSAx6ENP5vywlmkfd4sefbkZG" +
       "7gqDDvR07u3p6ejd\nx0iZZO/mPGD1jLSvBS32MoMejpDtigMeV/TwDz34in" +
       "wUivaGO/p6GFmXNNURPanJwymqZdXdt5a6\nFCkFJWGowrGJqMucyU587+Xj" +
       "DqwanlmE29PqkCB4+UF6BLuQTOUnZj7z75efq2yxMxl5mvgyxZAP\njd4Eze" +
       "GKSw8vn+9ZiR1X7MTw788+4uWfHXvu5jX2Fi9TF1xQ2o50voIPih7c63stVR" +
       "t84UIiQMqm\nyAbeY4kae1BUk1jEU5Dg1qAzGYUE9X7P7Xjs2olkwbPJD2we" +
       "sX5Yc3cvGOfWkotk6x302uog2VYf\nkhURnvxRztDG3x/L4k6FYeoM9KNyGn" +
       "LaAgCHnsqboRNuhvb2+4rVdvfQff1X377xvPIBL8hK3mwO\nIIejeAWf8aBE" +
       "sW5Y2NZ4+mpnpbYxw4pwsVBhlVxs177+zt67LodweG9XuKMbyqF68uBoTHAM" +
       "RUkx\n1+7T0E7lm4dKOa4ldTzt1nPYxegKw1oy4f0ITUbJxPDAUKbO9qxVZ4" +
       "5YIeZqU8MZ788Jbis8jY6M\nxsLBFfF1lJFSmi1yJ36yB2E6+YdJr2v3fxSu" +
       "De/rCPfDqty1XAOUQzPq4D8n8fWJ1SwU4GlyLGwq\nbOGCY2ENX3JIsaAZle" +
       "bhEOWxVfPY2pVna1fn3du6H9OoBzawetdWVxeUqOeryO2/I+CVHR5hOH+F\n" +
       "Gm7ivQ6+uhDc5MAv1Oa21c44/Hx29lP/rH5cfOWkDZ11uW0s5nHvhTdo+33V" +
       "UoHGuYLpRocKdqku\nvvulHeFnvwyU1Rxv/utI+OJn/QCPHUiTF+Bz2eLS1R" +
       "9c+XPvG386A1pMkbKjY7HBgegwKNy8pri4\nVJtqfKB4XvkVRyEHa/NOrLlM" +
       "kVyErTQpHLi1yRycbcnpGO+BZ5eTqLsKdYyeGK2yTd52Dz0DgGSY\n1BDh7O" +
       "/bDMdNJQE9Tso5f7449a9O+Z09Q3ZEG7z3Gl7Cg923aNvGd9+3t8Hcnq3AJu" +
       "oT8vT2b79z\n+fpEvZ0V9k3AzrzDuJfHvg3gtlQbmJc71pLAqV/Zs+PS6Ym3" +
       "ZgKOD5YBRlM6Xr8Eub6dhLvq0Www\n8LB5Lzy7nWDsLti+5+14ARy3wy5gLW" +
       "kSnA80aI/ltUNy23idg3jRNJWSjLv0iwR20k0FEQRb9oa8\nuyP7hkNqXXlo" +
       "98tG7a/5SSh7C1EOje1sUlW9jYBnHIREmVW4GuV2W2Aj4dcZ2XVHZ13wM/5w" +
       "wy7Y\nvN9ipOV2vMCGP1627zLSuAYbcOCPl+N7jGwuzAEedUZe+kuMrM+lB3" +
       "R3//GSPs9IMZDi8AXDu0X8\n0NPO9BkZUO67s3uBT4oWPQ4DamI0R6E/xuyu" +
       "97QMMQPijgeY9Dd/UvLAU3/4L0ejzFkBb7ug6Ukp\ncFAJDWiiumTxLhK/4S" +
       "2AlDThhMs4bDsBrrLsFe3brUZvz5SV1TZ5Ynw4v23quvu9fX837nddYQge\n" +
       "7nd3eYMC7dU9hXzF9fc2UWjJtCPz/8pylhO1FQAA");
}
