package net.javacoding.jspider.api.event.site;

import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;

public class UserAgentObeyedEvent
extends net.javacoding.jspider.api.event.site.SiteRelatedEvent
{

    protected java.lang.String userAgent;
    
    public UserAgentObeyedEvent(net.javacoding.jspider.api.model.Site site,
                                java.lang.String userAgent) {
        super(site);
        this.userAgent = userAgent;
    }
    
    public java.lang.String getComment() {
        return "obeyed rules for useragent \'" + userAgent +
        "\' as found in robots.txt on site " + site.getURL();
    }
    
    public net.javacoding.jspider.api.model.Site getSite() { return site; }
    
    public java.lang.String getUserAgent() { return userAgent; }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYa2zb1hW+kmzJsp34ESfNbCd2PXetB5uKX4oTDUgF20GU" +
       "KLFqOe3iqVBp8kph\nQpEseWnLWZd1WNa03VCgr61FsxRtUQQoim1Yse7Him" +
       "ZBH3sG2Pyj7TZ02ND+2LCl2H4MDbYO3bmX\npEhRcjLArQBSV5fndc/5zoN6" +
       "8QpqNHTUKxgcWdWwwU1nM7xuYHFa5g1jAbbywhuN0cyFQ4oaRIE0\nCkoiQW" +
       "1pwYiJPOFjkhhLzSTKOurXVHm1KKvEllMjZe9nP1r59dmDPSHUtojaJCVLeC" +
       "IJ06pCcJks\notYSLi1h3UiKIhYXUYeCsZjFusTL0ikgVJVF1GlIRYUnpo6N" +
       "eWyo8jIl7DRMDetMp7OZRq2CqhhE\nNwWi6gZB7ekT/DIfM4kkx9KSQRJpFC" +
       "5IWBaNu9FpFEqjxoLMF4FwW9o5RYxJjO2n+0DeLIGZeoEX\nsMPScFJSwBN9" +
       "fo7KiQcPAQGwRkqYHFcrqhoUHjZQp2WSzCvFWJboklIE0kbVBC0Eda8rFIia" +
       "NF44\nyRdxnqDtfrqM9QiooswtlIWgrX4yJgli1u2LmSdac+HW/z6Y+bCfxb" +
       "xBxIJM7Y8A004f0zwuYB0r\nArYYr5rcY6ljZm8QISDe6iO2aJI3/fho+i8X" +
       "+yyanjo0c0snsEDywkfx3h1ryfejIWpGk6YaEoVC\n1clZVDP2k0RZAzRvq0" +
       "ikDznn4U/n3zx27wv4b0HUlEJhQZXNkpJCUayI0/Y6Auu0pGBrd65QMDBJ\n" +
       "oQaZbYVV9hvcUZBkTN0RhrXGk+NsXdYQQhG4AnDtQNYnSm+Aq6MG1pNFrJC5" +
       "JbyKxdllWHIaQV9Q\nMMlRJAiqCBjInTA0ScR6jtekHKZEOTAd5+qzl6netp" +
       "VAgCawP/1kwOoBVQZheeHCe7+8Z/bQA/db\nwaQAtC0maC8YwLkGcLYBHBjA" +
       "MQM4agBXzwAUCDDVN1R7m4ZPpFn29x8m2h8aMV4OotAiikqlkkn4\nJRlDdv" +
       "KyrK5gMU8YPDs8qcAQCPBtXQIkgz15GQSxzAH3LutowI9YN89TsOIBhmunP/" +
       "7NB/mVlyi4\nKBi6qHTLNAjtScu21qHsnQfvun8gRIlWGmjUgHTw+tLzwgcP" +
       "Hn7prV+9e4ubGQQN1iRsLSdNOL/5\nGV0VsAgFzRX/nX8f+MejjXt+FEQNkM" +
       "VQxwgP6IOisNOvoyrxEk4Ro84CzpaCqpd4mT5yKk8zOa6r\nK+4Og88mtm4H" +
       "B7TA1QhXuw3dTfRGH3bS2xYLbNSfvjOwEnn16+Fdb7/S8gZzilNN2zxlN4uJ" +
       "lZsd\nbjgWdIxh/90nMo8+fuXsl1gs7GAQFNbMJVkSysy+GwIQ+y116gS3ve" +
       "uxbw+de9sJ9hZXelLX+VUa\n6/LX1nY8+TP+u1BDIJcN6RRmqRpkmoLAtB07" +
       "ImenD1uVx6pT95x7776hP/3usl3LPD3Spfpr/oz5\n8jcurgWpi6PQrXjjiJ" +
       "NgrFvSVYB1EAgjgzzdiTJ/Nls5PEpQE+OMT02CPZ2giDZXThK5tCrwcmrm\n" +
       "mUstaw+b8YOWJZs8BKmZfLnv8vNDH/czC2yFYU+1tH9Hlnn9iJv69GuMoNmN" +
       "FKC9o+PD4xMjE+OE\n+pVYuOoi6KZrFJWSKmKZyzrUMcsDe10PxNn+OL0lPg" +
       "H7JiZH4uDfqOlQOEa2M6jQqsNZDdiBGr0P\ns/UITQEGE8SsHLBJaCXyF9z9" +
       "dJ5w0ri09OV/vXa+ud+CJeXprRSZHi/aqrjywt2nzo2vZe+QrDD7\nO62P+N" +
       "SrR89fvUz+yHLOrRRU243lWgNv5z1FbOqt5Y7wD54uBVFkEbWzaYlXyO28bN" +
       "KMXAS0GtP2\nZhrg5n1ePbtYiZCoVMJef5XyqPXXKLcTwbo6MdyytBmuPrs8" +
       "IefbU5YCiEE5zRgG2f3mShGJarpK\nwD4slmsgYCNv3kXehC/3LH/P3Lrn0v" +
       "tXvi99yPKrmc2NScpgWx5lO56cD6maQScUz4hsSxqc04wE\n0zpB7FoxuXt0" +
       "10ZRPrZ7eHRyZAxkbl44kMpylXNSTVnvwU/DbFR7QGqW7V3UyZC32c2NWcUs" +
       "eR/C\nzNAwP5ucobL3sZ7ADvQ5OzPc5Om1EwecumO9OZPNyGe/+M/W+/jX77" +
       "RA31k9TVD1k0+/g4dubRXq\njC9RomojMrhIdjPTr+0wm78dELbd0ffn/fEL" +
       "X/GnZogOUd7UrGbLC5e+d/EPk+/8/gxYsYgiR+ay\n08n0LBjcd011eaFjue" +
       "e20HHp5ww+dpbUvDVUMyWqc6NZx/DSoyxUZUh/VePeaUXHiVJt4/bEaJ0C\n" +
       "d93qB3Y3FzGZVkslXw4Zbg7tdqs3IWjfOriGJpDTZLMoKTkYH8icSTSTZNgG" +
       "q9q7hkenRsbjn4cq\nbQ2hrl6GO8S0SFUu6IFrm+2CbZ+SC6CKRMAUf/f6qn" +
       "v+Kff89244r8eGR0dHxnaDF2ylNxv9Fhao\n/Kl6XhiAq9v2Qven5IUzBLWC" +
       "QUfrldNvuq7Y47riWxt2RZy6YhxK3Fav5ip/7KPh6aongE6G22v+\nn7Deoo" +
       "WBtbtueU3r+AUbuCtvuk0wQBVMWfa2KM86rOm4ILETN1kNyzr+I9ceftw3Ku" +
       "/E9LDF+zhB\n/dfjJaiRfXv5niCoe30+gkJw99I/Be+j9ekB3fbKS38e+ko1" +
       "PRQC94eX9BnQBqR0+azmhcVzLizG\nNWcCi/9/754U+PMYyoQdTdpRujxdLK" +
       "thQaJDcvnZnzTc9tBv/8MqbUSw/lmi/6ZAJ16WQFYsqfDy\nqsFmG/qMvmgK" +
       "pg4vUYS1JDu4LYYl0fr3pMfbyCu6BheOZWZrevmuPZ9MLx+dBHzQXr6xN3Ro" +
       "95+p\n5yhmvLep02PkbJX/A+9OvuoSFAAA");
}
