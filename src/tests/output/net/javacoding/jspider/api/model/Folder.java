package net.javacoding.jspider.api.model;

public interface Folder {
    
    public net.javacoding.jspider.api.model.Site getSite();
    
    public java.lang.String getName();
    
    public net.javacoding.jspider.api.model.Folder getParent();
    
    public Resource[] getResources();
    
    public Folder[] getFolders();
    
    public net.javacoding.jspider.api.model.Folder getFolder(
      java.lang.String name);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1YbWwURRieu2uvXwf9pFRabFNLoNpev2j5qD9oSitHD1op" +
       "RqnFY7s7127Z2113\n59rjQ9SAgP4gGvAT1KgxqCGaYMAfmiBB/Iokpn9AjY" +
       "kGf2gUIz8MxGDwnZnd7t712tpoaLJ7czPv\nzPvO8z7zzHs9cQVlmgaqEM0g" +
       "2aFjM9jZ3ycYJpY6FcE0N0NXRDyfmdN3vEfVvMgTRl5ZIig/LJoN\nkkCEBl" +
       "lqCK1tTxioSteUHcOKRqx1pqyy+o4b418dWF/uQ/kDKF9W+4lAZLFTUwlOkA" +
       "EUiOHYEDbM\nDknC0gAqVDGW+rEhC4q8Eww1dQAVmfKwKpC4gc1N2NSUMWpY" +
       "ZMZ1bDCfdmcYBURNNYkRF4lmmAQV\nhEeFMaEhTmSlISybpD2M/FEZK5L5MN" +
       "qDfGGUGVWEYTAsDdu7aGArNnTTfjDPlSFMIyqI2J6SsV1W\nAYnK1BmTO67p" +
       "AQOYmhXDZESbdJWhCtCBinhIiqAON/QTQ1aHwTRTi4MXghZNuygYZeuCuF0Y" +
       "xhGC\nylLt+vgQWOUwWOgUghakmrGVIGeLUnLmylavP/D3U33XqljOMyQsKj" +
       "T+LJh0e8qkTTiKDayKmE+8\nHg8eCW2JV3gRAuMFKcbcpmPJB/eFfz5TyW3K" +
       "09j0Do1ikUTEG20Viyc6fsrx0TCydc2UKRWSds6y\n2meNtCd0YHPp5Ip0MG" +
       "gPfrzp0y2PvYN/9aLsEPKLmhKPqSGUg1Wp02pnQTssq5j39kajJiYhlKGw\n" +
       "Lr/GvgMcUVnBFA4/tHWBjLB2QkcIZcHjgacM8b9c+iIou1tTJGwEdYJqVUwG" +
       "ae5FTYKsD46augxD\ng4IuD8Y0CSuDtm2CLps/7vHQ85l6uhSg4jpmGBGPX/" +
       "5yd1fPkwd5rii/rIAIWgrego63oOUtCN6C\nzFuQe0MeD/OzMBk5mgqJnpjf" +
       "TrYXHKo3T3uRbwDlyLFYnAhDCoaTJiiKNo6lCGFUK3TRmrEJqBgY\nAlaC84" +
       "gCC7FTAFCNGag6lX3OmQ1BSwBKTey5+fXvkfH3KVFoYkvo6jw0SNN2Hlugtn" +
       "/r+m0Hq33U\naDyDIp5gp20h9ZKKXDc99/b6saFdf557JbeKr0/nVNgLgLPU" +
       "mVQLru/1N178KO88w9qWjXyXvvRj\nwklY6MS62cAY+r9/oe/ws1cOPMgC5Z" +
       "H6gBvCEGxbEAkBYG2VIcivx4cUWXTtpDjNOQmWlRx5rvbY\nxbQbWDzd8WbS" +
       "dOCBq4H9widb+SEsSk58lxqPtb56CdeuCYhpaJVDNL1ewWNYccJL9baByZ6N" +
       "dP79\nlT92tx1/JDVQPyU3tud0dW5InhYRz7575rvWS9/ugygGUNbG3v7Ojn" +
       "AXBFw5o7uIWDhWfq9vRP7c\ny0SXClgasU6e1O7eJmi+geGuUSlgtCcnMZWy" +
       "fYYmYgkuJMfv83+t++Nw5qpTXpQBKgz3EBFAPUDU\nb091niSc7TabqCuYmR" +
       "fVjJig0CH75sglI4Y27vQwfZjH2gWAZB48t8ETsKSHfdLBIvoq5mrCrKvZ\n" +
       "ewlnoJe2l9JXrcU1D33XQV6KHQZ3GIawgx62xOMTi1/8THgZBBmE0ZR3YqZ7" +
       "KOncWSvQ9xrXIP3e\nTlDWMCb9MsHgocydea75/IbYfezy/tofvrlg3SKu6s" +
       "Sx+iWyL376iTMTLMM5UCcI5kYne1Cn0JaH\n3d2QACZQPI/0ncvl9R5izWxu" +
       "bWqDgIrAE61rgrIUDGuioITWvnY2b+KZeNt6Hso8l0FobSRReeHN\n2ptVLA" +
       "TLo991UVnfs8YEY6NzfujHOoKa//VNsLqpua6pqb65FUoZC7ylZhWnJ0O5hK" +
       "Alsyo9nYaY\neVsSacrhmW+RZv5/JE1qymflQx/nA0WHjXfxvGxx5WUFGwjR" +
       "1wBBd0+DmqgZOAm2ENVSVVAAvrbW\nuqYV9S0tdxI0P8oxdfsE9AoY1em1Fe" +
       "TVWDqgFsNTYAFVcKuB2gaIQNBQVmOVuKGSXVCtdKAanRvB\n2hjBVkFhOulk" +
       "kmJsb+kAqYGnyAKk6FYDAlVgAGKlRX/cgLqc3tgunWCKRWVi33jPlWUV1456" +
       "kXcG\nmUhTDU+uEBFP+mquej8srWGinjEkmFxJUn9GTP2VkFT8s7DzkhAsng" +
       "FBd5J3uZK8SrdZWzvrmbfR\n0XXdXqF1RWuzQ5NH50aTlZQmLW3wm8IN/SRT" +
       "0pGkGp4Sa4slt5okewnKhUj5BkxmMp4UXeEM0bkT\ncMhJQHMjU/D8ZEybHE" +
       "yfnhOmzY0M0+UEFTuRzojoXfCUWjGX/k+IepiZx73ll1xbdjHm6Nx211zX\n" +
       "0li/vIk4pdVDs6ftCBc7CwxXTK+7YnIh/sZcYwLEl7dwsePdKWKXgAKcD9BS" +
       "vmzK/zb4L3CxemLb\nsnN64RdcF+xfydlQAUTjiuKqJd11pV83cFRm28nmNR" +
       "zf29sEVc12oAnKZJ9s62/xeScIWjT9PIJ8\n8Hbbv0dQaXp7uIutltv+JNya" +
       "yfZwqJwvbtNT4A1MafP0pEq57lZevCX0fwAHlEI4dhIAAA==");
}
