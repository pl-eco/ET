package net.javacoding.jspider.core.model;

import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;

public class EMailAddressReferenceInternal
  implements net.javacoding.jspider.api.model.EMailAddressReference
{

    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected int
      resource;
    protected java.lang.String
      emailAddress;
    protected int
      count;
    
    public EMailAddressReferenceInternal(net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                                         int resource,
                                         java.lang.String emailAddress,
                                         int count) {
        super();
        this.
          storage =
          storage;
        this.
          resource =
          resource;
        this.
          emailAddress =
          emailAddress;
        this.
          count =
          count;
    }
    
    public net.javacoding.jspider.api.model.FetchedResource
      getResource(
      ) {
        return storage.
                 getResourceDAO().
                 getResource(
                 resource);
    }
    
    public net.javacoding.jspider.api.model.EMailAddress
      getEMailAddress(
      ) {
        return storage.
                 getEMailAddressDAO().
                 find(
                 emailAddress);
    }
    
    public int
      getCount(
      ) {
        return count;
    }
    
    public void
      incrementCount(
      ) {
        count =
          count +
            1;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYe2wcRxkf2+fz6xI/4qZu7cSPGhqr9tnnV+JYamPZjnLJ" +
       "Jb743LQxDtf17py9\nyd7udnfufElLBKIkbf+oGrXQVgqJQFSRUASIqAVERQ" +
       "htyjMS+I+2gFqBUlVFkKoIoUZQFL6Z2b2b\n2zvbQjiWdm88830z3/P3fbMX" +
       "b6By20Itsh0kx01sB8djUcmysTKuSbY9A1Nx+Wp5VfTCPt0oRSUR\nVKoqBN" +
       "VGZLtXkYjUqyq94YnRjIXaTEM7vqAZxNmnYJed93y69JvTe5vLUO0sqlX1GJ" +
       "GIKo8bOsEZ\nMosCSZycx5Y9pihYmUX1OsZKDFuqpKkngNDQZ1GDrS7oEklZ" +
       "2J7GtqGlKWGDnTKxxc50JyMoIBu6\nTayUTAzLJqguclRKS70pomq9EdUmox" +
       "HkT6hYU+xH0UlUFkHlCU1aAMLNEVeLXrZj7246D+TVKohp\nJSQZuyy+Y6oO" +
       "lmj1cmQ17twHBMBakcRk0cge5dMlmEANXCRN0hd6Y8RS9QUgLTdScApBd6+4" +
       "KRBV\nmpJ8TFrAcYKavHRRvgRUVcwslIWgO7xkbCfw2d0enwnemvIH/vN09J" +
       "M25nOfgmWNyl8BTFs9TNM4\ngS2sy5gz3kwFnw8fTrWUIgTEd3iIOc3YZ37w" +
       "YOTDy62cprkIzdT8USyTuPzpcMuW5bH3q8qoGJWm\nYas0FPI0Z16NOiujGR" +
       "OieXN2R7oYdBd/Ov3m4S9+G/+1FFWGkV82tFRSD6MqrCvjzrgCxhFVx3x2\n" +
       "KpGwMQkjn8am/Ab7H8yRUDVMzeGHsSmRRTbOmAihCnhK4NmG+F81fUGUTO6X" +
       "VA1CG0LXzhosTGNK\nl7SgSdCYjskcDQnZUCAY5o7apqpga042LDyXNBSsza" +
       "2xR4ZKUbtUUkLT2ZuMGkTuHkODHePyheu/\nenxy31NPctfScHTkJ+gBkCKY" +
       "kyLoSBGkUgSZFMFVpUAlJez8O/MdQD2q0MT72/dH657psV8tRWWz\nqEpNJl" +
       "NEmtcwJKykacYSVuKERWy9kB0sKCGiA/MQ3CBUXIONWDKBxdMW6vAGcS71wz" +
       "CSQLzlk7d+\n+1F86RKNNxofjXR3Lhp4+xiXLdAVO7L3kSc7yijRko86Ekg7" +
       "1949Ln/09P5Lb/363W25ZCGosyCH\nCzlpDnrFj1qGjBXAuNz2L/xrz8fPlY" +
       "+8Uop8kNgAbUSCgASc2Oo9Iy8XR11co8YCzpqEYSUljS65\nYFRNFi1jKTfD" +
       "YmgDG9eBAWrgKYdnsxPN9fRFFxvoaxOPOGpPjw4MNW9+2d/39ms1V5lRXICt" +
       "FZA4\nhglP1/qcO2YsjGH+3Rejz331xunPMV84ziDIb6bmNVXOMPnuLAHfby" +
       "oCHcGmxue/1nX2bdfZm3K7\nj1mWdJz6OvOl5S0v/Vz6OsAKpLetnsAse33s" +
       "JB8wNWF3y8nx/RyMOHQ9fvb6qa4//f6aA29C2cxR\n/SX+ROrVr1xeLqUmro" +
       "ICJtkH3CxjBZSOSlhRATeykKczVcye1TyRQwRVM85QX39/CCRqgKNoxQ2q\n" +
       "SjBiyJIWnvjGlZrlM6nhvVyWDQJBeCKeab32ctetNiaDc6RfgFDn/4q0ZB3I" +
       "IQD96Sdo7/8NRjtD\n27sHB3qGQY0KGyIeihLzWiNB/athjEMbhLlgjI9j0T" +
       "Co3yw6JGqpSdAi7ZScV2b/0ad8cN8Et0OT\n2MqIhHv6b+HOTR9+zALS45Yi" +
       "dc1zyJmt3/rg0vXpRp7jvPjfU1B/RR7eADBvBswM6NC+2gmM+o37\n2i+enH" +
       "5vnmvSkI+ik3oqOXT+Hdy1KyAXwe4yaFEgR5heQ8zYvTyUJsRQ6mcrA/Q1uV" +
       "6O3r69Z2SY\noABO5khdb9ex7KNAHuRtDp2/301h+u5m4x4KLSz9EBO6wyGh" +
       "CO+tZrtp6+bCY3L+sX++fq66jac7\n5WnJZnFe0ORxxeVHT5wdWI49pHJTe5" +
       "3vIT7xkwfP3bxG3uOhk0Vgelp7plDAQ5JQHHa8la73f+98\nshRVzKI61phK" +
       "OjkkaSmKdLOAAva4MxmBJBbX89tEDjCj2QrT4o0+4Vgv9udCBcb5gJOD+43w" +
       "tMMT\ncOA+4IH7EsQA4hBj6GTve7PgXGVaBgH5sJLx5LwThnNCGIZGPIjG7T" +
       "2xa+TK+ze+q37CUKuatehj\nlMWRvIrNCFhaZpg2bQaF24izU+eUafPcG8ye" +
       "O9Q/0rcuMd8/0h0a6ukHpAzM7AnHXNSipx3JKX8S\nGtFCFalgjn1RA4u9jb" +
       "kUoSkuLkJa+6Ynxybozjt4taXvg3kua4Zng8O0objLVPp6mKBK0MhIWTIT\n" +
       "9f6VNuxwfpH7W7ih5mxYmPOOtw0RdPrYyudFR6xPlQFHDI6wKlPPHCFKQ480" +
       "PRLSOYZA4ZV0b4Kn\n1tG9trjuaUf3ctlI6SRnSab3Zx3YyiFbi9NLCsZ5TE" +
       "yFHaaLlcMrVEYJiuEqzTctLVtWusmxsnL6\n4b8HTklvHCl1wHUXpCsxzB4N" +
       "p7GWw1nvJvvZxdWFlNqHWv+8e/jCF4oBbYsItPlscfnKdy7/ceid\nPzwB4D" +
       "mLKg5MxcbHIpMQ962rHheX69PNB8sW1V8wMHAwr+C6nc80mo901RYmKUufyc" +
       "O7trz2dpvj\nc+T+ettbwakrlKs1a9lTBNUsYDLt5J4YCc+KaTKQq81n1ic9" +
       "BrtDoZ5BAL1G4fx77TZuFzfu+taM\nu92YyItYcXdAjPNUniG74GlxDNlymw" +
       "z5AlwgQBFRbdGY50RjDuaMeX59jLmDGROwpskjQ4FBe/6n\nRC5mzbvgaXOs" +
       "2XabrPky1APQZDyLYsUEobWg0xGk8zYJcpGgjaouWziJdS4OI9tpctYHoAim" +
       "DfrZ\nkTe3fQg6jC2ruove+5oKPkjyz2Zyx/Ij214363/JrtPZT1uVcDlKpD" +
       "RNbJSEsd+0cEJl4lbytonH\n3I8Ial/zownUCvbL1PkhZ3yNoOZVGEFn+iNy" +
       "XCZoc3EO6DmckUj/MzBrPj3kR+4fkfQqXB+AlA7f\nzJYjoXXnrSctNI1CRx" +
       "MzsazSi2jmmz/2HXzmd/9mSF0h80+69DMm9GVpFS6cvWPglOM263TpGv2c\n" +
       "I6csi/qbVirHyDU235F/tmwW27rsWZ0zh6OTRTq7kXVJ8oHt3aHhnhDcZny0" +
       "oViHT2LQBd5VzGZM\nD7HXoxolnHP/C8Hlr5SWFwAA");
}
