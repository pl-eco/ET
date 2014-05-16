package net.javacoding.jspider.core.event.impl;

import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.HTTPHeader;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;
import java.net.URLConnection;

import et.util.MyUtility;

public class URLSpideredErrorEvent
extends net.javacoding.jspider.core.event.impl.URLRelatedBaseEventImpl
{

    protected java.lang.Exception
      error;
    protected int
      httpStatus;
    protected HTTPHeader[]
      headers;
    
    public URLSpideredErrorEvent(net.javacoding.jspider.core.SpiderContext context,
                                 java.net.URL url,
                                 int httpStatus,
                                 java.net.URLConnection urlConnection,
                                 HTTPHeader[] headers,
                                 java.lang.Exception error) {
        super(context,
              url);
        this.
          error =
          error;
        this.
          httpStatus =
          httpStatus;
        this.
          headers =
          headers;
    }
    
    public java.lang.String
      toString(
      ) {
        return "url spidered : " +
        url +
        " ERROR : " +
        error.
          getClass() +
        (httpStatus !=
           0
           ? " (HTTP Status: " +
         httpStatus +
         ")"
           : "");
    }
    
    public void
      accept(
      java.net.URL url,
      net.javacoding.jspider.core.event.CoreEventVisitor visitor) {
        visitor.
          visit(
          url,
          this);
    }
    
    public HTTPHeader[]
      getHeaders(
      ) {
        return headers;
    }
    
    public int
      getHttpStatus(
      ) {
        return httpStatus;
    }
    
    public java.lang.Exception
      getException(
      ) {
        return error;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZe2wUxxkfn98PYmyMcWODDbiAi+/Od+c7bFylcW0TGw7s" +
       "2IaA6/Sy3hvbC3u3\nm905+6ApShQCaapGipK+VBrUqi1Slb5AIX+kKkUhfa" +
       "O2rpSkqRI1JUqpUlBQW0HbVPSbmd3bufXZ\nIBks7d3e7vea7/H7vhm/cBkV" +
       "mgZqkE0fOahj09czMiQZJo73qJJpjsKjmPxqYenQyR1JzYPyosij\nxAmqjM" +
       "qmPy4Rya/E/QO9XWkDNemaenBK1YglZ56Ures/nP3Nse31+ahyDFUqyREiEU" +
       "Xu0ZIEp8kY\nqkjgxAQ2zO54HMfHUFUS4/gINhRJVQ4BoZYcQ9WmMpWUSMrA" +
       "5jA2NXWGElabKR0bTKf9MIoqZC1p\nEiMlE80wCVoe3S/NSP4UUVR/VDFJVx" +
       "QVTSpYjZsPo8MoP4oKJ1VpCghro/Yq/Eyifxt9DuRlCphp\nTEoytlkKDihJ" +
       "8ESjmyOz4uYdQACsxQlMprWMqoKkBA9QNTdJlZJT/hFiKMkpIC3UUqCFoLsX" +
       "FApE\nJbokH5CmcIygOjfdEH8FVKXMLZSFoJVuMiYJYna3K2ZCtAaLKv731N" +
       "C1JhbzgjiWVWp/MTCtcTEN\n40ls4KSMOeP1lO+5gX2pBg9CQLzSRcxpuj/6" +
       "0u7opbONnKY+B83gxH4sk5j8YaRh9Vz3u6X51IwS\nXTMVmgpZK2dRHbLedK" +
       "V1yObajET60me//Onwz/Y9+l38vgeVDKAiWVNTieQAKsXJeI91Xwz3USWJ\n" +
       "+dPByUkTkwFUoLJHRRr7De6YVFRM3VEE97pEptl9WkcIFcOVB1cI8b9q+kHQ" +
       "qt3D0RFdiYOj4n2G\noRl9MzhJfDpB9yQxGaepIGtxSILx/SYjG5c1A49jSj" +
       "WuJHR1fAEBaaq6cjYvj9awuwJVSNd+TQWm\nmHzy4q8e6dvxuSd5PGkOWkYT" +
       "9HEwweeY4LNM8FETfMwEHzXBl9MElJfHlK/KdjmNYZyW2t9PdS1/\n2mue8a" +
       "D8MVSqJBIpIk2oGEpUUlVtFsdjhOVolVAPLA0hhysmIJ3BopgKglj5gI9nDL" +
       "TOnbZOsQ/A\nnQS5OHf4xu+uxGZP0wyjGVFDpXPTIL4HuG0VLSMPbn/oyXX5" +
       "lGi2gIYOSJtvLj0mX3lq5+nXfv3W\nJqc8CGqeV7XzOWnVuc0fMjQZxwHVHP" +
       "Ff/k//B88Wdr7oQQVQygBmRIIUBGRY49aRVX1dNpJRZwFn\n+aRmJCSVvrLh" +
       "p4xMG9qs84Ql0DJ2vxwcUA5XIVyrrfytox/0ZTX9WMHTjfrTtQaGk9cfL2p7" +
       "/cfl\nrzKn2JBaKWDvCCa8QKuccIwaGMPzt74y9OwXLx/7FIuFFQyCivTUhK" +
       "rIaWbfqjyI/YocYOGrq3nu\nSy3HX7eDvcKR3m0Y0kEa6/Rjc6u/+nPp6wAk" +
       "UNCmcgizei1imoqAqQ7bIvt6dnL44WD1yPGLR1v+\n/McLFqAJjdKh+lvsSO" +
       "rME2fnPNTFpdCyJHOXXWKsZdK7PNZGIIws5emTUubPMl7FAWJxBgKhABhU\n" +
       "DZpoi/UpcV9UkyV1oPcb58rnnklFtnNTlgkEA72xdOOFb7fcaGImWBqLBMy0" +
       "fhfPSMYup/rpV5Cg\n+5aGQluD7a2hkDfcTlCxzBs6i1gNQS2LgQuX1SNw+L" +
       "kvtgq+CLIXIfrRdVssDUe8kRBB+SlDta2s\nYBlDTQU+8H29mAxDhpIAF85Y" +
       "De7FsX+0xd/b3MuDUCcOTiJhf/AGbl5x6QNWDK6UyNFFXUqeWfOt\n905fHK" +
       "7h+MJHjfXzur3Iw8cN5r0KPQ1rWLuYBkZ9fvPaFw4Pvz3BV1KdjeB9yVQifO" +
       "IN3HJvhZyj\naeTDQAT1ydYVFkO3QwhdyAldlKD+pYeuI+ANtHUQtAxiB2mT" +
       "hPKD1LajWCtGUXgNcCVEiUEC9cGR\n2R2XNzVc+5oHeRYp2hxjUkZCTD6V33" +
       "zV83JtMwPqggnJ5HXtni/nj49ZUyFzXHkGhJNwpW3wzQHC\norv3CO5u121P" +
       "bF6g6iRd8SW0OFZ9/aOjQ/1Ygoe6rtsyQh0RodrGCBpYesgCgTZvINQGyDDN" +
       "1Jmi\n9Z8WrA87mmO3R3Mo6A20byGoENM3tm94d6CDhq8vLWOdpojdYOhnK7" +
       "v3Up+z5oCYpessEjp/uAet\nbTTUdvNOTHzmX688X9bEmxHlaWBi8t2wksUV" +
       "kx8+dDw0N/KAwovRDQ8u4kM/2f389QvkbQ4umfmA\nalubnm/gHkkYXTpem6" +
       "kq+uGJhAcVj6HlbKMkJckeSU3RPjwGuWr2WA+j0GPE99nbFt7+ujLzT4Mb\n" +
       "nwS17snEARO4z26HzjByF1xr4Kqx6qDGVQd5iPUv7uVm9rkxMzqU6oZGwD4c" +
       "T2dlgJV5M07mBTtd\n3ZY7u/feznPvXv6Bco111DJWz92UwzK7lD0RECNf00" +
       "26MxG2xpak5kHd5NDcbqsNR0Jwv/MWs3xY\nm9CIObp3NHeud7RGgt4IZHrZ" +
       "aP/AiI8tlmqbtVd+GPZE8xdIzULORgUS5y6hNgD/xZcAEgXDfd29\nVK7Mx0" +
       "D6eSArWnRsXGkxrcwdrcfpB0yyZdOE6PQMIMUk9C0kcj1ctZbI2twij1oisx" +
       "BmOEtK3SJS\nxLT4vABIbUz43mx8DDDqdCaM4c7A0oeS9rbWQNgbhEGsggXQ" +
       "WgfV9AVnWfTnY8xNzNQNFiA5mNVg\n4RWk8+qFdvas8R/be7XiqHT+QY8Fbv" +
       "fBcoime1WwVXVwzi1kJ2tZdklXPtD4zrbIyc+6gY4dJ4lA\nl80Wk899/+yf" +
       "wm+8eQTAawwV7xoc6emO9kHyNS6qLiZXzdTfnz+t/ILVo4U5845fspm6spGm" +
       "zMAk\nZSRHs/CmKWvz0wBXo5Uojbk2P4LrF2gXN+0lJwgqIRo/9RGT7ztC8k" +
       "Wcbnhy6QkWCkAf9gZhcqqy\nFW80m7g37L643Kl9ToHYm+NZ7um0KhLZ37fu" +
       "Hg/zgEdc8I+EBW9xFnzqNiw43BoMeenYQcd8KvQT\nouIzguIOR/FLt0UxjB" +
       "3hCJTtjAI7L2fuCN78mKUHbpmgPZz15qn0PTqDy3SKYa+7dc6yDcB6RqMn\n" +
       "tXxCb8sVyw1wbbRiufEOpfp5APopTPpzAnO51SUWMkKM2AUhYp25gFnYa/z2" +
       "JmE0wbXSFB5P4IRm\nHBynx8YpQ8a93YMD9JwLGmqgozXc7t0S/BiUBQ+Ns4" +
       "hcrqRTymZrFZvvkCv/ANseakV228xlDS1M\nv2WN/w5Z8yb0KrAmM0GLsXrH" +
       "iVV7mxOWvxC0ZbGwsLrqngJv22EIbWmNdHg7OiAM1ZkwZFRSmTJt\nxStzFi" +
       "M9Caqb908JfnQur5t7aNMretUv+b7NPt4uiaKSyZSqisOpcF+kG3hSYUss4a" +
       "MqX+8lgjbc\n2hkqlCX9Yj75K2d+n6C1N2Wmcxz9FhmvEFS/CCOool8ix1XY" +
       "IufmALSy7kT6fxJ0VzY9VLPzQyS9\nBkALpPT2ui7mwr+FObsjsz+959aPnI" +
       "exKsEQ/0nYWrOw0txIW1t6e54d0bGs0AOy9DdfLrj/6d//\nl40I9lEU/X8K" +
       "zOQMjv3dSUk9aLItDn1HT5nllGGAYDYiWZEuN7lE/v+TenGkz+hqHt031Oee" +
       "6sOd\nkdswDnbQcTAQhhDScXCpR/Qw/H8kl7PYAiyYYCM+XcqjltL/A1WY5E" +
       "wYHAAA");
}
