package net.javacoding.jspider.core.throttle;

import net.javacoding.jspider.core.util.config.PropertySet;

import et.util.MyUtility;

public interface ThrottleProvider {
    
    public net.javacoding.jspider.core.throttle.Throttle createThrottle(
      net.javacoding.jspider.core.util.config.PropertySet props);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVWXWwUVRS++9PdbrvYH6A0tNCmQrAJneUnWwL7Qu1PWLrQ" +
       "hcUItWS5O3N3OzA7\nM87c2S6IRCMC+mBiwL8ENT4YEmN80IgvJkgQ/yKJ6Q" +
       "uoMdHgg0Yx+mAkBoPn3pnpzk4L8WeSuXPn\n3nPuOfd853z3vnkDNZgG6hZN" +
       "gR7WiSkM57LYMIk0rGDT3ANDefFyQyx7blzVgiiQQUFZoqglI5oJ\nCVOckK" +
       "VEeiRVNVCvrimHS4pGnXXmrbLl3lszn5/c3hVCLZOoRVZzFFNZHNZUSqp0Es" +
       "XLpFwghjkk\nSUSaRG0qIVKOGDJW5CMgqKmTqN2USyqmlkHM3cTUlAoTbDct" +
       "nRjcpjuYQXFRU01qWCLVDJOi1sxB\nXMEJi8pKIiObNJVBkaJMFMl8GB1DoQ" +
       "xqKCq4BIIdGXcXCb5iYoyNg3iTDG4aRSwSVyV8SFYhEj1+\njbkdrxoHAVCN" +
       "lgmd1uZMhVUMA6jddknBaimRo4aslkC0QbPACkXL77goCDXqWDyESyRPUadf" +
       "LmtP\ngVSMh4WpULTUL8ZXAsyW+zDzoDURif/1dPaPXo55WCKiwvyPgtJKn9" +
       "JuUiQGUUViK960hDPpfVZ3\nECEQXuoTtmWGVr/3QOaHCz22TNcCMhOFg0Sk" +
       "efHWYPeK2aHvYyHmRqOumTJLhbqdc1SzzkyqqkM2\nd8ytyCYFd/KD3R/te+" +
       "wN8lMQNaZRRNQUq6ymUYyo0rDTj0I/I6vEHp0oFk1C0yis8KGIxv8hHEVZ\n" +
       "ISwcEejrmE7zflVHCEXhDcDbgeynhTWA9p5pQ6NUIVlDq8gSMQSdok0qoVMs" +
       "C0RNAvynDpo6m5oS\nNYNMUUdhar5mlZlrmQkEWN36q06BFN2mKSCYF89d/+" +
       "zo6PhTp2wMWd45jlKUBNtCzbbg2BaYbcG1\nLfhto0CAW11WH18GmMTq6ue3" +
       "U63PDJjngyg0iWJyuWxRXFAI1CNWFG2GSHnKE7LNk/w85yBh4wXI\nXXAlr8" +
       "BCvFYgoBUD9flztFbZaehhSLzZY7e/+CU/8w5LJwb/Era67RqAecj2Ld6f27" +
       "/9wKm+EBOa\nCTNcqrwmlzEr/jiOMXZw1y8XHvn90itNvfb6TKfbXQCM+TUZ" +
       "Y9x8IrLu6vvNl3nkXXJp8bBQjlA7\nVdtqvu4xCIHxb17Mnn7uxsmHuKO2py" +
       "GKGnEBto1FSiGwLhdRFNGtgiKLnp0sXqCahM4lZ57vP3t1\nwQ2suBMJcAI7" +
       "ufe3+An84X67VNvrgR9VrXLy1Wukf2tcXCDJYlTTBxRSIUrNPb+1HZwc3Ui3" +
       "PNjz\n3djguUf9jvJUJ67O6PCOerW8ePGtC18nr311HLyYRNGdE7nhocwoON" +
       "xzV3N5sa3StSs0LX8S5NTM\naG4BSq9XSnm3CSeDQeBEUlnA2EisOj9loXxE" +
       "IsGxVbP7wp/bfj3dsPndIAoDV8NpRTFwDFD/Sr/x\nOnpNudnETIFmc1Ezyl" +
       "hhU+750sSqd6Y2wtliEe+3QiSb4U3Cu9QhKP5lk+2sWWxzC5fu4+1qOwOD\n" +
       "rL+GNf1OrgVYuxZwWVzL4CHDwIdZsVUfn13x0sf4ZaBtoE9TPkI4OwbmwOz0" +
       "gmmTvX00HD17/UT/\nt19ecY4Pz7WkJvVj/rh1/skLsxy0GFwQsLmzBghcUF" +
       "gvwA9tiCnnHBsa1jbZ/DlCHc0Nm9dtAofa\nwRK70AiyJGQ0ESvpkdcuNs8+" +
       "aw1ut11Z5BFIj+SrPVde77/dy11wLEY8J5TzH61gY2etJNhnlKKt\n/5H4t2" +
       "xYv3ZjciC5gaIG3dB0kyOxhKKNd2NzjgxkWFEusUzklyWgmXoYWbuVpYLDC+" +
       "w/RdE9okEw\nJa4rXOx+O4BZTwAH+cQYa3b9v+2tXz+Q3EjRsnq7a8xeu8rc" +
       "DQ/8q+MLVeEK6LfHyLdz3p3VvlmJ\nfbMH7rukt33Ky3Pu9tMIABctRfFUv5" +
       "cJIrpBijIPTqNddXak9lG06p/4CyRPvYHea6tPUdR1F3WK\nwuzj1YCbYcfC" +
       "GhRFnZ5XvgBA18tT1FT78YqCuRCIsm5Rd9Fo5QzATnPBLtKq/jcGqdmtVwwA" + "AA==");
}
