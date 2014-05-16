package net.javacoding.jspider.core.task;

import net.javacoding.jspider.core.exception.TaskAssignmentException;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.work.DecideOnSpideringTask;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public interface Scheduler {
    
    public void schedule(net.javacoding.jspider.core.task.WorkerTask task);
    
    public void block(
      java.net.URL siteURL,
      net.javacoding.jspider.core.task.work.DecideOnSpideringTask task);
    
    public DecideOnSpideringTask[] unblock(java.net.URL siteURL);
    
    public void flagDone(net.javacoding.jspider.core.task.WorkerTask task);
    
    public net.javacoding.jspider.core.task.WorkerTask getThinkerTask()
          throws net.javacoding.jspider.core.exception.TaskAssignmentException;
    
    public net.javacoding.jspider.core.task.WorkerTask getFethTask()
          throws net.javacoding.jspider.core.exception.TaskAssignmentException;
    
    public boolean allTasksDone();
    
    public int getBlockedCount();
    
    public int getAssignedCount();
    
    public int getJobCount();
    
    public int getThinkerJobCount();
    
    public int getSpiderJobCount();
    
    public int getJobsDone();
    
    public int getSpiderJobsDone();
    
    public int getThinkerJobsDone();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAMVZfWwcRxWfO9vnz+KvNDWxEzuOA3Vtnx3bd/mwEHX8odi+" +
       "xoedtMS4uuztztkb\n7+0uu3P2JYSIj9AE/iiqWgqIUkAUBaEKoYYWJJBC1Y" +
       "YvUYT8TwsVCJSqKoKgVghaoaLw3szu3d76\nbGMoJtKs52bfm/fm9977zczm" +
       "yZukzLZIi2yH2VmT2uGR2bhk2VQZ0STbPgFDCfl6WWX8ypRuBEkg\nRoKqwk" +
       "htTLZ7FYlJvarSOzE6lLVIm2loZxc0gznzrJnlyL63V35xabK5hNTOkVpVn2" +
       "USU+URQ2c0\ny+ZITZqmk9SyhxWFKnOkXqdUmaWWKmnqORA09DnSYKsLusQy" +
       "FrVnqG1oyyjYYGdManGb7mCM1MiG\nbjMrIzPDshmpi52RlqXeDFO13phqs6" +
       "EYCaVUqin2h8kFUhIjZSlNWgDBnTF3Fb18xt5xHAfxKhXc\ntFKSTF2V0iVV" +
       "ByRa/Rq5FXdMgQColqcpWzRypkp1CQZIg3BJk/SF3llmqfoCiJYZGbDCyK51" +
       "JwWh\nClOSl6QFmmCkyS8XF69AqpLDgiqM3O4X4zNBzHb5YuaJ1nSo5p+fib" +
       "/ZxmNeqlBZQ//LQWmPT2mG\npqhFdZkKxbcy4UcmTmVagoSA8O0+YSEzvP97" +
       "J2OvXWsVMs1FZKaTZ6jMEvLb0Zbdq8OvVJagGxWm\nYauYCgUr51GNO2+Gsi" +
       "Zk887cjPgy7L780cyPT33sW/RPQVIxQUKyoWXS+gSppLoy4vTLoR9TdSpG\n" +
       "p1Mpm7IJUqrxoZDBfwMcKVWjCEcI+qbEFnk/axJCyqEFoJ0n4l8jPhipnpUX" +
       "qZLRqBU2GenWKZvH\n8MuGAoGfP2ObqkKtedmw6DyT7KV5j3gWJ69dCQSwSv" +
       "01pkFCHjM0UE7IV278/PzY1Kcvi4hhljlu\nMXIXGAznDYYdg2E0GEaD4ZxB" +
       "EghwU3cUQogxUbB0/vzUUN2DPfYzQVIyRyrVdDrDpKRGoeQkTTNW\nqJJgPO" +
       "fqPfnN0wpysiYJ6Qn2ExpMxMsBMFu2SLs/DfPFOwE9CXJr9cKtX/0lsXIVMw" +
       "YjvANnF65B\nvJaEbzWds/dPnr7cXoJCK6UIfZaX3R1oxQ/eOBKAO386+ZG/" +
       "Pfd4VZuYH3Va3AnAmF8TSeGtT4b6\nXvxh9XUOt8sftR6imaVMZGN93tcTFq" +
       "Uw/tsvxB/+3M1LH+KOCk9LGKmQkrBsSWYMgHXphpGQmUlq\nquxZSWORggk3" +
       "7Xjk0c7HXiy6gN3r1TnnqEsffKPmAen5+0U1NhQGfkzPpCNfeYl23l0jF8ms" +
       "SmaY\nPRpdplrePb+1ezj/uUjX3tf6h/HolY/6Ha3F/KauztjIPYVqCfnZb1" +
       "97OfLSby6CF3Ok/Pj07Mhw\nbAwcbt3QXEKuX27+QMmi+tMgZ19ksiKsXag0" +
       "5F0mkL9FYdPRETAcqcyuTdm4ZchQQBbN2/38P469\n/nDZ4aeDpBToGDYkJg" +
       "GNALvv8RsvYNAhN5vQFGhWpwwrLWn4yt1CqtiiZazkRzhF3Mb7dYBkNbRO\n" +
       "aLscDuJ/8WUDPhoFoXDpdv7cLzIwiP334qPTybUAPrshLo35DB62LOksFlv2" +
       "46u7v/gT6cvAzMCQ\ntnqOcgIM8LmQQZq8wRR8Ltj//GM3Huj8/a9fcHYIz8" +
       "kjL/XHxMXMM5+6tsqDVglnAMk+ng8InEGw\nF+D7MmDKOUeEBp9VgjRHmaN5" +
       "oO9wBBxqAEt4ZgmrSjhmyJI2Mfq1Z6tXH8pEJ4Urt3kEJkYT2dYX\nvtF5q4" +
       "274FgMeTYh53f5smQdz5cE/hljJLIVij/SH+3uj/QM9jFSiu84+jsY6dqUtu" +
       "8zrCXY5aFb\nGDJ83o1hdzgAfw8Bw9iOUUCj2RueuKWmYVHLzh7+9Nxf+5RX" +
       "u0YFLE3es6FX8Fj/LdrR+NrrnBd8\nQSpyUPAZeWjPE69evTGzQ7CKOE3tW3" +
       "Og8eqIExVfTI2JvLZ3Iwtc+vmuvU9emPldMuiA0AsQLxt4\nhA1xf/sIxypa" +
       "UDzvh7bPKZ59/2XxuJEICjH++6jIz4QnP4UD4/g4vdXsGYh09w/0DAwyUg6Z" +
       "SU/O\nxNwEquF1i1nkDjqmUx7TB/OmF/4D0wPRnmi/L3GHNk3cFUjc8CiVYX" +
       "han+VvQfDfS+RTjJQlNUNe\nwh8nigXwILQuJ4Bd71AAXWLzoLjsQfFwHsWV" +
       "raI4ONA9ONAT8QQQp1E2RwI24PKMzrHAY4qnTjlN\nYxVcXJm6eWfLm18Kku" +
       "AGRFrkLpCbISE/VdLxRvAHOzv4TlaalGzBtf5L1No7UsHVh3tcXRCntg3i\n" +
       "5AX6Ex6gD3GKXTJN0x2MHDoYyaN/kZGDG6Gvpk1tfniB6mwCeki+g4e6B/t6" +
       "otG74P7HFlU7bOdi\n44BbLMdwh+13fO//3+XYg7mlH+jry6/ys1vNsUhfwR" +
       "aDc0xtnmCXYc/Aw8ioodN1q+090I44SBx5\nh5AgBcf3zWF63ANTv+ny0Ps2" +
       "4iGalamJG3kYaWfYxo8LaUiLMXecT/woI+9aoOzEIt4y+E7rNft1\nj9kD+e" +
       "g8wUh0SzkYjSKFDx6GFNztS8FC4zxuxYKA+9RRJwhH/09B+I4HjUFepl/l49" +
       "+ECzAsYxzI\nwA/gVY/KQB7A724VwEP9HECs4V1rAXQtr4veXmiTDnqT24Ge" +
       "t8i+z/jlmUODhcaF4qZQPAkUnzQM\njUq6e2Y5sN4K4s4K4tu9gutw8wWYjy" +
       "JXUmXEyOjMv4gS2BzcBUSKLaAd2r3OAu7d7gWsMlIHCxAk\n4KwAx39ZzNM9" +
       "0OYdT+e329OXRS1NGsmNndwPLek4mdxuJ19hpCHPW5v62gFt0fF1cbt9vclI" +
       "Pfgq\nzqCbuoqx1x1X9e129e+52Nvuhrwunsxxkm23k7d8eG7sKqbpOcfVc9" +
       "vsaqDCn6YeX7OwMeXOT/gV\nr2nN/2+Ir/By++rpO58z638mTsful/KKGJyc" +
       "Mprm+Yzk/aQUMi2aUvkSK8TnG74fBhoZadvs8uS5\nbAUahNpORpo3UAMN/O" +
       "PVeDccdotrwIbj9LzyLXAOKpRnpCr/wyvaCmwPothtyx3F6vhVFD8Hh8VX\n" +
       "nqz5L+5x+V17GgAA");
}
