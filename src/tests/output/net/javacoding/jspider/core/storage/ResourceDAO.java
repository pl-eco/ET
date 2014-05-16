package net.javacoding.jspider.core.storage;

import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.impl.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public interface ResourceDAO
{
    
    public net.javacoding.jspider.api.model.Resource
      registerURL(
      java.net.URL url);
    
    public void
      registerURLReference(
      java.net.URL url,
      java.net.URL referer);
    
    public Resource[]
      getAllResources(
      );
    
    public Resource[]
      getRefereringResources(
      net.javacoding.jspider.api.model.Resource resource);
    
    public Resource[]
      getReferencedResources(
      net.javacoding.jspider.api.model.Resource resource);
    
    public ResourceReference[]
      getIncomingReferences(
      net.javacoding.jspider.api.model.Resource resource);
    
    public ResourceReference[]
      getOutgoingReferences(
      net.javacoding.jspider.api.model.Resource resource);
    
    public Resource[]
      getRootResources(
      net.javacoding.jspider.api.model.Site site);
    
    public Resource[]
      getBySite(
      net.javacoding.jspider.api.model.Site site);
    
    public Resource[]
      findByFolder(
      net.javacoding.jspider.api.model.Folder folder);
    
    public net.javacoding.jspider.api.model.Resource
      getResource(
      java.net.URL url);
    
    public void
      setSpidered(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLSpideredOkEvent event);
    
    public void
      setIgnoredForParsing(
      java.net.URL url)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;
    
    public void
      setIgnoredForFetching(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLFoundEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;
    
    public void
      setForbidden(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLFoundEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;
    
    public void
      setError(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.ResourceParsedErrorEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;
    
    public void
      setParsed(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.ResourceParsedOkEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;
    
    public void
      setError(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLSpideredErrorEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;
    
    String
      jlc$CompilerVersion$jl =
      "2.4.0";
    long
      jlc$SourceLastModified$jl =
      1051926914000L;
    String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVaC2wcxRmePTt+xIY4jhPcPI0TSAx35/O9bMdVieMHcXLE" +
       "Jk5EMU7NenfOWby3\ne92dsx0aIgrhVdFKNBSoSp+0QkWISiCgLwkoj7aoVN" +
       "SVyqO0paKiVJQK+hBRRZv+M7t7O/c2W87S\n7q1n/5n/8f3/P//MzoPvoFWm" +
       "gTZLZpAcT2MzODQ5IRomlodU0TQPQ9OM9Oyqxon7D2i6DwkJ5FNk\ngtYkJL" +
       "NbFonYrcjdY8MDSwbqSOvq8TlVJ/Y4BaPs3v7B4i9u2b+pBq2ZQmsUbZKIRJ" +
       "GGdI3gJTKF\nmlM4NYsNc1CWsTyF1moYy5PYUERVuRYIdW0KtZrKnCaSjIHN" +
       "Q9jU1QVK2Gpm0thgPJ3GBGqWdM0k\nRkYiumES1JK4RlwQuzNEUbsTikkGEq" +
       "guqWBVNj+NTqKaBFqVVMU5INyQcLToZiN2j9J2IF+tgJhG\nUpSw06V2XtHA" +
       "Etvye2Q13nEACKBrfQqTY3qWVa0mQgNqtURSRW2ue5IYijYHpKv0DHAhaGPJ" +
       "QYGo\nIS1K8+IcniGoPZ9uwnoFVI3MLLQLQevzydhIgNnGPMw4tMbrmv/zuY" +
       "n3OxjmtTKWVCp/PXTamtfp\nEE5iA2sStjqeyQTvHLsys9mHEBCvzyO2aAYv" +
       "ePxI4q0ntlk0m4rQjM9egyUyI30Q37xlefBPjTVU\njIa0birUFXI0Z6hO2G" +
       "8GltLgzRuyI9KXQeflk4eeu/L6B/DbPtQwhuokXc2ktDHUiDV5yH6uh+eE\n" +
       "omGrdTyZNDEZQ7Uqa6rT2f9gjqSiYmqOOnhOi+QYe15KI4Tq4RLgCiPrr5ne" +
       "CDqHumbGkPDw4Hgw\nTVCPhsk0dQBJlwH66WvMtCJjY1rSDTxtgtMCiNM5fZ" +
       "YojzWLgkCDNT/UVPDLfboKI8xI97/x/ImR\nA7fdagFHnc2WjqBu4Bp0uQZt" +
       "rkHKNWhzDXJckSAwfuflmpPiI9Mw+uvDAy1fCJiP+VDNFGpUUqkM\nEWdVDO" +
       "Enqqq+iOUZwvxvLefrzMXAP5tnwVVBiBkVBmKhAfZbMFBnvku6gTwGTyL42f" +
       "LJsy/+bWbx\nEeo9FO02OrolGmA3b8nW3DV5dP/Vt3bWUKLFWgrDEgvB8yiX" +
       "fAuO0mTgjJ+a/cy/nv7a6g5rfNpn\nszMAMMvvSRPEmRvrQi/9uOlZZnMnl6" +
       "zhks4kJpZnrnVlPWxgDO2/u2fi9JfeueUqJqglaQ1BDeIs\nqC1KhIBhndRD" +
       "UF06M6sqEqfJuiLBE2xvu/OurntfKqrAllIxz/LVLZ98r/lm8ZmjVmS25gI/" +
       "omVS\nsa+/jLv2NEtF3KuR6OmAihew6oqXz+0ylgsdS6+5YtsfR+P3X5cvaC" +
       "t1cuz0GRm6LLfbjPTUQ0/8\nNvbyq6dAiilUf3B8cmgwMQICbyvLbkZau7Dp" +
       "8ppjys98LBPTrFYkg+d2GuDVhInAwDABadRgtKVx\nqdBlJwxdwjLMUi7fu/" +
       "+9793Tq/of9aFaSM0wORERUgpk+q35zHOy6YDjTZQV9GxK6kZKVOkrZzpZ\n" +
       "TY4Z+qLbwvLEOey5BSzZBNcuuM618xH7pS9b6W2dlVUYdSe7X2B5oI8+76S3" +
       "LtvXBHr3Ay7rXA8e\nNAzxOA22pc8ub/nyT8WvQpaGbGkq12KWDAU2Fs0g7T" +
       "yYVm63ZoIT975xc9frr7xgzxZcFeJS/WXm\nVOaxm55YZqA1Qj0gmgddQKAe" +
       "oU8Cm6PBpiznWNDQ+2orcw4Tu2dPrC8KArUCJ1q/BBU5mNAlUR0b\n/uZTTc" +
       "t3ZOL7LVHO4QjGhmeWtr3wna6zHUwEm2MdNyHZ/9cviMZBNyTozwhBuz90st" +
       "/dE/VHwoFI\nP0E1GcMKpzaCmpnpaRI/ciiRiwu976HY2oFO/x8gqMnAc4AP" +
       "NqADo9lrmWOCM0eEvRilt8u9CtvT\nE4iGCGrj2O00O6xQcaTvKjH7iGklmN" +
       "JlrGanHsS6xHOceACuFtuJW/5PJ3aM5bPIeMMc5QwTcw3z\nKW+GifsjfYFo" +
       "zEKRjnOA5zXL8Yq7vCSvvKK9gVgfQfUGSyEG41fZS67IhS2bfyBINvFRO2Eo" +
       "KfD1\nBbvMe3TqHyH5zYuHrWhp55cPPOG+8Fm8Y91b77LpIi92i9SSeUzu2P" +
       "rtNx9541CbNdlYBff2gpqX\n72MV3Uyx5jSd7s4vx4FRP3Px+Q+ePPT7WZ9t" +
       "kG6Cahd0usqpY/KGirnjTjpL2e7Y+hG5I8opU8pA\nRouLOUwGVdXxAZNWJh" +
       "wGLDNTDU8tHnhn1+b3v+JDvjK5s8hSIDvCjPRwzY73fD/asINNXrWzomml\n" +
       "1/w1VOESKWflwyRvyjHiujJG5APlei5QellWPZJOp53GWA8fqTd4i54+msJo" +
       "vm3PM2w2jRXzgkvg\narMVaPuIvMCZNDn9b+f073dV/bwnVcMhfzQWiIehxj" +
       "TsF8yild3uZlgfg3WsDEFXrK730dcnCrAt\nZRpet7s43fqKYctlxnu8KgzY" +
       "xiNQ6RWXviLEG2w9NlQP4m+5ZujvcTW+z5vGYa8Q38tDDJOAXAni\nUqbhdX" +
       "uQ0y1UDOJeV+GHvCpcAHGO9GUhvhSudluP9upB/H3ODFzN9QNvGkf9sUigN/" +
       "ThIX6YoPVg\npDFN0lMsCpz5vgjCm8tYhlftJ5xq4bRT8IVXXPBlhcjxC95K" +
       "z3m1EvhFbw+ss4qqXNEtNtrKb6ye\nW7zI2Y6bx37lTeG4V7d43nKL8QyZ01" +
       "fiFqUsw6v2KqdalAX+M7kAR119X/OqLwdwofBlAe6xVUHO\nb3UAfpOzApfp" +
       "/uxN4T5/pD8QhTIfltkEO6F2QcVQmwTqyl7wOkEtNIPqOqmU+UtZjlf975zq" +
       "8WKZ\nv8+1xz+92oOuPaFw+1i+3GWxvwiurbYGW6uH/X85A3CV21lPukZCdF" +
       "Mg2mNjTwd6uzKkZ0AEMM3e\n45OOvxRiWcoSnCpCA6dK0ULN1U9Y7VU/iiWU" +
       "La1ZgcuCSDfZO2zRO6oGotCW1TwecmszYb03JcP+\nSJw5bF2S7dg7IbyzYg" +
       "iPMvqKiAvnEtSchIXt3uOjLodC0EtZjle9g1O9WOnWH3Lt0enVHgB6DGas\n" +
       "9bzMZXGnG5qdtvSd1cPdzynvliJCwJueOTt6dLDKezPChQQ1sYLWTmmccFFO" +
       "uLArXIygS8sJR0Rz\nfnpRN+anh7EEzePaJHsLhIfhFQgai/hjfYHe/osI6i" +
       "LHFDP7YYgTBFTa1cU3MM8oBtUn4NphQ7Xj\nI4KqcNtOuISzhltUCHu8QRX3" +
       "h/sCkRLbdsIwx8st2ARvG73AK9IbiENOX4UXsEacbNBf7lMdowwq\nqbRKN4" +
       "ItALE8Pj9C2yt7Ffhgk4mJ04+SFA2zAFwX2thdWL0wO8zZ013sC0e82bOP2j" +
       "MarRhmRQS5\nihOkN7uKuWwlH03xEqxd6IeA4Ji2AGPI9HADPmyImvV9YMR5" +
       "zxgdJKiNflie02AMeVQ36FkJGLsk\nEkN20kPOb3WiKMkZwK3MhDlPSERD5T" +
       "a/hXmOF1c5qF55RSGK4vlRFF15FI3qGU0uE0BF/IW4KvSw\nyVE4ytqvhrks" +
       "B95RTKRj5fDdjayKFDm/1cH3Ok5grpA56c3mYX+4PxCJl8D3Bo4XNz/d6JUX" +
       "+FKs\n18GXjpReMU63caJEOJwWoU4CnACgWUWWsVYSnkG4/DY8/urB80VOTm" +
       "4SO+3NZFF/OBaIhEvAczfH\ni5vEvO2wAq9INBCP5offJSsMP2c068jYiGHo" +
       "xoeLxG9w2sQ5hG8nqAEQZiOWRJfu8AZtdIPVQ/e7\nnIzuNoDwgDeLQ4kSD0" +
       "QiJdB9iOPFJfLveeUVsXaTc9H9uCd0y1YpRaB9nFOln4P2PmgHaK1BS2JL\n" +
       "y8+QjW2oetg+6QoZ5lZET3mzd1/ZyH2W48UlcW8bpMCLRm5B+blSbLny00PY" +
       "/pJTJcxh+8OCsF2C\nkpWTnJ6kai84b2qdipQ6l6/e9XR67c+tz5XOycWGBG" +
       "pIZlSVO8rDH+upSxs4qTCfaLCO0Fgi/pqg\n7SsoAAmqt5+ofsKy1fk3BG0q" +
       "05mgWvrD93iFoA3FewAH+4mnf42gc3PpCVrt/sOT/gH8CUjp4+vZ\n4raFnS" +
       "ihB/OC1nmbpfT/AOdDnKsRLAAA");
}
