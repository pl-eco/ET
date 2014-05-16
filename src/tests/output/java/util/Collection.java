package java.util;

public interface Collection {
    
    Object[] toArray();
    
    boolean add(java.lang.Object o);
    
    Object[] toArray(Object[] a);
    
    public java.util.Iterator iterator();
    
    public boolean contains(java.lang.Object o);
    
    public boolean remove(java.lang.Object o);
    
    public boolean addAll(java.util.Collection c);
    
    public int size();
    
    public boolean isEmpty();
    
    public void clear();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1330553424000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1Yf2wb1R1/thPHSQ1pnLRkTdqkoRXNiO04iZ2U/EOWpKsb" +
       "tzEJ1UYwMue75+Ta\n893t7tlxGOuGVijbH0wI2A/RbZo2VIEQ0kDApE3qEL" +
       "BfAmmKNME2bdpUxDptnUDTBJqYuu977y53\nvtgp1dZauvP5ve977/P9fj/f" +
       "H+dnL6Fm00C9ohkjazo2Y9OLWcEwsTStCKZ5JwzlxdebW7Pn5lTN\nj3wZ5J" +
       "clgtozohmXBCLEZSmenpmsGqhf15S1ZUUj1j6bdrnt5o9W3zhzpCeA2pdQu6" +
       "wuEoHI4rSm\nElwlSyhcwqUCNswpScLSEupQMZYWsSELinwfCGrqEoqY8rIq" +
       "kLKBzQVsakqFCkbMso4NdqY9mEFh\nUVNNYpRFohkmQdszJ4SKEC8TWYlnZJ" +
       "NMZlCwKGNFMj+HTqFABjUXFWEZBHdmbC3ibMf4IToO4m0y\nwDSKgojtJU0n" +
       "ZRUs0eddsaHxvjkQgKUtJUxWtI2jmlQBBlCEQ1IEdTm+SAxZXQbRZq0MpxC0" +
       "q+Gm\nIBTSBfGksIzzBHV75bJ8CqRamVnoEoJ2eMXYTuCzXR6fubw1Hwz/56" +
       "vZD/qZz5skLCoUfwss2uNZ\ntICL2MCqiPnCD8uxx9N3lXv9CIHwDo8wl5na" +
       "//LxzMXzfVymp47MfOEEFkle/CjVu3t96p3WAIUR\n0jVTplSo0Zx5NWvNTF" +
       "Z1YPPOjR3pZMye/OnCz+760jP4b34USqOgqCnlkppGrViVpq3nFnjOyCrm\n" +
       "o/PFoolJGjUpbCiosd9gjqKsYGqOIDzrAllhz1UdIdQClw+uTyD+CdAbQWE4" +
       "QAGFAERMB5pR3+co\ntpx7okr3aV/1+WhAesNJAe4d1hQJG3nx3IVf3T8795" +
       "WHuXMooSwEBHXRrbnaztbI52Ob3lRrF2po\nicbD35+f3P5I1HzJjwJLqFUu" +
       "lcpEKCgY4khQFG0VS3nCiNThIi3jChAtXADOAX3zCmzEOA6GqBho\nwMstJy" +
       "LT8CQAYdZPXf71P/KrL1AaULe5sIMTTnJs4cHFe47c+/BAgAqtNlF7Vlks3U" +
       "RP8ZrpEI1q\ne/9S4fP/evU7bf18f7qm194ADvOupJH+4ZeDw2/9ZNvrzLB2" +
       "Umh3ZY9FTDjFOhysdxoYw/gfvpl9\n7IlLZ+5mQDnSAEEhoQBqCyIhYFg7hx" +
       "AU1MsFRRZdmnTWiYJYd9fjXx88+1ZdBXY3Cl6WeM589v3w\nQ8Jr9/AQi9Q6" +
       "flYtl5LffRsP3h4W63ColWh6VMEVrDjwvKcdZUnNtnT7Z/r+fCh17gteoG2U" +
       "ydhe\nMzt9tHZZXnzlufO/T779u9OAYgm1HJtfnJ7KzALgvi2Py4sdlZ47Ai" +
       "vyL/wspdL0VCcV1y6adKsJ\nGd3AUElUajA60lrdTNmsoYlYgnLjnPuNfx9+" +
       "77Hmgy/6URPkWKgyRIDcACl7j/fwmrQ4abOJHgUr\ntxU1oyQodMquC21kxd" +
       "BWnRGWDG5gz9utpNJhJRhkf9PJCL118tTBpAfYfT9noJ8+30JvgxbXfPQ+\n" +
       "BH7pdBg8ZRjCGg226gPru7/1c+HbkG4h7ZnyfZhlNVQTd9YO9H67a5L+niSo" +
       "hWhsOxpirqaCjVHt\nTq/OXTrQ+8GTfuQHC0J1F8xjjlegu6BPvjrFaWOHvP" +
       "h8YN/7/h/v3Me80FQQTO5Cb1XfXLRrajFD\nvK3Gwi1bWBgU6nZTmZcoDuj+" +
       "sxceGvzTb9+0ip5Lb0fqr/nT5ZcePL/OKNtQcYYaGMUyLicmvbfx\n4jBHrJ" +
       "WJVDLJA60L2hvmSZqVY/w4XddtweTB0XFAHgFItF+LyVIso4mCkp753ivb1h" +
       "8tp45wzDe4\nBNIz+Wrfm08NXu5nWC1oQVcBtn63VATjmJM56Nc8QbvrV7fb" +
       "xocS0cQ4wLUYcovZz2MQMUVSNZ7Y\nCVfI8kTof+S6zVQfE/Ox32lu0LtdBu" +
       "UAsvSWg4BuoMXEUGI0OpIgyKdRyaNXDorjBAUESQIv9Lj5\nkzXkEhizYvVN" +
       "Ly79c1h699YZ7o5udz/uFjw8chnv67z4HkvbHhbVac48hzy65wfvvnBhoYsn" +
       "fd7B\n3rypiXSv4V0s0yOs0xjYu9UJTPq1W/c+e2rhjwW/pX8ckkJB0xQsQO" +
       "MW5Nau5/IeWjAsl7ddA5fP\nbpy23SJYo9PcDCEuhkwwih+tDa8JhzYVKEIN" +
       "aJMYHkqkoiMp4I1wZcoorjxaC93OUh8H+hdd0Mfr\nQT/oQH+AoE+pmOQofF" +
       "GToKHLnTB1GdrNnKgZOGdC3wZvFjl4S9OMtdyiTPDM1Hy6pCug3FhqaGw8\n" +
       "OpH6JEE9ZEU2Y4W14wuZWEVQytg8MBizVPE6PWQ5PWzpEv4/Of1jl6sHoT8D" +
       "RQyBvia6DPeIy3Au\nG32NoE9fhY3o62jZEF12SiRHhsYS0WQCDNXPDHVS1V" +
       "ZVsBU84TVoIsFYNYAgu0ecOp22puoZcgCu\nGy1D3njtEuaTjmlSw45pzm7B" +
       "/LGhkWR0dPQqMuYT4Bert2Lzy16FW+HaawUysr+vjcJPuxROOAo/\ns4XCqa" +
       "GRsejoyFUo/H1IjAawpoIbqrsfroilbuTaqfuyS90RR90fbaHuBFOXZjaRAb" +
       "myuj+kdUCS\nphSlobqdcHVZ6nZd77xwnvDml02KOl+wAmUcGkq7hCXrod5l" +
       "FRZkf19P1G9A0ZDN2ZJO1hqadQdc\n3RbA7usN8DcENYvQBhheuzZVNPqvIj" +
       "fsMKoS1OZQjL5td2/6c5H/BSYOrN974FW945f8TcD+myoE\nrWqxrCiu1z33" +
       "q19QN3BRZpBC/DWLc/8d4P5GsgVU9ItBvMDn/wJjdJ4+X+T1tKr/Fw7GaUlB" +
       "FQAA\n");
}
