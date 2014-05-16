package net.javacoding.jspider.api.event.engine;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class SpideringStartedEvent
extends net.javacoding.jspider.api.event.engine.EngineRelatedEvent
{

    protected java.net.URL baseURL;
    
    public SpideringStartedEvent(java.net.URL baseURL) {
        super();
        this.baseURL = baseURL;
    }
    
    public boolean isFilterable() { return false; }
    
    public java.lang.String getComment() {
        return "Spidering started at \'" + baseURL + "\'";
    }
    
    public java.net.URL getBaseURL() { return baseURL; }
    
    public void accept(net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.visit(this);
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcRxWf88edz77Gn4lN7MROYkhNfXf2+aN2LKDGdmQn" +
       "l/jqc1JydXVd7845\nm+ztbnZnz5eQRqCWpgSpqEr4kkIrykcEiihqaPkDRI" +
       "ja8h0J/EdbQK1AqaoiSFWEUCMoCm9m9rx7\ne+e6qKml3RvPvJn35r3f782b" +
       "vXgdVZsG6hDNCDmuYzMykUwIhomlCUUwzXnoSosvVAcTF/aqWgXy\nxVGFLB" +
       "FUHxfNqCQQISpL0ZnJsbyBunRNOb6kaMRep2SVXTveWf7t6T3tlag+heplNU" +
       "kEIosTmkpw\nnqRQKIuzi9gwxyUJSynUqGIsJbEhC4p8AgQ1NYWaTHlJFYhl" +
       "YHMOm5qSo4JNpqVjg+ksdMZRSNRU\nkxiWSDTDJKghfkTICVGLyEo0LptkLI" +
       "78GRkrknkMnUKVcVSdUYQlENwUL+wiylaM7qb9IF4rg5lG\nRhBxYUrVUVkF" +
       "T3R6Z6zuuHsvCMDUQBaTw9qqqipVgA7UxE1SBHUpmiSGrC6BaLVmgRaCNq+5" +
       "KAjV\n6IJ4VFjCaYLavHIJPgRSQeYWOoWgjV4xthLEbLMnZq5ozfpD/z2TeL" +
       "uLxbxKwqJC7Q/ApK2eSXM4\ngw2siphPvGFFzs0csjoqEALhjR5hLjP+4R8d" +
       "iL9xuZPLtJeRmV08gkWSFt8Z7tiyMv5asJKaUaNr\npkyhULRzFtWEPTKW1w" +
       "HNm1ZXpIORwuDP5n5+6DPfw3+rQDUzyC9qipVVZ1AQq9KE3Q5AOy6rmPfO\n" +
       "ZjImJjOoSmFdfo39D+7IyAqm7vBDWxfIYdbO6wihADw+eHYi/ldPXwS1JnVZ" +
       "wjTKgHqDYGkqh1US\n0Qn6hIrJAoWCqEkwvHDEZJILgi4vYCq0gNUlUL+wxg" +
       "p5qrt+2eejJPZSUAG8TmsKzEuLF679+uTU\n3s8/wgNKQWhbTdDHwIaIY0PE" +
       "tiECNkSYDRFuQ6SsDcjnY9pbi51OoyhRsv396bGGR8PmsxWoMoWC\ncjZrEW" +
       "FRwUBSQVG0ZSylCUNpo4sRDIiA4tAiABr0pRVYiBEIvJwz0HYvcB26z0BLAD" +
       "SunLr5uzfT\ny5coxigmWujq3DSI8FFuW6gned+e+x/ZXkmFlqto8EC0e/3V" +
       "0+KbZ/ZdevE3r9zuEISg7hLels6k\nvPOanzA0EUuQ15zlv/Lv6bfOVo8+U4" +
       "GqgMyQzogAEYDcsNWro4h/Y4VcRp0FM+sympEVFDpUSEC1\n5LChLTs9DEG3" +
       "sXYDOKAOnmp4NtoIbqYvOthEX80cb9Sfnj2wTHnjQX/fSz+pe4E5pZBU613Z" +
       "N4kJ\np2ijE455A2Pof+WribNfun76XhYLOxgE+XVrUZHFPLOv1Qexby6TLi" +
       "JtLee+3HP+pUKwm53Vxw1D\nOE5jnf/sypav/UL4OqQSoLQpn8CMsb7VsLfh" +
       "wpJTE/t4AuLp6uT5aw/3/PkPV+2U5joqHam/ph+y\nnv3c5ZUK6uIgHFqCub" +
       "/AMXZo0paPHSQQRgZ52hNk/qzlNO4n9sz+kcERMKgJNNFDNiJLkbgmCsrM\n" +
       "5Deu1K08Zg3v4abc5hKYmUznO69+u+dmFzPB1uh3ZU37/0BOMPY79Kc/MYKm" +
       "32ce2tU/2jswEB4c\nJCiwKJj4wFychayFoBALBs0x0FkIJH33snaYAowFAT" +
       "EvbLdFKM+9GW03PbQLJMkufvpfzz1e28WD\nTud0rMay3R3Lollp8diJ8wMr" +
       "yXtk7kPvceYRPvHTA4/fuEpeZYh2eEi1bcuXGnhQcKWIkRdzjf4f\nPJGtQI" +
       "EUamAliaCSg4JiUbynAAvmhN0Zh1i6x4sLBA6zsdU80+HNAS613gzgpHpoF8" +
       "POIf0GeDbD\n02iTvtFDeh9iOJliE7rZe+cqRYO6oRGwD0t5T/CjHNd7Xbi+" +
       "04Nr7u7Ju0avvHb9Kfltht1aVpuN\n0xm24UHW4yJUpaabtApwlaH2St2zuj" +
       "nG1A4W1A7GRkZvAcIHYr39Q+EYkCU0Pz2TjNg7parizsZP\nQflRuj9qle1b" +
       "1MRwt4GxgoY3MqVaWfcgHMlVc1Pjk3TlEZZv2X4+YvPCoU6HTRvw6Za1SjlW" +
       "hp7+\n1D9CDwvP38ch31R8UlP1Q0+8jHvuCollqoMg0fSwAh5SHF56te1jJW" +
       "4BgvX3dP5l9/CFB7zErKI1\nipuYxdPS4pXvX/7T0Mt/fAisSKHA/tnkxHh8" +
       "CgzufFd1abEx13535WH5lww9NkdKCvPiSWPFzKg1\nMNwr1PkifnQVHYrb4G" +
       "m1o9Ra7lB0xWiN9LZu7gPeh2Rzt6zANYAWSd5MljDkLOTynF1rP5P6Z5/0\n" +
       "+h2TPKxt7jucW3A6dhN3N7/xFs9hxWdTmQzoUfLY1m+9funaXAuHBr/17Ci5" +
       "eLjn8JsP21BIp+Dc\n9m4amPTzd2y7eGru1cUK2xH3UkJpmoIhISI/Tx6IuW" +
       "yxKChb4Wm3g9L+AQXFIqh2CZMJLZuFROBO\nbCddiW2UDQzQ1wO3INnE7uzt" +
       "7w8P9BHU7OjeaXZxnBaO1gYnifBLZDkfUb902j7q/IB89CD30SdL\nk/8Zx0" +
       "dDfY6PvkDQx9fwUVaTFnTFAvcsQFFJZi2iWyTBOmgW7usd6gsPj3wUds8vJ4" +
       "5eljDLuaAX\nnh22C3b8fy4o1IeuLZ11banf2dK5W3HGDPXGoIoaAPjnZCjb" +
       "NKMQ6vC6lzS2xkE+a/2IfZHyShSx\nzhGt6HzKMTh7chr9xsNZ14fgUN9Y1l" +
       "xaaLeVfPXh3ybE7Sv33/6c3vgrdn9Z/X5QA+VoxlIUd03i\navt1A2dkZl4N" +
       "r1C4w79J0M73eEcFu3mD7eZJPv87BHWtN5+gavbrnvddgjavPY+gSni75S8S" +
       "tKm8\nPMTTbrnlnyJoQ7E80Mj5xy36NGgDUdq8pLvB+ENXDhrWC2jZ9V6v9F" +
       "PsZw4D0eyw0oTd4qpgkjoW\nZXr3yD/546q7H/39f9gpGxD5hzv6sQqKMAbW" +
       "6LgqKMdNVtXSMXqBFy0DLqeElSN2lOtMviL/ONXu\nruFWdXXPH0pMlZRxo3" +
       "23gmLDvbFYODYMQKdl3Pv+/gEF34fKuYttwV3W0c0csLX+D61X8cl3FQAA\n");
}
