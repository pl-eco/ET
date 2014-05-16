package net.javacoding.jspider.core.util;

abstract public class Base64Encoder {

    
    final public static java.lang.String base64Encode(
      java.lang.String strInput) {
        if (strInput == null) return null;
        byte[] byteData = new byte[strInput.length()];
        byteData = strInput.getBytes();
        return new java.lang.String(Base64Encoder.base64Encode(byteData));
    }
    
    final public static byte[] base64Encode(byte[] byteData) {
        if (byteData == null) return null;
        int iSrcIdx;
        int iDestIdx;
        byte[] byteDest = new byte[(byteData.length + 2) / 3 * 4];
        for (iSrcIdx = 0, iDestIdx = 0; iSrcIdx < byteData.length - 2;
             iSrcIdx += 3) {
            byteDest[iDestIdx++] = (byte) (byteData[iSrcIdx] >>> 2 & 63);
            byteDest[iDestIdx++] = (byte)
                                     (byteData[iSrcIdx + 1] >>> 4 & 15 |
                                        byteData[iSrcIdx] << 4 & 63);
            byteDest[iDestIdx++] = (byte)
                                     (byteData[iSrcIdx + 2] >>> 6 & 3 |
                                        byteData[iSrcIdx + 1] << 2 & 63);
            byteDest[iDestIdx++] = (byte) (byteData[iSrcIdx + 2] & 63);
        }
        if (iSrcIdx < byteData.length) {
            byteDest[iDestIdx++] = (byte) (byteData[iSrcIdx] >>> 2 & 63);
            if (iSrcIdx < byteData.length - 1) {
                byteDest[iDestIdx++] = (byte)
                                         (byteData[iSrcIdx + 1] >>> 4 & 15 |
                                            byteData[iSrcIdx] << 4 & 63);
                byteDest[iDestIdx++] = (byte) (byteData[iSrcIdx + 1] << 2 & 63);
            } else byteDest[iDestIdx++] = (byte) (byteData[iSrcIdx] << 4 & 63);
        }
        for (iSrcIdx = 0; iSrcIdx < iDestIdx; iSrcIdx++) {
            if (byteDest[iSrcIdx] < 26)
                byteDest[iSrcIdx] = (byte) (byteDest[iSrcIdx] + 'A');
            else
                    if (byteDest[iSrcIdx] < 52)
                        byteDest[iSrcIdx] = (byte)
                                              (byteDest[iSrcIdx] + 'a' - 26);
                    else
                            if (byteDest[iSrcIdx] < 62)
                                byteDest[iSrcIdx] = (byte)
                                                      (byteDest[iSrcIdx] + '0' -
                                                         52);
                            else
                                    if (byteDest[iSrcIdx] < 63)
                                        byteDest[iSrcIdx] = '+';
                                    else byteDest[iSrcIdx] = '/';
        }
        for (; iSrcIdx < byteDest.length; iSrcIdx++) byteDest[iSrcIdx] = '=';
        return byteDest;
    }
    
