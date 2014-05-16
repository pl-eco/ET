package net.javacoding.jspider.core.model;

import net.javacoding.jspider.api.model.Summary;

import et.util.MyUtility;

public class SummaryInternal
  implements net.javacoding.jspider.api.model.Summary
{

    protected int known;
    protected int parsed;
    protected int ignoredForFetching;
    protected int ignoredForParsing;
    protected int fetchErrors;
    protected int parseErrors;
    protected int forbidden;
    protected int unvisited;
    
    public SummaryInternal(int known, int parsed, int ignoredForFetching,
                           int ignoredForParsing, int fetchErrors,
                           int parseErrors, int forbidden, int unvisited) {
        super();
        this.known = known;
        this.parsed = parsed;
        this.ignoredForFetching = ignoredForFetching;
        this.ignoredForParsing = ignoredForParsing;
        this.fetchErrors = fetchErrors;
        this.parseErrors = parseErrors;
        this.forbidden = forbidden;
        this.unvisited = unvisited;
    }
    
    public int getKnown() { return known; }
    
    public int getVisited() {
        return this.getParsed() + this.getIgnoredForParsing() +
          this.getParseErrors();
    }
    
    public int getNotVisited() {
        return this.getKnown() -
          (this.getParsed() + this.getIgnoredForParsing() +
             this.getParseErrors());
    }
    
    public int getParsed() { return parsed; }
    
    public int getIgnoredForFetching() { return ignoredForFetching; }
    
    public int getIgnoredForParsing() { return ignoredForParsing; }
    
    public int getFetchErrors() { return fetchErrors; }
    
    public int getParseErrors() { return parseErrors; }
    
    public int getForbidden() { return forbidden; }
    
    public int getUnvisited() { return unvisited; }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYf2wbVx1/dhz/ilPHSdalTdqkWVaabbXXdglbgwZZfqhu" +
       "3daL046aTN7l7jm5\n9nx3vXt2nDIKiNGOSUxCK79E2aSJqdo0TRPVBoiJAl" +
       "vHz0qQP7YB2gQqmoZg0xBCVDBUvu/ds313\ndhI0yZHe+eXu++Pz3vfne8++" +
       "i1pNA/WJZpws69iMT2TSgmFiaUIRTHMWXuXEy62h9IUDquZFnhTy\nyhJB0Z" +
       "RoJiSBCAlZSiQnx8oGGtA1ZXlB0QiXUydl700fLP367P7eFhTNoqisZohAZH" +
       "FCUwkukyyK\nFHBhHhvmuCRhKYtiKsZSBhuyoMingFBTs6jTlBdUgRQNbM5g" +
       "U1NKlLDTLOrYYDorL1MoImqqSYyi\nSDTDJKgjdVwoCYkikZVESjbJWAr58z" +
       "JWJPMkOo1aUqg1rwgLQLgxVVlFgklMTNP3QB6WAaaRF0Rc\nYfGdkFXYiX43" +
       "R3XFQweAAFgDBUwWtaoqnyrAC9RpQVIEdSGRIYasLgBpq1YELQRtXlUoEAV1" +
       "QTwh\nLOAcQT1uurT1CahCbFsoC0E3uMmYJLDZZpfNbNY67I/895H0vwaYzX" +
       "0SFhWKPwBMW11MMziPDayK\n2GK8VoyfSx4r9nkRAuIbXMQWzfjN3zuSeudS" +
       "v0XT24Dm8PxxLJKc+MFo35aV8T+HWiiMoK6ZMnUF\nx8qZVdP8y1hZB2/eWJ" +
       "VIP8YrH3888+qxzz2D/+pFwSTyi5pSLKhJFMKqNMHnAZinZBVbbw/n8yYm\n" +
       "SeRT2Cu/xv6H7cjLCqbb4Ye5LpBFNi/rCKEADA+MaWT9BemDoFimWCgIxnKS" +
       "epEqKHGdoD0qJnPU\nCURNAvPPHTd1WcLGnKgZeK6gSViZq+MqU03RJY+Hhq" +
       "w74BTwzn2aAjJy4oWrv3xw6sCXHrbMR12O\nYyRoF+iN1/TGud441RtneuMu" +
       "vcjjYRpvdG4rtZNEw+lv3x3reHSn+aIXtWRRSC4UikSYVzCEoaAo\n2hKWco" +
       "T5Yczm88zVwE8j8+CyACOngCAWIrCPJQMNul2zFtBJmAngbyunr//mvdzSRe" +
       "pF1OrdVLoF\nDWx4wsIWGc7cv/+BhwdbKNGSj5oHSIfWl54T33vk4MXXfvXm" +
       "jloIEDRUF5n1nDSy3PDThiZiCTJX\nTfzX/73v/cda73rBi3wQrpCwiABuBt" +
       "G/1a3DEWFjlWxFNws42/KaURAU+qmSYsJk0dCWam+Y17Sz\neQdsQBuMVhh9" +
       "3Ee76IN+7KSPLsvH6H661sBy4bUv+G9//aW2y2xTKmkzasuvGUysIIzVzDFr" +
       "YAzv\n3/xG+rGvvnv2U8wW3BgE+fXivCKLZYbvRg/YvqtBQoj3dJ/72vD51y" +
       "vG7qpJHzcMYZnauvz5lS3f\n/JnwbUgWELSmfAqzmAwyTUFg6sUVkVMTB9OG" +
       "XIC0UOJ564XsP26X3r510spJPfZ6aCfct/s6Hup6\n5322/hAUJ8E8VI2u+u" +
       "ToUvKVrd95++LVmW7LpawKclNdErfzWFWE2SSil2EN29bSwKhfuXXbs6dn\n" +
       "3pq3VtLpDNoptVgYeeINPPyJiNggObRAnQOTsHWN0Ld71n5UrEaft7H5TupN" +
       "bMcRQz3ISWhQu1PW\nNK3BlYgozH/6ny8/Hh6wLEx5+hobzsGVE0+eOr9nJX" +
       "OfbC3XbQAX8akfHXn82hXylmW+atBRbdvK\n9QCPCrZ8cOdrpZj/+ScKXhTI" +
       "og7WYQgqOSooRercWegRzAn+MoXaHd+d9d4qbmPVpNLn9gCbWne4\n18wFc0" +
       "pN5yFXhG+A0QMjzCM87IpwD9LpZJIxDLHnR6rxGNINjQA+LJUJaj2haktq1d" +
       "5RRvtxh6JN\nPKWgym+9ov30MU1DnTWFa4q7GUaEi4s0FneQi+uEdhCKljSt" +
       "GdOYiItQRtYUPQSjnYtubyw6zUXH\naqJpI7ue5K38F1V+6yVnuOS2PIU6ZR" +
       "jQma4rM8plRhvLPFqRyfb1/5BJU34Hl9nRWOYxLjMEdWVe\nhmZ8betTiTEu" +
       "MdZY4lxFYlEtydCJ2R2AOe52niFqSaSvWql77JFvBY6VSh88f/XM8B9/d4X3" +
       "mbZ8\nXaP6S+6h4otfvLTipVXRlazZSYbOPKy7hySQc4ZT2Oq2RMI5d90xep" +
       "eVl7oJ2rFKEyXosrOHoil7\ny2ptNkvXZz/598gZ4ZX7vTxhjoBCouk7FVzC" +
       "Si13uoUcZKeKSpqI3tf/p+nRC59xJ88wbRTtW+hk\ny4k/ee7SH0be+P1DkB" +
       "CzKHDocGZiPDUFG9q/prqcGCv13tuyKP+cbS3PY3VnISfTmDN7hQ0MRzl1\n" +
       "1rHpA44uZRMPA1T5dXcpNu9ZpQStW59OEhRcwORANc8hRqY6gPTCGORABpsE" +
       "BLJtGIActYVIIyh0\nH7ZzKNubBOWzBLUDlEPaumg2w7iFo7mlSWjOQEAAmn" +
       "StdjRCQvcizpHEm4Tky3CWBiTJxmWnESpa\nzXZzVLubhOocQd0OVPaK1QhU" +
       "P4xRDmq0SaC+RdAGADXtKnarwdnL4extEpwnLThpV51sBGcLjLs5\nnLubBO" +
       "dpgiJ0dxwldjUw93Aw9zQJzPMWmCOO6kzTUdR1D0DPXT1113zWZZQ4uPLAjp" +
       "f12C/YcbZ6\nYRRMoWC+qCj2rtU29+sGzssMRdDqYa2i+wOCtq17TQHdKftl" +
       "i/q+xfgSQb1rMBLkoz92jksEbWzM\nQVCAz+z0PwVPctJD3q79Yye9DOcpIK" +
       "XTV6udQwc7uNJzQNxqVGiH0A3tC71OjctSPKNjURaU5GT5\nyR/67n30t/9h" +
       "JTYgWhel9HJQNBPMVIlxMMqyyY4d9Bu9ThGLhoFVwloMvsltpiXRugzstV/d" +
       "VnUN\nzR5LT9GLi3YbkuRkrtx/5anh6wMMAu+X/LaLOP5/oCQYh+zHSKtjGr" +
       "lz5A6CPvYh7rn2jn70tl0j\nO3dBL+Sb3ZfMfKhrq9MG2tRoX9laeUyhTtY+" +
       "bqgZhR6Q7R91DuF/roB1/ikXAAA=");
}
