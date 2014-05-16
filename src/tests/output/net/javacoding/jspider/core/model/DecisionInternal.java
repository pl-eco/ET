package net.javacoding.jspider.core.model;

import net.javacoding.jspider.api.model.Decision;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.DecisionStep;

import et.util.MyUtility;
import java.util.ArrayList;

import et.util.MyUtility;

public class DecisionInternal
  implements net.javacoding.jspider.api.model.Decision
{

    protected int type;
    protected java.lang.String comment;
    protected java.util.ArrayList history;
    
    public DecisionInternal() { this(Decision.RULE_DONTCARE); }
    
    public DecisionInternal(int type) { this(type, "(no comment given)"); }
    
    public DecisionInternal(int type, java.lang.String comment) {
        super();
        this.type = type;
        this.comment = comment;
        this.history = new java.util.ArrayList();
    }
    
    public int getDecision() { return type; }
    
    public java.lang.String getComment() { return comment; }
    
    public boolean isVetoable() {
        if (type == Decision.RULE_ACCEPT || type == Decision.RULE_DONTCARE) {
            return true;
        } else {
            return false;
        }
    }
    
    public void change(net.javacoding.jspider.api.model.Decision other) {
        this.type = other.getDecision();
        this.comment = other.getComment();
    }
    
    public void merge(net.javacoding.jspider.api.model.Decision other) {
        if (other.getDecision() > this.getDecision()) { this.change(other); }
    }
    
    public void addStep(java.lang.String rule, int ruleType, int type,
                        java.lang.String comment) {
        history.add(
          new net.javacoding.jspider.core.model.DecisionStepInternal(rule,
                                                                     ruleType,
                                                                     type,
                                                                     comment));
    }
    
    public DecisionStep[] getSteps() {
        return (DecisionStep[])
                 history.
                   toArray(
                   new net.javacoding.jspider.api.model.DecisionStep[history.
                                                                       size()]);
    }
    
    public java.lang.String toString() {
        return "decision : " + DecisionInternal.translate(type) + " - " +
        this.getComment();
    }
    
    public static java.lang.String translate(int type) {
        switch (type) {
            case Decision.RULE_ACCEPT:
                return "ACCEPT";
            case Decision.RULE_FORBIDDEN:
                return "FORBIDDEN";
            case Decision.RULE_IGNORE:
                return "IGNORE";
            case Decision.RULE_DONTCARE:
                return "DON\'T CARE";
        }
        return "ERROR!!!";
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZDWwcRxWe+/G/U//WMbETO6lL4/bufHf22bkYaC3bSS6+" +
       "JK7tJsRNdF3vje1N\n9nY3u3P2JZSIqqEpFSqqWgqINBUVKBIqf4lahAqE0B" +
       "YoEARGaktRK1BK1QpStYIqAYrCm5m92729\ncxy7iqVZ7+2+mffe935n9umL" +
       "qMTQUatoBMhhDRuBwfFRQTdwclAWDGMCHiXEF0sqRk+NKKobueLI\nLSUJqo" +
       "mLRldSIEKXlOyKDfVndNSuqfLhGVkl5joFq2y+6cP53x7f3uJBNZOoRlLGiU" +
       "AkcVBVCM6Q\nSVSdwqkprBsDySROTqI6BePkONYlQZaOAKGqTKJ6Q5pRBJLW" +
       "sTGGDVWeo4T1RlrDOuOZfRhH1aKq\nGERPi0TVDYJq4weEOaErTSS5Ky4ZpD" +
       "+OSqclLCeNQ+go8sRRybQszABhUzyrRRdbsWsLfQ7klRKI\nqU8LIs5O8R6U" +
       "FECizTkjp3HHCBDA1LIUJrNqjpVXEeABquciyYIy0zVOdEmZAdISNQ1cCFqz" +
       "6KJA\nVK4J4kFhBicIanbSjfJXQFXBYKFTCLrRScZWAputcdjMZq1dpdX/e2" +
       "j0UjuzuTeJRZnKXwaT1jkm\njeFprGNFxHzi5XTgsdjedKsbISC+0UHMaQZu" +
       "/uFd8bfPtnGaliI0u6YOYJEkxA97W9cuDLxZ4aFi\nlGuqIVFXyNOcWXXUfN" +
       "Of0cCbm3Ir0peB7Mufjf1i7+e+jf/uRuUxVCqqcjqlxFAFVpKD5n0Z3Mcl\n" +
       "BfOnu6anDUxiyCuzR6Uq+w1wTEsypnCUwr0mkFl2n9EQQmUwXDD2Iv5XSy9g" +
       "7SEsSgaIEKNupAhy\nQCOoR8FkH/UCUU2C/fcdMDQpifV9oqrjfSk1ieV9hd" +
       "MylFfNvMtFg9YZcjL45zZVhkUS4qkLv753\neOQLD3IDUqczpSQoDIwDFuOA" +
       "yThAGQcY44CTMXK5GMvV+chSUyVpRP3jdH/tw37jWTfyTKIKKZVK\nE2FKxh" +
       "CJgiyr8ziZIMwV62xuz7wNXLV6CrwW5EjIsBCLEoByTkcbnN5pxXQM7gRwuY" +
       "WjV37/bmL+\nDHUkavhGujoXDcx4kMtW3Tm+f/s9D27wUKJ5LxjEA6QdS6+e" +
       "EN99aMeZl3/z+kYrCgjqKAjOwpk0\nuJzij+qqiJOQvKzlv/Kfbe89WhJ9xo" +
       "28ELGQs4gAngYJYJ2TR16Q9WcTFgULZlZNq3pKkOmrbJap\nJLO6Om89YW6z" +
       "it1Tl6yCUQKj2XTTJnqhL+vppYE7GcXToQNLh5fvLw2+8uOqFxko2cxZY0ux" +
       "45jw\nOKyzzDGhYwzPX//q6KNfvnj8bmYLbgwXQaVaekqWxAyTb7ULbN9QJC" +
       "cEmhsfe7zzxCtZYzdYqw/o\nunCY2jpz38Lar/1SeALyBcStIR3BLCwR44Sy" +
       "DOjVx+79tpf09wb2dF0BUK0mUGuKAUUvHy+6tItr\nCMK24Kwqw4M7RnUpBR" +
       "lpzkyZz0z+M5h867Yhng6b7aXYTrgtfAV3NLz9HsO9AuqiYOzMhXVhXnYw\n" +
       "eWTdN986c2GskbsyL143FdQP+xxewJiK1VoGdFh/NQ6M+oXb1j99dOyNKa5J" +
       "fX6yGFbSqciTr+LO\nO6rFIlnJAyUWXIHpFVnaUqFFLLXBtNS65VnKzZZ205" +
       "9RULXZbi5ejDiM95648EDnX/503ixvNltZ\nVO8kjqWf/fzZBTeNRIehWANF" +
       "71ysqYBoZ5mRPqlgMlbyFL+VmDN7+oJ9IFA9cKINV0BKBuKqKMix\noW+cq1" +
       "p4JN27nYuyykYQG0pk2s5/q/NKOxPB5Fhqq6Dm77I5Qbd8SKP/thH0yZUUps" +
       "3dQV/3Jn8k\nTFCZqKZSWCEM3EZov1ig0pwf4K3O0tYdMEloHXCWuS20c8sm" +
       "0dTUZz54/mRlO08KdE5rLsXnxVze\nrIR46MiJ7oXxPRIHzxk7DuIjP73r5O" +
       "Xz5A0eebk8TbmtzxQKuFuwlZBNL8/VlX7/yZQblU2iWtaX\nCgrZLchpmg8n" +
       "wQmMQfNhHIxof5/fJXL/6s/VoVZn8NrYOiuEFWlwn+9vVlG4AcZqGPVmBNU7" +
       "IsiF\nmIPczSZ0sOstuRReoekqAflwMkMsFlFeSOh1dx6ftTAaTD4NxfkI9L" +
       "Lf4U3DPDqStuiIOKKD227o\njui5Ny9+T7rEIqCSdfsDdIaJQgV7YgtLj6oZ" +
       "tK+0bWzMlTp2aQZPg9sJqmRsQz3R6CaCPrGiQIn0\n+Db5w0GCqie2xcYDpn" +
       "p0fWxpexS62EKlqCjIMg/43g1WbNH8an8JObVsz1hsYmJ4J11852K2aIfR\n" +
       "aM5rLG6LQ1lbzEKNVfXDdlsQmy162YvpHEyRYKhnpfmkd5Ovt8ffF8riZLKm" +
       "DNKWJEfp7xS43Njw\nwFA24RTrDJj2GVsBQFb2aTXLtE2r+2xa9WjZhTsX6Z" +
       "wFTXI0zrRerl1se8Vq5fFPv1/9gPDCfreZ\n8vqBI1E1v4znsGxlP+ciO9hu" +
       "MhvoNXva/rql99Rnnemvgm4P7Okvf1pCPPfds3+OvPraMUhpk6hs\n567xwY" +
       "H4MPhT21XZJcS6uZY7PbPSr1hYmZmoYA+cP6k/P/9U6hi28MpEXhZqz6vjtN" +
       "vqMD2yY3l1\n/Jo7vS8RVDWDSdZeLFshRvnFPFloH7HRlGXjdZLlcQgYkGWw" +
       "MNE9YXPDKHsRo5eTBH1qRUHVF/b1\nBv194VuhYycQQgGLLcsRxRBog+EzEf" +
       "BdJwSeIrQQ7sZEpdtGRhLR+LTNEOxTqipjKItmexgqJmYn\njB5TzJ7liekq" +
       "jP8fWMCHghbwp1eazSJhXzji744SVKKSWd473L80Lt8BlcVZyO4FmHjnVHoS" +
       "xwEJ\nFgPkZhhRE5DoRwbknA2QkAXIz1cMSJ8vHPZ39y4TkJ8AfQrrMyx3/K" +
       "iY2nEYt5tq3748tb2Mkdeu\n9nmb2mFL7d+tuKp1+8I9/u4IGFBP81MkVphZ" +
       "pxS1c16wce62OP/xI3DuDfn7IlaPwZgvDflLMENI\nJscJ1hYFnWbpQRP0we" +
       "uUI14jqBzSFZXDoGcTtr0Xq/K0ohybH7m4sfXS193IfZWtV5Gjz9wKCfG0\n" +
       "p+N993NNHexUxjslGLxOOc+MC4+E8056mchVeSCtvgpIdsv/zWb5SK738F9z" +
       "70ERgr9cFxbshi1k\nzoHeWbED9flCIRaxdVkz3GK082pezCdoFd9qqrv1Ov" +
       "nERfAJovJdpR3Cf9kg3GTp/sFKde8LUd3D\n0PPXZdnldC9aOOnmqQvGiAnA" +
       "SDEACndS7ACiE9K6wb6OFAfAzM4sYywN0b9pX6kLiiELBNswcnls\nGFm9hc" +
       "tL0OC1Y0TdwIZTT9AXjfhD3aFb+e5omcfMgZygHFTYS9Y6aejRX3PBxyb+SU" +
       "TcsHDPxue1\nupd47GY/W5THUfl0Wpbtu2Dbfamm42mJgVXO98QcoEqC1i+p" +
       "A61H9D8F0FXBJ64iqOUqEyH303/2\nGbUENRWfAcnXvLPTNxB0Qz49RLv1w0" +
       "7aRJAHSOnt6lwysR3J8HOFjJlRsxvOcQ1gp6dMmaee8975\n8B/+yxr+MpF/" +
       "rqOfqGCjPAeGIV0DYJTDBjvGoO/oib6Y1nUoMGzDY4JcZfAV+SepFvs+O8er" +
       "Y2Lv\n6LBzqx0JdodWHLas3e2FvbaX7iFX9u0DtuIfK4YMk9YMb7bhpnIrJq" +
       "v/A9Y7udNYHQAA");
}
