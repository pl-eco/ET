package net.javacoding.jspider.core.event.impl;

import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.core.event.CoreEventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Folder;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public class URLFoundEvent
extends net.javacoding.jspider.core.event.impl.BaseCoreEventImpl
{

    protected java.net.URL url;
    protected java.net.URL foundURL;
    
    public URLFoundEvent(net.javacoding.jspider.core.SpiderContext context,
                         java.net.URL url, java.net.URL foundURL) {
        super(context);
        this.url = url;
        this.foundURL = foundURL;
    }
    
    public java.net.URL getURL() { return url; }
    
    public java.net.URL getFoundURL() { return foundURL; }
    
    public void accept(
      java.net.URL url,
      net.javacoding.jspider.core.event.CoreEventVisitor visitor) {
        visitor.visit(url, this);
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYa2wbxxFekRIlSrJlPWKrlmzJjppajUiKpKiH9SNh9Khp" +
       "05YsynasMmBOx6V0\n1vHufLekaCc12iaN0/xwETivAk6CFi0MFEGb1k0C9O" +
       "W4Sfo20OpHkrZI0MJBkKJ1kKIoYrQp3Nm9\no255oqXUQgnc3XJ3Zmd2Zr7Z" +
       "2X3uKqoydNQuGn5yQsOGfyQxKegGTo/IgmFMQ1dKfK3KO3l+n6K6\nUEUcua" +
       "Q0QQ1x0QikBSIEpHQgNjpc0FGnpson5mSVWPOsmGX3rR8t/ub03jY3aphBDZ" +
       "KSIAKRxBFV\nIbhAZlB9FmdnsW5E02mcnkGNCsbpBNYlQZZOAqGqzKAmQ5pT" +
       "BJLTsTGFDVXOU8ImI6dhncksdsZR\nvagqBtFzIlF1g6BN8WNCXgjkiCQH4p" +
       "JBhuPIk5GwnDaOo1PIHUdVGVmYA8LN8eIqAmzGwDjtB/Ja\nCdTUM4KIiyyV" +
       "C5ICluhwciyvuGsfEABrdRaTeXVZVKUiQAdqMlWSBWUukCC6pMwBaZWaAykE" +
       "bb3h\npEBUownigjCHUwS1OukmzSGg8jKzUBaCbnGSsZnAZ1sdPuO8NeGp/8" +
       "8jkx92Mp9XprEoU/2rgWm7\ng2kKZ7COFRGbjNdy/sdiR3PtLoSA+BYHsUkT" +
       "/eRLh+LvXewwadrK0EzMHsMiSYkf9bdvW4q+43VT\nNWo01ZBoKJSsnHl10h" +
       "oZLmgQzZuXZ6SD/uLgy1M/O/r5b+G/ulBNDHlEVc5llRjyYiU9YrWroR2X\n" +
       "FGz2TmQyBiYxVCmzLo/K/oM5MpKMqTk80NYEMs/aBQ0hVA1PBTy7kPlrpC/A" +
       "y6Gp+LiaU9JjeawQ\nv0ZQv4JJkoaAqKbB+cljhialsZ4UVR0nMaVKSllNTj" +
       "oYC1RUw2JFBcWsE3EyhOceVYZpUuL5K7+6\nf2zflx82/UdjzlKSoD4Q7bdF" +
       "+y3Rfiraz0T7qWh/iWhUUcGEbik1LfVVmkLqb98b3nTGZ7zoQu4Z\n5JWy2R" +
       "wRZmUMUBRkWV3E6RRhsdjIxT0LN4jV+lkIW9AkJcNEDCZgy7yOdjrD0wZ1DF" +
       "oCxNzSqeu/\nfT+1eIFGEvV8C53dVA38uGDqVt+duGfvvQ/vdFOixUrqIiDt" +
       "Wnv2lPj+I/svvP7rt3bZMCCoawU6\nV3JSdDnVn9RVEache9nTP/mvPR+crR" +
       "p6wYUqAbKQtIgAoQYZYLtTRgnKhosZixoLOOsyqp4VZDpU\nTDO1ZF5XF+0e" +
       "FjgbWHsTGKAOnip4tlpxupm+6GATfTWbYUbt6VgDy4fXHvD0vvGjuteYUYqp" +
       "s4HL\nsQlMTCA22u6Y1jGG/reemjz7+NXTn2W+sJxBkEfLzcqSWGD6bakA3z" +
       "eXSQr+1pbHnug+90bR2c32\n7FFdF05QXxe+sLTtqz8XnoaEAcA1pJOY4dLN" +
       "JLmBqRUXpxwb2W+mGTMp3X/uykPdf/r9ZStxcRui\nTfWX1IO5F790cclFTe" +
       "yFrUkwDhShxbZG2qpg2wW4kYU87fEye9aa6A0SizMY7A+CQk0giW6lfint\n" +
       "j6uiIMdGv3apbunRXP9eU5UNHEFsNFXouPzN7uudTAVLoofLjdb/6rygH7BR" +
       "Tz8hgu64uayzOxTq\nCUV8ff0EVYvmhs081UJQ92rJJMHaIxxHwLTBbs4GIT" +
       "YQpq/hdWnYN+iLRAhy53S5qF09ixCqItDz\nCkQ5BcK2AnetS4HIgK9/iKCa" +
       "DO2HcTrjHcWYpu8e1vZRrLF4REyXnRYJTXnOnD5Oq5RivsjO3vfP\nV56p7T" +
       "Tjn/K0s2lcEEVtfFiXcKXE4yfPhZcSRyQznJz7t4P45E8OPXPtMnmbgdtOSV" +
       "TajsJKBQ8L\nXLYcfD3f6Hn+2awLVc+gTawGExRyWJBzFPozAAtjxOqMQ1jz" +
       "46UVkYm44eWU2+5Mh5xYZzK0Nzto\nlyLQzn8brZzXbOW/Zkf+q0AMMgcZQx" +
       "d7f2o5W3k1XSWgH04XuHCzIuuIHVmRIQe8TVOP3jl06Z2r\n35E+ZBCuZYVo" +
       "lHJYSntZD5dX3Kpm0JKHq7mtmbomNGOYie0rih0IB9cD9KGeYMQXHIQont4T" +
       "S/hh\ncXT2u811noLSauVyqBKWGVETC7GNDHbUk/4xJZflB6H+qJwai44ybJ" +
       "i7DH3HSzzTBk+LxdRS3jMs\n7yU4sPE+mOPQ3csGjnLm6bt584TD1DyhMEEb" +
       "mHl4pM87kD9rL5EpdZuFcjsRtFtJAKJk240qcXaK\nOH333+sfEl69xwRwU2" +
       "kJRi0cefZN3H1nvVim2vMSVfPJsCbZzjJOafvZCaUIqIYjHX8e7z//OWea\n" +
       "obtnO59mStlS4qVvX/xj5M0/PAhazKDqAxOJkWh8DBTuWFVcSmzMtx10z0u/" +
       "YHiwEL/iXFXKNFyK\n81odw7FQmS5Be2dJtbMFnnYrptrLVTucj26QrNfM5P" +
       "dBJTOHiSMav8hFY5+91zxA0GdWC0MiGAvJ\nRVVfSI5iEbonFHM7BcJpGIJo" +
       "7Av2BAd94dCnoawm85JhFe+mBiz6EBNXKDEEXXynZYjO/5MhThNU\nB2qMl8" +
       "HmGc4aEdsaX1nDGgYU13CyTWZxVtVPJOlRP6eLeDQ6EaNnFchcvcGecNAX6a" +
       "XWWDbEOL8V\nl7PGEDxdljW6/jdruKzNl1vck9zi+u3FPbWOjNPfEwr7wr1m" +
       "AmbL4AWe4wQO2AKfXpfAcMgXoaVe\nXoKSUtWLxVRo7XPjCDTZRIdN1rUj5S" +
       "xARhBFrBFnETOpS1moaPPWvcILM//oTb97+6iZA1v5+yqe\ncE/oOu5qfu8D" +
       "s3wprdDLFD8OIY9u/8a7F65MtZh51LzhuXXFJQvPY97ysKXUazST71hNAqN+" +
       "9fYd\nz52aenvWZZngOGyJeZVeq3mYvr0IyooNJX6hp53WFRds5jWQuHPp3l" +
       "2vaI2/ZIfI5auaGjgTZHKy\nzFdDXNuj6TgjMfk1Zm1kBtR3Cbrt490PgNb0" +
       "w7z6vMn8fYJ2rMlMUBX78owvEdS2CiOIoh+e4wcE\nbS7PAYFrtXj6HxO0sZ" +
       "SeoFr7D0/6MmANSGnzksaD7adcaTeoFWEx+DGvU+4SDLyMD5q0aLS0cOVU\n" +
       "QoM8T49/ha//sPLgmd/9m+2HxQMXvRWEApBhMhBVBPmEwappOkbvUMScrsPE" +
       "rHCwfFxnmDOat4Bt\nfP24LKtr+ujk2MoSMrKOBDLQExrwheGYW0lrpJu9cI" +
       "Ja8xPljMMU5itKqrpgCfsvLgb0Ac4WAAA=");
}