    public Base64Encoder() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVYfWwcRxWfu7PP3zj+SGrVTuwkBmwSn90kduIYVbi2o1xy" +
       "iQ9f09Krq+t6d87e\nZG93uztnX9wSFUiTUlFQ1TYtIm0FAgVBVUFDyh8gQt" +
       "WW70jIf7QF1AoUVBVBqlYINUJF4b2Z3du9\nvYtNi6WbnZ15b96b937vY/3s" +
       "FVJtW6RLtmPsuEnt2EQqKVk2VSY0ybZvhaWM/Ep1XfLcQd0Ik1CC\nhFWFke" +
       "aEbA8qEpMGVWUwPjlWsEiPaWjH5zWDOeeUnbJ36wdLvzt9oDNCmtOkWdVTTG" +
       "KqPGHojBZY\nmjTmaG6OWva4olAlTVp0SpUUtVRJU5eB0NDTpNVW53WJ5S1q" +
       "z1Db0BaRsNXOm9TiMt3FBGmUDd1m\nVl5mhmUzsi5xVFqUBvNM1QYTqs3GEi" +
       "SaVamm2PeQEySSINVZTZoHwg0J9xaD/MTBfbgO5PUqqGll\nJZm6LFXHVB0s" +
       "0R3kKN649yAQAGtNjrIFoyiqSpdggbQKlTRJnx9MMUvV54G02siDFEZuvO6h" +
       "QFRr\nSvIxaZ5mGOkI0iXFFlDVcbMgCyPrg2T8JPDZjQGf+bw1HW38z0PJ93" +
       "u4z6sUKmuofw0wbQowzdAs\ntaguU8F4NR97LH5HvitMCBCvDxALmvGP//hI" +
       "4u2L3YKmswLN9NxRKrOM/MFI18aV8b/WRVCNWtOw\nVYRCyc25V5POzljBBD" +
       "RvKJ6ImzF38+czv7jj/u/Rv4dJbZxEZUPL5/Q4qaO6MuHMa2CeUHUqVqez\n" +
       "WZuyOKnS+FLU4O9gjqyqUTRHFOamxBb4vGASQtbBLwS/m4n4a8AB4uUWyaYj" +
       "u6Z02VCoFTMZGdIp\nm0UIwAo4f/aobaqwNSsbFp1FrWcDLAUU0rwUCmG0Bm" +
       "NNA2DuNzQgzMjnLv/mvqmDX35QeA7R5qjH\nSAyExjyhMUdoDIUKU5UIJaEQ" +
       "F3dDqTnRPwqG0T+eH1v31QH7hTCJpEmdmsvlmTSnUQg/SdOMJapk\nGMdfiw" +
       "/rHGKAz8Y5gCrokNHgIB4aYL9Fi2wJQtIL5DjMJMDZyolrv38ns3Qe0YPebs" +
       "fThWrgu2NC\nt8b+1F0H7n5wSwSJlqrQLUDau/bpGfmdhw6df/W3b/R50Gek" +
       "tywiyzkxooLqJy1DpgpkLO/4J/69\n/91Hq0cvhEkVhCkkKiYBvCDqNwVllE" +
       "TWmJul0FjA2ZA1rJyk4ZabWurZgmUseSscMk04tAj0oLEC\nCvIEd/VL0aHX" +
       "ftrwCr+xmwubfUkzRZmIrBbP1rdalML6G08mH338yuk7uaEdSzMSNfNzmioX" +
       "uCI3\nhMCxbRWiPNbR/tiZ/rOvuZ5s804ftyzpODqy8IWVjV//pfQUZACIRF" +
       "tdpjzQCJdEXAE4buPz7b5N\nfN/ikCC4gnGzD2uA65nc3L3/eunp+h6hDPJ0" +
       "+WVs5eMnxA3DjNRKcwAASebg7XOFeHoUmS2y8Xpp\nlpeI0597r/GU9PJdIh" +
       "m2lsbalJ7PDT/zOu3/TKNcIaDrmGEOaHSRat4lg9IO8fLj3rL59u6/7Bs5\n" +
       "9/ngLcOYVqjLMzVxqJQtI7/43MU/Db/+x5OgRZrUHJ5OTYwnpkDh7lXFZeSW" +
       "xc7PRhbUX4V58RPR\nVFY0S5nG/NcEWFsUar6OBsOVOu7WHq47ptsO+H0afk" +
       "1OyuVP3GzFoc1BfpkLIwyQruoSr2t9gFib\n9yOVARUqZpAOv41ElRI17b6z" +
       "l0/1//kPl5y65+unPKq/ZU7mX3jg4gq3RR10NpJ92LsndFY4C/Fu\nAzICz5" +
       "7ejetFCTiM0EPO3btHQJ9WEISNWExVYglDlrT45DdfbFh5JD9yQGjS5COIT2" +
       "YK3Ze+03+t\nh2vgCIz6KqvzXrMoWYc9oOFjmpHRD1uz9t60c/uuXQPDo6Az" +
       "BEtcN/OM27QdejIe61gTYqL/WTuU\nJxmWDU8CJ0oIs6Q9swzz9SQOdzJy82" +
       "pKqzlTm03xBacRjcMKKD46un14aGDPzk8xMvbhimbMryHq\ncIRwfcbLALve" +
       "Aez6/xGwON/P0YpDfC2ktvsgyLMpIvDk0sErfV3vfyNMwqsgsEJrWDwhIz8f" +
       "6X0v\n/JMNvbyAVeF1OUiDPXV5y1zSCfNrNpiYHzv9MZW01BxAcdFpJy+k/z" +
       "mkvLVtUoC5w/+Z4ifcv+Ma\n7W17+12eIwP3qtCzBoQ8sunbb52/PNMuMqxo" +
       "7LeW9dZ+HtHc8zs08jtsXk0Cp3552+ZnT8y8ORd2\n0LyXgfGOM+iPolzfnR" +
       "V8WGKZkmqVke9ZPrtzJXW7KiwTvGGAePlnR56+eom9KexTbDpQ4uZCeWG8\n" +
       "TfL1Q3teXWyJ/uCZXJjUpMk6/mUl6ew2Sctj/U+Do+0JZzEB6ca/X/qdIxLh" +
       "WLEMdAVN7BMbbHf8\nBaGqNDE2mYUQ4TlqqUKl9qKmAJbWqD7PFjjBgikiKM" +
       "dIBKDqumEY15xkhM4IO+XRSVttXtqa0Ayd\nYsPr7olGVDVixe9W2CyUuZVn" +
       "A5G15ssVDvn7ieskwzUz5QNQ3GRUr0K2FV4ghWLC3DPkJcyvfZQs\nv+OmYp" +
       "ZHQE9CtVlbxUylZE6FWbSKNrOKfn5ydT/juIzDvTicKfMlvt6PwxdXdc4ZHE" +
       "79f454Coev\n4PCwz+K7Rz2Lf+sjWnzHroGRIfi299vwk3aP6JVQVlMJE7bX" +
       "HWX/ohH/SJC3rNzd95LZ8muR0d2P\n/VroC7J5TfNHnm8eNS2aVfkta904xM" +
       "d3GelZq2RC6sMHt8I5wfZ9RjpXYQMOfPg5nmNkQ2UORmqc\nmZ/+h4x8rJSe" +
       "kXrvxU/6I8gJQIrTCxxxDxfM/wKrrcljKhMAAA==");
}
