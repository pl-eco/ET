package net.javacoding.jspider.core.threading;

import net.javacoding.jspider.core.task.DispatcherTask;

import et.util.MyUtility;

class DispatcherThread
extends java.lang.Thread
{

    protected net.javacoding.jspider.core.task.DispatcherTask
      task;
    protected net.javacoding.jspider.core.threading.WorkerThreadPool
      pool;
    
    public DispatcherThread(java.lang.ThreadGroup group,
                            java.lang.String name,
                            net.javacoding.jspider.core.threading.WorkerThreadPool pool) {
        super(group,
              name);
        this.
          pool =
          pool;
    }
    
    public void
      assign(
      net.javacoding.jspider.core.task.DispatcherTask task) {
        this.
          task =
          task;
        this.
          run();
    }
    
    public void
      run(
      ) {
        synchronized (task)  {
            task.
              execute();
            task.
              notify();
        }
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1358030870775L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1YfWwcxRWfu7PPPtuJP+IkLnZix5gWK/adff7AxP/kajvN" +
       "JRf78DmkOYKO9e6c\nvfHe7rI7d76k1KKCksAfSCi0BSlAqagiIQpVI+gfrZ" +
       "pGQL8jtf4DaCtQqyBE1QZRVRVRS5W+mdm9\n3ds7DE1qaddzM+9r5r33e2/2" +
       "hSuo1jRQl2iGyQkdm+GpVFIwTCxNKYJpLsBURny9NpQ8d1DV/MiX\nQH5ZIq" +
       "g5IZoRSSBCRJYi8enJooF6dE05saRoxJJTIWXPzR+v/ubUgc4Aak6jZllNEY" +
       "HI4pSmElwk\nadSUw7lFbJgxScJSGrWqGEspbMiCIp8EQk1NozZTXlIFkjew" +
       "OY9NTSlQwjYzr2OD6bQnE6hJ1FST\nGHmRaIZJUEviuFAQInkiK5GEbJLJBA" +
       "pmZaxI5r1oDQUSqDarCEtAuC1h7yLCJEb20Xkgb5DBTCMr\niNhmqVmRVTiJ" +
       "bi9Hacd9B4EAWOtymCxrJVU1qgATqI2bpAjqUiRFDFldAtJaLQ9aCLrpE4UC" +
       "Ub0u\niCvCEs4Q1OGlS/IloAqxY6EsBG31kjFJ4LObPD5zeWsu2PSfR5If9T" +
       "Cf10hYVKj9dcC008M0j7PY\nwKqIOePVfPjx+NF8lx8hIN7qIeY0sVt+eDjx" +
       "/oVuTtNZhWZu8TgWSUb8eLxrx3rs3VCAmlGva6ZM\nQ6Fs58yrSWtlsqhDNG" +
       "8rSaSLYXvxp/M/O3r/8/ivflQfR0FRU/I5NY5CWJWmrHEdjBOyivnsXDZr\n" +
       "YhJHNQqbCmrsNxxHVlYwPY4gjHWBLLNxUUf8zwdPnzXeRF/g7WnZBEJxGVyy" +
       "bGBBCusETaiYHKNR\nIGoS+P/YcVOXJWwcEzUDHyOMjE5XshapvuZVn48mrj" +
       "ftFIjR/ZoCgjLiucu/um/m4MOnuRNp4FmW\nEjQOysOO8rClPEyVh0vKw17l" +
       "yOdjareXnzB1mUQz628/mGx5dNB8xY8CaRSSc7k8ERYVDBkpKIq2\niqUMYS" +
       "HZ6gp/FnUQsk2LEL2gNKOAIJYtcKQFA/V6o9TJ7TiMBAi99bVrv/0gs3qeBh" +
       "QNgHYqnZsG\n7lzhtjX1p+4+cM/p3gAlWq2hngLSvk+XnhE/eOTQ+Td+/fat" +
       "TjYQ1FeRpJWcNMm85icNTcQSgJgj\n/lv/2v/hmdrbX/ajGshcwC4iQMQBEO" +
       "z06ihLtkkbuOhhAWdjVjNygkKXbLRpAFdqq84MC51NbNwC\nB9AITy08W61w" +
       "baMvuthGX1t4oNHz9OyBweLVB4JDb/648XV2KDaCNrugNoUJz8dWxx0LBsYw" +
       "//YT\nyTPfuHLqLuYLyxkEBfX8oiKLRWbfdh/4fksVbAh3tD/+zf6zb9rO3u" +
       "JIjxmGcIL6uvi19R1P/lx4\nCnAD8teUT2KWngGmKQBMHdgWOTN1iKMNx6b7" +
       "zl5+qP9Pv79k4ZerLjpUf8k8mH/l6xfW/fSIQ1Ch\nBHPWTi5WIenIx6oGuJ" +
       "GFPJ0JsfNs4Pk7TCzO6FB0BAxqA020ooZlKZzQREGJTz97sXH9sfz4AW7K\n" +
       "JhdBfDpT7L703f5rPcwES2PQBZHW77qCYMw6eU//RQmKXS/y7BmeGIhODI6O" +
       "EVS7ZGh5nXmqHUoM\n8wFN5zCn/VJpNcL3u8e131G2MEJfkzdozehtg2MThI" +
       "ObbUyLYwwvrW47Yi47xhw7vniDdowPDU6A\nS2t0TVNsOz4jxh7RjBVbWBLY" +
       "7fCn7wE2HqRpyUIXsT30WiQUHb0FYB/ta2xoyS1+5Z+vPt3Qw1OF\n8nQxMX" +
       "4IuE53BpRxZcR7T54dWU8dkXnkeSu+h/jkTw4/ffUSeYfhgINeVNuuYqWBdw" +
       "ouYJ14o9Aa\n/P4zOT+qS6MW1rUJKrlTUPIUJdKQQeaUNZmADHCvl/dQPDkn" +
       "S+jc5UVOl1ovbjqVEcblyepA5WZ4\neuFptqCy2QOVPsSyK8UY+tj7CyVgC+" +
       "mGRsA+LBUhRohgrrhD8qgrJIc9UMDPenrv7RffvfKS/BFL\n9wbWu8Yoh2V1" +
       "iM24MCig6SbtklxtuiWpb043J5naUVvt6NDI6I2E/8jwwHB0cHgc5C3sj6fC" +
       "dH9U\nQdra6xp0ZJVbooYgp+5ApGx28nZGzefci9Cx1MzPxKbt1IpsmFqg09" +
       "25WOY0M+bZMo/SPq3F0tNS\n3aOsuzvsTm3LbSsut0XZwl3OiUZHCNp73Sca" +
       "HRqYGBy+zT5QqpnKVywr1uiPRYLqjszHFxZmZunP\nfWyLxcrwQzZYOHjSZS" +
       "8YaMcnXQHY9eXUl//e9JDw2t0cB9rKmz7qo7Fn3sL9e5vEKh1miGj6oIIL\n" +
       "WHHAyqvtELsa2XnZfKT7z/vGz321Glp1udGqnC0jXnzxwh/H3vrDg2BFGtXN" +
       "zqWmYokZMLh7Q3UZ\nsbXQeUdgWf4FyyoLOCoudOVMk+Vw0WBguI+qC2Wg0V" +
       "PWX+2GZ7sVYtur9Vf09fmqmO+zulRX0J1y\nBd24U75O30j+RkcGoiODo1Er" +
       "Xam87KcXoQegX4NYgSu5t5gkDTkHTUjBuhG+nP7HkPTe7mkeRB3u\nLw1uwv" +
       "3Ra7hvy/sf8jJS3lRVKUIeJY/tfO6985fn23kg8rv5zRXXYzcPv5+zrTTpNB" +
       "V2baSBUb+2\ne9cLa/PvLPqtIzgBJ1bQ6AeRILN3CLGTur/M/7S37rL83/W/" +
       "+R+VJfAGvniCoICRZ03fGQQlpsXr\nZdond1R8oeHfEcTe9XtufVVv/SW7fp" +
       "Tu+vXQTWbziuIujq5xUDdwVmba63mp5AH6LEG3fKa+hyKE\nPWab+jYX8BxB" +
       "nRsIgCOn/9wc5wjaVp0DINIauemfJ2hzOT1BDc4PN+n34GCBlA5fLGtnX3Ll" +
       "4VCp\nDW7xtsE0rtpdtS+lY1GmvX3xOz+quePR3/2bQU+dyL+C0S8/ULELMv" +
       "TwkZgqKCdM1v/QNXpBFvMG\nXP4Iw2jLDY0ml8i/9HS6C35JV9/C0eRMZc0f" +
       "+T/UfIoZtERd/xcFaA4+V+2AmNHuFoCaL1rq/guO\nL/3OthQAAA==");
}
