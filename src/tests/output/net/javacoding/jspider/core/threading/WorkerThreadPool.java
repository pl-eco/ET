package net.javacoding.jspider.core.threading;

import net.javacoding.jspider.core.task.DispatcherTask;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.WorkerTask;

import et.util.MyUtility;

public class WorkerThreadPool extends java.lang.ThreadGroup {

    protected net.javacoding.jspider.core.threading.DispatcherThread
      dispatcherThread;
    protected WorkerThread[] pool;
    protected int poolSize;
    
    public WorkerThreadPool(java.lang.String poolName,
                            java.lang.String threadName, int poolSize) {
        super(poolName);
        this.poolSize = poolSize;
        dispatcherThread =
          new net.javacoding.jspider.core.threading.DispatcherThread(
            this, threadName + " dispatcher", this);
        pool =
          (new net.javacoding.jspider.core.threading.WorkerThread[poolSize]);
        for (int i = 0; i < poolSize; i++) {
            pool[i] =
              new net.javacoding.jspider.core.threading.WorkerThread(this,
                                                                     threadName,
                                                                     i);
            synchronized (this)  {
                try {
                    pool[i].run();
                    this.wait();
                }
                catch (java.lang.InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    
    public synchronized void assign(
      net.javacoding.jspider.core.task.WorkerTask task) {
        while (true) {
            for (int i = 0; i < poolSize; i++) {
                if (pool[i].isAvailable()) {
                    pool[i].assign(task);
                    return;
                }
            }
            try {
                this.wait();
            }
            catch (java.lang.InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    public void assignGroupTask(
      net.javacoding.jspider.core.task.DispatcherTask task) {
        dispatcherThread.assign(task);
    }
    
    public int getOccupation() {
        int occupied = 0;
        for (int i = 0; i < poolSize; i++) {
            net.javacoding.jspider.core.threading.WorkerThread thread = pool[i];
            if (thread.isOccupied()) { occupied++; }
        }
        return occupied * 100 / poolSize;
    }
    
    public int getBlockedPercentage() {
        int counter = 0;
        for (int i = 0; i < poolSize; i++) {
            net.javacoding.jspider.core.threading.WorkerThread thread = pool[i];
            if (thread.getStateH() == WorkerThread.WORKERTHREAD_BLOCKED) {
                counter++;
            }
        }
        return counter * 100 / poolSize;
    }
    
    public int getBusyPercentage() {
        int counter = 0;
        for (int i = 0; i < poolSize; i++) {
            net.javacoding.jspider.core.threading.WorkerThread thread = pool[i];
            if (thread.getStateH() == WorkerThread.WORKERTHREAD_BUSY) {
                counter++;
            }
        }
        return counter * 100 / poolSize;
    }
    
    public int getIdlePercentage() {
        int counter = 0;
        for (int i = 0; i < poolSize; i++) {
            net.javacoding.jspider.core.threading.WorkerThread thread = pool[i];
            if (thread.getStateH() == WorkerThread.WORKERTHREAD_IDLE) {
                counter++;
            }
        }
        return counter * 100 / poolSize;
    }
    
    public void stopAll() {
        for (int i = 0; i < 2; i++) {
            net.javacoding.jspider.core.threading.WorkerThread thread = pool[i];
            thread.stopRunning();
        }
    }
    
    public int getSize() { return poolSize; }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1360122039050L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZe2wUxxmfu/PbBmMbHIPN27RY2He273wx+I/i2KYYDnzx" +
       "OVCM0WVvd2wW7+0u\nu3P2maa0VSmkqYSEEtJGoUF9iaqK+ghKWilVKcqjT6" +
       "TWqpL0QZSKCCVNiRJVFahNRb+Z2b3b2zsb\nB2qkWc/NfDPfN9/j930zPHsD" +
       "FZsGahJNP5nRsenvi0UFw8RSnyKY5ggMxcVXisujF3armhd5Isgr\nSwRVR0" +
       "QzIAlECMhSYLC/J22gdbqmzEwoGrH2ydtl28aPpn93alejD1WPompZjRGByG" +
       "KfphKcJqOo\nKomTCWyYvZKEpVFUo2IsxbAhC4p8DAg1dRTVmvKEKpCUgc1h" +
       "bGrKFCWsNVM6NhhPezCCqkRNNYmR\nEolmmAQtixwRpoRAishKICKbpCeCSs" +
       "ZlrEjmUXQc+SKoeFwRJoCwPmKfIsB2DOyg40BeIYOYxrgg\nYntJ0aSsgibW" +
       "uldkTty8GwhgaWkSk8NahlWRKsAAquUiKYI6EYgRQ1YngLRYSwEXglbNuSkQ" +
       "lemC\nOClM4DhBDW66KJ8CqnKmFrqEoBVuMrYT2GyVy2YOaw2VVP33sejNdc" +
       "zmRRIWFSp/KSxa41o0jMex\ngVUR84W3Uv4nBg+kmrwIAfEKFzGn6d30k4ci" +
       "71xay2kaC9AMJY5gkcTFj8JNq2d73y73UTHKdM2U\nqSvknJxZNWrN9KR18O" +
       "b6zI500m9P/mL41QNf+D5+z4vKBlGJqCmppDqIyrEq9Vn9UuhHZBXz0aHx\n" +
       "cROTQVSksKESjf0GdYzLCqbqKIG+LpDDrJ/WEUKl0DzQziL+bxn9gLX3a8Yk" +
       "mOOwgQUpqmmKXyeo\nW8VkjHqBqElg/7Ejpi5L2BgTNQOPEUZKh/OXpim/6m" +
       "mPhwauO+wU8NGdmgIbxcUL137zyMDurzzK\njUgdz5KUoDAw92eZ+y3mfsrc" +
       "n2HudzNHHg9je1+uhqnJJBpZ/3iuZ9npNvMFL/KNonI5mUwRIaFg\niEhBUb" +
       "RpLMUJc8kah/szrwOXrUqA9wLTuAIbsWgBlU4ZaIPbS7OxPQg9AVxv9vjt37" +
       "8fn75IHYo6\nwHK6OxcNzDnJZatqiR3a9fCjG3yUaLqIWgpIm++8e1x8/7E9" +
       "F1/77dXN2WggqDkvSPNX0iBzix81\nNBFLAGLZ7b/2750fPF689XkvKoLIBe" +
       "wiAngcAMEaN4+cYOuxgYsqC1ZWjmtGUlDolI02FWBKbTo7\nwlxnCetT16yE" +
       "VgwtaLnrevqhk7X0U8cdjerTdQYGi7e+VNL++s8qX2FKsRG02gG1MUx4PNZk" +
       "zTFi\nYAzjV78effzsjVMHmS0sYxBUoqcSiiymmXz3ecD2dQWwwd+w/IknW8" +
       "69bhu7Lrt7r2EIM9TW6S/O\nrn7ql8I3ADcgfk35GGbh6WOcfLCoAdtbDvTt" +
       "4WjDsemRc9dOtrz1pysWfjnyYpbq3fiJ1AtfvjTr\npSouhwwlmHvt4GIZkv" +
       "Y8LGuAGZnL05Fyps8KHr8dxFrZEewIg0C1wIlmVL8s+SOaKCiD/d+8XDl7\n" +
       "JhXexUVZ4iAY7I+n1175bsvtdUwEi2OJAyKt36VTgrE3G/f0TydBvXeLPNuC" +
       "wdbO7rZQkFBOmkK3\nZsZaDkmWmYFGtJ8nNDYR4Kfd5jjt/WwiSD899yhLqK" +
       "stDOep4HT2QbtBnY1O+0YNOQlambJS1POj\n/2yXrm/p53ptcJY+TsKdnbdx" +
       "c907HzD/dlm5QB50MTmz5jvXL14bXs4hgxcLG/PytXMNLxiYuqr0\nNJxh/X" +
       "wcGPXLW9Y/e3z4zQQ/SW0uKA+oqWTX+Tdwy/YqsUAG8EFJAyHHztVlhxz9tr" +
       "J+G4UCFi6I\nibTBIqGI7E46O2gtZcNZMvHZf730TMU6Hp50TVMm6nKskrMq" +
       "Lh49di44G9sv87O4tesiPvbzh565\ndYW8yW2TQUzKbX06X8B9ggPMu1+bqi" +
       "n50fmkF5WOomWsUhRUsk9QUhSZRiFqzT5rMAJR55zPrds4\nIPRkMkKT27wO" +
       "tm6sztoC+rkAkYXnpdDaodVZ8FzngmcPYhE9whY0s+8nM2BarhsaAfmwlIbg" +
       "lGQT\nKhXxsB1DzuAcdQRnyAVFXO/927defvvGD+WbDG4qWO3cS1dYJyhnIw" +
       "4M9Gm6Sas0xzXB2ql5SDe5\nk4dstuFguJ2g7XcNBN3trd1tnbDdipGdgzG/" +
       "+6iU18ECKjgOhWL+Sal8lrpRLXPFpVlgoyHlnIQw\nKhoe6O23MXCBVVV/AQ" +
       "mr2R5DObbfAK3eYldf2PYy/ewDMSgc00ztQDOWDSlWnJjefWNz082nvcg7\n" +
       "T74qcCHI7BAXn/M1f+h9sb6Z1ShFCcHkHuu+SeVflHLuP8zwlTmHXDXPIZ1e" +
       "qju8tItNjGUcKBQC\n6z9w1w7UEQy3dna1BSGVLGEuRJXpP5g+RLkcBai0up" +
       "lc1/nxq2dddxwg2J53gOD/4QCdW2HDzAEo\nhxnLM5j0c7lZI7SVlgVWFnaz" +
       "z1tuxrJ+DMop+ruPbciM8wkrOWTzR5OVO8AnV891zWQ57NRnPqw6\nKbx8yG" +
       "slmgE4A9H0NgVPYSWbc9yb7GFeZcNr9f61f9sRvvA5d9Ipo1ckZ9LJXRYXL/" +
       "/g0l+63vjz\nCUgko6h071CsrzcyAJGwdl52cbFmqvFB32H5VwwQLfzPewvI" +
       "XdSTi/oVBiYpQx3Jwf51GcM0QAtB\n22YZZlvB0jwP+L2030JQlTmjilD7q2" +
       "ArqXB291h3IEeMnc26aGdntkx78l7KtK7u1mC4rQvq3SIi\nmJN2CG2ZN4SA" +
       "0I4e6N65OjlNKxmTvg+x6U/pfEk/MJ3S6IsVr3PaERv+as4FiGp5yNLyUCEt" +
       "Oxz8\nziq84FBhKKvC792LCu/f2hrszFdh4I4qdCSaBanx23CB42r8tKGldL" +
       "qIDp8vpLY10PZbatv/8dRm\ns7yjPD8GQJ7AZEgUU7pgX2v6CkmzCVrCkiax" +
       "SNL8lKDlIM0DiiZOYimKDRFD3TmB5xRqIzS7Xkgu\nklCXCKqhQqXMmQVI1E" +
       "yXWRKlF0miV7lEg5KCFyARTTgnLYlOLpJEVwgqNSGn9CrKnO5My5Azlhxn\n" +
       "FkmOP4IcoJlM/kS0MnfHO33SaMh7TOdPvuKG2Yc3v6TX/JpXYfazbBlc/MdT" +
       "iuK8Uzj6JbqBx2Um\nQRm/YXCoukrQpgUVMjQj2312sL/yDd4iqHGeDQCu6B" +
       "/nimsE1RdeAaqxek766wQtzaWH2372h5P0\nXajTgJR2/647Efk9R+EY1G3w" +
       "XJGt6rnuGeKlrRLavhTEdCzK9C0m/a0Xix48/Yf/sHxfKvL/taAv\n9XDDmZ" +
       "JNmQR6VUGZMdndkc7RB00xZRjg/qzesWxRafId+ct8o/OClOHVPHIgOuC+I4" +
       "VC4XuqEEPh\n1o6uto4uMAqtEO/+CRiuTSsLaYhJbQUQuxxR+SWL3f8AQtog" +
       "b2caAAA=");
}
