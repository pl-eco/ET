package net.javacoding.jspider.core.threading;

import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.WorkerTask;

import et.util.MyUtility;

class WorkerThread
extends java.lang.Thread
{

    final public static int
      WORKERTHREAD_IDLE =
      0;
    final public static int
      WORKERTHREAD_BLOCKED =
      1;
    final public static int
      WORKERTHREAD_BUSY =
      2;
    protected int
      state;
    protected boolean
      assigned;
    protected boolean
      running;
    protected net.javacoding.jspider.core.threading.WorkerThreadPool
      stp;
    protected net.javacoding.jspider.core.task.WorkerTask
      task;
    
    public WorkerThread(net.javacoding.jspider.core.threading.WorkerThreadPool stp,
                        java.lang.String name,
                        int i) {
        super(stp,
              name +
              " " +
              i);
        this.
          stp =
          stp;
        running =
          false;
        assigned =
          false;
        state =
          WORKERTHREAD_IDLE;
    }
    
    public boolean
      isAvailable(
      ) {
        return !assigned &&
          running;
    }
    
    public boolean
      isOccupied(
      ) {
        return assigned;
    }
    
    public synchronized void
      assign(
      net.javacoding.jspider.core.task.WorkerTask task) {
        if (!running) {
            throw new java.lang.RuntimeException(
              "THREAD NOT RUNNING, CANNOT ASSIGN TASK !!!");
        }
        if (assigned) {
            throw new java.lang.RuntimeException(
              "THREAD ALREADY ASSIGNED !!!");
        }
        this.
          task =
          task;
        assigned =
          true;
        this.
          notify();
    }
    
    public synchronized void
      stopRunning(
      ) {
        if (!running) {
            throw new java.lang.RuntimeException(
              "THREAD NOT RUNNING - CANNOT STOP !");
        }
        if (assigned) {
            try {
                this.
                  wait();
            }
            catch (java.lang.InterruptedException e) {
                Thread.
                  currentThread().
                  interrupt();
            }
        }
        running =
          false;
        this.
          notify();
    }
    
    public int
      getStateH(
      ) {
        return state;
    }
    
    public synchronized void
      run(
      ) {
        running =
          true;
        net.javacoding.jspider.core.logging.Log log =
          LogFactory.
            getLog(
            net.javacoding.jspider.core.threading.WorkerThread.class);
        log.
          debug(
          "Worker thread (" +
          this.
            getName() +
          ") born");
        synchronized (stp)  {
            stp.
              notify();
        }
        while (running) {
            if (assigned) {
                state =
                  WORKERTHREAD_BLOCKED;
                task.
                  prepare();
                state =
                  WORKERTHREAD_BUSY;
                try {
                    task.
                      execute();
                    task.
                      tearDown();
                }
                catch (java.lang.Exception e) {
                    log.
                      fatal(
                      "PANIC! Task " +
                      task +
                      " threw an excpetion!",
                      e);
                    System.
                      exit(
                      1);
                }
                synchronized (stp)  {
                    assigned =
                      false;
                    task =
                      null;
                    state =
                      WORKERTHREAD_IDLE;
                    stp.
                      notify();
                    this.
                      notify();
                }
            }
            try {
                this.
                  wait();
            }
            catch (java.lang.InterruptedException e) {
                Thread.
                  currentThread().
                  interrupt();
            }
        }
        log.
          debug(
          "Worker thread (" +
          this.
            getName() +
          ") dying");
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1358050055855L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1Ye2wUxxkfn9+PYPyAmNhgY0wbF3x+GxurVS72UR8c2NgG" +
       "ggs91ntzZmFv97I7\ndz5TSoOSAkmrtFFIm0qUtFUiqgo1VVGo1EcoSmibtk" +
       "it/8ijVaK0oDR9EJFWFahNRb9vdta3t3c2\niavU0q7nZr/5vm++1++bOXuN" +
       "5JsGqZNNL5uJUdM7MDYiGSYND6iSaY7DVEi+lF88cmaLpntITpB4\nlDAj5U" +
       "HZbA1LTGpVwq2Bwf6kQRpiujozpepM8MngsnHNe9O/Pr65NpeUT5ByRRtjEl" +
       "PkAV1jNMkm\nSFmURiepYfrCYRqeIBUapeExaiiSqhwCQl2bIJWmMqVJLG5Q" +
       "c5SauppAwkozHqMGl2lPBkmZrGsm\nM+Iy0w2TkaXBA1JCao0zRW0NKibrD5" +
       "KCiELVsHk/OUJygyQ/okpTQLg8aO+ilXNs3YTzQF6igJpG\nRJKpvSTvoKKB" +
       "JerdK+Z23LQFCGBpYZSy/fqcqDxNgglSaamkStpU6xgzFG0KSPP1OEhh5K55" +
       "mQJR\nUUySD0pTNMRIjZtuxPoEVMXcLLiEkWVuMs4JfHaXy2cObw0XlP3nkZ" +
       "EbDdzneWEqq6h/ISxa5Vo0\nSiPUoJpMrYU3496Tgd3xOg8hQLzMRWzR+Nb+" +
       "YEfw7Qv1Fk1tFprhyQNUZiH5vZ66lbO+q8W5qEZR\nTDcVDIW0nXOvjogv/c" +
       "kYRPPyOY740Wt//Onoz3Y/8B36Vw8pCpACWVfjUS1AiqkWHhDjQhgHFY1a\n" +
       "s8ORiElZgOSpfKpA57/BHBFFpWiOAhjHJLafj5MxYv3lwHNajCvwxciSXbpx" +
       "ENyx36BS2BtjpEuj\nbA9GgKyHwfd7DpgxJUyNPbJu0D2Mk+F0+rIkyimfzs" +
       "nBhHWnmwqxOaSrwCQkn7nyy8P+LQ+fsJyH\nASc0ZKQDBHtTgr1CsBcFe+cE" +
       "e52CSU4OF3lnulXRTWHMpr99v3/poy3meQ/JnSDFSjQaZ9KkSiEL\nJVXVp2" +
       "k4xHgYVjhCnkcahGnZJEQsCAypwIhnCJgxYZBGd2Sm8jkAIwnCbfbIrd+8E5" +
       "o+h0GETq9G\n7pZq4MKDlm5lzWN7N+870ZiLRNN56B0gbbo995D8ziNbz738" +
       "q9fvTmUAI00ZiZm5EhPLrf6Iocs0\nDIUrxf6r/xq6/nh+33MekgfZCvWKSR" +
       "BlkPyr3DLSEqzfLlZoLFhZGtGNqKTiJ7vClIAb9enUDA+b\nO/h4KRigFJ58" +
       "eDpFiLbgCz9W4qvKCjK0p2sPvBTefLCg7ZUfl17iRrGrZrmjvI5RZuVgRcod" +
       "4wal\nMP/6kyOPP3Ht+Ke4L4QzGCmIxSdVRU5y/e7MAd9XZakH3prqk19pPv" +
       "WK7eyqFHefYUgz6Ovk0dmV\nX/u59HWoFZCzpnKI8pTM5ZJyYVENtVn6B7Za" +
       "FcaqR4dPXTnW/OZrl0XNcmBhiurPoYfi5z9/YdaD\nJi4GVJLMbXZicVTEUQ" +
       "5HCnAjD3mcKeb2LLFyt52JlR1tnW2gUCVIQhT1KmFvUJclNTD4zYuls4/F\n" +
       "ezZbqtzhIAgMhpL1l59pvtXAVRASCxxlUfwuTEjGtlTO478ORj6+mIqzsat7" +
       "fUdXS1cXAwOyGPdR\nNSM9H7yIjOi6ype3WqbY6DBFO//Qia/+/0HRrp6W7g" +
       "3Mqne2pkt5nGDJ8VooC1avdYbBiKFEwXgJ\ngV7PTfyjLfzWukHL/DXOrshJ" +
       "ONRxizZVvX2dp4ErGLJApEvIY6uefuvcldFqq7JYfcSaDCh3rrF6\nCW64sl" +
       "gS9rB6IQmc+sV1q88eGX1j0tpJZXrt9mvxaPdTr9Lme8rkLCCRC90OZCbfV7" +
       "edmfhez8e8\nYvCsIlylRkGChduNS5uwzbKrXnTyM/984XRJg5XFuKaOsyly" +
       "eyVtVUi+/9CpztmxXYq1F7d1XcSH\nnt9x+uZl9oblm7nCitJWJzMV3Ck5an" +
       "7vy4mKgu89FfWQwgmylDeRksZ2SmocC9gEJLc5ICaDkJzO\n7+ktnVU3+ueA" +
       "o87tXodYd0lP+QLG6XUkVcVr4OmAp0pU8SpXFeeIXZGK/gD0r1PUqPzjN56+" +
       "cfR4\nrwdrZH4CFQebOLJkWxy78GNnn1hZevLNL3BH2Zx3cuFN/P1Rq37nMl" +
       "Bd0STeHDZDyJi8qU8C2O8a\nHt3iHx0fGvX7BkOBwaAfSfwWuOB7e9pWuuGp" +
       "FlupztwKDu5DvMDBvix64HgvVwJfnwYFqtMUuDc4\nPLDFP7igDmjOZUKHZf" +
       "Pr4MFB5H3pkG6Ee3eM7Z5XgSVCiRVCgRVuBQgv5GqmXMDQ4pihM4g3Ggah\n" +
       "+egDuqCgenjqhKC67IJ4vkCjXQR9Gpy6qHV+8cWsVN/ESOEkVHQK0S/qRPt8" +
       "wlYJgcT+nylsRggr\nNOKaBkUaf8bn47cGnkbBrzE7v8OC3xxmCdD5XAp0On" +
       "pd+GtVkcF7+i5evfascoNjbAk/JPpwhcjH\nYj7jAP5cPWbiccRxHhacmoZj" +
       "plWyu2yxvRv6+hj5xKIArr2rc31HW0tHJ/hkfCgw5oW9IfMHrG0e\ngVNP5m" +
       "5QB2EqUsmL55JUqiMIOD9C4c/DQEWuvQt5c61YtDa79b8orJ/HJPOg0/xfcp" +
       "i/j3846rBM\n2+It084tg2bmlkG5yP3LQocj+OMEhNeu0cD4uH+b3RysW7CN" +
       "gYV2ByP4lSczs4/Y2JeCxzr7g0FW\nznfA5hB9/L53y45JL+71CBz9JGyA6b" +
       "EWlSaomoJUN5Ot/D7BRo/yXfV/2NRz5rNuTC3AQ6ITU9OX\nheSL373w++5X" +
       "f/cQQMEEKdw2PDbgC/ohQuoXFBeSKxK123P3K7/gGSLgLeMWJH1RfzqolRiU" +
       "xQ1t\nPA3aGtIOKA3w9Ikw68t2QMHXRxbsTG7btnybkVLF9CUkRcXzKi86hF" +
       "M+k6YLFi2f0MX3IenyLMPe\nYliW4zGFhrOqgujQBU9AqBLIpkpmgHoENJeZ" +
       "M5oMB0MNzkXh7ArliAOyI2V/4mjTO1Jt+vOLbdM3\ndK7vhDa9XWQm8nry9t" +
       "Y5jyDDcciNQnkJHe8jLQhqy2ayj8EzIUw28UFMhq8fLqzbbRV/CULMhJQe\n" +
       "TeHapWwhhiBs1+LohxRis+DKKcrw2pUO4YQ/m7kQUZnQhP2/zfUaYBm0AJaZ" +
       "oJUpc0YPHvtrMi6Z\nratQuXF2390vxCpe4rcpc9eVRXA4jsRV1dlQO8YFMY" +
       "NGFC65yGqvraC/ysja93XCxXptj/mGrlgM\n/sRI7QIMIGzxn3PFXxhZnn0F" +
       "wJYYOemvMbIknR4KSOqHk/Q6GBVIcfhuWjf0dwccb5g72zvOApbd\nEceqHa" +
       "3FWIzKCl5VJL/1o7ztj/723xwICmXrIh8vr6EXSiimwlp9cDKYMfmZCb/hfZ" +
       "8cNwyqMQ6E\nwg2lpsXRuqyudbZSc7KaxneP+N3dVG/b4rup7p71nb0tXR3g" +
       "C+wZFnczCk3XimyW4dqKJOKtFer9\nsBD1X4RHdBVyGQAA");
}
