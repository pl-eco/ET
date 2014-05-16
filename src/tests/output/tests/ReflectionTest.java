package tests;

import java.lang.reflect.Array;

import et.util.MyUtility;
import java.lang.reflect.Constructor;

import et.util.MyUtility;
import java.lang.reflect.Method;

import et.util.MyUtility;

public class ReflectionTest {
static {
}
    
    private java.lang.Class getClassFromLitName()
          throws java.lang.ClassNotFoundException {
        java.lang.Class clazz = Class.forName("test.TestMethods");
        return clazz;
    }
    
    private java.lang.Class getClassFromVagueName(java.lang.String className)
          throws java.lang.ClassNotFoundException {
        java.lang.Class clazz = Class.forName(className);
        return clazz;
    }
    
    private void classTest() throws java.lang.ClassNotFoundException,
        java.lang.InstantiationException, java.lang.IllegalAccessException {
        java.lang.Class clazzClear = this.getClassFromLitName();
        java.lang.Class clazzVague = this.getClassFromVagueName("vagueName");
        java.lang.Object objClear = clazzClear.newInstance();
        java.lang.Object objVague = clazzVague.newInstance();
        ((tests.TestMethods) objClear).reflectMethod(null, null);
        ((tests.TestMethods) objVague).reflectMethod(null, null);
    }
    
    private void methodTest() throws java.lang.Exception {
        java.lang.Class clazz = this.getClassFromLitName();
        java.lang.Object obj = clazz.newInstance();
        java.lang.reflect.Method method =
          clazz.getMethod("reflectMethod", tests.A.class, tests.B.class);
        method.invoke(obj, new tests.A(), new tests.B());
        java.lang.String methodName = "reflectMethod";
        java.lang.reflect.Method methodArray =
          clazz.getMethod(methodName, new java.lang.Class[] { tests.A.class,
                          tests.B.class });
        method.invoke(obj, new tests.A(), new tests.B());
    }
    
    private void constructorTest() throws java.lang.Exception {
        java.lang.Class clazz = this.getClassFromLitName();
        java.lang.reflect.Constructor constructor =
          clazz.getConstructor(new java.lang.Class[] { tests.A.class,
                               tests.B.class });
        java.lang.reflect.Constructor constArray =
          clazz.getConstructor(Class[].class);
        tests.TestMethods test =
          (tests.TestMethods)
            constructor.newInstance(new tests.A(), new tests.B());
        test.reflectMethod(null, null);
        tests.TestMethods test1 =
          (tests.TestMethods)
            constructor.newInstance(new java.lang.Object[] { new tests.A(),
                                    new tests.B() });
        test1.reflectMethod(null, null);
    }
    
    public void miscTest() throws java.lang.Exception {
        tests.TestMethods t =
          (tests.TestMethods) Class.forName("test.TestMethods").newInstance();
        t.reflectMethod(null, null);
        java.lang.reflect.Method m =
          Class.forName("test.TestMethods").getMethod("reflectMethod",
                                                      tests.A.class,
                                                      tests.B.class);
        m.invoke(t, new tests.A(), new tests.B());
        java.lang.String method = "";
        Class.forName("test.TestMethods").getMethod(method, tests.A.class);
    }
    
    public void downCast() throws java.lang.ClassNotFoundException,
        java.lang.InstantiationException, java.lang.IllegalAccessException {
        java.lang.Class clazz = this.getClassFromVagueName("vagueName");
        tests.A a = (tests.A) clazz.newInstance();
        a.m();
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        tests.ReflectionTest test = new tests.ReflectionTest();
        test.downCast();
    }
    
