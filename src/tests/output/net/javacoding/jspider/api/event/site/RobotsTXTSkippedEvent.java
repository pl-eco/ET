package net.javacoding.jspider.api.event.site;

import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;

public class RobotsTXTSkippedEvent
extends net.javacoding.jspider.api.event.site.SiteRelatedEvent
{

    
    public RobotsTXTSkippedEvent(net.javacoding.jspider.api.model.Site site) {
        super(site);
    }
    
    public net.javacoding.jspider.api.model.Site getSite() { return site; }
    
    public java.lang.String getComment() {
        return "RobotsTXTSkippedEvent for site " + site;
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVXXWwUVRS+22233Xbpz7ZApYU2tShN2t0W2tqyMbEpbdiy" +
       "pUu3RFpLlunM3Xbo\n7Mw4c7fdIhKNCMgDiQH/EtRoYkiM8UEiPmiCBPGfRP" +
       "sgqCHR4INGIfpgJIrBc+/M7MxuWzCpNpnp\n3XvPOffcc77znTtvXEMFuoZq" +
       "eT1A5lSsB3pjUU7TsdArcbo+AlNx/kKBN3pqm6zkIVcE5YkCQWUR\nXg8KHO" +
       "GCohAMbwmlNVSvKtLcpKQQ084CK5vvvjn7+eGBGjcqG0NlohwjHBH5XkUmOE" +
       "3GkC+JkxNY\n03sEAQtjqELGWIhhTeQkcR8IKvIY8uvipMyRlIb1Yawr0gwV" +
       "9OspFWtsT2sygny8IutES/FE0XSC\nyiN7uRkumCKiFIyIOglFkCchYknQH0" +
       "YHkDuCChISNwmCqyLWKYLMYrCfzoN4sQhuagmOx5ZK/rQo\nQyTqcjUyJ27c" +
       "BgKgWpjEZErJbJUvczCB/IZLEidPBmNEE+VJEC1QUrALQWuWNApCRSrHT3OT" +
       "OE5Q\nda5c1FgCKS8LC1UhaGWuGLMEOVuTkzNHtoY8vr+PRv+oZznPFzAvUf" +
       "8LQWldjtIwTmANyzw2FG+k\nAifCo6naPIRAeGWOsCHTs/6dnZEfz9YZMjWL" +
       "yAxN7MU8ifM3O2vXzvf84HVTN4pURRcpFLJOzrIa\nNVdCaRXQvCpjkS4GrM" +
       "X3hz8cfex1/HMeKgojD69IqaQcRl4sC73muBDGEVHGxuxQIqFjEkb5Epvy\n" +
       "KOw3hCMhSpiGwwNjlSNTbJxWEUKF8LjgWYmMvyL6Imj1sDKhEH1k10hsWlRV" +
       "LPTNYJkEVILulzEZ\np1DgFQFAML5XV0UBa+OcKo5jKjQOvuPxJfTTdOeyWZ" +
       "eLlnBuAUqA1q2KBNbi/Kmrn+7v2/bUESOd\nFIKmzwSFwIOA7UHA9CAAHgSY" +
       "BwHqQWBRD5DLxfZenR1wmkGBFtovb4XKj7XoZ/KQewx5xWQyRbgJ\nCUOBcp" +
       "KkzGIhThhCKxzVwEAICPZNAJjBobgEhljxQIRnNNSQC1q71MMw4gCJ8wdufX" +
       "E9Pnua4ovi\noYpaN1yD7E4bvvmaYrsH9hxpcFOh2XyaOBBtvLP1OH/96ODp" +
       "rz67ssEuDoIaF9TsQk1ac7nuRzWF\nxwJwmm3+uT+3/nq8oPvtPJQPhQxURj" +
       "gAIPDCutw9smovZPEYDRZoliQULclJdMkin2IypSmz9gzD\nzwo2LocAlMBT" +
       "AI/PRG8xfdFFP31VGmij8cw5A2PJG094Wi+9V3KBBcUi1DIH88YwMcqzwk7H" +
       "iIYx\nzF95Pnr8mWuHH2K5MJNBkEdNTUgin2b+rXZB7isXoYpAddWJZ5tOXr" +
       "KSXWlb79E0bo7mOv34/NoX\nPuJeBBqBctbFfZhVqyuT9mpsmezrHTTIx6Cq" +
       "/SevHmr67uuLJp052qQt9VP8YOrMk2fn82iIvdCw\nOH27VWGsYdKRizURSC" +
       "ODPJ3xsngWG0XcRkzNrtbuLnDIDzvRBhsQhUBE4TkpvOWVcyXzT6c6BwxX\n" +
       "VjgEwlvi6bqLrzXdqmcumDt6HIxp/i6c4bTtdvHTfxsJ6l8WB21ua23e1NHS" +
       "3k5oZImBrCqC1t+G\nV5KKgKVADKSt5NJ3Mxu3UNCxxCAWmQZThNZ+Lsf10y" +
       "ZuFU5y4pHfz79UXG8AgerUOszcY1qxN7JW\nIdprl2qErIkf3vWb7xD3wW4j" +
       "8P5sruuTU8mOly/jpgd8/CLs6iWK2iJBFCX7FLm7DbILgnWMsgfr\nvu/vPP" +
       "Vo7jHyKMc7YZqtFufPvXn2247L3xwEL8ZQ4fahWG9PpA8crrvtdnG+YqZmh3" +
       "tK/Jhhx2Sz\nBdeabKWQ85gAbA3DrUweyQJ2fRatrIGn1KSV0sVoxZGjJcBw" +
       "R6QMElQ4iUnMAmHQKK0RR2l1s4VN\n9LVz+cBvb25ra9nYCRdMc9t79XojFH" +
       "SDLsQ2G8iKwzp4/GYc/P9THEYJKgaHepVkEhx1hmJPJhRt\nra12KLjlh6KL" +
       "hmJTK0GV9s6ZaFiUUM6omXb5gHHnRWm4nS5qkzJ59YJPCuPiyzfM79lwXq34" +
       "hDXI\nzOW0CPgukZIkBzCdIPWoGk6ILAxFRt8zYiLenqrsK5CT36YMXaiU+j" +
       "vpElTA/jv1FLjjL61HkBve\nTnno/asWlwfImyOnfIqg0mx5gIT9wykKGXCD" +
       "KB3OqU6s7HOUzX2qlcLOf3dbpMUwjCWOmOmkJFvl\n6FgxFfMibWrpV9/N33" +
       "Hsy78Y+RTyxtcg/QKCD8wZEWwFe2ROmtNF3fxSpDdDPqXBrYcwljazW6Ib\n" +
       "Fo0vnhrn92lmr8aR0WhfiB0OmlUxO1xba3vrf9ACu5s72lo6oInnj2wNx5Z5" +
       "qz6gobsWixXzH9nk\nAdxealcUbUTORdV05h9oPR7k4g8AAA==");
}
