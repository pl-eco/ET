package net.javacoding.jspider.core.storage;

import net.javacoding.jspider.api.model.Summary;

import et.util.MyUtility;

public interface Storage {
    
    public net.javacoding.jspider.core.storage.SiteDAO getSiteDAO();
    
    public net.javacoding.jspider.core.storage.ResourceDAO getResourceDAO();
    
    public net.javacoding.jspider.core.storage.DecisionDAO getDecisionDAO();
    
    public net.javacoding.jspider.core.storage.CookieDAO getCookieDAO();
    
    public net.javacoding.jspider.core.storage.EMailAddressDAO
      getEMailAddressDAO();
    
    public net.javacoding.jspider.api.model.Summary getSummary();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1YaWwbRRSeXE6cuORsGnolBCoaSNZx3ITS/KBRklK3ThPq" +
       "ImgIcie742Sb9e6y\nO06cUqoiCj1+IBA34hBIqAgQSCDgD1JB3AgklD9cQg" +
       "KVHyAOwQ8EQkXlzczau946aVClRtr17Mx7\n895875s3b/LSr6jCttBa2Zbo" +
       "vElsaTAxhi2bKIMatu090JWU368Ijp3cqRulqCSOSlWFotq4bIcV\nTHFYVc" +
       "Kxof6shdpMQ5uf0gzqzHPOLFsuPzP36dEda8pQ7TiqVfUExVSVBw2dkiwdR6" +
       "E0SU8Syx5Q\nFKKMo3qdECVBLBVr6gEQNPRx1GCrUzqmGYvYu4ltaLNMsMHO" +
       "mMTiNnOdcRSSDd2mVkamhmVTVBff\nj2dxOENVLRxXbdofR4GUSjTFvg0dQm" +
       "VxVJHS8BQINsdzqwjzGcPbWD+IV6vgppXCMsmplM+oOiDR\n6tfIr/iKnSAA" +
       "qpVpQqeNvKlyHUMHahAuaVifCieopepTIFphZMAKRasXnRSEqkwsz+ApkqSo" +
       "xS83\nJoZAKshhYSoUrfSL8ZkgZqt9MfNEazQQ+vfE2F9tPOblCpE15n8lKK" +
       "33Ke0mKWIRXSZC8e+M9GBs\nb2ZtKUIgvNInLGQGNrx5Y/zHU61CZk0RmdHJ" +
       "/USmSflM39p1CwM/BMuYG1WmYauMCgUr51Edc0b6\nsyawuTk/IxuUcoNv7/" +
       "5g7+EXyM+lqCqGArKhZdJ6DAWJrgw67Upox1WdiN7RVMomNIbKNd4VMPg3\n" +
       "wJFSNcLgCEDbxHSat7MmQqgSnhJ4mpH4W8FeFAUTQEQIjGRS1KUTOsGCLxsK" +
       "hH1iv22qCrEmZMMi\nE7aQm8jLZ9nctXMlJWyT+reYBnzcbmignZRPnv7k4P" +
       "DO48dEwBjJHK8ouhosSq5FybEoMYuSY1Fy\nLKKSEm5rVSGELCYK2zq/vNpf" +
       "d2+X/UYpKhtHQTWdzlA8qRHYcljTjDmiJCnnXL2H35xWwMnQJNAT\nHEhqMB" +
       "HfDoDZrIXa/TR0N28MWhi4tXDo7Oe/JedeY4xhEW5iswvXIF4zwrdQR+LWHf" +
       "uOtZcxobly\nBn2Wb7tVzIofvW0sAeTmT0/e/ue7T1W3ifmZztrcBGDMr8mS" +
       "wt93Bbq/eKvmfY53Ln/UehJNglDB\nxnrX1z0WIdD/7aNjDzz069FbuKPC0z" +
       "KKqvAkLBvLFPiSTzcUBczMpKbKnpU0FtkwUkvTgw93PPFF\n0QWsW2yf8xx1" +
       "9OY/Qvfg924Vu7GhMPDDeibd+/SXpGNrSC5CrSA1zC6NzBLNdc9vbYTnvxzS" +
       "tTe1\nfr+t7+QdfkcDjOAkpzM8OFKolpTfefnUN71ffn0EvBhHlbtGE4MD8W" +
       "FwuHVJc0m5fnbNDWXT6kel\nPPuyTFYkaxcq9XuXCcnfInDo6Aww1hPMnkvZ" +
       "McuQiQInk2v3kX+2//5AxbWvl6JySMdwIFEMaQSy\n+3q/8YIM2p9jEzMFmj" +
       "Upw0pjjQ3ljpBqOm0Zc24PzxEreLsOkKyB5zJ4ap0cxH/ZYAN7NYqMwqXb\n" +
       "+XuDYGApa1/JXh0O10rYuxPi0ugyeMCy8DzbbNk7F9Y99iF+EjIzZEhbPUB4" +
       "AkQF+86Zgb23egbZ\ndz9F1VOEJlRKhgZGwUiLN/gi/4vT4uATp+/p+O6rz5" +
       "wTxVOpuFI/JY9k3rj71AIPchBqBmzvcgMI\nNQtrlfBzHGLAc5QIJXtXiyx7" +
       "PduCTLMn2g3+NIAhVuJIqiLFDRlrsaFn3qlZuD/Tt0N4ssIjEBtK\nZls/e6" +
       "7jbBv3wDEY8JxZznflLLZ2uTuI/Wyn6PqlzgSK7ZmJOcOamRgiMnSP6gk+Co" +
       "J7YEgyt/RG\nOnu6uzZ1X0XRKjqt2vmk7gGYWWpa7lkgdBBX6isgVgc8dQ6x" +
       "6i6QWH5anJczYxRdAktidV7GkvPL\nGhbx2+vGL8L7Y+w1fsHo9vV1RvoEum" +
       "v86PpdAYTDy0HYo7cYyvUOyvUXG+V9AmUGhw3E9aGsuij3\nuCjvp2jbBXJ4" +
       "c+fmrmhPMZD9niwXZI9eMZA3wNPggNxwsUGGszMESxs0jBnVT+R5F+KoC/EB" +
       "iq5b\nCmI1bWoTAlXnUhWDHkA2Eol0RroFtpf6sS10oEmUp+dFNq9VDNcIPI" +
       "0Oro0XG9fDcLWCZQ2PYFWD\nqyRcFW0fusdddDe56J6gaGh5BI6x0syEkoBs" +
       "3zMSd9h7TbQzGu3qjQLEnRxiWYSAZ2AB2sYOaRHH\nAPXoclD36RbDnp37TQ" +
       "72TRcb+/ucIz2TTmNr3ov5Yy7mvS7mj1PU978uQ1t6ujsjka5olKJG19CV\n" +
       "dpso0HJgblwETGyqUtpQiCY5mihLUaUzO6vUW875H4a4acvtC/s2vmvWf8xr" +
       "ufxtuAqO91RG0zyl\nordsDABJUipff5Uo0QQYz1J0+TLCDa45Lb6uZ4Tyc5" +
       "Afl1CmqJz9eDWep6i5uAZYcFpe+Rch/RfK\nQ1jdD6/oyxSVgShrvmLm0K/j" +
       "xSK7+EmiPsua/wHxpcAIZRIAAA==");
}
