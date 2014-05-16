package net.javacoding.jspider.core.storage.spi;

import net.javacoding.jspider.api.model.Cookie;

import et.util.MyUtility;

public interface CookieDAOSPI {
    
    public Cookie[] find(int id);
    
    public void save(int id, Cookie[] cookies);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVXW2wUVRg+u9tub4u9Ag0ttLQlUKG7baFV6IOUXmTpQtcu" +
       "KtTiMjtzth06OzPO\nnN0uFxuJ3PTBhIC3iBoTDYkhPkDAB02QAN4iiekLqN" +
       "FoMASjGIgxEIPB/5wz253dXiTaZM6eOfP/\n5799/6UnbqBc00DVouklO3Vs" +
       "ertCQcEwsdSlCKa5GY7C4sXcguDxPlVzIkcAOWWJoOKAaPokgQg+\nWfL5uz" +
       "uSBqrVNWXnsKIR654pt6ypvzv21cENVS5UPIiKZTVEBCKLXZpKcJIMIk8Mxy" +
       "LYMDslCUuD\nqFTFWAphQxYUeRcQauogKjPlYVUgcQObA9jUlAQlLDPjOjaY" +
       "zNRhAHlETTWJEReJZpgElQR2CAnB\nFyey4gvIJukIIHdUxopkPoPGkSuAcq" +
       "OKMAyE8wIpK3zsRl8vPQfyQhnUNKKCiFMsOaOyCp6oyeaY\ntLihDwiANS+G" +
       "yYg2KSpHFeAAlXGVFEEd9oWIIavDQJqrxUEKQQtmvBSI8nVBHBWGcZigymy6" +
       "IP8E\nVAXMLZSFoLnZZOwmiNmCrJjZotXv9vz9YvB2LYt5joRFheqfB0yLsp" +
       "gGcBQbWBUxZ7wT9x71b41X\nOxEC4rlZxJymc8mHjweun63hNFXT0PRHdmCR" +
       "hMW77dULJzp/LnBRNfJ1zZQpFDIsZ1ENWl86kjqg\ned7kjfSjN/Xxk4FPtz" +
       "73Pv7VifL9yC1qSjym+lEBVqUua58H+4CsYn7aH42amPhRjsKO3Bp7B3dE\n" +
       "ZQVTd7hhrwtkhO2TOkIoDx4HPA8g/pdPF4Ie6NK0URl3d/aHgn6vTlC7iskQ" +
       "RYCoSRD7oR2mLkvY\nGBI1Aw+ZgFqI4hCcDWUyJqmk4jGHg6ZsdsIpgM71mg" +
       "LXhMXjV7/c09P3wiEePgo5S0eCVoFob1q0\n1xLtpaK9lmgvnHntopHDwYTO" +
       "z/QsDZVEM+q3kx0lLzWZZ5zINYgK5FgsToSIgiETBUXRxrAUJgyK\npTbYM7" +
       "QBVD0RQC1oElbgIpYl4MqEgeqy0ZnOaT/sBIDcxPi9r38Pj52iQKKBr6C3c9" +
       "UgjKNcN09j\naNuG7YfqXJRoLIdGJMmycT6Vku3GXloXUvfHIrv/PP9WYS2/" +
       "n/JUpy4AYdmctFbced7dfPnjoovM\n8amyUmyrPyFMOEhL07puNjCG8+9fCx" +
       "55+cbBp5iiXFMXQflCBMwWRELAsakqRJBbj0cUWbRZUj5N\nHnkrK46+0njs" +
       "8rQGLJwp/VnpOrjllueAcGEbT9KyzMD3qPFY29tXcONajzgNxgqIpjcpOIGV" +
       "tHrZ\n0jayspjydPGTNT/1th9/NltRJ0U6TvH0dG3MZAuL5z44+13blW/3gR" +
       "aDKG9Tf6irM9ADCtfMKi4s\nliaqHnONyJ87WVGmBW6aYp7J1GE3E3qCgaEX" +
       "qdRh9KQgORWyQUMTsQQNKy331b/W3zySu/q0E+VA\nlYY+RQSoLlD0F2ULzy" +
       "isHSk0UVHAWRTVjJig0E+pzlJIRgxtLH3CisUcti8BTxbBUw9PoVWa2C/9\n" +
       "WEaXcl5aGHUdW5dwBDrpfildGi2sOei6AuJSnkZwp2EIO2myJfdOLHz9M+FN" +
       "KNhQOE15F2Z10cHu\nohWkyh7MoCHHoDQnrN5xevCPZuna8m4OuUr7TGInXN" +
       "96DzeUX7/JgFcAA4JgbppE39QGlSXk8KJ3\nr526OlDBYcu7eP2URmrn4Z2c" +
       "Ocij08RZPJsERn1h+eIT4wM/RKgllM9HkAuSF9KWqduW6Uq6rqXh\nsHKTvn" +
       "cQ2mdUiRYamyOYo6mYfWN9N5ZV337DiZxTnMCmNLpzTNPkJ28IiyddDbecH8" +
       "1rYFjMiQgm\nB3L2dDR1+MmYaZi6RRk4K50FZ2BQpR0DvNVzhfYcu3qg8cdv" +
       "LlnDg83uNNUv4X3xM/vPTrDEndFw\npjXkFes7PD3pWshb6GZica5c1dzCy0" +
       "0FQUtn6IwCNMOYJmHFaom6rqf4V7evbgODykBTOg57Zckb\n0ERB8Xe/c65o" +
       "4nC8fQM3ZY6NwN8dTtZceq/xXi0zwdLYbZtvrPe8hGCkga3Tny0Erbuf0UGO" +
       "6Up6\ndvDDm1df0/rwipa2ppVtDxI0h4zIJuvyFGOIeaA9I4Qt8HisEHr+Z6" +
       "lI4duZJutlh5smRdbAs2QW\nkYxwgEcvaoteK3PLE5kh4ZZspcsIQY/8t1lr" +
       "TUvripUtTaseIihPZF/Mf8/apyFrTSHBE2Wdzhke\nhcOERv9v4tnfjJIEee" +
       "zS6DxQOeUfKD7mi3UT25ed10u/4FmaGsXzAS/RuKLYGpK9Obl1A0dlplM+\n" +
       "bwTcd/GZYZ49AELJgpVZQDgzqF1/H8zgMGtnZ95NUNUszOAj+mPnGId/yKbn" +
       "AAnWzk6/FwbtTHqC\nCtMvdtJ9YByQ0u3+yfwvYf2MzqZeXm6S+j8hsFl1Hw" +
       "8AAA==");
}
