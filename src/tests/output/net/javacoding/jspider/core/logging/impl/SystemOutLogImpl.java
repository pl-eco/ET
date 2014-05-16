package net.javacoding.jspider.core.logging.impl;

public class SystemOutLogImpl
extends net.javacoding.jspider.core.logging.impl.BaseLogImpl
{

    
    public void doLog(java.lang.String message) { System.out.println(message); }
    
    public void doLog(java.lang.Object o) { this.doLog("" + o); }
    
    public void doLog(java.lang.Throwable t) { this.doLog("" + t); }
    
    public boolean isDebugEnabled() { return true; }
    
    public boolean isErrorEnabled() { return true; }
    
    public boolean isFatalEnabled() { return true; }
    
    public boolean isInfoEnabled() { return true; }
    
    public boolean isTraceEnabled() { return true; }
    
    public boolean isWarnEnabled() { return true; }
    
    public void trace(java.lang.Object o) { this.doLog(o); }
    
    public void trace(java.lang.Object o, java.lang.Throwable throwable) {
        this.doLog(o);
        this.doLog(throwable);
    }
    
    public void debug(java.lang.Object o) { this.doLog(o); }
    
    public void debug(java.lang.Object o, java.lang.Throwable throwable) {
        this.doLog(o);
        this.doLog(throwable);
    }
    
    public void info(java.lang.Object o) { this.doLog(o); }
    
    public void info(java.lang.Object o, java.lang.Throwable throwable) {
        this.doLog(o);
        this.doLog(throwable);
    }
    
    public void warn(java.lang.Object o) { this.doLog(o); }
    
    public void warn(java.lang.Object o, java.lang.Throwable throwable) {
        this.doLog(o);
        this.doLog(throwable);
    }
    
    public void error(java.lang.Object o) { this.doLog(o); }
    
    public void error(java.lang.Object o, java.lang.Throwable throwable) {
        this.doLog(o);
        this.doLog(throwable);
    }
    
    public void fatal(java.lang.Object o) { this.doLog(o); }
    
    public void fatal(java.lang.Object o, java.lang.Throwable throwable) {
        this.doLog(o);
        this.doLog(throwable);
    }
    
    public SystemOutLogImpl() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVafWwcRxWf9fdX4thxUlM7seO4yFHs8/n8EbsuqK59Iedc" +
       "bNfnyo3r9rLem7M3\n2dvd7s7ZTigRFW1TKlSpSvlUARWBglDgD0ILiI9QtQ" +
       "FaqEQt0ZZWRUBQKIJGhQo1gqLwZnbOO15/\nnO0llnZvb/e9ee/95vfePO/c" +
       "+XdQvm2hWsUOkJMmtgP9sRHZsnGiX5NtewxuxZVL+cUj5w7rRg6S\noihHTR" +
       "BUHlXs1oRM5FY10RoZ6J23UL1paCenNYPwcZaNcuveD+Z+fWawJheVT6ByVY" +
       "8RmahKv6ET\nPE8mUFkKp6awZfclEjgxgSp0jBMxbKmypp4CQUOfQJW2Oq3L" +
       "JG1hexTbhjZLBSvttIktZjNzM4rK\nFEO3iZVWiGHZBG2LHpdn5dY0UbXWqG" +
       "qT3igqSKpYS9j3o9MoN4ryk5o8DYI7o5koWtmIrQfpfRAv\nUcFNKykrOKOS" +
       "d0LVAYk6r8ZixI2HQQBUC1OYzBiLpvJ0GW6gSsclTdanW2PEUvVpEM030mCF" +
       "oJtX\nHRSEikxZOSFP4zhB1V65EecRSBUzWKgKQTu8YmwkmLObPXMmzNZwQd" +
       "l/Hxt5v57NeV4CKxr1vxCU\ndnuURnESW1hXsKN4LR14MnI0XZuDEAjv8Ag7" +
       "Mn23fP+u6NsX6xyZmhVkhqeOY4XElQ+6anct9P25\nOJe6UWQatkqpsCRyNq" +
       "sj/EnvvAls3rk4In0YyDz82ejPj37yW/hvOagoggoUQ0un9Agqxnqin18X\n" +
       "wnVU1bFzdziZtDGJoDyN3Sow2HeAI6lqmMJRANemTGbY9byJECqEQ4JDR87f" +
       "FnqC2Y6dtAlODadJ\n1JiOpEwtYBLUq2MySVmgGAmY/8njtqkmsDWpGBae1I" +
       "zpaXpTBeHJ5drz1GT5nCTR3PVmngY0PWRo\nMFZcOXf5pQfChz/9qDOPlHvc" +
       "WYJ6wH7AtR/g9gPUfoDbD1D7Aa99JEnM8k1LcaYTl6D59ffv9m57\nvMV+Ng" +
       "flTqBiNZVKE3lKw5CXsqYZczgRJ4yYFUISMO4BccumgMNgOa7BQCxnANhZCz" +
       "V4uepmeASu\nZCDgwunrv7kan7tAaUVpUEVHd1yDST3h+Fa2L3bv4LFHG3Kp" +
       "0FwenS8Qbcw+ely5+tiRC6/+6q0m\nNycIalyWqss1aap53R+xDAUnoJS5w3" +
       "/+34fePZvf80wOyoP8hQpGZOAdlIPdXhtLUq43U74oWKBZ\nmjSslKzRR5ma" +
       "U0JmLGPOvcPYs4WeKhwiUbA8DrLKd+1TBcHXflx6iUWcKZLlQjWNYeKkXIWL" +
       "9ZiF\nMdx/6wsjZz/7zpl7GNAcaYIKzPSUpirzzJGbJJjY7Sukf6C66snP7X" +
       "vqtcxMbndH77Ms+SSdyPkH\nF3Z98Rfyl6E0QIra6inMMhAxSyhjgJ73s+tm" +
       "4SH93sBFKLm8KXSQLg6ZmUlNffxfz3+lpN5xhurU\nijb2svOHeYT0uikzsm" +
       "t8UcNCu1YrumzBOHP3P8oekV+41ymNlUsTLKynU51ffR3vu71MWSGhi4lh\n" +
       "tmh4FmtuZF5rR9hilAmtfLzujwe7zn3CG9oOWlZwRifcf2SpWlx57jsX3+x8" +
       "/Y2HwIsJVDg0HOvv\ni4bB4bo1zcWVitmaO3Nn1F/msKXQSaFlS+hSpV4xTO" +
       "CyhaED0Clg9E4xm8t65vs28LwUjlvgqOIF\nmH3Sh5X0tN2hOz11rEgQabEi" +
       "VIvhO8uRs3g98NTlR/b94Xcv8wVOaJxcqb/GH0o/+/DFBRZmMbQw\nsj3khg" +
       "AtFL2SWFsBGc6qoRtMiVPdI4RrdnWGguBQJViiLVdATQSihiJrkYGnnytdeC" +
       "LdNei4skUQ\niAzE5+te/sa+6/XMBW6xQFhD+ffCWdkacklEPwYJGvCxNN0a" +
       "CjaHQi3tXYS2PrYN/QiDtwr6MJbG\ntNwHnJ4ne5b2E5SfMGBwQKBGnJIRS0" +
       "1BILO87Xhm4r1g4sr+AQeKarGdFQUPha7jxu1vv8uyxzMx\nK/Q2HiNP7P76" +
       "lQuXR6uc3HMawL3LejBRx2kCWSRlJs3+PWtZYNIv7N9z/vTo76dyOAI9BOXN" +
       "GrTr\nLmD+BhED6vYllK+Do5pTvnpzlKffP+ZQb0qgXht7cJieFL/E6GDECB" +
       "IkGStQwkmf7JS4L0MJ+uXo\nSmg0wFHL0aj1jYYpoBFy0bjfLxrdDI12QINk" +
       "0NjuojFGl2zaNWUHRMsKyF446jkg9RsDZN3r6SmC\ntqr2AJ5KT4d16rjzL8" +
       "9dpqM6AeVgyjA0LOsZJret5mojd7XxBrn6MHM1bFmGxV2ldx9czZ0m7k7T\n" +
       "DXLnM8ydg1C6tWzuUGY3c3eab5A7ZwnaotoRPWmsB5wg9yZ4g7z5EgNnzIL/" +
       "adYDTgd3p+MGufM0\nA2dctvRs3tCS3M296fZdhM4LRajdLULf9lmEOrvckk" +
       "zHW8eK/E2oNoROx6rVhmJ/G4/8to1FnsMM\n5YiR/0CIvMON/Ic+I+8KeiIX" +
       "bf5EsNnp2vypf5vtoZbONtqqZ8o7HTedHfXvZUWd8q2Po97nm28v\nCgh0uQ" +
       "i85BeBzg3z7RJd3eiqsibfwjzysG++/VaI/IAb+at+I+9Zg29vCDa7XZtv+r" +
       "e5Wb69khX1\n3XAMctQHffPtioBAj4vAX3wicABazraWUM8G+PYn6LdVWPxW" +
       "DbwdjiEe+JBvuv3TDbw96Ab+nt/A\nuz2BizbfF2wK/f01/zbb21o6g5ug29" +
       "VsoFO2xTjoMb9sk3IFANyWXsrzCUB3+4bZdh0Cn4NuYk22\njfPAx/2yTSoX" +
       "AnfbCGmb38APrM42qUqw6S7g0g7/NjfJNqk0G+h0LZ3koE/6Zlu9AIDbTUh7" +
       "fALQ\nE9roWirVQlXH9N+eVSOna+kxHvkx33RrFiJ3uwipxW/k3q5VtNkm2H" +
       "TXbynk3+Ym11KpKSvqlG+Y\no4598+0jAgJuNyF9lKCwHwTagm0bJhxUhPwk" +
       "/cd2TcKpPHTVN+GEl6btbhshDfoO3du3ikaHXKMd\n7hIuDf8fjG6WcuGluM" +
       "8TtM1rge6rVC/btHe2lpWGhWNNz5sVL7K9qMXt36IoKkqmNU14HS++mi8w\n" +
       "LZxU2awVOVtMDj53E9S03r1G2gfABw1KGnfU7yFo7zrUCSrkV6LyfQTVrKEM" +
       "5uiHqCETtHNlDbDA\nr0T5BEFbl8oTVOJ+EUXhSS6I0ssZU2SQ6jKorcd5Aq" +
       "tmx7o3aO+Qbcynlb5krhJ2AmImVlS6WTD/\ntR/l3fn4K/9hGwKFivO7C/pb" +
       "A8VunVVtlbT26bJ20lZt/psMuhmrpC0L64TtUfFZLrWdEZ3fFtSI\nvwRZtN" +
       "U4dnQk7Lz2jgIaztu+9lAbULnfX0ocaO5u6YZZGzsUifnawz5toQ+tBBNznd" +
       "cjVMl2E7a6\nb2XpDpz40OSu/A8StNkPRyMAAA==");
}
