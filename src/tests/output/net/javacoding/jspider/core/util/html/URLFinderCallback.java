package net.javacoding.jspider.core.util.html;

import java.net.URL;

import et.util.MyUtility;

public interface URLFinderCallback {
    
    public java.net.URL getContextURL();
    
    public void setContextURL(java.net.URL url);
    
    public void malformedContextURLFound(java.lang.String malformedURL);
    
    public void urlFound(java.net.URL foundURL);
    
    public void malformedUrlFound(java.lang.String malformedURL);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVXa2wUVRS+u223r4U+gYYCLa9opd0tfUHpH2ppZWFp1xZE" +
       "askyO3O3HZidGWfu\ntgsC0QiCj5gQQDEihgRCYog/JOAfEySAr0hi+gfUaD" +
       "QYglEMxhiJweC59852Z6dLizZsMnfu3HvO\nPeee853Hnr6FckwDzRFNH9mu" +
       "Y9PX0RcSDBNLHYpgmuthKSxezskPnVqram7kCiK3LBFUFBRNvyQQ\nwS9L/s" +
       "CqtoSBqnVN2T6oaMQ6Z9wpKxbeHfly35rKLFTUj4pktY8IRBY7NJXgBOlH3h" +
       "iORbBhtksS\nlvpRiYqx1IcNWVDkHUCoqf2o1JQHVYHEDWz2YlNThilhqRnX" +
       "scFkJheDyCtqqkmMuEg0wySoOLhV\nGBb8cSIr/qBskrYg8kRlrEjms2g3yg" +
       "qinKgiDALhzGDyFn52or+LrgN5gQxqGlFBxEmW7G2yCpao\ncnKM3XjRWiAA" +
       "1twYJkPamKhsVYAFVMpVUgR10N9HDFkdBNIcLQ5SCJp930OBKE8XxG3CIA4T" +
       "VOGk\nC/EtoMpnZqEsBM1wkrGTwGezHT6zeavH4/3nldBf1czn2RIWFap/Lj" +
       "DNczD14ig2sCpizngn7jsU\n2BSf40YIiGc4iDlN++IPNwRvnq/iNJUZaHoi" +
       "W7FIwuLdljlzR9t/ys+iauTpmilTKKTdnHk1ZO20\nJXRA88yxE+mmL7n5ce" +
       "8nm55/D//iRnkB5BE1JR5TAygfq1KHNc+FeVBWMV/tiUZNTAIoW2FLHo19\n" +
       "gzmisoKpOTww1wUyxOYJHSGUC48LnnLEf3l0IKhsQ2+wC+CAjQ5BUSLgJZ9O" +
       "UKuKyQCFgahJAICB\nraYuA8mAqBl4gGo+MERiykAG3gSVWDTictHQdQaeAi" +
       "hdrSnAEBZPXf9iZ+fal/dzN1LoWboStAyk\n+1LSfZZ0H5XO7Ual+8ZJRy4X" +
       "kzsr3cjUaxINrl8/aCt+vc4850ZZ/ShfjsXiRIgoGIISDtBGsBQm\nDJUltg" +
       "hgwAPUeqkAUCaswEEsYMCqwwZa4ARqKrwDMBMAfaO77331W3jkDMUUxUA5PZ" +
       "2rBh7dxnXz\n1vRtXrNl/4IsSjSSTZ2TYIE5i0pxWrKLpojk+bHIc39ePFZQ" +
       "zc+nPHOSB4AwJydNG3de9NRf/ajw\nMrN9MsMU2VJRHyYcryUpXdcbGMP6d0" +
       "dCBw/f2vcMU5RrmkVQnhCBawsiIWDYZEIiyKPHI4os2m5S\nliGkfBXlh96o" +
       "OXo14wXm3i8TsCy27+nfvS8JlzbzeC1Nd3ynGo81v3sN16z0ihlglk80vU7B" +
       "w1hJ\nqeeUto5lyKSlizZW/djVcmqXU1FWp3CSp7NjXTpbWLzw/vlvm699sw" +
       "e06Ee53T19He3BTlC4akJx\nYbFkuPLJrCH5MzfLzzTXZcjr6Uxt9mtCeTAw" +
       "lCWVGoyu5CfGQzZkaCKWoHal5L759+rbB3Naz7pR\nNiRsKFlEgEQD+X+eU3" +
       "hajm1LoomKAs7CqGbEBIVuJYtMARkytJHUCssX09i8GCxZCE81PAVWlmJv\n" +
       "ullKhzKeXRj1AjYu5gh00/kjdKixsOaiYy34pSyF4HbDELbTYEu8MDr3rU+F" +
       "dyB3Qw415R2YpUiU\nFnfWCXRcaduk320ETRvExOoQIA+BnAq7/3mR4CVl59" +
       "HrL9X88PUVq+zY2pkU1c/hPfFze8+PMj/n\nQ2MhmN0pH0JjQ2cuVuzBDSxN" +
       "cW/SsYAn3SeIxbl8aUs9KFQKkmgj5JMlX1ATBSWw6viFwtED8ZY1\nXJVpNo" +
       "LAqnCi6srJmnvVTAVLosdW2azv3GHB6E5FEX2tJqjtP9YLn76iuaG2sb6uue" +
       "kx6G3EZPlI\nNyo9vJwgL/MgrQmwiNhqSxpgauDxWoDxThEwSXe7GJmLfXdy" +
       "Az9lM/BSthGgw0aCHv/f5XLFUjBD\nQ11jK0FZcYN1Mt2T4y8E+DMd+Ku04y" +
       "9kyDHw2rDV+Zzt/6NeurFkFfd7hb2jthOubriHF5XdvM1y\npQOFGdorh5AD" +
       "807cOHO9t5xnWt6DLhzXBtp5eB/KbuTVaa6fP5EERn1pyfzTu3u/j7gtS/gJ" +
       "yh7W\naOPvYfrWZ8IHNd90Cx/THx4+YjZ8NKTwoU4NH021TY11LQ0QBpBJaT" +
       "7Fki02ills0E7Fx3v1ycEz\nCD3q2FEpCHVpcZUFfeR+IVZsmbD44Zlwl82E" +
       "jSkT7p6aCVtqG5axEMuL0ksCzQPG2QiwQFRObJpW\neEot05Q+PNO8ajNNU8" +
       "o0r03NNMtrG1vqmpsd6KIHG5ObZy+0yim2NDslYGucQNpQVoz7M87/MooL\n" +
       "Rrc8elEv+Zy1HGN/6/KgAkXjimLraOzdjUc3cFRmyuTxToIb6zBBix/oTwSk" +
       "D/pi1zvEeY8QVD0Z\nL7DRl53tbYIqJ2ADDvqycxyDypeZg6Bca2anP07Q9H" +
       "R6ggpSH3bSE1BOgJROT+oZcgXvPBL6v6X+\ncNlkEQAA");
}
