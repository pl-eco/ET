package net.javacoding.jspider.core.util.config.properties;

import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.*;

import et.util.MyUtility;
import java.io.File;

import et.util.MyUtility;

public class PropertiesConfiguration
  implements net.javacoding.jspider.core.util.config.JSpiderConfiguration
{

    protected java.lang.String configuration;
    protected java.lang.String jspiderHome;
    protected net.javacoding.jspider.core.util.config.PropertySet
      jspiderProperties;
    protected net.javacoding.jspider.core.util.config.PropertySet
      pluginsProperties;
    protected net.javacoding.jspider.core.util.config.PropertySet
      websitesConfig;
    protected java.io.File defaultOutputFolder;
    
    public PropertiesConfiguration() {
        this(ConfigurationFactory.CONFIG_DEFAULT);
    }
    
    public PropertiesConfiguration(java.lang.String configuration) {
        super();
        jspiderHome = System.getProperty("jspider.home");
        if (jspiderHome == null || "".equals(jspiderHome.trim()) ||
              "null".equals(jspiderHome.trim())) {
            jspiderHome = ".";
        }
        defaultOutputFolder = new java.io.File(jspiderHome + File.separator +
                                               "output");
        System.err.println("[Engine] jspider.home=" + jspiderHome);
        System.err.println("[Engine] default output folder=" +
                           defaultOutputFolder);
        System.err.println("[Engine] starting with configuration \'" +
                           configuration + "\'");
        this.configuration = configuration;
        jspiderProperties =
          PropertiesFilePropertySet.getInstance(jspiderHome, configuration,
                                                "jspider.properties");
        pluginsProperties =
          PropertiesFilePropertySet.getInstance(jspiderHome, configuration,
                                                "plugin.properties");
        websitesConfig =
          PropertiesFilePropertySet.getInstance(jspiderHome, configuration,
                                                "sites.properties");
    }
    
    public java.io.File getDefaultOutputFolder() { return defaultOutputFolder; }
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getJSpiderConfiguration() {
        return jspiderProperties;
    }
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getPluginsConfiguration() {
        return pluginsProperties;
    }
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getPluginConfiguration(java.lang.String pluginName) {
        return PropertiesFilePropertySet.getInstance(jspiderHome,
                                                     configuration, "plugins" +
                                                     File.separator +
                                                     pluginName +
                                                     ".properties");
    }
    
    public java.io.File getPluginConfigurationFolder(
      java.lang.String pluginName) {
        java.io.File jspiderHomeFile = new java.io.File(jspiderHome);
        java.io.File configFolder = new java.io.File(jspiderHomeFile, "conf");
        java.io.File config = new java.io.File(configFolder, configuration);
        java.io.File plugins = new java.io.File(config, "plugins");
        return new java.io.File(plugins, pluginName);
    }
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getSiteConfiguration(net.javacoding.jspider.api.model.Site site) {
        if (site.isBaseSite()) {
            return ConfigurationFactory.getConfiguration().
                     getBaseSiteConfiguration();
        } else {
            return this.getSiteConfiguration(site.getHost(), site.getPort());
        }
    }
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getSiteConfiguration(java.lang.String host, int port) {
        java.lang.String matchString = host + ":" + port;
        java.lang.String configName = null;
        if (port > 0) {
            configName = websitesConfig.getString(matchString, null);
        }
        if (configName == null) {
            matchString = host;
            configName =
              websitesConfig.getString(
                matchString,
                websitesConfig.getString(ConfigConstants.SITES_DEFAULT_SITE,
                                         "default"));
        }
        return PropertiesFilePropertySet.getInstance(jspiderHome,
                                                     configuration, "sites" +
                                                     File.separator +
                                                     configName +
                                                     ".properties");
    }
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getDefaultSiteConfiguration() {
        return PropertiesFilePropertySet.getInstance(
                 jspiderHome,
                 configuration,
                 "sites" +
                 File.separator +
                 websitesConfig.getString(ConfigConstants.SITES_DEFAULT_SITE,
                                          "default") +
                 ".properties");
    }
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getBaseSiteConfiguration() {
        return PropertiesFilePropertySet.getInstance(
                 jspiderHome,
                 configuration,
                 "sites" +
                 File.separator +
                 websitesConfig.getString(ConfigConstants.SITES_BASE_SITE,
                                          "default") +
                 ".properties");
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVaDXAUVx1/l4R8EchnIW0CCRAESnLJXe4uCXGQkIQh4YCQ" +
       "gyIh9brZewkLe7fX\n3XfJgTVjay1Ync7U1qojtmPHDjMOfjKtOn4gU1Cr4m" +
       "hmpLVOUYcO1qlUHMcp1ir+33t79/b27nLQ\nXjKze5u37+P3//0/3v+9t6ev" +
       "oUWGjhplw0mORrHh7A+MSLqBQ/2qZBh7oSgoX1hUNnJqR0QrQA4/\nKlBCBF" +
       "X6ZaM9JBGpXQm1Dw30xnXUHNXUo1OqRsx+0nrZtObdmV8dH24oRJVjqFKJBI" +
       "hEFLlfixAc\nJ2OoIozDE1g3+kIhHBpD1RGMQwGsK5KqHIOKWmQM1RjKVEQi" +
       "MR0bo9jQ1GlascaIRbHOxkwU+lGF\nrEUMosdkoukGQVX+w9K01B4jitruVw" +
       "zS60fFkwpWQ8b9aBYV+tGiSVWagorL/Akp2lmP7dtoOVQv\nVwCmPinJONGk" +
       "6IgSASaa7C2SErfsgArQtCSMySEtOVRRRIICVMMhqVJkqj1AdCUyBVUXaTEY" +
       "haC7\nsnYKlUqjknxEmsJBgurt9Ub4K6hVxmihTQi6w16N9QQ6u8umM4u2dh" +
       "dX/PfRkbebmc6LQlhWKf4S\naLTS1mgUT2IdR2TMG96IOZ8cOhBrLEAIKt9h" +
       "q8zr9K397j7/G2ebeJ2GDHV2TxzGMgnK7/oaV8z1\nvV5WSGGURjVDoaaQIj" +
       "nT6oj5pjceBWteluyRvnQmXv5k9KcHPv41/GYBKh1CxbKmxsKRIVSGI6F+\n" +
       "87kEnv1KBPPS3ZOTBiZDqEhlRcUa+x/omFRUTOkohueoRA6x53gUIVQClwOu" +
       "IOJ/i+mNoDtHdI1a\nqYINMPhJZSqmM5t2RgnyRzAZp8YgayEwg/HDRlQJYX" +
       "1c1nQ8TvHDE20yHk32MZ61uziFUjnjcFCf\ntnukCua7XVOh86B86sovHhjc" +
       "8akTXL/UJk0hCBoGQE4ByGkCclJAnFAOyCkAObMAQg4Hg7I8VSFU\nwyHqiH" +
       "/7Tm/VY23GCwWocAyVKeFwjEgTKgYHllRVm8GhIGEWXG3xFmakYOEVE2DsgC" +
       "+oQkfMuUAD\n0zpabTdqEQqG4EkCS52bvfmbt4IzZ6j9UXupo71zaKD9Ixxb" +
       "xYbAvcP3nVhdSCvNFIEeC6BqS+7e\ng/Jbj+48c+mXr60XzkNQS5pPp7ekPm" +
       "mHD8zKOAQxT3T/+Xe2X39iUc/zBagIHB2UQSQwUIgbK+1j\npPhmbyLOUbKg" +
       "5eJJTQ9LKn2VCE7l5JCuzYgSZk5L2HOVac2L4FpmWncdvdGXNfRWy42P8mmT" +
       "gUXR\nG58o7nj5h4svMFISAbfSEpkDmHD3rRbq2KtjDOWvfWHkic9dO36Q6Y" +
       "Irw0FQcTQ2oSpynOFb7gDd\n12YIJc76uief2nDy5YSya0XvfbouHaW6jj84" +
       "t+KLP5O+DGEG3N1QjmHmzYiNhBID0Hsre26zvKT/\nr2alK9OIWm8SVZ+JKH" +
       "r7QMauHVxCAFuPE6IM9u/kQZGH0AdOXnlkw59+f9EMs5bpW9T6a/Dh2Auf\n" +
       "PDtXQFVbBhOpZOxKODqbyOmTg01uYD7M1WhJGYNXzmNJF0GlrKW7qxPw1MBA" +
       "dN53KiGnX5MldWjg\nK+cWzz0e8w1zJEssFYYGgvGmi89tuNnMEJgDFlsCuf" +
       "l/ybSk7xIhiP50E7Qvn4Fxk9vT2tnV5gV5\nlsjWV4z0OsgRmFnQCOPk83Fu" +
       "rbvMKjTq2IPtNppeJFw2PPHRf734dHkzN0HappF1UwyMNlg1nNIq\nKN9/7G" +
       "TnXGC/wqm1T7y2ysd+vO/pGxfJZeZfIirQ0VbF0wHeI1kCVvel6eribz0TLk" +
       "AlY6iKJU9S\nhNwjqTHqfWNgIUa/Wehn/In3qakMN77eZNRrtEcky7D2eCRm" +
       "IXhONUYRgpbCtQauJaZnLbF5lgMx\n89nBGrSw+7pkwCgDSyGAD4fiGc3Ay2" +
       "1+T9LmfV02m+ecD2zpOff6tW8qbzO7LmepZB9tYKIvYyUW\nXyvUogZNWixZ" +
       "s9lTy+6o0ctG3URMH3V3d+Td+nvcrT5fW1cPaGvv9qGAM0V2OvqonZBZSKPS" +
       "Badw\nTeZRDbPKpcJvBiOxsPUl5BJFo4N9A7T/zXxuoPdtKcpcZf6ixG+6Mj" +
       "9CbzsJWmxysF0LY6u+JKGv\nblYesFDpWwAqvZ1tPg+EDEalBRQdeyIVJy0a" +
       "n5eAVrgqTQIqMxNwyCSg2uxYgLPScETQ0GOjwdeT\ndxo8Xa0ub1unGxZNVh" +
       "pEA4pAzYSZUZIIu523mmya7Y9CPJqPySqTyarMTJIEk1E1NqVEjMxMzohJ\n" +
       "ryONybz7pteVymQaNIognglz0rj0bJRsgKvapKQ6MyWzJiVLZ/AEzMoJfFY+" +
       "HhR8uOwO5oIZdX++\nHczV0d3mcgMjtYyRVGQUwENpeHNzsY6HpUR4ysTFCZ" +
       "OL2hCelGIq2R0j0RjZxtZMVkI+LQhxpxmI\nJ++u1skMBPqtZ3RkAEcxfCYz" +
       "7hR3q2DRWtEgnvMlbGXckoYikes0mimoReinRHzxRRMdfvBW/Xc4\nwF6kyB" +
       "aH2XVFtj0Itn9y/MP/qHhEOn8vz4BqUpeRdL7xPvMK3rClQs6wji0jWrRNxd" +
       "NYFWmafbSd\nbG8mkZFU7m/68zbfqY/Z87Qyupq25mmpzYLyuW+c/YP3lVcf" +
       "BhRjqGTX7kB/n38QADfNO1xQrp5u\n2FN4SPk5yyPMlCltRym1UW9qolSuYx" +
       "LTI3tT0qXmlIUIXYTcbdr93be3ELnlBdBzELymMBmY321O\nC7fxsvIeevt6" +
       "3v0FAoirzdMBXGbGtM5o5rTR4T+LGJRnUzjrgMtpcuZcIM6+TdBywJfJMayk" +
       "fU+Q\n5hOkfT/vpPkYaTC7NWcBlcKano01t8mae4FY+xFnbYTPhVlZOy9Y6x" +
       "KsXcj73N1hZS0TqNysbYHL\nZ7Lmuz3WHOlR+qIQvEcI/uu8C+5p9fjafJ0E" +
       "lfO0JLHa2ZxbhS/xYMHZyqrB3wlBuoUglxZAENAg\nTeebMmPKrcAPwbXJVO" +
       "Cm963Ay0m5u11C7j/mXe7uVo+3zed+Lwp8FRb2mclKj/lXhTgdQpy/LIA4\n" +
       "VI1gj2vnQ5Y78lMP3Goqc+v7Vubfk9L3uIX01/Mtvc/X6vG0eUH6IpYSm8nZ" +
       "2izJmRRVnGEthFVn\nAGrn1vebBNUBq7RyVnf9t5DUYrbvLICkoGcvuOuKTI" +
       "hyOyvV6bCp3+Hb02+BeQogpHYUCKk9Sakd\nhfmWusvD9OsF/R7S+GnHZvve" +
       "4YiuhBWiTJvncM+P/bMjdHXjAM+c663nu9aK2903cUvtG9f5rmHq\nHnGGPU" +
       "fbII+v/OrVM1dG63j2zU9E16QdSlrb8FNRxnRFlOb/q+YbgdU+v3HV6dnRyx" +
       "MFpjV+iaBC\nJUIIKmZwvbnt93+57ddRKzTZKTRZtwCapHHK957t1wPXftN+" +
       "9y9MjuWoJ6hBZM7z0tYkaBN5lqM5\n37R1dzG3h9mqZR5gudlzwXXQZO/gAr" +
       "HXAut0ALlVMvC81G0U1IkEx9Ga9/1KF0tRewhalQ2Vjbc4\npNhZ+qMHaPVp" +
       "X3rw7xHk1XP3rX8xWv0SO5dMfjNQ6kelkzFVte7uW56LozqeVBj5pXyvn7MD" +
       "qnbf\n/kE0zWZStvQcLt4dhM51t9gdod8GJLbAEu1php+rPURn+mNt1gueNE" +
       "8zaEF/rC02Q3KcuQVBJeaT\ntX4fQUtT6wMH4h9r1QEInBG2feoYTG7gWM69" +
       "+OENDcp1lp3/QBTLCj3oiz/7g6I9j/32P2yzokTm\nH+7Qj1Vko31agbyjvS" +
       "8iqUcNdlZE39FDejmm6zhC2K6OqfHFBu+Rf5zSYD0USY7VsvfAyGDauYjL\n" +
       "t1B7jfTEpYhuruX3+4dZHd2ZiUomnhmG2FEJFfSgCeH/RE4rEJMlAAA=");
}
