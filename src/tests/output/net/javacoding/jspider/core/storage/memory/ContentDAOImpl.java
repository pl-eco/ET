package net.javacoding.jspider.core.storage.memory;

import net.javacoding.jspider.core.storage.spi.ContentDAOSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.ResourceInternal;

import et.util.MyUtility;
import java.io.InputStream;

import et.util.MyUtility;
import java.io.ByteArrayInputStream;

import et.util.MyUtility;
import java.util.Map;

import et.util.MyUtility;
import java.util.HashMap;

import et.util.MyUtility;

class ContentDAOImpl
  implements net.javacoding.jspider.core.storage.spi.ContentDAOSPI
{

    protected java.util.Map
      contents;
    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    
    public ContentDAOImpl(net.javacoding.jspider.core.storage.spi.StorageSPI storage) {
        super();
        this.
          storage =
          storage;
        this.
          contents =
          new java.util.HashMap(
            );
    }
    
    public java.io.InputStream
      getInputStream(
      int id) {
        byte[] bytes =
          (byte[])
            contents.
              get(
              new java.lang.Integer(
                id));
        return new java.io.ByteArrayInputStream(
          bytes);
    }
    
    public void
      setBytes(
      int id,
      byte[] bytes) {
        contents.
          put(
          new java.lang.Integer(
            id),
          bytes);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVYfWwcxRWfO9tnn+3EHzGJgx3bMW6Ji313tmPj4H9ibKe5" +
       "+BwfPoc0V6fHem/O\n2WRvd9mdO59TsEqbEsgfqAgKrUhBrVqlahFtSYFKVE" +
       "0joN+RWv8BtBWoVRCiaoNAVZWopUrfzOze\nftyRpLKlW8/uvDfvzXu/9zHz" +
       "7CVUZeioXTRCZEXDRmgiERd0A6cnZMEw5uFTSnytKhg/M62ofuSL\nIb+UJq" +
       "ghJhrhtECEsJQORyfHCjrq0lR5ZUlWiblOySp33PLR8u9O7murQA1J1CApCS" +
       "IQSZxQFYIL\nJInqszi7iHVjPJ3G6SRqUjBOJ7AuCbJ0HAhVJYmaDWlJEUhO" +
       "x8YcNlQ5TwmbjZyGdSbT+hhD9aKq\nGETPiUTVDYIaY0eFvBDOEUkOxySDjM" +
       "VQICNhOW3ci1ZRRQxVZWRhCQg3x6xdhNmK4T30O5DXSqCm\nnhFEbLFUHpMU" +
       "sESnl6O4455pIADW6iwmR9SiqEpFgA+omaskC8pSOEF0SVkC0io1B1IIuvlj" +
       "FwWi\nGk0QjwlLOEVQq5cuzqeAKsjMQlkIuslLxlYCn93s8ZnDW7OB+v+eil" +
       "/uYj6vTGNRpvpXA1OHh2kO\nZ7COFRFzxiu50OPRQ7l2P0JAfJOHmNOMf+Kl" +
       "A7H3znVymrYyNLOLR7FIUuJHI+3b1sbfCVZQNWo0\n1ZAoFFw7Z16NmzNjBQ" +
       "3QvLm4Ip0MWZM/n/vFoS98D//dj2qiKCCqci6rRFEQK+kJc1wN45ikYP51\n" +
       "NpMxMImiSpl9CqjsHcyRkWRMzRGAsSaQI2xc0BD/88Gv2xw30AcAkMFcIZPj" +
       "s9GsJoc0gsYUTBYo\nBkQ1Dd5fOGpoUhrrC6Kq4wUDcAt+XICYUPWVBS93gQ" +
       "psWPb5aOR6404GkO5VZVgrJZ65+Jv7pqYf\nfoh7kSLPVJWgXSA/ZMsPmfJD" +
       "VH7IlB/i8kNu+cjnY5K3uK1M3Zam0fWP58caH+k3XvSjiiQKStls\njgiLMo" +
       "aoFGRZXcbpFGGwbHKEAEMewLZ+ERAM6qRkWIhFDJg1r6NuL1Lt+I7CSAD4ra" +
       "1e/f37qeWz\nFFQUBC10da4auPQY162+N3F43z0PdVdQouVK6i0g7bn+6inx" +
       "/VMzZ1//7Vs77IggqKckUEs5aaB5\n1Y/rqojTkMjs5Z/8994PHqva9YIfVU" +
       "L0Qv4iAqAOkkGHV4Yr4Mas5EWNBZx1GVXPCjKdsjJOLTmi\nq8v2F4aeDWzc" +
       "CAaog18V/LaYkG2hDzrZTB+bONaoPT17YKnxypcCkTd+WvcaM4qVRRsc6TaB" +
       "CY/J\nJtsd8zrG8P2tr8Uf++qlk59lvjCdQVBAyy3Kklhg+m3xge83lckPod" +
       "aWx5/oPf2G5exN9urjui6s\nUF8XHljb9vVfCt+A3AExbEjHMQtRX9Htrdha" +
       "cmpihmccnp/uO33xwd6//PGCmcMctdGm+lvqRO7F\nL59b81MTB6FKCcZ+K7" +
       "5YlaQjH6sc4EYGefolyOxZy0N4gKBaxjkQGR0ZAo2aQRQtqyEpHYqpoiBH\n" +
       "J795vm7t0dzIPq7LBgdBdDJV6Lzwnd6rXUwHU2TAkSfN9+q8oO+3Y5/+GyRo" +
       "ch0J6I7BSN/gaP/O\nEYKqTVLmrxaCBm8kr8C3UIKPE/Go5Wv67GPjfopB5i" +
       "fEDNVtktBU4E14e2ght+Iou/j5f73ydG0X\nxwXlaWfL+MG4bU53u7hS4r3H" +
       "Tw+tJQ5K3MreEuchPv6zA09fuUDeZqC3Q5VK214oVfBuwZFFRl/P\nNwV++E" +
       "zWj6qTqJG1KYJC7hbkHA2JJMDFmDA/xsDbznl308CROFZMRe3eNOEQ600Sdi" +
       "WAsRuZdl7Y\nCL82+DWZeaHJkxd8iCFpijH0sOetxSgOarpKQD+cLhBUI3L4" +
       "GIwozLE/7cT+gAf73OCTu3edf+fS\nD6TLDN+1rGMbpyym6kH2xRF1Fapm0N" +
       "7A0ZyaK/XMasYYk7uzKHdk4HbA78R6wmBooG+0fwBW2TC/\nN5oIWfukcmKO" +
       "fa9CS1K6O6qTaVvUzHC3kWUx6t7QlJLLOiehYlfOTY1PWmG2wU54M4LGczR9" +
       "7nb5\nbzvntlYp578kfXzaE8emjw47fTTIZmYc5htZr/kGqfkGIwTVM/OZ5F" +
       "TM52yFVun7PLwfnIvOz0/t\np6+jbMOFUughK1HYuaTdzPeOfR117iuiWTYd" +
       "vtHUZW+EZS8dbfu4RpodAk5+5sP6B4VXD/Pk0uxu\nm6ijh595E/furhfLtG" +
       "lBomr9Ms5j2c6AXmkz7IBhBXvDwc6/7hk5c3+5FNjuTIFutpR4/rlzfx5+\n" +
       "808nQIskqt4/m5gYj02Bwp3XFJcSm/Jtd1UckX7FotTMRiXHIjfTmDsH1eoY" +
       "TnXKvCsTdbk6FFoR\ntppI3lquQ6GPT5YtJHbBd1WAuC5loUrmzXPLC8l/Rt" +
       "Lv3jbJndTqPA87CfcOXsU9m977gOd+d9kv\nUzk8Qh7t+Pa7Zy/OtXBH8xPk" +
       "LSWHOCcPP0WyLdZrFGrbryWBUb962/ZnV+feXvSbxVMlqAKOr9Ba\nMXWHr1" +
       "9uVwjauAQnH0XLETicYiHrjJ6HndEzzGaG6OPUenuK4b6Bgf6dwwRtcQu/1e" +
       "jiALEClXd7\nkhpyECE2mXeBJgS/DhM0Hf8faPw8ZujrA7T5deCBNZjU2ieW" +
       "py/taL/8lB/5r9ECljlnF1dIic9X\n9Hzof3lzD2v7KxcFg0eA94Ki9P7Bda" +
       "3AdlOncc/eb/7/IpSMxRWCLccPaZrmcN3tEdt1T63TdUOR\nvqEh5roqKtG4" +
       "PsS+AuURDtN3UuoSrfMqvWTiWkcQdBAb3RJpx99act/Eb0XE7rV7dryiNf2a" +
       "W9S6\nuaiBtjiTk2Vn5+MYBzQdZySmWQ3vgzjWv0vQp278oAw68wHbyRm+xP" +
       "chxG9gCU8FNpmfI6jtGsxg\nK/rPyfEjgjaX5wAJ5shJ/2OwrpseMGK/OElf" +
       "gkQCpHT4k2LRbLR7Ft6SFsxwsbqdhIZFiZ5kCt96\nufKuR/7wH1YnqkV+8U" +
       "cvu6Bdy0twYgmPK4K8YrAOmM7R+wAxp8NZl7CCavqqzuAr8sutNme3V5TV\n" +
       "M38oPlWm4QOE3rnuhm8UzE4blnXdokBPuLWclZjmzs6P7uGAKfF/XkmlH64V" +
       "AAA=");
}
