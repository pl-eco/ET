package net.javacoding.jspider.core.util.config;

import net.javacoding.jspider.core.util.config.properties.PropertiesConfiguration;

import et.util.MyUtility;

public class ConfigurationFactory
{

    final public static java.lang.String
      CONFIG_DEFAULT =
      "default";
    final public static java.lang.String
      CONFIG_UNITTEST =
      "unittest";
    final public static java.lang.String
      CONFIG_TOOL =
      "tool";
    protected static net.javacoding.jspider.core.util.config.JSpiderConfiguration
      instance;
    
    public static synchronized net.javacoding.jspider.core.util.config.JSpiderConfiguration
      getConfiguration(
      ) {
        if (instance ==
              null) {
            instance =
              new net.javacoding.jspider.core.util.config.properties.PropertiesConfiguration(
                );
        }
        return instance;
    }
    
    public static synchronized net.javacoding.jspider.core.util.config.JSpiderConfiguration
      getConfiguration(
      java.lang.String configuration) {
        if (instance ==
              null) {
            instance =
              new net.javacoding.jspider.core.util.config.properties.PropertiesConfiguration(
                configuration);
        }
        return instance;
    }
    
    public static synchronized net.javacoding.jspider.core.util.config.JSpiderConfiguration
      setConfiguration(
      net.javacoding.jspider.core.util.config.JSpiderConfiguration configuration) {
        instance =
          configuration;
        return instance;
    }
    
    public static synchronized void
      cleanConfiguration(
      ) {
        instance =
          null;
    }
    
