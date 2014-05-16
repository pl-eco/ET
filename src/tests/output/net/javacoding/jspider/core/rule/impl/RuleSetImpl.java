package net.javacoding.jspider.core.rule.impl;

import net.javacoding.jspider.api.model.Decision;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.DecisionInternal;

import et.util.MyUtility;
import net.javacoding.jspider.spi.Rule;

import et.util.MyUtility;
import net.javacoding.jspider.core.rule.Ruleset;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.util.List;

import et.util.MyUtility;

public class RuleSetImpl implements net.javacoding.jspider.core.rule.Ruleset {

    protected int type;
    protected net.javacoding.jspider.core.rule.Ruleset generalRules;
    protected java.util.List localRules;
    
    public RuleSetImpl(int type, java.util.List rules) {
        this(type, null, rules);
    }
    
    public RuleSetImpl(int type,
                       net.javacoding.jspider.core.rule.Ruleset generalRules,
                       java.util.List rules) {
        super();
        this.type = type;
        this.generalRules = generalRules;
        this.localRules = rules;
    }
    
    public net.javacoding.jspider.api.model.Decision applyRules(
      net.javacoding.jspider.core.SpiderContext context,
      net.javacoding.jspider.api.model.Site site, java.net.URL url) {
        net.javacoding.jspider.api.model.Decision decision = null;
        if (generalRules != null) {
            decision = generalRules.applyRules(context, site, url);
        } else {
            decision = new net.javacoding.jspider.core.model.DecisionInternal();
        }
        if (decision.isVetoable()) {
            Rule[] rules =
              (Rule[])
                localRules.toArray(
                  new net.javacoding.jspider.spi.Rule[localRules.size()]);
            for (int i = 0; i < rules.length; i++) {
                net.javacoding.jspider.spi.Rule rule = rules[i];
                net.javacoding.jspider.api.model.Decision lastDecision =
                  rule.apply(context, site, url);
                decision.addStep(rule.getName(), type,
                                 lastDecision.getDecision(),
                                 lastDecision.getComment());
                decision.merge(lastDecision);
                if (!lastDecision.isVetoable()) { break; }
            }
        }
        decision.addStep("Ruleset", type, decision.getDecision(),
                         "ruleset final decision");
        return decision;
    }
    
    public void addRule(net.javacoding.jspider.spi.Rule rule) {
        localRules.add(rule);
    }
    
    public int getType() { return type; }
    
    public java.lang.String toString() {
        java.lang.StringBuffer sb = new java.lang.StringBuffer();
        sb.append("[");
        sb.append(RuleSetImpl.translate(type));
        sb.append(" ruleset]");
        return sb.toString();
    }
    
