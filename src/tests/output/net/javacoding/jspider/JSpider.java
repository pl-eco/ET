package net.javacoding.jspider;

import net.javacoding.jspider.core.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.impl.CLI;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.ConfigurationFactory;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class JSpider {

    protected net.javacoding.jspider.core.Spider spider;
    protected net.javacoding.jspider.core.SpiderContext context;
    
    public JSpider(java.net.URL baseURL) throws java.lang.Exception {
        super();
        net.javacoding.jspider.core.SpiderNest nest =
          new net.javacoding.jspider.core.SpiderNest();
        context = SpiderContextFactory.createContext(baseURL);
        spider = nest.breedSpider(context);
    }
    
    public void start() throws java.lang.Exception { spider.crawl(context); }
    
    public net.javacoding.jspider.core.SpiderContext getContext() {
        return context;
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        CLI.printSignature();
        if (args.length != 1 && args.length != 2) {
            System.out.println("Usage: JSpider baseURL [config]");
            return;
        }
        if (args.length > 1) {
            ConfigurationFactory.getConfiguration(args[1]);
        } else {
            ConfigurationFactory.getConfiguration();
        }
        java.net.URL baseURL = new java.net.URL(args[0]);
        net.javacoding.jspider.JSpider jspider =
          new net.javacoding.jspider.JSpider(baseURL);
        jspider.start();
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1360121597903L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1YfWwcxRWf+/Cdzz7ir8QY4tiOOUJM7Dt/xCbBVYVlO8rF" +
       "l/jic6A5kh7r3Tl7\nk73dZXfufEkhatWUAH+gRkALagqlahWpilpKClSiah" +
       "oB/Y7U+g+grUCtghBVGwSqqkQtVfpmZvdu\nb++SuFIt7Xpu5s17b97H773Z" +
       "M5dQnWmgTtGMkiM6NqOTqaRgmFiaVATTnIepjPhmXSh5ekbVvMiT\nQF5ZIq" +
       "gpIZoxSSBCTJZi8anxooF6dE05sqhoxOJTxeXu2z5d/u2JXet9qCmNmmQ1RQ" +
       "Qii5OaSnCR\npFE4h3ML2DAnJAlLadSiYiylsCELinwUCDU1jVpNeVEVSN7A" +
       "5hw2NaVACVvNvI4NJtOeTKCwqKkm\nMfIi0QyToObEIaEgxPJEVmIJ2STjCR" +
       "TIyliRzAfRMeRLoLqsIiwCYXvCPkWMcYztoPNA3iCDmkZW\nELG9xX9YVsES" +
       "3e4dpRNHZoAAtgZzmCxpJVF+VYAJ1MpVUgR1MZYihqwuAmmdlgcpBN16TaZA" +
       "VK8L\n4mFhEWcI6nDTJfkSUIWYWegWgta5yRgn8NmtLp85vDUbCP/n8eTlHu" +
       "Zzv4RFheofhE1drk1zOIsN\nrIqYb7ySjz4V35/v9CIExOtcxJxm4vZX9yU+" +
       "PNfNadbXoJldOIRFkhE/HevcsDLxfshH1ajXNVOm\noVBxcubVpLUyXtQhmt" +
       "tLHOli1F782dzP93/xe/hvXlQfRwFRU/I5NY5CWJUmrXEQxglZxXx2Nps1\n" +
       "MYkjv8KmAhr7DebIygqm5gjAWBfIEhsXdYRQEB4PPOOI/7XRF0GhXSldlrAR" +
       "1QnqjR5QMTlA3S9q\nEjj+wCGTLR4oERUpw6Zlj4dmpjuvFAjCnZoChBnx9M" +
       "VfPzQ989ij3Es0sixVCOoCIdGykKglJGoJ\nQR4PY39zpamo7SWaIn9/abz5" +
       "iQHzFS/ypVFIzuXyRFhQMKSWoCjaMpYyhMVWiyOOWfhA7IUXIAxB\nZkYBRi" +
       "zswTYFA/W6w62cpHEYCRBDK8eu/u6jzPJZGhnUk2spd64a+OUw1y3clzq464" +
       "FHe32UaNlP\nTQ6kkRtzz4gfPb777Fu/eXdzOawJilRlW/VOmi1u9ZOGJmIJ" +
       "0KjM/uv/2vnxk3XbX/YiP6QggBAR\nIHQgo7vcMiqyZtxGIGos2NmY1YycoN" +
       "AlGzYayJKhLZdnWIjcxMbNYIBGeOrg6bTiroO+6GIrfbXx\ngKL2dJ2B4duV" +
       "LwcG3/5J45vMKDYUNjkwM4UJT6yWsjvmDYxh/t1nkk8+fenE/cwXljMICuj5" +
       "BUUW\ni0y/mz3g+7YaSR7tWPvU1/pOvW07u63MfcIwhCPU18UvrWx49hfCNw" +
       "EAIBFN+ShmeeYpub0D2yyn\nJ3dz2OAg89Cpi4/0/fkPFywgchS4MtVfM8fz" +
       "r3zl3IqXmjgEpUYw99hJxEodHXkY/IMbWcjTmRCz\nZwPP0yGCgmzn0BCo0w" +
       "pyaGGMylI0oYmCEp964Xzjysn82C6uyE0OgvhUpth94bt9V3uYApa8gAPp\n" +
       "rN/BgmDsKWc3/TdM0JYbI8ndw1v7h4cGRoA6uCCYeN9cgvlkLUFhZm2KEjBp" +
       "e4q++9l4wGFl+jvG\nT/uZ0mmHdZsT9xuFgOh0UcQ6VZwR91psafK7cWwHrb" +
       "925uQWvvDP159r6OGRQPd0MtFesOh6p4Mr\ndmXEB4+eGllJ3Sdz07ork4v4" +
       "6E/3PXflAnmPhXk5Oam0jcVqBe8VHLix7a1CS+DF53NeFEyjZtZd\nCCq5V1" +
       "DyNAnSECDmpDWZABc71ytrPY+98RL4dLqBwSHWDQtlgIdxZSyWkWCNhQLrLC" +
       "RY50ICD2Lh\nE2cbIux9RylvQ7qhEdAPS0VIYh5MTu/Pwizz/nZXqHNTT92z" +
       "/fz7l34gX2bh3MBarAlKbikdYjOO\nDPNpukmLuaObtDhFZnVznMncSqzMHN" +
       "62FcL4zlUE/chQ/7aBIdjYOL8znorydcorWTrVMegSqvWn\nUi27oVYWU2sc" +
       "sa3mc85FKLL+uemJKTsNeq9RcUXNwNFUSYcmRj9V4bAIPO0W6/baDvs8fc1A" +
       "9om8\nY3a6RSgl5SCb3usw2V2rw4mR0f6h0YFhMHCY2cySQrktlIXSn2n7vH" +
       "03Pu9keVsT03STBQhlnOGJ\njooQUBuu1Y6yVvrE5z4JPyK8cZDnemtl30J9" +
       "M/r8O7jvnrBYoxkKEU0fUHABK2VAckvbzdp0O/ea\n7uv+y46x0w+7EclHWz" +
       "InIlVuy4jnv3/uT6Pv/PE4aJFGwT2zqcmJxDQo3H1dcRmxpbB+r29J/iVL\n" +
       "HQscqi4XlZvGKyGhwcBwN1LnK4Chp6JFuAWeLivOumq1CA4fuWoBsv20ykLx" +
       "cCkmR1n8fpbNLhO4\nbhLBIG5gTxpyDipewbpFvJz+x6D0wZYp7uwO5+3USb" +
       "hz+CqOtH34MYf0yvpdoyC4hJzs+s4HZy/O\nreUBw+9zt1VdqZx7+J2OnSSs" +
       "05DdeD0JjPqNLRvPHJt7b4GehO7LAWoUNHqJ5kg6iJjVSIWfboen\n1/JT7/" +
       "/RT/Yi/f0YQQ2LmExWw8lXS64bY9Mj9HVylTiytX8I+g1AnbYy8zvMHh6blN" +
       "GS+8CApehO\neDZZB95Us3etKldeOu6jgM4+JFw/MKHzdcQQ6y6ph44vz1za" +
       "3Hn5G17kvU7/V+OmXOKQEV/yRT7x\nvtYeYT2/nzZZLPvcnxiqvyBUfBhgp2" +
       "ws2aTTcvy1bOJ017dK7rrLjf5jo6vz2uhI/8gg81q9YCya\n0fuLBymnFwjy" +
       "WcMS6jeXCyL/bqHruq3AyJi+anw4U9J6mwMfnobsyEFbRsfHETQhQUtJej/o" +
       "qPrE\nxD+EiL0rD2x+XW/5FXeB/bGiHvrobF5RnF2TYxzQDZyVmdR63kNxxX" +
       "5IUHvtygbaHHL0RC9y+h8R\ntKaSHhKr/MNJ+irYE0jp8Md6DYPy5rBoRavd" +
       "m6R0LMr0IlH89mv+vU/8/t+sRNglmX4tgvapIMOF\nITahCsoRk/WidI3exc" +
       "W8AfdMwmqpdfJGk3PkX4fWO7uvkqzI/P7kdHUDNva/dBNDEH1+2k3c+HME\n" +
       "tGO31DoyU8PZdFGF9lts/ws6XcPqvBQAAA==");
}
