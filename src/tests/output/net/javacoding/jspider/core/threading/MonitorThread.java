package net.javacoding.jspider.core.threading;

import net.javacoding.jspider.api.event.monitor.MonitorEvent;

import et.util.MyUtility;
import net.javacoding.jspider.core.dispatch.EventDispatcher;

import et.util.MyUtility;

abstract public class MonitorThread
extends java.lang.Thread
{

    protected net.javacoding.jspider.core.dispatch.EventDispatcher
      dispatcher;
    protected int
      interval;
    
    public MonitorThread(net.javacoding.jspider.core.dispatch.EventDispatcher dispatcher,
                         int interval,
                         java.lang.String subject) {
        super(subject +
              " monitor");
        this.
          setDaemon(
          true);
        this.
          dispatcher =
          dispatcher;
        this.
          interval =
          interval;
    }
    
    public void
      run(
      ) {
        net.javacoding.jspider.api.event.monitor.MonitorEvent event =
          null;
        while (true) {
            try {
                Thread.
                  sleep(
                  interval);
            }
            catch (java.lang.InterruptedException e) {
                Thread.
                  currentThread().
                  interrupt();
            }
            event =
              this.
                doMonitorTask();
            dispatcher.
              dispatch(
              event);
        }
    }
    
    abstract public net.javacoding.jspider.api.event.monitor.MonitorEvent
      doMonitorTask(
      );
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVYfWwcxRWf+/DZZ1/izxAXO7FjzIdFfOdv7FiisWxHueQS" +
       "Oz4TiOvoGO/O2Zvs\n7S67c+dLoFGr0oTyBy2CFqqmQVTQSAjRigj6R6umEd" +
       "DvSK3/ANoK1CoIUbVBVFVF1FKlb2Z27/b2\nLqYyJ+3e3Ox7897Oe7/fe3Mv" +
       "XkVVlonaJStKTxjEik4mZ7FpEXlSxZY1D1Mp6Y2q8Oz5/ZruR74E\n8isyRf" +
       "UJyYrJmOKYIsfiU+N5E3UaunpiWdWpvU7ZKrtu+WT1t2f2tQVQ/QKqV7QkxV" +
       "SRJnWNkjxd\nQJEMySwR05qQZSIvoEaNEDlJTAWrykkQ1LUF1GQpyxqmWZNY" +
       "c8TS1RwTbLKyBjG5TWcygSKSrlnU\nzEpUNy2KGhLHcA7HslRRYwnFouMJFE" +
       "orRJWtB9ApFEigqrSKl0HwpoTzFjG+YmwPmwfxWgXcNNNY\nIo5K8LiiwU50" +
       "eDUKb9y9HwRAtTpD6IpeMBXUMEygJuGSirXlWJKairYMolV6FqxQdPMNFwWh" +
       "GgNL\nx/EySVHU6pWbFY9AKsy3halQtMUrxleCmN3siZkrWjOhyH8fnf24k8" +
       "c8KBNJZf5Xg9J2j9IcSROT\naBIRitey0SfjR7LtfoRAeItHWMhM3PqjexIf" +
       "XOwQMm0VZGaWjhGJpqRPRtq3rU28Fw4wN2oM3VJY\nKpS8OY/qrP1kPG9ANt" +
       "9UWJE9jDoPfzb38yNfeoH8zY9q4igk6Wo2o8VRmGjypD2uhnFC0YiYnUmn\n" +
       "LULjKKjyqZDOf8N2pBWVsO0IwdjAdIWP8wZCqAEuH1zdSHzC7AZ4OaBrCuTi" +
       "/IpJsBw1KBrWCF1k\nKSDpMgR/8ZhlKDIxFyXdJIuUi7Fpj16eWapf9fkYZL" +
       "2AUyE79+oqrJKSzl/59UPT+7/2iAgfSznb\nR4oGwXK0aDlqW44yy9GC5WiJ" +
       "ZeTzcZtbSzeWRUpmgPr7y+MNj/Var/pRYAGFlUwmS/GSSgCIWFX1\nVSKnKM" +
       "/ERlfW82SDTI0sQdKCxZQKC3GQwE7mTNTlTc4ipOMwwpBxa6eu/+7D1OoFlk" +
       "cs7i1sdeEa\nRPG48C3Skzy67/5HugJMaDXIAgSi3Z++ekr68NEDF978zTt3" +
       "FEFAUXcZNss1Gba87s+aukRk4K7i\n8k/9e+9HT1SNveJHQQAsUBbFkGiA/+" +
       "1eGyUYG3f4im0WaNaldTODVfbIIZlaiKO+WpzhebOJj1mG\n1sFVBVeznaWb" +
       "2Y09bGK3ZpFlbD8978DZ8NpXQn1v/aTuDb4pDnHWuxg2SaiAYWMxHPMmITD/" +
       "ztOz\nT3zz6pkv8FjYwaAoZGSXVEXKc/+2+iD2zRUoIdra8uS3es6+5QS7ub" +
       "j6hGniEyzW+S+vbfv2L/B3\ngS4AtpZyknBUBrilACi1EmfJ6ckDgmQEJT10" +
       "9srpnj//4bJNW65yWJT6a+rh7KtfvbjmZ1schsKE\nrYMOsnhhZCMfLxYQRp" +
       "7ybCbM97NWgLef2pr9YyND4FATWGKFNKrI0YQuYTU+9eylurXHsyP7hCub\n" +
       "XALxqVS+4/LzPdc7uQu2xZCLGe3f1TlsHiyCnn0NUHT3hjhnV//QzoG7eocH" +
       "KaqVFQv4TlqBOs3W\nbKFoaD02ccSj0zmi0amiMpC+OxCzppIB93N2CXll4Z" +
       "998vt3TokNaHW3Jm7BvQPXSXfzBx/xRPSE\no0Kd8hh5fPtz71+4MtcisC2K" +
       "+S1l9dStIwo6j2LEyMM77FjPApd+/c4dL56ae3dJvElTKXtOa9nM\n8DNvk5" +
       "7dEakCTweg5QBs8Pca5tsdEyk05Uoh8WCQ3aY/S4BHxnpHIcDVVpZnuxPdBo" +
       "4xRtdR0aQ4\nGGX3nXzcy7iD4wtx77psEUbh3hK1h/VcDv9llh7812vnajsF" +
       "nplOO1/G782OEq2U9MDJs4NryXsV\nsafeKHuET/70nnPXLtN3RY4UKJZZ25" +
       "Evd/AwdrH/6Ju5xtAPn8n4UfUCauAdJdboYaxmGZUtAMyt\nSXsyATB1Py/t" +
       "7wSDjBdKSLs3zVxmveRezAkYlzJKkc8Zf/fYvI6cbxef+xCngMNcoZvfby+w" +
       "b9gw\ndQr+ETlfjnA75RZdKTfoYS2x41O7xy69d/UHysecmWp5dz3BNGzfw3" +
       "zGRZcB3bBYH+c6SNgrdc8Y\nloDZkGN2ZOiusQ2n92Dfzv6B3gEgwPr5vfFk" +
       "tPiKzMbRkpc+Bc1j+bsxj+ytRU087TYXgcFg7H4I\n0A3OTU9MscVHRSVl90" +
       "Ml0WqDK2IrRSpHS2G3+yiq4UePHOYN+N18wXx5IP0giJegEcESb6J6HBgW\n" +
       "kdpuoxTit+1GjT9nrTP3/SNyGr9+1G9DejeEgepGr0pyRC2i27vIAX7OcRK5" +
       "/t6Ov+wZOf/FSvBu\nd8O7VC0lXXrp4p+G3/7jwwDZBVR9cCY5OZGYhi3vWN" +
       "dcSmrMtR0KrCi/5AloI63sdFaqNF6Kr1qT\nwOFSmy9BWWdJ17QVri123LZU" +
       "6prY7bZ1SfJTGfRB4H4zq/Fnuwwh/3lIqpzOjt6iIPQhPp0vONcC\n1wBcXb" +
       "ZzXRVbuvK0YWPNnTAb9fo0RZtk3cEeto67+ePrLv4YLZasb2wc09CT9PUO98" +
       "GRvcTo7Van\nCKJTwYZv0J9gQ4kS1pVEM0LbOfDwVgUBFW4qsck6ztayvzjE" +
       "QVzqWrv/jteMxl/xRr5wWK6Bviyd\nVVU3g7vGIcMkaYVvT43gc7FXT1N06/" +
       "91RGOodMb8dZ8SC3yHorZ1FoBMYl9ujXOwjZU1oCWwR275\nZynaXCoPJFr8" +
       "4RZ9DpIZRNnwecOdEt93pcSAUaHhEPvO2KrFxchJg0gK65Lz3/tx8NBjv/8P" +
       "h3u1\nJP5GYn+dQEHJKdANxyY0rJ6weJFmz9hRU8qacIyinO7sMNRZYkXxV0" +
       "mbux4VbHXPH5mdLi9Jo5+x\nJPVDSQqykrTBUzkUq89V2hrurrskMcfTtq3/" +
       "AWdIkVDxEwAA");
}
