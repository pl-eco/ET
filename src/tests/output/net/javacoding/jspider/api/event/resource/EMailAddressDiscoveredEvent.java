package net.javacoding.jspider.api.event.resource;

import net.javacoding.jspider.api.model.FetchedResource;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;

public class EMailAddressDiscoveredEvent
extends net.javacoding.jspider.api.event.resource.ResourceRelatedEvent
{

    protected java.lang.String
      email;
    
    public EMailAddressDiscoveredEvent(net.javacoding.jspider.api.model.FetchedResource resource,
                                       java.lang.String email) {
        super(resource);
        this.
          email =
          email;
    }
    
    public net.javacoding.jspider.api.model.FetchedResource
      getResource(
      ) {
        return (net.javacoding.jspider.api.model.FetchedResource)
                 resource;
    }
    
    public java.lang.String
      getEmailAddress(
      ) {
        return email;
    }
    
    public java.lang.String
      getComment(
      ) {
        return "e-mail address \'" +
        email +
        "\' discovered";
    }
    
    public void
      accept(
      net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.
          visit(
          this);
    }
    
    public java.lang.String
      toString(
      ) {
        return this.
                 getComment();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcxRWfO9tnn+3EHzEmtZ3YMebDYN/5fP5IYqlg2Rfi" +
       "5BJffCY0rtGx3p2z\nN9nbXXbnzpeUplQNhNIKFRFoK6WgVq0iVQiqpqGVqE" +
       "gjEvoZqfUfQFuBWgUhqjaIqqqIWqr0zeyu\nd27PH/njYmn3xrPvzbx57/d+" +
       "82ZeuooqTAO1iWaIHNWxGRpLJgTDxNKYIpjmNHSlxEsVwcSZvarm\nR7448s" +
       "sSQXVx0QxLAhHCshSeGB/JG6hD15Sj84pG7HGKRtl526eLvzu5p7UM1c2gOl" +
       "lNEoHI4pim\nEpwnM6g2gzNz2DBHJQlLM6hBxVhKYkMWFPkYCGrqDGo05XlV" +
       "IFkDm1PY1JQcFWw0szo22JxOZxzV\nippqEiMrEs0wCaqPHxZyQjhLZCUcl0" +
       "0yEkeBtIwVyXwEHUdlcVSRVoR5EGyOO6sIsxHDu2g/iFfL\nYKaRFkTsqJQf" +
       "kVXwRLtXY3nFXXtBAFQrM5gsaMtTlasCdKBGyyRFUOfDSWLI6jyIVmhZmIWg" +
       "llUH\nBaEqXRCPCPM4RdBmr1zC+gRSQeYWqkLQLV4xNhLErMUTMy5ak4Ha/z" +
       "2V+KSDxbxcwqJC7a8Epa0e\npSmcxgZWRWwpXsuGTk0cyrb5EQLhWzzClszo" +
       "7T99IP7h+XZLpnUFmcm5w1gkKfHTobYtS6PvB8uo\nGVW6ZsoUCgUrZ1FN2F" +
       "9G8jqguXl5RPox5Hz8xdSbhx77If67H1VNoICoKdmMOoGCWJXG7HYltOOy\n" +
       "iq3eyXTaxGQClSusK6Cx/8EdaVnB1B0BaOsCWWDtvI4QqoTHB88dyPoL0hdB" +
       "W2L7BFkBaAN0zXHZ\nFLUc+EyK5bBKQjpB96uYzFJAiJoEUJg9bOqyhI1ZQZ" +
       "dnMRWaBUUta4h4ds2R8tSSukWfj6a0NyEV\nQO9uTYFxU+KZK795NLb3q09a" +
       "4aWQtNdAUAxsCbm2hGxbQmBLiNkScmwJrWEL8vmYFbcWhoLGVqIp\n+I8fj9" +
       "Q/3Wu+6kdlMygoZzJZIswpGFJXUBRtEUspwrDbwOUJgydgu3YOYA6mpRQYiK" +
       "UV+D5noE4v\nnF0SmICWABhdOn799x+lFs9S5FGkNNHRLdMg7kcs22q7kw/t" +
       "efjJzjIqtFhOQwqiXeuPnhI/emrf\n2bd+++5dbtoQ1FWUzcWaNBu95icMTc" +
       "QSsJ07/Df/s/vjZyt2nPOjckhxIDkiADSBMbZ65yjIyhGH\n4aizQLMmrRkZ" +
       "QaGfHFqqJguGtuj2MCRtYO16cEANPBXw1Nu43kBf9GMjfW2ycEf96VkD489r" +
       "Xwn0\nvf3zmkvMKQ7V1nGcnMTEStwGNxzTBsbQ/+63Es8+d/Xk51ks7GAQFN" +
       "Czc4os5pl9t/og9ptWIJHQ\n5qZTz3efftsJ9iZ39FHDEI7SWOe/vLTl278U" +
       "vgMEA4luyscwy2M/m8kPSpuxM2RsbJ9FSxaJPXr6\nyhPdf/njZZvouA3Ulf" +
       "pb6kT21cfPL/mpi4OwlQnmfifX2FZKWz62vUAYGeRpT5D5s9pK5wixNQci\n" +
       "gxEwqBFmoltvSJZCcU0UlInx716oWXomO7THMmUDJzAxnsq3X/5B9/UOZoI9" +
       "Y4DjUvv/ypxg7Hdp\ngP70E5QoES/tjER7BiK9Q4MEVTkaLHZNBPWtwTcZTc" +
       "JKaBcm4gKWpnjFsOWcnZxz+tmHKH2NlNb0\noeHe4R0EVeAMCDp21zM0UWIK" +
       "WRu4g0b67mHtXpolDEmIWdtpi1Cy8tLzLlqPOJmemfvCv994obrD\nQi7VaV" +
       "vmoVYekAVaKfGRY6ejS8kHZQsI3p3aI3zs9QdeuHaZvMfS0iUTOtu2fLGBBw" +
       "WO57a/lWsI\n/OjFjB9VzqB6Vm0JKjkoKFmatDMAaHPM7owDIPnvhbWPlSsj" +
       "y2TZ5iUyblovjbn7FrQLc8dlro3w\ntNoMhpxfjrl8iIE9zhS62PvOZZ4J6o" +
       "ZGwD4s5QvCb6NvikNfnyc1LWeP37fjwvtXX5E/YelXzYrO\nUaphmx1kPRwn" +
       "lGm6Scsbrr62R+qa1M0RNu0AQdVs2khff99gCaHeP9wTHeodAMapnt49kQyx" +
       "BdMZ\nk87qj0NxVbxIaprtXtTIoLfRTY6Yms3wH6HEKJ+KjY7Tce9l+wZb1B" +
       "12arjZ02ZnDjh2y2qFKiuy\nT37un7VPCBcfslDfWFhx0OkHX3wHd99XK65Q" +
       "7QSJpvcq4CXFTU3vbPtYAe+gsO7B9r/uGjrzRW9u\nsmMUn5uFainxwsvn/z" +
       "z4zp9OgBUzqHL/ZHJsNB4Dg9vXnC4lNuRaD5QtyL9iELLTpOjYUag0Upgc\n" +
       "1QaGU5M6XZAiHQWb+91WdJwoFW/uXIxWYbh16Q/srpnHZCUeN7lMiro8TkrJ" +
       "49t7IpHeAdjVmjgj\n7jQ7LOfQ6bYjNrVc4Jnb4Wm2PdN8kzwD7FIHRsUy7g" +
       "J473yJ886g653HSpn6/dQ70WHgHo8hBR66\ndyUPbYWnxfZQy03y0AngJDBs" +
       "TMtkwGDeOV/jnDPkOufrBB0olXOigz2Rwd7+4bshTGRBNkOuJas6\npcd2DH" +
       "J+b9wpPnuv5xZ5ilvksLvI50qIgGhfT3+0dyBKoBaUoTbUDKfS6V33RMjGOG" +
       "hprR/Lb0AB\nL4gi1om3nEkYcgaq0px9l3Bu5l990gf3jFvEvpm/o+IFd/df" +
       "x12bPvzYKmQKq+wVyiDPJM9s/f4H\nZ69MNVmbg3Wrc1vRxQqvY93ssKXU6n" +
       "R72rbWDEz64j3bXjo+9d6c33bBHGyCOY1epQWYvX2r5VWn\nDaHOm5RXZ6Ai" +
       "J5pVwPKAe5kD3HYXcK+UEnADjHL64JDvWODhGqDF1jXGoGe6zUXXjtblmNi5" +
       "9PBd\nb+gNv2ZH5eULrCo4+aSzisJXjlw7oBs4LTMHVFl1pOWNcwR13/C1iP" +
       "eM8xNrjJ8R1LHeGLTMyjn8\nZuu9RlDL6noElcGbl3+doOaV5SGz7RYvf4Gg" +
       "jYXyQLXuP7zoRZgNRGnzks6j5U0XLQM7dIc3Pnvj\nN0nOdjyFFYHY4aWZ1c" +
       "QVm0kdizI97ua/91r5gaf/8F9WEFWK1g0yvTWFoplRV3hUFZSjJjuD0G/0\n" +
       "zkjMGgYMyipHO9o1pjWidUvaytfcy3N1TR9KxIrL7shQKROBbS8RqOTLadld" +
       "sjs4KNY/s5L/2Jr4\nkpyubtae/f9mBTlpERgAAA==");
}
