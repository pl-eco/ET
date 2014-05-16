package net.javacoding.jspider.api.event.resource;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;

public class ResourceDiscoveredEvent
extends net.javacoding.jspider.api.event.resource.ResourceRelatedEvent
{

    
    public ResourceDiscoveredEvent(net.javacoding.jspider.api.model.Resource resource) {
        super(resource);
    }
    
    public net.javacoding.jspider.api.model.Resource
      getResource(
      ) {
        return resource;
    }
    
    public java.lang.String
      getComment(
      ) {
        return "resource discovered: " +
        resource.
          getURL();
    }
    
    public void
      accept(
      net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.
          visit(
          this);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYa2wUVRS+28f2KaUPpFhKC1Sl2t3ttqWATYzNtoSFhS7d" +
       "+qCWLNOZu8vA7Mw4\nc2e7+ECNCmqMSsBXghqNhsQQf0jAH5qgwfcj0f4Q1G" +
       "A0GKPxEY0xGh/Bc++d6c5OWxqTusnM3r33\nnHPPPY/vnLtHf0SlpoGWimaQ" +
       "7NGxGYwk4oJhYimiCKY5AlNJ8c3SiviRTapWhHwxVCRLBNXERDMk\nCUQIyV" +
       "IoOtCXM1Crril70opGbDnTpFy18u+JD/ZvbCpGNaOoRlYTRCCyGNFUgnNkFF" +
       "VncGYcG2a/\nJGFpFNWqGEsJbMiCIt8MhJo6iupMOa0KxDKwOYxNTclSwjrT" +
       "0rHB9nQmY6ha1FSTGJZINMMkaGFs\nl5AVQhaRlVBMNklfDPlTMlYk8ya0Fx" +
       "XHUGlKEdJAeHHMOUWISQytp/NAXimDmkZKELHDUrJbVsES\nLV6OqRO3bQIC" +
       "YC3LYLJTm9qqRBVgAtVxlRRBTYcSxJDVNJCWahbsQtAlswoFonJdEHcLaZwk" +
       "qNFL\nF+dLQFXBzEJZCFrkJWOSwGeXeHzm8taQv/qf++O/tzKfl0hYVKj+Zc" +
       "C0zMM0jFPYwKqIOeMfVvBQ\ndJu1tAghIF7kIeY0/Ze+fG3s25MtnKZpBpqh" +
       "8V1YJEnx796lzZP9X1cUUzXKdc2UaSgUnJx5NW6v\n9OV0iOaLpyTSxaCz+N" +
       "rwW9vueAF/X4TKo8gvaoqVUaOoAqtSxB6XwTgmq5jPDqVSJiZRVKKwKb/G\n" +
       "foM5UrKCqTn8MNYFspONczpCqAweHzytiH8W0BdBS2hoWoaIB2RT1LJgL2kw" +
       "i1US1AmKqJiM0WAQ\nNQnCYGyXqcsSNsYEXR7DlGjMsJnHZpWSoxrUTPh8NJ" +
       "W9iahA1G7QFJCZFI+ce+/WwU333cvdSkPR\n1p2gftAjmNcjaOsRBD2CTI+g" +
       "o0dwFj2Qz8c0WFxofupPiabdDy/1LXwwYJ4oQsWjqELOZCwijCsY\n0lVQFG" +
       "0CS0nC4rXWlRssJCGeq8chtEGtpAKCWCqBvbMGWuEN4XziR2EkQFxO7j3/0U" +
       "/JiWM02mh0\nNFDpXDXw9W6uW3V7YvvGHfeuKKZEEyXUjUDaNrf0pPjT/ZuP" +
       "ffL+2VX5VCGobVoGT+ekGehVP25o\nIpYA4fLiH/tzw88HS9cdL0IlkNYAbE" +
       "SAcASUWObdoyAT+xxUo8YCzqqUZmQEhS45UFRJdhraRH6G\nRdFFbLwQDFAF" +
       "Tyk89XYs19IXXayjr3oec9SenjMwzPzjLn/n6Ver3mRGceC1xoXDCUx4stbm" +
       "3TFi\nYAzzZx+PH3zkx/03Ml/YziDIr1vjiizmmH6LfeD7+hmAI9jYcOjR9s" +
       "OnHWfX56X3G4awh/o6d+dk\n8xNvC08CqEBym/LNmOWub8rtjdgRORjZzKGI" +
       "A9eth8/ta//y0w9tcHMVzTzVd8m7rRP3nJwsoiau\ngPIlmFucPGPlk458rK" +
       "SAG1nI05kKZs9KnsphYnP2hNeuBYXqYCdaboOyFIxpoqBEB555vWrygNW7\n" +
       "katykYsgOpDMtXz4fPv5VqaCvaPfhZ/277KsYGzJQwD96iIoNg94dFV4TUf3" +
       "6sBqEFfuUDO/NRDU\nfgGcyWgSVqbgxXE1fXewcYCGIHMTYnZaYZNQJPDi3n" +
       "pa4J00yozf8tuppypbeVhQnqUuMZfZUvIb\nOatg++bZiiQr8Ptv+KV6n/DG" +
       "du6GukLkG1StzOqnz+D2a6rFGRC3gmh6QAGbKvlTeHfbzJoH5xg1\n17d8tb" +
       "73yG3eYxRT3HcHbSFbUnz9xZOfrz7z2d2gxSgq2zKUiPTHBkHhlgtulxRrs0" +
       "1bi3fK77BI\nsrFtWstTyNTnPiaEuYGhY1NHCsK8tQBklsOzyAaZRTOBjMtH" +
       "swTDnJGymaCqNCbD7mAM8WQbcSXb\nOrbQTV/XzlMqdIU7wuFAdzdBDS4FLj" +
       "dbuWHoVmsR23ZjgVWWwbPEtsqS/8kq2wiqBKUiWiYDyrqN\nsiNvlHWdeaMI" +
       "BF09i1Egd8d0xUrL6hhUADJkEd0icTYBVljT0xHuDXT3XAHdOO8mPPsCMixk" +
       "WE3L\nfpC3xDOZpQOeZtsszf/NLA7Au46523XMcP6Yynz5fl1HV3egB3xflp" +
       "UBe+E2Yp81MGe3xWRcx7nm\n9mQaCqQgilgnAAVNbiiIG3IGUD9r9+fHR3/t" +
       "lL65coADVqP73ucm3NB1HrfVf/szgy1PFZvhEuDZ\n5MCy5745dm64gYMevy" +
       "mtnHZZcfPw2xI7SrVOYXf5hXZg1G9cufzo3uEvxotsE0QIKslq9HrqZ/p2\n" +
       "ohxBi2dxDu0NGqddWfnFSlwxuWPVKb32XdZyTV1+yqGCpixFcYGbG+j8uoFT" +
       "MtOknHdSPMTuuHDJ\nK2ytvfXydi7jLoJa55JBUCn7dvPtg7vk7HwEFcPbTX" +
       "8fXIFnpocItkdu+gcIWlBID4CS/+EmfQh2\nA1I6fFh3p+ABF/yu0Z38uPq/" +
       "30aGMcCO7V4aQQ2uniihY1GmbVPu2VdKtj748V+soJWJ/N8HeuMW\nzRBL0V" +
       "C/Kih7TNm0/5mgdw/RMqCvJqzy296uMrlEfsNucv8fMrVX28i2+CCP6R6wCz" +
       "tkOBzumq8m\nq7uzo6sr0NULcT+yIZqYlzvcXgMtmclu7Cw27KI6hh0L8nBN" +
       "Gx33om6r9C+ZChoDXhIAAA==");
}
