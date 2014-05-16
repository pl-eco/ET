package net.javacoding.jspider.core.storage;

import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;

public interface EMailAddressDAO {
    
    public net.javacoding.jspider.api.model.EMailAddress find(
      java.lang.String address);
    
    public void register(net.javacoding.jspider.api.model.Resource resource,
                         net.javacoding.jspider.api.model.EMailAddress address);
    
    public EMailAddress[] findByResource(
      net.javacoding.jspider.api.model.Resource resource);
    
    public EMailAddressReference[] findReferencesByResource(
      net.javacoding.jspider.api.model.Resource resource);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcxRWfu7PPX0f8kZBYxImdEERcfHu2Y59jLCGM7SiX" +
       "XOKLnYjiOj3mdufs\njfd2t7tz9gXSqBUpgUpFQgktqNAKqW0kBKgihf7RSi" +
       "kC+qUiVf4H2qpVq1SIqk0FqipQRZW+mdm7\nnVtfnJK0lnZudva9eW/e+72P" +
       "8YtXUL3roC7VVehJm7jKxGwGOy7RJgzsukdhKau+Vd+UuXDQtMIo\nlEZhXa" +
       "OoNa26CQ1TnNC1RGpyrOSgHtsyTi4YFvX2WbPL3bd/svKrswe2RlDrHGrVzV" +
       "mKqa5OWCYl\nJTqHYgVSyBHHHdc0os2hdpMQbZY4Ojb0h4DQMudQh6svmJgW" +
       "HeLOENcylhlhh1u0icNllhfTKKZa\npkudokotx6WoLX0CL+NEkepGIq27dC" +
       "yNonmdGJr7BXQaRdKoPm/gBSDcnC6fIsF3TOxj60DerIOa\nTh6rpMxSt6Sb" +
       "YInuIEflxLsOAgGwNhQIXbQqoupMDAuoQ6hkYHMhMUsd3VwA0nqrCFIouu2a" +
       "mwJR\no43VJbxAshR1Buky4hNQNXGzMBaKbg2S8Z3AZ7cFfCZ5azoa+/dXMx" +
       "/1cJ/XaUQ1mP4NwLQ9wDRD\n8sQhpkoE48dF5XzqgWJXGCEgvjVALGjG7/jh" +
       "sfT7l7oFzdYaNNO5E0SlWfWTZNe21fE/N0WYGo22\n5eoMClUn517NeF/GSj" +
       "ageXNlR/ZRKX/8ycxPH/jSC+SvYdSYQlHVMooFM4WaiKlNePMGmKd1k4jV\n" +
       "6XzeJTSF6gy+FLX4O5gjrxuEmSMKcxvTRT4v2QihBnhC8HQg8dfIBorapw5h" +
       "3QBoA3TdyfFpxaZo\n2CR0noFAtTRw//wJ19Y14syrlkPmXQAuOHJ+DV+JyW" +
       "pdCYVY0AZDzgB87rcM2CWrXrj8y1NTBx9/\nTDiQgc7TkqI9IFnxJSueZIVJ" +
       "VjzJSkAyCoW4zC3VpmW+0lhI/e2VsbYn4u5rYRSZQ016oVCkOGcQ\nCEVsGN" +
       "YK0bKUY7Fdwj2HG2A1lgPYgiJZAzbiYQK2XHbQziA8/aBOwQwD5lZPX/3137" +
       "MrFxmSmOc3\nsd2FauDHJaFbrHf2+IEHH9sZYUQrdcwlJR6OW5iUoBX3scRQ" +
       "3r+Qe/ifb3yruUfsz3i6yhuAsCAn\nSxYfPxLtf+fHLW9xu5fzSquUgGYJFS" +
       "ht93U96hAC679/OnPuqStnP8cVFZpGKGrEOTg2VikFw5bT\nEEVRu5gzdFU6" +
       "ycYagaR0bjr/9d5n36l5gG3Xin+eu85+9sPYo/jN4yJKO6odP2UWC8Pffpf0" +
       "3htT\na0CsiVp23CDLxPDVC0o7xPNi2dKt93f/aV/ywheDitYxoJMyz9TEoW" +
       "q2rPr6y5d+N/zub8+AFnOo\n4fD07MR4egoU7l5XXFZtX956JLKo/zzMszLL" +
       "cDWyeTXTmHxMKAoOgWJkMoOxlabSWshmHEslGlQs\nX+43/rX/g3P1o6+GUR" +
       "2kaShUFEN6gay/PSi8KrOOldHERAFnS95yCthgn8qlpZkuOtaKv8JzxS18\n" +
       "3gaWbIEnAU+zl5v4L/vYwYaNIrNw6p18vEMgMMzmd7Kh18NaiI194JeNPoLH" +
       "HQefZMFW+vLqtmd+\nhp+DjA2Z09UfIjwxhvheLIN0ys4UeV5UhVPPXn6094" +
       "+/edurHFJH4lP9JXum+NpXLq1ypzVBb4Dd\nw75DoDdhsxCv12BTnnOEa9jY" +
       "LLLnJPU4B5JDSVCoAySxXkbRNSVtqdhITT7/esvqk8XkAaHKLRJB\najJb6n" +
       "77u71Xe7gKnsSoVJy894Zl7Bz2Q4L9TFF0zw0l/bsH+vv2DMSHhilqwGKde2" +
       "ITtDbcBSyd\nKqKNqPYRG+9lfvaCnr2PUVbBTNGR3CdskpFsMsw/7GPDEYom" +
       "19OYYndpfsVyluZTLDHZEBBk/9FD\n6aOwDmon9/aNjMRHhz8DNYcu6q6iim" +
       "5PWSB0Vhx2dy97CZwYFisKwhnj16hX2NaVgqURo6pYIc6W\nrIL9JDwxD/ax" +
       "m4R92aRhQSZb8bhkxRHfip+/cb8P9g2OxIeGoAjAolV0vP4TjNJ7XaPMyBye" +
       "hpqk\n4V5fQ3IzGg4l48mkj0y237Hro/B+fqYFyBjQ9EMTKGeFjKMXIJaWvZ" +
       "by1bl/9Gvv3TUporFTvqrI\nhPsHr5JdG9//gJejQG6o0bcGhDy5/TvvXbw8" +
       "s0kUM9Hc376mv5Z5RIPPDxOzWTndsZ4ETv3mXTte\nPD3zh1zYM0ICQnHZYj" +
       "eqKNe3vxZ474FngwfeDf8j8JbTsQSNh31oDPf70Dh149AY6hvaE0/2S+Bl\n" +
       "G+auj40iRRtYArjvZAXD0G1JfufVhln1zMrBK7u7PvpmGIXXqQc1rjqVHbLq" +
       "K5FdH4Z/tHkXL8h1\nOeyKkhG8I669Albd7LjiLVWO27KO42TLn5WCcpRXim" +
       "O2bZcXh0f3SBn58Ztxx8BAPDlI0ZZq297p\n9ohGphb4jsDT5p2h7f8HvnMS" +
       "+Ab9056/8dMm+5KD8ZHRTw++r8Htkhmo0n25EgwZwSNVBupZx0Dy\nCZ+TTj" +
       "hgl7N48lOVtopK1fBI+gZ7/mYMBvDYO0DRjmud3gdKCa40gS3YjaZzzf+AxH" +
       "8q1J2rD+5+\nw27/hQix8n8TGqFryhcNQ2qp5fY6Cu1EXufGaxStrLDkBUjM" +
       "/8UNFiqSN+Pm+Z5gfoGireswQz5m\nPzLHSxRtrs0BEryZTP99SF7V9BQ1+y" +
       "8y6UWKIkDKpj+oQELq6ETfW7L/A07fbbulEwAA");
}
