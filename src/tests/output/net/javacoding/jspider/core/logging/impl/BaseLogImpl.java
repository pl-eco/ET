package net.javacoding.jspider.core.logging.impl;

import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;

abstract public class BaseLogImpl
  implements net.javacoding.jspider.core.logging.Log
{

    
    public void log(int type, java.lang.String message) {
        this.doLog("[LOG] " + message);
    }
    
    public void log(int type, java.lang.Object object) {
        this.log(type, "" + object);
    }
    
    abstract public void doLog(java.lang.String message);
    
    public BaseLogImpl() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVYfWwURRSfu7bXT+gHBSptaSlFaGjvCi3lozFSS5GDA45e" +
       "ibaUHNvduWNhb3fd\nnbseCI1GBSSRSEDQBDUaDYkh/iEB/9AECeA3ifYPQQ" +
       "1GgyEYhWCMkSgG38zs9fa2pRBssnuzM+/N\nm/m933vzpseuoRzTQFWi6SXb" +
       "dGx6O0NBwTCx1KkIptkDXWHxXE5+8OgqVXMjVwC5ZYmg4oBo+iSB\nCD5Z8v" +
       "mXtScNVKtryraoohFrnlGzLJl5a/DL3Ssrs1BxHyqW1RARiCx2airBSdKHim" +
       "I4NoANs0OS\nsNSHSlWMpRA2ZEGRt4OgpvahMlOOqgKJG9jsxqamJKhgmRnX" +
       "scFspjoDqEjUVJMYcZFohklQSWCL\nkBB8cSIrvoBskvYA8kRkrEjmE2gIZQ" +
       "VQTkQRoiA4JZDahY/N6FtO+0G8QIZlGhFBxCmV7K2yCkjU\nODVGdly/CgRA" +
       "NTeGyWZtxFS2KkAHKuNLUgQ16gsRQ1ajIJqjxcEKQdPuOCkI5emCuFWI4jBB" +
       "FU65\nIB8CqXwGC1UhaLJTjM0EPpvm8JnNW2s9Rf/uDf5Vy3yeLWFRoevPBa" +
       "XpDqVuHMEGVkXMFW/GvQf9\nvfEqN0IgPNkhzGU6Zr2/PnD1VA2XqRxDZu3A" +
       "FiySsHirrap6uOPn/Cy6jDxdM2VKhYydM68GrZH2\npA5snjIyIx30pgY/6v" +
       "6496l38K9ulOdHHlFT4jHVj/KxKnVa7VxoB2QV8961kYiJiR9lK6zLo7Fv\n" +
       "gCMiK5jC4YG2LpDNrJ3UEUIl8LjgmY343wT6ImjCI4KJA1rUH9MVr05Qm4pJ" +
       "PyWAqEng+v4tpi5L\n2OgXNQP3K1o0SjtlEO7PUExSQ8WDLheNWGe8KUDOFZ" +
       "oC04TFo5c/39G16vk93HuUcdYSCWoF0960\naa9l2ktNey3TXmraazONXC5m" +
       "dGomsNRTEg2o395rL9nXZJ50o6w+lC/HYnEiDCgYAlFQFG0QS2HC\nmFhqYz" +
       "0jGzC1aABIC0bDCkzEggSQTBiozknOdEj7oSUA44aHbn91PTx4nPKI+r2czs" +
       "6XBl7cytdW\n1BDauHLTnrosKjSYTR0EovV3nz0sXt+7+vg3X1yakw4CgupH" +
       "xeZoTRpbzuUHDU3EEuSu9PSH/15x\n40DO4hNulA0BCymLCEA0iP/pThsZMd" +
       "aeylcULNAsjGhGTFDoUCrJFJDNhjaY7mHEmUBfpZxDFCzH\nAlmqu/mMp/nC" +
       "h4Xn2I5TWbHYlj5DmPAYK01j3WNgDP2XXg4eeOna7g0MaAtpgjx6fECRxSRb" +
       "yFQX\nOHbSGPHurSg/eKjhyIWUJyelZ+8wDGEbdWTy6eHqVz4RXoVcADFpyt" +
       "sxCznELKGUAfqey9qNtkH6\nXWeJUHI5o2c5PQ1SnokNPPnnmdcKavliqE6V" +
       "3cZM9n6Q79BNUJ4wAAQQREbeOSkj6XVUjZCuAqfs\ndXWu5imOJ8QdRy7vav" +
       "jx2/NW0rQdxmmpX8LPxk8+d2rYTR2cD8eiYK5JBTY7lmnLxY4qIBELONqT\n" +
       "z/ZewHNHO7E02xa0zuNbKydo9r2kBMgESdhC9Z2ODHbc7X7896JdwtmNfB9l" +
       "mdmiS43HFrx+ETcs\nLRLHSEz5RNObFJzAStpNTmur2VGa8lPxYzU/LW87ut" +
       "PppyyaHu1QZ6qFxdPvnvp+wcXvnoVV9KHc\nNWtDnR2BLlhwzbjmwmJponJd" +
       "1mb5U+YCKx+MKgAyldrt2wTnGBjqF7Unwzm1bO306CiEpwmecuv4\nYL90sI" +
       "y+JlmxO4qELjvzHBHg5jQFSCrtkAQNOQaHYsI6tU/0/dEsXZm7jDuuwl4N2g" +
       "VXzL+N6ydd\nvcHc5+DgGKWBw8j+6W9dOX65u5w7n9dPM0eVMHYdXkOxbRfp" +
       "lH4zxrPApM/OnXFsqPuHAbcV9UsJ\nyoLiDRIRW+4CBsxiHg69tnCYD7OXwb" +
       "5pVeuVJeC7KCj+ZW+cLhzeH29byYGZYBPwLwsna86/3XC7\nltHBCkCPrUyx" +
       "vnMTgpFGSac/fQQ9fH8lwJL5zY0tzU2trYQWlqYJ1V4qjEtYzqRnq5dXlHdP" +
       "iSsB\nHLDFxoI6l19PUHZCo1U+R6wZse5HM0hKJ6q2SFo9FknpKzAeIelnj9" +
       "0ZMZszWtjABvpS/wdUixlU\nLbATjaXRMZDi+fXuSMkcKdrETkBolM6DZ5YF" +
       "yKx7i1oGQds4oeuyDg4bSDttILWmQRq6f5BaFja2\ntDS1LkzziU646e6IDB" +
       "KUI2mBFCZJggptM9NDvGLUlZBfXMS64U1zzuiln7HCZ+RykQehE4krii1d\n" +
       "2lOnRzdwRGam83g9wyHZTdCce61pgdr0h+1nF1ffCznoHtQBHqtlV36BoMpx" +
       "lMEc/bFrvAiXzLE1\nwILVsssfIGhipjxBBekPu+ghoCiI0uZhlmUMmjHLbS" +
       "krpGNRplkt+eYH2ev2ff0Py1y5Ir+D03sn\nXOsTMmQvX4cqKNtM2bTu57RO" +
       "F+MG1KCEnfiWTwpNPiO/Z1ba/yswYqu+pzfYxXN4P6ydsXdeS8ui\neQQ9dL" +
       "+cbW5c1LQI0O1Z4Q/d751myEAPjIUNW68VyaiMpf2J6XxBixj7oG6t4j9cCq" +
       "G7SBEAAA==");
}
