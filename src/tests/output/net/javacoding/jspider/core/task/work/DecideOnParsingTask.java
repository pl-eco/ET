package net.javacoding.jspider.core.task.work;

import net.javacoding.jspider.api.event.resource.ResourceIgnoredForParsingEvent;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Decision;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.URLUtil;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.Storage;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.WorkerTask;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class DecideOnParsingTask
extends net.javacoding.jspider.core.task.work.BaseWorkerTaskImpl
{

    protected java.net.URL
      url;
    
    public DecideOnParsingTask(net.javacoding.jspider.core.SpiderContext context,
                               java.net.URL url) {
        super(context,
              WorkerTask.
                WORKERTASK_THINKERTASK);
        this.
          url =
          url;
    }
    
    public void
      prepare(
      ) {
        
    }
    
    public void
      execute(
      ) {
        net.javacoding.jspider.core.storage.Storage storage =
          context.
            getStorage();
        net.javacoding.jspider.api.model.Decision parseDecision =
          context.
            getSiteParserRules(
            storage.
              getSiteDAO().
              find(
              URLUtil.
                getSiteURL(
                url))).
            applyRules(
            context,
            null,
            url);
        storage.
          getDecisionDAO().
          saveParseDecision(
          storage.
            getResourceDAO().
            getResource(
            url),
          parseDecision);
        if (parseDecision.
              getDecision() ==
              Decision.
                RULE_ACCEPT ||
              parseDecision.
                getDecision() ==
              Decision.
                RULE_DONTCARE) {
            context.
              getAgent().
              scheduleForParsing(
              url);
        } else {
            storage.
              getResourceDAO().
              setIgnoredForParsing(
              url);
            context.
              getEventDispatcher().
              dispatch(
              new net.javacoding.jspider.api.event.resource.ResourceIgnoredForParsingEvent(
                storage.
                  getResourceDAO().
                  getResource(
                  url)));
        }
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1358042240342L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwUxxWfO5/vfPYF4w+IExtsiJPGCr6zDXaB+6NxbSMO" +
       "DnzxmVCuji7r3Tmz\neG93szt3PihFrUoCSSUkFJK2EkmUqhVSFSVRUNI/Wp" +
       "WiJP1Gav1HkrZK1IooStUSpaqqoDYVfW9m\nz7e3d0AkWku7Ozfz3rw37+P3" +
       "3viFK6TRtkiPbEfZYZPa0Yl0SrJsqkxokm3PwlRWfrMxnDq3Wzf8\nxJckfl" +
       "VhpDUp2zFFYlJMVWKJyXjJIn2moR1e0Azm7FOzy/a7Pl36zYld3Q2kNUNaVT" +
       "3NJKbKE4bO\naIllSCRP8/PUsscVhSoZ0qZTqqSppUqaegQIDT1D2m11QZdY" +
       "waL2DLUNrYiE7XbBpBaXWZ5Mkohs\n6DazCjIzLJuR1clDUlGKFZiqxZKqze" +
       "JJEsypVFPsR8gx0pAkjTlNWgDCtcnyKWJ8x9gOnAfyZhXU\ntHKSTMssgUVV" +
       "B0v0ejlWTty/GwiANZSn7KCxIiqgSzBB2oVKmqQvxNLMUvUFIG00CiCFkTuv" +
       "uykQ\nNZmSvCgt0CwjXV66lFgCqjA3C7IwssZLxncCn93p8ZnLW9PByH+eSH" +
       "3Sx30eUKisof4hYFrvYZqh\nOWpRXaaC8WoheiZxoNDjJwSI13iIBc343T/c" +
       "l/zwQq+g6a5DMz1/iMosK3861rNuefz9cAOq0WQa\ntoqhUHVy7tWUsxIvmR" +
       "DNa1d2xMVoefGnMz878LUf0L/6SVOCBGVDK+T1BAlTXZlwxiEYJ1Wditnp\n" +
       "XM6mLEECGp8KGvw3mCOnahTNEYSxKbGDfFwyCSEheHzw3EPEXwRf4IFJKqsK" +
       "ndYxK8DXs5K9GDUZ\nieuUzWEgyIYC03OHbBPIrDnZsOgcA6K5JcNanKvLXU" +
       "KprUs+H6avN/k0iNSdhgZ7ZeVzl391dGr3\n4yeFKzH8HH0Z2QbyoxX5UUd+" +
       "FOVHUX4U5UfryCc+H5d8e7Wp0XcKptjfXomvPjVov+YnDRkSVvP5\nApPmNQ" +
       "qpKWmasUSVLOOx2ebKAx5+ELuReQhjkJPVYCOeNmDbokU2esO1kuQJGEkQg8" +
       "vHrv32o+zS\neYwsjIRO3F2oBn5dFLpFBtIP7Xr45MYGJFoKoMuAtP/mu2fl" +
       "j57Yc/6tX797byUtGOmvydZaTsw2\nr/opy5CpAmhW2f5b/9r58ZON2171kw" +
       "CkMIAYkyD0ABHWe2VUZV28jGBoLOBsyRlWXtJwqQw7zeyg\nZSxVZnj03MbH" +
       "q8EALfA0wtPhxC3OEVxsx1eHiDW0p+cMHB+vfiM49PaPW97kRilDaasLc9OU" +
       "icRs\nq7hj1qIU5t/9durJp66c+DL3heMMRoJmYV5T5RLX73Yf+L6jDkhEuz" +
       "rPPD1w9u2yszsqu49blnQY\nfV36+vK67/xcegYABBLZVo9Qnqd+LskPTF20" +
       "vOXUxB4BOwKkjp69/NjAn35/yQEyV4GsUP0le7zw\n2qMXlv1o4jCUKsneW8" +
       "4vXipx5OPlA9zIQx5nwtyezSKFh5nDuXVobBgUagdJWFqjqhJNGrKkJSaf\n" +
       "v9iyfLowtkuocpuLIDGZLfVe+v7AtT6ugiMx6MJK53eoKFl7K6mPnxFGJm8B" +
       "f7YPj23aPDw4CtuE\nZFHFubs6GRm4Eayk+XjCxREThtjuMsQIX9iMr/itqz" +
       "m6ZXAMzNxQsLSyihEeK6jnvplkOc7wvYmP\nBzH+eYwQrttGhwRhyAu2O7CT" +
       "KOdwfv4r/3z92eY+EZPI07OCMN3uUKviysqPHDm7eTm9XxUu9tZY\nD/GRn+" +
       "x79uol9h5PuApMoLQNpVoFH5RcCLb1rWJb8OXn8n4SypDVvE+SdPagpBUwHT" +
       "MQqvaEM5mE\nUHOvV3ctIgviKzDY44Uol1gvQFWqEIyrs6KCSavgWet8Sfnr" +
       "wiQf4WGc5Az9/P25FQQJm5bBQD+q\nlFyOdyJtxhVpQ56UE6aevH/bxfevvK" +
       "R+wtOqmTeL48jhKB3mM65cbzBMG9sSV1/s7NQ/bdpxLnYL\nI81c7PCWsbGt" +
       "jOy4lbDevGXT8MjI4PDIKCNNszsT6SgcEqWkxXmPQRtUeyxUxjEnaeehtoon" +
       "Ano0\nOqUX8u5FaBACM1Pjk7jrF3gF4Me4x0mFSrb0OJkCplx3vZaSt8Mnvv" +
       "T3yGPSGw+JKG+v7h1Q/Ohz\n79CB+yNynV4lzAxzUKNFqlVS0SttD2+1y1HX" +
       "ur/3zzvGzn3Vm4sI+z3uXKxmy8oXX7zwx9F3/nAc\ntMiQ0N7p9MR4cgoU7r" +
       "2huKzcVux+oOGg+gseNE5a1FwQqpni1cnQbFG43+izVSnRV1Wm74BnjeOl\n" +
       "NfXKtMtH10G0m8Id6B0yLWpKcNXy4FbKUvNQWIpOu/9q5h9Dygf3TQqPdrmv" +
       "kW7CnSPXaH/Hhx8L\nxKoulHXwziPk9PrvfXD+8kyniApx8bqr5u7j5hGXL3" +
       "6WiIlxueFGEjj1G/dteOHYzHvzfscG8xD9\nRQNvu0Gu7xDhplJrnNHlOKPr" +
       "/+SMo+AMWqIy3A3x5xIBROuoAwrYAnXV3MLFXVHeuPzwva+bbb/k\nneXKfa" +
       "4JGoVcQdPccOwaByEGcipXokmAs8DPRxm5+zPdHMCE+OHHOi54TzLSdzNeYM" +
       "OPm+2bjHTf\ngA048OPmOAXX+focYE9n5KY/zciqanqA68oPN+kZgFggxeFT" +
       "pruwPF0pLKPbzHKvsfWz3bK+KNl0\nPwzg2g5zibypYeB2ukA8bYLXsSEsff" +
       "dHgQdO/e7fHGjK3Rf+3wDKT1GFxi82rkvaYZvXclzDW5Vc\nsODGwDgiOw5u" +
       "scWO4v8E3e7qtSKrf/ZAaqpOAfv8/6qAQQMZwAJ2S/dRKHd31LMU195d1PAc" +
       "c47E\n/wIOsjfS/RIAAA==");
}
