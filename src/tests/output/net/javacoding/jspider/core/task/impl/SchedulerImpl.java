package net.javacoding.jspider.core.task.impl;

import net.javacoding.jspider.core.exception.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.work.DecideOnSpideringTask;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.util.*;

import et.util.MyUtility;

public class SchedulerImpl
  implements net.javacoding.jspider.core.task.Scheduler
{

    protected java.util.List
      fetchTasks;
    protected java.util.List
      thinkerTasks;
    protected java.util.Set
      assignedSpiderTasks;
    protected java.util.Set
      assignedThinkerTasks;
    protected int
      spiderTasksDone;
    protected int
      thinkerTasksDone;
    protected java.util.Map
      blocked;
    int
      blockedCount =
      0;
    
    public int
      getBlockedCount(
      ) {
        return blockedCount;
    }
    
    public int
      getAssignedCount(
      ) {
        return assignedSpiderTasks.
                 size() +
          assignedThinkerTasks.
            size();
    }
    
    public int
      getJobCount(
      ) {
        return this.
                 getThinkerJobCount() +
          this.
            getSpiderJobCount();
    }
    
    public int
      getThinkerJobCount(
      ) {
        return thinkerTasksDone +
          assignedThinkerTasks.
            size() +
          thinkerTasks.
            size();
    }
    
    public int
      getSpiderJobCount(
      ) {
        return spiderTasksDone +
          assignedSpiderTasks.
            size() +
          fetchTasks.
            size();
    }
    
    public int
      getJobsDone(
      ) {
        return this.
                 getSpiderJobsDone() +
          this.
            getThinkerJobsDone();
    }
    
    public int
      getSpiderJobsDone(
      ) {
        return spiderTasksDone;
    }
    
    public int
      getThinkerJobsDone(
      ) {
        return thinkerTasksDone;
    }
    
    public SchedulerImpl() {
        super();
        fetchTasks =
          new java.util.ArrayList(
            );
        thinkerTasks =
          new java.util.ArrayList(
            );
        assignedThinkerTasks =
          new java.util.HashSet(
            );
        assignedSpiderTasks =
          new java.util.HashSet(
            );
        blocked =
          new java.util.HashMap(
            );
    }
    
    public void
      block(
      java.net.URL siteURL,
      net.javacoding.jspider.core.task.work.DecideOnSpideringTask task) {
        java.util.ArrayList al =
          (java.util.ArrayList)
            blocked.
              get(
              siteURL);
        if (al ==
              null) {
            al =
              new java.util.ArrayList(
                );
            blocked.
              put(
              siteURL,
              al);
        }
        int before =
          al.
            size();
        al.
          add(
          task);
        int after =
          al.
            size();
        int diff =
          after -
          before;
        blockedCount +=
          diff;
    }
    
    public DecideOnSpideringTask[]
      unblock(
      java.net.URL siteURL) {
        java.util.ArrayList al =
          (java.util.ArrayList)
            blocked.
              remove(
              siteURL);
        if (al ==
              null) {
            return new net.javacoding.jspider.core.task.work.DecideOnSpideringTask[0];
        } else {
            blockedCount -=
              al.
                size();
            return (DecideOnSpideringTask[])
                     al.
                       toArray(
                       new net.javacoding.jspider.core.task.work.DecideOnSpideringTask[al.
                                                                                         size()]);
        }
    }
    
    public synchronized void
      schedule(
      net.javacoding.jspider.core.task.WorkerTask task) {
        if (task.
              getType() ==
              WorkerTask.
                WORKERTASK_SPIDERTASK) {
            fetchTasks.
              add(
              task);
        } else {
            thinkerTasks.
              add(
              task);
        }
    }
    
    public synchronized void
      flagDone(
      net.javacoding.jspider.core.task.WorkerTask task) {
        if (task.
              getType() ==
              WorkerTask.
                WORKERTASK_THINKERTASK) {
            assignedThinkerTasks.
              remove(
              task);
            thinkerTasksDone++;
        } else {
            assignedSpiderTasks.
              remove(
              task);
            spiderTasksDone++;
        }
    }
    
    public synchronized net.javacoding.jspider.core.task.WorkerTask
      getThinkerTask(
      )
          throws net.javacoding.jspider.core.exception.TaskAssignmentException {
        if (thinkerTasks.
              size() >
              0) {
            net.javacoding.jspider.core.task.WorkerTask task =
              (net.javacoding.jspider.core.task.WorkerTask)
                thinkerTasks.
                  remove(
                  0);
            assignedThinkerTasks.
              add(
              task);
            return task;
        }
        if (this.
              allTasksDone()) {
            throw new net.javacoding.jspider.core.exception.SpideringDoneException(
              );
        } else {
            throw new net.javacoding.jspider.core.exception.NoSuitableItemFoundException(
              );
        }
    }
    
    public synchronized net.javacoding.jspider.core.task.WorkerTask
      getFethTask(
      )
          throws net.javacoding.jspider.core.exception.TaskAssignmentException {
        if (fetchTasks.
              size() >
              0) {
            net.javacoding.jspider.core.task.WorkerTask task =
              (net.javacoding.jspider.core.task.WorkerTask)
                fetchTasks.
                  remove(
                  0);
            assignedSpiderTasks.
              add(
              task);
            return task;
        }
        if (this.
              allTasksDone()) {
            throw new net.javacoding.jspider.core.exception.SpideringDoneException(
              );
        } else {
            throw new net.javacoding.jspider.core.exception.NoSuitableItemFoundException(
              );
        }
    }
    
    public synchronized boolean
      allTasksDone(
      ) {
        return fetchTasks.
                 size() ==
          0 &&
          thinkerTasks.
            size() ==
          0 &&
          assignedSpiderTasks.
            size() ==
          0 &&
          assignedThinkerTasks.
            size() ==
          0 &&
          blocked.
            size() ==
          0;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1360121350008L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAMVae2wcxRmfO78fwY+YJMRO4iQGErDPPt+d4+CUxthO4+SS" +
       "GNuBYgzHem9sb7y3\nu+zO2ZdAQ0t5lT8iIUgfagp9CoFQHyBoJaqmiEefkV" +
       "qrAloEBUEpVQkCVQhKqeg3s7O3s3tnH9h1\na2nu1rPfzPfN73vOzD10FpVY" +
       "JmqSrRA5amAr1DcyJJkWTvapkmWNQldCfrqkYuj+/ZoeRIE4CipJ\ngmrist" +
       "WelIjUriTbB/t7MiZqNnT16JSqEz5PziyXbP1w7re372ssQjVjqEbRRohEFL" +
       "lP1wjOkDFU\nncKpCWxavckkTo6hOg3j5Ag2FUlVjgGhro2hekuZ0iSSNrE1" +
       "jC1dnaWE9VbawCbj6XTGUbWsaxYx\n0zLRTYug2vgRaVZqTxNFbY8rFumJo9" +
       "JJBatJ63p0HBXFUcmkKk0B4Zq4s4p2NmP7HtoP5JUKiGlO\nSjJ2hhTPKBog" +
       "sck/Irvilv1AAEPLUphM61lWxZoEHajeFkmVtKn2EWIq2hSQluhp4ELQ+gUn" +
       "BaJy\nQ5JnpCmcIGidn27IfgVUFQwWOoSgc/1kbCbQ2XqfzgRtHSqt/vedQ+" +
       "81M50XJ7GsUvnLYNBG36Bh\nPIlNrMnYHvh+OnTP4FXppiBCQHyuj9im6T3/" +
       "x4fjb5zeZNM05qE5NHEEyyQhf9jVtGG+97WKIipG\nuaFbCjUFz8qZVof4m5" +
       "6MAda8JjsjfRlyXv58+JmrPv8g/nsQlQ+iUllX0yltEFVgLdnHn8vgOa5o\n" +
       "2O49NDlpYTKIilXWVaqz/wGOSUXFFI5SeDYkMs2eMwZCqAxaANozyP6rox/g" +
       "LyPyNE6mVWwOpgw1\nZBAU0zAZpyYg60lQ/vgRy1CS2ByXdROPE8maGVeAct" +
       "w3LkM51cwFAtRl/Q6ngnXu1VWYJSHf/+qv\nbxzY/6U7bPVRk+MyEhQBziGX" +
       "c4hzDlHOIco5RDmHPJxRIMB4rvUCSzWVpA715sM9tSfarMeCqGgM\nVSipVJ" +
       "pIEyoGR5RUVZ/DyQRhllgnWD0zNrDU6gkwWhAkocJEzEkAyVkTbfEbp+vSg/" +
       "AkgcXNH//o\nd28l5h6hdkT13kBnt0UDLc7YslVvH7lm33V3bCmiRHPFVEFA" +
       "2lJ49oT81p0HHnn2Ny9uc52AoJYc\n38wdSX3LL/6QqcsAqInd6b/ywd637y" +
       "7Z+WgQFYPDQsgiEhga+P9GPw+Pj/U48YqCBSOrJnUzJan0\nlRNkKsm0qc+5" +
       "PcxuVrHnWgCgCloJtIPcSvfSD/qynn6stq2M4ulbA4uG73+xtOO5n1Y9zUBx" +
       "AmeN\nEGFHMLHdsM5Vx6iJMfS/+NWhu0+evf1qpguuDIJKjfSEqsgZJt/aAO" +
       "h+dZ6QEFrXcM+Xt596zlH2\nanf2XtOUjlJdZ74wv+Frv5C+AeEC3NZSjmHm" +
       "lYhxQg4D+tnKntuEl/T/LZyE2p/fv/bQhOEoLzVx\nw7tP3lvZbAtDxzSxac" +
       "pBsEbsDBnoO+AZlZCvP3YqMj9ypWJHPn8o9REf+9nhe98/Q15iSLv2Qblt\n" +
       "zuQKeIUkmG73s7N1pT+8LxVEZWOolqVDSSNXSGqa6mEMEprVxzvjaJXnvTc5" +
       "2ZG4J2v/TX7bFNj6\nLdMNPPBMqelzhc8Yz4G2EVoDN8YGnzEGkEEfLmEDWt" +
       "jnhVnTqTBMnYB8OJkhqHISE3l6FEKYBWpY\nJ6rBXoWdfW489ept21/+4xme" +
       "oYTKx6X6W+KW9GO3np4PUm+qgBpEsg66a4EaiD4FWF0AGkl411Zp\nx+nLQC" +
       "I2MhyOdIRBonpgRYumkJLkqu7fvfOJ187+QHmP8alkNUkvHcIZVbAegXORbl" +
       "g0+wnlF5+p\n5ZBh0bizSmAy2J/IbDrzve0fNbP5udilQibl/5fNSuZBMUlw" +
       "wbvCkW6CPr2kXHVJeEdHa7irrbML\nwsPo3sGRkKseyqfPo7DjkLVz4aGL4m" +
       "aB6pm6zmFeTy0zNKClU+JLELt4eKC3n83eQDgpzwZ2aqlh\n72Ie22uGtpZP" +
       "sza/7Q3Tj10EVZNpmlZM28Ro525b1YdFVXeyN/0CiNHOZYAYZiCCGuoYiKII" +
       "lM8V\nPrFo30H6MbTQgi+Atp4veH3+BY/zBa+GFA01N1TiTNicdSfEdUdy17" +
       "1jGevupOuOxMDa2brzSELZ\nXZdfSIaCYwirXEOA2LcQLBdCa+SwNOaHZZrD" +
       "0uBwHF3AHmZEXKI5uMSWYw8Rhgs41XkeXEZ9NqAu\nIGbWPiYXAmILtA0ciA" +
       "35gTA5EDWWC3m/rmF/9hsylRTEmVm+N3h07B8dydcv7rcj7zpxzykS7u38\n" +
       "CLesfuNtO+95g2+erOljctfG777+yKvDDXbRZu/StuZslMQx9k6NKa7ayMAa" +
       "Ni/GgVE/dfHmh44P\nvzRhr6TeWxbTwBS773m8fXe1nKcAL4K9JBQ9bF2xhZ" +
       "SwlWdF5HznKuEmroRa0f2pFmj/0YUmXs9D\nHnK+cye+mU9cNqHqMlTRomXf" +
       "Klp2LNeyl+PxURbpIhDQmGVz7pTFba4wC3n2AcnIt2RaJ5zHjRo5\n37lLPp" +
       "FbXSCoKKo50z49rREXVobEBbxUdKvJJr67EOA6KcLVYThyX1RwD5ZFh9rjho" +
       "X26cwWb//s\nO9W3SU9dE+RF7A1QFhHdaFPxLFbdetY/yQF2LOGUbjVXbnpl" +
       "T9f9n/MXtHQb0CS6tHdYQn7i+6df\niD3/p1vA0MdQ2cFDI3298QHwiU2Lsk" +
       "vIdbONlxdNK79klQmvLXMOU7yDerwVZaWJSdrURj21V7Nn\nk7MZWgvXfEu+" +
       "TY6gyAW2BQX3DN+BMDiFyWV+S0GM+pseeaj1bePybFsheR6EiADy9PLYv7hA" +
       "TdBa\nuUCtKyTQjwiqAoH26ROLy0JDXgeXpWOFZPkJbG5AFp4QC4pE9RXlIk" +
       "VXSKTTUNmBSHbxUlAiqrBu\nLlH3Ckn0TFZhbjpZCJ1dXJZdKyTLGR86i0tE" +
       "TWg3l2j3Ckn0B78JLS7SpdCGuEhDn0ykIOMaFPPJ\nn4V8EvbvKeO6LKmD/d" +
       "96omr+rnTXPicf7KEfLxN06dLycndHa2dnWwTSchnsGfHh4biTxapZ9qWp\n" +
       "zOnkUv5VlNLeDr1CP95YjhCRWFtXGLZ4xKliQYKegnl0TjdnQv1Yhu5Dmm1F" +
       "QEhLpcKafoGgElYA\nsLdpwx5xDGSY1ektiF3CdeTT+g5o13KtX/vJtB7IrS" +
       "L+KeK5w8XzgyXjuTPaGo20xaKuUul8fymM\nybswIq3ZqJioQSjh2SEcTca3" +
       "zO0/u63pva8HUXCRs5M81w/ZGRLyw0Ut7wQfX9PCjkaLJyTLTvH+\ne5vcax" +
       "nPbQuTuMqjmOZFFCNAHigRIe9iNeKbhmEIvZGdWUUEypajiHC4LQbb3FoO64" +
       "VWs13Y+O1q\nHbQuaCoXX81nV7l1bJA+bwdvtY5q8rSpa8oxnMyv6FzTC9QL" +
       "K+6MuCtevfQ6v6O7NdLdFov4fPni\ngr58Jfiyvc0paKeBKoLKLc6Zvn9nIT" +
       "QzHM3MJ0GTcqj52BhuETGMuhhuXTqGnR0eDOlsawuD0gSg\n0PNZJ2HlBSUC" +
       "7WYOys3/JVAWTa55EOsUEevKbps+tZiJ4IyMDXqmGaIWYpe/KayRAaefzXwR" +
       "Qee4\n2Tt7IsL57hD5xlxNLeMQNALpM9oWg8y11ss36+dMefk0QYvgk1wTJ/" +
       "9PmugXI14njYOBKHuxyy4S\n90C49aP4GXFM2EVx79JRjO6kKEZBDw0C08IQ" +
       "hqA9wCF84H8BoehuccLuP93Tseu9ZUTZhK6rWNKc\nSiJMjxxWedZOL7rW5f" +
       "yywr7/l7fMX7ftSaPuV3aSdO7oy+Pg5GlVFe9ehOdSw8STClt8uX0TYyvt\n" +
       "aoLO/1g3wxBy6BddRGDMHnstQc2FxgrR3hkmEdS4yDAYQb/EEVB0rck/AtDk" +
       "TyL9FHi7lx5M0/1H\nJD1CUJHGTocDM9mAU+veNth3Qxle9Dgl94gBpSUtuj" +
       "Pffrz48hO//xc7ziiT7V+10F9yyFb7rAI1\nVnuvJqlHLXbtRt/Rm285bZoQ" +
       "odhxDldPlWXPaP9yo1G86Mnyahm9amjAPq/cI569dS337C0MMxTT\ns7cl/k" +
       "zguInOywcOE5h7IbuqoaIf4Lz+A1d0jjKCJAAA");
}