    public ConfigurationFactory() {
        super();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYC2wcRxmeO9tnn32JH3ESUzuxkxhqE/v8iu04LqWWH7GT" +
       "8yM+u2lcR9f17py9\n8d7udnfOPodiFbU0pRJFVcqjKLQqAiKh8BAhRUiIEL" +
       "Xl2UiVkdIWSAVKVRVBqiKEGqGi8M/s7u3j\nzg/kcNLuzs3+/8w383//Y/bC" +
       "TZSna6iK18NkScV6uDc6xmk6FnolTtcnoCvGv5oXHDt/VFb8yBdB\nflEgqD" +
       "jC600CR7gmUWga6utOaahGVaSlWUkh5jgZoxza99Hia2eOVOag4ilULMpRwh" +
       "GR71VkglNk\nCoUSODGDNb1HELAwhUpljIUo1kROEk+DoCJPoTJdnJU5ktSw" +
       "Po51RVqggmV6UsUam9PqjKAQr8g6\n0ZI8UTSdoJLIKW6Ba0oSUWqKiDrpjq" +
       "BAXMSSoD+MllFOBOXFJW4WBHdErFU0sRGbBmg/iBeKAFOL\nczy2VHLnRRl2" +
       "otqrkV5x7VEQANX8BCZzSnqqXJmDDlRmQJI4ebYpSjRRngXRPCUJsxB016qD" +
       "glCB\nyvHz3CyOEVThlRszXoFUkG0LVSFou1eMjQQ2u8tjM4e1RgOh/zw19m" +
       "ENs3mugHmJ4s8Hpd0epXEc\nxxqWeWwo3kqGnx06kazyIwTC2z3ChkzPx38y" +
       "GXnvcrUhU5lFZnTmFOZJjP+oo2rXSs87wRwKo0BV\ndJFSwbVyZtUx8013Sg" +
       "U270iPSF+GrZe/GP/liUe/i//mRwVDKMArUjIhD6EgloVes50P7YgoY6N3\n" +
       "NB7XMRlCuRLrCijsP2xHXJQw3Y4AtFWOzLF2SkUI5cPlg6sOGb8CegNeAc3j" +
       "4mxSY0we4Cgvl8Iq\nQffKmExTJvCKAByYPqWrooC1aV7R8DQFDy2qOZ19gB" +
       "SduXjR56Mu7HVACdg6qEgwXIw/f+O3j/Qf\n/cKThjkpBU3MBN0DEMI2hLAJ" +
       "IUwhGPtnQAhng4B8Pjb5TveOUxMK1NP+/qPukqcb9Zf8KGcKBcVE\nIkm4GQ" +
       "mDh3KSpCxiIUYYRUsd7sBYCBQOzQCbAVFMgoGY98AWL2hor5e1tq8PQYsDKq" +
       "4s3379/dji\nRUowSohyOroBDcw7b2AL1UdPHnnoyb05VGgxl1oORGvXHz3G" +
       "v//U8MVrv7teZ3sHQbUZTpupSZ3O\nC39MU3gsQFCzh//qvwc/OJvXdcmPcs" +
       "GTYfsJBwyEwLDbO4fL+bqtQEY3CzSL4oqW4CT6yoo+hWRO\nUxbtHkagLfRW" +
       "anCJbpYHIIuBtx4LNL/xs6JX2YqtcFnsiKtRTAznK7X3ekLDGPqvf23s7Jdv" +
       "nnmQ\nbbS50wQF1OSMJPIpBmSnDwy7LUsgCFeUP/uV+nNvWJbcZo/eo2ncEj" +
       "Vk6nMru577FfcNCBLgrLp4\nGjNfRGwmZE1A7/tZu8Hxkv7fa4pQcnm9aICm" +
       "CcsyiZnP/Ovl5wtrDDBUp4oNkwvAKrGl0t877NKK\n8Q+fPte2Ej0uGvHOG0" +
       "A9wqd/Pvn8ravkbbbTtvHpbHtSmQDv5xy8PHhtoTTwwxcSfpQ/hUpYEuRk\n" +
       "cj8nJakdpiCN6b1mZwRtcb13pyQj/nanyV3lJZ5jWi/t7PACbSpN20GDaUym" +
       "BLasAq5DcBWagZI9\n6csyetuW8gFD8gUc55IS8/0uprmP3T9hcCiHwLyizL" +
       "HMVAeE0llFkSJoa+/oyMDQ4Vhf/0DPZGQC\nrFPhtI6xOCMVPXLuxhP1f37r" +
       "qpmuHGWQLfXX2OPJlz5/ecVPPSgIBQmnj9hLhIKItnysSABDxdxL\nLjSCdC" +
       "8sh2m2tgOcMpiHlk9hUTDN33df15V3bv5A/JBNUsiqkx4qb84SZD2OaXMUVa" +
       "d50FGImSPV\njqo6DTRbHJMM9cVS1Ve/XX+7ho1vYg44cqr5P3+B00ac6SFo" +
       "ou5qI2hyo9lK1RRalIlYnx5LN135\nI6weam1paGlvbG8mSNhMCgq7jX23Xk" +
       "M4bRaTGs8LuqK+DG4sQ7WQaQy6hSYxURljxlYWd6hvhPvl\nZML5EjYpd7y/" +
       "p4+ZqhyqTVvUqOyMwErvB1z8vweuInOgoiz8L0jKIiHYSH7RLA5A2/cy9tPb" +
       "p4H5\nxebqJkeGJib6oxNMvMeg4Ik0BTtU+v/YargOwBUycYWy4MolisKc7s" +
       "ENYSoyMU2MjkaceLg0ns7V\n8WyHqw2urSaerV48iOnymUj8wF3gIQEnxoKF" +
       "pUA0g5YTiJgGcpB196dZ39XcStDA5mq0Q22dDQcb\nWzoIemBTNLeQOwhudV" +
       "HQpxyLW6Ydw7Cq4+OUBiMWMzdc6h2JshcuHMw6qcx9Zom1zkqhdpatstKv\n" +
       "hnatds5gZ6QzD/wj9AT3ykkjBJe5K0nqbO0vvInr7wvxWYrXIFHURgkvYMlO" +
       "4d7Zhtn5y8pWxcer\n/zLQcf6z2XJ4lTNLuNVi/JXvX/5j+5t/eBxQTKH8kd" +
       "Fob0+kHwBXrzldjC9dqDyWMyf+mgVeM51m\nnBrdSt3uJFqoYTj0yhOuvFKT" +
       "dpFquAbhKjFdpMTjIrZbZXqq4aQEhfQlmYfSUIbiSVi7Ylq3nHoM\nQiDQ00" +
       "Uep7t9Me1uXZ5UGFF4Thrqe/FK0cozyY4jfnPAw/T2NEGfWssRCafPT0f5OS" +
       "ilJazZ3tfa\n3NB6sLGj85MEDW/K/7xLoqA0xBb2qMsWJ+Haadpi5/9sC3o7" +
       "k32TfeYhxbGXz1l72dbKur9Eb18n\n6PAmY1ZrW0NnS2NXC2FVonvRx9anwN" +
       "l1KPBiGnaLDfubdwR2G8CGUuVj3ukhbBputKrd5s0nsp7/\nR7tdSG9Au70B" +
       "3yNocLO5poXaraW5PZvhtPUN9x0wnL6G4X6cxn3Axn3pjuBuo7g7wXLe+de3" +
       "HD1I\n1JqWq72TlttwzPspHJ94CXOye+c8x8IxTUxAsb1gfiq7NPXPZuHd/X" +
       "1G4qtwfoJ1Cg623sa12977\nwDgQuo8fWY6Tnkme2f2tdy/eGC83kqfx0XJf" +
       "xndDp47x4ZItK6TS9L1nrRmY9Cv791xYHn97xorY\nS1AkLij0S3GA4W1GUH" +
       "uVZ7M9PdNXZHw6Nj5w8ntXHqp7WS39DfsOkv4IWQCnlnhSkpzHTEc7oGo4\n" +
       "LjIYBcah06DuVYLu3mACIPTrIG0wW79m6L9OUM16+rBs+nCq/Z6gyjXUQIM+" +
       "nBrXCNqRXQOcz2w5\n5d+CQ41bnqBC+49T9E8E5YAobV5Xs5xXjDNvSv0vCA" +
       "5hVBYYAAA=");
}
