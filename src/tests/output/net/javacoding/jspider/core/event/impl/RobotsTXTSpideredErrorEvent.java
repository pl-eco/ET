package net.javacoding.jspider.core.event.impl;

import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.HTTPHeader;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.net.URLConnection;

import et.util.MyUtility;

public class RobotsTXTSpideredErrorEvent
extends net.javacoding.jspider.core.event.impl.URLSpideredErrorEvent
{

    protected java.net.URL
      robotsTXTURL;
    
    public RobotsTXTSpideredErrorEvent(java.net.URL robotsTXTURL,
                                       net.javacoding.jspider.core.SpiderContext context,
                                       java.net.URL url,
                                       int httpStatus,
                                       java.net.URLConnection urlConnection,
                                       HTTPHeader[] headers,
                                       java.lang.Exception error) {
        super(context,
              url,
              httpStatus,
              urlConnection,
              headers,
              error);
        this.
          robotsTXTURL =
          robotsTXTURL;
    }
    
    public java.lang.String
      toString(
      ) {
        return "robots.txt spidered : " +
        url +
        " ERROR : " +
        error.
          getClass() +
        (httpStatus !=
           0
           ? " (HTTP Status: " +
         httpStatus +
         ")"
           : "");
    }
    
    public void
      accept(
      java.net.URL url,
      net.javacoding.jspider.core.event.CoreEventVisitor visitor) {
        visitor.
          visit(
          url,
          this);
    }
    
    public java.net.URL
      getRobotsTXTURL(
      ) {
        return robotsTXTURL;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALUYa2wUx3l857cNfmAIiQ024AZcuLPvjvMD90cc28iGAx8+" +
       "Q4Lj6LLeG5uFvd3N\n7px9EIpalUCSH1FR6EuhiRq1RWpRWwUlVZWqBOXVpk" +
       "VKXQloq0StiKJULVGiqgK1qeg3M7veub3D\n8ON60u7OzXzffO/HzLnrqMwy" +
       "UYtsBclhA1vBwURcMi2cGlQly5qAqaT8VllV/OxOTfehkhjyKSmC\n6mKy1Z" +
       "mSiNSppDpHh/qzJmozdPXwrKoTe5+8XbZt+Hz+dyd3NPtR3SSqU7QEkYgiD+" +
       "oawVkyiWrT\nOD2NTWsglcKpSdSgYZxKYFORVOUIAOraJGq0lFlNIhkTW+PY" +
       "0tU5CthoZQxsMprOZAzVyrpmETMj\nE920CKqPHZTmpM4MUdTOmGKR/hgqn1" +
       "GwmrIeR8eQP4bKZlRpFgBXxRwpOtmOndvpPIBXK8CmOSPJ\n2EEpPaRooIlW" +
       "L8aixO07AQBQK9KYHNAXSZVqEkygRs6SKmmznQliKtosgJbpGaBC0H233RSA" +
       "Kg1J\nPiTN4iRBq71wcb4EUFVMLRSFoJVeMLYT2Ow+j80Ea42V1/73mfiNNm" +
       "bz0hSWVcp/BSCt9SCN4xls\nYk3GHPFmJnh6dH+mxYcQAK/0AHOYgS/8fG/s" +
       "4wutHKa5AMzY9EEsk6T8eXfLmoWBD6v8lI1KQ7cU\n6go5kjOrxu2V/qwB3r" +
       "xqcUe6GHQWXx9/e/9XfoT/7kOVo6hc1tVMWhtFVVhLDdrjChjHFA3z2bGZ\n" +
       "GQuTUVSqsqlynf0HdcwoKqbqKIexIZEDbJw1EEIV8JTAsxHxXyN9EbRmXJ/W" +
       "iTXx8ETCUFKgrtSw\naerm8BzWSNAgaEjDZIo6hKynwBWmDloMbErWTTyFKd" +
       "SUkjbUqSW3yVI26uZLSmg8e6NRBdcd0VVA\nSspnr717dHjn009x21J/tAUg" +
       "6EFgJOgyErQZCVJGgoyRIGUkuAQjqKSEsXBPrhGoVVM0+P7xcn/9\nswHrVR" +
       "/yT6IqJZ3OEGlaxRC0kqrq8ziVJMxrG4QIYY4JXl07DQ4OfCVV2IgFFGh9zk" +
       "TrvY7shv8o\njCTwzoVjt977JDl/nvoc9ZEmujtnDSx+iPNW25F4dMdjT633" +
       "U6D5UmpMAG2/8+5J+ZNndp2//Nv3\nN7kBQ1B7XhznY9I49LIfN3UZpyDPud" +
       "t/698jnz5X1veKD5VCcEN6IxI4JeSKtV4aOfHY7+Q2qizA\nrJnRzbSk0iUn" +
       "IVWTA6Y+784wN1rGxvWggBp4qCLutT16FX3RxUb6WsGdjurTIwPLnDe/Vt51" +
       "5Zc1\nbzGlOEm2TsjGCUx4yDa45pgwMYb5978df+4b108+wmxhG4OgciMzrS" +
       "pylvF3TwnYfkWB9BFc3XT6\nmx1nrjjGXuHuPmCa0mFq6+xXF9Z85x3pu5Ba" +
       "IMQt5QjmEcwoVQDSauxsOTy4iycknr6Onrl2ouMv\nf7xkpzihdLpQf0sez7" +
       "z65IUFH1VxFRQxydrtBBoronRUwgoLmJG5PJ2pYvqs5rEcIjZmKNQbBYYa\n" +
       "gRItukElFYzpsqSODn3vYs3CqUz3Ds7KMgFgdCiZbb30g45bbYwFm2K5kEXt" +
       "/xVzkrnbzQH0EyZo\nVzEy0rZweEukLxCNElRrOoB7x2PMeE0wycxCU44z2c" +
       "kl3yZI3s0WIvTVX0S+oj2Bnl6CKmTegDgs\ndSyVAPlegwKGze+AwG+Py++D" +
       "ReS3tyvQ20OQP2OyStwL/tAsOmjcVNJg1jm7DL8y+c+u1Eebh7hj\nrBbbOx" +
       "FwJHwLt6/4+FMWoB43LVDrPUROrf3+R+evjTfxnMcbog15PYmIw5siprNaIw" +
       "syrFuKAoN+\nc/O6c8fGP5jmkjTmVpVhLZOOvngVdzxQKxcoZ35o2yBnMLmi" +
       "osHigsF6XYPtIWisWAYLdUUDoQiE\n0jIwGfiMBpkBos5xtFWi7wvLkEkFY7" +
       "FsRVVxfH7n9U0tN573Id8S+aRAT7e4Q1J+2d/+me+1Ve2s\nhpROSxZPOd5m" +
       "OL/XzWlhmf5qFuvDCXi+7tSFAvVB1Pojgtb7DEcTm28TcpKhBNN6CqvBkYmJ" +
       "+AiW\nYNIwDHePvqhruWQxLRfZGghFt0JyOMCIWqIMskC/y6WfKib9aHcg1A" +
       "PZvwzTFUdPvIjRfig4nJWx\nQd3FqYP0vYWNA1T/rIYhxu96G4S2Sd6ucDs1" +
       "u9NjpKef+NcbL1S38ZpJcVoWO6CcTJODlZQfP3Im\nspB4SOHx6c0YHuAjv9" +
       "r7ws1L5AOebxbbGEptXTafwX2S0GH1Xp5rKP/Zi2kfqphE9eyEJ2lkn6Rm\n" +
       "aLswCX5rDdqTMSiF4nrueYtX6f7FNq3Fm7IEst4Gys0vMM6t2m7PtByeVnia" +
       "7Jho8sRECWJlNsMQ\n2tl742KHU2WYOgH+cCpbqGzabviEEEpbPb0B1/nQA3" +
       "0XP7z+U+UGq//VLMQHKIbNfRWbEZKIXzcs\nerISjvb2Tu1jhsWT9laHbLS7" +
       "u2hdQqQbXD4QhurWMDEymgiKMlOiRz16OAYnvHxxKZPIPXaBNy0X\nAgbqhL" +
       "gIWaR0fHhgiJVS1sIy8e63Y8UNpxY7lEDFa253WmZl6uTDn9WekN581GfHXQ" +
       "w0RXQjoIIa\nVDcEvZvsYpnV8ba6h1r/ur377Je9MeinRzoxBnPRkvLFn1z4" +
       "c/Tqn45DXE2iit1jicGB2DCooHVJ\nckm5Ya55j/+A8mvmI3Y45F1p5CL15w" +
       "ZBtYlJxtQmckKhLef40AJPs6385kLHB0H1t8lkd0xzpwmq\nJDq/SRHj5Hkh" +
       "XYfcdH2maJ1Zz5ZQKBCGTrLBIb/RauM6cRJ3veuHHAKxlVM5SuqzcwZyvnev" +
       "JB/T\ng08U+4eC2GFX7LNFC9nQlnAkEOkSG1KB/I8F8hGX/Lkiko+EA9FuKN" +
       "FzCpxm3CIZvvMFxiAM2Ub7\nOOqdnesl2kPKtOSy5e0GR9kJSWROp/ehvMPs" +
       "KmTXNng22Hbd8H9y/l/AoXoWk/Hb1IrXBWtsda1x\nkaCepazB7DAwC4oapV" +
       "c+tDWJbgn3BKJdXyRoJdelhypzBAR1q3kJ+9ED+eq822J+pymvX3hs0xtG\n" +
       "w294j+rcO1bCsXUmo6pi8RXG5YaJZxQmayUvxVzwdwi6/+4utMCS9MOU8zZH" +
       "fpegdXdEpj0a/YqI\nl0D8JRCBFP2IGO/BcaAwBji4PRLh/0DQ8lx4gqrdPy" +
       "LoZYhQAKXDK4boFFeFBiKy2It/6S7v/8DW\n+YbN2ocXpzAnDCwr9JYi+9Jr" +
       "pXue/f1/WJVxTtz0mhtaDRa/nQOapB62WANH1+hVn5wxTdiUVVnb\nzjUW35" +
       "FfazeLncoirfaJ/fHh/GYlVNxmJRQFM9JmpTh3ptDR3FtIcUwYsW+hYj1pk/" +
       "4fDJbwPbsZ\nAAA=");
}