    public ReflectionTest() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1362283500833L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALUYa2wcR3nuYZ/PduL4kdSJndhJr0pM4zsnju26pj8sPxQ3" +
       "l9jxOQ5xiK57u3Pn\nTfZ2l9258zkNVoHQlAoqBcJLtAhQoSpUIBoRJIoUoo" +
       "TyKEXgH5SHiqgCJQhSUaGqlQoK38zs7u3t\n3TlFCpZmPTffN9987++bee4m" +
       "qjENtBWTKFnWsRmdGDs4IxgmlsYUwTTnYC0pHvH98lvxB8wbfoQK\nBuoUTQ" +
       "t3LFGG+sCz+rv3xN76ix/54sgvSwQ1xUUzJglEiMlSbGp8BCh065qynFE0+8" +
       "wyKg//oL5/\n4/FrpwOoaQE1yWqCCEQWxzSV4AJZQI1ZnE1hwxyVJCwtoGYV" +
       "YymBDVlQ5NOAqKkLqMWUM6pAcgY2\nZ7GpKXmK2GLmdGywM+3FOGoUNdUkRk" +
       "4kmmEStCF+UsgLsRyRlVhcNslIHNWmZaxI5ofQCgrGUU1a\nETKAuCluSxFj" +
       "FGOTdB3Q62Vg00gLIra3BE/JKmiiy7vDkThyABBgayiLyaLmHBVUBVhALZwl" +
       "RVAz\nsQQxZDUDqDVaDk4haEtVooBUpwviKSGDkwS1e/FmOAiwwkwtdAtBG7" +
       "1ojBLYbIvHZi5rTdc2/ufx\nmbe7mc2DEhYVyn8dbNrm2TSL09jAqoj5xndy" +
       "0QtTx3Kd3K82epA5zug93z8Sv3G5i+N0VMCZTp3E\nIkmK/x7s3Lo6+udwgL" +
       "JRp2umTF2hRHJm1RkLMlLQwfM3ORQpMGoDfzT74rFHvon/7kd1U6hW1JRc\n" +
       "Vp1CYaxKY9Y8BPO4rGK+Op1Om5hMoaDClmo19hvUkZYVTNURgrkukEU2L+gI" +
       "oRAMH4yPIv63jn7A\nAUFJCggETMxhk0R1cDUCE/ODXkCB0tqw5POBGJ3ekF" +
       "LA//ZrioSNpPjM9Z+fmTjwice4gahTWVwQ\n1MZIR0tJI5+PEb2rVDdU2RKN" +
       "iX88P7LhiV7zkh8FFlBYzmZzREgpGGJJUBRtCUtJwpyp2eW4zF/A\n2RpT4H" +
       "fgwkkFCDE/B2XkDbTD61/FqJyCmQBOs7py61dvJJcuUlegpmuj1DlrYIhTnL" +
       "fGnsSJBx96\nbEeAIi0FqY4BNXJ76knxjccPXvzNS6/uKvoxQZGy8CrfScPD" +
       "y/6MoYlYgvRTJP/05qbAUTR/3k9D\nOwxZhwjgKxDC27xnlITJiJ1yqLJq4q" +
       "ghrRlZQaEgO0/Uk0VDWyquMMdYTz8t3EeosjwMsmz1zsdq\n+175YcOPmcR2" +
       "YmtyZcAEJjxMmou6njMwhvVXvzDzmc/ePHecKdrSNEG1ei6lyGKBMdLuA8O2" +
       "VgjZ\naHvbhc/1PPmKbcnWIvVRwxCWqSELH1nd+sWfCE9BOENYmfJpzKIGsZ" +
       "OQfQD97mbzXheQ/r7bQqHO\n5Y2OSZrQbctkUw+/dfXL9d2cGbpnq/uMCPvu" +
       "tCSk8x6bcvFwZweU0mqJkiX5cx94s/FR4doJns5a\nSgNsQs1l/7p8Fe98/6" +
       "deqxCrYaLpvQrOY6Uomfe0g6yA2KI1He16bXLwmQ97RaujGcNd8ku3JcUr\n" +
       "3778h4Hf/v4scLGAQoemE2Oj8QlguGvN45Jic77jcGBR/ilkBieEyspe6aYR" +
       "t5jgywaGqq1ShdGV\nembL7Yz3ZuA8DCMCY72VNNl/CmylnzbL3cvtRlBIN+" +
       "S8AA3Emp5TEehz8ki7W2m88PAydebJ64/2\n/Ol3L1ulzNUiFbH+ljybu/Tx" +
       "y6tMOWFoVgTzUFFwaJbozM8aCMgLLIcWVdDA0/00CMJ27unjBt1I\nUDeLHp" +
       "plubMd0sikllOliYKIdZrT2c5xglozmDCMSUPLxmVCT2dEDnLicxC/jPgwiN" +
       "oCMtC2LSpL\n0bgmCsrU+FevNKyezw0+yIVc50KYGk8Wul7+es+tbiacJUvI" +
       "VYet36G8YBwqOjX9dwQkqFzg7h8c\n3r1nsLd/6H1QxcmibEarCQBaaPJoAT" +
       "HAaInnDMJotTyntZLn0M/kmj7gUpfg2KKfLc/TTwocvoo0\ne4Z39w/1DvRD" +
       "JIvMTi7uNxS55y3e2p7o4uKkw8U+ps7DbPUEtHJuZc0LmRz22jvrbN1bFAA6" +
       "pu3V\nBOgboPYY6AN7bCmzh3MEpXK8kvo3w+iw1N/xv6l/zfgMMGDALVrBEW" +
       "2Qa8UNPO0AhyoFEc9MRGZX\nCSeI3ARWHAL3VSSgKDgjKKMiXAHM0ig0bONT" +
       "lUKUdZRcvAw5C8GSt9rj7y38q096/d5xHm7t7muX\nG3H/3ls40nrjn6xieN" +
       "JKhR7cc8j5bU+/fvH6bBuvN/yicnfZXcG9h19WmDTrdFrxtq91AsO+du/2\n" +
       "51Zm/5jyW7X5foKCeY3eDnm+6avkLVtgxCxvid1Bb6kQQ5+27bl3wLFna9Ge" +
       "pSb8JEH1/J5GbUhX\nzlVivwvGuMX++P+X/ads9vf1MWe/wFY/DznRdbetym" +
       "wdjLtgzFvMzldjduCOMPsNm9mBIRezXyGo\nLiub4m25zFhcZu4glxXyx3ds" +
       "LgeHyvPHdx3gfQx4xg286ACHGfARtvosyCdpS+qYUEW+Jhg7YaiW\nfOp7a2" +
       "z8dN4DcWSyJ5Lb9S9triTCOm0aomeXDtzc1fn2l/y0+ajal1R4A3AoJMXnA5" +
       "E3/S9sirDL\nTTAlmLx18T6elL+NlDx5MCkbHZ1stsKomk7car9iq32on6k9" +
       "revQMtdZWbpff8/++aJDaJ/LPy9B\nxsrCfY3bDqrL+tLqSG8x7WXPWvzxRd" +
       "yx+tCuq3rzz7hy7AeSMHRH6ZyiuJpfdyNcqxs4LbPDw/xC\nx/l7iaAaVp/p" +
       "j1846crVQPCOs2CZ227REjoWZdrFFb72QvDwE79+l3VqIZE/qtGHJNGM5WXo" +
       "1mKj\nqqAsm7JpPbjRW7uYM+BGyou9xWCDySnyh6MO9zOfc1Zk7tjMBK8VR2" +
       "1rDPQNV+/4rBZjzyDoe27/\nVKLaE8WKgTZXEo4daLkLamGFc70rkcMFyw3U" +
       "rVP+CyMtjYMGFQAA");
}

