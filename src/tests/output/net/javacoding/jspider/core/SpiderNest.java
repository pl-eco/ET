package net.javacoding.jspider.core;

import net.javacoding.jspider.core.impl.SpiderImpl;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.*;

import et.util.MyUtility;

public class SpiderNest {

    final public static int DEFAULT_SPIDER_THREADS = 1;
    final public static int DEFAULT_THINKER_THREADS = 1;
    
    public SpiderNest() { super(); }
    
    public net.javacoding.jspider.core.Spider breedSpider(
      net.javacoding.jspider.core.SpiderContext context) {
        net.javacoding.jspider.core.util.config.PropertySet props =
          ConfigurationFactory.getConfiguration().getJSpiderConfiguration();
        net.javacoding.jspider.core.util.config.PropertySet threadProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.CONFIG_THREADING, props);
        net.javacoding.jspider.core.util.config.PropertySet spidersProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.CONFIG_THREADING_SPIDERS, threadProps);
        net.javacoding.jspider.core.util.config.PropertySet thinkerProps =
          new net.javacoding.jspider.core.util.config.MappedPropertySet(
          ConfigConstants.CONFIG_THREADING_THINKERS, threadProps);
        int spiderThreads =
          spidersProps.getInteger(ConfigConstants.CONFIG_THREADING_COUNT,
                                  DEFAULT_SPIDER_THREADS);
        int thinkerThreads =
          thinkerProps.getInteger(ConfigConstants.CONFIG_THREADING_COUNT,
                                  DEFAULT_THINKER_THREADS);
        return new net.javacoding.jspider.core.impl.SpiderImpl(context,
                                                               spiderThreads,
                                                               thinkerThreads);
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1360121558040L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAI1Xe0wcRRifO+B4XeVZIQUKpahF4WhBSi3+IfIIB1c4OWr1" +
       "xFyX3TnYdm93uzt3\nXGklNtZSNTEx1ldSX4mmiWmMsVH/MVaj9d3E8IfPaN" +
       "Qao/GRGmPaGE39ZmaP3dujrSS7zM1833yP\n3/fa47+hAtNA9aIZIHt1bAb6" +
       "I2HBMLHUrwimOQlbMfFUQXH42KiqeZEnhLyyRFBZSDQ7JIEIHbLU\nERzoTR" +
       "uoSdeUvTOKRqx7cm7Zuv6fuY8XR+ryUFkUlclqhAhEFvs1leA0iSJ/AiemsW" +
       "H2SRKWoqhC\nxViKYEMWFHkeCDU1iipNeUYVSNLA5gQ2NSVFCSvNpI4NJjOz" +
       "GUJ+UVNNYiRFohkmQeWhXUJK6EgS\nWekIySbpDSFfXMaKZO5BCygvhAriij" +
       "ADhFeGMlZ0sBs7hug+kJfIoKYRF0ScYcnfLavgiUY3x7LF\nLaNAAKyFCUxm" +
       "tWVR+aoAG6iSq6QI6kxHhBiyOgOkBVoSpBC05qKXAlGRLoi7hRkcI6jWTRfm" +
       "R0BV\nzNxCWQha7SZjNwFma1yYOdAa9/n/vT98rolhni9hUaH6FwLTWhfTBI" +
       "5jA6si5oznk4EjwduT9V6E\ngHi1i5jT9F312vbQTycbOU3dCjTj07uwSGLi" +
       "P5vrG5b6fijOo2oU6Zop01DIspyhGrZOetM6RPOV\nyzfSw0Dm8M2Jd2+/+w" +
       "X8ixcVBZFP1JRkQg2iYqxK/da6ENYhWcV8dzweNzEJonyFbfk09hvcEZcV\n" +
       "TN3hg7UukFm2TusIoUJ4PPCsR/zvCvoiyB/RZQkbY9gkAZ2gDSomUxR/UZMA" +
       "+aldJjueEjUDTzlJ\n0/TmsjmPh6aoO8EUiMZhTQHimHjszIf7B0fvO8zhoi" +
       "Fm6UTQ1SAsYAsLWMICVFjAFoY8HiamJtt3\nFAyJ5syvL/eWP9huvupFeVFU" +
       "LCcSSSJMKxhyTVAUbQ5LMcKCrcIR2CyeIBj90xCXIDumwEUsD8BZ\nKQM1u+" +
       "PPztogrAQIqqWFC5/8Hps7QUOFQltNb+eqAVC7uW7+1sidIzsPN+dRorl8ig" +
       "GQtlz+9pj4\n+/3bTnz60dcb7DgnqCUn/XI5afq41Q8bmoglKE/29Y/9PXz2" +
       "4YIbXvGifMhJqEpEgFiCFF/rlpGV\nRr2ZkkSdBZylcc1ICAo9ytSREjJraH" +
       "P2DguVVWxdDg4ohacAntVWIFbRFz2spK8qHljUny4bWME7\nf49v42evl55i" +
       "TsnUxjJHEY1gwjOtwoZj0sAY9r9+PPzwI78t3sGwsMAgyKcnpxVZTDP9ajyA" +
       "fdUK\nWR+orT7yaOvRzzJgV9m39xmGsJdinT6w1PDEe8KTUBEgM015HrPEQ0" +
       "wSygig7za2bncc0t/NFgmN\nP3dKDdGekAEvMb3vr7efKmniylCeenaNFxSr" +
       "wxmWwf5tWVwxcc/80a6lyA6ZFzd3tXQRz7+x/anz\np8k3zNN2fFBp69K5Ct" +
       "4qOEJ3y6epCt9LTye8qDCKylnHE1Ryq6AkKQ5R6Flmv7UZQquyzrP7Dy+2\n" +
       "vcvxX++OTYdYd2TatQbWlJqui13BWAtPDzzlVjCWu4KRFR4eSlShQBCa7Qw2" +
       "Kr9/5rlzBxa3eCnU\nBSmqOPik3KYbS9KR4dDxRxpKj3z7AAOKhhu9dCsT3s" +
       "Le1/AwzCOguqwKrJO1QkyabAJJQ9sfGBzq\n2x6ajEXCwYHBidjk8MRg30DE" +
       "DXTYkBPQSFJWp3sl+udG6cfrBjjQtc4Jykk43HkBt1T9dJZDDOOM\nYI4t1+" +
       "fcAHEJeWjtcz+eODNRzesTnznW57R9Jw+fOxgCfj0NNqy7lARG/c51644vTH" +
       "wzzS2pzO4A\ng2oy0f3057j1Jr+4QnvJg8kIfMns6uZVhb67s8DfAk+FBX5F" +
       "Lvh0cWMGubEVkKPrPgYbfd0MkNVk\nIJscDo6N2pjR82GmBvPA1Vay2/WgPl" +
       "MoDNRwsfGHOWXxtj/8h4R37vRahWOEoGKi6e0KTmHFriHu\nS7axaS+TLmU7" +
       "Gr8b2nzsLncRYQ3dGVvZbDHxrRdPftX9+ZcHweNRVDg2HunvCw0COI2XFBcT" +
       "K1J1\nt+TNyu972azJ8zlnRs1m6s3O4hIDw4itTmblclNWY7kenhoLzpqVGo" +
       "vD9a5S7Fk2v9ZpPi9BPOT3\nHz1zqPXbL05bE6Qjr2yqn2MHk6/ee3KJmelK" +
       "KvaNQlceNrdDOY1lF6YSPlfFCSpknD1doE4lyKFf\nNAFZCoQ0UVCCA8++Vb" +
       "r0UHLzCFdklYMgOBBLN55+vvVCE1PAkudzjKjW78KUYNjZrtN/MwRt+r/z\n" +
       "39bOrrauje3dm0BVkX8pMU9WE9R6+bHO+ra6fE/cSVDptEE/uBgfo5G4k4xl" +
       "J3WybTbrwjTQFpi6\niBEj/BKqfE/bpp726zuvhS8wldrjlgFmNF/eDATpXm" +
       "J7hQ4GtTkfm/yTSGxe2rnhbb3iAzZvLX+2\nFAEw8aSiOHuVY+3TDRyXmblF" +
       "vHNx2/cRVHcJ9QjKp/+YJfOcYwF6ycoc4EZr5aQ/QNAV2fRgqv3D\nSXoQSi" +
       "2Q0uW9esZ7jl7IcyOt/wfz8ndT0Q8AAA==");
}
