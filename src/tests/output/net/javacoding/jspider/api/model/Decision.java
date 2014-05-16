package net.javacoding.jspider.api.model;

public interface Decision {
    int RULE_DONTCARE = 0;
    int RULE_ACCEPT = 1;
    int RULE_IGNORE = 2;
    int RULE_FORBIDDEN = 3;
    
    public boolean isVetoable();
    
    public int getDecision();
    
    public java.lang.String getComment();
    
    public void addStep(java.lang.String rule, int ruleType, int type,
                        java.lang.String comment);
    
    public void merge(net.javacoding.jspider.api.model.Decision other);
    
    public void change(net.javacoding.jspider.api.model.Decision other);
    
    public DecisionStep[] getSteps();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1Yf0wb1x1/2MbmZ8CQBBog0JRuocEG7EAgTFOZgcWJCwxI" +
       "2jIq93z3DJec7653\nz8bJsmjV0pBuUrWqabuqabtpnSJNWTW1SvdHq2VV2v" +
       "3SIlVoWn9MrbJlyjptmVpNU6KpU/Z9753x\n+TCkaF2R3vF8933v+73P9/P9" +
       "8e7sVVRqGqhZNIPksI7NYGRqQjBMLEUUwTSn4VZcfKO0fOLMPlVz\noZIYcs" +
       "kSQTUx0eySBCJ0yVJXdHgwa6A2XVMOzykasfZZscvu2z5e+O3i3iY3qplBNb" +
       "I6RQQiixFN\nJThLZlBVCqcS2DCHJAlLM8ivYixNYUMWFPkICGrqDKoz5TlV" +
       "IGkDm5PY1JQMFawz0zo2mM7czRiq\nEjXVJEZaJJphElQbOyhkhK40kZWumG" +
       "ySwRjyJmWsSOYD6Bhyx1BpUhHmQHBzLPcWXWzHrlF6H8Qr\nZDDTSAoizi3x" +
       "HJJVQKLVuWL5jdv3gQAs9aUwmdeWVXlUAW6gOm6SIqhzXVPEkNU5EC3V0qCF" +
       "oC2r\nbgpCZbogHhLmcJygRqfcBH8EUuUMFrqEoE1OMbYT+GyLw2c2b417q/" +
       "7zrYlrbcznHgmLCrXfB4u2\nOhZN4iQ2sCpivvB6Ongqem+62YUQCG9yCHOZ" +
       "odt/uj/2wflWLtNURGY8cRCLJC5+3NfcsjT053I3\nNaNM10yZUqHgzZlXJ6" +
       "wng1kd2Lx5eUf6MJh7+PPJX9z7jR/hv7lQWRR5RU1Jp9QoKseqFLHmPpjH\n" +
       "ZBXzu+PJpIlJFHkUdsursd8AR1JWMIXDC3NdIPNsntURQj4YJTBaEf+roBeC" +
       "KoaxKJtgQlAnaIeK\nySz1vqhJ4PfZg6YuS9iYFXR5NqVJWJnNS2fp1jULJS" +
       "U0Rp0RpgAd92gKrI2LZy7/5ujIvodPcn9R\njllGEdQB+oJ5fUFLXxD0BZm+" +
       "YE4fKilhmhoK8aMOkWjc/P3FwdpHAubLLuSeQeVyKpUmQkLBEG+C\nomgLWI" +
       "oTRji/jdyMU0DIqgRwE9THFdiIxQIAljHQNicH85EbhZkAxFo6duPNf8QXXq" +
       "J0oe7dSHfn\npoGzDnHbqjqm7tt7/8ltbiq04KG4Z1nMNVAtTuxGafTn9k8l" +
       "vvavC89WtPH96ZpmtoEHdDXh3JKR\nyF0Fq+LiA0dOh5em7pY5jZ1x4RA+8r" +
       "P9z16/SN5nDiqH/EQEYBUE+1ZndBYEFA1Tp/EHBCO/b//v\nM37vT55LuZBv" +
       "BtWyvCeo5ICgpPEUhrxaIZsR62YMVRc8L8xCPOQGrWgnqNlpl03tYC5lUrA8" +
       "dsLB\nnErTeTkjbzWTqQU4G2EEYVRZscH+04d19FKfZdTzM99Sg4JRSLlz2K" +
       "j70/eev/bgYj8AF0WlGWo4\nYFKblxtL08Jx4uzjLZWnLn2bOTG383bKFqdf" +
       "qN3Xv+ntfuvVyjeYN3LZv8ZWJgA7nkv8ebJNG5hi\n+t53Jx57/OriVxnTON" +
       "XcBDaRVQFg8+rphCKLMDFZgcsSVD25PzYSHx4fm44MTY44STVhyClITxkr\n" +
       "f56b+We3dGXHMCdVo70u2wX3hG7g9voPPuR0giIpmGPLQb+SjA4lj259/spL" +
       "lyc38mzBK9ltK4qJ\nfQ2vZsyjVXoW3uHWtTQw6dd33Hr22OT7Cf4mdYU5ZU" +
       "RNp3qfext33FklFslZbqi3ACF7r16WAxmN\nthWQqRNGtUWm6pVkopM7aD6m" +
       "kzvZzwC7dltOo/MQvYTpZSd4qpJ5aigSGZmYpvd2r6V6g6V6w+qq\nXXQyug" +
       "7V0S+PjU+OrKm6C0aNpbpmddVMRewTqd7AVI+OT34pOjw8MpbXni2ynKAyIQ" +
       "EZWhDBQeXL\nbRHb0JZw64sU9WDjxlNPdJx+y5lnEeVTy2q9COPS4j0fVZ0Q" +
       "Xr+PLqULvwC6iaYHFJzBSl6rc5O7\nWOuVy1o1d7f+cbTvzNed+n20uNpDsn" +
       "BZXHzthfN/6H373eNA1BnkGxufigzFRoDTrWuqi4v+TNNX\n3PPyr1ys8eNp" +
       "dUXDWLhosDCZVhgY+l11ejmlriyYE4YmYgma4rzeJ/+958PHSgfOuWhuztca" +
       "ukO7\nI3NXJjUjJShUQa5DrSDzhraQv+NI45VWe+O3OOh3cDDP2wLisFCYtt" +
       "OExeU9gH19PsUOGYZwmJbz\n7INLLU/9UnjGTbO+x5SPYJ7VCyq7tQO9HrQ9" +
       "pL+huEHlO4CJRjsUJtKn82WDBPkSmqZgqINWiulB\n7IlQ8JLNMOqtl6z/H1" +
       "/SaeJN7YdyVDmHSa4zYzFZzMitMDZZRm76rI08CiCDkREtlcIqAU822qOI\n" +
       "NxS84Bw9fflEx6V3LlqnAltVy0v9NX48/fJD55dYtDhKGjt30lkJO4sBmeOF" +
       "bUYFb5UXibUy3N+9\nCwyqA030nBqUpWBMEwUlOvz91yqXHk337eWmVNsEos" +
       "PxbOvFH3bcaGMmWBq9toOH9duXEYx8tdXp\nv5MEfXGVvl7UDOxo7GlrY0C7" +
       "ENR39+7sDIUDO3vugGOqRuahL7chSnfeSOzNDj8rFmPCOIwGiwkN\nnxITPF" +
       "YfTH8/xBF+woZwP3vwML08SdDOdZxrdofCnaG+QHgXQR4jzU9TjywXnt12hU" +
       "/bFA7kFZ5e\nv8K+cGAXKPSJHF2m8+Yk/w6sECRpimDdmUY8GY1+DeE5pLuY" +
       "U26HcYvllFs+JaeUMLESO0Y/zmPU\n053H6IX1YtTbGQoFwn3QzTIq2pqAtR" +
       "A6A/IpbMwxL/6gGAwdMJosGJr+fzC8YoOhJw/Dq+uFYVdn\nqDcQHlgnDOeA" +
       "CeI8BOnqOHwORouFQ8tnna0vQOsGuYURmZ6LbEmYlV2ag48v7Lu6vfna0y7k" +
       "WiMH\nF/l0tLxDXHzR3f6R65XN7az78CQEk6dp5ze3lZ/UCr6UMZMrC9BrWA" +
       "M9Ow3etNEgpOeSaOATfwah\nCMEfFDfeHHSHBmyZ7nfrZdNAZ09PINxPkD+H" +
       "/ufNNt7XIei+y3Ky9LTZuOIrKv/WJ25bun/7Bd3/\naw5q7ntcGdSmZFpR7M" +
       "dv29yrGzgpM0zKeBfHAXqXoLaboUFjmv5nL/4OX/ceQVtWXwenNrja5S8R\n" +
       "tLm4PORUa2aXvwxnkUJ58EH+h130CmgDUTr9y7KLbXWStxVZ/b/x64QO4BYA" + "AA==");
}
