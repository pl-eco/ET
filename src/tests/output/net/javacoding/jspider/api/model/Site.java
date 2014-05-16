package net.javacoding.jspider.api.model;

import java.net.URL;

import et.util.MyUtility;

public interface Site {
    int STATE_DISCOVERED = 0;
    int STATE_ROBOTSTXT_HANDLED = 1;
    int STATE_ROBOTSTXT_ERROR = 2;
    int STATE_ROBOTSTXT_UNEXISTING = 3;
    int STATE_ROBOTSTXT_SKIPPED = 4;
    
    public int getState();
    
    public java.lang.String getHost();
    
    public int getPort();
    
    public boolean isRobotsTXTHandled();
    
    public boolean getObeyRobotsTXT();
    
    public boolean getFetchRobotsTXT();
    
    public java.net.URL getURL();
    
    public Folder[] getRootFolders();
    
    public net.javacoding.jspider.api.model.Folder getRootFolder(
      java.lang.String name);
    
    public Resource[] getRootResources();
    
    public Resource[] getAllResources();
    
    public Cookie[] getCookies();
    
    public java.lang.String getCookieString();
    
    public boolean getUseCookies();
    
    public boolean getUseProxy();
    
    public java.lang.String getUserAgent();
    
    public boolean isBaseSite();
    
