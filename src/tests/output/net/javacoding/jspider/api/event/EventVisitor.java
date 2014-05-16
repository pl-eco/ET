package net.javacoding.jspider.api.event;

import net.javacoding.jspider.api.event.engine.*;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.folder.FolderDiscoveredEvent;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.folder.FolderRelatedEvent;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.resource.*;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.site.*;

import et.util.MyUtility;

public interface EventVisitor
{
    
    public void
      visit(
      net.javacoding.jspider.api.event.JSpiderEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.engine.EngineRelatedEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.engine.SpideringStartedEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.engine.SpideringStoppedEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.folder.FolderRelatedEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.folder.FolderDiscoveredEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceRelatedEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.EMailAddressDiscoveredEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.EMailAddressReferenceDiscoveredEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.MalformedURLFoundEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.MalformedBaseURLFoundEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceDiscoveredEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceFetchedEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceFetchErrorEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceForbiddenEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceParsedEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceIgnoredForFetchingEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceIgnoredForParsingEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceReferenceDiscoveredEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.site.SiteRelatedEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.site.SiteDiscoveredEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.site.RobotsTXTMissingEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.site.RobotsTXTFetchedEvent event);
    
    public void
      visit(
      net.javacoding.jspider.api.event.site.UserAgentObeyedEvent event);
    
