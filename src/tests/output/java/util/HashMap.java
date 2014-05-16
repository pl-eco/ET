package java.util;

public class HashMap implements java.util.Map {

    public java.lang.Object field;
    
    public HashMap() { super(); }
    
    public HashMap(int i) { super(); }
    
    public java.lang.Object put(java.lang.Object key, java.lang.Object value) {
        field = value;
        return value;
    }
    
    public boolean containsKey(java.lang.Object name) { return true; }
    
    public java.lang.Object get(java.lang.Object key) { return field; }
    
    public java.lang.Object remove(java.lang.Object key) { return field; }
    
    public int size() { return 1; }
    
    public java.util.Collection values() {
        java.util.Set set = new java.util.HashSet();
        set.add(field);
        return set;
    }
    
    public java.util.Set keySet() {
        java.util.Set s = new java.util.HashSet();
        s.add(field);
        return s;
    }
    
    public java.lang.Object clone() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("", field);
        return map;
    }
    
    public void clear() {  }
    
    public java.util.Set entrySet() {
        java.util.Set set = new java.util.TreeSet();
        set.add(field);
        return set;
    }
    
    public void putAll(java.util.Map m) { field = m.get(""); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1328736730000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZe2wcRxmfe/jssy/xM6mJHdtJDcTEzzufHzF/1LId2ck5" +
       "dn1uQ0yt63pvbG+z\nt7vdnTufTYkolKQNUqWqpbxCKwooEkSACC1IIELUF6" +
       "9IYEEfVK2AVKUIEhUQaiiF8M3M3u3e3l2c\nEjnS7o1nvvkev+8x32zOXEIl" +
       "ho4aRaOTrGrY6ByJTgu6geMjsmAYszAVE58t8U+fPqiobuSKILcU\nJ6gyIh" +
       "pdcYEIXVK8a2J0KK2jFk2VV5dklZh88rjsu/ndlV+eONDgQZVzqFJSokQgkj" +
       "iiKgSnyRwK\nJHBiAevGcDyO43OoWsE4HsW6JMjSGhCqyhyqMaQlRSBJHRsz" +
       "2FDlFCWsMZIa1pnMzGQEBURVMYie\nFImqGwRVRe4SUkJXkkhyV0QyyFAE+R" +
       "YlLMeNu9Ex5ImgkkVZWALC7ZGMFV2MY9d+Og/k5RKoqS8K\nIs5s8R6VFECi" +
       "2bkja3HrQSCAraUJTJbVrCivIsAEquEqyYKy1BUluqQsAWmJmgQpBO0oyhSI" +
       "yjRB\nPCos4RhB9U66ab4EVH4GC91C0DYnGeMEPtvh8JnNW1O+wH9OTr/dwn" +
       "zujWNRpvqXwqYmx6YZvIh1\nrIiYb7yS7Hxk4kiy0Y0QEG9zEHOa4fd//7bI" +
       "m+eaOU1DAZqphbuwSGLiu32NO9eHX/d7qBplmmpI\nNBRyLGdenTZXhtIaRP" +
       "P2LEe62JlZ/MnMc0c+8Q38Fzcqm0A+UZWTCWUC+bESHzHHpTCOSArms1OL\n" +
       "iwYmE8grsymfyv4GOBYlGVM4fDDWBLLMxmkNIVQKjwueDyP+z0NfBPnHBWN5" +
       "UtA6NYJqqePvoIrd\nkZ1NUw6VKy4XTUVnIskQdeOqHMd6TDx98ef3jB184H" +
       "7uFhpKpmyCqilfbrDJF7lcjONNuXBQfOM0\nDf763aGqBzuMp9zIM4f8UiKR" +
       "JMKCjCF9BFlWV3A8Rlj8VNtilYUIxFdgAUINojYmAyMW2mB/Ske7\nnSFlJe" +
       "IEjASIk/VjV391ObZylnqfeqvOUhywP8p1C7RF5w/cef9uDyVa8QKKbiBt3Z" +
       "h7TLx8cvLs\nC794dY8VugS15mVU/k6aEU71p3VVxHGoOBb7z70z/tbDJYNP" +
       "upEX0gwKDREgPCBrm5wycjJjKFNl\nKFiws2JR1ROCTJcypaGcLOvqijXDom" +
       "ILG1cBAGXw1MLjM2OL/dLFGvqq5TFE8XTYwGrYlU/5ul/8\nUcWzDJRMuau0" +
       "1cUoJjx5bHE0q2MM869+fvrhz1468VHmC+4MF0E+LbkgS2Ka6XeTC3xfWyCR" +
       "O+vr\nHnm07dSLGWfXWtyHdV1Ypb5O37u+8wvPC1+GJIdkM6Q1zHIJMUkoI4" +
       "C+29m4w7ZI/97NZptygKo3\nf1Hm1wkUfX2gIGsXtxCUbcAZU8ZGJqd1KQFl" +
       "JGXWuSfn/tEdf2PvKK9h9fbz0044HryKW2vffIvh\n7ofDTDAOZbM2v5g6hD" +
       "zU9LU3zl6cqeOhzE+cm/OKvn0PP3WYiQEtDTbsupYERv3M3l1njs28tsAt\n" +
       "qcktFmNKMhF+/CXcdktALFB0PHAuQigwu8Ibe6rHJKGVwlnn9tMDOZNmiYWP" +
       "/fPpx8pbeNjQPY2F\nvZKzKybevXYqtB49LHFbnOg6iNd+fNtjVy6Q17hvsp" +
       "lMpe1K5yt4u2ArMgMvpKp933k84Ualc6iK\ntRuCQm4X5CTNmDloGIwRczKC" +
       "tuSs5x7+/KQbylaqRqd7bWKdNcTyBYwpNR37C5SNbfB4zWzwOrLB\nhTQ6OM" +
       "ASgoAA1hhBSNth5lryoLzn1MXjbb9/+YJ5wtsi36L6c+y+5FOfPrfupnXNEf" +
       "ash6QjF+ur\nAPFYru7l/DycIqiM7RzoD4E+NSCItpydUtx05Ogtg+dfv/Rt" +
       "6W0mpZwpPkw3mGL8bMYm16NqBu0d\nbM2ryal1SjNo/d9iEzIxGks3X/h629" +
       "UWxt9U2mfrQ8y/S1OCfsieFdzg/oFwH/RyBY77feGB9lDH\nAEHls+MT0U6m" +
       "Jt08nYH/GPQw+eZSJU0nohoG/lZWTWkcsUS1L4IapYdnJmZnxw4xPOqgDbao" +
       "uadY\nIUzbKiGyUjeTb3Q8yR0iWA4JahmmW6yCDrbRirOzWFfJqs2Jj/wtcF" +
       "x4Zt5tloQhgIuoWoeMU1i2\nqoOTySRrojOJUHm4+Q/7+05/3FkeKmj/ZI/b" +
       "3G0x8fy3zr0Sful390HKz6HSQ1PRkeHIGADZfE1x\nMbE61XCrZ1n6KYsEM1" +
       "PzWv/cTUO5+VmuY7i5KLM5kd6Sk6Xt8PhNF/rf25nlNlskm7cMy1thR/pE\n" +
       "VFGQJ0a/cr5i/aFk34GMK6L0BeW8oVDIDrb3DHYEB6HkH8WrlHDeLmzVEtbH" +
       "5pP0tVaUV6inozcE\n0Z6iBZFx2/jwUEG2liR2sfdaYnstsZ+EKlpIbG+4Pd" +
       "gR7P4QZEaCTiRZAswjtlPOccUeeLaartj6\n/7UPNjVPWmr2W2p+poiaPb3t" +
       "wYGOEECdjZ/rQOc4QRXmEWYcxKuMJqzxffvA4gVVlTEcQeZh3VPI\n6iZ4qk" +
       "yrq27Y6i9aVg9aVn+pmNV9eQG2sdGPAvUSzgmJJyypA5bUrxaJRJAKUHcTFA" +
       "A2HzRaeJIW\nDYtd8NSZANXdMEDfzKo60GOpeqYIQMHu9mCwIxR8TwCdBn/r" +
       "OKGmsF3wWUtwtyX4e0UwAsGAEWRr\nJee0MUw1ZgOOMr/XD9N1N/0/IPyqQM" +
       "eDhZRogGeHqcSOTVLiHMDLSphhh/c5C96gBe/zxeClIRjs\nB3g5pyy8mRPW" +
       "dj8eUWUZzm1oPQpZTCOy1bS4dZMsvgAWQ/hFc5PuN5bFYcvi3xaxOMQshqSr" +
       "5Jzy\nLLb1FLBcyNTt8Ow1Td27Saa+AueTKKtKTur80bLUVl4uFrG0N0QthZ" +
       "TdyhhtnDnUhT2mXT2bZNef\nmF1Y0J1nhDel0o+7/IDoLgZ7yFQvtEnq/R0Q" +
       "xgrRnTH2ryzyg7Zq+U4R5MM9JvLVGV454L/stM5v\nVoxB07rBG63uLrelr9" +
       "WbuDxFqnu4vz3Y0xGEC4MrQYnFjYH6L/sGQ4Zl9mn2MkrDKW8ypF9a6vM+\n" +
       "yPPPxuLu9Tv3PK1V/4x9wMp+2i2De81iUpbtV0rb2KfpeFFicsv4BZNbGYD2" +
       "PZutEEL0h2rrquDr\nlTBH1+m4il005+kdoc7WjUY1LEq0H00/8UPvrQ/++t" +
       "+syS4V+f8M0K/hcF9LSXDl6hpWBHnVYFdr\nuka/Q4pJXQcXs0uGqWuFwTny" +
       "r98N9uteVlbr7JHpMf6dJGq7sIWvdWGDI9BLL2wFP7bCle19hYxi\ngsygYh" +
       "czKnLO5PQ/K2lmqH4ZAAA=");
}
