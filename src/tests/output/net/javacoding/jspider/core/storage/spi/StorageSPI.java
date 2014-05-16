package net.javacoding.jspider.core.storage.spi;

import net.javacoding.jspider.api.model.Summary;

import et.util.MyUtility;

public interface StorageSPI {
    
    public net.javacoding.jspider.core.storage.spi.SiteDAOSPI getSiteDAO();
    
    public net.javacoding.jspider.core.storage.spi.ResourceDAOSPI
      getResourceDAO();
    
    public net.javacoding.jspider.core.storage.spi.ContentDAOSPI getContentDAO(
      );
    
    public net.javacoding.jspider.core.storage.spi.DecisionDAOSPI
      getDecisionDAO();
    
    public net.javacoding.jspider.core.storage.spi.CookieDAOSPI getCookieDAO();
    
    public net.javacoding.jspider.core.storage.spi.EMailAddressDAOSPI
      getEMailAddressDAO();
    
    public net.javacoding.jspider.core.storage.spi.FolderDAOSPI getFolderDAO();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1Ya2wUVRS+3bbbbrulDwpUXiU8AiV0S2m3UNYoTVtkYaEr" +
       "i1FqyTKdudtOOzsz\nztxtF0SCEeXxw2jABwZfPwyRGBMxoIlGRMRXJDH9A2" +
       "pMNPhDoxj9YSQGg+feO7szO/QFmm4yd+7c\nOeeec7/z3XPP7BtXUaFpoLmi" +
       "GSC7dGwG2mNRwTCx1K4IprkNhuLihUJf9MQmVfOgvAjyyBJB5RHR\nbJAEIj" +
       "TIUkO4I5Q20AJdU3b1KRqx5rlplrWLrg9/eWDjnHxU3o3KZTVGBCKL7ZpKcJ" +
       "p0I38SJ3ux\nYbZJEpa6UaWKsRTDhiwo8m4Q1NRuVGXKfapAUgY2t2JTU4ao" +
       "YJWZ0rHBbGYGI8gvaqpJjJRINMMk\nqCIyIAwJDSkiKw0R2SShCPImZKxI5k" +
       "NoL8qPoMKEIvSB4MxIZhUNbMaG9XQcxEtkcNNICCLOqBQM\nyiogUevWyK54" +
       "8SYQANWiJCb9WtZUgSrAAKriLimC2tcQI4as9oFooZYCKwTNHnNSECrWBXFQ" +
       "6MNx\ngmrcclH+CqR8DBaqQtAMtxibCWI22xUzR7S6vP5/Dkf/WsBiXiBhUa" +
       "H+F4HSfJfSVpzABlZFzBWv\npQJHw9tTcz0IgfAMlzCXaVvyzn2Rn87Wcpk5" +
       "o8h09Q5gkcTF6y1z5420/ejLp24U65opUyrkrJxF\nNWq9CaV1YPPM7Iz0ZS" +
       "Dz8sOtn2zfdxL/4kHFYeQVNSWVVMPIh1Wp3eoXQT8iq5iPdiUSJiZhVKCw\n" +
       "Ia/GngGOhKxgCocX+rpA+lk/rSOEiuDKg2s64j8fbQjyx4CIEJhYNBzQCWpW" +
       "Memh8Rc1CSLfM2Dq\nsoSNHlEzcI/JRXtgrMeplqZWyofz8uh2dW82BZi5QV" +
       "Ngkrh44soXezo3HTrIQ0fpZvlH0CowHLAN\nByzDAWo4YBkOwFjANozy8pjJ" +
       "WbmY0iBJdC/9eipU8WS9ecaD8ruRT04mU0ToVTDsQUFRtGEsxQkj\nYaWD8I" +
       "xnQFJ/L/AV/IgrMBHbHwDikIEWunlp7+Yw9AQg28jeG1/9Fh9+m1KIhryazs" +
       "5dgwAOct/8\ndbEdG3ceXJhPhYYLaCzSbB/OolbcIK6nGSEzf7L34T/Pv1Sy" +
       "gM9PdeZmJgBjbk2aJa495l156f3S\nCwz2TEIpd2SeGCacnpW2r9sMjGH8u+" +
       "ejR565euBB5ij3NJ+gYqEXli2IhACwmfxDkFdP9Sqy6FjJ\n9FF2UKCm+uiz" +
       "dccvjbqAeWNtfJa0Djzwh/8J4eMdfHtW5Qa+U00lgy9fxnXr/OIoDPMRTa9X" +
       "8BBW\nbPfc1jazhJhBuvz+2h/Wt5x4xO1oEeU5zuh0tm/OVYuL5948+23w8j" +
       "f7wYtuVLSlK9beFukEh2vH\nNRcXK4fm3JvfL3/mYemYprZR0niuUsi5TDgN" +
       "DAynkEoBoyO+9M2UjRqaiCU4qmy7z/294fcjha2n\nPagA8jOcUESAvALpfr" +
       "7beE5KDWXYRE2BZmlCM5KCQl9lzpQS0m9ow/YISxVlrF8BSJbCtdi6o8yd\n" +
       "vqyizXSeWJj0QtYu4Qz00P5S2tRZXMuj7QqIy3SbwW2GIeyimy396Mi8Y58K" +
       "L0KqhpRpyrsxy4go\nZ99ZM9B2neMlfQ4RVNKHSUwmuKOtC4zUOIPPDwR+fO" +
       "w5fuWJuu+/vmgdMY7SxZb6Ob4/debxsyMs\nyD4oIgRzix1AKGJoL48d7BAD" +
       "lqN4KGlbwpPtPcTSbGxuWQUOVYElWvQEZCkQ0URBCXe8eq505OlU\ny0buSp" +
       "lDINwRT9defK3uxgLmgmXR6zjFrOeiIcHYYm8hettA0J3jHRFJTcJKz3qW78" +
       "M0MaiCEtDX\nNq1Z0RisbwouJ2gW6ZfNbEZ3wEqnr76Vg4Dr0YOA6bbksGoF" +
       "XH6LVf7/yCo3JyYkTJSgabAyWvWl\nDDG7uk4evO2O4DWxF2HadBO0aWJoOz" +
       "cLsgKVKFSaZnYzOpBeFWRItwLSc9xIu/0BtFsmi7ZDdwzE\nl8NVZiFeNtWI" +
       "7ySoDFbIanaVuACXHYA324APEHTXxIBnFp7D5sYVa+qbGgHj2W6MXR4AxMHJ" +
       "Qmyr\njsPpaRbC06YaYZ1zugOLsgkpwgXxLgfEQRvi3QTdfXsQt64em8duH2" +
       "6Fxw7dMVBeBle5hXL5VKO8\nDypyxiJtUHbnjUMOjFtsjA8TFJoYY5otHfg2" +
       "ruT4rgZ877iZw07r1fyrYJIUtjTHwLYZrgoL24qp\nxvYp+LaF1TkzqAvhYw" +
       "6EV9sIv/D/ZOZWinhzEyBe60Z8NJ8A97WTxd2lPw6zKy30K6ca/Vc4s3lp\n" +
       "4ML9dQfua2zcT95esRFcMza1c83fCrWzmhTcNFSE9oco/XKquelPJv5XiLhw" +
       "ZOey83rl56y2zv5d\nUQzVViKlKI7S3VnGe3UDJ2SGTTEvmTlQpwhaOkmHCc" +
       "qHli3zLa58mqBFk1Am8H3De07ldyEPj6NM\nUAG9OTXeI2jm6Bpgweo55T+A" +
       "AyZXHkC2H5yi52BxIEq7H+mZSFawyp9+xQd4sZ3W/wUj+mNiQxQA\nAA==");
}
