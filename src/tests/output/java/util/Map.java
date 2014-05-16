package java.util;

public interface Map {
    
    public java.lang.Object get(java.lang.Object key);
    
    public int size();
    
    public java.lang.Object put(java.lang.Object key, java.lang.Object value);
    
    public java.lang.Object remove(java.lang.Object key);
    
    public java.util.Collection values();
    
    public java.util.Set keySet();
    
    public static interface Entry {
        
        java.lang.Object getKey();
        
        java.lang.Object getValue();
        
        java.lang.Object setValue(java.lang.Object value);
        
        boolean equals(java.lang.Object o);
        
        int hashCode();
        
        String jlc$CompilerVersion$jl = "2.4.0";
        long jlc$SourceLastModified$jl = 1328736758000L;
        String jlc$ClassType$jl =
          ("H4sIAAAAAAAAAL1Xa2wURRyfu7bXaykpfVBq3xQINtDrQ1oe9YNNadNrD1pa" +
           "fFAgx9zuXLuwt7vs\nzrVXRIKRpx9MCPjAAMZEQ2KIHyTgFxMkgK9IYvoF1G" +
           "g0GIJRDMYYicHgf2b2envb45H4uGRn52b+\n//m/f//ZUzdRjmWiKskK0EmD" +
           "WIGu4UFsWkTuUrFlrYelsHQpJ2/wZL+me5EnhLyKTFFhSLKaZExx\nkyI3BV" +
           "d3JExUZ+jq5KiqU/ucGaesWnBn4vP9fZVZqHAEFSraMMVUkbp0jZIEHUEFMR" +
           "KLENPqlGUi\nj6AijRB5mJgKVpUdQKhrI6jYUkY1TOMmsYaIpavjjLDYihvE" +
           "5DKTiyFUIOmaRc24RHXTomhOaCse\nx01xqqhNIcWiHSHkiypEla3taBfKCq" +
           "GcqIpHgbAslLSiiZ/Y1MPWgTxfATXNKJZIkiV7m6KBJ2rd\nHNMWL+wHAmDN" +
           "jRE6pk+LytYwLKBioZKKtdGmYWoq2iiQ5uhxkEJRxT0PBSK/gaVteJSEKSp3" +
           "0w2K\nLaDK425hLBTNdZPxkyBmFa6YOaI14Cv468XBP+p4zLNlIqlM/1xgqn" +
           "ExDZEoMYkmEcF4Ox44EtwQ\nr/IiBMRzXcSCpnPR+0+GbpyrFTSVGWgGIluJ" +
           "RMPSnfaq6qnOH/KymBp+Q7cUlgpplvOoDto7HQkD\nsrls+kS2GUhufjj00Y" +
           "bd75CfvMgfRD5JV+MxLYjyiCZ32fNcmIcUjYjVgWjUIjSIslW+5NP5f3BH\n" +
           "VFEJc4cP5gamY3yeMBBCfniy4KlG4lfMBopy1mAjYEDdsKBvYkpt4isJxlk4" +
           "4fGwEnQXkArZ1qur\nMjHD0slrn+3s7j94QISDpZAtk6ISdqYwFM5c2K1Rcx" +
           "J5PPzMeemOYJ6VWQH8/F7HnJcarbNelDWC\n8pRYLE5xRCVQOFhV9QkihynP" +
           "nCJHlvLkgMwqiECSQb6GVTiIJzVYPm6iencypUowCDMMGTK16+4X\nv4QnTr" +
           "O4sziVplQHr28TuhU0DG/u23KgPosRTWQzByZ48cxjUtxe6mFlnDw/Fnn29w" +
           "sn8uvE+Yyn\nKnkACHNzstK+/YKv+coHsy5xvyZRoNABF8OEipwqSum63iQE" +
           "1r95bfDwyzf3b+SKCk2zKfLjCJiN\nJUrBsUnQoMhnxCOqIsHE4rjnMKkkQ/" +
           "4HykuPvNJw7EpGS6rvVbYccvY/82vBPnxxsyiu4vQM6Nbi\nsbY3rpKGJwqk" +
           "DLnks0F4Wje3qDUcy5L+Lny69vue9pPPubXkHYUkebq71qSzhaXz7577uu3q" +
           "V3tA\nhRGUu3ZguKsz1A3a1t5XXFgqGq9clzWmfOLlSMpQKQMCpzN1OG0EID" +
           "cJNBCNeYut5CVmJu6gqUtE\nhi6Tkvvqn723DuesPONF2QCt0FwoBkgApK5x" +
           "C09Dw45kTjFRwDkrqpsxrLKtZDvIp2OmPpFa4Ygw\nm8/ngCc98LB3qY0n/M" +
           "02i9lQIvCDU9fzcZHIQy+bL2ZDg51oHjY2QlwccNFpmniSlVzi+anqox/j\n" +
           "44CygHaWsoNwMENp1WefwMZOxyb7/zhkziih/WQSBJQ7Ay9wXKD+zmPX9jV8" +
           "9+VluzM4bhwpqh/D\ne+Jn956b4gHOg96PrbWp4MHdg808vB+D/zlKiTCyMV" +
           "/gaS8rQsa5snkZ6FMMgthVJaDIgZAuYTW4\n+s3zs6YOxdv7hCazHQTB1eFE" +
           "7eW3G+7WcQ1sgT5H77H/545jc22qdNgrSNE8F76vam1e2tLY0g6Y\nIvyz2K" +
           "oTCcj9WApXEx4OBrAB4QXEd5anZQDrImV2BpT9wwxwx++BwV0H7gTln8JqXO" +
           "Roj3DzSMrN\nbXy9jw0bMzmhlTlhBbST5DnTbmAsA5lMroGn3Da5/F8y2cPJ" +
           "PE4jSMqI5SkjonDBmGHEsqUtyxtb\nV0IzH2cmcM0f7D24pfmtDN6LpQS3pw" +
           "RrmbwHghsfawbvWQ/tvUfgqbC9V/HfeS+RMmJFyojJTN5r\nX9rS3ti6jCKP" +
           "/pCeA3T1ke1xrFpQxJVOUBk0lRjU4rh94zwz8luzfH3JalHN5c4vGSdhb+td" +
           "srDk\nxi3e9lzQkuFa6xJyqOat66evDZWKpinu/gtmXL+dPOL+z00pMFjbnn" +
           "8/CZz64pL5p3YNfRvx2i6A\noOdGdF0lGBLDx1VuyRTuQniq7HBX/d/4cBCS" +
           "YAxbY126LDJ8tyGY9lKUBTegpOZtLF1y+PU0CX6z\n066urHfM+IgUnzpS/d" +
           "SWRy8YRZ/yBjz9OeIHXI7GVdXR35293meYJKpwJf2ir4q0fR2uZtOSKcpm\n" +
           "L67SUbF/HNbYPpufMES6Gn8DlgLK6ikPAAA=");
    }
    
    
    public boolean containsKey(java.lang.Object o);
    
