package net.javacoding.jspider.spi;

import net.javacoding.jspider.api.model.Decision;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public interface Rule {
    
    public java.lang.String getName();
    
    public net.javacoding.jspider.api.model.Decision apply(
      net.javacoding.jspider.core.SpiderContext context,
      net.javacoding.jspider.api.model.Site currentSite, java.net.URL url);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVXX2wURRifu2uvvfawtPxraEtrtcGSdq9AewUaE5pS5OjR" +
       "nj0QqcVjuzvXLuzt\nrruz7RWBQERAH0wM+C9BjQ+GxBgfNOKLCRLEf5HE9A" +
       "XUmGjwQaMYfTASg8FvZna7e0cLRJvs3Ozs\n92++7/f9Zvr2NVRqmahesgQy" +
       "bWBL6EunRNPCcp8qWtZ2WMpIF0sjqTMDmh5EgSQKKjJBVUnJiski\nEWOKHE" +
       "ts6smbqMnQ1elxVSeOnVusbLjvxtSXx7fWhVDVCKpStDQRiSL16RrBeTKCoj" +
       "mcG8Om1SvL\nWB5B1RrGchqbiqgq+0FQ10ZQjaWMayKxTWwNY0tXJ6lgjWUb" +
       "2GQ+3cUkikq6ZhHTlohuWgQtTO4V\nJ8WYTRQ1llQs0pNE4ayCVdl6Ah1CoS" +
       "QqzariOAguTbq7iDGLsc10HcQrFAjTzIoSdlVK9ikaZKKx\nWGN2x/cPgACo" +
       "luUwmdBnXZVoIiygGh6SKmrjsTQxFW0cREt1G7wQtHxeoyBUbojSPnEcZwiq" +
       "LZZL\n8U8gFWFpoSoELSkWY5agZsuLauar1lA4+s+zqb+aWM1LZCypNP4yUF" +
       "pRpDSMs9jEmoS54nVbOJXY\nZdcHEQLhJUXCXKa35YMdyZ/ONXKZujlkhsb2" +
       "YolkpBvx+oaZ3h8jIRpGuaFbCoVCwc5ZVVPOl568\nAWheOmuRfhTcjx8Nf7" +
       "Lr8Fv4lyAqT6CwpKt2TkugCNbkPmdeBvOkomG+OpTNWpgkUInKlsI6e4d0\n" +
       "ZBUV03SEYW6IZILN8wZCqAyeADwrEf9bQgeCwsO2igWDoHs1TEZp5SVdhpqP" +
       "7rUMRcbmKPyMcpk8\nNVY1FQjQrizuKRUAuEVXQSMjnbn6xYH+gWdO8ApRVD" +
       "lhACjBi+B5ERwvAvwI1AsKBJj9ZYV5oomX\naX/8+m7PwufarbNBFBpBESWX" +
       "s4k4pmLoK1FV9SksZwgDVrUPxAw7ALzoGGAQnGZUMMQwD4mZNFFz\nMda8Dk" +
       "3ATAQAzRy6+dVvman3KCxoGRdT6zw0KMo+Hlu0Nb17654TzSEqNFVC85tnvb" +
       "WMeinO2Gba\n5a793NiTf154raKJ26c69a4BcFasSTv/+lPhjssfVl5kOXZJ" +
       "osrHJmlMOOSqvVi3mxjD+ncvp06+\ncO34YyxQHmmIoHJxDLYtSoRAYl1OAY" +
       "AY9piqSL6dLJqjK4TaxadebD19ec4NNMzXzIyIjj/6R/SY\n+PFu3nI1hYXv" +
       "1+xc1+tXcOvGqDQHnCJEN9pVPIlVL7xib9sYybmZrtrZ+MPm+JmDxYEGKaix" +
       "q9Pf\nt61QLSOdf+fct11XvjkKUYygssGhdF9vsh8Cbrytu4xUPVn3cGhC+S" +
       "zIKJbS1RzUXKjU498mMLyJ\n4WTRaMLoSiR/K2RTpi5hGY4fz+9Lf2/5/WTp" +
       "+veDqAQ4F04dIgJXAIWvKHZeQJM9LpqoK9CszOpm\nTlTpJ/ecqCATpj7lrT" +
       "BeWMDmCyGTlfA0wFPnEA37pR9r6LCIswiTbmZjC0dgkM5X0qHVwVqAjm1Q\n" +
       "l0UegntNU5ymzZY/MtPwyqfiq0C/QIOWsh8zlkMFfedYoONG30f63kNQ2Tgm" +
       "g5Bm8FDrrzxneH4e\nHDh99Vjr919fcs4M313Ek/o5c9Q++/S5GVbhCNwKRG" +
       "vQqx7cSugswE5qKAAjKF5HOlZwWn2I9h/V\njHevg3hqwBG9xAiKLCR1SVQT" +
       "m944XznzvB3fyiNZ4BNIbMrkGy+92XqziUXgOAz7TiXnvWxSNAe9\n9qE/Ww" +
       "h6cB7il3QTj5rAyaNKzlDZGQDckYC5YGzoWtO2dm17Z/cqgqJURnBzSY0uhn" +
       "sNKxmlX4Hf\nIRD7Ei9AyQA8LQ5KWv4nStwahzidsfd+nttHZnO7roOtJ+iw" +
       "k6BVdzzyNqztblsTh30CWiR+H3R3\n2DrPSUbTJqTZvM+n4cSy24tltRfL43" +
       "cbS+f69ngXQZWSbULHkrRCZjPeMk88IpysOV3GqjAr7cQi\ne7Gs8WLBdxtL" +
       "vLu9u5OgkG2qbgxRVnUayI7h5J17MEVQqWgY6rQ/Ks3rhPVeVPp/xenqts6O" +
       "9u4O\nwGkFw6nn7zY19HK2CUuKBR2E8gSVUNP0RK295R8Kfu2Vmmf2PHDBqP" +
       "6cce7s1bQcOjFrq6qP0v30\nHjZMnFXY3ss5lfJETMFte/7bEiQeRraRSS6/" +
       "H/5JmFsewOvM/PIHCbqnUB5y5L34RQ+DNxCl0yPG\nHC3OuTBv/AscLOy6sw" +
       "0AAA==");
}
