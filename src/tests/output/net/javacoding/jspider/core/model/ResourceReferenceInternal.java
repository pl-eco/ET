package net.javacoding.jspider.core.model;

import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class ResourceReferenceInternal
  implements net.javacoding.jspider.api.model.ResourceReference
{

    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected java.net.URL
      referer;
    protected java.net.URL
      referee;
    protected int
      count;
    
    public ResourceReferenceInternal(net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                                     java.net.URL referer,
                                     java.net.URL referee,
                                     int count) {
        super();
        this.
          storage =
          storage;
        this.
          referer =
          referer;
        this.
          referee =
          referee;
        this.
          count =
          count;
    }
    
    public net.javacoding.jspider.api.model.FetchedResource
      getReferer(
      ) {
        return storage.
                 getResourceDAO().
                 getResource(
                 referer);
    }
    
    public net.javacoding.jspider.api.model.Resource
      getReferee(
      ) {
        return storage.
                 getResourceDAO().
                 getResource(
                 referee);
    }
    
    public int
      getCount(
      ) {
        return count;
    }
    
    public void
      incrementCount(
      ) {
        count++;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYe2wcRxkf2+f3JX7ETezYiR91aE19d37k/IiF2sMPcskl" +
       "vvqclLiOruvdsb3J\n3u5md+58TkPEozSlf1QqfYGUtuKlSKXiFbUggQhREy" +
       "iUIOo/2gJqBUpVFUGqIoQaQVH4Zmbvdm/v\nbCM5sbR745nvm/mev+/befEa" +
       "KjUN1CKafrKsY9M/GosKhomlUUUwzWmYiouXSyuj5/arWjEqiqBi\nWSKoJi" +
       "KaAUkgQkCWAuGxkbSB2nRNWV5QNGLtk7fLnts/XvrtmX3NJahmBtXIaowIRB" +
       "ZHNZXgNJlB\n3gROzGHDDEkSlmZQnYqxFMOGLCjySSDU1BlUb8oLqkCSBjan" +
       "sKkpKUpYbyZ1bLAzM5MR5BU11SRG\nUiSaYRJUGzkmpIRAkshKICKbZCSCyu" +
       "ZlrEjmCXQalURQ6bwiLADh1khGiwDbMTBB54G8SgYxjXlB\nxBkWz3FZBUu0" +
       "ujmyGnfuBwJgLU9gsqhlj/KoAkygei6SIqgLgRgxZHUBSEu1JJxC0PZVNwWi" +
       "Cl0Q\njwsLOE5Qo5suypeAqpKZhbIQdJubjO0EPtvu8pnDW5Nl3v8+Gv2ojf" +
       "ncI2FRofKXA9NOF9MUnscG\nVkXMGa8n/U+GjyRbihEC4ttcxJwmtOvHhyLv" +
       "X2jlNM0FaCbnjmGRxMWPB1p2rITerSyhYlTominT\nUMjRnHk1aq2MpHWI5q" +
       "3ZHemiP7P4i6lfHvn8C/hvxagijMpETUkm1DCqxKo0ao3LYRyRVcxnJ+fn\n" +
       "TUzCyKOwqTKN/Q/mmJcVTM1RBmNdIItsnNYRQuXwFMHThfhfNX0R1ExDM2mI" +
       "OGusMI0nVVD8OkGf\nUjGZpeEgahIEwuwxU5clbMyKmoFnE5qEldk1+NP09J" +
       "qloiKaxu4kVCBi92oK7BYXz139zanx/V95\nhLuUhqElN0EjIIHflsBvSeCn" +
       "EviZBP5VJUBFRezsbblGp16UaLL9/UcjtY/5zJeLUckMqpQTiSQR\n5hQMSS" +
       "ooiraEpThhUVrnyAgWiBDF3jkIaBAorsBGLIHAyikDdbgD1073MIwEEG/l9I" +
       "3ffxBfOk9j\njMZEA92diwYePs5l83bFju574JGOEkq05KHOA9LO9XePix88" +
       "euD8G6+9faedIAR15uVtPifNO7f4\nUUMTsQS4Zm//zL/3fvhE6fBLxcgDyQ" +
       "xwRgQIQsCGne4zcvJvJINl1FjAWT2vGQlBoUsZAKoii4a2\nZM+w+NnExrVW" +
       "xJbCs82K4Hr6oov19LWFRxu1p0sHhpTXv1TW8+bPqi8zo2RAtcaBvjFMeIrW" +
       "2e6Y\nNjCG+be/Fn3iqWtn7me+sJxBUJmenFNkMc3k21YEvt9SAC78jQ1PPt" +
       "119s2Ms7fYu4cMQ1imvk5/\nYWXH138lPAtQAiltyicxy1gPO8kDTI04s+X4" +
       "6AEOQByuTp29+nDXn/9wxYI0R6m0qf4afyj58pcv\nrBRTE1dC0RLMg5kMY0" +
       "WTjopYIQE3spCnM5XMnlU8iXuJxTk8MDQEAtXDSbTI+mXJH9FEQQmPfeNi\n" +
       "9crjyYF9XJRNDoLwWDzdeuU7XTfamAjWiWUO1LT+L08JxkE7+elPH0ETG8Kg" +
       "Pb1D3f3DvuAgQeUm\nBDvUIOawBoL61oIWi9YPc/4YH8eiYcYa4DbZ47DJMF" +
       "vop6+RmyFxcNg32AMSG2zZyEjsZcFDxT40\nFXHKErJlGe6xZfn0zZBlsM83" +
       "1J+VhTnnbgiBZmdMRg05AZ5MWZX2pZl/9kjv3TXGY6HR2cE5Cff2\n3cCdW9" +
       "7/kOWkKzILlHPXIY/v/PZ7569ONXCY4z3P7Xlth5OH9z3MYF49DTq0r3UCo7" +
       "50V/uLp6fe\nmeOa1OcWknE1mQg+/xbuuscrFihdJdCZAUwwvYIZmKDvbjb2" +
       "UfhiKY6YSB0WCa0i7mo5QVvCDAQn\n5h781yvPVbVxSKE8LVmkyPFKDldcPH" +
       "HybP9K7D6Z6+K2rov45M8PPXf9CnmH+yaL8vS09nS+gIcF\nRwEaeiNVV/aD" +
       "5xPFqHwG1bKGV1DJYUFJUjSdAaQxR63JCCCFcz23/eQgNpKtYi1u9zqOddcX" +
       "2xcw\nzgU1u6Rshqcdnk1WSdnkKilFiKHQ/Yyhk73vyBaASt3QCMiHpbQLXK" +
       "ysFBwIEXShJjf32D3DF9+9\n9n35I4aMVazzD1EOS/BKNuOA6xJNN2mP6fjI" +
       "sXbqnNRNHtu7Capix/b29fT0bxgC+nu6e4O+PkBi\n7/TecCyDjPSkOVvv09" +
       "Db5qtHhUJ2uYbA2cwgjHqXpY9zEVLGMzUeGqM7D/FiTt+Hc7y13fpFmd98\n" +
       "b7FyctSFnpZLTjhcMsAWRKe1ejdsrb6B7mCfLzicsZYlAz3JsEWi/7LPlrvX" +
       "0rPG0rOmsJ7pXD1z\nQu9Bh56D+XoGb0ZUFNCTRcWp3GKxtp6N8NRaetYW1v" +
       "OLlp6lopZUWa+9j+3GFP2EBZo2rrZY3bLD\nGmcc1titr1f/BSj5q3xZ0KKx" +
       "Y7VPU1Ywznz2H96HhUtHiy1Uj8DRRNN9Ck5hxQZ49yYH2Jd4Bstq\n7mv9y8" +
       "TAuc8VQvgWJ8LnssXFi9+78KfgW398CFB7BpUfnIyNhiLjkHWtax4XF+tSzf" +
       "eWLMqvMhiy\nwDbv/iCXaSQXYqsMTJKGOp0DtG05vfsd8DRZrm4q1Ls7/LlK" +
       "nVy3iD4FUb6AyVR+5p91tEi9dov0\nLEGfWSsTLHibTeCEZixnU2IsNBlO6K" +
       "xD6h3s7h329Qc/SdBmCHu/63gItJ51A20CE3ERS5ndEeP8\nao712uDZYVlv" +
       "xy2y3rec1svBkxcc1uuzrffdDVtvd3AV62Xb9K7/O00Lma3JqvAo83sLzPZD" +
       "gipA\n7tEsPBUSpAOeXZYgu26RID8BI8qqaOAEVrk4jGxC56z7ocCmNHpLyp" +
       "vSHgSNS9OqKE8/Vxvz7k75\nDZ/YsfLAna/odb9mtwDZW7gK+KibTyqKs/dy" +
       "jMt0cLHMRK3gnRiPrssEta97zwMFgP0yVS5xxlcJ\nal6DEfSlP06O1wjaWp" +
       "gDqpY1ctL/DkyaSw85Yv/jJH0dWn4gpcOVbJGptfsd3s3SEtLg6JRiOhZl\n" +
       "+gGd/uZPPfc+9vp/GAaXi/z2md64Qq+XkuFDORACpyybrHmma/QWSkwaBvU1" +
       "rUGWkatNviO/YW12\ntorZszqnj0TH87vFXvjmHNtgXzDUPeQbAsPTrmCD93" +
       "fQUzYVshST3tk5Uj2OW2f+D8rZUMg3GAAA\n");
}
