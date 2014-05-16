package net.javacoding.jspider.core.storage.exception;

public class InvalidStateTransitionException extends java.lang.RuntimeException
{

    
    public InvalidStateTransitionException() { super(); }
    
    public InvalidStateTransitionException(java.lang.String message) {
        super(message);
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1WXWwUVRS+u91uu+1C2y0/DRRaCxqa0FkJtCJ9sSklLGzp" +
       "2pZYSnG5O3O3DMzO\njDN32gWRaFRAHkwM+JegxgdDYnySiC8maBCNPySmD6" +
       "IPJBp80ChEH4zEYPDce2d2ptNiNXGTmT1z\n7znnnnvOd75737mBqm0Ltcq2" +
       "RA+bxJb6R3LYsonSr2HbHoWhvHy5OpE7t1M3oiiSRVFVoaghK9tp\nBVOcVp" +
       "V0Zmtv2ULtpqEdntQM6vqZ42XLmtvTX57YsbIKNYyjBlUfoZiqcr+hU1Km4y" +
       "hZIqUCsew+\nRSHKOGrSCVFGiKViTT0CioY+jlK2Oqlj6ljEHia2oU0xxZTt" +
       "mMTia3qDWZSUDd2mliNTw7Ipaswe\nxFM47VBVS2dVm/ZmUbyoEk2xH0PHUF" +
       "UWVRc1PAmKy7LeLtLcY3obGwf1OhXCtIpYJp5J7JCqQyba\nwhaVHa/dCQpg" +
       "WlMi9IBRWSqmYxhAKRGShvXJ9Ai1VH0SVKsNB1ahaMVdnYJSrYnlQ3iS5Clq" +
       "Cevl\nxBRoJXhamAlFS8Nq3BPUbEWoZoFqDcWTf53K/dHOax5TiKyx+GvAaH" +
       "XIaJgUiUV0mQjDW450JrPH\naY0iBMpLQ8pCp+/e93dnf7zYJnRWzqMzVDhI" +
       "ZJqXb/e0rprp+yFRxcKoNQ1bZVCYtXNe1Zw701s2\nAc3LKh7ZpORNfjj8yZ" +
       "4n3yY/R1FtBsVlQ3NKegYliK70u3INyFlVJ2J0qFi0Cc2gmMaH4gb/hnQU\n" +
       "VY2wdMRBNjE9wOWyiRCqgScCTzMSvzr2ouiejD4FQFYY5smohXUR0EBZJiYT" +
       "JJOiIZ3QCQYK2VAA\nDhMHbVNViDUhGxaZsAHIUNgJ4llMLOixzKJqmI5EWH" +
       "uHm1MDJG83NPCfl89d//zowM7nTopSM3i6\n+6FoEGKS/JgkNyaJxSS5MUmV" +
       "mKQFYkKRCI9m+ezysHorrC1/ebe38fku+0IUVY2jhFoqORQXNALt\njDXNmC" +
       "ZKnnI8NwV6h0MW8J4sAPQhxLwGjnirQT2mLNQRhrhPDBmQMOB25tidr27mp8" +
       "8zNDL0LGHe\nRWiAhUMitmTnyL4d+092VDGl6RhUNQqqaxf2npdvnho8//UX" +
       "19b5rUTR2jkdPteSdWg4/JxlyEQB\nBvTdv/zn9l9PVz/4XhTFoO2B+CgGuA" +
       "KLrA6vMatTez3WY8kCy/qiYZWwxqY8qqqjByxj2h/hiFrE\n5UZIQD081fAs" +
       "drGeZC82mWKvZoE/ls/QHjin3no6fv/VD+ov86R49NsQ4OkRQkUzN/nlGLUI" +
       "gfFr\nr+ROv3jjxF5eC1GMCEVx0yloqlzm8S2PQO2b5yEWqWXJmZc6z171it" +
       "3se++zLHyY1br81MyqVz/F\nrwHpQPPb6hHCexvxlZC3AHuv53JXYJJ9d/DR" +
       "1XMSlXIT1ThfotjrvnldR8QOIdgW4m1loH9QUKQg\n1KNnrx/v/O7bKy7pBg" +
       "5zX+un/DPOhWcvzkRZaRPQp9je5fU6P9aZFOFHHcCHtxobSfDw6gSdPEBd\n" +
       "y+4NmzdBQClYiV0DJFWRsoaMtczWNz+qn3nB6dkhQlkUUMhszZfbrrzVeaed" +
       "h+CuGA/wuvtdM4Wt\nXT4Nsb/NFI39z/y4ZUPP+k0bu7phT3BE2zaY85Qvgf" +
       "sCBwXjF0mczQvXfIOrwjgnzLbb2FXDa9hS\n4fHfL71e1y4AyGxaA25cBCB/" +
       "IW8Wsr3qbsc1v2qcGPsteRx/vE8kPjWbYwd0p9T9xjek86GkPA/P\nJ6hhdm" +
       "lkimj+LsKrDfJrjLeNhkfavt/Wc+6JuduAO9ECuWd91zLnuiguNXLHzP51l8" +
       "ymzzidVS4e\ntYCSoqNpuo/YWECOmxYpqjyDtYKlBF6HKer6T0cYpKIi8109" +
       "LBztpmjNv3AEUHKloPEYRSv/wZii\nGPsLWuyFq+j8FrCCKwX1H6Vo8Wx9iu" +
       "r8j6AqpqgKVJlYEIXrFhNyoLc3ml4rrPBbYdjRqVoilTKW\nzb8BxQpBJD0M" + "AAA=");
}
