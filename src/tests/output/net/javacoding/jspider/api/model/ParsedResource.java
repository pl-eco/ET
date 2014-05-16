package net.javacoding.jspider.api.model;

public interface ParsedResource
  extends net.javacoding.jspider.api.model.FetchedResource
{
    
    public Resource[] getReferencedResources();
    
    public ResourceReference[] getIncomingReferences();
    
    public ResourceReference[] getOutgoingReferences();
    
    public EMailAddress[] getEmailAddresses();
    
    public EMailAddressReference[] getEmailAddressReferences();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1YXWwUVRS+3W23fwttt6VUKLSpEGhCd7ulXQr1gaa0YelC" +
       "K61RaskyO3O3HZid\nGWfutlsEohEBjTEa8C+gxESCUUMiRnzQBAniXyQxfQ" +
       "E1Jhp80ChGHgzEYPDcO7M7s9PtFjChycze\nuXPu+fu+c+6dvncVFekaqud1" +
       "P5lSse7vGRrkNB0LPRKn68MwFeUvFJUOnuyXFRcqiCCXKBBUEeH1\ngMARLi" +
       "AKgfCGrpSGGlVFmhqTFGLqmaFl3f03J785uGmxG1WMoApRHiIcEfkeRSY4RU" +
       "aQN4ETMazp\n3YKAhRFUJWMsDGFN5CRxNwgq8gjy6eKYzJGkhvWtWFekCSro" +
       "05Mq1pjN9GQEeXlF1omW5Imi6QRV\nRnZyE1wgSUQpEBF10hVBnriIJUF/DO" +
       "1D7ggqikvcGAjWRtJRBJjGQB+dB/EyEdzU4hyP00sKd4ky\nZKLBuSIT8bJ+" +
       "EIClxQlMxpWMqUKZgwnkM1ySOHksMEQ0UR4D0SIlCVYIWjSrUhAqUTl+FzeG" +
       "owTV\nOeUGjVcgVcrSQpcQtMApxjQBZoscmNnQGvB4/3128Hojw7xQwLxE/S" +
       "+GRUsdi7biONawzGNj4Y2k\n/0h4W7LehRAIL3AIGzLdyz96KPLr2QZDZnEO" +
       "mYHYTsyTKH8zVL9kuvuXUjd1o0RVdJFSIStyhuqg\n+aYrpQKbazMa6Ut/+u" +
       "WnWz/f9sQ7+HcXKgkjD69IyYQcRqVYFnrMcTGMI6KMjdmBeFzHJIwKJTbl\n" +
       "UdgzpCMuSpimwwNjlSPjbJxSEULFcBXAVYuMvzJ6AwIa1UAJmtR47FcJCsqY" +
       "jFIO8IoA6I/u1FVR\nwNoop4qjCUXA0qhzTYqaqZgsKKD16qw2Cai5UZFAQ5" +
       "Q/eeXrPb39zxwysKN8Mx0kKABW/ZZVv2nV\nD1b9zKo/2yoqKGD2FmZnlEIk" +
       "0Er643RX5fMt+hkXco+gUjGRSBIuJmGoQE6SlEksRAmjYJWN7oxl\nQFFvDN" +
       "gKTkQlUMSqA1I4oaEmJyutWg7DiAOqTe+79e2f0ckPKIEo4DVUu+EawLfL8M" +
       "3bPLR9045D\nTW4qNFlIkUixKlxIrTgz2Ef7QVp/Ivb43+ffKGs09NM19WkF" +
       "YMy5kvaIG095Wi99Un6B5TzdTips\nfWcIE4OcVZavwxrGMP/jq4OHX7p68F" +
       "HmqOGpm6ASLgZhczwhkNh09yHIoyZjksjbIqnOUT/+upoj\nLzcfu+QMgGJZ" +
       "h9OSvT2bjUIzynLPsSsHmn/67qJZurYtwZL6Lbo/eebps9Mu2stKoTlz+pY0" +
       "wdjm\nQEcFrGHKwEWqgM6UMvKWGRxuJebKzmBn0PCuhqDWOanZhwk/bnGTYr" +
       "Fktg7Guu/BR655D3CfbTcC\n8mVzuFdOJjqOX8bN6718jkopJYraIuEJLFmZ" +
       "dlrbzDp7mjQVDzf83Bc6udeZc7a/2nOevSzKnzt1\n9oeOy9/vBy9GUPGWga" +
       "Ge7kgvONyQ11yUr5pY/KB7XPySYcF6dI79KHtRlz1MQEnDsJ3KwxmUZlbf\n" +
       "oKbwWIA917L7yj8b/zpctPZDFyoEDsBWSzhokLBvLXUaz9obutKFQU3ByvK4" +
       "oiU4ib5Kb45lZFxT\nJq0ZRpd5bFwJmSyHyw+X1+yu7Je+9NFbtdEgmXQTuy" +
       "83islFxyvordksmwJ6XwW4VFvF2K1p3BTt\nG6knp5e89gX3Ouw50Pt1cTdm" +
       "rR1ltRBTA7332V7S5244R4xhkok9Q1idNg9bVTGLNNj9k/1XV9Zf\nP+pCrj" +
       "xFlWPDzmiI8qfdy665Pq5dxkApjHG6gajzpDPzIJN1PmEBlGclvDpPwpmguT" +
       "MN2Kq6LVPV\nzXNWdTo7qgpVV8Y0BFe3BtdAsnyQLHrK9IuCP6LwnBTe8Oa5" +
       "8ukXk6FNRknPswmEN0RTDRdPNN9q\nZPVgZs1jOzaYz8UTnLbFKnX6M0TQuj" +
       "vej9cF21YFgy3tIai63Hiv0BuNAkMsHQ9k5TUE13wzr/P/\nJ5GdNJyTo9vg" +
       "VAg+h2VeSUC0Gd91Jt2f5Wh9HkftBBBsBFidIUDbbRMg44SDCZ1M1TC9jd8d" +
       "Tu0U\np452aFA5Y54Tpkoz+sp7DZNkwDSQJGPK7cA0m6N2mCZtMLUz9scdCV" +
       "9rJXzq7hIesid8pvd5Ex6A\ny2fG4bvXCd8LR1VwuTfBiRJ8icKXpp4z2Qvz" +
       "OGlP9iFbsjsyNdEyZ030brYcyEanrdVC57m7Q6eT\nta018J05I9S8yKyHq8" +
       "YMuuZeI/MCQfc53M1bDo15nLUjdNSGUCiDUOiOEJqlc7UFLaiO3xVUba0U\n" +
       "qhAUUtOssVuQpQian62Cfm/UzfjHjPHvA75pesfK82rVV8aJIf2JXwIbZjwp" +
       "SbZTov3E6FE1HBdZ\n5kqM05mRxhMENc6VM4KK2C/LylvGureBhbOvI8gNd7" +
       "v8u3C4yi1PULE5ssufgpxkywNA1oNd9H2w\nBqJ0eDpDhEp2QKTfrX7jIyil" +
       "/gf8JGNGMxMAAA==");
}
