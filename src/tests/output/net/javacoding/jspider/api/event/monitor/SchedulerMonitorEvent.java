package net.javacoding.jspider.api.event.monitor;

public class SchedulerMonitorEvent
extends net.javacoding.jspider.api.event.monitor.MonitorEvent
{

    protected int jobCount;
    protected int spiderJobsCount;
    protected int thinkerJobsCount;
    protected int jobsDone;
    protected int spiderJobsDone;
    protected int thinkerJobsDone;
    protected int blockedCount;
    protected int assignedCount;
    
    public SchedulerMonitorEvent(int jobCount, int spiderJobsCount,
                                 int thinkerJobsCount, int jobsDone,
                                 int spiderJobsDone, int thinkerJobsDone,
                                 int blockedCount, int assignedCount) {
        super();
        this.jobCount = jobCount;
        this.spiderJobsCount = spiderJobsCount;
        this.thinkerJobsCount = thinkerJobsCount;
        this.jobsDone = jobsDone;
        this.spiderJobsDone = spiderJobsDone;
        this.thinkerJobsDone = thinkerJobsDone;
        this.blockedCount = blockedCount;
        this.assignedCount = assignedCount;
    }
    
    public java.lang.String toString() {
        int pctDone = 0;
        if (this.getJobCount() != 0) {
            pctDone = this.getJobsDone() * 100 / this.getJobCount();
        }
        int spidersPctDone = 0;
        if (this.getSpiderJobsCount() != 0) {
            spidersPctDone = this.getSpiderJobsDone() * 100 /
                               this.getSpiderJobsCount();
        }
        int thinkersPctDone = 0;
        if (this.getThinkerJobsCount() != 0) {
            thinkersPctDone = this.getThinkerJobsDone() * 100 /
                                this.getThinkerJobsCount();
        }
        return "Job monitor: " + pctDone + "% (" + this.getJobsDone() + "/" +
        this.getJobCount() + ")  [S:" + spidersPctDone + "% (" +
        this.getSpiderJobsDone() + "/" + this.getSpiderJobsCount() + ") | T:" +
        thinkersPctDone + "% (" + this.getThinkerJobsDone() + "/" +
        this.getThinkerJobsCount() + ")] [blocked:" + blockedCount +
        "] [assigned:" + assignedCount + "]";
    }
    
    public java.lang.String getComment() { return this.toString(); }
    
    public int getJobCount() { return jobCount; }
    
    public int getSpiderJobsCount() { return spiderJobsCount; }
    
    public int getThinkerJobsCount() { return thinkerJobsCount; }
    
    public int getJobsDone() { return jobsDone; }
    
    public int getSpiderJobsDone() { return spiderJobsDone; }
    
    public int getThinkerJobsDone() { return thinkerJobsDone; }
    
    public int getBlockedCount() { return blockedCount; }
    
    public int getAssignedCount() { return assignedCount; }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYf2wbVx1/+eXEidP8bBuatEnTwBqW2EmTtGWZoCFJFafO" +
       "6sVZR0Mm73z3nFx7\nvrvdPTtut1UgunXbHxPTBtuk0gnEVAlVCFFtSIAoo9" +
       "tgsAoIaBugTaCiaQg2DSFEBUPl+37YPp8v\nSaWSSHd+ufd93+/nfX+/d+F9" +
       "VGVbqEO2g+SEie3geCwqWTZWxjXJtufgU1x+pcofPX9IN8pRWQSV\nqwpBDR" +
       "HZDikSkUKqEgpPjGYt1GUa2olFzSCCTwmX23Z9tPz6men2CtQwjxpUPUYkos" +
       "rjhk5wlsyj\nQAqnEtiyxxQFK/OoScdYiWFLlTT1JBAa+jxqttVFXSJpC9uz" +
       "2Da0DCVsttMmtpjM3McICsiGbhMr\nLRPDsglqjByTMlIoTVQtFFFtMhpBvq" +
       "SKNcW+D51CFRFUldSkRSDcEsntIsQ4hg7S70BeqwJMKynJ\nOLek8riqgyY6" +
       "3SvyO+45BASwtDqFyZKRF1WpS/ABNXNImqQvhmLEUvVFIK0y0iCFoG2rMgWi" +
       "GlOS\nj0uLOE5Qm5suyqeAys/UQpcQtNlNxjiBzba5bOaw1mFf4L+PRf/VxW" +
       "xeqWBZo/irYdEO16JZnMQW\n1mXMF15LB58KH013lCMExJtdxJxm7OPfuyvy" +
       "3qVOTtPuQXM4cQzLJC5/tLdj+8rYn/0VFEaNadgq\ndYWinTOrRsXMaNYEb9" +
       "6S50gng7nJH8++evQL38J/LUc1YeSTDS2d0sPIj3VlXIyrYRxRdcy/Hk4m\n" +
       "bUzCqFJjn3wG+x/UkVQ1TNXhg7EpkSU2zpoIoWp4yuCJIv7noy+CtsbkJayk" +
       "NWzNGLoKTjmZwToJ\nmgQd0DFZoK4gGwo4wcIx21QVbC1IprqAKdFCiq9YWI" +
       "VFlgpvWC4ro1HsjkENHHbK0IBhXD5/9ecP\nTB569BFuUeqFAjZBnwYQwQKI" +
       "oAARBBBBBiIoQAQ9QaCyMiZ+a7HaqR0VGm5/++5o4+P99ovlqGIe\n+dVUKk" +
       "2khIYhTCVNM5axEifMT5scMcFcEfw4kACXBkxxDRixEAI9ZyzU7XbdQsCHYS" +
       "SBP66cuv6r\nD+LLF6mXUa9opdw5NLDxcY4t0Bu7Z/reR7orKNFyJTUfkPas" +
       "zz0uf/DYzMU3fvH27kKIENRTErml\nK2nkueFHLUMGxVq4wP7pf099+GTVp1" +
       "4oR5UQzpDQiARuCNlhh1tGUQSO5rIZVRasrEsaVkrS6FQu\nBdWSJctYLnxh" +
       "LlTPxo2ggDp4quDZJny4ib7oZDN9tXCHo/p07YHlymtf8g28+cO6V5hScmm1" +
       "wZF/\nY5jwIG0qmGPOwhi+v/1M9MmvvH/m88wWwhgE+cx0QlPlLMO3tQxs3+" +
       "KRMIJtrU99tffsmzljtxS4\nj1mWdILaOvvFle3P/lT6GiQTCGpbPYlZzNYw" +
       "STWwqB3nWE6Oz0QtNQVpIyPy2gvz/xhQ3r11gues\nNme9dBJO7bmOe1re+5" +
       "Dt3w/FS7LvyIdaafJ0CXlixzffvXh1tpW7FK8wu0qSvHMNrzLMJgEzC3vY\n" +
       "uZYERv3yrTsvnJp9J8F30lwctJN6OjXy3Fu490BA9sgUFVAHwSRsXyP069Da" +
       "r5zV6LuPjfupNzGN\nI4a6W5DQoHbnr4O0RuciIpW4/5+Xz9V2cQvTNR3ehi" +
       "taFZfvO3l2aCV2t8q36zaAi/jkj+46d+0K\neYebLx90VNrObCnAI5IjH+x/" +
       "I9Pk+85zqXJUPY8aWQci6eSIpKWpc89DD2GPi48RVF80X9wP8OI3\nmk8qHW" +
       "4PcIh1h3vBXDCm1HTsd0X4JnjaqepEhNe4IrwMmXQwwRb0sPct+Xj0m5ZBAB" +
       "9WsgTVHDMS\n40ZaJ3mTNzDyzxTJ6obHL2T5vWVN09dBSBW89EwbCXt9vrvg" +
       "qRV8a735zgi+jWSJ5vwbZNwu0iDK\n/ZYyjgrGVAP2hKHjNRnuhCcgGAa8Gc" +
       "YEw00FDazLliq2XrCt92Z7JKdYhwLW5dspflHut5TvUcE3\nkNAMGYrp+krt" +
       "gqdBMG3wZrogmNZD8Ydev4Qr8+NPiIRRyCkdIp9AJti+WkvLUt+Zz/098LD0" +
       "8j3l\nIvmMgDsTw+zXoMvRCnnIzWSGdfC5kGu4u/NPB/eef9CdiGppB+ZMRM" +
       "XL4vJL3770h5G3fn8akss8\nqr7jcGx8LDIJWaVzTXFxuSnTfmfFkvqzcnZ+" +
       "4Dmh5NxRvGi0OBPUWhiOTfpcUT7oKqr4O+DpENbp\n8Kr4DtWvks7XzfXHIV" +
       "yIwY87oKw2p7J40uNl8IGzVx/u/ePvrogzhKPWFqj+Ej+dfvGhSytMKa5C\n" +
       "y06pdFTGTm6QwOPFqbCWt81QymrZysGhwaEhQNQMouixNqgqwYghS1p44usv" +
       "1a08kd47zbHUOwjC\nE/Fs55Xne693MQxCpM9xThH/V2ckq9AEMEdPEzR9s5" +
       "3/bcMjfYMj/Xv2fRICBqIbtJTTLRXRCkmP\nNUG0pgT5BGIzSyWG7xOG79sg" +
       "wz8Iil7EZNxIpQA6I7G4CU47TTDMZjL09RBB4ZtX0HDf4GD/0ABB\nLQXpt9" +
       "hdPBqomPu9NELdf0BoZGCDNPIoQXWAadpZPr2w0BI3LLAMbxCWL0P7AVhiHp" +
       "XXC1IPPPsF\npP0bBOlpbrI5r6K9msluF5hu3yBM5/ImKxRQLyy0KB8QWA5s" +
       "EJbn4bRcZLI1EVEnmhCIJjYI0QXu\nRHMeXcZqSpoSkKY2CNJF6HoA0mfdDc" +
       "pqKooIPJENwvN9yMiAZ6ykt0HQSW/2TGL0KNtWcrPK7//k\n7pV7d182m15j" +
       "NwT5O7oaKEDJtKY5DwKOsc+0cFJleGr4sYAn4ssE7b7RayCCqsWI7fMnnMOr" +
       "BHWt\nx4GgKvbrXPcaQdtWXwdnTng76V8naIs3PeASIyf9L6GnLqaHmlP4x0" +
       "m6AtKAlA5/YzrL1G+dZWqP\nmSuwIzd8ceY0Ku1TWx2NRMzEskp7jew3flB5" +
       "5+O//g/rJ6plfjVOr4NlO5RRoacIjemSdsJmB0k6\nRy/I5LRlAVPW6Aob19" +
       "mcI7/+bXde1udl9cwdjU7yi4Pl/OZGRvYN/D8K7759tDMZhPa6cm4qHLv5\n" +
       "K8ZTFvqYl8bYLkTYombWom0qND30MsM5aQo8/wOccG2o9RgAAA==");
}
