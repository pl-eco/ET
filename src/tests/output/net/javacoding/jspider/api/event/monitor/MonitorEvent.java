package net.javacoding.jspider.api.event.monitor;

import net.javacoding.jspider.api.event.JSpiderEvent;

import et.util.MyUtility;

abstract public class MonitorEvent
extends net.javacoding.jspider.api.event.JSpiderEvent
{

    
    public int getType() { return JSpiderEvent.EVENT_TYPE_MONITORING; }
    
    public MonitorEvent() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAI1XbWxTVRg+bdeuLZWxD2CBwcaYyoJr0WQY7B+XMcJGx+qK" +
       "InWknN572t1xe+/1\n3tOtIBKNCMgPEwP4kaD+MSExxB8S8I8JGsBvE7Mfgh" +
       "qMBkMwCsEYIzEYfM85t+vt7WA2uXfnnvN+\nnfd93o+duIb8lonaJCtKdxnE" +
       "ivankti0iNyvYsvaAlsZ6bw/lDy+SdO9yJNAXkWmqCEhWTEZUxxT\n5Njg+n" +
       "jJRB2Gru7Kqzq15dRIeWTlramvDgwt9aGGNGpQtBTFVJH6dY2SEk2jSIEUss" +
       "S0+mSZyGnU\nqBEip4ipYFXZDYS6lkZNlpLXMC2axBollq5OMsImq2gQk+ss" +
       "byZQRNI1i5pFieqmRdGCxASexLEi\nVdRYQrFoPIECOYWosvU02ot8CeTPqT" +
       "gPhIsS5VvEuMTYBrYP5GEFzDRzWCJllrqdigaeaHdzzNy4\naxMQAGt9gdBx" +
       "fUZVnYZhAzUJk1Ss5WMpaipaHkj9ehG0ULTkjkKBKGhgaSfOkwxFrW66pDgC" +
       "qhB3\nC2OhaKGbjEuCmC1xxcwRrZFA5N9Dyb87eMzrZCKpzP56YFruYholOW" +
       "ISTSKC8WYxemRwW7HNixAQ\nL3QRC5q+ez94PHH1TLugWToLzUh2gkg0I91a" +
       "27Zsuu+XkI+ZETR0S2FQqLo5j2rSPomXDEDzohmJ\n7DBaPvxo9JNtz71Lfv" +
       "Oi4CAKSLpaLGiDKEQ0ud9e18M6oWhE7I7kchahg6hO5VsBnX+DO3KKSpg7\n" +
       "ArA2MB3n65KBEFoAjweeJiR+QfaiaP6wrimAxYFJotGoQdHDGqFjDAGSLkPs" +
       "xyYsQ5GJOYYNZYww\norGC4Bir5iwxVQ1THg/LWXfGqQDPjboKcjLS8ctf7B" +
       "nY9NJBET+GOdtIinpBd7SiO2rrjoLuKNcd\ntXVHnbqRx8O1Lq72LQuWzHLq" +
       "9/fjC17usU57kS+NQkqhUKQ4qxLIRayq+hSRM5SDsdEBfI43AGsk\nC7gFUz" +
       "IqCOJ5As6cNFGnG5+VrB6EFQbQTe+9/c31zNRJBiUW+hYmXZgGgdwpbIt0p7" +
       "YP7TjY6WNE\nU3UsRkDaNbf0jHT90PDJb7+8tKqSBxR11aRnLSdLL7f5SVOX" +
       "iAzlqyL+tX823jjsX3fKi+ogZ6Fq\nUQxYgxKw3K2jKs3i5ZLFnAWc83K6Wc" +
       "AqOyrXmTAdN/Wpyg5Hzj18zUA6Dx6/DVj2m89e7LCJvZoF\nzpg/XXfgBfHm" +
       "C4E1Fz6cd547pVw7GxxFNkWoyMTGSji2mITA/qXXk4ePXjvwFI+FHQyKAkYx" +
       "qypS\nidu32AOxb56lKkRbW4682n3sQjnYzRXpfaaJd7FYl56fXvbGp/hNqB" +
       "iQuZaym/DERFwTKitg7wf4\nusdxyL47bRKGP3eGbWA9oxy8QvaZv86+Fe4Q" +
       "xjCeNqeOLv6+X9zQS1EQZwEjWOL47i4rqdgxw2yi\nZXcqy7ylHHjyj8h+fG" +
       "67KJ5N1ek4oBULvW9fJN2PRqRZUj9EdaNHhSRXK5d0axvm7ap8y4at7T9v\n" +
       "WHv8WfcteQEiZZ6B/uFqtoz08Xtnfui9+P0+sCKN6jePpPr7EgNgcPtd1WWk" +
       "xsmlj/nGlc+8vFmK\nhKtpstVMcec1AfkmgRlBYw5jOyEe1o4q5LfCE7aRH5" +
       "4N+ex1312xMieQBiiqzxPKMxCanNNXSVMp\nQEeatFvmqfSfa+Qrq9eLiLY6" +
       "RzEn4caHbpOu5qs3eFxDMBdha/NMcGv7skvJK8vfuXLy8miLQIUY\nXlbWzA" +
       "9OHjHA8LtEDIbLFXfTwKnPrV5xYu/oj1mv7YM4RT6YnCC/ubm9qERRxNlVWB" +
       "a31kyOYr6R\nOqd3rDprNH7Oi+PMDBKEQSBXVFVHxJ3RDxgmySlce1DUPNE0" +
       "t1K06v82PoicveKRfUJISFPUMZcE\nivz8r5NvOwx0d+YDD8HbSb8D5tDZ6c" +
       "Eue+Wkl2C+qKanKFz5cJLmQBuQsmWeu96JSjFzCbTsOXZ5\nf/dP331tT3EO" +
       "SFaofs3sK55+8cw0z1QXHvn/CWzl4bMztDTe/iv5GBYGTVCb88F1vb2ivrRQ" +
       "1DNn\noIZSfIdjqGT8BzpKjiLFDAAA");
}
