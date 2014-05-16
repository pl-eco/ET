package net.javacoding.jspider.core.task.impl;

import net.javacoding.jspider.api.event.monitor.MonitorEvent;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.monitor.SchedulerMonitorEvent;

import et.util.MyUtility;
import net.javacoding.jspider.core.dispatch.EventDispatcher;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.Scheduler;

import et.util.MyUtility;
import net.javacoding.jspider.core.threading.MonitorThread;

import et.util.MyUtility;

public class SchedulerMonitorThread
extends net.javacoding.jspider.core.threading.MonitorThread
{

    protected net.javacoding.jspider.core.task.Scheduler
      scheduler;
    
    public SchedulerMonitorThread(net.javacoding.jspider.core.task.Scheduler scheduler,
                                  net.javacoding.jspider.core.dispatch.EventDispatcher dispatcher,
                                  int interval) {
        super(dispatcher,
              interval,
              "Job Scheduler");
        this.
          scheduler =
          scheduler;
        this.
          start();
    }
    
    public net.javacoding.jspider.api.event.monitor.MonitorEvent
      doMonitorTask(
      ) {
        return new net.javacoding.jspider.api.event.monitor.SchedulerMonitorEvent(
          scheduler.
            getJobCount(),
          scheduler.
            getSpiderJobCount(),
          scheduler.
            getThinkerJobCount(),
          scheduler.
            getJobsDone(),
          scheduler.
            getSpiderJobsDone(),
          scheduler.
            getThinkerJobsDone(),
          scheduler.
            getBlockedCount(),
          scheduler.
            getAssignedCount());
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1YfWwcRxWfu7PvfPYljh3XNbUTO65Lahrv+SPn2jFCtWyn" +
       "ueQSX31uSg5H1/Xu\nnL3J3u52d+58CWkEIm1CkSJFTQuV0lYgUCRUASJq+Q" +
       "NEiNryHQn8R1tArUCpqiJIVYRQIygKb2Z2\n7/b2zg5Saml3xzPvzbx57/1+" +
       "b+Zeuo7qLRN1SZZAjhnYEqZSSdG0sDylipY1D10Z6fX6cPLiPk33\nI18C+R" +
       "WZoOaEZEVlkYhRRY7GpyeKJuoxdPXYkqoTe56qWXbd/fHKb0/v7Qyg5jRqVr" +
       "QUEYkiTeka\nwUWSRpEczi1i05qUZSynUYuGsZzCpiKqynEQ1LU0arWUJU0k" +
       "eRNbc9jS1QIVbLXyBjbZmk5nAkUk\nXbOImZeIbloEbUocEQtiNE8UNZpQLD" +
       "KRQMGsglXZegydRIEEqs+q4hIItiecXUTZjNHdtB/EGxUw\n08yKEnZU6o4q" +
       "Gnii26tR2nHfPhAA1VAOk2W9tFSdJkIHauUmqaK2FE0RU9GWQLRez8MqBN21" +
       "5qQg\n1GCI0lFxCWcI6vDKJfkQSIWZW6gKQXd4xdhMELO7PDFzRWs2GPnvU8" +
       "mPeljM62QsqdT+ECht9SjN\n4Sw2sSZhrngjL5yPH8p3+REC4Ts8wlxm8p4f" +
       "PZx4/3I3l+msITO7eARLJCN9PNq1ZXXy3XCAmtFg\n6JZCU6Fi5yyqSXtkom" +
       "hANreXZqSDgjP4s7mfH/rSd/Hf/KghjoKSruZzWhyFsSZP2e0QtBOKhnnv\n" +
       "bDZrYRJHdSrrCursf3BHVlExdUcQ2oZIllm7aCCEQvD44OlE/C9CX2BuSlrG" +
       "cl7F5n5dUyAp55dN\nLMqCQdDnNEwWaC5IugxZsHDEMhQZmwuSbuIFIlpHF5" +
       "ScoS6sNUGRrt284vNREHshqEK+7tFVmC4j\nXbz26xMz+756hgeUJqFtNUGf" +
       "BROEsgmCbYJATRCoCQI1QahtAvL52OJ3VvqcBlGmWPv7Dyc2nR2w\nXvGjQB" +
       "qFlVwuT8RFFQNGRVXVV7CcISxJW1yAYHkISRxZhHwGizIqTMTwA04umKjXm7" +
       "dltMehJUIy\nrp68+bsPMiuXaIrRlGijs3PTIMBHuW2R/tThvY+e6Q1QoZU6" +
       "GjsQ7bv17Bnpg6f2X3rjN2/fW8YH\nQX1VsK3WpLDzmp80dQk8a+Ly9F//95" +
       "4Pn64ff9mP6gDLwGZEhBwEatjqXaMCfhMOlVFngWZTVjdz\nokqHHP5pJMum" +
       "vlLuYQm0gbU3gQOa4KmHp81OYNqH6GArfW3m6Ub96dkDI8obXwkOvvmTpteZ" +
       "UxxO\nbXaRbwoTjtCWcjjmTYyh/+1vJJ9+5vrpL7BY2MEgKGjkF1VFKjL77v" +
       "RB7DfXYAuho+38s/0X3nSC\nvbk8+6RpisdorItfXt3y3C/E54FJANGWchwz" +
       "wAbYSgFQ6sDOlDNT+zn/cLY6ceHak/1//sNVm9Fc\nlbIs9dfMqfwrT1xe9V" +
       "MXh6FmidYBB2KsZtKWj9URCCNLedoTZv5s5CgeIrbm2ND4GBjUCivRGiso\n" +
       "spDQJVGNT3/zStPqufzoXm7KBpdAfDpT7L76nf6bPcwEe8WgizTt/0MF0TxQ" +
       "Rj/9DBP04O2x0K6h\n0R0jowOxGGzBcmRYzNoI+swt6SVVoRLl7tjlcsc4Gx" +
       "ihr4lPxNjY/QNjIwQ1yooFBA6CJWt3rmet\nIy7MFLBGpsvKUMXc6ZM0lRw4" +
       "vWDXxJfT/xyU37tvmoetw33WcgvuGb6J+za//yGDjyeJahRezyLn\ntn77vU" +
       "vX5to4I/HTyd1VBwS3Dj+hMGdHjCLsYdt6KzDp1+7b9tLJuXcW+U5aKzl/Rs" +
       "vnYi++hfsf\niEg1ykwAzlCAaLavmINo+t7B2gOUaRgaETOp1xahhO+tbLvp" +
       "4c1hy9ziF//16guNPRz9VKerxOUV\nUanQykiPHb8wspp6ROF78XrXI3z8pw" +
       "+/cOMqeYfHpkTIdLVtxWoDD4quWjH2RqEl+IMXc34USqNN\n7GgqauSgqOYp" +
       "8aWBFKwpuzMBoHaPVx4UOd9MlApOlze8rmW9paAcC2hX8k+Z/TfC02t/kfN1" +
       "sb8P\nMcI4yBT62Ht7iavDhqkTsA/LxSoasDG94ML0/R6K4w6ffmD8yrvXv6" +
       "98xGiskZ3SJ6mGbXqY9bi4\nNaAbFj0Pui4k9kx9s4bFs3snIJ0tOxQbHBsl" +
       "KH6bBDK8c8dwbHBgODZO0Mb5PfGUUNotXe6we/sn\n4ThavUtqm+1j1Mryby" +
       "OrWTTMDEfuQcBO3dzM5DSde4wVYLarT9v4KEOoy4YPeHbLWkd7BuPTn/9H\n" +
       "5EnxtcN+G2sPgsVENwZUXMBqGXbeSfazm4yTYc2PdP9l9+jFx2vhrsuNu0q1" +
       "jHTle5f/FHvrj6cA\nS2kUOjCbmppMzIALutddLiO1FDofCiwrv2SpYUOg6v" +
       "5VqTRRmfiNJobrozZfkf49FYef7fC0285v\nr3X4cbl+Dfa6JbXlCdog605W" +
       "Qb65MXKihJHhwcFy3Xv89uve8PCOoaGBEUja9orVt1s93C9ODYyt\nUQNFQx" +
       "EwrXxCjmsL9iysHCKAfXvtxemhrKPqBwJ+jZV6Vx+991Wj5VfsrFu6ajbA0S" +
       "WbV1U3bbna\nQcPEWYU5rIGTGPfeEwTd839dZwBT9MO2fIrrniGo51a6oEac" +
       "gNlqXyOocx010KAft8ZZcFRtDYJC\ndsstfw5oplIeCK38j1v0PNRZEKXNZw" +
       "x3Wj3rot5Rw4n0yLr7ZbGj3RXBpPTS5qK0lIElhZ5Oi9/6\ncd1DZ3//H4bP" +
       "kMR/2aG/ZgA3FxQ4hUYnNVE9ZrFyR8foFU/Km3B9IYyf7Ng2WXxG/utFp5va" +
       "S2v1\nzR9KztRg99gnyO6DEDrK7rd7RYYS8Kla/mJ7cBM93U3WXvR/L6oc8p" +
       "kTAAA=");
}