class TestMethods {

    
    public TestMethods() {
        super();
        java.lang.Object test = new java.lang.Object();
    }
    
    public TestMethods(tests.A a, tests.B b) {
        super();
        java.lang.Object testAB = new java.lang.Object();
    }
    
    public TestMethods(Class[] clazz) {
        super();
        java.lang.Object testClass = new java.lang.Object();
        System.out.println("TestMethods constructor call(array of clazz)");
    }
    
    public tests.TestMethods reflectMethod(tests.A a, tests.B b) {
        java.lang.Object reflectObj = new java.lang.Object();
        a.m();
        return null;
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1362283500833L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJ1Xe2wURRifu+vr2mIftLVAayuW0EburraltFRiSmnjwZXW" +
       "toAUybG3N9cu7N2u\nu3PttSCBiLQSJRLA+EATEw3xEf+ABBM1QQK+gzH9Q3" +
       "yERIJGjELCHwQSNfjNzO3d3t61jTbZ7ezM\nN998j9/3++beu46ydQ1VY+Im" +
       "EyrW3d1dvf2CpuNglyzo+hDM+cVNtm/e9a3Rr9kRimmoStTjsl2D\naaJr3l" +
       "b/Wua59asd2XzILgUJKvKJuicoEMEjBT3edR2goVZV5IkRWTHOTNOy+8P85v" +
       "JtFyYdqGgY\nFUmRQSIQSexSIgTHyDAqDONwAGt6ZzCIg8OoJIJxcBBrkiBL" +
       "kyCoRIZRqS6NRAQS1bA+gHVFHqOC\npXpUxRo705j0oUJRiehEi4pE0XSCin" +
       "07hTHBEyWS7PFJOunwoZyQhOWg/iTai7J8KDskCyMgWOEz\nvPAwjZ4eOg/i" +
       "+RKYqYUEERtbsnZJEYhEjXVHwuO6DSAAW3PDmIwqiaOyIgJMoFJukixERjyD" +
       "RJMi\nIyCarUThFIIWz6oUhPJUQdwljGA/QZVWuX6+BFJOFha6haByqxjTBD" +
       "lbbMmZKVt9OYX/HOq/Xcty\nnhXEokztz4NN91k2DeAQ1nBExHzjnaj7mHdr" +
       "tIrjqtwizGU6l32wyXftbA2XWZJBpi+wE4vEL/7d\nWlU90/mL00HNyFMVXa" +
       "JQSPGcZbU/vtIRUwH5FQmNdNFtLH4y8NnWfe/gP+woz4tyREWOhiNe5MSR\n" +
       "YFd8nAtjnxTBfLYvFNIx8aIsmU3lKOwbwhGSZEzDkQtjVSCjbBxTEf+zwfNK" +
       "fDxFXwBACJIMDoER\nQ1gnbhWgRmCgP2FdiFFdxeM2G7hRZS0pGfD3qCIHse" +
       "YXT179ak/3hmeneYIoqOJWEFTCVLupwl6O\nPWSzMY33pgaGRjpIC+LPUx3F" +
       "h136GTtyDCOnFA5HiRCQMRSSIMvKOA76CUNSiQm1DCyAtMIAgA7w\n65dBEQ" +
       "M5RGJMQ0ut4EqWpBdGAiBmZu/db2/4x09THNC8lVHt3DTIwi5uW2HD4Pb1O6" +
       "aXOqjQeBbE\n0wGidfNr94s3DvWe/u7ry/VJEBNUl1Zb6TtpbVjN79cUEQeB" +
       "e5Lq31xU5NiCNh+x07p2AuUQAYAC\n9Xuf9YyUGukw+IYGK9uHCkKKFhZkum" +
       "SQRD4Z1ZTx5AxDxT1sXAIByIMHYoYOxVE2TV90cSF9lXEM\n0XhafGBsdufp" +
       "nMZLHxd8yoJiEF+RiSEHMeFlVJJMx5CGMcxffqn/6PHrU9tYLngybATlqNGA" +
       "LIkx\nZl+lDXK/MENJuyvLjr3YcOKSkeyFSe2dmiZM0FzH9s9Uv/y58BqUO5" +
       "SdLk1iXlXsJGQcQN8uNnab\nFun3A2y2Ji1Qh+OBei5ToOhreUbVdqbaDsZW" +
       "mnspJydOZXtOXD3Y8PMPF+N0Z2qjSanf/QeiZ545\nOwPVBTiBhiboG416ZQ" +
       "2VjuysyQB8WKnRmXxmXgGnhDaCctnOVe1gTimcQ9uvWwq6fYooyN51b5wr\n" +
       "mDkSbV3PDVlgEvCu88dqLr7VcLeWGRA/L9fEp/Hv3DFB25gkEvqvnaDazES1" +
       "+qGWxhVNja6mZoJs\nAgtZOdjIqaeTfbdy0zsN09sa2fRq+lo7j+KVriZw2R" +
       "awKF47PwaaZsHA0TgGXvhvGLBxlNNqMiWX\nIZbm9sD4huv1VbdftdMEzprb" +
       "DL02ocEvnnLU3bR/VFHHeCQrIOg8/dZLSvodJOVqwRwpTLhdBs8i\nw90Mbp" +
       "szNJDIULNqBLyIlSdlen4tUFXVkGpvS+Zx81x5bKEAaQaAZIuyMDk5f+7Wx0" +
       "Vo/7B2vx4a\nC4N8w4Hdt86/nl/LyYTuqTZzxDL2rldTeAMlz00Iwy15tjsQ" +
       "u79NPX6z8KBwYTuvqtLU9tkdiYZ/\nmziPlz/8/JUMbdhJFNUl4zEsJ52yns" +
       "b7s+FV0ZaaKz2tJ5+yesUuA2YGSt3mF8+9f/anld//eACs\nGEa5G/sGuzp9" +
       "3WBwzZzH+cWSsSWPOUalLxgxxBtk2o02dVOH2U0ApYbhQh4ZSuGs+1OK70F4" +
       "jsdR\nePz/EbAJq3oCq6uSKCRzobB9RXOLq3kVpSkq+4hZWyyhzYTpiXm0tb" +
       "tamig3Udme+UGtELRA44p6\nk/UaN2BfwoDWpAH7IQtzGNDmaoGaqkjRuVyv" +
       "5ZlgEaV+FZjuf7TfVqb9QOM/I8SlMzvqz6slX3L6\nMa76TugPoagsm3Jtzn" +
       "uOCsdLzAUnv51wf6ag2Jnp9GM6wSbFSTbhfTGm/guJmMNvpg4AAA==");
}

