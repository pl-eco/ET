package net.javacoding.jspider.core.model;

import net.javacoding.jspider.api.model.EMailAddress;

import et.util.MyUtility;

public class EMailAddressInternal
  implements net.javacoding.jspider.api.model.EMailAddress
{

    protected int id;
    protected java.lang.String address;
    
    public EMailAddressInternal(int id, java.lang.String address) {
        super();
        this.id = id;
        this.address = address;
    }
    
    public EMailAddressInternal(java.lang.String address) { this(0, address); }
    
    public java.lang.String getAddress() { return address; }
    
    public int getId() { return id; }
    
    public void setId(int id) { this.id = id; }
    
    public java.lang.String toString() { return address; }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcxRWfO5/vfPYl/ohj3NixHWM+XOw7f9fGbcXVdpRz" +
       "Ltj4HGiuRpf17pyz\nyd7usjt3PqcQURVIiiokFAqtlAa1Ko1UolIRBahaNY" +
       "2Afkdq/QfQVqBWQYiqDaKqKqKWKn0zs3e7\nt3eJBRGWdm+8+968N+/93u/N" +
       "7OlLqNo0ULtohsmajs3wVGJeMEwsTSmCaS7Co5T4anVw/tRuVfMi\nTxx5ZY" +
       "mg+rhoRiSBCBFZisSmJ/MG6tI1ZW1F0Yg1T9kst9/44ervjs62VaH6JKqX1Q" +
       "QRiCxOaSrB\neZJEoQzOLGPDjEoSlpKoUcVYSmBDFhT5MAhqahI1mfKKKpCs" +
       "gc0FbGpKjgo2mVkdG8xm4WEchURN\nNYmRFYlmmAQ1xA8KOSGSJbISicsmmY" +
       "wjf1rGimTeh46gqjiqTivCCgi2xAuriLAZIzvpcxCvlcFN\nIy2IuKDiOySr" +
       "EIlOt0ZxxT27QQBUAxlMDmhFUz5VgAeoibukCOpKJEEMWV0B0WotC1YI2nbV" +
       "SUGo\nRhfEQ8IKThHU6pab569AKsjCQlUI2uoWYzNBzra5cubI1pw/9L9H5z" +
       "/oYjn3SVhUqP8BUOpwKS3g\nNDawKmKueDkbfiK2L9vuRQiEt7qEuUz0phf3" +
       "xt8918ll2irIzC0fxCJJiR+OtW9fj74drKJu1Oia\nKVMolKycZXXeejOZ1w" +
       "HNLcUZ6ctw4eXPF36x78Ef4L97UU0M+UVNyWbUGApiVZqyxgEYx2UV86dz\n" +
       "6bSJSQz5FPbIr7H/IRxpWcE0HH4Y6wI5wMZ5HSEUgMsD182I/9XQG+BqZo8g" +
       "KwBtgK4Zo1BSBSWs\nEzSuYrJEkSBqEmBg6aCpyxI2lkTNwEsZTcLKUmXVPL" +
       "VZv+rx0OJ1l54CON2lKTBRSjx18Tf3z+z+\n2jGeSAo+y1uCxsB42DYetoyH" +
       "qfEwMx6uZBx5PMzsDaVRpmmTaHX94/nJhsf6zRe8qCqJgnImkyXC\nsoKhKg" +
       "VF0VaxlCIMlo2OEmDIA9iGlgHB4EtKgYlYxUBYcwbqdiPVru8YjASA3/qRK7" +
       "9/L7V6hoKK\ngqCZzs5dg5Qe4r6FehP3zu4/1l1FhVZ9kBwviPZsPHtKfO/R" +
       "PWde++2bt9oVQVBPWaGWa9JCc7s/\nb2giloDI7Omf+s+u949XT5z1Ih9UL/" +
       "AXEQB1QAYdbhslBTdZIC8aLNCsS2tGRlDoqwLj1JIDhrZq\nP2HQ2cTGDRCA" +
       "Oriq4WqwILuJ3ujLJnrbwoFG4+laA6PGy1/1D7z+07pXWVAKLFrvoNsEJrwm" +
       "G+10\nLBoYw/M3vzl//BuXjn6J5YInw0OQX88uK7KYZ/7d4IHcb6nAD+HW5i" +
       "ee7D3xeiHZW+zZo4YhrNFc\n57+yvv1bvxS+DdwBNWzKhzErUW8x7W24MOXM" +
       "1J55Q84AS+QsGjub/NeA9M5t05yiWp3t0Sm4a+gK\n7tny7vts/UHoVYJ5Z7" +
       "HEyrnSZeTxju+9c+biQjOHFG8oN5ZxulOHNxWWk5CehzXsuJYFJv3KbTtO\n" +
       "H1l4a5mvpKm0aGfUbGb06Tdw7x0hsQJDVEHbg5SwdY2CtVZnxDhH85Xcf+Li" +
       "I71/+eMFi/Ud4bKl\n/pZ6KPvCw+fWvRSUrlixfQUdeVivBeAzkqBPgmy1tZ" +
       "zxJomlOTo88BlwqAks0X1IWJbCcU0UlNj0\nd87XrT+eHZvlrmxyCMSmU/nO" +
       "C8/0XuliLlgW/Y7GYv0fyAmGnUad/nyWoOjH5erbB4f7Rob6R8cI\nCgj8JU" +
       "N3M+xMGG4pBYb5LqCAe3rvY+N+Wo8Ms4iFoJs97Sir32arfpsq1S+93Vxxag" +
       "8vPPb/BA/y\nrCPI4+zF5+ht93WFYLxveKR/ZNwOAZ3yCxsvd6clQruAu9Ht" +
       "pHu4AoVmlr/875dP1nZxSqA67ZUr\nvUQrJd53+MTweuIemePFXbEu4cM/23" +
       "vy8gXyFq/3IktTazvy5Q7eLTgayPhruUb/j57OeFEgiRrY\nDlVQyd2CkqVs" +
       "mATcm1PWwzjg1vm+dL/IS2qy2IXa3ZThMOvuD3Z9w7i0xOyWsBmurXDVWpCq" +
       "dUHK\ng1hNJJlCD7vfUiTwoG5oBPzDUp4UamyYNxF631tiZbsFYFT4Lbeyn9" +
       "6WXKVjIVV0IHXMRQc8c9N3\nTJx/+9Jz8ges5GvZrj9KNawYBNkTBw9VabpJ" +
       "95eOA441U8+cbnLq/TxBtczs4MjYxPD1lMXwaN/g\naP/QEEGhxV2xRNhRG5" +
       "K95COwpS1fGfUH2UUP8NtsswkldudLIHPfwkx0mlUdy0bewQnIrr/2cj4w\n" +
       "HFEe1QvU1X+V3aOgyxU2j7RXbb/acYP1qaNf/GfoEeGVe71W4Y+CVaLp/QrO" +
       "YcXmAPcke9jpqgD3\n+ns6/7pz7NQDbhLw0W2ykwRK1VLi+R+e+/PoG396CA" +
       "o7iQJ3ziWmovEZCGnnNc2lxMZc211VB+Rf\nMXhZ9Vh2JixVmiytwloDw5FW" +
       "XSypxa4Seu+Aq8VKZstHo/cClW7Isw8CplcwiZYX2VFH+ifsdnCM\noNlr4d" +
       "6EPTCcRZfgXK8ZayUFMB2di2V0hv/xvqGh/pGhTwPDWWAP214wsCL280BJQF" +
       "rh2mYFZNsn\nFJCvE1QNrsQ4gVXyostKDSr8fuSuy6be2JXj4Ao9ifKPCBGd" +
       "a4xASec0+jmGb9AGKvlI/eq2fOz+\nhCJ1kqAaovH9ixM4z9jAGRywgfP96y" +
       "LMkb7Bwf7hATg+FkzeYnbxEuJwga7TXEmZHhNayz5S8U8p\nYvf6/ltf1ht/" +
       "zU5fxc8dNbA1TGcVxdkzHWO/buC0zJZawzsoX/dpgnZseLSGlLJfFpdnueJz" +
       "BLVd\nQxHyTX+cGs8T1FJZA7qHNXLKnyVoc6k8lL39j1P0Jdj+gygd/rhI+o" +
       "79Kt+FUF5vdvSmhI5FmW7D\n89/9ie+ux/7wX0aMAZF/5qOftqCx5mTYbkei" +
       "kJQ1k2166Dt6+hezBpxsCWsMVpDrTD4j/5TV5uzL\nRVs9i/vmZyq05qHrb8" +
       "2D0IZ8tDV//O8l0L0/VSlCzGtnj6b+Zyxz/wfS28YZmBUAAA==");
}
