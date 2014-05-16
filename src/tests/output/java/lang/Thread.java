package java.lang;

public class Thread implements java.lang.Runnable {

    final public static int MIN_PRIORITY = 1;
    final public static int MAX_PRIORITY = 10;
    final public static int NORM_PRIORITY = 5;
    private java.lang.Runnable r;
    
    public Thread() { super(); }
    
    public Thread(java.lang.Runnable ab) {
        super();
        r = ab;
    }
    
    public Thread(java.lang.ThreadGroup group, java.lang.Runnable target,
                  java.lang.String name, long stackSize) {
        super();
        r = target;
        group.add(this);
    }
    
    public Thread(java.lang.ThreadGroup tg, java.lang.String name) {
        super();
        tg.add(this);
    }
    
    final public java.lang.ThreadGroup getThreadGroup() {
        java.lang.ThreadGroup tg = new java.lang.ThreadGroup();
        tg.add(this);
        return tg;
    }
    
    public boolean isDaemon() { return false; }
    
    public Thread(java.lang.String s) { super(); }
    
    public Thread(java.lang.Runnable ab, java.lang.String name) {
        super();
        r = ab;
    }
    
    public void run() { r.run(); }
    
    public void start() { r.run(); }
    
    public static java.lang.Thread currentThread() {
        return new java.lang.Thread();
    }
    
    public void interrupt() {  }
    
    public boolean isInterrupted() { return false; }
    
    public static boolean interrupted() { return false; }
    
    public boolean setDaemon(boolean is) { return false; }
    
    public static void sleep(long s) {  }
    
    public java.lang.String getName() { return "threadName"; }
    
    public void join() {  }
    
    public void join(long ms, int ns) {  }
    
    public static void yield() {  }
    
    final public int getPriority() { return 1; }
    
    public java.lang.ClassLoader getContextClassLoader() { return null; }
    
    public boolean isAlive() { return true; }
    
    final public void setName(java.lang.String name) {  }
    
    final public void setPriority(int newPriority) {  }
    
    public static void sleep(long millis, int nanos) {  }
    
    public void setContextClassLoader(java.lang.ClassLoader cl) {  }
    
