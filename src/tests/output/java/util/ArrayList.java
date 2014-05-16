package java.util;

public class ArrayList implements java.util.List {

    private java.lang.Object field;
    
    public ArrayList() { super(); }
    
    public ArrayList(int i) { super(); }
    
    public ArrayList(java.util.Collection c) {
        super();
        field = c.iterator().next();
    }
    
    public boolean add(java.lang.Object obj) {
        field = obj;
        return true;
    }
    
    public boolean remove(java.lang.Object obj) { return true; }
    
    public java.lang.Object remove(int i) { return field; }
    
    public int size() { return 1; }
    
    public java.lang.Object get(int i) { return field; }
    
    public Object[] toArray() {
        Object[] o = new java.lang.Object[1];
        o[0] = field;
        return o;
    }
    
    public Object[] toArray(Object[] a) { return a; }
    
    public boolean isEmpty() { return true; }
    
    public boolean contains(java.lang.Object o) { return false; }
    
    public java.util.Iterator iterator() {
        return new java.util.MyIterator(field);
    }
    
    public java.util.List subList(int fromIndex, int toIndex) { return this; }
    
    public java.lang.Object set(int i, java.lang.Object o) {
        field = o;
        return o;
    }
    
    public void clear() {  }
    
    public boolean addAll(java.util.Collection c) {
        field = c.iterator().next();
        return true;
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1356031351073L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZf2wbVx1/dtz89JqfbbMmadI2sIYlcRLHTtwIaJSm1K3b" +
       "Zkm20iyTdz6/pNee\n7253z45btmqIbt0mNDGt44com4ChIjQxtGrdH0WUsh" +
       "8MWCWI0DZAHaBO0/jRsglBK9go3/fene98\nsZMuUy2dfX7v+77v+/18f967" +
       "Zy6hFYaOmkWjmxzSsNE9MjEm6AZOjsiCYUzCUFx8eUXF2MmdiupF\nnhjySk" +
       "mCqmOiEUgKRAhIyUB061BWR22aKh+alVVi8lnAZfPGD+ZeO7ajqQRVT6FqSZ" +
       "kgApHEEVUh\nOEumkD+FUwmsG8PJJE5OoVoF4+QE1iVBlg4DoapMoTpDmlUE" +
       "ktaxMY4NVc5QwjojrWGd7WkNxpBf\nVBWD6GmRqLpBUE3sgJARAmkiyYGYZJ" +
       "ChGCqdkbCcNO5BR1BJDK2YkYVZIFwds7QIMI6BbXQcyCsl\nEFOfEURsLfEd" +
       "lBRAotW9Iqdx+04ggKVlKUz2q7mtfIoAA6iOiyQLymxgguiSMgukK9Q07ELQ" +
       "2qJM\ngahcE8SDwiyOE9TophvjU0BVwWChSwha5SZjnMBma102c1hrT6n/w0" +
       "fGrrQxm/uSWJSp/GWwaJ1r\n0TiewTpWRMwXXk13H4/uSzd7EQLiVS5iTjP8" +
       "iRduj717tpXTNBWg2ZM4gEUSFz8IN7fMD79dUULF\nKNdUQ6KukKc5s+qYOT" +
       "OU1cCbV+c40slua/Kn46/su/8H+G9eVB5FpaIqp1NKFFVgJTli3pfBfUxS\n" +
       "MB/dMzNjYBJFPpkNlarsP8AxI8mYwlEK95pA9rP7rIYQKoPLA9dnEf+U0C+C" +
       "qoZ1XThEXa9bA3tQ\n009T0aYd41nKpXrO46Hh6A4mGTxvuyonsR4XT1785b" +
       "2jOx9+iJuGupO5P0H1lDNXOscZeTyM55p8\nUCjKSTr/9+eGah7tMk57UckU" +
       "qpBSqTQREjKGIBJkWZ3DyThhXlTr8FjmKOBl/gQ4HPhuXAZGzMEB\nhYyONr" +
       "gdyw7HKNwJ4C3zR679+nJ87hT1AWqzBlt0sMBBLpu/Y+KuHXc/tKGEEs35KK" +
       "BA2r4097h4\n+ZFdp17/1YVNtgMT1L4grhaupHHhFn9MV0WchLxjs//af7a/" +
       "9/iKyPNe5INgg3RDBHASiN117j3y\n4mPIyjUULFhZNaPqKUGmU1aCqCT7dX" +
       "XOHmF+cRO7rwEAyuFaBVep6WHsl07W0a967kUUT5cOLJNd\n/VJpzxs/rnqZ" +
       "gWIlvWpHdpzAhIdQrW2OSR1jGL/w9bHHn7h07E5mC24MD0GlWjohS2KWybfG" +
       "A7av\nLxDO3Y0Nx7/aceINy9iF/DT7xfmWb/xc+BaEOoScIR3GLKIQ2wlZG9" +
       "DvTnbf5Zik/zew0XV5QK01\nf5H16waKfn2yIGsP1xCEbcKWKqMju8Z0KQXJ" +
       "JGNmu+en/tmTfOfWrTyTNTqrqJNwe9813F7/7nsM\n9wooaYKxOxe3C1Oqa5" +
       "PH1j39zqmL4w3clXnd2bgg9TvX8NrDVPRrWdBh/WI7MOqXbl3/zJHxtxJc\n" +
       "k7r8ZDGqpFOhp97EHVv8YoG0UwLVEVyB6RVa2lK9BSwF2yK/aanK5Vqq0Wkp" +
       "XkI4gveeuPhgx59+\nd94sSg4z2VR/iR9Nn37g7LyXBqHLRqztoXce1gpAoL" +
       "OkSEcqmHiVPH1/jqBytjISGgB56mAj2iV1\nS8numCoKcnTrt89VzT+WDu/g" +
       "ktzkIIhujWdbz3+v41obk8DcsNRR9sz/ZRlBt71Hoz/bIe8ULCqb\ne3s6ew" +
       "e7gj1QBkSGWANxploofDLoD8yXNtuwSUITvLtAbaPdlJUdU4kv/OvFJyvbeL" +
       "TTNc2Fgylv\nVVy85/CJ4PzEXolj4w4KF/Hhn9z+5NXz5C0eUrkETHdbn10o" +
       "4B2CozYMvp6pLf3RUykvKptCNaxX\nFBRyhyCnaaKbAhMbI+ZgDGzknM/v3L" +
       "j3DOUKTLM7Kh3bulO/HUJwn+9NdravgGs1XD4zNHyu0PAg\nZv872YJ29n1L" +
       "LjeXabqUEWh7DTvn2t1R7qqC7aphl6typLduiZx7+9Kz0hXmjpWMwTBdYMpc" +
       "wUYc\nIVKiagbtzByPBian9j2awbPRDmKGVmQgHAG8CjttuKcz2DVIUOXk9u" +
       "hEN9uHLk5YehyBFm+hvHQX\nEyZUx1xoJXN0aimWwZyTkLXK9o5HJydHd1th" +
       "UWNTc7uyvJN1JB5kB4fl0Q5EdRvRkGYxXelsa6DI\nAdQtxbpuloePff59/4" +
       "PCS3d5zagbAsSIqnXJOINlOwDdTHaxhwzL16r3tv55W/jkfe4IXEl7S2cE\n" +
       "5i+Li+d+ePYPoTd/fxSiagqV7d4zMTIcGwUkWxfdLi7WZppuK9kvvcp8xQyG" +
       "BY9G+YuG8kOgUsfw\nZKdM5gVCW16NaKUamDZcubwa4TDXUdtcg2w8Sr8eKJ" +
       "5J+zv7elgmLVETByjtdeTM+4FaSPLAC2mc\nfjO4XkJVZQw5xSyavYjN3Jen" +
       "7ga46k116z+2usdtdSO2uk8UVzfS2RfsCgY/krpfAYV0nFIzzIZf\nLqRVM1" +
       "xrTK3WLEsr+jeytCwncrI4YfhuDoZwjw3D0wS1FIahL9g52NUHuaia87rFaO" +
       "OOyhAppCBk\nF9RkKtj00RS87l73+4R3yAyKQkLcbIYLsn5vFMrPgn/MYuKE" +
       "+LQNca8N8QtFIQ72UohDBPmB0dL4\nNsK10VRt4w3C9wyEKFGZkPRRytEvsj" +
       "GapI7O7by0qfnKN73Iu0i7WOCQJcchLj5X0v6+98zqdvYQ\n6UsIBk997tOp" +
       "hYdPeWdKTOKqPIxWLoKR01Sv2KbqY42EommaVaLD4VDItt+rxe0XovbrhwJq" +
       "Qpaz\nYbGs1mGK1rH8rPazHFOaRFoWYerUd97WN1xI37Ct72+LZsb+Xiszeo" +
       "SlXek1hyvlC24Z6noEv2AL\nHiok+IAt+B8J2qJgMk2FF9WkpMxOHzA0KYn1" +
       "aVHV8TQRjIPTUkqTpyfE/TiZlrEehX/sWaGnsz/Y\nFen9FLRegtxtil0sv3" +
       "SZcnfdoCC8CMhJxmhKI4eKVhPqTQFTjsDyvclE+bKNsgPQfxT3hIHOvhD3\n" +
       "BJUZZWml/gpbmA8rRlGtaNnoNbXqvUHo/hsEkSCtCPSI3IHBhzYGjrbof0Wj" +
       "vz9Co3+AoFqLWy78\nrR64zu6BoyZNIa174AqZWoc+mtZeppiX/o2wryX19/" +
       "jAu4x0gmrhUN9TlVN/wO4PPP6i6odof9AP\n/UGNySyvgJFCetKEPGDqObB8" +
       "PZ1SN9hS99lSryrquKFQZ1+4K9h//Y7rqYFCb+QVek+zvatd6D0t\nxbGihS" +
       "JIC71xPYW+Aa6IiVPkxkSBZz08UorQievuDt2XUemLLt6e9xQSrx2uIVO8oY" +
       "+bejw9NpZB\nG8ve4hbk7XmInutQ8t1L69pJ1UnCM7zME08W6keOJT2VbVzw" +
       "Co+/aBI3zN+96UWt9he8T7FeBpXH\nUPlMWpad5xiO+1JNxzMSg6Kcn2pwTQ" +
       "HcilxCAKDpD5XXE+Hzn4YxOk/vP6OZ3smbMOuBf0LDokRP\n07LfOeO77dHf" +
       "/Jc9dpaJ/F0ifX8mGoGMZEgkMKwI8iGDnefQOfrOQkzrOlYIe+w2Za0yOEf+" +
       "vqzJ\neYSR26t9ct/Y6MJTjMHFTzGgNvjoKUaRlzNHdHRzIcXYZqZzsfMKuu" +
       "1Bk9f/AXSqfRK0HQAA");
}
