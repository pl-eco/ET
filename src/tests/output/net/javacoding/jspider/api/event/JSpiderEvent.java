package net.javacoding.jspider.api.event;

import java.util.Date;

import et.util.MyUtility;

abstract public class JSpiderEvent
  implements net.javacoding.jspider.api.event.EventVisitable
{

    final public static java.lang.String EVENT_PACKAGE =
      "net.javacoding.jspider.api.event.";
    final public static int EVENT_TYPE_ENGINE = 1;
    final public static int EVENT_TYPE_MONITORING = 2;
    final public static int EVENT_TYPE_SPIDER = 3;
    protected java.util.Date date;
    
    public JSpiderEvent() {
        super();
        date = new java.util.Date();
    }
    
    public java.lang.String getName() {
        return this.getClass().getName().substring(EVENT_PACKAGE.length());
    }
    
    public java.util.Date getRaisedDate() { return date; }
    
    abstract public java.lang.String getComment();
    
    public boolean isError() { return false; }
    
    public boolean isFilterable() { return true; }
    
    public int getType() { return JSpiderEvent.EVENT_TYPE_SPIDER; }
    
    public void accept(net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.visit(this);
    }
    
    public java.lang.String toString() { return this.getClass().getName(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZe2wUxxmfO78fYGwMcbHBBtwQN/YZP3k4UmPsAx8+7IvP" +
       "IcV1dKz3xmZh73az\nO2cfNKWNkkCaSpFQSB8qSZoqFW1FHyoK+SNVKc2jT6" +
       "TWqhLSKlFaIpSqBaVKK1CaiH7fzJ73cWcc\nU2Fp92Znvpnvm+/5m/Gpy6TA" +
       "NEidbAbYQZ2agb5oRDJMGu9TJdMcha6Y/GpBSeTkYFLzE1+Y+JU4\nIxVh2W" +
       "yNS0xqVeKtof6etEEadE09OKVqzFona5Wt6z+a+f3RnbV5pGKMVCjJKJOYIv" +
       "dpSUbTbIyU\nJ2highpmbzxO42OkMklpPEoNRVKVQ0CoJcdIlalMJSWWMqg5" +
       "Qk1NnUbCKjOlU4PzzHSGSbmsJU1m\npGSmGSYjy8L7pWmpNcUUtTWsmKwnTA" +
       "onFarGzQfIYZIXJgWTqjQFhCvDmV208hVbt2M/kJcqIKYx\nKck0MyX/gJIE" +
       "TdR7Z8ztuHEQCGBqUYKyfdocq/ykBB2kSoikSsmp1igzlOQUkBZoKeDCyKp5" +
       "FwWi\nYl2SD0hTNMZIjZcuIoaAqoSrBacwssJLxlcCm63y2MxhreHC8o8fj1" +
       "xt4DbPj1NZRfmLYNIaz6QR\nOkkNmpSpmHgtFTge2pOq8xMCxCs8xIKm99Mv" +
       "3ht+72y9oKnNQTM8sZ/KLCZ/1F23erb33ZI8FKNY\n10wFXcG1c27ViDXSk9" +
       "bBm1fOrYiDgczgL0Ze2/PlH9B/+ElxiBTKmppKJEOkhCbjfVa7CNphJUlF\n" +
       "7/DkpElZiOSrvKtQ49+gjklFpaiOQmjrEtvH22mdELIMHh88U0T84TdhZOnO" +
       "qK7EqRGcpkkW0Blp\nTVI2jh4ga3Gw/fh+k4+PS7oyTpFo3D0jjSwqZnw+jF" +
       "VvpKnglgOaCtQx+eTF3z4YHPzKY8Ju6GuW\ncIy0AM+AzTNg8QwAzwDnGXDy" +
       "JD4f53abW5donDjG0D9/2rPsiRbzjJ/kjZESJZFIMWlCpRB7kqpq\nMzQeY9" +
       "z5Kh2Ozv0LnLN8AvwURIipsBCPC1DetEHWef3RjuIQtCRwstnD1/9wJTZzGl" +
       "0HTV2NqwvR\nwHAHhGzlTdH7d+59bF0eEs3ko02AtHHh1WPylcd3nX79d2/d" +
       "Yfs9I41Z4Zg9E8PJK37E0GQah3Rl\nL//1Dwfef7Jgywt+kg8xClmKSeBbEP" +
       "JrvDxcYdWTSVGoLJhZNqkZCUnFoUxeKWX7DG3G7uEes4S3\n0QnL4CmA53bL" +
       "MRvxhYNV+Fou/Av16dkDT4DXHi7c+MbPyl7lSsnkygpHUo1SJiKv0jbHqEEp" +
       "9L/1\njciTT10++nluC8sYjBTqqQlVkdNcvtt8YPvlObJAoKb6+NeaTryRMf" +
       "Zye/Vew5AOoq3TD82u/uav\npKchQ0CkmsohygORcE4kwwDfzbzd4hjE73UW" +
       "CfqfN7K2Y43IGC8x8YX/vPxMaYMQBufU8WWwfNbS\nzJRg3y7XrJj8wKETHb" +
       "PR+xSR7LzZ00N86Of3PnPtPHuba9r2D+S2Np0t4G7J4bqbX5+uLPzJswk/\n" +
       "KRojy3gFlJJst6Sm0A5jUMPMPqszTJa4xt31SCTfnjn/r/P6poOt1zPtlANt" +
       "pMZ2iccZa+CJwlNl\nOWOVxxl94CFrF8xWSLuVr9nI3xuEd+UxkEhJSrxgNY" +
       "GrmRxopBlZEtwdHBqNRXr7Bnt3BMFsNU6z\niV2LAvXgiYtHmt5587xVxBzg" +
       "yKb6e+yR1JlHz876MfpKAKZI5pC9d4BJ2PJx6AAWjLl1USoyej8j\nxXxmR0" +
       "c7yFMFjBBVBZS45Rj9d2859+7lHytXOZdSDlp6cYLFpoT3OPjmabqJ5dGBz6" +
       "yVGod1E7PU\nEgeTUH8sXX/+u03XG/j6ltCFjlJrfRdNS8aQs5iIDW/a1N3J" +
       "yOZFFrOtnV3Nnd0tXVsYiS6qJgVc\nBtxgNjDJmKKswd2PMga91j4MqCBbu6" +
       "gTYjshaGcpTzEYBoFgMpVwDsKu80eCvf1c99WAKm1SgeBE\nDsV3l8vV2+FZ" +
       "YS20IsvV57ImXykEOHOKGlV/+/bzVx86utmPWa1gGmMUhHNwHEohWj5y6qnV" +
       "Zcff\n+SrPSZhZcdHRHDGB7c/ygMDX3RAMlUI9o3siwVhwaEdoKOjNYxFDSY" +
       "APTFvA7oWxDzbGL93ZL2Ki\nxnlgcBIOtF+njcvfe19kMHdY5Mh/HibH1jx/" +
       "6fTFkWpRfgXEXp+Fcp1zBMzm0VSup2EPa2/EgVO/\ncufaU4dH3p4QO6lyAx" +
       "y0etezF2jT3eVyDhCVBwcByCl8X13zGbzb+iWZX7fBsbEbev3YmPxE1lrh\n" +
       "sNau4aHQ6PBIaGgHju69kdfVWkLUzi8EZ6Yu2mWikVB/cGReAZZaQqyxBFjj" +
       "FYDo2DCy+ULqL9EN\njUGWpXFgmg8hKyDNNpEz03bO7OD92x3ZaPNNZKOuju" +
       "a2rpY2yEYlowOhKOYIbu+DFnNsRzJBv9SG\nIP3WWEU6exd+FHICQKIkc4Db" +
       "lEEZNhCps4CpY2tH7K216RmOrQumSL6R3QokbETgGAOr5zvYcf8/\n+rl/lR" +
       "+RXrnfb0GgCdg50/QWFZZTbTTkXWQXP8dmCn/FffV/3d598oteOFSMJxRnGn" +
       "FPi8nnfnT2\nL10X/vwIBNcYKRoajvb1hoMQh/U3ZBeTK6dr78nbp/yaVyoL" +
       "mWSdvt2Tetx4pNSgLGUkR12VuMEF\nkTFQmi2fbc4FkfF1+w1B5YKI8zgjRV" +
       "C1MCs6jf8t2/hdHiwQ1mRJDfU/d65s9liqe2fGbgP4OnEz\n9bezua2tpX0T" +
       "1DBLEKilQjm45Ajhch1zaaYenk5LM523SDPPQdUGgUYkxaTxfk/cf8/WTzfv" +
       "fxpf\n37+ZgG/H7Xe0MbLSxc2lhC95lVANzwZ47rKUcFcuJeTIBNh+2JkDbl" +
       "Y7P2SkFOTt0xIJ2IdTNWds\n1WyyVfMiI9sWVA0kDToehdcIVUEF8YyOOtqb" +
       "Oze2dLV/Bg56bJ9iBmzO87oIJvltlna23SIXeQmC\nRzGDhqGJ2jGuizkS9E" +
       "9omkrhSGOV57ZcMq6HZ9CScfAWyfgaI+WKuV1RGTUwI2PfL3MJs4qIcxDJ\n" +
       "/N4CYc6LbJNJentzyYGZbtySY3xxcviyq9gF2xs329745k0E6pb25vaOls4O" +
       "2MI0ljfL5tWf5C7L\nLoqasbCW/oROI8tUZ16vyp/W8MZbuNTGXNqrgyduaS" +
       "9+i6x4CXTKNHHMcOr6sq3rLbaur/yfkQ9w\nqKMNIn8pv0QOZBiLwAf8Ve60" +
       "E17M1GRd/osrannd7N47XtYrf8Pvu+aukYvhgDmZUlXnXYGjXagb\ndFLh+y" +
       "sWNwdis/9mpGEhu8Phn/9yZXwg5l1lZNX88wDTw9tJ/yEUhtz04IhWy0n/MW" +
       "jKTQ+Z2v5w\nkPoIcANSbPrmEJ7jWCeuFxDCVTvqf1SnsoIIIP2dl/LveeKP" +
       "/+UYqEgW/zvB/xfAcZ9HSGtvUlIP\nmvymB8fwslVOGQZohGNAS8NlplhR/H" +
       "+g1nlbMMerEXG+OFgN2Ah7E8DkLYuN47aNbRmInY8Qe9GX\n0XB6/1QufXAZ" +
       "rdDjZ3SUdtji8j9k4/Hz2xoAAA==");
}
