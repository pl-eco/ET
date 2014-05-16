package net.javacoding.jspider.core.task.dispatch;

import net.javacoding.jspider.core.Agent;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.exception.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.LogFactory;

import et.util.MyUtility;
import net.javacoding.jspider.core.threading.WorkerThreadPool;

import et.util.MyUtility;

public class DispatchSpiderTasks
extends net.javacoding.jspider.core.task.dispatch.BaseDispatchTaskImpl
{

    protected net.javacoding.jspider.core.threading.WorkerThreadPool
      spiders;
    protected net.javacoding.jspider.core.Agent
      agent;
    protected net.javacoding.jspider.core.SpiderContext
      context;
    
    public DispatchSpiderTasks(net.javacoding.jspider.core.threading.WorkerThreadPool spiders,
                               net.javacoding.jspider.core.SpiderContext context) {
        super(context);
        this.
          spiders =
          spiders;
        this.
          agent =
          context.
            getAgent();
        this.
          context =
          context;
    }
    
    public void
      execute(
      ) {
        LogFactory.
          getLog(
          net.javacoding.jspider.core.task.dispatch.DispatchSpiderTasks.class).
          debug(
          "Spider task dispatcher running ...");
        while (running) {
            try {
                spiders.
                  assign(
                  agent.
                    getSpiderTask());
            }
            catch (net.javacoding.jspider.core.exception.NoSuitableItemFoundException e) {
                
            }
            catch (net.javacoding.jspider.core.exception.SpideringDoneException e) {
                running =
                  false;
            }
            catch (net.javacoding.jspider.core.exception.TaskAssignmentException e) {
                
            }
        }
        LogFactory.
          getLog(
          net.javacoding.jspider.core.task.dispatch.DispatchSpiderTasks.class).
          debug(
          "Spider task dispatcher dying ...");
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1358031617746L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1YfWwcxRWf+/DZZx9x/JHExI7tBBewiO/8EX/l1MLVdvAl" +
       "F/vwGdIYR8d6d87e\neG932Z07X1xqtWpKKH8gIT5apJSoqDRShQoigv7Rqm" +
       "kE9DtS6z+AtgK1CkJUbRBVVRG1VOmbmV3f\n3t7FqZRY2vXszHvz3ryP33tz" +
       "L11GVaaB2kQzTE7o2AyPpZKCYWJpTBFMcxam0uJbVcHk2UOq5kWe\nBPLKEk" +
       "H1CdGMSAIRIrIUiY9HCwbq1DXlxKKiEWufsl323/bZym9PHWz1ofo5VC+rKS" +
       "IQWRzTVIIL\nZA6Fsji7gA0zJklYmkMNKsZSChuyoMirQKipc6jRlBdVgeQM" +
       "bM5gU1PylLDRzOnYYDLtyQQKiZpq\nEiMnEs0wCdqaOC7khUiOyEokIZskmk" +
       "CBjIwVyXwYrSFfAlVlFGERCLcn7FNE2I6RA3QeyGtlUNPI\nCCK2WfzLsgqW" +
       "6HBzbJy46xAQAGt1FpMlbUOUXxVgAjVylRRBXYykiCGri0BapeVACkE7r7kp" +
       "ENXo\ngrgsLOI0QS1uuiRfAqogMwtlIWibm4ztBD7b6fKZw1vTgdB/H09+2s" +
       "l87pewqFD9q4Gp3cU0gzPY\nwKqIOeOVXPjp+NFcmxchIN7mIuY0sc/96P7E" +
       "R+c7OE1rBZrpheNYJGnxs6G2XeuxD4I+qkaNrpky\nDYWSkzOvJq2VaEGHaN" +
       "6+sSNdDNuLP5v5+dGv/gD/zYtq4iggakouq8ZREKvSmDWuhnFCVjGfnc5k\n" +
       "TEziyK+wqYDGvsEcGVnB1BwBGOsCWWLjgo4QqobHA08Y8b8G+gIPjMsmEIpL" +
       "KV2WwC2CuWyGdYLu\nVjGZp4EgahKEwPxxk63Pi5qB5wlQzUsW43zFHQpUcv" +
       "2Kx0NT2J2ACkTrpKYAdVo8e+nXj0wc+uZj\n3J00BC2dCfo86BAu6hC2dAhT" +
       "HcJUh7CtQ7iCDsjjYdJ3lJqc+lCiqfb3V6Nbn+gxX/ci3xwKytls\njggLCo" +
       "YUFRRFW8FSmrAYbXDkAwtDiOHQAoQzqJRWYCOWPmDjvIH2uMO2mOxxGAkQi+" +
       "trV3/3cXrl\nHI0wGhHNdHeuGvh3mesW6k4dO/jQY3t8lGjFT10HpF3X3z0t" +
       "fvz44XNv/+a9O4vpQVBXWdaWc9Ks\nc6ufNDQRS4Bqxe2/9e/JT56qGn3Ni/" +
       "yQygBmRIAQBGRod8soyb6ojWTUWMBZl9GMrKDQJRt+asmS\noa0UZ1gE3cLG" +
       "W8EAdfBUwdNmxe8O+qKLjfTVxOON2tN1BoaTV74e6H3nJ3VvMaPYkFrvwN4U" +
       "JjxB\nG4rumDUwhvn3vp186pnLpx5kvrCcQVBAzy0oslhg+u3wgO+bKoBFuK" +
       "X56We7T79jO7upuHvMMIQT\n1NeFr63veu4XwncASCChTXkVs3z1MkleYGrB" +
       "9pYTY4c5/HCweuT0pUe7//yHixagOQplkeqv6ZO5\n179xft1LTRyEkiWYU3" +
       "aOsZJJRx5WRsCNLOTpTJDZs5ancR+xOPv6R0ZBoUaQREtsWJbCCU0UlPj4\n" +
       "dy/UrT+ZGzrIVbnFQRAfTxc6Lr7YfbWTqWBJDDgw0/quzgvGVDH96b9+giZv" +
       "EIf29w/sHejrGRwk\nqJqzmsxlzQQNbQovSwYW2PQRzViG7dh3UtMUxh7hlt" +
       "lftMxoL1sYoK/ozdF7cLhneAT0FnknYuvd\nvZnefBOrd7Gjk773snEPzRoW" +
       "WYgdYI9FQsHLDdMHaB9iZ3524cv/euP52k4eyZSnjW3jg3hodQZo\nCVdafH" +
       "j19MB66ojMA8NdoV3Eqz+9//krF8n7LE2L4EKl7S6UK/iA4MC9kbfzDYFXzm" +
       "S9qHoObWVd\nlqCSBwQlR5N4DgLcHLMmExCgzvXSnofnTnQDPNvcwOYQ64a1" +
       "Yv2CcWkuFZFsCzx3wNNkIVmTC8k8\niAV/gjF0sfcdG7gT1A2NgH5YKrgi2g" +
       "rJGUeyDrmSlZt7/J7RCx9cfln+lCVkLWs3Y5TDUjzIZhwo\n4dN0kzY2js7a" +
       "2qlrWjejTOw+W+zQ6HDvTQj/gX17+4Z6+gcICs1OxlNh66RUVKp48DXoqMrP" +
       "R7Wy\nbIsaWdxtYbhL3RueUHNZ5yL0Gf6Zidg43XmEFxH6vrfEXTvhabaYmi" +
       "u7K01fUwRVQZerEqdHFhwe\nGWYLsw5j3QyMA2MBxg0MEVTLjMVUoIJEWx/6" +
       "ccwGkN2bAUjMJq9khy54tll22FbZDsuWHUpQy7KE\n6rDEiNsSQ1Bm7r1h1B" +
       "zeO9LT32tHjaUDlaQVVVqj3w/C95GZ+OzsxBT9vJsdmWl5uwWJRdRssxAT\n" +
       "0mnXtS4m7FJ16kv/CD0qvHmMo11jaedJI2/wzLu4+56QWKHbDRJN71FwHitF" +
       "SHZLO8wubDb61B/p\n+MuBobNfcWMy67mdmFzKlhYv/PD8nwbf/eNJ0GIOVU" +
       "9Np8ZiiQlQuGNTcWmxId96n29J/iUDDgse\ny66ZpUzRUlCsNTDcktXZEmjs" +
       "LGnyboWn3Yqx9kpNnsNH16hs1y17J8H5uIBFuNS661fSkLPQluSt\nS+Nrc/" +
       "/slT68a5x7tMX5Y4STcLL/Ku5q+ugTXrlK26wKdc8l5Mn273147tJMM48Kfn" +
       "2/rewG7eTh\nV3h2lpBO43L3ZhIY9Zt37X5pbeb9Ba9lg1UAvrxGfzMJMH17" +
       "EVSUpgppRRvXlrLfUPhNX9yz/tCd\nb+gNv2L3gY3beA20d5mcojjLoWMc0A" +
       "2ckZkWNbw4cnx49jrNTcmdj6Aae8h8/Azf4zmCOq+3B5yc\n/nOynSaodRM2" +
       "4KD/nBxnCNpemQOC67ijXln0LxC0pZQe4Lr44SR9kSAfkNLh93UngJ51AOig" +
       "buP5\nF/7/e/IXBRPbLqbOjWd1hYZPs6OKpnQsyrSpL7zwY/99T/z+Pyzdbf" +
       "CkvwFBI5CXoXmPxFRBOWGy\nzoqu0ZuxmDPg1kcYLlrurjP5jvw3n1ZnH7Eh" +
       "q2v2aHKivJXYdzOq4zBtJfqgOvppUbjhHxag6bi1\nkrnYEZytBT3MvCX1f1" +
       "1ZzinOFAAA");
}
