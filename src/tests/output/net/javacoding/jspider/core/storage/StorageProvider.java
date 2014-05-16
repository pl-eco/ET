package net.javacoding.jspider.core.storage;

import net.javacoding.jspider.core.util.config.PropertySet;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;

public interface StorageProvider {
    
    public net.javacoding.jspider.core.storage.spi.StorageSPI createStorage(
      net.javacoding.jspider.core.util.config.PropertySet props);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVWbWwURRie++hdry1er3w1tNCmSLAJvbPWNsIlhtqPcHDQ" +
       "g8MIteSY2527Luzt\nrrtz1wORaERAf5gY8CtBjT8MiTH+0Ih/TJAgfkUS0z" +
       "+gxkSDPzSK0R9GYjD4zsxub29bkOgmOzs7\n87zzvvN+PDNvXUUNlok6JStO" +
       "DxjEio9kM9i0iDyiYsvaCUM56UJDJHN6i6b7kS+N/IpMUTQtWQkZ\nU5xQ5E" +
       "RqNFk1UbehqweKqk7tdeatsmH19Zkvjm3uCKDoJIoqWpZiqkgjukZJlU6ilh" +
       "Ip5YlpDcsy\nkSdRTCNEzhJTwapyEIC6NonaLKWoYVo2ibWDWLpaYcA2q2wQ" +
       "k+t0BtOoRdI1i5plieqmRVFreh+u\n4ESZKmoirVg0mUahgkJU2XoEHUaBNG" +
       "ooqLgIwGVpZxcJvmJinI0DvEkBM80ClogjEtyvaOCJLq/E\n3I7v3AIAEA2X" +
       "CJ3W51QFNQwDqE2YpGKtmMhSU9GKAG3Qy6CFohU3XRRAjQaW9uMiyVHU7sVl" +
       "xBSg\nItwtTISipV4YXwlitsITM1e0JkItfz+T+bObxzwoE0ll9odBaJVHaA" +
       "cpEJNoEhGC18rxk6nd5U4/\nQgBe6gELzPCa9x9M/3i2S2A6FsBM5PcRieak" +
       "60OdK2eHf4gEmBmNhm4pLBXqds6jmrFnklUDsnnZ\n3IpsMu5Mfrjj492Pv0" +
       "l+9qPGFApJulouaSkUIZo8YvfD0E8rGhGjE4WCRWgKBVU+FNL5P7ijoKiE\n" +
       "uSMEfQPTad6vGgihMLw+eGNIPItYQ1EsC4kIgcmYekWRiRk3KBrUCJ1iSSDp" +
       "MoR/ap9lsKkpSTfJ\nlCXwU/PkqkxXdMbnY0XrLTkV8nOTrgIwJ52+8vmhsS" +
       "1PHxcBZElnW0nRAGiO1zTHbc1xpjlua457\nNCOfj+tcXu9aFiuZldQv7yRb" +
       "n+2zzvhRYBJFlFKpTHFeJVCKWFX1GSLnKM/FmCvvebpBrrbkIW3B\nkJwKC/" +
       "EyAV9WTNTjTc9aUaeghyHnZg/f+PLX3My7LJNY5Jew1YVpEMf9wraW3uyezX" +
       "uP9wQYaCbI\nQlLl5bicafF6cZwRg7N+Kf/oH+dfbeoW6zOZTmcBUOaVZGRx" +
       "7cnQ3Zc+aL7A/e7wStRFQFlCRZbG\narbuNAmB8W9fypx4/uqxh7mhwtIARY" +
       "04D9vGEqXgWIeGKAoZ5byqSK6dLF6gkOLtS06+0Hvq0oIb\nWHmz+ufcdWzX" +
       "7y1H8Ud7RJW21Qd+TCuXBl+7THo3tkgLpFiE6kafSipErZnn1baV86Lj6ehD" +
       "Xd+P\nD51+zGsoT3TiyIyNbK0Xy0nn3j77zeDlr4+AFZMovG0iOzKcHgODu2" +
       "6pLifFKh3bA9PKp37Oyozh\nFmDzeqGke5twKJgEDiONOYyNRKrzUxbKRyIy" +
       "nFg1vS/+tem3Ew3r3/OjINA0HFQUA70A66/yKq9j\n1qSTTUwVSDYXdLOEVT" +
       "blHC1NdNrUZ2ojnCsW8X4reLIZ3iF4ozY38S+bbGPNYsEsHN3D2zUiA/2s\n" +
       "v5Y1vXau+Vi7DuKyuJbBw6aJD7Biqz4xu/LlT/ArwNjAnJZykHBi9M0Fs90d" +
       "TMHz4lQ4dOrK0d7v\nvrponxyuG0kN9VPuSPnMU2dnedAicDfA1rZaQOBuwn" +
       "o+fl6DTznniNCwtkmw5yi1JfsHhtaDQW2g\nid1l4oocT+sSVlOjr59rnn2u" +
       "PLRZmLLIBUiN5qpdF9/ovdHNTbA1hlyHk/0frmBzW60k2GeMovv/\nE+lv6B" +
       "9cNzDUNzhAUYNh6obF47DkX5icxwXyq6AUWR7yWxKQTH0QWbuRJYLNCuw/SW" +
       "HLJsGU2JZw\n1APCexmX9+7jE+Os2f5/9tbf3zd4L9y+6pSutbpFfTmbved2" +
       "ji0Yc46ubCaFqsC9HpWMetvnXVbF\nlUrqmd1713kj9hkvzrlrTyOEt1BWVV" +
       "ftu3kgZJikoHDvNIqaE67aTdHq27CZorDl8vMuITxFUcct\nhCkKso9bAi6E" +
       "yxaWAA12z43PU3RHPZ6iptqPGwrqAgBl3YLhxKOVVz87yeOiQKvGPyXbJbZO" +
       "DAAA\n");
}
