package net.javacoding.jspider.core.storage.impl;

import net.javacoding.jspider.core.storage.EMailAddressDAO;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.Storage;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.EMailAddressDAOSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.logging.Log;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.ResourceInternal;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.EMailAddressInternal;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;

class EMailAddressDAOImpl
  implements net.javacoding.jspider.core.storage.EMailAddressDAO
{

    protected net.javacoding.jspider.core.logging.Log
      log;
    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected net.javacoding.jspider.core.storage.spi.EMailAddressDAOSPI
      spi;
    
    public EMailAddressDAOImpl(net.javacoding.jspider.core.logging.Log log,
                               net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                               net.javacoding.jspider.core.storage.spi.EMailAddressDAOSPI spi) {
        super();
        this.
          log =
          log;
        this.
          storage =
          storage;
        this.
          spi =
          spi;
    }
    
    public net.javacoding.jspider.api.model.EMailAddress
      find(
      java.lang.String address) {
        return spi.
                 find(
                 address);
    }
    
    public void
      register(
      net.javacoding.jspider.api.model.Resource resource,
      net.javacoding.jspider.api.model.EMailAddress address) {
        net.javacoding.jspider.core.model.ResourceInternal ri =
          TypeTranslator.
            translate(
            resource);
        net.javacoding.jspider.core.model.EMailAddressInternal ai =
          TypeTranslator.
            translate(
            address);
        spi.
          register(
          ri,
          ai);
    }
    
    public EMailAddress[]
      findByResource(
      net.javacoding.jspider.api.model.Resource resource) {
        net.javacoding.jspider.core.model.ResourceInternal ri =
          TypeTranslator.
            translate(
            resource);
        return spi.
                 findByResource(
                 ri);
    }
    
    public EMailAddressReference[]
      findReferencesByResource(
      net.javacoding.jspider.api.model.Resource resource) {
        net.javacoding.jspider.core.model.ResourceInternal ri =
          TypeTranslator.
            translate(
            resource);
        return spi.
                 findReferencesByResource(
                 ri);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1Ze2wUxxkfn98PMLZ5JTbYEKfgxHf2nc9ng6s2jm3KwWE7" +
       "PhOK4+iy3hubhb3b\nze6cfdAUpSoJaVSliiBpqxKiolS0VdpEQUn/SFWCAn" +
       "0GKfUfJE2UqBUoompBQW0FSpPSb2Z2b+f2\nDgOyLe3eeOb7Zr7nb+abffkS" +
       "KjYN1CCbPrJXx6avLzosGSaO96mSaY5CV0w+U1w+fHxrUvOgggjy\nKHGCqi" +
       "Oy2RaXiNSmxNvC/T1pAzXpmrp3StWINU/OLBvv+nzmnYNb6gtR9RiqVpJRIh" +
       "FF7tOSBKfJ\nGKpK4MQENszeeBzHx1BNEuN4FBuKpCr7gFBLjqFaU5lKSiRl" +
       "YHMEm5o6TQlrzZSODbam3RlBVbKW\nNImRkolmmAQtieyWpqW2FFHUtohikp" +
       "4IKplUsBo3H0X7UWEEFU+q0hQQLo/YWrSxGds20X4gr1BA\nTGNSkrHNUrRH" +
       "SYIlGt0cGY2btwIBsJYmMNmlZZYqSkrQgWq5SKqUnGqLEkNJTgFpsZaCVQi6" +
       "84aT\nAlGZLsl7pCkcI2ilm26YDwFVOTMLZSFomZuMzQQ+u9PlM8FbQyVVXz" +
       "w9fLWJ+bwojmWVyl8KTKtd\nTCN4Ehs4KWPOeC3lOxzemWrwIATEy1zEnKb3" +
       "7l9tj1w82chp6vPQDE3sxjKJyZ+HGlbN9l4oL6Ri\nlOmaqdBQyNKceXXYGu" +
       "lJ6xDNyzMz0kGfPfjWyG93Pv5z/A8PKgujEllTU4lkGJXjZLzPapdCO6Ik\n" +
       "Me8dmpw0MQmjIpV1lWjsfzDHpKJiao4SaOsS2cXaaR3xvwJ42qx2NX2BBwa2" +
       "SYoKoQ2ha/b3DoUT\nuurTCfpKEpNxGgiyFocQGN9t6kocG+OyZuBxE4IXnD" +
       "muAPF43gnSdOHqmYICmsHu/FMhWDdrKkwX\nk4+f/+NjA1u/8xT3Jo1AS2SC" +
       "vgwi+BwRfJYIPiqCzxLBR0Xw5REBFRSwxVdkG5x6ME4T7Z+v9Sx5\nxmu+4U" +
       "GFY6hcSSRSRJpQMSSopKraDI7HCIvQGiEbWBBCBFdNQDCDRDEVJmLJAxaeNt" +
       "Bad9A6qR6G\nlgSROLv/+ruXYzMnaHzReFhKZ+eigXf3cNmqWqIPb3nkqbWF" +
       "lGimiDoOSJtvPntMvvz0thPn/vTR\neic5CGrOydlcTppzbvGHDU3GccA0Z/" +
       "rvf7b500PFG173oCJIZIAyIkEAAi6sdq+RlXs9No5RYwFn\n5aRmJCSVDtng" +
       "U0F2GdqM08MCaBFrLwEDVMJTDM8dVvQuoy86WEtfdTzcqD1dOjCUvPbtkvb3" +
       "fl15\nhhnFBtRqAXmjmPD0rHHcMWpgDP0f/WD40HOXDj7EfGE5g6ASPTWhKn" +
       "KaybeiAHxflwcqfCuXHn6+\n5ch7trPrnNl7DUPaS32d/tbsqh/+TnoBYATS" +
       "2VT2YZathWylQmBaie0pB/q2cfDhUPXYkfNPtvz1\nL2ctOBO2SYfq77EDqT" +
       "eeODnroSYuhw1LMgftFGMbJm0VsE0E3MhCnvaUM3tW8Cz2E4uz0x8KgUC1\n" +
       "sBLdYH1K3BfRZEkN9//4VOXss6nQFi7KIoEg3B9LN579Scv1JiaCtWKJgJjW" +
       "/6XTkjHoZD/9CRD0\ntfmh0MaAv7WjwxtsJ6hQ1Xj4LSVo3VzAAnRTtDNi0b" +
       "dxK2wUrNDFBjroq2dBZAwGvCGQsdSituUM\n3AoAQp8vytvR4bAocq8gcrcj" +
       "8v0LInIo4O0OglmB0xZ3462K65oUxLYTib5bWdtLE5wlAWLKrLVI\nKM66N5" +
       "RN9MBkg1Ri4hv/eftoRRNPOsrTkMmlejGXsrhi8qP7jnTMRncoPIbdRwkX8b" +
       "7fbD967Sz5\nmCGKg4N0tTXpXAEflASI7j43XVPy6osJDyodQ0vYcVBKkgcl" +
       "NUXxZgxy0eyzOiOQS+J49uGMp3lP\nBucb3BgsLOtGYGenhXZ22juguxie5f" +
       "DUWKBb4wLdAsTyNMoYmtl7XQYiy3VDIyAfjqeF7LNCc6cQ\nmh0uTOGm7r9v" +
       "w6kLl15RrjLcqGBn4l7KYQldznoEMCvUdJOevoTjvzVT85Bu9rBlIWAr2LL+" +
       "9kBg\nA0Gb5psHgdZurz9EUNno5nCUQgddZYzrux9Oe7lqUWEsc6JaFmqL2a" +
       "5APeobSKYS4iAcgkp3jIRH\nRwcG6cTdfJej78EsJ63h9DZfPidN0td2F8ZY" +
       "3lAEbwTZwEOCoTr8C2CoDjBUACCuihnK4qAr7XZE\nov+y7eGrN9LzbnjqLD" +
       "3r8uupW3pmgMnS0RR07MzRMRiaPygGg63+Tq+/244GYKfLEC7LftqeIKho\n" +
       "ZKC3n7Y3MSXTubmDbKRzwLDBOgQK+jwu6BPQbQjuuBUIdomfhvxbdaNyi5WK" +
       "B79+pepJ6fTDHBpr\ns0/UNGY7X3wft9xXJec5xJcTTfeqeBqrDn67V9vGyl" +
       "Abqqp3NP5tU+j4N90AXkRLCRHAs9li8qlf\nnvyw8/0PDoAUY6h0cCja1xsZ" +
       "AIEb51wuJtdM1z9QuEv5PUMaC0tziudspp5sBK0wMNT+ydEsHG3K\nOry2wl" +
       "NvhW59vsMrfX0p7zZYkOv9Q473u9qdrf3wAmztXa2BDd5gB6SlxMfs2Fri4B" +
       "S/Frj5pv09\nQivSZFwU/QUhcDc4oh9dENH9fm8QQH4RXXSd2cTdYivgvUFy" +
       "SHAkSWhxnF1HIsb23Swn9sLTaDmx\n8fac6GFm8YiW+KngRL9jiZ/N3xId/t" +
       "ZApzcIB+gyGNBShpw5U7bc1AgjIocl6iuCqAFH1FcXRNRg\n0BsKOvFGJz52" +
       "89h6iSk3BSUUNtxHu2FDSUBxMW1d/Lw+9q/2+Cf39nP8WileKIqEmwPXcXPd" +
       "xU/5\noS67WMpzJHQt8uzqlz45cX5kKcdAfgV3V84tmMjDr+GYMlU6ReE1c6" +
       "3AqE/fu+bl/SMfT3gsIzwB\nCTat0XvPEiZve76o7bF2TmT/zgt6TguhEHJC" +
       "4cwChEJXa9Dv7ewWopbO/Iubx8JbBC2mKX//3kzw\nGmip4GdWblMrHpjZem" +
       "l9w9UfeZBnjoI4zwVkZoaY/Fph8xXPm8ub2SVI0YRkctB339zmXsxm3bcy\n" +
       "wSuzHLViDkeJLnhXcEEnO/Ac03U909kRFKq92QXxC+BqJ5yXV2QbOYOw+aJu" +
       "EJ57LGXumXfUfSCo\nLOwaHy7AsS3QGmr3dnXdftSdg3KDGiRz1WUK8UcJ3s" +
       "kySNMcBhFVvSCo2p052YVua/PKiJQdF4Ll\nLi6I5SAuuiBf19zIDE6EQBFY" +
       "l2caei22Muf7DP+KIK+dfWT923rNH3ii2Tf9ZRFUNplSVbGCFdol\nuoEnFW" +
       "bJMl7PcrNeJmj9rV4oA6rSH2atS5z9CqD5LbC7CiyL+d8E1c/BDMvRH5HjKk" +
       "HL83PAClZL\npP8MEDCbHqob5x+R9AsoSICUNv+XCS/hcMevFdIWgtrla1TH" +
       "skLv+tLH3ix64Jk//5edlktl/pGM\nfhiCwntaMRXS1puU1L0mu8WgY/TCXE" +
       "4ZEBqElRWWnypNPiP/EFQv1u2ZtZpHdw4P5Jbuwc4Fq9Zg\npiJarc33cwMU" +
       "+3fksxbTQCzpqS6ytej/AVDqlM7iHAAA");
}
