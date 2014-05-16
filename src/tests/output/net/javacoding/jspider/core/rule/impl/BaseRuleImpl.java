package net.javacoding.jspider.core.rule.impl;

import net.javacoding.jspider.api.model.Decision;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.spi.Rule;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

abstract public class BaseRuleImpl implements net.javacoding.jspider.spi.Rule {

    
    public java.lang.String getName() { return this.getClass().getName(); }
    
    abstract public net.javacoding.jspider.api.model.Decision apply(
      net.javacoding.jspider.core.SpiderContext context,
      net.javacoding.jspider.api.model.Site currentSite, java.net.URL url);
    
    public BaseRuleImpl() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVXa2wUVRS+u9tun9Anz7a04aE00lna0hZoTKylyJYFSreo" +
       "1JLlduZuGZidGWbu\ntMtDooK8YjAKvhLUaGJIjPGHRPyhCRLEN4n2h6CGRI" +
       "M/NArRH0aiGDz3zkxndtuCgU1m5u7cc+75\n7jnfOefOW1dQrmmgatEU6A6d" +
       "mEJnvAcbJpE6FWyaffAqIZ7LLeg5sVrVgigQQ0FZoqgkJpoRCVMc\nkaVIdE" +
       "V72kB1uqbsGFI06qwzbpXl866PfHmguyqESvpRiazGKaay2KmplKRpPypOkd" +
       "QgMcwOSSJS\nPypTCZHixJCxIu8EQU3tR+WmPKRiahnE7CWmpgwzwXLT0onB" +
       "bbovY6hY1FSTGpZINcOkqDS2FQ/j\niEVlJRKTTdoeQ+GkTBTJ3I72oFAM5S" +
       "YVPASC02PuLiJ8xchK9h7EC2WAaSSxSFyVnG2yCp6ozdYY\n2/H81SAAqnkp" +
       "QrdoY6ZyVAwvULkNScHqUCRODVkdAtFczQIrFM2edFEQytexuA0PkQRFM7Pl" +
       "euwp\nkCrgbmEqFE3LFuMrQcxmZ8XMF6114eJ/D/f8VcdjniMRUWH480BpTp" +
       "ZSL0kSg6gisRWvWcKx6Ear\nOogQCE/LErZlOha8tyH28+laW6ZqApl1g1uJ" +
       "SBPi9dbqmtGOnwpCDEa+rpkyo0LGznlUe5yZ9rQO\nbJ4+tiKbFNzJD3s/3v" +
       "jYm+TXIMqPorCoKVZKjaICokqdzjgPxjFZJfbbdcmkSWgU5Sj8VVjj/8Ed\n" +
       "SVkhzB1hGOuYbuHjtI4QKoUrAFctsn8V7EbR1PuxSXothURTuiLoFC1RCR1g" +
       "DBA1CWI/sNXUZYkY\nA6JmkAEDBAdkkBzIVEszOyUjgQBL2Ox0U4CbqzQFFk" +
       "mIJy5/vrtr9aGDdvAY4RyEFDWBYcEzLDiG\nBWZYYIYFZljwG0aBADc5I9Or" +
       "LEwSy6bf3mkvPdJgngqiUD8qkFMpi+JBhUAWYkXRRoiUoJyGZT7K\nc6YBTY" +
       "sHgbGAI6HAQjxDwI3DBpqbzUwvn6MwwkC30T03vrqaGDnJSMSCXslWt6FBCL" +
       "fZ2Irr45u6\nNx+cG2JCIzksOiA6/9arJ8Srh9ec/OaLSwu9DKBo/rjEHK/J" +
       "Eisbfo+hiUSCwuUt/8Lfq34/mrvs\n3SDKgWyFekUxsAySf062jYwEa3eLFX" +
       "MWaBYlNSOFFTblVphCusXQRrw3nDZT2K3MZhBzVhZAXueu\n7Q0vvvBB0Tm+" +
       "Y7cklvhqZ5xQO8HKPF/3GYTA+0sv9hx97sqBR7ijHU9TFNatQUUW0xzIjAAE" +
       "tmKC\nZBdmVh57vv74BTeSFd7qHYaBd7BAph8frXnpE/wyFAJISFPeSXi+IW" +
       "4JuQbY/R4+XuSbZP/nOiKM\nXNm5s5K1AjcyqcFdf559pbDOBsN0qv025vH7" +
       "XfYOgxTl40EgABY5eRe6Rjwc1WOkm0lce12da+z6\nZlfD3ccv76//4dvzTs" +
       "X0dWJP6pfEPuvUk6dHgyzABdATsbnWTWvek9kowPsUkIgnHHtTwPdeaFeO\n" +
       "dupoLmlrarK3VgkNbJKCAA+BVYA0QK+ZrE/wHnfg4T+K9+OPNtn4yzOrRJdq" +
       "pVpevUjq7ysWJyhH\nBVTTGxQyTBQvPNnW1vD+6can5KHaH1e2nng0Oz5BVh" +
       "T9Ls5US4hn3j79fcvF7/YBin6Ut3ZdvLMj\n1gWAa29qLiGWDVetD22RP+Wu" +
       "d+rAuK6fqdTu3yYExSBwaFH7MoJSx7GzflEEVxVcs5yewZ9sspzd\nKpycHU" +
       "e+gJ9xkzD/lmnRTVHeEKGMS3x+mU2VuI8qzeDYciAlO+4JsiTENBEr0RWvnS" +
       "kafcZq7baj\nPsUnEF2RSNeef6P+Rh13mUPOsK9/O//zhrGx1mMDe/RRdO/t" +
       "tMblTS2LGhsbmtrgsOfs526zzva7\ny/RSXlZY+xHsExfiMw+MBaISrj64ap" +
       "xA1Py/QATZuPUm0QhxsZDfwYM+B7fwiQ3sJt729pctam5p\naGmFcIr2idrd" +
       "df3NGn6cjzt9Gg4+2Yev1cO39Q7wtSxtaFtCUZFoGdDNaFymxMW4YBKMGGpQ" +
       "SpOI\nIoxJO/h0H742D9/2O8DX1tqwtJmikGUoLq5izhgGbkNv7NbJNEBRLt" +
       "Z1ZYcf6U4f0iUe0l13gLRp\nccNS8ORUbmsczScLuOfMFUSUTUhDlIYt+pdn" +
       "zXfmuO84+2tDnDu6eeFZvewzfmAZ+yLIh7ROWori\nK3f+0hfWDZKUuSPy7X" +
       "OI7ZW9kwc98yRKUQ578M09Yevup6juVrqgxh5+tUMUVd1EDTTYw6/xFHwQ\n" +
       "TqwBaeaM/PJPQ0wy5Skq9P74RZ8FooEoGx7VJyhQdudnvbfSV1njOkSOFd/0" +
       "6+/nrD/y9T+8wLoZ\nz74b4bN8GGJLIx0qBh7KppPb7KjtJB5v3k54ikx7Rf" +
       "s7scr/VT9ma37fxp6udo76QdgP53Jj8+Km\npttmcOuixpaGxmXg8b5V0fjt" +
       "fZTsMdCsiTzD0Tr1G5Xz3jTVcys7jfgndQfDf00xURgGEQAA");
}
