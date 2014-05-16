package net.javacoding.jspider.api.model;

import java.io.InputStream;

import et.util.MyUtility;

public interface FetchedResource
  extends net.javacoding.jspider.api.model.FetchTriedResource
{
    
    public int getTimeMs();
    
    public int getSize();
    
    public java.lang.String getMime();
    
    public java.io.InputStream getInputStream();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1XfWwURRSfu2uvvbZ4vX7QhhZaCgQb4PpBCpT6h01Lw8GV" +
       "nr0apZYce7tz14W9\n3XV3rr0iEohI0UQSAn4lqDHRkBjiHxLwHxMkgF+RxP" +
       "QfUKPRYAhGMRhjJAaDb2b2envbA/xIaLLb\n2Zn35r15v997b+7EdVRsGqhR" +
       "NINkSsdmsC8aEQwTS32KYJojMBUTLxT7Isc3q5obucLILUsE+cOi\n2SYJRG" +
       "iTpbZQf0/GQM26pkwlFY1Y+8zZZf2SW5OfT29q8CD/KPLLapQIRBb7NJXgDB" +
       "lFFSmcimPD\n7JUkLI2igIqxFMWGLCjyLhDU1FFUZcpJVSBpA5vD2NSUCSpY" +
       "ZaZ1bDCb2ckwqhA11SRGWiSaYRJU\nGd4hTAhtaSIrbWHZJD1h5E3IWJHMJ9" +
       "Ee5Amj4oQiJEFwfjh7ija2Y9sAnQfxMhncNBKCiLMqRTtl\nFSLR5NSYPfHS" +
       "zSAAqiUpTMa1WVNFqgATqIq7pAhqsi1KDFlNgmixlgYrBC2446YgVKoL4k4h" +
       "iWME\n1TvlInwJpHwsLFSFoFqnGNsJMFvgwMyG1pC34q/nI380M8yLJCwq1P" +
       "8SUFrkUBrGCWxgVcRc8WY6\neDS0Nd3oRgiEax3CXKZ32fuPhq+daeIyDQVk" +
       "huI7sEhi4q01jQtnen/weagbpbpmypQKeSdnqEas\nlZ6MDmyeP7sjXQxmFz" +
       "8c/mjr3nfwT25UGkJeUVPSKTWEfFiV+qxxCYzDsor57FAiYWISQkUKm/Jq\n" +
       "7BvCkZAVTMPhhbEukHE2zugIoRJ4XPDUIf43j74ICgxgIo5jiTI0bYg4qBPU" +
       "qWIyRkkgahLAP7bD\n1GUJG2OCLo+lNAkrY3OUMtSQf9LlohnrzDcFyLlRU2" +
       "CLmHj8yme7N2x+7iBHjzLOcpGgdjAbzJkN\nWmaDYDbIzAYdZpHLxQzW5QeV" +
       "oiTRZPr5vZ7KQ6vM027kGUU+OZVKEyGuYEhCQVG0SSzFCGNhwMZ4\nRjRgaU" +
       "UcCAtexBTYiCUIRHHCQC1OYubSOQQjAdg2s+f2F7/EJk9SDlHMa+ju3DVAcC" +
       "f3raI1um3T\n9oMtHio0WUTByLBErKNWnCEcoCUhu38q/tTv514va+b7U53G" +
       "7AZgzKlJy8TNZ7ztlz4ov8CCnq0o\nflvpiWLC+RnI+TpiYAzz37wSOfLi9e" +
       "knmKPcUw9BpUIcji2IhEBgswWIIK+ejiuyaDtJdYEUCtbX\nHH2p9dgl5wEo" +
       "lvU4K7mhb5DnGs/M3ceuHGj97suLVvbaukJO6sfY/vTpZ8/MuGk580F9Fswt" +
       "WYax\n/kBHLlYzVSAj3YDO+Bh7yziJ24mlua6jfS33roag1f+MmyOGnKMnhW" +
       "PhneoYq8HTj/9acUA4v42f\nqSqfxhvUdKrrjcu49eEKsUC2+Iimr1LwBFZy" +
       "wXZaG2T1Pcsb/2NN3w+sOf60M+xFNGftYc9Xi4ln\n3z3zddflr/aDF6OoZM" +
       "tQtK83vAEcbrqruZgYmGh4xDMuf8LgYJW6QFfKV+qxHxOAMjA0VXVkFqi5\n" +
       "CRgxNBFL0Hlzdl/+c+ONI8Xdp9yoCGgADZcIUCahey1yGs/rED3Z3KCmQLM8" +
       "oRkpQaFL2RZZRsYN\nbTI3wxgzj40rIZLl8CyAx2/VWPafLlbRVzUvkky6hb" +
       "2X8Xxy0/Fy+mq1MsdF3ysBl+pcPvYahjBF\nS0dm38zCVz8WXoPOAx3AlHdh" +
       "VuBRXhWxdqDvAdsi/e4F8iQxGZFTeNAEGw127COGnIKWNGH1zFOj\nv7VLV1" +
       "f0c4bW2+9idsGNnbfx0uprNxhPHYlXoDE7jBxe9NbVk1eGazjL+e1lyZwLhF" +
       "2H32DYaSp0\nmmeL72aBSZ9fsfjEnuFv424rCl0EeaByQc1i7nYhFquH8rCs" +
       "hydgYRn4n1g6kbgnTCMElQBMUcCX\nfg4VcrABnmrLwer77eA27uAg8IitW7" +
       "eAhK2ArgNoqoA09EIelKVgWBMFJdT/5tnymcPpNZs4q+bZ\nBEL9sUzTxbdb" +
       "bzezomGVbK/thmV9l0wIRo5iOv2XJKjn399c1nd0r+zoWNW5Fi7j1mmWm828" +
       "7mSr\nfyXLQno/CPIbcSEslsNTa2FRe7+x0Ah6ALwPqXqagItYSNkhydgg6W" +
       "YL7GI49d8C1tlBA7a6m6C6\nfJNz4sarl6wFbULUGb9jU3rzqJ/zK43/lhBb" +
       "ZrY/eE4PfMqq+ex9vxQokUgriq1Z2BuHVzdwQmaH\nL+VFmkdiH0HN92rlBB" +
       "Wz/+wUe7nefvjpc2c9KCXwtstPwy+2wvKQNNbILv884JcvT1BZ7sMu+gJY\n" +
       "A1E6PKQXYCi/DmX0vwHTulD1QA8AAA==");
}
