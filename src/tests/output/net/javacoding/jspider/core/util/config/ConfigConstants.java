package net.javacoding.jspider.core.util.config;

public interface ConfigConstants {
    java.lang.String JSPIDER = "jspider";
    java.lang.String CONFIG_PROXY = "jspider.proxy";
    java.lang.String CONFIG_THREADING = "jspider.threads";
    java.lang.String CONFIG_THREADING_THINKERS = "thinkers";
    java.lang.String CONFIG_THREADING_SPIDERS = "spiders";
    java.lang.String CONFIG_THREADING_MONITORING = "monitoring";
    java.lang.String CONFIG_THREADING_MONITORING_ENABLED = "enabled";
    java.lang.String CONFIG_THREADING_MONITORING_INTERVAL = "interval";
    java.lang.String CONFIG_THREADING_COUNT = "count";
    java.lang.String CONFIG_PROXY_USE = "use";
    java.lang.String CONFIG_PROXY_HOST = "host";
    java.lang.String CONFIG_PROXY_PORT = "port";
    java.lang.String CONFIG_PROXY_AUTHENTICATE = "authenticate";
    java.lang.String CONFIG_PROXY_USERNAME = "user";
    java.lang.String CONFIG_PROXY_PASSWORD = "password";
    java.lang.String CONFIG_STORAGE = "jspider.storage";
    java.lang.String CONFIG_STORAGE_PROVIDER = "provider";
    java.lang.String CONFIG_STORAGE_CONFIG = "config";
    java.lang.String CONFIG_LOG = "jspider.log";
    java.lang.String CONFIG_LOG_PROVIDER = "provider";
    java.lang.String CONFIG_SCHEDULER = "jspider.taskscheduler";
    java.lang.String CONFIG_SCHEDULER_PROVIDER = "provider";
    java.lang.String CONFIG_SCHEDULER_MONITORING = "monitoring";
    java.lang.String CONFIG_SCHEDULER_MONITORING_ENABLED = "enabled";
    java.lang.String CONFIG_SCHEDULER_MONITORING_INTERVAL = "interval";
    java.lang.String CONFIG_FILTER = "jspider.filter";
    java.lang.String CONFIG_USERAGENT = "jspider.userAgent";
    java.lang.String SITES_BASE_SITE = "jspider.site.config.base";
    java.lang.String SITES_DEFAULT_SITE = "jspider.site.config.default";
    java.lang.String SITE = "site";
    java.lang.String SITE_USERAGENT = "site.userAgent";
    java.lang.String SITE_THROTTLE = "site.throttle";
    java.lang.String SITE_THROTTLE_CONFIG = "config";
    java.lang.String SITE_THROTTLE_PROVIDER = "provider";
    java.lang.String SITE_HANDLE = "site.handle";
    java.lang.String SITE_COOKIES_USE = "site.cookies.use";
    java.lang.String SITE_PROXY_USE = "site.proxy.use";
    java.lang.String SITE_ROBOTSTXT_FETCH = "site.robotstxt.fetch";
    java.lang.String SITE_ROBOTSTXT_OBEY = "site.robotstxt.obey";
    java.lang.String PLUGINS = "jspider.plugin";
    java.lang.String PLUGINS_COUNT = "count";
    java.lang.String PLUGINS_CONFIG = "config";
    java.lang.String PLUGIN = "plugin";
    java.lang.String PLUGIN_CLASS = "class";
    java.lang.String PLUGIN_CONFIG = "config";
    java.lang.String PLUGIN_FILTER = "filter";
    java.lang.String PLUGIN_FILTER_ENABLED = "enabled";
    java.lang.String FILTER_ENABLED = "enabled";
    java.lang.String FILTER_ENGINE = "engine";
    java.lang.String FILTER_MONITORING = "monitoring";
    java.lang.String FILTER_SPIDER = "spider";
    java.lang.String RULES = "rules";
    java.lang.String RULES_COUNT = "count";
    java.lang.String RULE_CLASS = "class";
    java.lang.String RULE_CONFIG = "config";
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALWcD5Ab113HV7rz/cvZ5/P/xHZ92M4fB+lOq9VKWjtJLd/p" +
       "fLJ1p8tJF8fOBWVP\n2rtTrJMU7co+pyHTQtskdCgDpJ0OZJKhnU5a6NBOgQ" +
       "BDIZSQDu000DFDQwcKhWSYFhqgw5QEJqW8\n39u32t23T9qVdPXMWnu7b3d/" +
       "v8/3vd/7u/u5t7gdap07UlAntRs1RZ2czi7KdVUpTpdlVc2hQ/nC\nqzuGF1" +
       "+8WKn6OV+a85eKGjeWLqhTRVmTp0rFqdTMma06N1Grlm+sl6sauY/jLqdPvH" +
       "v9609dONzH\njV3hxkqVrCZrpcJ0taIpW9oVbnRT2VxV6mqiWFSKV7jxiqIU" +
       "s0q9JJdLj6OE1coVbo9aWq/IWqOu\nqEuKWi1fg4R71EZNqeNnGgfT3GihWl" +
       "G1eqOgVeuqxu1OPypfk6caWqk8lS6p2pk0N7BWUspF9THu\nSa4vze1YK8vr" +
       "KOGBtOHFFL7j1CwcR8lHSsjM+ppcUIxL+q+WKojEMfqKpscnL6IE6NLBTUXb" +
       "qDYf\n1V+R0QFuj25SWa6sT2W1eqmyjpLuqDbQUzTutpY3RYmGanLhqryu5D" +
       "XuEJ1uUT+FUg1jLHCJxu2n\nk+E7Ic1uozSzqJUZGP3RLyy+PYE17y8qhTLY" +
       "P4gueg910ZKyptSVSkHRL3ynMfls6nLjiJ/jUOL9\nVGI9TeL2319Of/flY3" +
       "qaw4w0mdVHlYKWL7wbPXL0ZuLN4T4wY6hWVUuQFWyeY1UXyZkzWzWUmw80\n" +
       "7wgnJ42Tf7r0lcvv/03l3/zcUIobKFTLjc1KihtWKsVpsj+I9tOliqIfzayt" +
       "qYqW4vrL+NBAFf+N\ncKyVygrgGED7NVnbwPtbNY7jBtHmQ1uG0/8NwH8aN4" +
       "6y+VppfRpypVzR1MmaxkkVRVuBTFCoFpH8\nK4+qtVJRqa8UqnVlBexGe3DR" +
       "iuPaLXje2HWfDwouXezKKI/OVcvoTvnCi2987YnkxWee1kWEjEcs\n1bgYev" +
       "qk+fRJ8vRJeLpOTX/6JPV0zufDzz1oRwyaFaFoff+LZ3Z/NKi+5Of6rnDDpc" +
       "3NhiavlhVU\nJOVyuXpdKeY1nCfHLfkfZzuUZ0dXUfZFxuTL6Ea4uCCm1+rc" +
       "cTqbmoU7hc0qKDef/PE3/j1//Xcg\nR0EO2Ad3101Del7VbRs9lX34wiNPH+" +
       "+DRNf7QZotXCwPwlNokrMQIIz7b66+74evPD8yod8frjmC\nbxBDzzqsGJck" +
       "p+dtV+ULjz3+nHAze6mk53S66FCJH/+T5effeU37ByzXMOKvySjjoXjwHroA" +
       "28oc\nlGTa+Afkunnf+DevjQ984YVNPzd4hdtdIFI+IJcbSlZBoXekpBr6pr" +
       "mdtvP2QKWXyjMkIGjcEdou\ny2PPGFEVYPVbsx/ah9SwP4yz8k6cZjfCeQht" +
       "AtqGSPHBv3ByD/y3d8vn07hBklXhyF0gNQ0VHvrO\nzw+EXv/SLa9ilEZ0H7" +
       "NUA8hxPVaMmzklV1cAyLc/sfirH3vrqYdwNtHzSZ+GblKqyMjngVpjtVwq\n" +
       "oB0VV2BbyKIL2cXUTHIJ3e2QNS/ouPSQ98Rzb3z41He+9RoJi5bq1kz1vfwH" +
       "Gy996OWbfqgnhlHF\nJ6sLJjRU8cKeD1dGKFvk7RBH9LAQ1bghfKUYCyF79q" +
       "AHQT09WSqS3DZzVvrym299vvQ2fsoIrgYT\ncAF5zDA+YnluX7WmQsC11Pjk" +
       "TiczNRUy307LQ1Iz+a1jr3361I8n8P2J0QOW4E3+Hrwm1xesEWkE\nm82HRJ" +
       "7Xw1PL4FhvlJWVJfTfrAwx4MZk7XQkFIgKwTjy/v4uA9skEfFOdUKT6+uKNm" +
       "EcAQtjpspP\novrFSRVYkEzL7cEa78IZC8rNZLLS2LSeRN72LyUTM5j5PtQ+" +
       "MZPqbQEc4PHZ47aycR/aRsiNRhhl\nY6fhba1e3boBx2fx9T+N/58kmRn2Q/" +
       "AfD/+FUQ4enc4szKbO5xeXMg9exmkjenZKm9mJx8fjGsmZ\ncSmCaN/bTqfS" +
       "Zq28ksUHSDMvhY4gteJ8QIwF46LGPdStWlaDLZJZD4O585RvcOwc/DfTCvEM" +
       "2kYJ\n4lEG4jHDRG2jrsh6sy7rCfJuYkhuDrRPLZy3gr5sgg7bQYf5iKBxUY" +
       "+gCWFBDIjxoBTSuEKPhJvW\nOik3T4G9VxgOutOeRdtOQnsng/aQtgHVdx1f" +
       "9IgnzLfSVqC91MLF5FLWynvN5C04eEsuAYjBOxYQ\npSAfQsAb2wW8aXcb8s" +
       "004MJ6O+e95fxdRItdrIpXdwRfs+lJikMOa/QQalNCNZWIOJSIdp7zo6CE\n" +
       "hCRUt00IYnU7HUgSsF9r47i7ChfQNkZUGGOoMLJZrZRQrUdqicc9CXHYYc98" +
       "ZiGVyyxRUej9phYi\nrYUodl4qpEAUlQo+rHE3tk0M0/J2epipwI0PtEfgrg" +
       "r053YTVXazyoZSgW4Obuw85UmSE23syScX\nEufSyRmrNL9oShOlpYlFOi4m" +
       "ETEQiQYl1K555iegjOGAN4WM1ODVR72RcVfsfrSNE8XGWTULHtG5\nJuNxjW" +
       "c9SXaynWGphVxy6YFE2qrZr5maxRyaxTsuTpFoIMqj4oSaAx/5SYhmuOBRNS" +
       "M5OPbrHum4\n63ZWbyMbbWWHbjsK1UYFjw78hifRDjjMms4sL+SsMr1oyhS3" +
       "y8QLItrn28mkK7SgqBoEvFBAFIIS\n6sBUt00gbG47SXACMPszLb11xx5H2z" +
       "6CfR8De19DxV213+6oqYvb3PnlbNKK+3dN3BLdpxD5rvsU\nQiDCB2NC7y3e" +
       "ptEt+hVwCsz+PYaf7qBPo20/Ab2fAbp/o6oPfv2RJ9LjNgvmMllbzv5yE3U8" +
       "5EAt\ndY0aNbHCuPumbAtqsLoVazgHhv8Zy1VvtA8Q2gdYtGvVOqb9F13QXs" +
       "ws2Wj/pUnb0VmOCl3Tjm0v\nbbC6FW04B4b/FctVb23Xg4T2QQbtUbmhbSgV" +
       "rVSQNRxN/qajHp1uSmI5N5dcyKWmEzlbWPk7k36Y\npg8R+b6u6EuRbevYOc" +
       "1vJYM1DXjy9+0YuMtyH/nljF+6EKDYjodT/9mTHPvpoLe0kJi3SfFdUwrB\n" +
       "IUXXYUdCYQc1WVFB2tyuCI8tbxPm8Xlw4Hut3Hanfw5ttxL6t7IaojVZVa9X" +
       "67jv8B9dKLCYyGYv\nZZZsvYUfmgpQnWopFOo6FEkoFIlBKbxdChiWtwxH5D" +
       "w48N+t3PamwGGiwGGGAs0hPRX1q+V1HJne\n9STELmJRFjVzE+etZcDnNxWg" +
       "utJ8nHcbOSWGrGT1X3OcO4xHN+KoDOV7VICY7ERPToAPfQ4P3WHD\nKNIRAv" +
       "sIM7vXq9fI/I1v2BPlg3YbQP8H8HyLBfeYiTvqwO0WclrjxnUv1B6PbQ/upu" +
       "0tuTdTgFe7\nWzvvrgT0pI4SJY4ylBjQLYbnHOgo7Bim6H9aVThiqhCjVRAE" +
       "lzq4pQpCOBCNoTo40nvcsZveWgT9\nT3DpaCu/vTU+jxEBjjEEuMWwvlzFKp" +
       "zwpMIIsSadsaE/ZaKnOrFRMRZyWW6ADFiHg+nquj3WiME4\nyvyXeqSOTHWi" +
       "RgfB7rttHnnL1RME6oRbfAl5IrrXfD4ztphzqnHJgVboCm0sEIkH4+jaUu9o" +
       "28QU\n61nwJMZ21p06tOyPE+rHGdT3N2fFZPWqWthQio2yLsG9HQ0YZKfnkj" +
       "PLaTv/6SZ/qdmLJbPFQjiM\n/rinnQBg0UrWMMmiAQ+jadI2DBg0jWbEE+MU" +
       "+DHD8NMdPUyRnSDoT7hl+AsddaiaVjCz/aKJnXdg\nF/husYcDYiQoib33p5" +
       "zWt+FvKwb3t0PgrTCcJIqcZChin6LxXepoisY0iDlF43vYVCXsUCUSc2np\n" +
       "tFRFCkQjqIqN9T5Tw3KgnTC2aRjfz7Qn4S4OzNTcTsS5nSGOZabGV+xopoZl" +
       "D2OmxveoqZDgUEgM\ndVluhFAgopebXids2vnhTSjLLIzvqjdA7sLBhM0dRL" +
       "g7WHHOMmHje6yjCRumYYwJG991U7qIU7pI\nl4VL4GHggg/Fe5+3aeuJR/Es" +
       "czE+r5C8tcvuIvLdxZBvl+HqWqms6ZXVk55E3Ensm02lc/YK6oOm\nWnQXOx" +
       "wLa9wZ93kbMr5hCYRxWDgTR3Hw4R6l0u11aqIfB/s/RDvnrTFwN6F8N4PyuG" +
       "ElDOkl1hU8\nU+b7SEdtMBjaQt0c2xyZ75dN1lT/Oi6F3WqdlgNKsThuB2/D" +
       "MqWm0U7gzVPgx68w/HTHnkZbgGAP\nMLAfao4glTTFsHRVxlNmvk94oj+WTe" +
       "WS2fy5RDaZh10r/OdN+PQ8Mh7cuOR1KTlqKsLLEiVFXVls\n7upEG3X8lgWM" +
       "8oUDvCAE+SiKd3K3slDeWFShzoB/Lzjdd9dkCW1BokmQoclhliZFZU1ulHGh" +
       "+LQn\nWfbods0kZxPL6ZxDmd8ylaF63eEYdC22V5l4nCiDCtx6b8pYHXKIYz" +
       "0JXn6OycFdIpBlikg0xZCo\nH6SBB3zRkxb9NP0/MOlLVHUdEoVw58uIxQjU" +
       "1DHU4b/YC14KKJj6h8R8d2gJtPEEGs+qSHF+tsX3\nl70NVsPz2dH9VQNkNE" +
       "TNE0t8rOu5M9RJDERiwVish9Fqu80UWHto/4rDRXfY70VbmMAOM2DvxLC1\n" +
       "jXpV0/A7P76ve2u0YENyc0uZXC5ty7M3TdTUJLEQhgGh97ZtYRJDVnJkx9LI" +
       "FAPREJ4Z6LrhYrOZ\nRm0cBx/+mnbQG2iBgBYYoC2D0d/yRHifzQDGWPQ/mq" +
       "Cp+WBBCKHYcLZL0JFwIBZCrXkUJK5uC2nn\nYDTrNLj0nRZuu+OfRluE4I+w" +
       "OlfWQaR/8STAAbslrBGk75sSCI68Hu0hr0d7XmbFNr6lBtbRo7da\n+u6uwx" +
       "m0iUQHkaHDLTjebMiVoh5t/suTFLdgc+YSCzP2WPM/Jn96FpiHSq7bsB4ORM" +
       "Qg9LAu94Rf\nN5hmrh8F8//X7pk73STaooRulEF3N2kKVq+ixtWkvqLNz3nr" +
       "HGFDpjOZiynUDLKvaPMPmJxFmjMM\nyXXJGWYJJDwB03XviLaahm05BY4MMh" +
       "z11mKJEeyxli0W/EqSAX1nBy0W1iJC/14TOdUflcIwUdht\n1o4HBDEYFXtt" +
       "sbDWENpPgBP7HC66w57n9MWanPFLwd6HYderq1VN1ba0yTVFK8ALyv7bOqhW" +
       "lzLn\nMrls7sFcfjaZm56zgp8wwcfovA7cugUfwtMCoV4rVcpyGj91Ghz6qR" +
       "ZOu0txEW0SkUJiSLGXkqK6\nqsA7ef47vc1KUkZlziWtr+b5g6YQcVoIWNvZ" +
       "bdCRoG6Nx3uYmmQY3loHOAvuTLI9dlfhNKlWOeOX\njj7NdyLLjfUSvH7qj3" +
       "gSYHAxvXw+tWB9Wcl/2oROTQVLqFXpMhWMoS9iK2yLG+BdyFAPb64SOy2M\n" +
       "yRGw+IzpiDtLiN73EJb3MFg2F9/7E966QeTJjjX3/vNNkDzd4xQEtzl1Nkgh" +
       "IIaCsV46QDZrnTib\na+n9c7Rr7mghQNxL0N7btgPkX/BWOZoGUF0ff86Ey9" +
       "Nwo6jdd7pzuLFADJbB9rLwzG4vEy/pzPiX\nHe65A+ZJL5MzfmnAZvl/yBPg" +
       "Ad0CK1jZBBumwcIK7c5zbYQPREU835DpjauDJ9i72vTCnR80mM8S\nfmeZZR" +
       "8+0wF33fCEb1R/cH46ncjaYmjFhCjQEKVIVxAjgRiP3/ns+n1yq7EOlPphsL" +
       "1K+eWONU4a\nyJzx27rcNzqJqYxi/z4TLN3di8DMfhdgo/ACpxTvOaa2KvSW" +
       "Mv8E7Zo3tucI23Msts25Rv/PdcTW\nMdfof9pkS3fxIvB+axdspe1i65hptB" +
       "0H65+hXXNnC3l1mrCdZrC1rKPw/5InuPttFjBWTvg/ZkKm\nO3URvqvwKobw" +
       "BKPYw8pRptWtYFuWO/g/3spld/jQpk0S+EkX+M95ay20pv5JkzrVoxNCEmot" +
       "zLWj\nXiypNRn1MHX8yWtKRZshh5rvrYpiQJCC0V7aDi3pO7F/yuGst0AyS3" +
       "jPsgKJUkHZCo9cfNZbIGla\ngOS3DVx83qRNddsEPKbcM+1oqOcVDDbjWbDh" +
       "ODjzBdpTd9TQNDtPUJ9noLYvnvO/5An3ODGCuWTO\n/yUTueRALm0Hch5/cy" +
       "Lcwyt6Dgec2G2r4Px/zPLaW06fI/jnWDldNxie8EpHOZ18AsuC/atN7OEQ\n" +
       "jR2qzN6xh7crpzs+/WQ7Ds58jfbUHTXMeF8gqC+wGtQwAY0b1N/wRHrH0nI6" +
       "aWtJf9MkTK/QDYmR\nUBfz3xIs+YepgfluiWIjLSTx32Ds64YH7uRgZuQiIX" +
       "eR2RUxhiG+7W1+BD/XOQjxhsmPXkuL+Ll9\noIHBDwWCqIBHMbueGbGYSlM0" +
       "xx/etPvkThTm/OYJ0fm2nbt/9UR0BJ7u7Nr9pwmUXvoaikbc+nYM\noDwvBG" +
       "JikA/18haKaStF1OzX/cDmkjtP6CwvEJ4L7Xt1b3vPoow+3Y9MovSK1JAYd/" +
       "skD4NoPARL\nXGClQU9Z1NmhsxwFw//P7hOFdIsBBTxdVbU6MhVVFM0P7mJM" +
       "lu907mV8Lnby0L5nP37qudfpz3Ny\nW2qdO9rqK7f4C71PPfiD0Q/Lf/6w/m" +
       "HGPfbPmsKH+8QX/lY5dXa0wPiI6rBWrQXLyjWlbJpHP20e\nf/3X+Crm2KVj" +
       "/zQbffFnnYZq3BjFGb5OecjxVWX927+F4zcfueuV2vhX/fjbmsb3eYfS3NBa" +
       "o1y2\nfmvTsj9QqytrJfyC8JD+5U2cyfoOaNydHjNDM2uD8X379etv1bgJt+" +
       "vhNXP0Y73siMYdbnMZugJ+\nrFcc07gD7CvM74Ja0x9HfQF7elR6zD+sSW/X" +
       "uD6UFHbv0JWxf5hR/0znVu3/AVrtH2cxWwAA");
}
