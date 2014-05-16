package java.util;

public class MyIterator implements java.util.Iterator {

    private java.lang.Object field;
    
    public MyIterator(java.lang.Object obj) {
        super();
        this.field = obj;
    }
    
    public java.lang.Object next() { return field; }
    
    public boolean hasNext() { return true; }
    
    public void remove() {  }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1328737148000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVXXWwc1RW+++Nd72YTxz8JBjuxE0zBIt6NbeLG+AXLdpRN" +
       "NvHidaDZgpbZ2bv2\nJLMzk5m763WaRkUFAjwgpfwUpBTUqlWkCgEiAh5aNY" +
       "34awuRWj8AbQVqFYSo2iCqqiJqqdJz7p3Z\nnR2vwxOWZnZ877nnnHvO951z" +
       "7/OXSYtlkl7ZirNlg1rxqUxaMi1amFIly5qHoZz8ZkskfXa/pvuJ\nL0X8So" +
       "GRtpRsJQoSkxJKIZGcnqiapN/Q1eUFVWe2nlVabr/xy6V3T+3rCZC2LGlTtA" +
       "yTmCJP6Rqj\nVZYlsRIt5alpTRYKtJAl7RqlhQw1FUlVjoOgrmVJh6UsaBIr" +
       "m9Sao5auVlCwwyob1OQ2ncEUicm6\nZjGzLDPdtBjZmDoiVaREmSlqIqVYbC" +
       "JFQkWFqgXrGDlJAinSUlSlBRDcnHJ2keAaE3twHMSjCrhp\nFiWZOkuCRxUN" +
       "ItHnXVHb8cB+EICl4RJli3rNVFCTYIB0CJdUSVtIZJipaAsg2qKXwQojN6yp" +
       "FIRa\nDUk+Ki3QHCPdXrm0mAKpCA8LLmFkk1eMa4Kc3eDJmStbs6HY/x5Nf9" +
       "HPcx4sUFlF/8OwaKtn0Rwt\nUpNqMhULr5TjTyQPl3v9hIDwJo+wkJm86bVD" +
       "qU/P9wmZniYys/kjVGY5+cux3i0rkx9HAuhGq6Fb\nCkKhYec8q2l7ZqJqAJ" +
       "o31zTiZNyZ/PXcW4e/93P6dz9pTZKQrKvlkpYkEaoVpuzvMHynFI2K0dli\n" +
       "0aIsSYIqHwrp/H8IR1FRKYYjBN+GxBb5d9UghITh8cHTScRfAF+MxA4sJyGz" +
       "EsAxbgDMMPf3oG/3\nuCeqqKdtyedDQnrppAL29upqgZo5+eyl352Y2f/Iwy" +
       "I5CCjbA0a6ULXYdl018fm40usa44KBLiAf\n/vHyxMbHhqxX/SSQJRGlVCoz" +
       "Ka9S4JGkqvoSLeQYB1K7C7QcKwC0WB4wB/DNqaCIYxwCUTHJdi+2\n6oxMwp" +
       "cEgFk5efX3n+WWziEMMG0u3yEJR4VvscHMvfvue3h7AIWWghhfEB34au05+b" +
       "NHD5x7750P\nb6ljmJGBVdRavRKp4XU/beoyLUDpqav/4X/2fv54y/grfhIE" +
       "vkHFYRLgBOi71WujgSITTrnBYMHK\ndUXdLEkqTjk1IsoWTX2pPsKBsZ5/b4" +
       "QAtMLjt3/xL4QvnOzAV6eAEcbTswdezK58P7Tz/V+ue5MH\nxal7ba4CmaFM" +
       "sKi9no55k1IY//Dp9ONPXj71bZ4LOxmMhIxyXlXkKvfvOh/kvrMJo+PdXU88" +
       "NXjm\nfSfZnXXtk6YpLWOuq/evbHnmbelHwHZgnaUcp5xUvlrau6mjcmbqgK" +
       "gRoqKcOHPpocG//PGiXXVc\n3awu9bfcA+VXHzy/4scQR6CvSNZBhzq8r+GX" +
       "j9d6SCOHPI5EeDyjgp3DzF75zfGxUXCoAyxhH4wr\nhXhKlyU1Of3jC+tWTp" +
       "fH9glX1rsEktO5at/Fnw1e7ecu2BZDrsJm/x+uSObBOqvxZwRg1bxq3D62\n" +
       "Y3h8aGSckYCeP8KT0AUtj4cXmRoXEXDSg+8d/HsIYcNDS/jettsiyF5v+dmD" +
       "3dKBfin/nX+//my0\nX6QS1/TWMtTjzlDDqpx87PiZ0ZXM3YqIjLePeISP/+" +
       "rQs1cuso84TuvsQmvbqqsdvEtyEX/3e5X2\n0EvPlfwknCUb+VlA0thdklpG" +
       "FGchw9aUPZiCDLnnGzuzCN1ErXr0epntMuvldb0uw3cjmOpUjsCz\nGZ6gTe" +
       "Wgh8o+wrM/wxcM8PfNNeKFDVOpSHh8Asu140xCIHW/C6kjHqSKUE/fMX7h48" +
       "svKl9wNEa5\nhklcYTsd4SMuigR0w8LW6zr72ZoGZg1rgpu9jZEoNzs8Ojq6" +
       "a23QDg/vGB8aRun5vclMnJvC9Sln\nLyehja92GQ3ZoSIdHEYb6kCf0col9y" +
       "S0w+DczOQ06t3NiyJ38Rs2zOtMcODrCl/WFb5hw2FVR71o\nOXupQmy3rHWO" +
       "4mfAU9/6Z+wh6Y17Bew7Gnsw+rzruQ/o4B0xuUk7jzDdGFJphap1bnqtHeDn" +
       "SweG\nbXf3/XXP2NnveskZwEOFm5yNy3LyhRfO/3nXB396ALzIkvDB2czUZG" +
       "oGHO67prmc3F7puTOwqPyG\no8jmyapTceOiiUZ2RE0Kh3ptvoEj/Q3tbhM8" +
       "UTu10WbtzpXYNUrcV9Y/BeCiAZncMDBcMLiNT4zi\n69g1gL1zx+6hEegT61" +
       "HXzVa/2BzHIOEaig07ux6eDfbONnxNOytDrViEboeb85TotKmUoPVU7NP7\n" +
       "K9l/7Sx8cuu0wGq3+1boFtw7cpUOdH76uSjOja20SWn3GDm99aefnLs01yXw" +
       "Lu5RN666yrjXiLsU\n30vMQMZtu5YFLv3GrduePzn3Ud5vxwCuS+G8rqsUKj" +
       "0JiRLVLB+bRPFwisjXko8HwQOTlvSKON+d\nMMSS+wGAFR3v18K/nQQqe7SO" +
       "Ljw2da+6ZovLoLx95b5bXjfaf8tPo7ULWyscLoplVXX3Itd3yDBp\nUeE+tY" +
       "rOJGD/A4B9rdSBV/jDXTwt5p+EMZzH76d4h9qNWelyFeyMQWUFz0PVn/wieO" +
       "djf/gvrw9h\nWdz38Y4LbaSiwLknMalJ6rLFezLO4aVCLptwYGa8kNq+rrOE" +
       "RnGn7XF3oZqtgfnD6ZkmjQj+2XKt\nRgSHpyD2obUuUNCMrm+2N27P3XLQ8i" +
       "Fb2f8BzKXqLVsRAAA=");
}
