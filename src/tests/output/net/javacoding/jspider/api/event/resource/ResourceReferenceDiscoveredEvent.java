package net.javacoding.jspider.api.event.resource;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.FetchedResource;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;

public class ResourceReferenceDiscoveredEvent
extends net.javacoding.jspider.api.event.resource.ResourceRelatedEvent
{

    protected net.javacoding.jspider.api.model.Resource
      targetResource;
    
    public ResourceReferenceDiscoveredEvent(net.javacoding.jspider.api.model.Resource resource,
                                            net.javacoding.jspider.api.model.Resource targetResource) {
        super(resource);
        this.
          targetResource =
          targetResource;
    }
    
    public net.javacoding.jspider.api.model.FetchedResource
      getResource(
      ) {
        return (net.javacoding.jspider.api.model.FetchedResource)
                 resource;
    }
    
    public net.javacoding.jspider.api.model.Resource
      getReferencedResource(
      ) {
        return targetResource;
    }
    
    public java.lang.String
      getComment(
      ) {
        return "resource " +
        resource +
        " references " +
        targetResource;
    }
    
    public void
      accept(
      net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.
          visit(
          this);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcRxWfO5/PPtuNP5OaxIkd1zSxYt/Zd47txBKqZTuK" +
       "nUvs+JyUHK4u6905\ne5O93c3u3PkSSigiNKWgSqWlBSm0AoEilap8hLYSrQ" +
       "hRW74jgf9oC6gVKFVVBKmKEGoEReHN7O7t\n3N45FsixtOu53ffevPm993vz" +
       "dp69jipNA7WJZpic1rEZHkvMCIaJpTFFMM05eJQSX6sMzVw8oGp+\n5Isjvy" +
       "wRVB8XzYgkECEiS5HJ8ZG8gTp0TTm9qGjEtlNiZe9dHy3/5vzUlgpUn0T1sp" +
       "ogApHFMU0l\nOE+SqC6DMwvYMEclCUtJ1KhiLCWwIQuKfAYENTWJmkx5URVI" +
       "1sDmLDY1JUcFm8ysjg02p/MwjupE\nTTWJkRWJZpgENcRPCDkhkiWyEonLJh" +
       "mJo2BaxopknkJnUUUcVaYVYREEN8WdVUSYxcg++hzEa2Rw\n00gLInZUAidl" +
       "FZBo92oUVtx1AARAtSqDyZJWmCqgCvAANVkuKYK6GEkQQ1YXQbRSy8IsBG1e" +
       "1SgI\nVeuCeFJYxCmCWr1yM9YrkAoxWKgKQRu9YswSxGyzJ2ZctKaDdf95eO" +
       "bDDhbzgIRFhfpfBUrbPEqz\nOI0NrIrYUryRDT8+eSzb5kcIhDd6hC2Z0Y+/" +
       "eCT+3uV2S2ZLGZnphRNYJCnxo8G2rSuj74QqqBvV\numbKNBWKVs6iOmO/Gc" +
       "nrkM2bChbpy7Dz8qezPzv2wDP4r35UPYmCoqZkM+okCmFVGrPHVTCOyyq2\n" +
       "nk6n0yYmkyigsEdBjf0GONKygikcQRjrAlli47yOEKqCywfXDmT91dMbQZ00" +
       "NbOGiAtgjcumqOVg\nLE3ksErCOkFxFZN5mhWiJkE+zJ8wdVnCxrygy/OYCs" +
       "0btpX5tc3lqU/1yz4fJbeXmgrk8X5NAeMp\n8eK1X90/ceCLD1mBpslpr4ag" +
       "KXAo7DoUth0Kg0Nh5lDYcSi8lkPI52Ou3FkcGRpqiTLybz8caXik\n13zBjy" +
       "qSKCRnMlkiLCgYmCwoiraMpRRhqdzI0YZlK6R63QJkPfiXUsAQYxmEImegTm" +
       "92uzVhEkYC\neLly9uZv308tX6KJSBOnhVq3XIM0OGn5VteduG/q+EOdFVRo" +
       "OUAjDKJda1tPie8/fPDS679+a6fL\nIoK6SshdqknJ6XV/xtBELEHxc80/+a" +
       "/9HzxWued5PwoA46HmEQEyFQrINu8cRSQdcQoeBQs0a9Oa\nkREU+sqpUjVk" +
       "ydCW3Scsne5g4wYAoBauSrg22WneTG/0ZRO9NVvJR/H0rIGV0xufD/a98XLt" +
       "awwU\np/LWcyU6gYnF40Y3HHMGxvD8ra/NPPbV6+c/xWJhB4OgoJ5dUGQxz/" +
       "y70wexby5TU8KtLY8/0X3h\nDSfYza71UcMQTtNY5z+3svXrPxe+AfUGeG/K" +
       "ZzCjtZ/N5AelVuyYnBg7aFUpq6bdf+Hag91/+v1V\nu+5x+6kr9ZfUuewLX7" +
       "i84qcQh2BnE8xDDuHYzkpHPrbbQBhZytMnIYZnjcXpfmJrDkRjMXCoCWai\n" +
       "O3FYlsJxTRSUyfFvXqldeTQ7OGW5cgcnMDmeyrdf/U73zQ7mgj1jkCut9u+q" +
       "nGAccmsB/Rcl6Mh6\nVqi9/Xt6BgZ6B2FB1Y4aC2ALQd23qDwZTcJKoeAwjY" +
       "gFzV4OmgH2IkZvI7fB8cFY7/AgQRuIYCxi\n4ujQ2YadLKT3HjbupexgGYSY" +
       "n522CC1S3tq8j7YlDsMzC5/+5ytP1XRYGUt12gr1ZwufiEVaKfHU\nmQuxlc" +
       "S9spUA3g3bI3zmJ0eeunGVvM3o6BYROtv2fKmDRwWuvg2/nmsMfv/pjB9VJV" +
       "EDa7oElRwV\nlCwlaxIS2RyzH8YhEfn3xS2QxZGRQpFs8xYwblpv+XI3LRgX" +
       "c8atWBvguhuuRrtiNXoqlg+xJJ9i\nCl3svqNQX0K6oRHwD0v5kpjzCTjDJW" +
       "DUw00L9fF79lx55/r35A8Z/2pYEzpKNWz/Q+wJVxQqNN2k\n7Q7Xb9uWuqZ1" +
       "c4RNO0BQDZu2v69/aN1pGov17B7qHQKaNs/tn0yES1P+cAkoZ6EHK1079diG" +
       "HzWx\n1NzASjDNgPCEms3wL6H/CMxOjI4zTrH9hK31bps6LrvabGYB3ltX62" +
       "dZL37+k3+ve1B49T6LFU3F\nnQidfvfTb+Lue+rEMq1QiGh6rwLgKS51vbMd" +
       "ZH2+k6X197b/ed/gxc94uRugDRnP3WK1lHjluct/\n3P3mH86BF0lUdWg6MT" +
       "YanwCH2285XUpszG05XLEk/4Jllk2jkq+TYqWRYvLUGBg+rtS5Igp1FG36\n" +
       "O+FqtaPUWm7T52K0SgVcszyeIKh2FYKd4gi2263wxnrnfHSgp7+/d6CPoBbO" +
       "kx1mh4WQs031rblN\n7cNEXMKSYwExzcUiSHfB1WZD2nabIIWytZEtxF6xVA" +
       "7cz3LgDrngPrDu4A4zcGPQppb1qQAzo345\nyLbB1WFD1nGbIDsHRRXcG9My" +
       "GXCbx+lLHE7DLk5fXvfCG6U4xSAJm11HSnKwwS2h1jlCOcB64Oqy\nAev63w" +
       "Dz2R0HB8ATHAB7XACeXHcABnuiMZYoVTkZ2lPNcBbdu+aXKbNx1NJaO9hfgW" +
       "8IQRSxTryd\n1YwhZ6AxztmnG88n/9Envbtr3NpDWvlTM15wf/Qm7mp+7wOr" +
       "pypu9Mt0ZJ5JHt327XcvXZttsfYh\n65zprpKjHl7HOmtiS6nT6U64/VYzMO" +
       "lXd21/9uzs2wt+G4LjsN/mNHq4F2T+9tGi0bFWlOh3VGvJ\nyZ91PiV2rhzf" +
       "+Yre+Ev2eVo4Q6qGr410VlH4ro0bB3UDp2XmUrXVw1lJ991bfxUUn0d4Pyme" +
       "sWw8\nBytaywZBlew/r/cDgjavrkdQBdx5+R8RtKm8PKSyPeLlX4QGqlgeio" +
       "/7gxf9McwGonT4ks6T8mWO\nlP26Q5RP/D9HOIpA7PDSVGrhGrmEjkWZfmLm" +
       "v/VS4PAjv/s3azaqROsQlx5cQp/KuBoZVQXltMn6\nf/qOntOIWQNyiLCuzI" +
       "52rWlZtA4qt/BtbmGurrljMxNlOt3Bda83Qz3RaG8U7AZop7u+J2DQEn+s\n" +
       "HJJsdXzjS9eZtF34Lw/xUy2eFwAA");
}