class A {

    
    public void m() { java.lang.Object mA = new java.lang.Object(); }
    
    public A() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1362283500833L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAIVWb2wURRSfu16vvVLtf6zQ/xSBVO4ajfih8uFS2lDZ0toD" +
       "KofkmNuda5fO7a67\nc9craKPRCJJoQkSjCRg/kBCV+MFGTYwJmtb/iTH9IE" +
       "aDCUGxiUI0hkiiBt/M3PXu9go02enczPv/\nfu+9OXsFlTs2aiUsyGYs4gQH" +
       "+odHse0QrZ9ix9kFZzF1t+ebt5WtzpIXoYyNWlQnS9sfKSHd+qb1\nz/rQtV" +
       "+8yKMgr64xVKOoTkjDDId0LTS0rQ8kdFgmnZmgZk5niZTDH1bd37Rv4VAZqo" +
       "miGt2IMMx0\ntd80GMmwKKpOkmSc2E5Y04gWRXUGIVqE2Dqm+iEgNI0oqnf0" +
       "CQOzlE2cMeKYNM0J652URWyhM3eo\noGrVNBxmp1Rm2g5DtcpBnMahFNNpSN" +
       "Ed1qcgf0InVHMeR7PIp6DyBMUTQLhayXkREhJDg/wcyKt0\nMNNOYJXkWHxT" +
       "ugGRaHdzLHvcvQMIgLUiSdikuazKZ2A4QPXSJIqNiVCE2boxAaTlZgq0MLTm" +
       "pkKB\nqNLC6hSeIDGGmt10o/IKqAIiLJyFoSY3mZAEOVvjyllBtkb81f8dG/" +
       "27Q+TcpxGVcvsrganNxTRG\nEsQmhkok4/VU8MTQ3lSLxFWTi1jShNd/sFtZ" +
       "OtcuadauQDMSP0hUFlP/3dLSuhj+OVDGzai0TEfn\nUCjyXGR1NHvTl7EA+a" +
       "uXJfLLYO7y47HP9j71FvnNiyqHkF81aSppDKEAMbT+7L4C9opuEHk6kkg4\n" +
       "hA0hHxVHflP8hnAkdEp4OCpgb2E2KfYZC8k/D3xvZPcn+QIAhCBRcAiM2EUc" +
       "FrQAagw2zmPuiwyX\nVTvt8YAbLe6SooC/7SbViB1Tz1z66omBHc8flQnioM" +
       "pawVCFEB0MI49HyLmrOBw8vhovg9/f7at9\ncbPzvheVRVFATyZTDMcpgfLB" +
       "lJrTRIsxgZ+6AqwKiAC+quMANUBtjIIgAW3wP22jLjek8oU4BDsM\nOFmcvf" +
       "Ht1dj0HM8+z1Yjly5Ng9hPSduqN0X2P3zgaFcZJ5r28bACafftpcfUq8eG57" +
       "77+sLGPHQZ\n6i6pqFJOXhFu80dtUyUadJy8+NN315SNoz3HvbyaA9BoGAZ4" +
       "QNW2uXUUVUZfrsvwYJUraFXCtJOY\n8qtca6hik7Y5nT8RWLiTL/USFjxYLg" +
       "NFg7r+jL/3/EerPhUe53pZTUHTixAmK6MuH+tdNiFwfuHV\n0ZdevnJknwi0" +
       "jDTKCP3NHshnwwrFGWxuPPHKppPncwlsyAsN2zae4fnLPL3Y+trn+BQULhSQ" +
       "ox8i\nsj6KFfC1R+zvLbjkv9dlSTim3HUwyFt3LiHJ+OFr869XdUhjOE9rgZ" +
       "h7slLyinK3fEDerP2J1n3k\n0T+rn8ML+2WTqi+uoQEjlfx1Zp5seOiFiytU" +
       "YICZ1mZK0oTmvXBrGxZjIedGzXj7xcEtZ550uyH6\nQOEgL2aLqZ+8c+7HB7" +
       "7/4VmwIooqdo5E+sPKABjcfkt1MbUuvfaRskn9Cyj+5SopGWbFTH2FbgJc\n" +
       "bQKz2OAB4ydVIuCdwvY6sLwSvlr4TmVbofjPLxv40phFNF+7xbohW+YM+a1U" +
       "nOrqrUFyWwSFGfIk\nIXpri55Btp6EWZDODqv3on/1apd7tskcNxc+ggoJt9" +
       "93g3Q3LP0hMh2AFwl2di6nu3QiupQcbzt9\nee7SWKPEiXw2rCuZ3IU88ukg" +
       "vLjD4kjtvJUGQb3Q03l2duynuDfr/YMM+dImf6v5hb29KAPxCPNy\nbS55qc" +
       "n3hNq1eGDjvFX3pehsyzM/AIM3kaK0IPOFKPBbNknoQmdANiw5w/YwVC7mEP" +
       "8xLiHdBJNQ\n9Ao+SoJyxmes/wG4v3hMrwoAAA==");
}

