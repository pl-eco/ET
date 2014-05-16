package java.util;

public interface List extends java.util.Collection {
    
    public boolean add(java.lang.Object obj);
    
    public java.lang.Object remove(int i);
    
    public int size();
    
    public java.lang.Object get(int i);
    
    public Object[] toArray();
    
    public Object[] toArray(Object[] o);
    
    public boolean contains(java.lang.Object o);
    
    public java.util.List subList(int fromIndex, int toIndex);
    
    public void clear();
    
    public java.lang.Object set(int i, java.lang.Object o);
    
    public boolean isEmpty();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1330551856000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1Ya2wcVxW++/Dajjfd+JHErZ3YdVK1pvb6sd61U/OjluMo" +
       "m2xj1zaiMY62szN3\n7bFnZ4aZu+tNKRGFkBR+gKq0QEUBVYAiVVF/pOoDgZ" +
       "RWbYFWFCH/aaECUYKqFkjVCqEGlCqce++M\n9+544gSRxtI8fO+59zy+75xz" +
       "Z89cQDW2hdplO06OmtiOj89MSZaNlXFNsu1ZGMrKr9bUT50+qBtB\nFMigoK" +
       "oQFMvIdp8iEalPVfrSe0fLFuo0De3ogmYQZ591u9y169LKb04eaAuh2ByKqf" +
       "oMkYgqjxs6\nwWUyh6IFXMhhyx5TFKzMoUYdY2UGW6qkqQ+AoKHPoSZbXdAl" +
       "UrSwPY1tQytRwSa7aGKL6XQHMygq\nG7pNrKJMDMsmaEtmSSpJfUWian0Z1S" +
       "ajGRTJq1hT7C+iYyiUQTV5TVoAwW0Z14s+tmPfPjoO4ptU\nMNPKSzJ2l4SX" +
       "VR0i0eFdsebx7oMgAEtrC5gsGmuqwroEA6iJm6RJ+kLfDLFUfQFEa4wiaCHo" +
       "litu\nCkJ1piQvSws4S1CrV26KT4FUPQsLXULQVq8Y2wkwu8WDmYDWZCT6yT" +
       "enPu5kmIcVLGvU/lpYtNOz\naBrnsYV1GfOFF4vxR9OHi+1BhEB4q0eYy4zd" +
       "9vznMu+d6+AybT4yk7klLJOsfCnVvmN17K/1IWpG\nnWnYKqVClecM1SlnZr" +
       "RsApu3re1IJ+Pu5IvTvzz8lafw34OoLo0isqEVC3oa1WNdGXfea+E9o+qY\n" +
       "j07m8zYmaRTW2FDEYP9DOPKqhmk4IvBuSmSRvZdNhFAtXAG42hH/C9EbAUFg" +
       "XdwEJlLU56lV83yo\nTNfGVgIBmoTeFNKAb/sNTcFWVj59/vUHJw5+42EOCC" +
       "WRo5Wgm+im3FW6KQoE2Hbbq6NAw6rQ+X+c\nHd3yrV77uSAKzaF6tVAoEimn" +
       "YcgaSdOMFaxkCaNNo0BRxgygVTQHDAOyZjXYiDEa3C5ZqMvLpEr+\npeFNAn" +
       "qsHrv8uw+yK89Q0ClILaLV+jK3Ldo9c+TA/Q93hajQSphGr8wyZzvV4g3QPp" +
       "rD7v6F3Jf+\n9fIPN3Xy/emadncDUOZdSfP64tci/W/+ouFVFlK3BMSEWjGD" +
       "CSdUY8XWWQtjGP/j96ZOPXbh5BeY\nodzSEEF1Ug7clmRCILBuxQD4zWJOU2" +
       "XBk2YfzsdbWx79TvcTb3odoFi2YldyYvwenhw8lR584vyJ\n7j///g0n3YQy" +
       "XpF6P3u8+NzXz60Gaf2ph4Iq2Ydc/rCCTt8CrMjpQDW6AR2pZ9zcxCnaT5yV" +
       "QyOp\nEW5dCxExhBTSQB+kGY33jitVFlYVT973UfSE9MoRbnRTNU8n9GIh+a" +
       "O3cPfdUdmH7PXEMHs1XMJa\nJZpebfewiusSI/b5jnf2pU5/2RvXBppyYlyr" +
       "l2Xll54+93byrT8cByvmUO2hyZnxscwEGNyxobqs\n3Fhquze0qP6axZvVTp" +
       "8+Ub1oVHQTkLAwtDl9dg2J9Rk2ZRkyVqAXVvR+9z/7PzxVs+fZIAoDztAC\n" +
       "iQSFC/rJTq/yqpo96pKfqoKVDXnDKkganXKb1iayaBkrlRFGic3sfQtEsg6u" +
       "DrhqnKrHnnSyid6a\neY1j0l3sfhtPmCB9v53eup3UCNB7D+DSXCHWmGVJR2" +
       "ltKD+0uuPxX0k/gF4ANdlWH8Cs5AacJKFL\nnXq6XyDrHtitCdKCnlbiqhLP" +
       "GLKkpfc++VLD6iPF1AFOwc2CQHpvttzxxk+7L3cy/Jz0iAjtx/m/\ntiRZhy" +
       "rUpI80dCZvhb8r2TPY35uABAoZuSU3c1gjiNPaGueJWh0Bet9Ho+iUMPr/GO" +
       "wgKQr40yay\ndspSC2BWyem/z879s19598693LFW8VwnCu4fvIx3N7/3Icsw" +
       "T03wafIeJY/s/Mm7z5yfbuH5yU9C\nu9YdRsQ1/DTE/IiatELcupEGJv3Knb" +
       "eeOTb9p1zQ8T9JUG3OMDQswQEgwkweQCxSn61iYrvTh5H7\n/D+Y6OIgkmzW" +
       "5DKHAQ8o8q4tyasjeARkLVwwSlhk61KFrcP9bOIAvS0TdLeOyTwlimwo0HTn" +
       "l2xT\nhcPAvGxYeJ5I9vK8WjC1+Rl5ESqBhq00/AeEG0gO9AwlelOJz8CJli" +
       "yqdjyPibw4CwvsONdPFUz6\nBa+JFkYneA3XKXioqpFvEB+D8Lym77KfdTfD" +
       "tdmxbvP1hZbpvLqJZQB9ARMRv4cE/AYq+H3VrxYM\nJHpGegeByVHY5Ha7k9" +
       "f5K6LRClfM8Td2o9E4AflGDFZ+6QlKqCRsjObp8ZWDF+5o//j7QRTc4GTh\n" +
       "86WxtkNWPhva/VHw59t2s64Vzkk2b3neT7T1X2BVH1bM4oaq4N20QfBE/E4J" +
       "+A2yMj5pmqY7mEoN\nD1dAfcwX1CQFdQiKuhOuNWD9MO2Cq9Exq/FTKE/fXt" +
       "O2Ha4dG2gTg/CkEIQhvyCMVILwY4JuXh+E\n4Z7BRG8iAZ8fxtW59bjArWqj" +
       "XeSuxegzgtEJP6P3VIx+2he5YUAu8b8g1+yY1fwpIOd49YLgVbLi\nwM98o7" +
       "6nZzDpRJ35f/XQn4XPFOdsyObv83O1H66tjqtbr5OrwYqYfI3V9kWgiV3MUW" +
       "fFCL0mRChV\nidDrfhAPDgDEQyMAsbNRVdWN+Tnf4uQOcp83sur+lqAaGc44" +
       "lvesES4Z9Kc3ftjo97N7F+IdErnP\n6wyaCME7AgRCafiLH0kH4QScYml2zS" +
       "R9G9qsXd1m3xc0ChX5b76g04qcoG3WvpY2S4PV5gSu7UYD\n/gFwXLUnCiY5" +
       "ytMRjhhh6gf94aF13a+q/Lc/uWv1/jteNhtf413T/X2uDr5S8kVNEz4lxc/K" +
       "iGnh\nvMq01vFPOB7af0No1z64QDt9MFsv8vlLMEbn6fsnvM6Wzf8CuIv93j" +
       "oWAAA=");
}