    public static java.lang.String translate(int type) {
        switch (type) {
            case Ruleset.RULESET_GENERAL:
                return "GENERAL";
            case Ruleset.RULESET_SITE:
                return "SITE";
        }
        return "ERROR!";
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZfWwUxxWfu/O3TYzNl4kBG2Ma3PjOH+c74zitYvwhzhyx" +
       "uYOkuEaX9d7YLOzt\nbnbn7IOkqFXSkEZVqgj6TRMlaoXUorYKCvmjVSkK6V" +
       "eK1LpSSFolagWKkrZEVFEbmqaib2b2buf2\nzlicVKTdG8++N+/N+/i9N8OZ" +
       "a6jcMtEG2QqQIwa2AsPxScm0cHJYlSxrL0wl5FfLqydP79J0L/JE\nkVdJEl" +
       "Qfla2upESkLiXZFRkZzJio1dDVI3OqTux1Cla5Z8vHC789Pt7sQ/VTqF7R4k" +
       "QiijysawRn\nyBSqS+HUDDatoWQSJ6dQg4ZxMo5NRVKVo0Coa1Oo0VLmNImk" +
       "TWzFsKWr85Sw0Uob2GQys5NRVCfr\nmkXMtEx00yJoZfSQNC91pYmidkUViw" +
       "xGUcWsgtWk9TA6hnxRVD6rSnNAuDaa3UUXW7FrjM4DeY0C\napqzkoyzLGWH" +
       "FQ0s0eLmyO24fRcQAGtlCpODek5UmSbBBGrkKqmSNtcVJ6aizQFpuZ4GKQTd" +
       "ueSi\nQFRlSPJhaQ4nCGpy003yT0BVzcxCWQha4yZjK4HP7nT5TPDWREXdf5" +
       "+a/LCV+bwsiWWV6l8JTJtc\nTDE8i02syZgz3kgHTkb2pzd4EQLiNS5iTjO0" +
       "9eV90XfPt3Ca5iI0EzOHsEwS8sfhDRsXh65W+6ga\nVYZuKTQU8nbOvDppfx" +
       "nMGBDNa3Mr0o+B7Mefx36x//Pfx3/zoqoIqpB1NZ3SIqgaa8lhe1wJ46ii\n" +
       "YT47MTtrYRJBZSqbqtDZ32COWUXF1BwVMDYkcpCNMwZCqBIeDzwHEP+3hr4I" +
       "WhFLqzgOa6UMNWAQ\nFNQwmaYBIOtJcP30IctQkticlnUTT5tAO60A5XQeV4" +
       "ZKqV/weGi6upNNhcjcqauwRkI+feU3j47u\n+tKT3HU03Gz9COoBuQFHbsCW" +
       "G6ByA1RugMoNCHKRx8Mkrss3KfVRkqbS318cXPm03zrnRb4pVK2k\nUmkiza" +
       "gYUlBSVX0BJxOExWCDEO8szCBG62YgXEGNhAoLsfQAG86bqM0dlk4yR2AkQa" +
       "wtHrv5u/cT\nC2dpBFGPr6arc9XAf4e5bnUd8QPjDz3Z5qNEC2XgCS+Qti+/" +
       "ekJ+/6ndZ19/7a1tTvgT1F6QlYWc\nNKvc6k+auoyTgFrO8l//aOf1E+UDL3" +
       "lRGaQqgBWRIMQg8ze5ZeRl12AWqaixgLN2VjdTkko/ZeGl\nhhw09QVnhkXN" +
       "CjZeCQaohaccno12fDbTF/3YSF+reIxRe7r2wHDwxmMV3Zd/WvsqM0oWMusF" +
       "bIWY\n4QnY4Lhjr4lpLL31jckTX712/LPMF9wZHoIqjPSMqsgZpt86D/h+VR" +
       "EwCDStPvm1jlOXs85e5aw+\nZJrSEerrzBcWN37zl9J3ACggYS3lKGb56M25" +
       "vRlnlxwd3j1pKimAhHkbs16a+qA7+c7dIxyPmsRa\nKBLu7L2J21e9e53tvx" +
       "oKk2Tdn8uuQmB0CXlm03ffOXsltpqHFK8eWwoAXOThFYT5pM7IwB4230oC\n" +
       "o7549+Yzx2Jvz/CdNOYn7aiWToWeewN33FcnFwEHH9Q4cAnbVwikNYkW44DM" +
       "d/LoqStPdPz5zUs2\nxAvmcqjeSzyePvfF84teGpQuW7Emgo48rLBC4DOQoD" +
       "PVbLc1HOwGic3Zt72vHxRqBEm06QgoyUBU\nlyU1MvL8hdrFZ9Lhca7KCoEg" +
       "MpLItFz6XsfNVqaCLbFCqCL235Xzkum40aA/9xJ0bwkIfU9vf2cw\n6O8LEl" +
       "ROSSwW1qsJukNEJ4hVO9zpu5ON/TQNWagitvM2NrupIG232GnbUixt6esTRZ" +
       "f2saV99M8g\nmxzgBh4XDLydffgUfe0qcfvBHrr9EGy/bg6DVyU1Jlph27LF" +
       "h5FjIqq4R1BxwFExVrqKoZA/HMp6\niK61Y3l/jNkktDq5a+8YbSSz0J6aee" +
       "Sfrzxb08qhivJs4LZ3I1AeV0J++Oip4GL8QYXHsRtJXMRH\nf7bv2RuXyNsc" +
       "h3LVg0rbnClU8AFJKGzbX59vqPjxcykvqpxCK1mbLGnkAUlNUytNQT5aw/Zk" +
       "FPJJ\n/J7ftPJUH8xVxw1uKBPEuuuWgzswzk99p1TdAc86+0HZXyHmPYjlqs" +
       "QY2tn7rlxhqTZMnYB+OJkh\njoggL2/0PZ0nh+ZVky2nqbicOfqSi4W2HamH" +
       "hEgNudCKO3DkvoELV6/9SPmQIVINO4EMUQ7bFNVs\nRoBJn25YtNcVDlv2Su" +
       "0ThsUrw6cJqmFie7qDwVCJadHX09kb9FP2hr07I/GAuEcq5LBr38egxy7c\n" +
       "HlXKNiJqZIHMgY/GCys+4kcoOGWx0aERuvzEUn7ZBM96m2l9cb8s2H6pUWlF" +
       "KPDKUcErYfZBFQwW\n3k7QYCkGC/d3bvf3AHc9s5cjm0p4JE8bOpNmOMN2mR" +
       "FgGjmIw2HCI6r+mKB6H9vrBG0CNi51aGMN\nwPHP/KPuCeniAa+NXODSaqIb" +
       "fhXPY9UBMfciu9kZNZuv9Q+2/GUsfPpzbhRjNwUiiuWzJeQLPzz/\np9Abf3" +
       "wckGkKVd4/ER8eio5CHLTcUlxCbphv3uM7qPyKJYYNKAUn63ymwXwYqTExSZ" +
       "va3jwwac0r\noBF4ttrBtLWkAip654TjnVCPU5hOllqYoHXo8Yd6CaqU+ZVI" +
       "tmx23Kpsxtl4WOCw1fuWoF6vo963\nS1cv1OcPQ2mH3prgrG5bl9BNMpRASk" +
       "9iNRDPUtt6PS/oFXT0eqF0vcIhfz+YzZc21axadQx2qG77\nYtHlq/tXKCIY" +
       "hnqkAD1+IGjb7Wh7pnRte3r8/WDFVY68u6xWHrvLOdwx6giWFQs6WMRYvpwX" +
       "5W3w\n7LCjfMftRbmnEIPOOQYIC1H+cokGCIc7e/v8QRpGufYLdtyyxI7hh/" +
       "WEy7vwRcgbKZnMAW6XwXn6\nQNK8Tq8s+bmmu5jJaMUfs002dnsmy+qwrIIX" +
       "QcE5TLL4FCymB61247Ye4/8nPV4jqIro/MZRdPSi\n4GgBL/5QoqP7+2ikB7" +
       "uhochKK4jzlU5zwCncNoE2AXXBE7NtEitmk8L2z0vHHeBxi90wF7eJHevM\n" +
       "F8tb7U1aRU1Js1QpH86uCGYLOWa7StCOW5mNpfF0No3jBBsRer+sSawZ6+4M" +
       "whkl/Enem9zefV0g\npybV4zKC9rdW+EyvT5oKbur5fbLctvjQtleMhl+zW6" +
       "ncnW8VHJln06oq9uzCuMIw8azCjFHFO3hu\nmb8uXR3ytYcMpT/MeO9x3msE" +
       "tS7HK0KIzXadoOZbsAEH/RE5PiBobXEOSFd7JNL/C87y+fRQOpw/\nRNJ/Q0" +
       "kCUjr8yCgS8vz8RBu61UInHTcgJujFRuaFn5Ttefr3/2EdUbYloP8zAGeBeY" +
       "ga0jUE0XLE\nYsc1+o3ep8pp08QaYR2h7Z5ai6/I/yegWTxK5GS1790/OVp4" +
       "mujvLzX5+zt7B/y9A2Bw2h2XdO8M\nJ4z1xezCdBXPEVRrYkv6H9d0WYXNGg" + "AA");
}
