package net.javacoding.jspider.core.model;

import net.javacoding.jspider.api.model.DecisionStep;

import et.util.MyUtility;
import net.javacoding.jspider.core.rule.impl.RuleSetImpl;

import et.util.MyUtility;

public class DecisionStepInternal
  implements net.javacoding.jspider.api.model.DecisionStep
{

    protected int ruleType;
    protected int decision;
    protected java.lang.String comment;
    protected java.lang.String rule;
    
    public DecisionStepInternal(java.lang.String rule, int ruleType,
                                int decision, java.lang.String comment) {
        super();
        this.rule = rule;
        this.ruleType = ruleType;
        this.decision = decision;
        this.comment = comment;
    }
    
    public java.lang.String getRule() { return rule; }
    
    public int getRuleType() { return ruleType; }
    
    public int getDecision() { return decision; }
    
    public java.lang.String getComment() { return comment; }
    
    public java.lang.String toString() {
        return "[DecisionStep] " + RuleSetImpl.translate(ruleType) + " rule " +
        rule + " - " + DecisionInternal.translate(decision) + " - " + comment;
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYa2wU1xW+ttePtRf8BFxssAG3xALv+o0dSxGWbYRhwY7X" +
       "IWVrtIxnrs3A7Mww\nc9de0xS1Kg1JflBFpG1S0USpWtFW6UOlpFJThaKQJn" +
       "0gtf6RpK0StSKKUrVEqaoqqE1Fz33szt3Z\nNUhQVpqZu3fOuefc8/jOufPC" +
       "dVTqOqhZdcNkycZueCQ2qTgu1kYMxXWnYSqhvloanDy/17SKUVEU\nFesaQd" +
       "VR1Y1oClEiuhYZHx1KO6jVtoylecMiYp28Ve7f8vHib0/vaSpB1XFUrZsxoh" +
       "BdHbFMgtMk\njkJJnJzFjjusaViLo1oTYy2GHV0x9BNAaJlxVOfq86ZCUg52" +
       "p7BrGQuUsM5N2dhhMjOTURRSLdMl\nTkolluMSVBM9qiwokRTRjUhUd8lQFJ" +
       "XN6djQ3OPoJCqJotI5Q5kHwrXRzC4ibMXILjoP5JU6qOnM\nKSrOsASO6SZY" +
       "osXPkd1x214gANbyJCZHrKyogKnABKrjKhmKOR+JEUc354G01EqBFILWr7go" +
       "EFXY\ninpMmccJghr9dJP8FVAFmVkoC0Fr/GRsJfDZep/PJG9NlIX++8TkR6" +
       "3M5wENqwbVvxyYNvqYpvAc\ndrCpYs54IxV+avxgqrkYISBe4yPmNMOf/OlD" +
       "0fcvtXCapgI0E7NHsUoS6sf9zRuWh98NllA1KmzL\n1Wko5OyceXVSvBlK2x" +
       "DNa7Mr0pfhzMtfTP3y4Oe/h/9WjCrGUZlqGamkOY6C2NRGxLgcxlHdxHx2\n" +
       "Ym7OxWQcBQw2VWax/2COOd3A1BxlMLYVcoSN0zZCqByuIri2If4L0hvE1ShW" +
       "dRdUiBFsj9NQMhUj\nbBM0YGIyQyNBtTSIgZmjrq1r2JlRLQfPJC0NGzOFWd" +
       "NUZvViURFNXn/qGRCnuy0DFkqo56/9+pGx\nvY8/xh1Jg09oS1A/CA97wsNC" +
       "eJgKDzPh4ULCUVERE7su18rUbRrNrr//eKjmTIf7YjEqiaOgnkym\niDJrYM" +
       "hKxTCsRawlCAvLWikFWORB2IZmIYJBl4QBC7GMAbMuOGizP1K9/B6HkQLht3" +
       "zy5u8+SCxe\noEFFg6CBrs5VA5ce47qF2mOH9hx+bHMJJVoMUG8BadvtV0+o" +
       "Hzyx78Ibv3n7Pi8jCGrLS9R8Tppo\nfvUnHUvFGgCZt/zX/r37w7OlgxeLUQ" +
       "CyF/CLKBB1AAYb/TJyEm4oA17UWMBZNWc5ScWgrzKIU0mO\nONaiN8NCZxUb" +
       "14ABquAqhWuNCFk6h+jLOnqr54FG7enbA4PGG18s63zz51WvMqNkULRagtsY" +
       "Jjwn\naz13TDsYw/zbT0+e/cr1059hvhDOIKjMTs0auppm+q0rAt/XF8CHcG" +
       "PDU19tP/dmxtn13urDjqMs\nUV+nv7C84ZnXlG8AdkAOu/oJzFI0wCQFgKkR" +
       "Z5YcG9nHEYfj0yPnrj3a/uc/XBUYJtVGj+qviVOp\nF790abmYmjgIVUpx92" +
       "eSi1VJOipilQPcyEKezgSZPSt5/nYRVMk4u7p7egdBozoQRctqWNfCUUtV\n" +
       "jPHR5y9XLT+Z6t/DdVklEYyPJtItV7/dfrOV6SBElkk4Kf6XLyjOfi/x6aOb" +
       "oOE7hZ77u/q39/R2\n9PYRFHBSBo+qBqiyzAc0ncO8osGGmmQTTzp6EvRaEJ" +
       "XiYvyfndp720b5zhrlDkQm3N19E7fVv/8h\nCzGfoQuUI5+QJzd+670L16Ya" +
       "eNbymr0lr2zKPLxuM/+E7DTsYdOtJDDqK9s2vXBy6p1ZvpO6XFwc\nM1PJvu" +
       "fewu07Q2oBEC6BzgKinu2rj84+wOwZ4REyKkVIXyd700NvY3fpvx19HQODBJ" +
       "WrVjKJTYa0\nA5mUo/ftbNxBoYClC2LabBYkFJH9RWcX7acycJac/ey/Xnm2" +
       "spWnJ+VpzmZdTkjkcCXU4yfO9SzH\nHta5If2u9RGfePmhZ29cJe/wwMgiJp" +
       "W2KZ2v4AFFAvOBNxZqy370XLIYlcdRDesWFZMcUIwURaY4\nZK07IiajkHTy" +
       "+9zejQPCULYiNPtjSxLrx2ovEGCcCxAePK+Gq0nANMo8JXguQiyhpxlDG7tv" +
       "zYJp\n0HYsAvphLU1QBU3WaSHmAQ7r9D6RJyskZIUKy4rT2wFYUBPxdcsFN8" +
       "C1Siy4qvCCh8SCmXCUM+Cw\njJE7fBjJI2J05+Dld6//UP+I4WAl6+yHKYuw" +
       "bZDNSOhcYtku7SGlQ4xYqW3Cdnnu92bl9g3sALgc\nueN06+3c3tXb3dHVCw" +
       "kXmt49HgtLWad4uz4JjWv+3qhGwnqojqXFag9nKbbILwFPAlNjw6Msn1dy\n" +
       "yHrxRJlnvkOSwiEevgtv2LI3BtibWclQfZ13g0tgqIHOjgGwfJCZiQqnEo4L" +
       "Rej4mLc1ptCnBCJ5\noNUs2jpJ6yVZ6347U7A6Vuh/FVsv0P7SUrBhpQMTKw" +
       "OnP/2P0KPKlUPFAi53wkaIZXcYeAEbHnL6\nF9nHzocZkKh+uOUvu/rPf84P" +
       "neyULkNnLltCvfyDS3/qe+uPpwAO46h8/0RsZDg6BuHScktxCbV2\noenBki" +
       "P66yx5BIrlnWpzmYZysavSwXAoN6dzEKw1p8GkILBOxNy6Qg2m5MsVCtBtq9" +
       "NpSKV5TKZ8\nIXtGLqFdXgn98t2EanfP9q6ujm7I6Bohcqvbys3AAhQxOady" +
       "bNAs0BVlnvfABmcJqhIKZZF+JV1a\nhC4t90iXr3NdRuUiUUiXjXBtEbpsuU" +
       "e6PA9BALqM5NeX78jh0e2Fx3fvJjx6+mh49AAa1ntSbx8h\n1BJbhSW23iNL" +
       "fB/qNrFEgy7Z4SeyHXo8O1y8KzsMZuxQm5HpswL0JQ2FmOmhrjHvkyL/8KVu" +
       "Xj58\n3yt27a/YWTn7caoCTj5zKcOQuyppXGY7eE5ne63gPRbf+EsEbbrthx" +
       "CCStmT2eVnnPFlgppuwQhF\niz5kjssErS3MAdAlRjL9FYJW59KDk7w/Mulr" +
       "cJIAUjp8PVvgpBMZ71NpDWuQeoyYDaanp8z0N18K\nPHjm9/9hRaBc5R9l6Y" +
       "dIaJEWwDkkMgxOWXJZW0zf0W81aspxIK5ZERRGrnL5ivzDY5PcYWVltU0f\n" +
       "nBwr0GR1/V+aLGjVArR7uPPvW9CHfaKQjZjecrdFd3BUiPsfArF/zUgXAAA=");
}
