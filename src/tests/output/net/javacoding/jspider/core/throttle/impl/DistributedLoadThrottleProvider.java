package net.javacoding.jspider.core.throttle.impl;

import net.javacoding.jspider.core.throttle.Throttle;

import et.util.MyUtility;
import net.javacoding.jspider.core.throttle.ThrottleProvider;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.PropertySet;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;

public class DistributedLoadThrottleProvider
  implements net.javacoding.jspider.core.throttle.ThrottleProvider
{

    final public static java.lang.String
      INTERVAL =
      "interval";
    final public static int
      INTERVAL_DEFAULT =
      1000;
    final public static int
      INTERVAL_MIN =
      250;
    
    public net.javacoding.jspider.core.throttle.Throttle
      createThrottle(
      net.javacoding.jspider.core.util.config.PropertySet props) {
        int interval =
          props.
            getInteger(
            INTERVAL,
            INTERVAL_DEFAULT);
        net.javacoding.jspider.core.logging.Log log =
          LogFactory.
            getLog(
            net.javacoding.jspider.core.throttle.impl.DistributedLoadThrottleProvider.class);
        if (interval <
              INTERVAL_MIN) {
            log.
              warn(
              "Throttle interval < " +
              INTERVAL_MIN +
              " ms is dangereous - set to minimum allowed of " +
              INTERVAL_MIN +
              " ms");
            interval =
              INTERVAL_MIN;
        }
        log.
          debug(
          "throttle interval set to " +
          interval +
          " ms.");
        return new net.javacoding.jspider.core.throttle.impl.DistributedLoadThrottleImpl(
          interval);
    }
    
    public DistributedLoadThrottleProvider() {
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
      ("H4sIAAAAAAAAAK1YfWwUxxWfu7PPX0f8gYOt2NgG3BQLfGewD5lYanPymXJw" +
       "2I7PkMZ1dBnvzh0L\ne7ub3bnzQRNUmhSStI0UBdJUpaSRiJAilFZFSf+pSl" +
       "GSfiNV/iNJWyVKSxRRtUSpqgoUpaJvZnbv\n9vYMphIn3ezczHvz3rz3ex97" +
       "566iWstE3ZIVpocMYoXHU9PYtIg8rmLLmoWltPR2bcP02d2a7ke+\nJPIrMk" +
       "XNScmKyJjiiCJHEvGxoon6DF09lFV1ap9Tdcp9Gz5f/MPxXV0B1DyHmhUtRT" +
       "FVpHFdo6RI\n51AoR3ILxLRiskzkOdSqESKniKlgVTkMhLo2h9osJathmjeJ" +
       "NUMsXS0wwjYrbxCTy3QWkygk6ZpF\nzbxEddOiqCV5ABdwJE8VNZJULDqWRM" +
       "GMQlTZehQdQYEkqs2oOAuEa5LOLSL8xMgOtg7kjQqoaWaw\nRByWmoOKBpbo" +
       "9XKUbty/GwiAtS5H6H69JKpGw7CA2oRKKtaykRQ1FS0LpLV6HqRQdM9NDwWi" +
       "egNL\nB3GWpCnq9NJNiy2gauBmYSwU3e0l4yeBz+7x+Mzlralg6L/PTF/r4z" +
       "6vkYmkMv3rgKnHwzRDMsQk\nmkQE4/V8+ETioXy3HyEgvttDLGhiX/jZ3uSV" +
       "C72CpmsZmqmFA0Siaenzbd1rl2IfNQSYGvWGbikM\nChU3516dtnfGigageU" +
       "3pRLYZdjZ/OfOrh77xKvmHH9UnUFDS1XxOS6AGosnj9rwO5klFI2J1KpOx\n" +
       "CE2gGpUvBXX+G8yRUVTCzBGEuYHpfj4vGgihOvj64BtG4tPOBorWxQF1prIA" +
       "7pWTOpZn95s6pSqZ\nNvWCIhMzbFC0WyN0noFC0mWAw/wBy2Bb85JuknlqM8" +
       "wrOUOdX/G0ItOoedHnY6HtDUwVULxTV4Ew\nLZ29/LvHJnY//ZRwM4OmfReK" +
       "EqBPuKxP2NYnzPQJO/qEmT7hFfRBPh/XpKPSLczPMgvHf/50rOXZ\nQesNPw" +
       "rMoQYll8tTvKASCGOsqvoikdOU47jVFTMcqoDz0AJAHtRLq3AQDzHwQ8FE67" +
       "3QLieEBMww\n4HXpyI0/fpJePM9QyFDTzk4XqgEGDgrdQgOph3c98tT6ACNa" +
       "rGHuBdL+lU9PS588s+f8O79/f2M5\nhCjqr4rsak4WmV71wZQSkSHzlY//3m" +
       "c7P32+dvvrflQD4Q4Jj2KAKWSPHq+Miggdc7IdMxZwNmV0\nM4dVtuWkqEbm" +
       "3cXyCkfTKja0CmAxY3kU5Iny+hPBoXd/3vQ2v7GTU5tdyTdFqIjQ1rKtZ01C" +
       "YP39\nF6efP3n1+Ne4oW1LUxQ08guqIhW5Ih0+cOzqZbJFuLP9xAsDp951PL" +
       "m6fHrMNPEh5sji0aW13/81\n/iFkEohoSzlMeMAiLgk5Ati4ic83uzbZ7/U2" +
       "CQOXN6R2sFrieCa38PX/vHm6sU8ow3i6+TEBUKyL\nOCwT43squNLSo4dPDS" +
       "+lHlREUvRmWQ/x4V/sPX39Ev2AW7rsfCZtXbFawX3YhcvRdwqtwZ+8lPOj\n" +
       "ujnUwisl1ug+rOaZH+ag1lnj9mISrarYr6xbIkmPlcDd7QWeS6wXduVcA3NG" +
       "zeYNAmmcpgVM1gnf\nKHzX2NmUP9lmGxtWF32AkHpemQuY16ftnHUDH+8VIA" +
       "pQEKxoYn8jIMrifUcROBOTsxMz+2JJcEyn\n2zHiXqJUPXbq8rGBD/90yS5n" +
       "rjapTPX39JP5N751YcnPgqcBGhZsTZZvBw0Tm/l4EwE+SlfetlEk\n63Fqc2" +
       "4ZGt0KCrWBJNZghRXZ9n38/u0XP7r6Y+UaF9PI+5cY47DlNPAVl+CAblisUr" +
       "paNfuk/inD\nYllmlUtIIp4u9l56ZeBGHz/f1jroqrr277oCNifdhULoPRqN" +
       "jlA0eweL2H3Dw5tHhgZHRikid6wW\nhR2nf9Hqo9jMEtpXWmI3irtwcQQ6iW" +
       "o3MOPZeERtHBV38XTDQiI8oeVz7k0wT83MRCzOndQOnWiZ\nVHR9Ip+ycaQC" +
       "9iPw7bAP6qiCfSmD8pMSEAFZYrb97Udnrh09PupnGa62wOIVlHNJnMyzDvvY" +
       "uZNr\nm058+G2enyA+rrBDU8sEDpt/iUcNG74MEdPiWCYdn9gR25uc9aa0aV" +
       "PJAVYKdi/4+ty/h+SPN8VF\n8HS63zHchDu33iD9q698KpJZZfwskwo9Qp7r" +
       "OfPx+csz7aLMiq58Q1Vj7OYRnTkPu5BRhDusu5UE\nTv3WpnXnjsx8sCBu0l" +
       "bZyDCnR196jwzcH5KWaaQCkKEg7/B7RW/m74j9RM6z0t9sshdWP2MTclvO\n" +
       "CpWctScxyRbTXHaxmplXvY1OfSuXwG6732HzmEhTuitNbTEcVEdvKzy9ocgs" +
       "v/ZmbyDc6se/+q/Q\nMfzWw367BmOQTnVjUCUFopbLsfeQPfyFy6k8zQ/2/n" +
       "XHtrOPe+sx743d4K1kS0sXX7vwl+h7f34S\nXDqH6ianUuOx5AR4v/eW4tJS" +
       "a6HrgcB+5Tc8j9qlseo1sZJprLIgNpoE3nK12YpC0VfCS5NdFnts\nvPR48M" +
       "L9zIaDy3Y1vmq3HnW5dcRTfZK6hNVE/OWLTUvP5bftcnzxFTZ8805n/KHNw9" +
       "HB6Fao2YYJ\n5csB2PCtAMZjENqUjJJlfTL/NwAamZVbuscpuksyCabEUcVt" +
       "k++4bDLMN55gw3fv/JW3bBmMDlPU\nUakLFCgBA8cIg/9XlCFIAb0riGe9cm" +
       "fV/zbi3wVp/dIjG980Wn/L3y9K/wDUQ0OQyauqu31zzYOG\nSTIKt1+9aOaE" +
       "MU9SNHDbNRxqJnvwe58Q/C/Cq9Pt8EP1pm5f2uw/oKjrFuwgkD3cHKcpWrM8" +
       "B0V1\n9sxN/zJgqZKeosbyDzfpGSgJQMqmr5RSqKtMi8ayaPwPAkiDcZsTAA" +
       "A=");
}
