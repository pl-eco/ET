package net.javacoding.jspider.core.event;

import net.javacoding.jspider.core.event.impl.*;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public interface CoreEventVisitor {
    
    public void visit(java.net.URL url,
                      net.javacoding.jspider.core.event.CoreEvent event);
    
    public void visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLSpideredOkEvent event);
    
    public void visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLSpideredErrorEvent event);
    
    public void visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.ResourceParsedOkEvent event);
    
    public void visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.ResourceParsedErrorEvent event);
    
    public void visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLFoundEvent event);
    
    public void visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.RobotsTXTSpideredOkEvent event);
    
    public void visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.RobotsTXTSpideredErrorEvent event);
    
    public void visit(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.RobotsTXTUnexistingEvent event);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZa2wc1RW+u7bXXmdTv5LY4DiOExBYIbt+J8a0xfihONnE" +
       "xk4KGKPN7MxdZ+LZ\nmenMnfUG0ghUSig/EBGPthIFIQGRAPGDpwSVAuLRUh" +
       "UVWUW8VNQqFEELCIRQKaJNz70z4zs7Nuv1\nLo40szN3zrnfuec759zjm8c+" +
       "RRWmgTaLZpQc07EZHZqaEAwTS0OKYJoHYSghvlIRnji9T9WCKBBH\nQVkiqC" +
       "YumjFJIEJMlmJjwwNZA23VNeXYrKIRZ54ls1y6/dv5P53c21yGaqZRjaxOEY" +
       "HI4pCmEpwl\n0yiSxukkNsxBScLSNKpTMZamsCELinw9CGrqNKo35VlVIJaB" +
       "zUlsakqGCtablo4NhukOxlFE1FST\nGJZINMMkqDZ+VMgIMYvISiwum2Qgjk" +
       "IpGSuS+VN0ApXFUUVKEWZBcFPcXUWMzRgbpeMgXi2DmUZK\nELGrUj4nq+CJ" +
       "Vr/G4oov2AcCoFqZxuSItghVrgowgOptkxRBnY1NEUNWZ0G0QrMAhaDzv3NS" +
       "EKrS\nBXFOmMUJgpr8chP2J5AKM7dQFYI2+sXYTMDZ+T7OPGyNhyL/vW3i31" +
       "sZ5+USFhVqfyUobfEpTeIU\nNrAqYlvxayt619g11uYgQiC80Sdsywxe+Oyh" +
       "+EdnWm2Z5mVkxpNHsUgS4rd9m1sWBj8Il1EzqnTN\nlGko5KycsTrhfBnI6h" +
       "DNmxZnpB+j7scXJl+95sZH8L+CqGoMhURNsdLqGApjVRpynivhOS6r2B4d\n" +
       "T6VMTMZQucKGQhp7B3ekZAVTd4TgWRfIEfac1RFClXAF4NqO7H819AZsD2kG" +
       "HslglfxEBls0I6oT\n1KNiMkOjQNQk4H/mqKnLEjZmRJCdwVR4ZqlalmLVzA" +
       "cCNGn9KadAfO7RFJgkIZ4++8fjI/t+eatN\nIA06x0qCugA4yoGjDnCUAkcZ" +
       "cNQPjAIBBtmY61lKlUQz6pMnBmpv32k+E0Rl0ygsp9MWEZIKhkwU\nFEWbx1" +
       "KCsFCs84Q9izYI1UgSohbsSCgwEcsScGXGQNv80clzegyeBAi5hRPn3vgsMf" +
       "8kDSRK/AY6\nu20a0Dhn2xZpn7pu7+Fbt5VRoflyykiWZWMjRfE7cZTWBXf+" +
       "dPKGr166r3qrPT/V2exOAGB+TVor\nvv55qOOt3617hbndLSs1nvozhYkdpH" +
       "Xc1oMGxjD+119P3Hn3pyevZYbalpYRVCUkYdmCSAg41q1C\nBIV0K6nIomcl" +
       "DcvkUbRpw133tN/71rILaPmu9Gel6+TVX0RuEV6+zk7S+lziR1Qr3Xv/27j9" +
       "8oi4\nTISFiabvVCCUFG6eH20/K4uup2uuav37aN/pn/kNDdM4x67OyND+XL" +
       "WE+OLjZ97rffvdm8GKaVR5\nYHxqaDA+Aga35oVLiHWZ5ivLjsh/CLKiTAvc" +
       "MsU8V2nAu0zYEwwMe5FKHUZHwtmlITthaCKWYMPi\nuL/6Zs/nd1b0Px1E5V" +
       "ClYZ8iAlQXKPpb/OA5hXXAjSYKBZrrUpqRFhT6yd1ZqskRQ5vnI6xUrGfP\n" +
       "teDJdXDF4KpzShP7pR/r6a3BLixMehu7X2hHYJA+X0Rv7U6sBej9EuClgUfw" +
       "oGEIx2iyZW9aaPnN\n74XfQsGGwmnK12NWF4P2XKDU5CXTLvP2pnD83rO3tP" +
       "/tndedjcPTkHCpjxM3W8/84swCIy0MrYFg\nHuCEQGtCnwJsuwafsppjU0Pv" +
       "1XbxHKYpRTX7O3vBnnoAop1MVJaicU0UlLHhB15ct3DK6ttrW7Le\nIzA2nM" +
       "i2vv5Q+7mtzAIHMOTZmpz3yoxgHOAZQX9GCPphMRX/0s5dl3R17ezqJ6jMMu" +
       "yE2kBQhDmf\nVvJDk3E2eIW9vv18fX1sfJTeDpSA3t25s6ePoAom4+LvWMUm" +
       "khs49H45DT6nEtH3AZg+QzGBkWZv\nhEwYchocm3G6i6env+yQPtwxbFPT5O" +
       "1avYJ7us7hCxo++pyVJl+cLNPC+EBObXnwwyfPTm6wC5vd\n521f0mp5dexe" +
       "j60kotPS2pYPgUm/vKPtsROT7yeDjgdiBJVnNNpch5i9HYg5qi8nf3fD1eDk" +
       "b0OJ\n+evS4KamJ4RSPIR28RCaLTqE+r0BTKfa50Wb42i7OZpSAhoEbG+vP2" +
       "D7Vw5YOa0rNJ2m2Bcsjc8V\nGL6H3fClL9cux9wAXBsd5jauHXM3cF/2c18e" +
       "L9aXXZ15mbtxEa2rg6PdVAIaZW63n7nLVs/ciGFo\nRoHkWQWR1+iQ17h25N" +
       "3B3dnJ3XmqaHd25yXvbo7WxdHuKQGtJPLoH++WIWL73KDgzLttRfJ+BNd5\n" +
       "DnnnrR15D3F3dnN3Ply0O3vzkvcIR+vhaI+WgAbk9XX6yftxUeStJvnuX5G/" +
       "briaHf6a146/57hH\ne7lHny/ao7vy8neGo3matBdKQKPJ1+Hnr6fwyjmqWa" +
       "pUIGlPFZR0LQ5pLWtH2p+5Gz2NyhtFuzF/\no/IXjuZpVN4sAa20pNOSGjEP" +
       "Xn1w1e3KayvyNwhXq8Nf69rx9wH3qKdd+UexHu3O3658vIjW7WlX\n/lkCGu" +
       "Wvx8/fFcXyt5q6+X5BKdjmUNi2dhT+hzvV07R8U7RT8zct/+NonqblXAlo30" +
       "8KHlJxVjYJ\nyBbI35e5/GUJqvXbRw8Jm5b8r4p99i9uWzh88Ut63WvsGGnx" +
       "fL4qjqpSlqJ4Tqm8J1Yh3cApmeFX\n2adDzKuBaoLaVlyx10eBsK24nqDmPI" +
       "rwJy398WrUErRpeQ2CKp0nr3wDQT/IlSeomr94RTdBzIAo\nfWzUXSZr2TEJ" +
       "PW+O2sdIWf3/2w1GZfMaAAA=");
}
