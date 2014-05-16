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

public class DispatchThinkerTasks
extends net.javacoding.jspider.core.task.dispatch.BaseDispatchTaskImpl
{

    protected net.javacoding.jspider.core.threading.WorkerThreadPool
      thinkers;
    protected net.javacoding.jspider.core.Agent
      agent;
    protected net.javacoding.jspider.core.SpiderContext
      context;
    
    public DispatchThinkerTasks(net.javacoding.jspider.core.threading.WorkerThreadPool thinkers,
                                net.javacoding.jspider.core.SpiderContext context) {
        super(context);
        this.
          thinkers =
          thinkers;
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
          net.javacoding.jspider.core.task.dispatch.DispatchThinkerTasks.class).
          debug(
          "Thinker task dispatcher running ...");
        while (running) {
            try {
                thinkers.
                  assign(
                  agent.
                    getThinkerTask());
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
          net.javacoding.jspider.core.task.dispatch.DispatchThinkerTasks.class).
          debug(
          "Thinker task dispatcher dying ...");
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1Ye2wcRxkfn+2zz77E8SONGzu2kxqIVfvOj/gVSxBjO/iS" +
       "i331uQ25Orqud+fs\njfd2t7tz54spFojQlP5RqeoDKoVGVJRIqAJE1PIHiB" +
       "C15R0J/EdbQK1AqaoiSFWEUCMoCt83u3u3\nt744QomlXc/OfK/5Hr/55l66" +
       "RipNg7SKZoid1qkZmojHBMOk0oQimOY8TCXF1ysDsQtHVc1HyqLE\nJ0uM1E" +
       "VFMywJTAjLUjgyOZYzSIeuKaeXFI3ZcjZJOXjPx6u/PXukpZzUJUidrMaZwG" +
       "RxQlMZzbEE\nCaZpepEa5rgkUSlB6lVKpTg1ZEGR14BQUxOkwZSXVIFlDGrO" +
       "UVNTskjYYGZ0anCdzmSUBEVNNZmR\nEZlmmIzsiJ4SskI4w2QlHJVNNhYl/p" +
       "RMFcl8mKyT8iipTCnCEhDeFXV2EeYSw4dxHshrZDDTSAki\ndVgqVmQVPNHu" +
       "5cjvuPMoEABrVZqyZS2vqkIVYII0WCYpgroUjjNDVpeAtFLLgBZGdt9UKBBV" +
       "64K4\nIizRJCPNXrqYtQRUAe4WZGFkp5eMS4KY7fbEzBWtWX/wv4/HPurgMa" +
       "+QqKig/VXA1OZhmqMpalBV\npBbj9Uzo6ciJTKuPECDe6SG2aMY/8aP7o+9f" +
       "ardoWkrQzC6eoiJLih8Pte7ZGH83UI5mVOuaKWMq\nFO2cRzVmr4zldMjmu/" +
       "IScTHkLP5s7ucnvvRd+jcfqY4Qv6gpmbQaIQGqShP2uArGUVml1uxsKmVS\n" +
       "FiEVCp/ya/wb3JGSFYru8MNYF9gyH+d0QkgVPGXwdBPrrx5fkFeTsgmE4vL8" +
       "sqyuQFwEc8UM6Ywc\nUilbwEwQNQlyYOGUqcsSNRZEzaALDKgWJJtzobSIHO" +
       "quWy0rwyL2lqAC+TqtKSAwKV64+utHpo5+\n7TEroJiEttWMfBqMCBWMCNlG" +
       "hNCIEBoRcowIlTKClJVx9buKvY5hlLDa/v7DsR1P9Jiv+Eh5ggTk\ndDrDhE" +
       "WFQpUKiqKtUinJeJrWu0qCZyKkcXARMhpsSiogiFcQuDlrkH3ezC3UewRGAq" +
       "TjxvqN332Q\nXL2ISYZJ0YTSLdOiaDy3LdgVP3nkocf2lSPRagVGD0g7by09" +
       "KX7w+LGLb/zm7f2FCmGkc1PhbubE\nwvOaHzM0kUoAbAXxX//39IdPVY6+7C" +
       "MVUM2AZ0yALARwaPPqKCrAMQfM0FnAWZvSjLSg4JKDQDVs\n2dBWCzM8hbbx" +
       "8Q5wQC08lfC02im8C1+42ICvRivh0J+ePXCovP4Vf++bP6l9nTvFQdU6F/zG" +
       "KbNq\ntL4QjnmDUph/+xuxp565dvZBHgs7GIz49cyiIos5bt+uMoh9Ywm8CD" +
       "U3Pf1s17k3nWA3FqSPG4Zw\nGmOd+/LGnud+IXwTsARq2pTXKC9ZH9fkA6Zm" +
       "6oicmjhmIZCFV4+cu/po15//cMXGNNdZWaD6a/JM\n5pWvXtrwoYsDcGoJ5o" +
       "xTZPzUxFEZP0kgjDzlcSbA/Vlj1XEfszn7Bnp7waAG0ISnbEiWQlFNFJTI\n" +
       "5Lcu1248mRk6YpmyzUUQmUzm2q+82HWjg5tga/S7YNP+rsoKxkyh/vFfPyOR" +
       "20Wig/0D3QP9PYPD\njFQza8XkQWtiZGhLhFk2qMCnj2sGyuPfMU1TOHvY8s" +
       "1Bl2/6+MIAvsbukOWDoz0jvYxUiVY/4hje\ntZXhcT62OxgnQfHdzcc9WDg8" +
       "uQjfwT6bBPHLC9WHsRtxij+9+IV/vfp8TYeVzMjTysWUQ0q0uHO0\niCspPr" +
       "x2bmAjfly2csN7TnuI1356//PXr7B3eKUW8AW17c1tNvABwQV9I29k6/0/OJ" +
       "/2kaoE2cF7\nLUFlDwhKBus4ATluTtiTUchR93px52OVz1geP1u92OZS60W2" +
       "whkG4+JyKoDZdnj2w9Nog1mjB8zK\nCM//KGfo5O9P5aEnoBsaA/uolPPmtJ" +
       "2Uc/mk7B8d9hSs5e/JQ6OX3732ffkjXpQ1vOscRw7b8gCf\ncSFFuaab2N+4" +
       "GmxbUuesbo5xtQcctYPDAyN3ogAGDnT3DfX0g9xt89OReMjZKyqLu/a+Dr3V" +
       "5i2i\nYbZ/SQPPve0cfjHEoSk1k3YvQr9RMTc1PomiR6yzBN+fKwrZbniabK" +
       "am0iFL4muGkUrod1XmDsqi\nKygjfGG+4K8DvXfIXwB1AwB1Ndxf3AbUJDoG" +
       "4cdJB0X2boUi4w55KUd0wrPTdsTO0o5YsR1RBF22\nK1SXK0a9rugfZWT69r" +
       "FzuHukpx+8GuSesI1AVVrBpnX8fhC+j89F5uenZvDzM3zP3MxP2sBYwM5W\n" +
       "Gzehpvbc7JLCL1hnP/+P4KPCayctzGsobkEx9wbPv0W7DgXFEn1vgGl6j0Kz" +
       "VCkAs1fbMX55czCo\n7nj7Xw4PXfiiF5l59+1G5mK2pHj5e5f+NPjWH8+AFQ" +
       "lSNTMbnxiPToHB7VuqS4r12Zb7ypflX3L0\nsEFy05WzmGmsGBprDAo3ZnW+" +
       "CCA7irq9u+Fps5OsrVS354rRTc63Wx5+ZyD4NEdFuOB6T7GYIaeh\nP8naF8" +
       "iXE//sld67d9KKaLP7hwk34XT/DdrZ+P6H1vlV3G+VOP08Sp5s+/Z7F6/ONV" +
       "lZYV3l79l0\nm3bzWNd5vpegjnm5dysNnPq1e/e+tD73zqLP9sEaQF9Ww99P" +
       "/NzeXgLnSlOpusIWtnnTDyrWtV/c\nt/HQ/lf1+l/xm0H+al4NjV4qoyjuU9" +
       "E19usGTcncjGrrjLQQ4tlb9DhF1z84CZwhD/IzloznGOm4\nlQzYOv5zs51j" +
       "pGULNuDAf26O83CTLs0B2WWP3PQvMLK9mB4Au/DhJn2RkXIgxeF3dDeEXnBB" +
       "6JDu\nIPr/cWX+rGDSfIxhJZLWFcyfJtdBGtepKGN7n3vhxxX3PfH7//B6d9" +
       "ATfxCCdiArQxsfHlcF5bTJ\nGyxcwzuymDHg/sc4MNrhrjUtidYPQC3ubiKv" +
       "q3P+RGxqU0Nx4I7cBQaGsaHoG4Ig4rFw+z8yQOdx\ndymH8U24+wvczoKt9n" +
       "80FkYD3RQAAA==");
}
