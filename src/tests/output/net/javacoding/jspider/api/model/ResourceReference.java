package net.javacoding.jspider.api.model;

public interface ResourceReference {
    
    public net.javacoding.jspider.api.model.FetchedResource getReferer();
    
    public net.javacoding.jspider.api.model.Resource getReferee();
    
    public int getCount();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1XfWwURRSfu2vveu1BP4GGFloKBC/AXYvQCNWEph/24KBn" +
       "i1HOkmNvd65d2Ntd\nd2fbA4FARED/MCHgV4IaEw2JIf4hAf8xQQL4FUlM/w" +
       "E1Gg2GYBSDMUZiMPhmZq+3tz3AYOIlOzc7\n8968N+/93seeuI7KTQM1i2aE" +
       "7NCxGekZTgiGiaUeRTDNTbCUEi+UBxPH16uaF3niyCtLBFXHRTMq\nCUSIyl" +
       "I01tuVM1Crrik7RhWN2OdMO2XNwlsTXxxc1+RD1UlULavDRCCy2KOpBOdIEo" +
       "WyOJvGhtkt\nSVhKoloVY2kYG7KgyDuBUFOTqM6UR1WBWAY2h7CpKeOUsM60" +
       "dGwwmfnFOAqJmmoSwxKJZpgE1cS3\nCeNC1CKyEo3LJumKI39GxopkPo32IF" +
       "8clWcUYRQIZ8fzt4iyE6P9dB3IK2VQ08gIIs6zlG2XVbBE\ni5tj6saL1gMB" +
       "sAaymIxpU6LKVAEWUB1XSRHU0egwMWR1FEjLNQukEDT3jocCUYUuiNuFUZwi" +
       "qNFN\nl+BbQBVkZqEsBM1yk7GTwGdzXT5zeGvQH/r7hcSfrcznZRIWFap/AJ" +
       "jmu5iGcAYbWBUxZ7xpRY7G\nNlvNXoSAeJaLmNN0L/7g8fi1My2cpqkEzWB6" +
       "GxZJSrzV2TxvsvvHoI+qUaFrpkyhUHRz5tWEvdOV\n0wHNs6dOpJuR/OZHQx" +
       "9v3vsu/tmLKmLIL2qKlVVjKIhVqceeB2Ael1XMVwczGROTGCpT2JJfY+9g\n" +
       "joysYGoOP8x1gYyxeU5HCAXg8cAzE/Gfnw4E1VNoWoaIp4wV0QlaqWIyQmEg" +
       "ahIAYGSbqcsSNkYE\nXR7JahJWRkqw5aiw6gmPh0atO+YUAOiApsAhKfH4lc" +
       "939a1//hD3IEWdrSZBK0BwpCA4YguOgOAI\nExyZJhh5PEzknGLTUl9JNKR+" +
       "eb+r5sXl5mkv8iVRUM5mLSKkFQyhKCiKNoGlFGFYrHXgnsENsBpK\nA2xBj5" +
       "QCB7EwAVuOG6jNDc9CUMdgJoBak3tuf/lrauIkRRL1fAM9nasGftzOdQuFh7" +
       "es23qozUeJ\nJsqoS3IsHOdQKW4j9tPEkD8/m37mj3NvVLby8ylPc/4AEObm" +
       "pMni5rP+9ksfVl1gZs/nlWpHAhrG\nhKO0tqDrJgNjWP/21cSRl64ffIopyj" +
       "X1EVQhpOHagkgIGDafhgjy61ZakUXHTepLBFKkseHoy+Fj\nl0peYN6d4p/l" +
       "roNP/hY6IJzfwqO0rtjxfaqVXfXmZRxeGxJLICxINH25gsexUlDPLW0Dy4t5" +
       "S1c/\n0fJDf+fx3W5FfRTnOM/T17OhmC0lnn3vzDerLn+9H7RIosDGweGe7n" +
       "gfKNxyV3EpsXa86THfmPyp\nl2VlmuFKZPNipi7nNaEoGBiKkUoNRleCuemQ" +
       "TRiaiCWoWAW5r/w1cONI+epTXlQGaRoKFREgvUDW\nn+8WXpRZu/JooqKAsy" +
       "qjGVlBoVv50lJJxgxtorDCUsUMNq8BS1bBE4anws5N7J9u1tGhnicWRt3G\n" +
       "xsUcgV46X0KHsI01Dx2XgV/qCwjuNgxhBw223L7Jea99IrwOGRsypynvxCwx" +
       "oqK4s0+g41rHJn3v\nIqhyFBN+dwOENDqdz+sCryK7jl05EP7+q4t2pXF0MA" +
       "Wqn1L7rdPPnZlkTg5CLyGYGwsOhF6Gzjys\nvoMPWI7irqRjJU+2jxKbc1XH" +
       "6g5QqA4k0d4nIkuRuCYKSqz3rbNVk4etznVclRkOglhvKtdy8Z3w\n7Vamgi" +
       "3R7yhm9ntgXDA2FkKI/g0Q9PD9lIg1Dy3r6Fi+sgPqTsGSS8xWDldm9QaC2u" +
       "9ZBPoxEcew\nlJeAGGdnEZ7a4Km08VT5H/HkRsM9oZJwQoVjvo+7bLPDZSvY" +
       "RowOSYIeuS+DdrRTiz640mlRPM2i\n4X9dVkuZsgmekG3K0P9tyq1QZuBmPZ" +
       "qlEoB4kzPmEoacBaSO2w3eqeTv7dLVpb0c643ODwcn4cCK\n23hR/bUbrDi4" +
       "Iq9EF+kScnj+21dPXhlq4KWFt9oLp3W7Th7ebrPLhHRa3BbcTQKjPr90wYk9" +
       "Q9+l\nvbYRogT5oMBCaeXYQTnoV6bBgZbuxmkfO7wlF9smtz5wTq/9jCX3qb" +
       "a5AsI9YymKo3Y464hfN3BG\nZipU8JzNUQyatN4LUgSVs3/mVZPzTcAXxJ35" +
       "4JIwOul3wodPaXqCAvbMSb+boJnF9BCIhRcn6V6Q\nBqR0uk/Px0kNKxu0BY" +
       "zwTJ3T/wFBGZd0hw4AAA==");
}