class B {

    
    public void m() { java.lang.Object mB = new java.lang.Object(); }
    
    public B() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1362283500833L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAIVWb2xTVRS/7bpuHdX9xwkbGzAEMmkXjfih8qGUESYPNlf+" +
       "SJGU2/dut8du33u+\nd9t1Q4lGI0iiCRGNJuoHJRKV+EGiJsYEzeb/xJh9EK" +
       "PBhKC4RCEaQyRRg+fe267t64Al7+723vP/\n/M4599QlVOvYqIuwEJu0iBMa" +
       "iG0bxrZDtBjFjrMDzpLqTs83bysbnDkvQnkbdapOgTYWryLd8Kb1\nz6rwlV" +
       "+8yKMgr64x1KioTljDDId1LTy4KQISeiyTTo5Ss6izSsrBDxvubt87M1WDGh" +
       "OoUTfiDDNd\njZkGI3mWQMEMyaSI7UQ1jWgJ1GwQosWJrWOqTwGhaSRQi6OP" +
       "GphlbeKMEMekOU7Y4mQtYgudxUMF\nBVXTcJidVZlpOww1KQdwDoezTKdhRX" +
       "dYREH+tE6o5jyMDiGfgmrTFI8C4WKl6EVYSAxv5udA3qCD\nmXYaq6TI4hvX" +
       "DYhEt5tj3uPerUAArHUZwsbMeVU+A8MBapEmUWyMhuPM1o1RIK01s6CFoSXX" +
       "FQpE\n9RZWx/EoSTLU4aYblldAFRBh4SwMtbvJhCTI2RJXzsqyNeQP/nd0+O" +
       "8ekXOfRlTK7a8HpmUuphGS\nJjYxVCIZr2ZDxwf3ZDslrtpdxJImuuqDncrc" +
       "mW5Js3QBmqHUAaKypPrv+s6u2ejPgRpuRr1lOjqH\nQoXnIqvDhZtI3gLkL5" +
       "6XyC9DxcuPRz7b89hb5Dcvqh9EftWk2YwxiALE0GKFfR3sFd0g8nQonXYI\n" +
       "G0Q+Ko78pvgN4UjrlPBw1MHewmxM7PMWkn8e+N4o7F/jCwAQgkTBITBiB3FY" +
       "yAKoMdg4D7kv8lxW\n04THA250ukuKAv62mFQjdlI9eeGrRwa2Pn1EJoiDqm" +
       "AFQ3VCdGgj8niEnNsqw8Hjq/Ey+P3dSNOz\n65z3vagmgQJ6JpNlOEUJlA+m" +
       "1JwgWpIJ/DSXYVVABPAVTAHUALVJCoIEtMH/nI1WuCFVKsRB2GHA\nyeyha9" +
       "9eTk6c5tnn2Wrj0qVpEPtxaVtwbXzf/fuPrKjhRBM+HlYg7b259KR6+ei209" +
       "99fW5NCboM\n9VZVVDUnrwi3+cO2qRINOk5J/InbG2t2o13HvLyaA9BoGAZ4" +
       "QNUuc+uoqIxIscvwYNUqaFHatDOY\n8qtia2hgY7Y5UToRWLiVLy0SFjxYLg" +
       "NFg7r6hL//7EeLPhUeF3tZY1nTixMmK6O5FOsdNiFwfu7F\n4eeev3R4rwi0" +
       "jDTKC/0dHshn6wLFGepoO/7C2pfPFhPYWhIatW08yfOXf3y266XP8StQuFBA" +
       "jj5F\nZH1UKuBrn9jfWXbJf68skHBMuetgM2/dxYRkUgevTL/a0CON4TxdZW" +
       "LuKEgpKSre8gF5vfYnWvfh\nB/8MPoVn9skm1VJZQwNGNvPr5DRZfd8z5xeo" +
       "wAAzrXWU5AgteeHWtk2MhaIbjbu7z29ef/JRtxui\nD5QP8kq2pPrJO2d+vO" +
       "f7H54EKxKobvtQPBZVBsDg7huqS6rNuaUP1IzpX0Dxz1dJ1TCrZIqUuwlw\n" +
       "tQnMYoMHjJ80iIAvF7Y3g+X18DXB93qhFYr//LKVL20FRPO1V6yrC2XOkN/K" +
       "pqiu3hgkN0VQlCFP\nBqK3tOIZZOsZmAW5wrB6L/FXv3axb5PMcUf5I6iccM" +
       "td10hv69wfItMBeJFgZ/t8uqsnokvJsWUn\nLp6+MNImcSKfDSurJnc5j3w6" +
       "CC9usThSl99Ig6Ce6Vt+6tDITylvwft7GfLlTP5W8wt7+1Ee4rGR\nl2tH1U" +
       "tNvifUFbP710xbzV+KzjY/8wMweNNZSssyX44Cv2WTtC50BmTDkjNsF0O1Yg" +
       "7xH7slpNth\nEopewUdJSM74vPU/FmcsAq8KAAA=");
}

