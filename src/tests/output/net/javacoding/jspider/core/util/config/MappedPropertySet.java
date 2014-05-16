package net.javacoding.jspider.core.util.config;

public class MappedPropertySet
  implements net.javacoding.jspider.core.util.config.PropertySet
{

    protected java.lang.String
      prefix;
    protected net.javacoding.jspider.core.util.config.PropertySet
      delegate;
    
    public MappedPropertySet(java.lang.String prefix,
                             net.javacoding.jspider.core.util.config.PropertySet delegate) {
        super();
        this.
          prefix =
          prefix;
        this.
          delegate =
          delegate;
    }
    
    public java.lang.String
      getString(
      java.lang.String name,
      java.lang.String defaultValue) {
        return delegate.
                 getString(
                 prefix +
                 "." +
                 name,
                 defaultValue);
    }
    
    public java.lang.Class
      getClass(
      java.lang.String name,
      java.lang.Class defaultValue) {
        return delegate.
                 getClass(
                 prefix +
                 "." +
                 name,
                 defaultValue);
    }
    
    public int
      getInteger(
      java.lang.String name,
      int defaultValue) {
        return delegate.
                 getInteger(
                 prefix +
                 "." +
                 name,
                 defaultValue);
    }
    
    public boolean
      getBoolean(
      java.lang.String name,
      boolean defaultValue) {
        return delegate.
                 getBoolean(
                 prefix +
                 "." +
                 name,
                 defaultValue);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1YfWwcxRUfn89nn+3EnwQXO7GTuA0Wvjvb57ucc6qIazuN" +
       "k0tsfAYa19Gx3p1z\nNtnbXXbn7EsaotICgfwRiYYWKqUgUNtIFJWqKfQPqo" +
       "aI0E8iUVcK0DaoVRCiaoOoqoqopUrfzOzd\n7u1dYqTrSbs3O/PevDfv/d6b" +
       "N/PCVVRjGqhLNIPksI7N4FhyWjBMLI0pgmnOQldKfL3GP31mt6p5\nUFUCeW" +
       "SJoKaEaIYkgQghWQpNjsdzBurRNeXwoqIRa56SWbZt/mT5jeO7OqtR0xxqkt" +
       "UkEYgsjmkq\nwTkyhxozOLOADXNUkrA0h1pUjKUkNmRBkY8AoabOoVZTXlQF" +
       "kjWwOYNNTVmihK1mVscGk5nvTKBG\nUVNNYmRFohkmQc2Jg8KSEMoSWQklZJ" +
       "PEE8iXlrEimfejY6g6gWrSirAIhOsS+VWE2IyhHbQfyOtl\nUNNICyLOs3gP" +
       "ySpYotvNUVhx724gANbaDCYHtIIorypAB2rlKimCuhhKEkNWF4G0RsuCFIJu" +
       "u+Gk\nQFSnC+IhYRGnCOpw003zIaDyM7NQFoJucZOxmcBnt7l85vDWlK/xvy" +
       "emP+5hPvdKWFSo/rXAtMHF\nNIPT2MCqiDnjtWzwicl92S4PQkB8i4uY04x+" +
       "9qd3Jz44181pOsvQTC0cxCJJiZ9Eu9avjL7nr6Zq\n1OmaKVMoFK2ceXXaGo" +
       "nndEDzusKMdDCYH3x15hf7vvo8/psH1U0in6gp2Yw6ifxYlcasdi20E7KK\n" +
       "ee9UOm1iMom8CuvyaewbzJGWFUzN4YO2LpADrJ3TEUK18FTB04P4z0dfBLXt" +
       "EXQdS9OGxrCaxCSo\nExRXMZmnMBA1CQAwf9DUZQkb86Jm4HmqObTUtLw4X4" +
       "Y7R2U2LVdV0eB1h54CON2pKTBXSjxz5TdH\nJ3Y/9ih3JAWfpS1BIyA/aMsP" +
       "WvKDVD63HJcfLJGPqqqY5FuLDU09J9EA+/uP480nA+bLHlQ9h/xy\nJpMlwo" +
       "KCITAFRdGWsZQiDJktjihg4APkNi4AiEGdlAITsaAByy4ZaJMbrHaIT0JLAA" +
       "SuHLv+5oep\n5bMUVxQH7XR2rhp49RDXrbEvuX/XfY9uqqZEy17qMCDtXX32" +
       "lPjhiT1nL/328u12UBDUWxKrpZw0\n1tzqgzVFLEEus6d/8t87PzpVM/KSB3" +
       "khgMH2RADgQT7Y4JZRFHPxfP6ixgLOhrRmZASFDuWTTj05\nYGjLdg9DzxrW" +
       "bgYDNMBTA89aC7X0G9HBVvpq41ij9nStgWXHa1/3Dbz1s4bXmVHyibTJkXEB" +
       "Lzws\nW2x3zBoYQ//lp6ZPffPq8S8zX1jOIMinZxcUWcwx/W6tAt+3lUkRwY" +
       "72J77Vd/qtvLPb7NlHDUM4\nTH2de3Bl/bd/KXwH0geEsSkfwSxKPUySB5g6" +
       "cH7KibE9POnwFHX09JVH+v78zkUrjTm2R5vqr6mH\nsi8/fG7FQ03sh41KMP" +
       "fm44ttlLRVxTYPcCODPO3xM3vW8xAeJKiOcYa3bgV9WkEQ3VeDshRMaKKg\n" +
       "TI4/e75h5fFsdBfXZI2DYHI8leu++L2+6z1MA0ugz5Eore/aJcHYa0c+/Rsi" +
       "aLyC9LNtcLA/PBgY\nHqbeMnBa5s5qh72WuYFGdJDva2wgxFe7zV5tjPWH6S" +
       "teuS7D0UA0CpNLWMGLAsF5bcKfNsU5Zszj\njr77WTtA44FhBrFlbLJIaFpy" +
       "J98dtK7Ix3Rm4Sv/eu3p+h6OUcrTVYBepxN6RVwp8f4jp8MryXtl\n7nP3ju" +
       "siPvLzu5++dpG8ywLQThtU2sZcqYL3CI6MFru01OL70TMZD6qdQ82sahJUco" +
       "+gZGl4zgF0\nzTGrMwHYc44X1zA8KuKFtNjlTlkOse6EZe9K0C6OEjtH0dzU" +
       "BU+dlaPqXDmqCjFcJxhDL3tvKWQU\nv25oBPTDUq4YsBYuZ2xcRlxRyI09vn" +
       "3k/HtXX5Q/ZpFWz4rHUcpgqe1nPY7or9Z0k5YpjjrZmql3\nSjfjTCoED88a" +
       "W8OxaIUxMDTSH44EhiGdNMzunEwG+RqplGRhxcegMipdGdXHsilqZXhba4fw" +
       "hJrN\nOAehavDOTIyO04ljfFug7y8WuWkzPH6LyV/eTSn62usOWMsbC7Y3oq" +
       "x/1mGo4coNNRgJDIUJWsMM\nlVeAyhEdCtHv/fR1J1smU+xzVtjbmaHLKiAc" +
       "2h+ytR9ma70zB5Baf6NSmx0Tjn/pH42PCBf283hv\nLa6qqA8iz7yN+7Y3im" +
       "WqOD/R9ICCl7BiJyW3tD3sCJKPv6Z7u/+yI3rmAXdW8tJa0pmVitlS4vkf\n" +
       "nvtj5O0/PARazKHavVPJsdHEBCjcfVNxKbFlqfOu6gPyr1jwWAmi5OBUzBQv" +
       "Tgv1BoZznzpblBx6\nigqYz8PTbKGuuVwB4/CgK7fn6wGHF48WvBgbsHeqBy" +
       "rdqaL9Q7FAeITYi4s5pT5oSx20pX6tcqnD\ng4HoAEGNEk4LWYUncCZ99c0O" +
       "MqZ/EZPSzfwxG+gjtrInKld2EJSFRNZakLrF7OH+ZyojJixb5Pxt\n8LRbzm" +
       "+v2PnfsN0Qtld2qtLMM9A/FA2Et97I+U/aUodtqU9VLjU8EohsdTk/XyA12b" +
       "mepaTV8XAS\n1ATPMGqn+s/a6g/Z6j9XufoAh0gMzop5oUVoOF0ODTF4Oiw0" +
       "dFSMhufthUXshf2g0oUNl0GDqyqc\nNuQM1PFL1tXKS3P/HJDev2Oc7xIdzi" +
       "s7J+HOoeu4t+2Dj3g9WHwsKVNNuoQ8vuG775+9MtPOdxp+\nybW55J7JycMv" +
       "upipGnW61228mQRGfeGOjS8cm3l3wWNhSiWoWlYJVCpM3cjqKPw+QfUAiEmV" +
       "4EVe\n654th4TtVtWI8v8VIeGcjYSojYRXK0VCrD88wEo3V154Ued2+AlBtQ" +
       "uapmAovS0LDa5uoVe4hb7A\nGWnPBZrLW0pUoIfnjpLbW37HKG5aue/21/SW" +
       "X7M7icI9YB2cMdNZRXEW7o62z64+63gZz+13kaAt\nn/JARugFHW2wtb3B+d" +
       "8kqGc1frAi/XOy/Z6gzpuwAQf9c3JcImhdeQ5whdVy0r9D0NpiejC+/eEk\n" +
       "/RNAHUhp87Je5tDMD1I0jNodtXpSx6JMbwNyz73ivevk7/7DSqlakd+e0xtj" +
       "OGgsyXDqD42qgnLY\nZOc2OkZv1MSsYWCVZ0/LRQ0mn5HfEHc6zykFWb2z+6" +
       "YnSo8qkf/LUSUM03hpBV7RRSQcaT5TzkxM\ndefBhS5i3pL4P0r8vvz0GAAA");
}
