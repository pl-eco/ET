package net.javacoding.jspider.api.event.folder;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.JSpiderEvent;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Folder;

import et.util.MyUtility;

abstract public class FolderRelatedEvent
extends net.javacoding.jspider.api.event.JSpiderEvent
{

    protected net.javacoding.jspider.api.model.Folder folder;
    
    public FolderRelatedEvent(net.javacoding.jspider.api.model.Folder folder) {
        super();
        this.folder = folder;
    }
    
    public net.javacoding.jspider.api.model.Folder getFolder() {
        return folder;
    }
    
    public void accept(net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.visit(this);
    }
    
    public java.lang.String toString() {
        return super.toString() + " " + this.getComment();
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcRxWfO5/PPtuNP5OY2Ikd121qat/57hznw/xRyz7L" +
       "l1ziq89JiXG5rnfn\n7E32dre7c+dzKBGI0rRFqlRSvkOqoqJIbdQiooY/QI" +
       "SoLd+RwH+0BdQKlKoqglRFCDWCovBmZu92\nb8+xqQyWdj038968N+/93sfs" +
       "heuo2jRQp2gGybKOzeBYKikYJpbGFME0Z2AqLb5aHUieP6hqXuRJ\nIK8sEd" +
       "SYEM2QJBAhJEuh+PhIwUDduqYsLygasfap2GX/7R8u/fr0gY4q1DiLGmU1RQ" +
       "Qii2OaSnCB\nzKKGLM7OY8MclSQszaJmFWMphQ1ZUOSTQKips6jFlBdUgeQM" +
       "bE5jU1PylLDFzOnYYDKLkwnUIGqq\nSYycSDTDJKgpcVzIC6EckZVQQjbJSA" +
       "L5MzJWJPNBdApVJVB1RhEWgHBLoniKENsxNEHngbxOBjWN\njCDiIovvhKyC" +
       "JbrcHKUT9x4EAmCtyWKyqJVE+VQBJlALV0kR1IVQihiyugCk1VoOpBC07Zab" +
       "AlGt\nLognhAWcJqjdTZfkS0AVYGahLARtdpOxncBn21w+c3hryt/w78eTH3" +
       "Qzn/skLCpU/xpg2uFimsYZ\nbGBVxJzxRi74VPxYrtOLEBBvdhFzmtE7fnAk" +
       "8e7lLk7TsQrN1PxxLJK0+OFw5/aV0bcDVVSNWl0z\nZQqFspMzryatlZGCDm" +
       "jeUtqRLgaLiz+Z/umxzz2H/+JFtXHkFzUll1XjKIBVacwa18A4IauYz05l\n" +
       "MiYmceRT2JRfY7/BHBlZwdQcfhjrAllk44KOEGqCxwNPD+J/jfRFUNuEpkjY" +
       "mMaKQLAUy2OVBHWC\nPqFiMkdxIGoSIGDuuKnLQDYn6PIcpkRzGcY3txp7gU" +
       "ptXPJ4aPi6g08BpE4yprR4/tovH4odfOxR\n7koKP0tfgvaDAkFbgaClQBAU" +
       "CDIFglyBYKUCyONhoreW25o6T6Ix9tfvjzQ9MWBe8qKqWRSQs9kc\nEeYVDL" +
       "EpKIq2hKU0YeBsdgQCwx+At2EecAz6pBXYiMUNGDdvoB43Xu0oj8NIABCunL" +
       "r5m/fSSxcp\ntCgU2ujuXDVw7AmuW0Nf6v4DDzzaU0WJlnzUZ0Dau/7uafG9" +
       "xw9dfO1Xb95lxwVBvRXhWslJw82t\nftLQRCxBOrO3/9o/J98/U73vJS/yQQ" +
       "xDFiMCYA9Swg63jLKwGymmMGos4KzPaEZWUOhSMe/UkUVD\nW7JnGHxuY2MK" +
       "2np4quHZbAG3lb7oYgt9tXKwUXu6zsAS5I0v+Adf/1H9q8woxVza6Ei6KUx4" +
       "ZDbb\n7pgxMIb5N7+ePPOV66c/xXxhOYMgv56bV2SxwPTb6gHft66SJYLtbU" +
       "99te/s60Vnt9q7jxqGsEx9\nXfj8yvZv/Ez4NmQQiGRTPolZoHpKbm/HxS1j" +
       "Y4d43uFZ6qGz1x7p++PvrlqZzFEhbao/px/OXfri\n5RUvNXEAapVgHi4GGK" +
       "uVdORh9QPcyCBPZwLMnnU8hsPE4hwKR/eBQi0gidbWoCwFE5ooKPHxZ67U\n" +
       "rzyZGz7AVbnNQRAfTxe6rn6372Y3U8GS6HckS+t3TV4wDtuxT/9FCIptJAPt" +
       "D+/rjw4ODEXBX5yM\nuauNoF1r5JWsJmHFSihF/9J3PxsPUNwx3yBmnB6LhI" +
       "a/O8tN0BJejJ3s/Gf+8fK5um6OBcrTWXJx\nh9PFZVxp8cGTZ6Mrqftkblp3" +
       "cXMRn/zxkXM3rpK3GNDt8KTSdhYqFTwqODLH3tfyzf7vPZ31oppZ\n1MQaFE" +
       "ElRwUlR8NgFiBijlmTCXCxc728XeDoGymln053anCIdScGO/3DuByNdi7YBE" +
       "8nPM1WLmh2\n5QIPYvCJMYZe9t5VityAbmgE9MNSoRwWIY72gw6073WhnVt7" +
       "/J59V96+/qL8AUN0HWvURimHpXeA\nzTjCrErTTdoSOHpSa6feKd0cYWKHCK" +
       "pjYsORoWGIuMmPBvxx2RS1PCTcEvYj4f7InoEoYL9+ZjKe\nsgolFZUonfsU" +
       "tCKVx6NKWZZFLQx1m1jeos4NxtRc1rkIRdo3HRsdpxvvZUm4UGl2L0G1wjyU" +
       "HEFk\n5bKvGDR2XHVaMQUW336rro91rKc/+beGR4RX7ufx0FJe3al2u59+A/" +
       "fd0yCu0k4EiKYPKGA+xQ5a\nt7RDrBsu4rPxvq4/TQyf/6w7aqtoU+OM2nK2" +
       "tHjlhct/2P3G7x8GLWZRzeGp1NhoIgYKd60pLi02\n5zvurVqUf86wZQVQRQ" +
       "9fzjRSHjZ1BoYriDpTFjzdZYV0OzxbLSduXa2Q0teda+a+dRPjIph7AZOJ\n" +
       "igDT7AAbGmQLUfoC98Q3jPnd/eHdA9Ghj0N1Z/eLYEkDhk/ExOEyW/TD02HZ" +
       "ouOj2aJYox2HKzgO\nF7YPt7zRShbZ0x+JskpWk5ehbmqlUjawbovM9jjKud" +
       "b3G4HsIIgi1om7MCUNOQsVO29dpF6a/fug\n9M7d4zwQ250XdCfhZOQm7m19" +
       "931ekso7kFUKmkvIkzuefefitek2Hsz8Snt7xa3SycOvtewoDTpN\nJzvXks" +
       "CoX7l754VT02/Ney0TfBpyWl6j3xH8TN/B1XCzA54uCzdd/6cY+hLkTaLx67" +
       "cTZV92oCxi\no+zMRlEWDfeHwwPRQbj1FMXuMrt5PinircmuBZyCYr6lcjva" +
       "77ZXfHPhXwbEnpUH7npZb/4Fu0aU\nbu+10BVmcori7AEcY79u4IzMDFDLOw" +
       "JujW+t3c8574nlFf+bnP8cQd3r8RNUzf47+Z4haNut+Qiq\ngreT/lmCtqxO" +
       "D1FtjZz05wnaVE4PPYL9w0n6HEgDUjp8Xnci5YKjm9lDr0eOcp/SsSjT7r3w" +
       "nR/6\n7n3it/9iNadG5F+86FceaFhYtgmNqoKybLIGkK7RK7CYM+B6R1hxth" +
       "xUb/Id+VedDme/U5LVO3Ms\nGXO3PIOR4cENYzdCc38E9qlOHUnGpjf29QA6" +
       "o4+tZiqmvrP/oQc5UpT53+fkAyk2w2TxPPCC0xrD\n/wNrDMHNB6zho93fBo" +
       "1B9btkbfUf1Da1TZEVAAA=");
}
