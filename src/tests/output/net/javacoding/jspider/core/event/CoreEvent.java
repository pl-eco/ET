package net.javacoding.jspider.core.event;

import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;

public interface CoreEvent
  extends net.javacoding.jspider.core.event.CoreEventVisitable
{
    
    public java.lang.String getName();
    
    public net.javacoding.jspider.core.SpiderContext getContext();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVWW2wUVRg+e+lut11ouy3Q0EJrleBGOku5VKE+2JQ2bLvQ" +
       "la0XanE5O3N2OzA7\nM86cbRdEohEBfTAx4C1BjQ+GxBgfNOKLCRLEWyQxfQ" +
       "E1Jhp80ChGH4zEYPA/Z2Z2Z6cFQmw6Z86e\n89/O/3/ff+ady6jONFCnaAp0" +
       "n05MYSiTxoZJpCEFm+YELGXFc3WR9MkxVfMjXwr5ZYmippRoJiRM\ncUKWEs" +
       "ktA2UDdeuasq+gaNS2M8/K5tuvzn51ZLQjgJomUZOsZiimsjikqZSU6SSKFk" +
       "kxRwxzUJKI\nNIlaVEKkDDFkrMj7QVBTJ1HMlAsqpiWDmDuIqSkzTDBmlnRi" +
       "cJ/OYgpFRU01qVESqWaYFDWn9uAZ\nnChRWUmkZJMOpFAoLxNFMh9DB1Eghe" +
       "ryCi6A4NKUc4oEt5gYYesg3iBDmEYei8RRCe6VVchEl1ej\ncuI7xkAAVMNF" +
       "Qqe1iqugimEBxayQFKwWEhlqyGoBROu0EnihaPl1jYJQvY7FvbhAshS1e+XS" +
       "1hZI\nRXhamApFS7xi3BLUbLmnZq5qjYei/z6X/rub1zwoEVFh8YdBaaVHaQ" +
       "fJE4OoIrEUr5SE48mdpU4/\nQiC8xCNsyQyu+vCB1M+nuyyZjgVkxnN7iEiz" +
       "4tX+zhVzgz9FAiyMel0zZQaFmpPzqqbtnYGyDmhe\nWrHINgVn8+Mdn+588m" +
       "3yqx/VJ1FI1JRSUU2iCFGlIXsehnlKVom1Op7Pm4QmUVDhSyGN/4Z05GWF\n" +
       "sHSEYK5jOs3nZR0hFIbHB08bsv4Ws4GixiHNIMMzRKWCTlGvSugUK7+oSVD4" +
       "qT2mLkvEmBJBaIow\nqSmXfJlZb5r1+RhNvSRTAJFbNQW0s+LJS18eGB579q" +
       "hVMgYzOy6K7gKPQtWjYHsUmEeBexQqHpHP\nx30tq00iq4rEyPPbewPNz/ea" +
       "p/woMIkicrFYojinECAdVhRtlkhZylHX4kI4BxagMpoDgEIAWQUM\ncUJA1m" +
       "YM1OMFYpW+SZhhQNfcwWtf/56dfZ9hhtW4jVm3QoOK7bVii8Yzu0Z3H+0JMK" +
       "HZIEt+mRNv\nGfPizd4IawGO/WLu8b/Ovt7QbdlnOp2OAXDm1WRt4crTobUX" +
       "Pmo8x/PtdJAmV6vJEGrhsaUa64RB\nCKx//0r62IuXjzzCA7UiDVBUj3NwbC" +
       "xSCol1Gg5FIb2UU2TRdZLWBSgjtLcdfyl+4oL3AKyW7cSR\nHB7aZnHLYuKB" +
       "E5cOx3/45rzNVtctUJX6JXuodOqZ03N+1r4i0I+xud0BF78P2MzHe6QKOGQG" +
       "2EqE\nA7fBwu9adjimualvnRVcG0UbbgGVD8rAYYYzVo4V1+tbvOceefjP6G" +
       "H8yS7rTLFaGA+rpeLGNy6S\n+H1RcQGiRKim9yrgW6km2+ttG+/nDm6aHur6" +
       "caT/5BPetPsZXd1pr1XLimfePf3dxovfHoIoJlF4\n+3hmaDA1DAF33dBdVm" +
       "yZ6bg/MC1/zsvBO/MCt1Ct0oD7mFAog8Alqk5UCjWfgGlDE4kEN23V78v/\n" +
       "bP3jWN2mD/woCDCAC5ZiaItwW630Oq+5EQYcbjBXoNmY14wiVtiWcyU20GlD" +
       "m62ucMQs4vNmyGQj\nPB3wNNs9lb/ZZowNrVZ/5NI9fFxl8cnP5qvZELeZ42" +
       "PjGqhLa5WPg4aB97HWUX5qbsWrn+HX4KaB\njm/K+wlv6Kimi9gW2Dji2mS/" +
       "BykKFwhlzOD7duMeqwJ/PXiOAcPYd5MgS0JKE7GS3PLmmca5F0r9\noxZcF7" +
       "kEkluy5a7zb8WvdfNa20wLuS5C+3d4BhvbqzBmrxRF/bd0zWzu61/T19e77m" +
       "74XLLPsdrs\ntpDiELaZ5411dMH6ZkF8596aUq2CJ2aXKvY/S+VN9E2rMEFR" +
       "A0Rvf1W6C7GrWogNfH0bGx699TTd\nw9K0HtLUWnU0L1PxG7W2DJ/bqgj+Ix" +
       "UH7LZon/clbX3viT1zu+88q7d8wRlY+SarBzzkS4riIrib\n7CHdIHmZp6De" +
       "IpaVjzxFt920/1JUx9/8WMRSlCnquIEiRUH2cmtAg1q6sAZwxp655TWKFtfK" +
       "Q1Wr\nP9yiYCEAomxq6gvA1LrFyvp/23C5l+cMAAA=");
}