    public boolean mustHandle();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1ae2wcRxmf8/uJYzsPJ3FqJ3FInNpn+/yIY0cljh/4nKt9" +
       "3DmPGpfr3t7Y3njv\ndrs7Z19CiRoISQsSUmnKQw0NSEVBKELQqkWiiBC15V" +
       "ERVPmPtjxaFVKqVhDUikciFBS+mdm7ffju\nHAM6S7s3N/vNzG++7/c9Zs+X" +
       "rqNCXUP1ou4mx1WsuweDfkHTcWRQFnR9ErpC4suFpf6LB2NKHnL5\nUJ4UIa" +
       "jKJ+ptEYEIbVKkzTvUn9BQo6rIx2dlhRjzLJulb/utxV+dHducj6qmUJUUCx" +
       "KBSOKgEiM4\nQaZQRRRHw1jTByIRHJlC1TGMI0GsSYIsnQBBJTaFanRpNiaQ" +
       "uIb1ANYVeYEK1uhxFWtszWSnD1WI\nSkwnWlwkiqYTtMZ3TFgQ2uJEktt8kk" +
       "76fahoRsJyRH8QnUT5PlQ4IwuzILjel9xFG5uxbYT2g3iZ\nBDC1GUHEySEF" +
       "81IMNNHgHJHacdNBEIChxVFM5pTUUgUxATpQDYckC7HZtiDRpNgsiBYqcViF" +
       "oE0Z\nJwWhElUQ54VZHCKozinn549AqpSphQ4haJ1TjM0ENtvksJnFWhNFFf" +
       "/+gv9GI7N5QQSLMsVfDIPu\ncgwK4Bms4ZiI+cCbcfc5733x+jyEQHidQ5jL" +
       "DOz44SHfe5cbuMzmNDIT4WNYJCHxVk/9lqWBd0rz\nKYwSVdElSgXbzplV/c" +
       "aT/oQKbF6fmpE+dCcf/jTws/se/i7+cx4q8aIiUZHj0ZgXleJYZNBoF0Pb\n" +
       "J8Uw752YmdEx8aICmXUVKew7qGNGkjFVRxG0VYHMsXZCRQgVwwW7Qn7E/yrp" +
       "jaCioESwWyVoZwyT\naWp5UYmAzaeP6aoUwdq0oErTUSWC5WkumaBTVi26XN" +
       "Q3nZ4lAw1HFRnGhcSL1155aPjgo49wO1Fu\nGWAI2gFruc213MZabljLzdZy" +
       "07WQy8VW2WDXGTVChPrKX57pX/OlVv35PJQ/hUqlaDROhLCMwccE\nWVYWcS" +
       "REGMmqLYRmPAISVoSBj7B0SIaJGP9BSQsa2ubknemtXmgJQKalk7df/Wto8V" +
       "lKEWrStXR2\nDg0MNM+xVTQH7x974JFt+VRosYDqOsH8bANdxam3Eerxyfmj" +
       "4U//48Wnyhr5/HRMPZuABsPNODlk\nePBe26iQ+OCJ851LwSMSp67TFxzCJ3" +
       "5y6KmbV8lbzDilEJOIAEwCB7/L6ZE2J6Ku6QR/WNDMeXtf\nW6gu+v6FaB4q" +
       "nkJrWKwTYuSwIMdxEEMsLZP0QaPThyptz+2Rh7tZv+HhBNU7cVmW7U+GSaqs" +
       "AivZ\noE2labuUEbeSyawBddbB1QFXreEP7JM+rKG32gSjXjWzLQXk9kKYnc" +
       "VazR+/+fSNU2d7QXFeVLhA\ngYNO1phy43GaLM5cemJL+bm3v8iMmJx5F2WL" +
       "0y4U983PFbW//uPyl5k1khG/ypIaQHc8flSbZJvU\nMNXpm1/zP/7E9bOfZE" +
       "zjVMsnMIkUE0BtRWo8LEsiNHSW1BKQcoKTA5PDoSFvcHDi8HBgeMjJK78m\n" +
       "RSEqLRhh87mpv7VH3r17iPOqzpqOrYKjntu4qfa9DzijIDcK+njK55fz0bHI" +
       "Y3c9/e6z1wJrebDg\nCWz7shxiHcOTGDNqhZqAPWzNtgKTfunurZdOBt4K85" +
       "3U2MPKcCwe7b7wBm7eXyGmCVn5kGZBi2xf\n3SwEMiZts/GpF66NBp82LucT" +
       "beyGXhdt7GdfW9m93bAbbXvorZPeusBYG7ixAhMHJiaDk0cnQ6MD\n40O+4S" +
       "H6vC8TjB64GgwYDZlh5NHGyB3BWOeEMRwITASyguiHq8kA0ZQZBFvMd0cgNj" +
       "lBHBofPuoN\nTnrHP54VCbVKs4GkOTOSAtoI/HdWCR70+v1WqyTSzENQiRCG" +
       "bCKIwKTSVNnGZrYkh9o0RYe7bu25\nrzSff92ZExAl/pZMtRIj/dmjH1acEV" +
       "66nw6lA/fB2kRRW2W8gGVzVeck97LSMBlhq440/GGk5+Jn\nnOvX0CLAGjvs" +
       "w0Lile9d/l33G789DR41hYrHJ4KDA75hcL6GrMuFxOqFzZ/In5N+kccKU54C" +
       "lhW0\n9kH99sBfpmGox2OTqfC/PLn7NUXEESjazXW/+q/RDx4v3PtcHs0jZl" +
       "6kMzQ5skz5jKJFBZkukKyg\ny8icpiyaPY6UU26EhRaDjC0OMpoEthGH+emU" +
       "lSYsgHwKdF9rpoMBTROO09IjcWppy9d/Lnwjn2ao\nAl06gXkGslUhxgz0bn" +
       "1Iv88DT2cxoYcgprk+xMRmbdvYDJfb2Ib7f9yGE8SKCOMEFQPCUUUnoIM6\n" +
       "K/942cBzykPnr51pfvs3V41635K4TKn3Q6fjz3/+8hLjmSNrsRMlbbnYKQto" +
       "ELIXE2W8GH6YOjYd\nuaejA/DUwEL0AOqWIm6fIgqyd+hbV8qXHov3jHEklR" +
       "YB71Ao0XD12823GxkCY8Eiy4nC+F68IGhm\nPlXpxymC+jMU7aKiYUvVTmsX" +
       "DeoBt9rX0dne4mlv7ezeTVClQuag6k6qks65llhrGX78S2d/Glfb\nDfu359" +
       "r+j3L7+xWNZCToTrg8BkBPrgF+GWpZSQ8oYYXokB5GhVhExvyc3aPy4f2wh7" +
       "CiyBjKX6Os\n6Ei3jx1wdRn76Mr1Pi4AG0DRE2F8PLUZ2v9kOqQfRbzyQMnP" +
       "XCL9DhzzAOkIJuLcylA3IF4VoORn\nLqH+AOwNUA8FeNVzkgeRH5lBxMP6P0" +
       "tvLxD0sQwuDt49rcrxWSk2DWcIMhEnapz4WQd1847elu49\nrT3UzddDpo8R" +
       "6uY0FuxqdltWB3+vYP5OT+TQmU5btHrrM7TVl2ttXSHoI4A3oChkhL1Y0Okh" +
       "yhLL\nWd6jofz04sHru+pvPJmH8rKE8jTvllIzhMRn8ps+zHthfRNL/wVhQe" +
       "fR3vlSbvk7N9urNAa83KbD\n6iw6tNLg1yYNOtWkhXau+LqEq0ZV4aDCd+7p" +
       "9nSbNFoiqP0OX+/0dfe2dHS0dvZAlWvX+069kZdU\n6ThCS5l9xv72/Z844m" +
       "JiLqt6fm+qx7K9N1exvZ72lk5Pa1cnMYvFsyuz8DVIlnZtWEC9Y4LqMkH9\n" +
       "aXWgQOddXeCrtlVSKqcTvppO77vgusfQ+z259s33eXqgeOkL7rgG/sAEX7Fh" +
       "rM2C0arHv5t67Elx\nv3lF7ieXtrG/o9O0xM3VWMLDLNFO0EbnzrLyn5Yb+4" +
       "097s+1HW4RVAVoB2R5JTNkgmgxg6vYNMMe\nVmf+065Zk+Ou0tVotovFlb0E" +
       "1TmwZlVsI1wHDNQHcqxYVyVBZQB2UFHmpbQ6rc6CzqrTOlOnvasI\n63xhu/" +
       "rNuOeqX436e5j6PQTVmjvKqvntcA0ZexvKteYbOaU5Tn4Mseqz2dTnXlMfuz" +
       "NXS+xAJEVV\n0AfrMH7c80IPrZY83S2d7a3dHphhrU4V5libpYl0StoG14ih" +
       "pJFcK8nNs9IhHRv2pEJpC17qRaMG\nzNFcw9xDUDmH6deUxPGMIKkuxwyQY7" +
       "kGuR8KYQ5SG5iFctnKNm+KbZ52k21jBI1mYxsR9PnpRUWb\nn7afSiah3+Bd" +
       "196W7p7WPaxIJ3OS7k5yLwUjI/G2wuUzlOXLtbLGCf0h5wCUxzS6ZDQoxThu" +
       "YBzP\nNcYjgDEa1wk/fHOMCaj6KGL6S0rdsv8K4L9di9uWHtj1olr9S34GSP" +
       "6+XOJDJTNxWbb+tGRpF6ka\nnpHYrkr4Wz9OnTBBjSuFeYIK2Sfdhkvg4zBB" +
       "mzKPIygf7lb5OWBQenmCio2WVX4ejlV2eVCX+cUq\nGoPVQJQ2lVTusrwk4i" +
       "/TEup/AKCH+JuwIQAA");
}
