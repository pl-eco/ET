package net.javacoding.jspider.api.event.monitor;

public class ThreadPoolMonitorEvent
extends net.javacoding.jspider.api.event.monitor.MonitorEvent
{

    protected java.lang.String name;
    protected int occupationPct;
    protected int idlePct;
    protected int blockedPct;
    protected int busyPct;
    protected int size;
    
    public ThreadPoolMonitorEvent(java.lang.String name, int occupationPct,
                                  int idlePct, int blockedPct, int busyPct,
                                  int size) {
        super();
        this.name = name;
        this.occupationPct = occupationPct;
        this.idlePct = idlePct;
        this.blockedPct = blockedPct;
        this.busyPct = busyPct;
        this.size = size;
    }
    
    public java.lang.String toString() {
        return "ThreadPool " + this.getName() + " occupation:" +
        this.getOccupationPct() + "% [idle: " + this.getIdlePct() +
        "%, blocked: " + this.getBlockedPct() + "%, busy: " +
        this.getBusyPct() + "%], size: " + this.getSize();
    }
    
    public java.lang.String getComment() { return this.toString(); }
    
    public java.lang.String getName() { return name; }
    
    public int getOccupationPct() { return occupationPct; }
    
    public int getIdlePct() { return idlePct; }
    
    public int getBlockedPct() { return blockedPct; }
    
    public int getBusyPct() { return busyPct; }
    
    public int getSize() { return size; }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYe2wcRxkfv84+P+JnExM7sZMaalP7/Iodu5Ygru0odi7x" +
       "xeekxLi67u2O7U32\ndre7c/bZtBGItGn7R0XUloeUtioCBaGKIqKGP3iEqE" +
       "2h0AiwRFJArUCpqiJIVYRQIygK3zz2dm/v\nXEdqbGn3xrPffPOb7/H7ZubF" +
       "66jItlCjbIfIsont0Eg0Ilk2VkY0ybanoSsmXyoKRs7u1418lBdG\n+apCUG" +
       "VYtjsViUidqtI5PjqUslCzaWjL85pBhJ4sLffc+dHSG6cmGgpQ5QyqVPUokY" +
       "gqjxg6wSky\ng8oTOBHHlj2sKFiZQdU6xkoUW6qkqSsgaOgzqMZW53WJJC1s" +
       "T2Hb0BapYI2dNLHF5nQ6w6hcNnSb\nWEmZGJZNUFX4mLQodSaJqnWGVZsMhV" +
       "FgTsWaYj+ITqCCMCqa06R5ENwcdlbRyTR27qX9IF6qAkxr\nTpKxM6TwuKqD" +
       "JZr8I9IrbtkPAjC0OIHJgpGeqlCXoAPVcEiapM93Roml6vMgWmQkYRaCtq6p" +
       "FIRK\nTEk+Ls3jGEH1frkI/wRSQWYWOoSgO/xiTBP4bKvPZx5vTQbK//dE5M" +
       "Nm5vNCBcsaxV8Mg7b7Bk3h\nOWxhXcZ84I1k6Onxo8nGfIRA+A6fMJcZ/vSP" +
       "D4ffu9DEZRpyyEzGj2GZxOSP+hu3rQ6/EyygMEpM\nw1ZpKGSsnHk1Ir4MpU" +
       "yI5s1pjfRjyPn4i6nXjn75+/jv+ahkHAVkQ0sm9HEUxLoyItrF0A6rOua9\n" +
       "k3NzNibjqFBjXQGD/Q/mmFM1TM0RgLYpkQXWTpkIoWJ48uAZQPwvQF8Ad3rB" +
       "wpISMQztgKGrEJVj\ni1gnIZOgYR2TWRoLsqFAFMwes01VwdasZKqzmArNJv" +
       "iI2bV0pOj0lUt5eTSP/VmoQcjuMzTQGJPP\nXvv1Q2P7H3+M+5TGoQBO0OcB" +
       "RchFERIoQoAixFCEBIpQbhQoL4/NvyXT8tSVCs24f/xoqOrJDvt8\nPiqYQU" +
       "E1kUgSKa5hyFRJ04wlrMQIC9VqT1qwaIRQLo9DVAOomAaKWBaBqRcttNMfvW" +
       "7Oj0NLgpBc\nPXHzd+/Hls7RQKOBUUe1c2jg5uMcW3lb9P6JBx7bWUCFlgqp" +
       "B0G0ZX3tMfn9Jw6cu/Kbt1rdLCGo\nJSt5s0fS5PPDj1iGjBUgN1f9N/6z74" +
       "OnigZfzkeFkNHAaUSCSASC2O6fIyMJhxxCo8aCkWVzhpWQ\nNPrJYaFSsmAZ" +
       "S24Pi6EK1q4CA5TBUwTPZhHGlfRFP9bQVy2POGpP3xoYXd74aqDr6k/LLjGj" +
       "OMxa\n6aHgKCY8T6tdd0xbGEP/W9+MPPXM9VNfZL4QziAoYCbjmiqnGL4tee" +
       "D72hycEaqve/rrbWeuOs6u\ndbUPW5a0TH2d+srqtm/9UnoW+ATy2lZXMEvb" +
       "AJspAIPqsaNybOQAZyHOWQ+dufZo21/+eFnwmqde\nulJ/i51Mnn/kwmo+NX" +
       "EQKpdkH3SyjFVO2spj1QTcyEKe9gSZPUt5IncTMbJ7sG8AANXATLTShlQl\n" +
       "FDZkSRsffeFi2erpZP8Eh1LhERgfjaWaLn+37WYzgyBmDHioU/xfvChZB10C" +
       "oD89BE18Yi66p7uv\nvbe/Y9duwgmGeawOKjDzBU3rEK92sLIGr6kjlpoAgI" +
       "uiirw8868u5d27R/kS6727E6/gvp6buKX2\nvQ9YqPkMnqNU+SY5vf077567" +
       "NlXHs5fX8zuzSqp3DK/pzE/lZgrWsOPjZmDSr96948UTU2/H+Upq\nMvlxTE" +
       "8m+p5/E7ftKZdzsHIB7Dog+tm6+mjv53wvJyPou521O2imsmhGDOZOIUIJ01" +
       "8c9tItkMM2\nifiX/v3Kc6XNPHvomMZ0UmR4KmNUTH5w5UzvavQ+la/Pb3Gf" +
       "8MrPDz934zJ5m/srTWh0th2pbIBH\nJA/XDlxZrA788PlEPiqeQVVsgyfp5I" +
       "ikJSlxzEBS2SOiMwxJ4f2eud3i+TqUJuxGv8s90/qp1PUP\ntDPz12XPTfBs" +
       "hadEsGeJjz3zEEu4STaghb3vSnNd0LQMAviwkvLmUCdnh8MedtjtYwdu69E9" +
       "gxff\nuf6S+iFjgFK2zR2mIwTqIOvx0FKBYdp0Q+XZ0QtNLZOmzYN9lzNt7+" +
       "6BvtvCE7297d19Hd2DoHh6\n33g05Nj1iFj0CdjFZa+NIhJGRTUs4Da5xEKT" +
       "yfsREqhwamx4lKod4BWLvicy/NQMT1AMCub2U5y+\nDhFUYchy0mRnkYhM0k" +
       "mYSyv1fqnQWppbKxZai1VFw+vp2yZqMnJ+s/UtCH2lcc2QYWdzKxDLhcry\n" +
       "3CqPOxDjSXt5PX1b4KkQ+ipy69OFPlZ3XWUswj4jaMplskbBYhDl29Y6pzCG" +
       "PfWFf5Y/Kr16f76g\nvD0QU8QwOzQIRc1lP7+SA+xY5iR65X1Nf93bf/ZhP/" +
       "2V0E21l/4yh8Xkiz+48Oe+N/90EihtBhUf\nnIyODIfHIDCbPna6mFy92HCo" +
       "YEH9FUtTwURZh8nMQUOZ/FNqYTgL69MZLNScsYdrhKdeOKU+1x7O\nY/o1is" +
       "i6FeZhgkqIIaq6h6pOeqhqkH3opa9HCNr/yemjZ5DSR0/fZyEtyYIK2wOBgC" +
       "U7YtOtZJhi\nuzAHcn43wBSPQ/rNYzJiJBIA02uMr7nG6O9yjXH6tnBpz0B7" +
       "d3dHbxdBte7sd9nNPD7WtEiDoD/k\n/G6ARZ4B9gBMB31l7IzHHN2uOZ69Pa" +
       "Wlh5qjB7agVWLq9W2xA54WYYuWDbLFCxzQZFYVWcs5rQJQ\n6wYB+h4P13FP" +
       "AVorc9oFlPYNgvIS5DFAuTezdq1lmC6BpmuD0JznhrnXU/ZyQaGMuktA2bVB" +
       "UH7G\nEyjqVEwEu8LNuUOfnnnrs25h+V2hvHP1gdZXzOrX2VVC+j6vBE6Gc0" +
       "lN8+5qPe2AaeE5leEo4Xtc\nnr6vEdR6qxdGgF+02PoucQ2vE9S8ngaCitiv" +
       "d9wbBG1dexycmODtlf8tWCu3POASLa/8KkGbMuUh\nFNx/vKJ/gNlAlDavmF" +
       "5yu+opfP2mcwLuu+UbNq9P6e6nzrMPjppYVukdQOrbPyk89OTv/8u2D8Uy\n" +
       "v0WnN8ewjV9U4azfOaxL2rLNDkX0G71Ik5OWBUrZ9km4uMzmGvlNcYP3FJCe" +
       "q2X6aGTMfxAY6Lo9\nFwZ9/CAAp4pCehC4DXeRcHT4VC6TsWWIdGUHBLqgmJ" +
       "j3/9C8FAYIGQAA");
}