    String
      jlc$CompilerVersion$jl =
      "2.4.0";
    long
      jlc$SourceLastModified$jl =
      1051926914000L;
    String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALWaDWwcRxWAZ/3vxK0TJ01NfmonbRWs1nf+u7MvpiSufVYu" +
       "ucSOnZDGJLrs7c45\nm6x3l905+9KUkIjStEiFVik/kQopElEEqqCiahESUl" +
       "K1BVooFAspKQgoCqpaQSEIIQoqCm9m97xz\ne05vb5OzNHv78+Znv/fmvXnj" +
       "ffZ9VGuZaK1khchRA1uh4clx0bSwPKyKlrUbbqWkV2sbx89v1/Qq\nJCRRlS" +
       "IT1JyUrLAsEjGsyOHEyGDORO2Grh6dVnXitFPUyqY7P5z7xalta6pR8xRqVr" +
       "RJIhJFGtY1\ngnNkCjXN4Jk0Nq0hWcbyFFquYSxPYlMRVeVBENS1KdRiKdOa" +
       "SLImtiawpauzVLDFyhrYZH3mbyZR\nk6RrFjGzEtFNi6BlycPirBjOEkUNJx" +
       "WLDCZRXUbBqmx9Bh1H1UlUm1HFaRBclcy/RZi1GB6l90F8\niQLDNDOihPNV" +
       "ao4oGpBo89ZYeOO7toMAVK2fweSQvtBVjSbCDdRiD0kVtenwJDEVbRpEa/Us" +
       "9ELQ\n6us2CkINhigdEadxiqBWr9y4/QikGhkWWoWg27xirCXQ2WqPzjhtjd" +
       "U1/e+L4/9uZzqvkbGk0vHX\nQ6U7PJUmcAabWJOwXfGDbOipxL7s2iqEQPg2" +
       "j7AtM3T3D/ck373QZsusWURmLH0YSyQlfRhdu25+\n6M+N1XQYDYZuKdQUCt" +
       "6caXXceTKYM8CaVy20SB+G8g8vTvxk34nv4r9UoYYEqpN0NTujJVAj1uRh\n" +
       "57wezpOKhu27Y5mMhUkC1ajsVp3OrgFHRlExxVEH54ZIDrHznIEQqociQDmP" +
       "7L+V9EDQrfFZrJFP\nKTAO3QwZBIU1TPZTC5B0GXS//7BlKDI294uGsh9T2f" +
       "2FNXK0i+Y5QaBz1TvTVDDLrboK9VPS+Suv\nPxTf/tijtt6orTmDI6gT+gy5" +
       "fYacPkPQZ4j1GeL7RILAeru9kCVVjkzn0F9/MLjsS53Wi1Woego1\nKjMzWS" +
       "KmVQxzT1RVfQ7LKcKMbzln6My+wDib0mCnMISUCg2xeQHwZk20wWuP7ixOwJ" +
       "kIRjZ//Nqb\nf0vNPU9Nh6p6JW3dHhoo7og9tqaOyQPbDj66oZoKzdVQHeTY" +
       "/Lud9uLlN0o9Qb79mfSxf738zSXt\ndvu0ztp8A9CZtyb1Dh98vq7r0o+Xvs" +
       "qI5x1JM+dxJjGxzXK5O9bdJsZw//dfHz/9lfdPfZoN1B5p\nNUENYhpeW5QI" +
       "AbB5v0NQnZFNq4rEvcmKRWZOqHXlU1/tePrSoi+w7noTnjmrUw/8o+kR8ZUD" +
       "9rRs\nKVR8XMvORM5exh1bmqRFjKuR6EanCmakusPz9raDOcI86ea9bX8ajZ" +
       "7/rHegrdTEcb5OfHhHYbWU\n9NL3Lvwucvm3D8MoplD9zrHJ4aFkHAbc9pHd" +
       "paTls2t2VR9SflbF3DB1aYu478JKg/xrQhQwMUQf\njQKjdxpzxSY7buoSli" +
       "FEuf1+7b9br56ujb1QhWrAL0NkIiL4E3Dzd3g7L3Clg3lrol1BzaUZ3ZwR\n" +
       "VfooH0uWkEOmPufeYV7iFna+DEguhdIBZY3jjNgvfdhCDytsn8KkN7Dj3bYF" +
       "VtHzjfTQ4diaQI/3\ngl5WuBY8ZJriUTrZcifn1535qfgNcNHgKi3lQcw8oc" +
       "Daoh6klVem7djtMPDQ01ce6Xj7rTecUMEt\nQVyp91IPZ1/8woV5prRGWAyI" +
       "1k5XIbAYoWcCC9DAlPkcWzX0uMT2myPEqdkdi8ZgQC3QE128hBQ5\nlNQlUU" +
       "2MfOulpfNPZqPb7KHcwgkkRlK5tjfOdVxrZ0NweqzjopFzXT8rmjvdKUF/4g" +
       "QNlOnoN/X0\n39vT09nXRVAte840sNKP9942ye6w9goVR49bqPIdT0CvB6GD" +
       "WdorAFnDa2jcVGbgvWadeP7C1D+7\n5HfuGbHJtPLrRF5wa881fNeKd68y1+" +
       "DR0yKLBk8nT97x7XeevzKx0nYs9srqzqLFDV/HXl2xN2ky\nqGtb/1E9MOlX" +
       "7ln/7PGJP6SrHAJhgmpmdbqcrWPj7UIMVLRg/oShrHfmz/obnD95NeSnBr2+" +
       "3zbR\nlGui/V3swSg9HAxgQL29zICiXgPaVNKAsDYNjgk8Pf2ZwKpIsOzTmv" +
       "blrYle7F4MZA+UjQ7IjZUD\nqXMgu12QRhCQMQYy5gV5n1+Q9nwEEUh1TP8s" +
       "FV8sOx2WnZVj+TmOZY/L8kQAln2Rm8dSNwzfLI+W\nZEkneK/DsrdyLL/Mse" +
       "x1WT4RgGWkO+gEz7AkITTKfsqb4I/5MsqYAzJWOZBnOZB9LshngoDsD2qU\n" +
       "BSBHFEvSZ2Hh5pflmZIsu6FsdlhurhzL73MsIy7L5wKwjNpRZ8DL8pMlWZrY" +
       "0rOmhEMTzkl5hvmd\nkjAHoMQdmPHKwbzAwYy6MC8GgckiTyTihRn3DzO+Q1" +
       "TUIVmGG1bZBvqjkkyHoGx3mG6vHNNfcUz7\nXaZvBmDazyJQtM/LdGcwpgup" +
       "WtlwXysJl4ahXQ7cXZWD+0cO7oAL9+0AcAdYSIoUJS1b/MPdIao0\nwcXyno" +
       "nkqJ7V/OJ8qyTOfih7HZx7K4fz7xzOmIvzahCcLDBFimx1JADO+0ULl4n0vZ" +
       "JI+6AccJAe\nqBzSay7SATcrElAApDEWnyLdXqRD5censmf8f3zFe8nhKVWM" +
       "p9DM8XSTI2FZEJ6xmxbvRzGRDvmF\nKTT6Mk7FgalUDmYbB9PNjoR2gmLlwu" +
       "zuitw062Q046ap+9wIEj7mKx7pDlC9ckDDHFA3RRK6ggDt\nvvGAtABUN9OK" +
       "LGPNJ8+Okjy7oGQdntnK8dzM8XQzJWFLIJ52qtRffqpUxNP+x7BPmLGSMD8B" +
       "5ZgD\n81jlYI5xMN1USRgPArPHjkVFeWeifJiJaU2HQAQ2yuY91PIJNlES7C" +
       "CUkw7Yk5UDy+18Drhpk3Aw\nEFg7byoKSltvBCy1V/9cS2+E3gfllMP1VOW4" +
       "chuhA27qJBhBuPbauVORN90WJLkPmDcJpbdF6Vbo\n4w7ZxytHltsWHXDzJu" +
       "FEELJ99l5e0Uo/WpIsNIFDk3Aoa7tEKL0hSqPTaYfi6cpR5DZEB9x0SXgi\n" +
       "EMXrRKeYf4plm6O/DdEzDsgzlQPJbYjGuCTpmSAgI72L74gO+gM5oad1Yu1+" +
       "YPcOxSrDZ5beD6Uo\nzzooz1YOJbcfGuPyo+cCobzOf4/KRVledlR6N5Smmu" +
       "cclOcqh5LbDY1x2dHFICijkcVzzdL/8GAo\n91jYHJqGy7E0PuqbpGcPNEdQ" +
       "Ez8u+j1Pa9Enj/aHedKG+YMff9lY/hr74mPh47mGJGrIZFWV+6CE\n/7ikzj" +
       "BxRmE6aLA/5LBJ/pyg9lIvypMRXrfr/ZKg1devR1A1HHn5XxO0anF5guqdM1" +
       "7+NwTdWihP\n0BL3ghe9BL2BKD29bOS1t4x9S0K/CwvZn3vkjP8DV79Zfo0q" +
       "AAA=");
}
