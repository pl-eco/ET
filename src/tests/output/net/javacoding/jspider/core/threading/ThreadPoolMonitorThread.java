package net.javacoding.jspider.core.threading;

import net.javacoding.jspider.api.event.monitor.MonitorEvent;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.monitor.ThreadPoolMonitorEvent;

import et.util.MyUtility;
import net.javacoding.jspider.core.dispatch.EventDispatcher;

import et.util.MyUtility;

public class ThreadPoolMonitorThread
extends net.javacoding.jspider.core.threading.MonitorThread
{

    protected net.javacoding.jspider.core.threading.WorkerThreadPool
      pool;
    
    public ThreadPoolMonitorThread(net.javacoding.jspider.core.dispatch.EventDispatcher dispatcher,
                                   int interval,
                                   net.javacoding.jspider.core.threading.WorkerThreadPool pool) {
        super(dispatcher,
              interval,
              pool.
                getName());
        this.
          pool =
          pool;
        this.
          start();
    }
    
    public net.javacoding.jspider.api.event.monitor.MonitorEvent
      doMonitorTask(
      ) {
        return new net.javacoding.jspider.api.event.monitor.ThreadPoolMonitorEvent(
          pool.
            getName(),
          pool.
            getOccupation(),
          pool.
            getIdlePercentage(),
          pool.
            getBlockedPercentage(),
          pool.
            getBusyPercentage(),
          pool.
            getSize());
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1Ye2wUxxmfe/jOZx8YGyc4scGGOCVW8J7PBoNjVcWyjXxw" +
       "4IvPgXI1uqx35+zF\ne7ub3bnzQQlqVRJoKiFR0qSVaKJWrZCqqK2Kkv7Rqh" +
       "Ql6Rup9R9J2ipRK6IoVUuUqqqC2lT0m5nd\n2721TZDA0q7nZr7XfI/fN7Mv" +
       "XUd1lok6JEsgxwxsCaPZjGhaWB5VRcuahqm89HpdLHNxn6YHUSCN\ngopMUF" +
       "NashKySMSEIidSY8MVE3UZunpsTtWJLWeZlEce+Hjxd6f3todQUw41KVqWiE" +
       "SRRnWN4ArJ\noXgRF2exaY3IMpZzqFnDWM5iUxFV5TgQ6loOtVjKnCaSkomt" +
       "KWzpapkStlglA5tMpzOZRnFJ1yxi\nliSimxZB69JHxbKYKBFFTaQViwynUa" +
       "SgYFW2nkAnUSiN6gqqOAeE96adXSSYxMQeOg/kDQqYaRZE\nCTss4QVFA090" +
       "+jmqO+7eBwTAGi1iMq9XVYU1ESZQCzdJFbW5RJaYijYHpHV6CbQQdP+qQoGo" +
       "3hCl\nBXEO5wlq89Nl+BJQxZhbKAtB9/jJmCSI2f2+mHmiNRmJ/++ZzEddLO" +
       "ZhGUsqtT8KTJt8TFO4gE2s\nSZgz3igJz6YOlzqCCAHxPT5iTjPy4I8fS79/" +
       "uZPTtK9AMzl7FEskL3082LFxaeTdWIiaUW/olkJT\noWbnLKoZe2W4YkA231" +
       "uVSBcFZ/HnU784/IXv4b8HUX0KRSRdLRW1FIphTR61x1EYpxUN89nJQsHC\n" +
       "JIXCKpuK6Ow3uKOgqJi6IwJjQyTzbFwxEEJReALwbED8r4G+CLpvet7EopzR" +
       "dXW/rimQlXxCMAj6\njIbJDE0GSZchDWaOWoYiY3NG0k08QxgZnV5VQoVqb1" +
       "oMBGgZ+4tQhYyd0FWQl5cuXvvNifF9Xz7D\nQ0rT0LaboE+DDYJrg2DbIFAb" +
       "hKoNwio2oECAad9Q63YaR5mW2z9+NLzubK/1ShCFciimFIslIs6q\nGMpUVF" +
       "V9Ect5wvK02VMTLBUhj+OzkNKgO6+CIFZC4Oeyibb4U9ct+BSMRMjHpZM3f/" +
       "9BfvESzTKa\nFa1UOjcNYrzAbYv3ZI/sffzMlhAlWgzT8AFp9ydLz0sfPLP/" +
       "0hu/ffsht0QI6l5Wucs5aeX5zc+Y\nuoRlQDZX/PP/mfjwfN3Qy0EUhnIGQC" +
       "MipCGgwya/jpoKHHbQjDoLOBsLulkUVbrkQFADRFRfdGdY\nBq1h43XggEZ4" +
       "6uBpsXN4LX3RxRb6Ws/zjfrTtweGlTe+FOl786eNrzOnOLDa5MHfLCa8SJvd" +
       "cEyb\nGMP821/PnP/a9dOfY7Gwg0FQxCjNqopUYfZtCEDs168AGEJb67PP9V" +
       "x40wn2elf6iGmKx2isK19c\n2viNX4rfBDCBoraU45jVbIhpCgFTG3ZEjo/u" +
       "5xDEAevEhWtP9/zlj1dtUPM0S5fqb/lTpVeeurwU\npC6OQdsSrQNOjbG2SU" +
       "cB1kogjCzl6UyM+bOBl3GS2JzJgb4hMKgFNNE2KyiykNYlUU2NfetK49K5\n" +
       "0uBebsoaD0FqLF/pvPrdnptdzARbY8SDm/bvaFk0D7jlT//1EzRxhzj0SHL7" +
       "toGdvYMDBDXIigW4\nKM1DP6fSWwnafiuEcciF8TLWyJjLDM3BG5KMqRRhI2" +
       "W71byc+1ef/N7DY9wVbd4jjJdwov8m7l7/\n/ocsJX2BWaGf+ZSc2/Sd9y5d" +
       "m2rlVc6b/gPL+q6Xhzd+Fs+4UYE9bL6VBkb92sObXzo59c4s30lL\nLY6Oa6" +
       "Xijhffwj2749IK2B2CowlUCdvXDubuBE+mMTeZkn1sYYC+xglK3YVQ7xzqTf" +
       "b1EWiAsO5E\nefD2+sgh3VzApiveqW363sbGvRRzWF0itpctNgmFfn+T20NP" +
       "cg5uFmc//+9XX2jo4jhAeTqqqF6T\nSzVceemJ4xcGlrKHFB4Bf074iI//7L" +
       "EXblwl7/CMqkIz1ba5stzAg6Kna+x6o9wc+eGLxSCK5tA6\ndk4VNXJQVEsU" +
       "AnMAD9aoPZmG8vau154aOfIMV1tPhz8pPWr9TcHNIBjXIpHbByjud8MTt/tA" +
       "3NcH\nAohBx0HG0M3eW6uoHTNMnYB9WK54c8ROzRkPzu3y4Rz39djuoSvvXv" +
       "+B8hHDsgZ2Wh+hHLbVMTbj\nAdiQblj0XOi5mNiSuicNi5fjdkftzsF+gNq9" +
       "d1oG/cltycHtvcnBXSB4eiKVFehGqaYj9qZPwmF0\n+d6oRbZTaZeFlFnL2h" +
       "WNKyt37yKUeHhqfGSMik2x3sv28im7INya6bDrBfy5cbWDPUOb05/9Z/xp\n" +
       "8bUjQbu4doP1RDd6VVzGqltnfiH72T3GSammQ51/3TN48cmVCq3DW2i1bHnp" +
       "yvcv/3nHW386BcWT\nQ9EDk9nRkfQ4uKDzluryUnO5/dHQvPIrlhB2zi+7fd" +
       "UyDddmeoOJ4fKoTdfke1fNuWcrPK2281tX\nOvd4XL8KXH0ilpUIWiPrTi6J" +
       "1oK3Mk54QDvpgvaTd6E/9/dtSyZ7B4bgmlujfqvVxR3joPiOVVBc\nNBQB0w" +
       "4tFDm3YEthbRtBoW9YRTs9kbUt+0DAr7HSlqXHH3rVaP41O+hWr5r1cG4plF" +
       "TVi1SeccQw\ncUFhLqvnuMX99xRBD95WE6I574zZxk9xAWcIar+FAChG+s/L" +
       "8RVw6MocBEXtkZf+LEFra+nhxOT+\n8JKeg/YOpHT4VcObJuc9ALrTcAI3cH" +
       "vttyY0FC5aPRCVNbCk0INm5ds/CT969g//ZfUWlfh3Gvpt\nAhC2rMCBMjGi" +
       "ieoxi/UrukZva1LJhJsIYXhjR6rR4hL5t4h2L0BXdXVPH86ML8fovruJ0SA4" +
       "TDH6\njq+7gOn3reQwtgkvctPtFGyt/wd0i2KtaBMAAA==");
}
