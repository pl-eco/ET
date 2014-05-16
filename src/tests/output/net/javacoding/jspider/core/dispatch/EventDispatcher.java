package net.javacoding.jspider.core.dispatch;

import net.javacoding.jspider.api.event.JSpiderEvent;

import et.util.MyUtility;

public interface EventDispatcher {
    
    public void initialize();
    
    public void shutdown();
    
    public void dispatch(net.javacoding.jspider.api.event.JSpiderEvent event);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1Xb2wURRSfu2uvvfbwem2Bhpa2FIg20L2K0AT6QZq2hCsH" +
       "PXsYpJYce7tz7cLe\n7ro7e70iEo0I6AcTA/5LUGOiITHEDxLwiwkSwH+RxP" +
       "QLqNFoMASjGIwxEoPBNzN7vb1tAaM22b3Z\nmffmvXnv935vevwaqrRM1CJZ" +
       "ApkysCX0p5KiaWG5XxUtaytMpaXzlaHksU2a7ke+BPIrMkGRhGTF\nZJGIMU" +
       "WOxQd6CyZqN3R1alzVibPPrF3WLb05+fnBoeYAioyiiKKliEgUqV/XCC6QUR" +
       "TO4VwGm1af\nLGN5FEU1jOUUNhVRVfaAoK6NonpLGddEYpvYGsGWruapYL1l" +
       "G9hkNouTCRSWdM0ipi0R3bQIqkvs\nEvNizCaKGksoFulNoGBWwapsPYb2oU" +
       "ACVWZVcRwEFySKp4ixHWMb6DyI1yjgppkVJVxUqditaBCJ\nNq/GzImXbQIB" +
       "UK3KYTKhz5iq0ESYQPXcJVXUxmMpYiraOIhW6jZYIWjRbTcFoWpDlHaL4zhN" +
       "UJNX\nLsmXQCrEwkJVCJrvFWM7Qc4WeXLmytZwMPzXc8k/2lnOK2QsqdT/Kl" +
       "Bq9SiN4Cw2sSZhrnjDFo7E\nt9stfoRAeL5HmMv0LX//4cTV021cpnkOmeHM" +
       "LiyRtHSzp2XxdN8PoQB1o9rQLYVCoezkLKtJZ6W3\nYACaF8zsSBeF4uKHIx" +
       "9tf/Id/JMfVcdRUNJVO6fFUQhrcr8zroJxQtEwnx3OZi1M4qhCZVNBnX1D\n" +
       "OLKKimk4gjA2RDLBxgUDIVQFjw+eBYj/zaMvgqKDeayRAcUCaWkCm4JBUI+G" +
       "yRgFgaTLkP6xXZah\nyNgck3QTj8mO6NgsxQI1Fpn0+WjVemtOBYBu1FXYJi" +
       "0du/zZ3sFNzx7iGaSoc9wkaDWYFkqmBce0\nQE0LRdOCxzTy+ZjRheXBpdmS" +
       "aVH9/F5v3fNd1ik/CoyikJLL2UTMqBiKUVRVfRLLacLQGHUhnwEO\n0BrOAH" +
       "DBk7QKG7FCgWjmTdThBWiprOMwEgF10/tuffFLevIExRLNfSPdnbsGmdzNfQ" +
       "t3pnYM7TzU\nEaBCkxU0KQVWkAupFW8YN1BqKO6fyzz++9nXa9r5/lSnpbgB" +
       "GPNqUrq48XSw++IHtedZ4IvMEnFR\nUAoTjtNoydetJsYw/80rycMvXjv4KH" +
       "OUexogqFrMwLFFiRAIbJGICAoadkZVJNdJGuYoJaGp8chL\nnUcvznmAxbdj" +
       "AMZeBx/5NXxAPLeD12l9eeIHNTu35o1LuHN9WJoDYyGiG10qzmO15J7X2mbG" +
       "jMVI\nR7a1fb+h59gTXkcDFOm4qDPYv7lcLS2deff012sufbUfvBhFVVuGU/" +
       "19iUFwuO2O5tJSNN/8UGBC\n+cTPeJly3Bx8Xq7U6z4mtAUTQzvSaMDoTKgw" +
       "G7JJU5ewDD2rZPflPzdeP1y59qQfVQBRQ6siIhAM\n8H6r13gZt/YW0URNgW" +
       "ZtVjdzokqXis2lhkyY+mRphpHFPDaug0jWwtMKT8RhJ/ZLF+vpq4FTC5Pu\n" +
       "YO/lHIF+Or6XvjodrPnoeyXkpaGE4D7TFKdosRWeml786sfia8DZwJ2Wsgcz" +
       "akRldefsQN/rXYv0\nu5fQdguMTVs/BiPN7uQnTSUHa3mn3Zwc/a1bvrJigE" +
       "O0yX2NcQtuXHULL2u4ep0BNQQbi9aWGbTO\n7mkeIy+0vnXlxOWRRg5z3viX" +
       "zuq9bh3e/NlxwgYttCV3ssCkz61YcnzfyLcZvxOGGEEVeZ3etoLM\n327Eot" +
       "VTls0WeKJONqP/MZveXNw1UVuAmawJm8j6pEa/43N5uBKeBsfDhv/JQx8To8" +
       "2oyQ0Nfmng\nKdt79PKBzu++vOBcQ1y4KEn9mN5vn3rm9DSrfw8o2EWXjnzs" +
       "8gflydoXr3L6ruGdOE3ZmWqu6u4G\nf+rBEL0XC4osJHRJVOMDb56pnX7B7h" +
       "ninsxzCcQH0oW2C2933mpnHjgGg66LjvNdlRfNElwN+rOT\noAf/3QVi3f1r" +
       "V65a07X6AYIqMV1kYW0kqOs2twLRUAQmKAyl2Azb8u7w2AahKbrB4VGAPujx" +
       "h7bB\npln/OvALrtQxvfO+s0b0U0aUM5fQaghQ1lZVFw+7OTlomDirMA+qOf" +
       "/xTOUIWvZP7j0ur9mxVK4O\nLa35DupQrPTHrUH/n5hbg6AqZ+SWzxN0T7k8" +
       "EGHpwy06RVAAROlwj1HMXx3jYnqvEjjGC8bfRFN6\n4t4NAAA=");
}
