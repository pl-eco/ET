package net.javacoding.jspider.core.storage.memory;

import net.javacoding.jspider.core.storage.Storage;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.StorageProvider;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.util.config.PropertySet;

import et.util.MyUtility;

public class InMemoryStorageProvider
  implements net.javacoding.jspider.core.storage.StorageProvider
{

    
    public net.javacoding.jspider.core.storage.spi.StorageSPI
      createStorage(
      net.javacoding.jspider.core.util.config.PropertySet props) {
        return new net.javacoding.jspider.core.storage.memory.InMemoryStorageImpl(
          );
    }
    
    public InMemoryStorageProvider() {
        super();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1WXWwUVRS+259tt13sDwUqLbQpqK3SWSq0An2xtiUsbNuV" +
       "xSi1ZLmdudsOnZ0Z\nZu5ut4hEIwLyYGLAvwQ1PhgSY3yQiC8mSBD/SUwfBD" +
       "UkGnzQKEQfjMRg8Nx7Z7qz0xb6wCYze+fe\n83++c8597yoqtS3UKNsSnTKJ" +
       "LfUm4tiyidKrYdveAVtJ+XxpKH5ym24UoUAMFakKRVUx2Y4omOKI\nqkSifd" +
       "05CzWbhjY1phnUkTNLyqZVNya/Oby1oRhVDaMqVU9QTFW519ApydFhFE6T9C" +
       "ix7B5FIcow\nqtEJURLEUrGm7gNCQx9GtbY6pmOasYi9ndiGlmWEtXbGJBbX" +
       "6W7GUFg2dJtaGZkalk1RdWwPzuJI\nhqpaJKbatDuGgimVaIq9Fx1AxTFUmt" +
       "LwGBAujbleRLjEyGa2D+QVKphppbBMXJaSCVWHSDT5OWY8\nXr0NCIC1LE3o" +
       "uDGjqkTHsIFqhUka1sciCWqp+hiQlhoZ0ELR8nmFAlG5ieUJPEaSFNX76eLi" +
       "CKhC\nPCyMhaIlfjIuCXK23JczT7aGguH/jsb/aeY5L1GIrDH7y4BppY9pO0" +
       "kRi+gyEYzXM9Lx6M5MYxFC\nQLzERyxoeu756LHYr2eaBE3DHDRDo3uITJPy" +
       "ja7GFdM9v4SKmRnlpmGrDAoFnvOsxp2T7pwJaF46\nI5EdSu7hJ9s/2/nMu+" +
       "T3IlQeRUHZ0DJpPYpCRFd6nXUZrGOqTsTuUCplExpFJRrfChr8G8KRUjXC\n" +
       "whGEtYnpOF/nTIRQGTwBeOqQ+FWzF0V3R/UBkjasqQQAEhIUt4ysqhBLMinq" +
       "0wkdYWCQDQVgMLLH\nNtnRiGxYZMQW9CNpzj0yr5gcM6FqMhBgteyvRA1gu8" +
       "XQgDApn7zy1f7+bS8cEXllWHSMp+gRMETK\nGyI5hkjMEMkxRBKGSPMYggIB" +
       "bsKywgSwjCqs8P74oLv6xXb7dBEqHkYhNZ3OUDyqEShYrGnGJFGS\nlCO2xl" +
       "MdHJSA6PAogBvsSmogiBcTRDxroRY/iPOlH4UVBmROH7j57bXk5CmGN4aPOi" +
       "ZdmAbZnhC2\nhdsSu7buPtJSzIgmS1gigXT17aUn5WtHB0599/Xl1nyxULR6" +
       "Vg3P5mQ16DcfQikTBXpcXvyr/275\n81jpxg+LUAkUNrQ2igGQ0CdW+nUU1G" +
       "K329dYsICzMmVYaayxI7cZVdBxy5jM73AYLWKvGoEoFiyf\ngbwlXn8uuPbi" +
       "x5Xnucdu96zytNkEoaIWa/Kx3mERAvuXX4sfe/nq4Sd5oJ1IUxQ0M6OaKue4" +
       "IcsC\nkNjFc/QFqb7u+CttJy66mVycl95jWXiKJTL37PSK1z/Hb0DPgNq11X" +
       "2ElybimpCrgL0f4Os1nkP2\n3eKQMHD5a2kzmxpuZtKjT/197s2KZmEM42n0" +
       "6ljF3/c6HrJ1qys5r7xxBmn1xFXS3zsg+p/olvtP\nXDnU9tP3F5yO6pnUea" +
       "rfkgczp58/M13EshqCmYntQbe2+cxmqwCfY4AcXmVsJ8QdrhDtYxN1ODvW\n" +
       "rt8g/KmjaN1CuoKvDeTAnRXzzRY+Fw8/8Vf4EP50l/CptrBd9OuZdOdbl0jb" +
       "w2F5jj4VoobZrpEs\n0fJ58msb4DPXTVTV400/b+46+bQ/UbxbesNeyJaUz7" +
       "5/5sfOSz8cBCuGUdngUKK3J9YPBjfdUl1S\nrsk2PFo8rn7B0+E0hFk3hUKm" +
       "bq+bkCiLwEVH31GQqGZuO5splfB0wVPjzBn+zw5r2WuxKF72Wj8n\n3AOO++" +
       "x7g8j+QD77nWshLrWAM3bDk1RFihky1qJ9b5+tnH4p07VVJG2RhyDal8w1XX" +
       "in7WYz99jB\nW9Azsp3vsiy2BvPJZH+DFA3ciRG4qeOhNeu62jvXUVRqWoZp" +
       "LwjBHHDQUlPqGGu9/CoJPer2XSJK\nIQIWwZQ4lniDudNTShv5wRB7Dd9BVz" +
       "s62jvXw421wIb77GaBG9f3BxdSvbDnVnAiHkU5ipbNo5q1\n3PpZF31xHZVb" +
       "pne3njNrvuRjaubKWA4gSGU0zYNtL86DpkVSKg9auZg+IoKjFN2/8PsIjA+x" +
       "4H5j\nIQLuEasWIIKiMtuTQYd5nKKGWzBTVML+vBwTkIy5OUCDs/LSwy32rk" +
       "J6iiryH17SvRQVAylbWjON\nuZqPPnZFksQcyJn/A+6l2HnNDQAA");
}
