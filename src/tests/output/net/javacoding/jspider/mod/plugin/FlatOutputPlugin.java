package net.javacoding.jspider.mod.plugin;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.JSpiderEvent;

import et.util.MyUtility;
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
import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.spi.Plugin;

import et.util.MyUtility;

abstract public class FlatOutputPlugin
  implements net.javacoding.jspider.spi.Plugin,
             net.javacoding.jspider.api.event.EventVisitor
{

    
    public void
      visit(
      net.javacoding.jspider.api.event.JSpiderEvent event) {
        this.
          println(
          event);
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.engine.EngineRelatedEvent event) {
        this.
          println(
          event);
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.engine.SpideringStartedEvent event) {
        this.
          println(
          "Module : " +
          this.
            getName());
        this.
          println(
          "Version: " +
          this.
            getVersion());
        this.
          println(
          "Vendor : " +
          this.
            getVendor());
        this.
          println(
          "Spidering Started, baseURL = " +
          event.
            getBaseURL());
    }
    
    final public void
      initialize(
      ) {
        this.
          setUp();
    }
    
    public void
      shutdown(
      ) {
        this.
          tearDown();
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.engine.SpideringStoppedEvent event) {
        this.
          println(
          "Spidering Stopped");
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.folder.FolderRelatedEvent event) {
        this.
          println(
          event);
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.folder.FolderDiscoveredEvent event) {
        this.
          println(
          event);
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceRelatedEvent event) {
        this.
          println(
          event);
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.EMailAddressDiscoveredEvent event) {
        this.
          println(
          event);
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.EMailAddressReferenceDiscoveredEvent event) {
        this.
          println(
          event);
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.MalformedURLFoundEvent event) {
        this.
          println(
          event);
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.MalformedBaseURLFoundEvent event) {
        this.
          println(
          event);
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceDiscoveredEvent event) {
        this.
          println(
          event.
            getComment());
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceFetchedEvent event) {
        net.javacoding.jspider.api.model.FetchedResource resource =
          event.
            getResource();
        this.
          println(
          resource.
            getHttpStatus() +
          " - " +
          resource.
            getURL() +
          " - " +
          resource.
            getMime() +
          " " +
          resource.
            getSize() +
          " " +
          resource.
            getTimeMs() +
          " ms");
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceFetchErrorEvent event) {
        net.javacoding.jspider.api.model.FetchErrorResource resource =
          event.
            getResource();
        this.
          println(
          resource.
            getHttpStatus() +
          " - ERROR !!!" +
          resource.
            getURL());
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceForbiddenEvent event) {
        this.
          println(
          event);
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceParsedEvent event) {
        this.
          println(
          event);
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceIgnoredForFetchingEvent event) {
        net.javacoding.jspider.api.model.FetchIgnoredResource resource =
          event.
            getResource();
        this.
          println(
          resource.
            getURL() +
          " - Ignored for fetching");
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceIgnoredForParsingEvent event) {
        net.javacoding.jspider.api.model.ParseIgnoredResource resource =
          event.
            getResource();
        this.
          println(
          resource.
            getURL() +
          " - Ignored for parsing");
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.resource.ResourceReferenceDiscoveredEvent event) {
        
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.site.SiteRelatedEvent event) {
        this.
          println(
          event);
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.site.SiteDiscoveredEvent event) {
        this.
          println(
          "site discovered : " +
          event.
            getSite().
            getURL());
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.site.RobotsTXTMissingEvent event) {
        this.
          println(
          "robots.txt missing for site " +
          event.
            getSite());
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.site.RobotsTXTFetchedEvent event) {
        this.
          println(
          "robots.txt fetched from site " +
          event.
            getSite());
    }
    
    public void
      visit(
      net.javacoding.jspider.api.event.site.UserAgentObeyedEvent event) {
        this.
          println(
          event.
            getComment());
    }
    
    public void
      notify(
      net.javacoding.jspider.api.event.JSpiderEvent event) {
        event.
          accept(
          this);
    }
    
    abstract protected void
      println(
      java.lang.Object object);
    
    protected void
      setUp(
      ) {
        
    }
    
    protected void
      tearDown(
      ) {
        
    }
    
    public FlatOutputPlugin() {
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
      ("H4sIAAAAAAAAAK2ae2wcxR3HZ/0424khsRNCSEJeBIpLfLbPPj9w02JsR7nk" +
       "nBjbIeCEHuvdOXth\nb/fYnfODR1RUwiNCIB6FPuhTINoK8QcR8EeRAAEtba" +
       "GlblWglApKhSiUFNRWRC2I/mZ2zjveO+f2\ndmNp7vZ25/n5fec3M+vfIx+i" +
       "attCGxQ7Suay2I72jw7Llo3Vfl227TG4lVJeqK4bfniPYVYgKYkq\nNJWgFU" +
       "nFblFlIrdoaktioHfWQpuzpj43qZuE11NQy4XnfDrz0i2711eiFeNohWaMEp" +
       "loSr9pEDxL\nxlF9BmcmsGX3qSpWx1GDgbE6ii1N1rVrIaNpjKNGW5s0ZJKz" +
       "sD2CbVOfphkb7VwWW6zN/M0kqldM\nwyZWTiGmZRO0MnmVPC235IimtyQ1m/" +
       "QmUSStYV21r0GHUWUSVad1eRIyrknmR9HCamzZSe9D9mUa\ndNNKywrOF6m6" +
       "WjOAxCZviYURb9sDGaBoTQaTKXOhqSpDhhuo0emSLhuTLaPE0oxJyFpt5qAV" +
       "gtYt\nWSlkqs3KytXyJE4RtNabb9h5BLnqGBZahKAzvNlYTWCzdR6bCdbaF6" +
       "n/7OjwJ5uZzatUrOi0/zVQ\naKOn0AhOYwsbCnYKnshF701cnttQgRBkPsOT" +
       "2cnTd+6T+5PvPb3JybO+SJ59E1dhhaSUTzs3nD3f\n97e6StqN2qxpa1QKi0" +
       "bOrDrMn/TOZkHNaxZqpA+j+YfPjPz88q/9FH9QgWoTKKKYei5jJFAdNtR+\n" +
       "fl0D10nNwM7dfem0jUkCVensVsRkvwFHWtMxxRGB66xMptj1bBYhtBKSBOlu" +
       "5PzR3wisDToi+3Ik\nmyPDem5SM6JZgjoMTA5RFSimCvY/dJWd1VRsHcqY6q" +
       "Esy3WosNgsbWvFjCTRSeudcjroc5epQyUp\n5eF3fnX94J7bbnUMSEXHe0lQ" +
       "DBqOug1HecNRaDjqNBz1NowkiTV55mKy1FQqnVH/eKx35R3N9hMV\nqHIc1W" +
       "mZTI7IEzqGmSjrujmD1RRhUmwQZM/UBlKtnwDVQj9SOlTEZgmgnLbQVq863T" +
       "mdgCsZJDd/\n+PNXjqdmjlEhUcOvprU7XQMzXu30rb5p9IrdV966tZJmmqmi" +
       "FoKs20rXnlKOHx069sdfv3m+OwsI\n2lYwOQtL0snl7f6wZSpYBeflVn//f3" +
       "d9dE91z+MVqApmLPgsIoPSwAFs9LaxaJL15h0WhQUll6dN\nKyPr9FHeyywj" +
       "U5Y5495hsjmNfjQ4CqKwPB1kvu7E1yOtrz61/AU24rxbXCH4z1FMnEnW4LIe" +
       "szCG\n+29+c/ieb3x4y0EGmpMmKJLNTeiaMss6cqYEhl1VZMJH166+976mB1" +
       "7NW3KVW3ufZclz1JCzN86f\n/a1fyN8FZwCT0tauxWzOIdYSyjdAPy9g19uF" +
       "h/T3Vp6Fiss7d3bS5SBvmczEdf957nvLNjudoWU2\niG2cwz7Pc0ZYQVCtPA" +
       "ECkBUm3vPzjbj9cApXwKjW4nx7g/1Djo9zPOL1D7xzc9Nbr7/MvaawGru5\n" +
       "/p66KffEkafnK6iB62BdlO29+WnN1mV6JbG1CkTEJhy9U8fGvszxHL2El+zs" +
       "ibU6Q1tN0JYlHAJ8\nRZ35z3L2OHV8RaijbaGO5iXqkKEOPI0NEh2kn5dq4I" +
       "tNaxZgnL3U6sNWzlsu+7j+Zvn5KxwijYv9\nzqCRy8S//xpuuqheKeLg6oiZ" +
       "bdahVd01uLe1IbYq5y2+4sCmt3d2PnyD1+IbqZsVjba4WEp59tGn\n34i/9q" +
       "eboBfjqGbvvtH+vuQgdHjTSZtLKQ3T6y+pnNJeZMbknqVgL7G4UK84TDCzhW" +
       "ErZIwtMvNm\n1ne66iyH1ASpka9E7Js+bKQfq7gXKJCzJGrYM5ck7jwFLYwJ" +
       "WogBq0ZQLt0XRjU1mjQVWU8M/PDZ\n5fN35Tp3O4Y8TciQGEjNbnr5oabPNz" +
       "MKXMERYaHnv2umZWuva2D6tZ+gHUHWzwvburfHYs0drQRV\nM1n61+/uUXaH" +
       "ybi0s9kLDUxTsQOV9aKChi0tA4Ob5vulx8f/1aq+e8GAg2etuA8XM+6KfY63" +
       "rXrv\nI6Z2z+QvsinzNHLXxgffPfbOyGpnrjg713MKNo9iGWf3ykZSn6Wzdc" +
       "vJWmC5n79gyyOHR/4yUcEJ\nDBBUNW3S40KE9bcVMVB7Fkm0BdIaLtE1xSRK" +
       "P4b9yjEjyLGdPbiUfhhBxRKLMbF0esVyYUmxYANq\nwOCo6NcIhqqx6lM5Wl" +
       "459IdaDFoM0joObV1oaNcJ0DpcaNcHhtbJoPV4oe3wC82ZZ5AFjoiWf24z\n" +
       "J+XWAGkrpC2c2xZ//hCW9+q0Zsj6Sfyi7w3IEUIXZ5g19FCLlzQvNem5vJvn" +
       "lmde3125E7Yt9lSO\nqOaMcVKdNfGONIXW2bcFncVdnX0nqM462k6dzsxs1r" +
       "fO7is5P6lTa+bcmkNz+7HArdPl9pPA3OJB\nnVqanS2jO9lXeU7tQV9OrY1D" +
       "awsN7QkBWpcL7cnA0HqCim0RtAHNVsxpOMr55fZYSW6UVZxzi4fm\n9rzArd" +
       "vl9kJQbvF2xq3by+3LJblZ2DZzloKjI/yiPME9UxJcN6QeDq4nNLh5AVyPC+" +
       "73gcF1UXDx\nuBfcoH9wg0OypvepKtywyxbeb0ry64O0g/PbEZrfWy6/9laX" +
       "39tB+XWy1aGzw8tvbzB+Cy9gygb5\n55Ig2zlMlP8OBfK4ALLNBfnPwCDZch" +
       "EvODBd5B/kkKzTV1RY3T+S3GnmDL/o3i+JrgvSIEc3GBrd\npwK6mIvus8Do" +
       "2KIRL9DgQAB0F8s2LhPfiZL4OiAlOL5EWHzSMgGfe/qSlgfF18XWjnibF19f" +
       "+WtH\nubNWivhad4c4u6HQ7NYK7NxDmHRWYHZdp2zd3YmJMuUb3Gpfohvh4E" +
       "ZCgztPAOfujqUvBAXXHTtl\nomPgBi3L9PnOSNrqa6k4wNkdCM2uQ2Dnbvak" +
       "eGB2XaGXigV2pjWhqSo2fKJrLYmuFdJBju5gaHQX\nC+jc7Z7UHxRdj3OY7S" +
       "r/fFGAzvnPu09uXy7J7UuQUpxbKjS3YZdbh7vNky4JzM3ZnRScyxLlc0tM\n" +
       "GiYsEKA8NnGhlE+GyZIMeyGpnKEamuFXBYbuNkVKOd49wCvx1lYGsWCx2BUG" +
       "IpWhf4bjJRnSI4bG\nGWqhGeoCQ2G9zQRnyITYWeD7dgc56AY8a0hTJSk2M3" +
       "DO3zWhKV4rUHRf6UnXBabY5rwuKNgxd5ak\nCIPG0VH4KOs1gTTta93IcWK5" +
       "0MRuFYgJ25XbghPrKr5w9PgnVrbMbvL1Mm+OQ5sLDe0+AZr7Mk+6\nPzC02B" +
       "Kvjnv9QRsxJ0xij102NqTZZfi4u31hu4FjuyE0tgcFbML27qHg2OKnBlt5J4" +
       "of+DqK3cix\n3Rga22MCNmFrdyw4tp7iZ7HSL9wZtv02tvom4ee+CTznm9qj" +
       "Jal9EdIRTu1IaGrPuNTiwsbu2cDU\n2mEpaG/uWDiI0SoPlh73UwRFDJNo6b" +
       "miAz8TOW/Jj/KBHy02cJZ78b8B6XUnDDFrmQQrsL74DZGQ\nfiuAcd/HSa8E" +
       "B9O9vb2bnVAjJgsOyutpJYuZorF1USdqqDStFwmqyVqaQfTi/wU8HdIGSLdz" +
       "XLf7\nw0VblF4K999S6XWwvI3J/uySPdsE6U7eszuXULD0Rrhe/JWgWoJla2" +
       "DhH6WzQNprFxqytrYgAtqJ\n01W2zl95/nPZhl+yML+FWNraJKpN53RdCOkR" +
       "w3siWQunNTaMWid6z5HTB0uHa7nxmzTqbiFuS3rf\nKXmcoHVLlySoMuNEKe" +
       "fzf0zQmuL5QTT8Ssz/b4JOX5yfoGXuDzHrJ9AaZKWXJ6h5pT/QEJPVQmzQ\n" +
       "aBYrGg0fmv3Rz6ouueN3/2MhQjWKEy5OQ6QVu4X5t5Y+Q9bnbM3moeQ0olTJ" +
       "WbCBJiyijPNcbjs1\nOiHR68UA9oW2to1dPjzoBL0cgL6zWQveuycefK52bI" +
       "+1NceggqqxXYnRYMG3hy10VjE0rLtc/jS+\na9ZCp7sugMbIiQ+zvA//B5i7" +
       "OAvyLwAA");
}
