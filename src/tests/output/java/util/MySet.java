package java.util;

public class MySet implements java.util.Set {

    private java.lang.Object field;
    
    public boolean add(java.lang.Object obj) {
        field = obj;
        return true;
    }
    
    public java.lang.Object next() { return field; }
    
    public boolean isEmpty() { return true; }
    
    public void clear() {  }
    
    public java.util.Iterator iterator() {
        return new java.util.MyIterator(field);
    }
    
    public boolean remove(java.lang.Object o) { return true; }
    
    public java.lang.Object remove(int i) { return field; }
    
    public int size() { return 1; }
    
    public Object[] toArray(Object[] o) {
        o[0] = field;
        return o;
    }
    
    public Object[] toArray() {
        Object[] o = new java.lang.Object[1];
        o[0] = field;
        return o;
    }
    
    public boolean contains(java.lang.Object o) { return true; }
    
    public boolean addAll(java.util.Collection c) {
        field = c.iterator().next();
        return true;
    }
    
    public MySet() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1356033002736L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZfWwUxxWfu7Pv/EXN2XwYbLABp2Dhzztj7PiPxrWNODiw" +
       "sU0oTtBlvTc2C3u3\ny+7c+UxT1LQU0kiNFCVtEpWGtmqLlEZtBQr9I20oTd" +
       "I2bZEa/5HQVokaEaWpWiLSqgUlqeibmd3b\nub0FkyKQZj0382be1++9NzM8" +
       "dxmVmgZqkM12Mqdjs31wfFQyTJwcVCXTnIChhPxKafnoqe1pzY98\nceRXkg" +
       "RVx2WzIykRqUNJdsSG+nMGatI1dW5G1Yi1T9Eud6/7ePb3x7fVB1D1JKpW0u" +
       "NEIoo8qKUJ\nzpFJVJXCqSlsmAPJJE5OonAa4+Q4NhRJVQ4DoZaeRDWmMpOW" +
       "SMbA5hg2NTVLCWvMjI4NxtMejKMq\nWUubxMjIRDNMghbHD0hZqSNDFLUjrp" +
       "ikP46C0wpWk+YhdAQF4qh0WpVmgHBZ3Naig+3YsYWOA3mF\nAmIa05KM7SUl" +
       "B5U0WKLRvSKvcfN2IICloRQm+7U8q5K0BAOohoukSumZjnFiKOkZIC3VMsCF" +
       "oJU3\n3BSIynRJPijN4ARBdW66UT4FVOXMLHQJQUvdZGwn8NlKl88Eb40Eq/" +
       "77yOjVJubzkiSWVSp/CBat\ndi0aw9PYwGkZ84XXMu1PxPZmGvwIAfFSFzGn" +
       "Gbjrp7vj751r5DT1HjQjUwewTBLyxz0Nq+YH3ikP\nUDHKdM1UKBQKNGdeHb" +
       "Vm+nM6oHlZfkc62W5P/mLsV3u/+Cz+ux+VxVBQ1tRMKh1D5TidHLT6IejH\n" +
       "lTTmoyPT0yYmMVSisqGgxn6DOaYVFVNzBKGvS2Q/6+d0hFAImg9aG+L/AvRD" +
       "UGjH3Dgm7TpBYer2\n+6lY91tjObq6etbno2HoDiIVELdVU5PYSMinLv32we" +
       "HtX32Yu4TCyOIL8Uh35cqyXZHPx/ZbXmgI\natkkDYB/nO5f/GibedaPApOo" +
       "XEmlMkSaUjEEjqSq2ixOJghDTlhAKQMHIKtqCkAGeE2osBEDNWie\nNdBaN5" +
       "icEIxBTwKEzB+5/of3E7NnqN+pn5Y4YoPVD3LZqlrG92174OG1AUo0W0INCq" +
       "TNC++ekN9/\nZMeZ13/35gYHtAQ1F8VS8UoaC27xRw1NxknINc72T3649crj" +
       "pX3P+1EJBBikGCIBMCBeV7t5FMRE\nv51fqLFgZeW0ZqQklU7ZSaGC7De0WW" +
       "eEYWIR/YQ5PKixXAKy1HTty8HON35W+QrT2M5i1UK6AzDw\nmAg7tp4wMIbx" +
       "N58affzrl4/fxwxtWZqgoJ6ZUhU5xwRZ7gPH1nrEZ3vdkie+0XLiDduTtc7u" +
       "A4Yh\nzVFH5h6aX/X0r6VvQexCDJnKYcxCBDFOyGZAvxtZv1WYpL/XWiQUXO" +
       "7A2EKzt+2Z1NTn//3SMxVN\nXBi6piGPm3psLxke3FGwKiEfOnwiOj++R+Fp" +
       "yJ3XXMSHX9z9zLUL5C1macf5lNuaXLGA90oCLntf\nz4aDPzmZ8qPQJFrMap" +
       "OUJvdKaob6YRKqizloDcbRooL5wkrB02J/HtwNbuAJbN2wczIG9Ck17Zdz\n" +
       "pDGaxWCycmjLoJVY+Yv9pZM19FOb8yGddvrYgnXs++k8dEK6oWQlWs6BMyuv" +
       "BqoT7c/F5zXgwROX\njrX85Y8XrDohnD8cqr8ljmbOfuXcvJ/GSDmcBCRzp6" +
       "MEnERoz8eqM7giUahUBc+sA8Raubm3swsE\nqgFO9OTSriQtFw/d03f+ncs/" +
       "Vq4yNhVM8gG6wuJTzkYExgFNN2kJEs5A1k7NI7pJk8kigUlsKJFr\nvPD9lu" +
       "tNbH9L6qBQzqzfoaxk7BSzegWTu6u7J9IF7IoKx93dkdZoWy/QTWyNjbczKe" +
       "naz9rmPwKV\nsFhbKqPlXVTDjP8pFrwUYO3D6UxKnAQpQnvGYhMTwzuZOZbA" +
       "Ycqh5p5iCSrngQja32AHsRPndnDS\n/me4k3YLTurUbU6LnKQCCufAeatudG" +
       "Bhh63jn/ug6pj08j4OqZrC2kc123TyIm65p0r2qKDlRNPb\nVJzFqpN03Nx2" +
       "sIOcHV/Vexrf3tJz6gvurFNF67iI+sJlCfn8j879edPFPx0FKSZRaOfI+OBA" +
       "fBgE\nbrwpu4QcztbvCuxXfsNgZCWAouNn4aL+wrCvMDCcntMTBXHSlA/+Mm" +
       "iN0IIWAIKu4GeOpp9dnrnb\nV+zX/YJfI67gi2uypMaGvnO+cv6xTM82v5X1" +
       "h+lHIWhFMd57WiOdbdFOAgE4dYCSjSxcROCIHpCS\nSXclGDWUFMRe1jq0Pj" +
       "/5r87kuxuHOHLqxMuQSLg1ch031753hdeAwnzkUUFcTB5b/b13z1waW8LR\n" +
       "x68P64pO8OIafoVgelTpFP9rbsaBUb+8cc1zR8bemrLNOQkBPKVpKoaCgoI8" +
       "oSBmKanA70uhVVp+\nr/xkfr/lgn6YABqhOogIeUhASJRNMM9+yRMAXV2tvW" +
       "00GS6i26w3mzieGRS8lFoBrdpSqvoOKXUM\nDKyYwymdzNGfGS85lkALW3KE" +
       "75AcX4OsL4ObDTZ7SOcrsmDyrEav7Nz3nV7i1UOrtcSrvUPiPUVQ\nmQKXW4" +
       "neyAX/nxT83+34/9ve/u+j/t8M9xJ7qzwG7JpR49SMmEXjpXITtOWWystvO8" +
       "09KyjR4yjx\nQ7jJFysRibZGom1RQLFPu8Uk9gNwn4FTWhbfEGIN0Oosher+" +
       "f4UE3ASUNLFhs2lhGU/nZRQt83PB\nMpsdy7zo6d5IN3UvHGiq+UYLBzgcUd" +
       "BKS+uVdwi5vyT88kL7Z91C0PPyOsv8yP77yU0Ptzuh5rAb\nFM3oR2e3X97Q" +
       "cPWbfuS/yfnX4yEnv0NCPh1o/sD/wrJmdmktmZJMXvrdL2DFD1wF71ZMkcq8" +
       "2hRh\nq2+itgiB1wQI8HvDoHC07fI+2kb64GgLgV6qtd+X20cXzQMire4Ohg" +
       "dd152du/occF30Drve1kh3\nW7Sbht3CTn8VsjrRmBnZ/IUCj1ffoupvC6r3" +
       "6sVSRzodqS95h0Rva19bdBOcui1p8jHhhURa79ZY\ncq25Q+Hw1wUtcyMJRM" +
       "tcEVzX6WWZLscy//S0TDQKloncqmVojK635Fp/2/n+Q0F64dDykSfwon2t\n" +
       "kR4LeLeY7/8DxdJ6YTA9Mz5V6S5oLZZKLberki8oqOTUYV/IU6XuLhZLPaCS" +
       "bBde4S1vUFNVuBfC\nzXZBVX1+WmKScN9WuaL07YCxoa9KdUX/p8BfvuW18w" +
       "9seEkPv8qTmv06XQZ36umMqooPHUI/qBt4\nWmG2KePPHlz1GlA9Lzwke/qH" +
       "yuoL8/mlMEbnaX+ZbrmQZ2z7LjOuY1mht5ncd18o2fXoax+xO1pI\n5v+5QR" +
       "/0ZbMjq8B1v2MgLalzJnvwoXP0QVXOGAZOE3aZtWStNPmO/AG/XnxqyPNqnt" +
       "g7OsxvB8Pi\nY0HnjR8LoqAKfSzweDI+YqAVXhoxLhbM2JMA5Re39vkf0KZr" +
       "0T4aAAA=");
}
