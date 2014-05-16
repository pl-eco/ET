package net.javacoding.jspider.core.storage.spi;

import net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;

import et.util.MyUtility;
import net.javacoding.jspider.core.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.impl.*;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public interface ResourceDAOSPI
{
    
    public void
      create(
      int id,
      net.javacoding.jspider.core.model.ResourceInternal resource);
    
    public void
      registerURLReference(
      java.net.URL url,
      java.net.URL referer);
    
    public ResourceInternal[]
      findAllResources(
      );
    
    public ResourceInternal[]
      getRefereringResources(
      net.javacoding.jspider.core.model.ResourceInternal resource);
    
    public ResourceInternal[]
      getReferencedResources(
      net.javacoding.jspider.core.model.ResourceInternal resource);
    
    public ResourceReferenceInternal[]
      getIncomingReferences(
      net.javacoding.jspider.core.model.ResourceInternal resource);
    
    public ResourceReferenceInternal[]
      getOutgoingReferences(
      net.javacoding.jspider.core.model.ResourceInternal resource);
    
    public ResourceInternal[]
      getRootResources(
      net.javacoding.jspider.core.model.SiteInternal site);
    
    public ResourceInternal[]
      getBySite(
      net.javacoding.jspider.core.model.SiteInternal site);
    
    public ResourceInternal[]
      findByFolder(
      net.javacoding.jspider.core.model.FolderInternal folder);
    
    public net.javacoding.jspider.core.model.ResourceInternal
      getResource(
      int id);
    
    public net.javacoding.jspider.core.model.ResourceInternal
      getResource(
      java.net.URL url);
    
    public void
      setSpidered(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLSpideredOkEvent event);
    
    public void
      setIgnoredForParsing(
      java.net.URL url)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;
    
    public void
      setIgnoredForFetching(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLFoundEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;
    
    public void
      setForbidden(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLFoundEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;
    
    public void
      setError(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.ResourceParsedErrorEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;
    
    public void
      setParsed(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.ResourceParsedOkEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;
    
    public void
      setError(
      java.net.URL url,
      net.javacoding.jspider.core.event.impl.URLSpideredErrorEvent event)
          throws net.javacoding.jspider.core.storage.exception.InvalidStateTransitionException;
    
    String
      jlc$CompilerVersion$jl =
      "2.4.0";
    long
      jlc$SourceLastModified$jl =
      1051926914000L;
    String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVaa2wc1RW+Yzt+xIY4jjEmMYlJHBIH79rel+0YFRzHbpxs" +
       "sLGDKMaRGc9c25PM\nzmxn7toOrxYRHoWqLeJVBC2lAiG1ULUgQiWQKAJKqZ" +
       "oWuT+ARi1UaSNoSZsIVUEVND33zszO3bfj\nyVqa9e7Mvfec833fOffM7jx3" +
       "Eq0wDdQkmX5yKI5Nf//YiGiYWO5XRdPcB6cmpbdWVI08u0fTS5AQ\nRSWKTN" +
       "CqqGS2yyIR2xW5fWhn74KBmuO6emhG1Ym9TsYq2zd9Mf+7e3avK0WrxtEqRR" +
       "sjIlGkfl0j\neIGMo5oYjk1hw+yTZSyPo9UaxvIYNhRRVW6Ggbo2jupMZUYT" +
       "ScLA5ig2dXWODqwzE3FsMJvOySiq\nkXTNJEZCIrphElQbPSDOie0JoqjtUc" +
       "UkvVFUPq1gVTa/jm5HpVG0YloVZ2BgQ9SJop2t2D5Iz8Pw\nlQq4aUyLEnam" +
       "lB1UNEBiQ/qMZMQte2AATK2IYTKrJ02VaSKcQHWWS6qozbSPEUPRZmDoCj0B" +
       "Vgha\nm3NRGFQZF6WD4gyeJKgxfdyIdQlGVTFY6BSCLkofxlYCztamccaxNV" +
       "xe8+V9I2eaGedlMpZU6n8F\nTFqfNmkUT2MDaxK2Jn6e8D80dEOiqQQhGHxR" +
       "2mBrTN/ml6+LfvzaBmvMuixjhqcOYIlMSl9Emi5d\n7PtbVSl1ozKumwqVQk" +
       "rkjNUR+0rvQhzU3JBckV70Oxd/NfrrG775E/zPElQ5hMolXU3EtCFUhTW5\n" +
       "335fAe+jioats8PT0yYmQ6hMZafKdfYZ4JhWVEzhKIf3cZHMsvcLcYRQBRwC" +
       "HCFk/dXQFxAglWbC\nkPDOvuGxkSF/nKBuDZMJqgFJl4H9iQNmXJGxMSHpBp" +
       "4wQbfA4wScm0ifukCtrZoXBJq26UmngkJ3\n6SosNCk9e/y3tw7s+da9FoVU" +
       "drafBEXAuN817reN+6lxv23cD+f8qcaRIDCzF6fiSwmTaV59+kJv\n7Xd85p" +
       "ESVDqOqpRYLEHEKRVDPoqqqs9jeZIwQa7mxM80B4KtmQLtgi+TKizEcgUAnT" +
       "PQxnSNupk9\nBO9EEN7i7Wff/dfk/ItUTpT+erq65RqQedDyraZ1bP/um+7d" +
       "WEoHzZdRXhZYTl5MraQDOUirg7N+\nbOqW/7zxw5XN1vp0TpOzABhLn0krxu" +
       "d3lne892r1Wwx6p7is4qrQGCaWVFe7vu4zMIbzf/7+yIMP\nn7znRuao5Wkp" +
       "QZXiFIQtSoQAsE4tIqg8nphSFYmLZE2WbPI31j/0SOsT72UN4NJcRYAVsHu+" +
       "drrm\nbvHN/Vaq1qUSP6AlYuEn38etV9dIWVRWRfS4T8VzWHXdS7e2lxVHB+" +
       "lV12/462Dk2dvSHV1DtY6d\nOQP9e1OnTUqv/+y1Y+H3/3QYvBhHFdcMj/X3" +
       "RQfA4Q15zU1Kq+fWXVs6q/ymhJVmWuaylPTUSb18\nmLAzGBh2JI0CRs9ULW" +
       "RKdsTQJSzDtuXaffS/u049uKLnpRJUBrUadisiQo2B0r8+3XhKee111ERN\n" +
       "wczqad2IiSq95OwvK8msoc+7Z1i5uIC9rwUkq+HoheNCu0Cx//RiHX1ZYxUX" +
       "Nnoje91sKbCEvt9C\nX1ptrQn0tQ14WeMquM8wxEM02RbuWLz0sbfFH0DZhv" +
       "JpKjdjVh1LrLVg0jqezBFDiUGBnrN3kJfG\nP+uQT1yx05JcI9+Z8AN3Bc7i" +
       "ljUfn2LCq4I2QTSvSaovc5tKM/LA+qdPvHh8tN6SrbWXb8rYTvk5\n1n7OAK" +
       "qJ08S5LJ8FNvrNKy577vbRv0zRSOi8doJKIXkhbZm7YVikkQfC2vUsB2994v" +
       "jdrR99cNTe\nRzkU3FGfTB5OHLnrtUWm3jQIWKdG3wmsewFxseJraZS+rrR2" +
       "kr3EnhkMhoLgUB1Yop2dX5H9UV0S\n1aGdT71evfhAIrLbcuUCbsDQzsmFDU" +
       "efaT3bzFywLZZzW7X9uWJONFx24vTfNQT1LXcP3N4ZagsG\nfeFuKIyGfY3J" +
       "sp6gQL69LabLWE3uakO0kGqimipp+no1TQu7RtLPvcCZZGCRWGZ2xK0pXyWo" +
       "bE6n\nHbHFaAdipyMZ6VZrp1utx3RzfHMyiX7eYxEpcUSG2IVh+iJ7gjnSFu" +
       "z2hcKg24ShOgjXsIynMF83\nGuVdOMC5EHZdOOjRhVAXY7rCYKXQoEvOFqZs" +
       "P0H1Bp6BaoQN8DNZR+m1G7Lx1AFHnc1T3XniCaV0\nGnm8hdJfOw0lo09VHQ" +
       "hM2l1wec+qK037w/N7Tm5tOvN4CSrJk/ZZ+vvkCpPSC6Utp0teaWhhG1DZ\n" +
       "lGhalSH9xijzvifldoa5Xp2C4ro8KPJa+QanlQgrCPvi8bhzsifS1e0K6A5P" +
       "Aupu6+z0hUBAl6QD\nvMVstnbvbHIYhqPeDqT+PMlBYMMEHof7ORy4kL/tJe" +
       "RAR1s46OviqyMDuLAM74J74BlMrGShd6Wu\nGOnlWzKozoUQH+LDXIhd2aju" +
       "ceN+lKCr8sXNCvhEegFndSLcFurwRbq3ERQis4qZvI9h8SQR2trq\nzx5gLg" +
       "002BE2FE8DT7kAhTtcLH7sSQOB5WrgcV4DUDDlQhrIhRAf4k85DfRk0UA3F/" +
       "fzy9ZAV+Cc\nNZASYDYNXA9Hox1hY/E08DKngYCLxS89aSDUFun0dUfOXQO/" +
       "IOgigGhIk/QYSxIbqmwSaMkDEB/h\n61yEnXGnmehderuW9MKhPEVBPUEXtb" +
       "eWq6BQwKoiXaCgYEEFZcKTS0BrbXzWFk9Af+Dg5fq/dz0J\nKLJcAb1jCWg4" +
       "QWb0pQgoF0B8hB9wEQZZDXkjVQFc2MeWr4DOc1BAZnzZFNAHR5MdYFPxFPB3" +
       "Dp+I\nC8UJTwropu13JETobTxJ3mT5C2ftGAxf+g3Wh9D/UoB1nRTabnIhyU" +
       "NxmoMinG276XTx+cwjPtBd\nRuAO6ZJ09/N2l9vhWG8Hsr54kviSw4HrLv/n" +
       "JeRgB02QcJctCbrePwoTfAY8AYR2HBpzZJTJbC5A\nuIiECi6ibM1kt7t5Cl" +
       "UewwRm6Y1nXdLvvJTugKPZjqC5aJQKa1wAIm7TJNR7ihX6phBTcfk0+/XA\n" +
       "yfOOwnk+yCYsOdOFCwiqoTdiOw4NuqYytZALSR6KDZwWsjaVbksgXEbQlYU3" +
       "hNRgAJlwiImddpTb\n8u8GfEzZ5NEOx0Y7qI3nVx7042Bh5DcTVM25zSPp50" +
       "TllkahnaA9hUEb2Csqap8sQ4tgZvRotEZa\nPVUnYNi6hK6c6zNyfU3TYuPY" +
       "Urw06+EQ4WS03VOaRSgQoS7r6zS6ZuHvsYRgbtb6OB+5srfDo4/2\n1yX1nN" +
       "Vk4ctJy1fguNym5fLzREvmt5xClAvZbfeEvZ5C7m4LdPuCYY4W3uS1nEn3W0" +
       "1h1KPJILRV\nnQStwHNYI0697clXb9lIvxKLq/SL1zF2BcvDBwfo+cJCGgQh" +
       "mZg48+iQrN+D+uDYajO5tXgJJnKw\nut2qMOUF1lAHhTUUKphgWfyZ5fzpSt" +
       "6e7l3KL+V4QcJx+muHf0ibgzVk+mwL3meImvUjyIBznRm6\nEVKLPlcwo8Ea" +
       "8qBu0EdlYO2chPTDsc0mZFvxUsvkAHB7RYF4IiTA/4CQkVoLnEn3S0DhkEeT" +
       "9I4l\nkp5aoaWn1qCe0OQ8WZVFPXe4kXR10FZEOMDOx+A+OIXsQUyk2Xxs0z" +
       "uDNpvttuKxfR/nMLfj3+8J\n+lBboMcXjORg+7ucSW67+p5HkyAwejNisU0X" +
       "vG3JrD3CeRTkWDsMPSqwBnRNKbKMtZxk0Tt7v02W\nv3hkPcn5ye16P/KEXK" +
       "QtEPYFAznIepozye16z3g0GQyxLxNSU/OqJaams6D1bOGAYejGuWXp81xQ\n" +
       "EY7vxwiqBL7Zijm5vspuPpHzvzhcH+F87HKBf9kT8NDhRHzBYA6uX+FMcpX/" +
       "VY8mg2FfJJDO9ZXL\n4jpvk5OF6De5iHo4on8O54Foa9GcTNNeNmAzHSge00" +
       "ddJ7mfP4Tfe4E93JE3qxc5k1zV/6NHkzSr\nM3rZpTLN9bLLSOljXEQBjum3" +
       "M1Iamo0LU52nD+A1Zjy3bD1dK21cvGnrG/HV71i/kDtPwFZGUeV0\nQlW5J8" +
       "D4p8HK4waeVphIKq0nrywvPyJoyxKfuQTm4JWGKHxoTT5O0KYlTCaown7HTz" +
       "5B0Lo8kwkq\no//4GZ8Q1JB9Bliw3/HjPwVcU8cTtNL9wA/9NwQHQ+nbU8kW" +
       "u5Y9TkIfBvVbjzYtxP8PE72WYZYu\nAAA=");
}
