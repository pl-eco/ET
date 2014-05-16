package net.javacoding.jspider.api.model;

import java.net.URL;

import et.util.MyUtility;
import java.util.Date;

import et.util.MyUtility;

public interface Resource {
    int STATE_DISCOVERED = 1;
    int STATE_FETCH_ERROR = 2;
    int STATE_FETCH_IGNORED = 3;
    int STATE_FETCH_FORBIDDEN = 4;
    int STATE_FETCHED = 5;
    int STATE_PARSE_ERROR = 6;
    int STATE_PARSE_IGNORED = 7;
    int STATE_PARSED = 8;
    
    public int getState();
    
    public java.lang.String getStateName();
    
    public java.net.URL getURL();
    
    public java.lang.String getFileName();
    
    public net.javacoding.jspider.api.model.Site getSite();
    
    public net.javacoding.jspider.api.model.Folder getFolder();
    
    public java.lang.String getName();
    
    public java.util.Date getDiscoveryTime();
    
    public Resource[] getReferers();
    
    public net.javacoding.jspider.api.model.Decision getSpiderDecision();
    
    public net.javacoding.jspider.api.model.Decision getParseDecision();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1Ze2wcRxmfu7PPz8TPOE5sx07iKHGDz2/nYf6o8Z3JJdfY" +
       "3Dlpa1yu672xvcne\n7XZ3zr6ENqIQkgISoiQFqoYWpFSRIEKoJUUIRChpgS" +
       "IiISPRFkRVGlSKICgRQolQUfhmZu92bu/8\nOCHZ0u6Od7+Z79vf9/ses3f5" +
       "Jio2DdQsmz5yQsembyQyLhkmjo2okmlOwK2o/Hpx2filQwnNjVwh\n5FZiBF" +
       "WFZLMrJhGpS4l1Bf1DKQO16Zp6YlbViLVOzir7t3+48JuzB5s8qGoSVSmJCJ" +
       "GIIo9oCYJT\nZBJVxnF8GhvmcCyGY5OoJoFxLIINRVKVkyCoJSZRranMJiSS" +
       "NLAZxqamzlPBWjOpY4PpTN8MoUpZ\nS5jESMpEM0yCqkPHpHmpK0kUtSukmG" +
       "QohLwzClZj5mPoFPKEUPGMKs2CYEMo/RZdbMWuUXofxMsV\nMNOYkWScnlJ0" +
       "XEkAEq3OGZk3bj8EAjC1JI7JnJZRVZSQ4Aaq5SapUmK2K0IMJTELosVaErQQ" +
       "tHnJ\nRUGoVJfk49IsjhLU6JQb549AqozBQqcQtMEpxlYCn212+Ezw1pi38r" +
       "9fHL/TxnxeFMOySu0vgUlb\nHJPCeAYbOCFjPvFu0nc++HCy2Y0QCG9wCHOZ" +
       "4R0/PBL64Gorl2nKIzM2fQzLJCp/ONjcsjj8lzIP\nNaNU10yFUiHrzZlXx6" +
       "0nQykd2NyQWZE+9KUf/iz8i4c/8x38dzcqDSKvrKnJeCKIynAiNmKNS2Ac\n" +
       "UhKY3x2bmTExCaIild3yaux/gGNGUTGFwwtjXSJzbJzSEUIlcLjg6EL8bz09" +
       "EVROqZk0ZOzTCdqd\nwGSKel/WYuD3qWOmrsSwMSXpylRci2F1ypZO0aWrFl" +
       "wuGqPOCFOBjgc0FeZG5Us3fv144NAXnuL+\nohyzjCKoA/T5bH0+S58P9PmY" +
       "Pl9aH3K5mKaN2fhRh8Ro3PzjpaHqL3ear7iRZxKVKfF4kkjTKoZ4\nk1RVW8" +
       "CxKGGEqxHIzTgFhKycBm6C+qgKC7FYAMDmDbTNyUE7coMwkoBYi6fu/faf0Y" +
       "WXKV2oe+vp\n6tw0cNZxbltlR+SRg48+tc1DhRaKKO4pFnMbqRYndqM0+tPr" +
       "x6c//e9rz5e38fXpnGa2QCnoasLp\nKYGRB7JmReXHTl7oW4w8qHAaO+PCIX" +
       "zyp0eev3udvMMcVAb5iUjAKgj2Lc7ozAooGqZO449Khr3u\n3t/P13i//0Lc" +
       "jUomUTXLe1KCHJXUJI5gyKvlijli3QyhdVnPs7MQD7khK9oJanbaJagdSqdM" +
       "ClaR\nSDgYU2k6LmPkXcdkqgHORjh64Ki2YoNd6cNaeqpLMerVMN9Sg3xBSL" +
       "mz2Kh971sX7zx5di8AF0TF\n89RwwKTaljucpIXjzOVnWirOv/sl5kQahXTR" +
       "XZQtTr9Qu+9+ztv95k8qXmfeSGf/KqFMAHY8l9TY\nZJswMMX0T98YP/fMzb" +
       "OfZEzjVPMQWERJSACbV09Oq4oMA5MVuBSUn8jE8EQg6g9GRsaOBsIBv5NX\n" +
       "44YShww1b6XQK5P/6o69v9vPedUolmZR8EDvPdxe98Etziiok5J5OBP3uXx0" +
       "KHl6y8X3X74RrucJ\ngxez7Tn1RJzDCxpzaqWegnfYupwGJv3a7q2XT4Xfme" +
       "ZvUpudVgKJZHzghbdwx/2Vcp605YGSCyiy\n9xpgaZAxaVsWn3rhqLH4VJPL" +
       "Jzq4D+666eB+9m8nO3dbfqPjXnrqo6d+cFYNd9ZoYGLkQDQQDo+F\n6ZP9Sx" +
       "nQD0etZUDt0gYwRaOrMqBONCD48cNjQJhlTRiEo84yoW5pE4roILQqEzaIJo" +
       "yOhT8W9PsD\nh5c1wgdHvWVE/dJGFNNBeFVGrBOMWAEByoINlvINSyv30sFD" +
       "hbBgfDgcCaySBQ2WAQ1LG1BCB58q\nhAXcgNWwoBOOjZYJG5c2oZQOYqsyoV" +
       "IwQdCdyjOZoFJpGsq2JEPIlmV6ZbacUIXr8nR6vsb681/r\nuPCms/gimmFa" +
       "lmpQWXY5+9DtyjPSa4/QqXTiR0E30fROFc9j1dbqXOQB1o+nS1nVg61/Hh28" +
       "9IRT\nfwXtuMQknT0tKr/6vat/HHjrD6chdU2iksNjkZHhUACyXOuy6qJyzX" +
       "zTJzxzyq/cbDfAa23OLiJ7\n0lB2hS03MGyCEhOZOpvbRY0bmoxjsFOy9X79" +
       "PwdunSved8VNC7bdgNAV2h3lvGJGM+KSShWkty3l\nZM7QFuw7jtpeAccm60" +
       "Dpq8BAm7VZxGF5WRVpwso2rbt1dt0dNgzpBO3xUk8utjz7S+mbHtoKFJnK\n" +
       "ScxKPcpq96wV6PmzwkP6/xPA01lM6M6TIbcfMbETWa+xFY4m6zWa/s/XcBqx" +
       "ooVnIezSFtJiDkA0\niiTkTRqv4I9fuHGm4923r1s7LaFNsKX+Fj2dfOXzVx" +
       "cZ2Rw9AtvL05GL7W+BC9Hs1q2cbz++SqyZ\nPf17usGgWtBE9/4+JeYLabKk" +
       "Bv3ffrVi8enk4EFuyjpBIOiPplqvv9hxr42ZYGn0Cps56/+Secmw\n2xedXs" +
       "4R1F/AXml/756P9PR09vVBARMx3Gm28YBhiNcTsXfkW+98NKA5tMWiQcta0+" +
       "A5aHzgFY6E\neb3+CnfERcERPezBeXp6kaCDy8AEyTBBpgwLpgxeo5jIczgW" +
       "oE85dr37OvsH7yOA0Jxi+tITfIId\ngF0lw47uKOFmPtxarQOlr2uJ23cJqg" +
       "B7R2F/zqJHAO8HAni9NnhXCuRYXw/jWA/AJCjKUIwu+Ww+\nWDZZmQWlr2sJ" +
       "y48IKqERoZAsSH4uQNJnQ3KtUEj6KCS9AxBYlpKciNux4icIOi0fbjT0tlu4" +
       "bV9r\n3N4AgKiX2TcWEblFAbl+G7nfFYrcAENuH2zEM2pysNu5InZ8Yj70aP" +
       "3aYaG3Y63Re5uzzhmI7wnY\nDdjY3SgUO5bse/dw1q0uCLfBsdOCY+daw/FX" +
       "bqlfMWVtHhsnJpRsXG4JuAzauNwuFJd9LEH1E7TJ\nqS2HWuvtHssv5Y8/Gn" +
       "MdFmQdaw3ZHZ7O+Qcxw6Qfc4Quh7WFtMk5vXDo5q7mO8+5kXuZJifP9+7M\n" +
       "ClH5JU/7bfePG9pZd1w0LZm8D3L+UJD7O0DW531mdUUWgHXLACi431UkuH8P" +
       "a3+qdF1P3+zb221z\nwuUtkBP9vGgN8KKVhjNDh3x+p6butszevcZ+d5XDBp" +
       "yWEvZKfiwrJvSJIlh1Alh7bVzqC8WFVa5+\nKOabc9TlBMvKn9HTU/PhuQvx" +
       "LTpKX9cSz8089bCf5PLBuV2Ac58NZ3uhcLJy1t/NU0+WNjE3uxpR\nCjZi6Y" +
       "l0s9eY8+Mh/4lL3rb46K5res0bPCzTP0OVwvZhJqmq4ldnYezVDTyjMFhL+T" +
       "6Vvyb0tm0r\nOZGgYnalKLg6+LxO4MfS8wjywFmUBwAa8stDRbRGojxsWNZn" +
       "yxNUbv8jig6CNhClwz16nv0M3/ml\n9P8BVBPCodcdAAA=");
}