class C extends tests.A {

    
    public C() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1362283500833L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAIVWbWgcRRieu1w+Ljm8JE1qrEkTYqoN2jtBLEgsGK4Jnt2Y" +
       "I5dam1quk925yzZz\nu+vObHJJa1HUthYUxCoK1V9C/fploYIIFVIVFUXyw+" +
       "KPgqWKFW3BH8WCir4zc3t32Uvx4O5mZ97v\n93mf2Q+uokbmoj7CE3zJISwx" +
       "lprIYJcRI0UxY9Owl9N3h759X9vBroQRKrmoV2dl2VS2TnTHu85f\nW5LXfw" +
       "6jkIbCpsFRXNNZ0sAcJ00jmd45AhYGHJsuFajt+6yzcujj1vu6951fbkDxGR" +
       "Q3rSzH3NRT\ntsVJic+gWJEUZ4nLRg2DGDOowyLEyBLXxNRcBkHbmkGdzCxY" +
       "mHsuYVOE2XRBCHYyzyGu9Olvaiim\n2xbjrqdz22UctWsH8QJOetykSc1kfE" +
       "RDTXmTUIM9iY6giIYa8xQXQHCj5meRlBaT42IfxFtNCNPN\nY534KpF504JK" +
       "9Ac1KhkP7QIBUG0uEj5nV1xFLAwbqFOFRLFVSGa5a1oFEG20PfDC0aabGgWh" +
       "Fgfr\n87hAchz1BOUy6gikorIsQoWj7qCYtAQ92xToWU23Jpti/5zI/Dkgex" +
       "4xiE5F/C2gtDmgNEXyxCWW\nTpTiDS9xMr3X61W46g4IK5nRLR/t1q6c61cy" +
       "t68jMzl7kOg8p/+9vbdvdfSnaIMIo8WxmSmgsCZz\n2dVM+WSk5ADyN1Ysis" +
       "OEf/jp1Od7n36P/BZGLWnUpNvUK1ppFCWWkSqvm2GtmRZRu5P5PCM8jSJU\n" +
       "bjXZ8hnKkTcpEeVohrWD+ZxclxykPl3wfae8lv8AQCgShYQgiGnCeMIBqHFY" +
       "sCeCByVhq30xFII0\neoMjRQF/D9vUIG5OP335q8Nju144rhokQFWOgqNmaT" +
       "qRQqGQtHPr2nKI+hpiDH7/cKT9pW3sbBg1\nzKCoWSx6HM9SAuODKbUXiZHj" +
       "Ej8dNViVEAF8xWYBaoDaHAVDEtqQ/4KLBoOQqg5iGlYYcLJ65N/v\nruUWz4" +
       "jui251CesqNKj9vIotNpzd/8iB44MNQmgxAlUUmQz9v/Wcfu3ExJnvv764tQ" +
       "pdjobqJqpe\nU0xEMPyMa+vEAMapmn/7tnjDHvTYy2ExzVEgGo4BHjC1m4M+" +
       "1kzGiM8yoliNGmrL224RU3HkU0Mr\nn3PtxeqOxMIt4qdTwUIUKxCgJKgbzz" +
       "bde+GTts9kxj6XxWtIL0u4moyOaq2nXUJg/+LrmVdevXps\nnyy0qjQqSf89" +
       "IejnhnWGM9HTdfK14VMX/AZuqBoddV28JPpXema1740v8JswuDBAzFwmaj7W" +
       "OhC/\nd8v1PTWH4vmOsojAVHAOxgV1+w0pzh66vvJW64AKRuj01Zi5s2yl6s" +
       "g/FRfkzehPUvexx/+IHcXn\n9yuS6lw7Q2OWV/xlaYXc9eCLl9aZwCi3nW2U" +
       "LBBazSLobUJeC34a8T39l8a3n36qPg2OQilR5Z66\nC1ZdA/rg6oGtK07Hlx" +
       "KQFaqOAl/mPUorcdXGCPef45K8KWsUVThT1PMQR42SPsTDqPRb+xqheFmx\n" +
       "+OFTl48O//jDN2Wmr3mDqEr9mnvOO/v8uVWgGBgWuMsxe7QaBLxLiFVY3q8w" +
       "Q5JvxE6rjKVNhbQT\nGE1qPnC/qkx3heJGS85/7iZnq+0IAAA=");
}
