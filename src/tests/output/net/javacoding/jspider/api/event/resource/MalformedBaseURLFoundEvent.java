package net.javacoding.jspider.api.event.resource;

import net.javacoding.jspider.api.model.FetchedResource;

import et.util.MyUtility;
import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;

public class MalformedBaseURLFoundEvent
extends net.javacoding.jspider.api.event.resource.ResourceRelatedEvent
{

    protected java.lang.String
      malformedBaseURL;
    
    public MalformedBaseURLFoundEvent(net.javacoding.jspider.api.model.FetchedResource resource,
                                      java.lang.String malformedBaseURL) {
        super(resource);
        this.
          malformedBaseURL =
          malformedBaseURL;
    }
    
    public net.javacoding.jspider.api.model.FetchedResource
      getResource(
      ) {
        return (net.javacoding.jspider.api.model.FetchedResource)
                 resource;
    }
    
    public java.lang.String
      getComment(
      ) {
        return "malformed baseURL found in resource \'" +
        resource.
          getURL() +
        "\' : \'" +
        malformedBaseURL +
        "\'";
    }
    
    public java.lang.String
      getMalformedBaseURL(
      ) {
        return malformedBaseURL;
    }
    
    public void
      accept(
      net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.
          visit(
          this);
    }
    
    public java.lang.String
      toString(
      ) {
        return this.
                 getComment();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcRxWfO9tnn+3En3GN7cSO6364te98PttxYglq/KE4" +
       "ucTXOyclxtV1vTtn\nb7K3u92dsy+hhCJCUwqqqJq2IIVWIFAkVLWIkIJU1B" +
       "A1KZ+RwH+0BdQKlKoqglRFCDWCovBmdtc7\ntz7H+eNiaffGu+/Ne/Pe7/3m" +
       "7bx4FZWZBmoTzRA5qmMzNJaMC4aJpTFFMM0ZeJQSL5UF42f2qpof\n+WLIL0" +
       "sE1cREMywJRAjLUnhqfCRnoA5dU44uKBqx51kzy67bP1n+3ck9rSWoZhbVyG" +
       "qSCEQWxzSV\n4ByZRdUZnJnHhjkqSViaRXUqxlISG7KgyMdAUFNnUb0pL6gC" +
       "yRrYTGBTU5aoYL2Z1bHBbDoPY6ha\n1FSTGFmRaIZJUG3ssLAkhLNEVsIx2S" +
       "QjMRRIy1iRzIfRcVQSQ2VpRVgAwaaYs4owmzE8SZ+DeKUM\nbhppQcSOSukR" +
       "WYVItHs1VlfctRcEQLU8g8mitmqqVBXgAaq3XFIEdSGcJIasLoBomZYFKwS1" +
       "rDsp\nCFXognhEWMApgpq9cnHrFUgFWVioCkFbvGJsJshZiydnXLamA9X/ey" +
       "L+cQfLeamERYX6Xw5K2zxK\nCZzGBlZFbCley4ZOTR3KtvkRAuEtHmFLZvSO" +
       "nx6IfXC+3ZJpLSAzPX8YiyQlfjLUtnVl9L1gCXWj\nQtdMmUIhb+Usq3H7zU" +
       "hOBzQ3rc5IX4acl79IvHHo0R/iv/tRxRQKiJqSzahTKIhVacwel8M4JqvY\n" +
       "ejqdTpuYTKFShT0KaOx/CEdaVjANRwDGukAW2TinI4TK4fLBdQey/oL0RlDb" +
       "PkFJa0YGS58VTHwg\nEZvUsqo0sYRVEtIJmlQxmaN4EDUJkDB32NRlCRtzgi" +
       "7PYSo0B5DXsoaI5240UY76UbPs89GC9paj\nAtjdrSkwbUo8c+U3j0zs/drj" +
       "VnIpIO0VEDQOroRcV0K2KyFwJcRcCTmuhNZ3Bfl8zInb8vNAEyvR\n+vvHj0" +
       "dqn+w1X/GjklkUlDOZLBHmFQx1KyiKtoylFGHAreOKhGETgF09DxgHz1IKTM" +
       "RqCgK/ZKBO\nL5ZdBpiCkQAAXTl+/fcfppbPUthRmDTS2S3XIOlHLN+qu5MP" +
       "7nno8c4SKrRcSvMJol0bz54SP3xi\n39k3f/vO3W7NENS1ppTXatJS9LofNz" +
       "QRS0B17vTP/Wf3R0+X7TznR6VQ38BwRABcAl1s89rIK8kR\nh95osECziiZN" +
       "UOgrh5MqyaKhLbtPGJA2sXEtBKAKrjK4am1Qb6I3+rKe3hos2NF4etbAyPPa" +
       "VwJ9\nb/286hILisOzNRwhJzGxqrbOTceMgTE8f+db8aefuXry8ywXdjIICu" +
       "jZeUUWc8y/23yQ+4YCDBJq\nbjz1bPfpt5xkN7izjxqGcJTmOvflla3f/qXw" +
       "HWAXqHJTPoZZEfuZJT8oNWNnyomxfRYnWQz2yOkr\nj3X/5Y+XbZbjdk9X6m" +
       "+pE9lXvnp+xU9DHIR9TDD3O6XG9lE68rG9BdLIIE+fBFk8K61qjhBbcyCy\n" +
       "Yyc4VA+W6L4bkqVQTBMFZWr8uxeqVp7KDu2xXNnECUyNp3Ltl3/Qfb2DuWBb" +
       "DHBEav9fviQY+10W\noD/9BE0Xh5V2RaI9A329QwMEVTgKLHWNBPXdgG0ymo" +
       "SV0CQm4iKWErxi2IrNLjc2w33sRZTeRorq\n+dBQ7/BO6CAyHjlnBbUMVpSh" +
       "QtY27sCS3nvYuJeWC4MUYn532iKUtbw0PUm7EqfkM/Nf+Pfrz1d2\nWBCmOm" +
       "2rhNTKIzNPKyU+fOx0dCX5gGwhwrtfe4SPvXbg+WuXybusPl1Woda259Y6eF" +
       "DgCG/4zaW6\nwI9eyPhR+SyqZT2XoJKDgpKl1TsLyDbH7IcxQCb/Pr8Dsopm" +
       "ZJU127yMxpn18pm7f8E4v4hcCtsM\n1502lSHnl6MwH2Kot9Laxe53rRJOUD" +
       "c0Av5hKbceEmxIJrhyHfaUqxX38ft2Xnjv6svyx6wkK1kX\nOko17BUE2ROO" +
       "J0o03aT9Dtdw2zN1TevmCDMLpVXJzEaikb6h4uG/f0dPZLA3CiS0ZWb3VDLk" +
       "XTq1\nnSwQkuPQgq1dOfXXDj+qZ9Dc7BbPhJrN8C+hFSlNTIyOUxOfYRsMW+" +
       "mddum41dVmVxZEe+t67Sxr\nxU9+7p/VjwkXH7Sqoj6/NaHmB194G3ffVy0W" +
       "6IqCRNN7FQid4pau19o+1uY7KK15oP2vk0Nnvuit\nXfaxxdduvlpKvPDS+T" +
       "8Pvv2nE+DFLCrfP50cG41NgMPtNzSXEuuWWu8vWZR/xXBll9Gaj5N8pZH8\n" +
       "4qk0MHxbqTN5JdSR1wXcY2XHydLaLoDL0ToMuCE9gt9VC5gUYnyTY/yIy/ik" +
       "iIw/3BOJ9A7A7tfI\n+XCX2WHFhlobRsyynBeYbXA12YFpukWBAfKpBKfGtE" +
       "wGnOXj8iUuLlE3Lo8SFC9SXKKDlAn6d9wD\nvRtZlM2Q6wir0EIx6YarxY5J" +
       "yy2KyQmCGsAVr+98cL7OBWfADc43ikiTQww0QJNtBXzJA0/BQPXY\nAELO78" +
       "0Hymc3BNx6T3HrHXTX+0zx1hvt6+mP9g5ECTSOMjSSmuF0Q70bfj2yOQ5aWh" +
       "un95vQ7Qui\niHXibXnihpyBFnbJPnU4N/uvPun9e8ctcm/mT7N4wd3913FX" +
       "wwcfWc1OfkteoFXyGHlq2/ffP3sl\n0WhtENb5z+1rjmB4HesMiC2lWqdb1P" +
       "YbWWDSF+/d/uLxxLvzfjsE87ARLmn00C3A/O1bj346bQR1\n3qJSOwP9O9Gs" +
       "JpfH20sc3oZcvL1cRLwN0PqK9hFU5zjgKSqgxpb1p6Cff81rjietQzSxc+Wh" +
       "u1/X\n637NvqpXD7oq4CMpnVUUvrfkxgHdwGmZLb/C6jStWJwjqPumD1C830" +
       "M/seb4GUEdG81BUBn75fVe\nhRisr0dQCdx5+dcIaiosD3Vtj3j5CwRtzpeH" +
       "/cj9hxe9CNZAlA4v6TxW3uD64x26wxqfvvkzJ2dH\nTmBFgH6cpZfWVSPXbi" +
       "Z1LMr0yzj3vVdL73/yD/9lLVG5aJ0009NV6KUZcYVHVUE5arKvFPqOHi+J\n" +
       "WcOASVnvaGe7yrRmtE5TW/lWfNVW18yh+ESBbnxnEcuA7cGRQSAE2o0X67AO" +
       "mvVPFYoeWxHfktO1\nzdnG/w8FZdPANxgAAA==");
}
