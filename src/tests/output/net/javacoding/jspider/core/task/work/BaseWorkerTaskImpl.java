package net.javacoding.jspider.core.task.work;

import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEvent;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.WorkerTask;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

abstract public class BaseWorkerTaskImpl
  implements net.javacoding.jspider.core.task.WorkerTask
{

    protected net.javacoding.jspider.core.logging.Log log;
    protected int type;
    protected net.javacoding.jspider.core.SpiderContext context;
    
    public BaseWorkerTaskImpl(net.javacoding.jspider.core.SpiderContext context,
                              int type) {
        super();
        this.log = LogFactory.getLog(this.getClass());
        this.type = type;
        this.context = context;
    }
    
    public void tearDown() { context.getAgent().flagDone(this); }
    
    public int getType() { return type; }
    
    protected void notifyEvent(
      java.net.URL url, net.javacoding.jspider.core.event.CoreEvent event) {
        if (event == null) {
            log.error("PANIC! event is null!");
            log.error("URL: " + url);
        } else {
            context.getAgent().registerEvent(url, event);
        }
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1358023443468L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwUxxUf39nnrwv+BBxssAEnxMK+s322Y2MpxbGNODiw" +
       "8RkorqNjvTtnFu/t\nbnbnzmeaokalIU2lVFHS9IsmStQKKSJtFBSqqmkpSt" +
       "JvpNZ/JGmrRK2IolQtUaqqCmpT0Tczu7d7\ne4eNavWk3Z2beV8z773fe7sX" +
       "rqMy00AtohkiSzo2Q6PxScEwsTSqCKY5DVMJ8Y2yysnz+1XNh0pi\nyCdLBN" +
       "XERDMsCUQIy1I4OjacNVCbrilL84pGLDkFUnZt/2TxN2f3NftRzQyqkdU4EY" +
       "gsjmoqwVky\ng4IpnJrDhjkiSViaQXUqxlIcG7KgyKeAUFNnUL0pz6sCSRvY" +
       "nMKmpmQoYb2Z1rHBdNqTMRQUNdUk\nRlokmmESVBs7KWSEcJrISjgmm2Q4hg" +
       "JJGSuS+SA6jfwxVJZUhHkg3BCzdxFmEsN76DyQV8lgppEU\nRGyzlC7IKpxE" +
       "q5cjt+P2/UAArOUpTE5oOVWlqgATqJ6bpAjqfDhODFmdB9IyLQ1aCNp0S6FA" +
       "VKEL\n4oIwjxMENXnpJvkSUFWyY6EsBK33kjFJ4LNNHp+5vDURCP7nscmP25" +
       "jPSyUsKtT+cmDa4mGawkls\nYFXEnPFGOvRU9Fi6xYcQEK/3EHOakbt+cDj2" +
       "weVWTtNchGZi7iQWSUL8ZKBl8/LIe5V+akaFrpky\nDYW8nTOvTlorw1kdon" +
       "lDTiJdDNmLP5362bHPv4D/6kMVURQQNSWdUqOoEqvSqDUuh3FMVjGfnUgm\n" +
       "TUyiqFRhUwGN/YfjSMoKpscRgLEukBNsnNURQrVwlcDVjfivgd4IarxfMPFR" +
       "zVgAlwjmQjSlKyGd\noF0qJrM0DkRNggiYPWnqsoSNWVEz8CwBwtlF4Jktxp" +
       "ylOmsWS0po8npTT4E43aspICohnr/2q4fG\n93/pUe5IGnyWtQQNgvqQoz5k" +
       "qQ9R9SGqPkTVhwrVo5ISpnhj/jlTx0k0v/728nDt413mJR/yz6BK\nOZVKE2" +
       "FOwZCXgqJoi1hKEBaYda4kYLEHgRucgxgGaxIKCGI5AwebMdA2b6w6GR6FkQ" +
       "ABuHz65m8/\nTCxepGFFw6CRSuemgVMXuG3BjvgD+44/us1PiRZLqb+AtH11" +
       "6Qnxw8cOXHzz1+/c4+QEQe0FqVrI\nSVPNa/6koYlYAihzxH/tX3s/erJs6B" +
       "UfKoX8BQQjAsQdwMEWr468lBu24YseFnBWJzUjJSh0ycac\nKnLC0BadGRY8" +
       "d7AxDdhquMrg2mwF7Z30Rhfr6a2Bhxo9T88eGDje+EKg+61Xq99gh2LjaI0L" +
       "cOOY\n8Kysc9wxbWAM8+98ffLJr14/+xnmC8sZBAX09Jwii1lm38YS8H1DEY" +
       "QINTU+9XTHubdsZzc40kcM\nQ1iivs4+vLz5Gz8Xvg3oAVlsyqcwS1If0+QD" +
       "piZsixwfPcAxhyPUQ+euPdLxp99ftVDMVR0dqr8k\nzqQvffHyso8ecSXUKc" +
       "E8aKcXq5N0VMJqB7iRhTydqWTnWcUzuIdYnIM9vYNgUD1oonU1JEuhmCYK\n" +
       "SnTsuSvVy0+kB/ZxU+5wEUTHEtnWq9/tuNnGTLA0BlxAaf0vzwjGQSfz6aOX" +
       "oNH/HX129fZ3Rrq7\n+sH8cpFXcOatRoI6VgKVOBtbNR+22+w+/0lDToHVGa" +
       "uQvDLzj27p/Z1jfN9N7gbFTbi39yZub/jg\nIxZ/Hi8UqVYeJU9s+c77F69N" +
       "NfKU5iV9e0FVdfPwss6cF9SzsIetK2lg1K/v3Hrh9NS7c3wn9fmg\nOa6mU/" +
       "3Pvo07dgfFIhjth8YDUoLtq99OCXrvZOMumqosnBEzaZtFQhHTWxb20I7Hhp" +
       "vU3Gf/+doz\nVW08fShPCxPj93oljyshPnjqXGQ5flTme/Gerof41E8OP3Pj" +
       "KnmX+yaHaFTb1myhgUcEF9gOvpmp\nC7z0bMqHymdQLevnBJUcEZQ0RY4ZyC" +
       "pz1JqMQVa41/O7K56wwznEbvG616XWi6WOL2Ccn8AOfK6D\nawNc6y34XO+B" +
       "zxLEMm6CMbSz+44c2FXqhkbAPixlwdmKxlWHOTocdqHDgAcd+FGP7R668t71" +
       "78sf\nMwSoYk3tCOWwjK5kMy5Y8mu6SdsnV/9uSWqf0E0e130EVTG1PZHu/o" +
       "G1AUVfb2dPb1dPP0EV03uj\n8RDskKo4wjd7Gnq1wj1RS6yzRPUsztYxcKfu" +
       "ZPniXoQcKZ0aHxmz8WfHSvgDKufpZIxbUcOY9uV5\ncqPlTWQ/Cz3JYPYQcS" +
       "LivlsJa7cEIvtZKGzeEpaHo5b/T7r8fy9bOJpzTd9QzyBBe27PNWNYhOkJ\n" +
       "leMvEFIPgXfuBe8MdPVGCAoy71g2UE0Ljkn073F6G2T7zBYGsg/cK8xB3yOI" +
       "jLrDhiEHqVqsXsu1\nvYxre/267cCdq3alTpBR/N18q5cYhr1nP/334CPC6w" +
       "/4LIDcDTqJpncpOIMVByu9Qg6wdzYbFmqO\ntv55z8D5zxUDyxY3WOazJcQr" +
       "37v8x/63/3AGAHAGlR+ciI+OxMYhnltXVJcQ6zLNh/wn5F+wrLZw\nq+BNM5" +
       "9pOB+tqgwML8rqdB5mteW1fJvgarWCs7VYy0dvd69YclatR2cgMAgWjDFtUW" +
       "UEu3TO9ClI\nn4xGvyXw2taN2PTDeRY2wbXdsnD7/8nCr0Ccz2NiH9R9Xjto" +
       "Gg/CtcOyY8et7DhUVJXda7rC/puu\nsB9iCxF6+9bagDYy1Bnp6YoAJvjThm" +
       "InU5ABJ82ow1MxtxHPOUZEuh0jnl+zEX3QFgLal0F+qeS2\ncppRwhuXgcfp" +
       "aHWXPU1QtaoRObnEGOjUlxGUz/pCm+ibQVPBlyn+/UTctnz8ntf0ul+yF67c" +
       "N44K\n6J+TaUVxl37XOKAbOCkzOyp4I8AP9EWC7rqt92kIfPpgO7vAeV8iqG" +
       "01Xlpu4OFmu0hQ8wpswEEf\nbo5LBG0ozgFZYI3c9D8kaF0+PdQf54+b9FUI" +
       "PCClwx/nsLzWqdu8DaOA3eiq+HEdKhN9y8k+/6PS\nQ4//7t8M8ezCQ7+EQa" +
       "OSkeFtJjyiCsqSybo+ukY/FYhpA16DCUN8yz3VJpfIv3w1u/ucnK726WOT\n" +
       "44WtzkBkja1OX2dPd1dPN5w7LaZr+cACfdGdxU6JWe7ufugeEpbC/wIGFCmu" +
       "yxUAAA==");
}