    public void setUncaughtExceptionHandler(java.lang.Object o) {  }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1347514622679L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1aC2wcxRmeO78dJ46dByHOw0lMwcRnx/adH7gQjO3gSy62" +
       "sU1MXKfHem9sb7Le\nPXbnnHOgEYhHgFZIiNCWlvIo0EiItrQpVH2oFAEtfS" +
       "AVqwLaCkQBIVAbRNVWRC1V+v+zc969vT1f\nDDGR9rLenfnnf3z/9/8zd0+c" +
       "IgWmQTbIZj2bjVOzvmtoQDJMGutSJdMchkdR+YWCkoETezTdT3wR\n4ldijJ" +
       "RHZLMhJjGpQYk1hLs7kgapjuvq7KSqMyEnQ8ol2z4+/Ptju6vySPkoKVe0IS" +
       "YxRe7SNUaT\nbJSUTdPpcWqYnbEYjY2SCo3S2BA1FElVjsBAXRsllaYyqUks" +
       "YVBzkJq6OoMDK81EnBp8zdTDCCmT\ndc1kRkJmumEysjJyUJqRGhJMURsiis" +
       "k6IqRwQqFqzLyOHCV5EVIwoUqTMHBtJGVFA5fYsAufw/BS\nBdQ0JiSZpqbk" +
       "H1I08MRm94x5i2v2wACYWjRN2ZQ+v1S+JsEDUmmppEraZMMQMxRtEoYW6AlY" +
       "hZH1\nWYXCoOK4JB+SJmmUkXXucQPWKxhVwt2CUxhZ4x7GJUHM1rti5ohWf2" +
       "HZ/+4c+Kiaxzw/RmUV9S+C\nSZtckwbpBDWoJlNr4ulE/fHw/sQGPyEweI1r" +
       "sDWm84IfXx1575nN1pgqjzH94wepzKLyxy0bNs51\nvlOSh2oUx3VTQSikWc" +
       "6jOiDedCTjgOa18xLxZX3q5S8Hf7X/xsfp3/ykOEwKZV1NTGthUkK1WJe4\n" +
       "L4L7iKJR62n/xIRJWZjkq/xRoc7/BndMKCpFdxTCfVxiU/w+GSeEFMHlg2uE" +
       "WP/y8IOR4uEpg0qx\n+jgEHuM+hnEfSz1M4vzywz4fJqI7jVTAXK+uxqgRlU" +
       "+8/dsbevbccbsVFASSWBkgjmLrUWy9JZb4\nfFzgeem+QOfGMAf+/sOOlXcF" +
       "zKf9JG+UlCjT0wkmjasUckdSVf0wjUUZB0+FA6gcHwCusnHAGUA2\nqoIgjm" +
       "swfsYgW914srMwDHcSgGTu6Jk/fBA9fBJDj6FazfXmqoHjD1m6ldUOHdh97e" +
       "1b83DQ4Xxw\nYSEMrcktPSp/cOfek6/87vWLbNwyUpORTpkzMR3c6g8Yukxj" +
       "QDe2+K/9p/fDewran/KTfMgxYBkm\nATYgZTe510hLi44UxaCzYOayCd2Yll" +
       "R8leKFUjZl6IftJxwUy/n9SnBAMVyVcJUKYPH/8WUlfqyy\nIIT+dNnACez0" +
       "zYU7Xv35she4U1JcV+4gxSHKrMypsMMxbFAKz1//+sA995469gUeCysYPkYK" +
       "44lx\nVZGTXL/zfBD7VR5ZXL9u9fGv1t7/airYq2zpnYYhzWKskzfNbbzv19" +
       "K3IMMh00zlCOWJRPhKJLUA\nftbx+4DjJf69lT/dlOYoWI+sEI4q83IUfnzO" +
       "U7TPshCUXUdTpvR07bX4yGKvG+5/+7baN//0kmA4\nR+W0R70fvSXx9K3PzP" +
       "kxtCVQwySzL5WuvIbinY/XFYAPTzV8UsLVK7UYoZWJmY1toSAoVAkrYc2t\n" +
       "V2L1EV2W1HD3w88um7s70bLbUmW5Y0C4O5rc/NJjtWequQpixUIHiYq/i2Yk" +
       "o89mEvyvjZGqTJa6\npLGprjEUaGphxC+Nc4etFnRm8c5gQtOQQnLHrNEjZs" +
       "iUq0XMVi4uZvlcdD7/O2T5bpfDdyH+oh0/\nrsxiWQta1tzESMGkoSfiKePW" +
       "uEn1yvm3Yp29jnVa7HX6sq7THAwE2yF/mGRMUs6dlznlDTrktdry\nhrLKCz" +
       "UGWkBvXgxSajtqgdVaAHiqnGgeMJRpwMCMKNlPjf5zR+zd7d0WitY5W0HnwN" +
       "6mM7Rm1Xsf\nchZxYdqjL3AtcvemR989+fbgaouYreZpW0b/4pxjNVDcLWXx" +
       "JNiwZaEV+Ojnt2954ujgG+OWJZXp\npa9HS0yHHnyN1l5eJntU0HxV1yYhMt" +
       "ywltwgviIL8awTIF67OBD7uWi/EwyKAwxtNhgOeoOhyUpP\nAJefTeK4PU5Z" +
       "mkNWuy1LzyqruTEQTAELR47k9gj18Mh6uLYJj2z7ZFTssGLWtqKl2bbiiLcV" +
       "zSHu\nkWYmhJyFCYksQb1QmHDBpw7qLQ4TgrYJt2YxodXBuRlscYdDloPl7s" +
       "wqq6kt0Ny+uKDeKIZgf+du\nTnfhHirVHE2PX//v5x4orbaKPc7ZIHjZxT5p" +
       "s6LydUfub54bGlGsnHWziGvwkV9c/cDpl9gbFgfN\n91+42pZkpoL7JEdr2P" +
       "bKTEXhkw9O+0nRKFnJd4iSxvZJagL7nFGoxWaXeBiBWup8n75fs8p8x3x/\n" +
       "ucFNY45l3Z2fzTlwn1727WZvDVwXo+sE6vJdqOONfYXN8mHYnE5So/Kthx79" +
       "6KZjbX5spQpmUHHw\niaMa9CVwi33bE/duXHb8zS/zQGGGodD7+OI1/PNCq8" +
       "3Lg3I4oWgS3/nVAjOafMeeZKRsb7gvOjAY\n7h8MD+/nU/bHLZh8kZE82Cqn" +
       "aDTE84O/OZ5m3Xa4CoR1BZnW4c03scvFmxMequH9Q1wv/HiY69R5\nzbxO+P" +
       "CRhdYuFGsXZl+7AG++e1ZrL+/rH9ybe/ES0eIUi8WL3YsT3n6dzFwTOu6iuK" +
       "HMSHhWQnyG\nkwR+4mD2ZlebaGVP9+Xtz75z6vvKR7wVLOUnH504Q+CwhD9x" +
       "9Kd5etzEPbbjkEdIqumPm1ZJviS1\nbDAYgobxfA/CCbbUNQWAfQuHe8ND9T" +
       "xJf4raH4UdeqaSKFo4Bnc6gNwVNnKxdjtfYr0e7Ons5pTI\nfZ10sDCx6WxD" +
       "ZhF50eGwJu7xy7C72JjtMIR3Fseu+UfZbdLzB/yCFqMghOnxgEpnqGozpFvI" +
       "Xn72\nkyKD8pHNf93VcuJLbopcixt/J0WmT4vKz37vmb+EXvvzLZDZo6Sor3" +
       "+oqzPSAx7avOByUblipuqq\nvCnlRR54wVYZJ1bpkzrSOarUoCxhaMNpTFU9" +
       "D+kVgqnWi9is96qPmXj22zm0cAXKWZ7+yMgKaKSz\ntOevOwrkDrtAvpGl64" +
       "FtQJB3Peeli7zQrLbcgJP3EC7o5Yw2p1r4oHpxPcJZm/oWI8WK2S3RaShN\n" +
       "LtItGtd1lUK5EsTb6KUknh/UCiVrl0jJU1AAjESGfvkzOp4bW8rt8FIOiTEg" +
       "lAsskXKnoaIByg2+\n7/qXW4tyYvV3jUKLxkVgWZSCT6feGagkcsIwqCbA54" +
       "Cyr9gBZXun6Sth5CqNsjGEs6zHYLM3dtCM\nKzFqjMm6QcfwVIkxlY4p03F1" +
       "rFsxYUM4nmA0FtGl2LB4GYZ3Fl83tgSa2y5mZJN751ufphh3hVcU\ncfMTEv" +
       "4LLU0UfcvBE/w43kjEvSOJmmyGq1Vo0rpEmsBee7lihlO6UO6X971wVQNXu9" +
       "Cm/TPGla+K\nkWVKDiWLBfg7hJIdi3OZ2Ktx0bkVqoEImpRZVJbVZ1vgulSo" +
       "c+k58plDzwO59dyOfKFSGs+KMsT7\nTqHjziVCWRDoHepRX+qERxBCh4MQ7N" +
       "MB3+cZ2ZmDECCB8fGIbhyihn2YFGqpCzYHQk2Q/mVsSjHr\nxaIoesTL+FVw" +
       "XSGMv2KJjL8casdBXdGyRmArXN1Cie7FKeG3MXMAPx7Jrc6VC6mDoK2Ca5dQ" +
       "Z9dn\nneh9gNdZ7KY91cNeDVmxV6jXuwj1zkWv5hsBHgJMDRiKbihslrvcK6" +
       "S4QdstlNy9RLi6lpE1oIv4\n+pn3+lgRqXNr5Zt0pJh9aOabYmS9R/vYGqxr" +
       "CwRhv7PJU/B8E8kFpZ8uO4Z5OeR8uCLCIZElcgi0\njkWKCdvCGZ7wGYyM6M" +
       "FTsD6hR985Qk/mKZ/vetvtrXbX7rvBu2tvbatraoWuZVHHWr4EmGva/OaZ\n" +
       "LA1wDQhzB86tuWdJNzdDxpjpGePJOtiqDgpNB88R63wCdvxKznrZBNewUHR4" +
       "cUj2AMp9DqA02kD5\nhjdQ2oJ1zSH+7Yuf/5rBp+a26F5IU9Mrmxe0cJ+wcN" +
       "+ntvAxh4VNtoXfyWIhVPBGbqFPT7GM4/jP\nOrfMbfTDIB2MvlqTpcTkFOtJ" +
       "yjSO3xj2SlpMTZmexHMdvjB+s7su49c/1m9U5K1z1170XLziN/wL\n8/nfkR" +
       "RHSPFEQlWdh6GO+8K4QScU7q5i62jU8sYPwBvz5uA3NvAfWuB70nr/I6zO8B" +
       "7vn0IQ+h7H\nk53VjsOmoTiVFfzqNPntn+VfddfL/+VHI0WyFWD86Y1sNswo" +
       "psIaOjVJnTX5oTC+w989iE0Qx4HQ\ndZlpSbR+alPlPDObX6tmeP9AT+axWe" +
       "sCx2b41Qsem3n9tOOoQc73MokvI6DHT8lwweeEoP8DyjsR\nQuklAAA=");
}