    public java.util.Set entrySet();
    
    public void putAll(java.util.Map m);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1328736758000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1YfWwcRxWfu7PPvuRSf6ax6iS2k4Zieh++O/sS139Q13bI" +
       "xZf46msENVeue7tz\n9sZ7u8vu7PmclgCiTVokKpV+ItIiECgSRAi1agEJKV" +
       "RN+RJByP80BYFAgagFiooQokJF4c3Mnndv\nfUmo2sbSfnj2zbz3fu/33pu5" +
       "M2+iVtNA20UzRlZ1bMam8jnBMLE0pQimeRcMFcVXWkO507Oq5ke+\nLPLLEk" +
       "EdWdGMSwIR4rIUz0xP1Aw0qGvK6qKiEXudDavctvudlV+ePNgfQB0LqENW80" +
       "QgsjilqQTX\nyAIKV3ClhA1zUpKwtIC6VIylPDZkQZGPgaCmLqBuU15UBWIZ" +
       "2JzHpqZUqWC3aenYYDrrg1kUFjXV\nJIYlEs0wCerMHhWqQtwishLPyiaZyK" +
       "JgWcaKZH4aHUeBLGotK8IiCN6YrXsRZyvG99NxEN8kg5lG\nWRBxfUrLsqwC" +
       "EgPeGese3zwLAjC1rYLJkrauqkUVYAB1c5MUQV2M54khq4sg2qpZoIWgm664" +
       "KAi1\n64K4LCziIkF9Xrkc/wRSIQYLnULQVq8YWwlidpMnZq5ozQXD//1i7t" +
       "+DLOYtEhYVan8bTNrpmTSP\ny9jAqoj5xLet2OOZu63tfoRAeKtHmMtM7vn+" +
       "kezrZwe4TH8TmbnSUSySovhOevuOtck/hQLUjHZd\nM2VKhQbPWVRz9peJmg" +
       "5svnF9RfoxVv/44/mf3P25b+O/+lF7BgVFTbEqagaFsCpN2e9t8J6VVcxH\n" +
       "58plE5MMalHYUFBj/wMcZVnBFI4gvOsCWWLvNR0h1AaXD64PIf4XoDeCWg8J" +
       "ekyHvKFBL1CjCmyk\nRmd2rPh8NAW9CaQA2w5oioSNonj64i/un5l9+CEeDk" +
       "ohWydBW+ia3FFYE/l8bLVtjRBQTCVK/b89\nN9H5SNR80Y8CCygkVyoWEUoK" +
       "hpQRFEVbwVKRMM50ufjJaAGcCpeAXsDUogILMTqDz1UD7fLSyEm+\nDLwJwI" +
       "2145d//ffiyvM04jRCvY7RgPcyty08nL/n4L0P7QpQoZUWCl2Npc02qsWLz3" +
       "6awPX1K6X7\n/vXys5sG+fp0zvb6AqDMO5Mm9dtfCI68+qPNrzBE6/nf4SoU" +
       "eUw4m7ocW+8yMIbx3z2de+yJN09+\nkhnKLQ0Q1C6UwG1BJASArZcLgoK6VV" +
       "Jk0eVJTxPCx/p6H39y+NSrTR3YcaU8ZTXm5Cf+ET4hnLuH\nZ1N3Y+BnVKsy" +
       "9rULePj2sNiEPCGi6VEFV7HimOfVdojVrzrSHR8f+OP+9OnPeA0NUQrj+pyZ" +
       "qUON\n04riS989+9uxC795AKxYQG2H5/JTk9kZMHjgquqKYle1/87AkvwzP6" +
       "uetBI1qbqNkybcbkLxNjA0\nDZUCRkdCtY2UzRmaiCXoLI7ep/5z4K3HWsdf" +
       "8KMWKKfQUIgAZQCq806v8oYKOFFnE1UFMzeXNaMi\nKPRTvQVsIkuGtuKMsC" +
       "qwhb13ApLtcO2Eq8WuIexJP3bTWw+vGUx6F7vv4Qz00/db6G3Y5pqP3iMQ\n" +
       "lx6HwZOGIazSZKt9fm3HV34qPAOVFSqcKR/DrID52Fq0gvS5g8nrMa/e95+6" +
       "eGL4D6+dtyu8a+fg\nSL1RfMB68cGzayxoIejhgnnYCQjsIeibj/VVwJTVHB" +
       "4aet/E6+I0TSk6c994GuzpBkV0yxGTpVhW\nEwUlM/31lzavPWqlD3JLtrgE" +
       "MtPF2sD5bw1fHmQW2AqDrh5i/99WFYzDTkbQxwxB2zx1+rbRSGI8\nmhwnKL" +
       "CMVxm6vbCtYLDSEhnjnjfiTu+309jZiUz/n4AVFjFh3+7gbuYcN8fY+H56u5" +
       "OgGRWTAlUh\nahJU3cJRU5ehGRREzcAFE4ordPoC7Jo0Y7XAtlEqmZ6cy1R0" +
       "BQxOpiOpZDSd+AiUcrIkmzGRS5gx\nUE8VzCKmLN1Au264gjbtgu+Rdl73r4" +
       "nNEcJ5CLHud3MvZ8gVCFnV3mC8sPDPEenSrdM86H3ujatb\n8EDyMr655/W3" +
       "WNHzMLDJLsaj5NGd37z0/MX5Xl4y+VZv94bdlnsO3+4xR8I6LdpDV9PApM/d" +
       "OnTm\n+PzvS34bgDiQAxoHtAxm7lizCEXsJ6o/34cI+bmYm5QVh5T7HFKqTT" +
       "JjnzszGLHc6xjOOuPOOmbT\ndVKJ6GgK9kpVQbFYnGavzZlF0KtbDfl0zFG5" +
       "11F5H0HT7yWfUonIvujo6MZ0Au1XTKchuMJ2sMLv\nU7DqBdrl8YN1j8dHEo" +
       "7HJ2CX7AU5kYwkk9FU0hWta2P8WSCkAbBUsVvplxylI47SRwj66NVgJoK5\n" +
       "XJAB0kJeXIKGq2DDBnh8LJIajY7tBYR7GMIlRRNhYxjjqq+IcT9cN9gY33C9" +
       "S9aXARpGV9MNzVcd\naJIONKcIuuNdMDAvE+zQb5SV89H0Ov9Kq0fmszGXbu" +
       "hHrk01HGgUaEjQ55ph1gtXp41Z5/XG7BuA\nGZAv39gFv+NglnIwO0PQx94F" +
       "ZvQHAMsQXbglxhjjR0cAuK0MuGVVW1EBO3hzjOhtOEbBqBe1EOJn\nuiEbta" +
       "EPLpt/4CDhKpk/bJLNqVQkOR5N7SXIp/2fufwcQZvtraw5a+9kPqXzeSJBbS" +
       "VNU7Cg1ltQ\nohkO2+DabeOw+3qz5xygA3XX8PLn/DpqCVc5+lWTRpMai0DD" +
       "gkbTVV/nFnOQnxDolO81c5kWmT22\ny3s+uNBfcJxwFfLXmoV+bySZiCbTEP" +
       "oKM+DayK2xoyiZVBRv1FuqGv1Rj4d8BNWgO4AWevTt2/Cj\nHv/pSdy1du+H" +
       "X9a7fs4OR+s/D7XD/rpsKYrr7OU+hwV1A5dlZkw7P/Nwty/BOXQ9+8Ac+mC2" +
       "/Zl/\nfwPG6Hf6/hedM13/HwvQHF+5FAAA");
}
