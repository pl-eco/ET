package net.javacoding.jspider.core.storage.spi;

import net.javacoding.jspider.core.storage.EMailAddressDAO;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.*;

import et.util.MyUtility;

public interface EMailAddressDAOSPI {
    
    public net.javacoding.jspider.core.model.EMailAddressInternal find(
      java.lang.String address);
    
    public void register(
      net.javacoding.jspider.core.model.ResourceInternal resource,
      net.javacoding.jspider.core.model.EMailAddressInternal address);
    
    public EMailAddressInternal[] findByResource(
      net.javacoding.jspider.core.model.ResourceInternal resource);
    
    public EMailAddressReferenceInternal[] findReferencesByResource(
      net.javacoding.jspider.core.model.ResourceInternal resource);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcRxWfu7PPPtvB8UdTq3HiNE1pTO07++yz6xipdW1H" +
       "ufgSX+1EpcbhOrc7\nZ2+yt7vsztmXNkSghqZFAqlKgFa0oEpApKog1KjpHy" +
       "CFqi1fohLyPy0gECioKoKgVgi1QkXhzczu\n7dz66qS4nLRzc7PvzXvz3u99" +
       "zD1/FdU7NupWnDg9aREnPjmfxbZD1EkdO84RWMopr9XHshdmDDOM\nQhkU1l" +
       "SKWjOKk1AxxQlNTaSnxss22mWZ+skl3aTuPut22XfbB6u/PntwewS1LqBWzZ" +
       "inmGrKpGlQ\nUqYLqKVIinliOxOqStQF1GYQos4TW8O69hAQmsYCane0JQPT" +
       "kk2cOeKY+gojbHdKFrG5TG8xg1oU\n03CoXVKoaTsUbc0cxys4UaKanshoDh" +
       "3PoGhBI7rqfB6dRpEMqi/oeAkIt2W8UyT4jon9bB3ImzRQ\n0y5ghXgsdSc0" +
       "AyzRE+SonHjPDBAAa0OR0GWzIqrOwLCA2oVKOjaWEvPU1owlIK03SyCFols+" +
       "dFMg\narSwcgIvkRxFXUG6rHgFVDFuFsZC0U1BMr4T+OyWgM8kb81GW/7zle" +
       "x7u7jP61Si6Ez/BmDaGWCa\nIwViE0MhgvH9Uvx8+oFSdxghIL4pQCxoJm5/" +
       "6Wjm7cs9gmZ7DZrZ/HGi0JzywUj3jrWJv8QiTI1G\ny3Q0BoWqk3OvZt0342" +
       "UL0LytsiN7Gfde/nTuZw988TnytzBqTKOoYuqlopFGMWKok+68AeYZzSBi\n" +
       "dbZQcAhNozqdL0VN/hvMUdB0wswRhbmF6TKfly2EUAM8IXg6kPjE2EBR5/Qh" +
       "rOkAbYCuMzUxO59N\nxy2KPm0QushwoJgqIGDxuGNpKrEXFdMmiw5gF3y5CG" +
       "uLtdjLTGrraijEwjcYfDog9YCpw2Y55cKV\nX52annn8MeFKBj9XX4r2gQJx" +
       "X4G4q0CcKRB3FYjDWny9AigU4qJvrrY1c57KYuzvL4xv/Vq/cymM\nIgsoph" +
       "WLJYrzOoHYxLpurhI1Rzk426RA4PgD8LbkAcegT06HjXjcgHFXbLQ7iFc/yt" +
       "MwwwDCtdPX\nfvOP3OpFBi0GhU62u1ANHHtC6NbSO3/s4IOP7Y4wotU65qMy" +
       "j8+bmZSgMfezTOHtX8w//K9Xvt20\nS+zPeLq9DUBYkJNlj/cfiQ688ZPm17" +
       "j5vUTTKmWkeUIFbNt8XY/YhMD6H57Mnvv61bOf5YoKTSMU\nNeI8HBsrlIJh" +
       "vbxEUdQq5XVNkU7SUSOy4l2d57/R+/QbNQ+w48MSAk9mZz/zbsuj+NVjImzb" +
       "qx0/\nbZSKqe+8SXrvaVFqIC1GTatfJytE99ULSjvEE6Vn6db7e/68f+TCF4" +
       "KK1jG8E49nevJQNVtOefmH\nl3+fevN3Z0CLBdRweHZ+ciIzDQr3bCgup7St" +
       "bL8vsqz9IszTNEt5NdJ7NdO4fEyoEjaB6mQwg7GV\nWHk9ZLO2qRAVSpgv95" +
       "v/PvDOufqxF8OoDvI2VC6KId9AGdgZFF6Vasc9NDFRwNlcMO0i1tkrr9Y0\n" +
       "0WXbXPVXeMrYwudbwZLN8Iy638j7Zi/b2dAhEgyn3s3H2wUCw2x+Bxt6XayF" +
       "2NgHfunwETxh2/gk\nC7byl9Z2PPVz/AykcEiljvYQ4ZkyxPdiGaRLdqZI/K" +
       "JMnHr6yqO9f/rt624pkVoUn+qvuTOlS1++\nvMadFoNmATuHfYdAs8JmIV7A" +
       "waY85wjXsLFJJNEp6nIODQ+MgELtIIk1N3FNjWdMBevpqWdfbl57\nojRyUK" +
       "iyRSJIT+XKPa9/r/faLq6CKzEqVSv3d8MKtg/7IcG+pima3kwJ2Dc42Dc01p" +
       "8aoqgBi1fc\nIZ3Q8nBPsKwaF+1FtavYeA9ztxv77Pc4ZZXNEJ3KvcI0Wck0" +
       "Kf5iPxvuo2hmI8WLpkr0KpUr0E2z\nhGVgHbRPjvUND/ePJD9F0SfpsuZUKs" +
       "4SoYHj7u2NV1SD041sVLe48KqK5clEnH+kKgCOwLPFDYAt\nmwwAz6phQSYb" +
       "8phkyFHfkJ/bNAKG+pKj/akkVAVYN0u226GCkZLXN9Kcy+IZSNZYlTS+y9eY" +
       "fAwa\np4b770r6mGXbHr0+Pu/nZ1yClALXBGgb5bSRtbUiBNuK24S+uPDPAf" +
       "WtO6dEuHbJlxuZ8EDyGtnT\n8fY7vF4FkkeNTjcg5Imd333r4pW5TlHtxHXg" +
       "tnUducwjrgT8MC0Wq7e3biSBU796563Pn577Yz7s\nGiEBQbpisjtYlOs7UA" +
       "vTh+FpdTHd+jFh2svXEkIe9hEyOOAj5NSmEZLqSw32j45ImGb75q8PkRJF\n" +
       "n2B54t6THrJZVya5n1clZtwzqzNX93a/960wCm9QN2rckSo75JQXInveDf94" +
       "2x5euOvy2BGlJXi5\nXH93rLoScsWbq/zXs4H/ZAeclUJ0jFeUo5YFzVYTXx" +
       "wcSA5KqeZxiu6+fs4OZgRwx7Cbp4chTw/c\nWJ727V8LnhieNvd4bf8/eJ6T" +
       "4Jn07XB+0/Ac7Rsd6B9LfXR4fhUursw8lWLoSEBlBI9U2WnvBnaS\nD/qMdN" +
       "BBy0v/d3+0GrmuQFcjKSlV/2f/ZyQNDTEkjTIk7bsxJNUyFSpT1L7eNewK1b" +
       "XuXyjxX4my\ne+3Bva9Ybb8User9n9EIbVqhpOtSDy/381HLJgWN27hR9M7C" +
       "4BcouuMGb84URWDktvu+YH4OqsQN\nMEN5dGcy8w8o2r4BMxQH9iVz/Iiibb" +
       "U5QII7k+kvQgqtpgcU+D9k0ktwOCBl05cqsJMaT9Gll63/\nAnA91/ZkFAAA");
}
