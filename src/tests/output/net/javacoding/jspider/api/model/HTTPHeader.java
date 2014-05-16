package net.javacoding.jspider.api.model;

public class HTTPHeader {

    protected java.lang.String name;
    protected java.lang.String value;
    
    public HTTPHeader(java.lang.String name, java.lang.String value) {
        super();
        this.name = name;
        this.value = value;
    }
    
    public java.lang.String getName() { return name; }
    
    public java.lang.String getValue() { return value; }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYb2wcxRWfO9t3PtvEf2LAjZ3YBEOwiO98duw4uS9YtiNf" +
       "cokvPidpDkeX8e6c\ns8ne7mZ37nwJaURVSlKkRkIEaGkKAglFQggQiPAB1D" +
       "SiQAtEAn/gr0Ag+NCqDWo/VEQtFX0zs3e7\nt740MlIj7Xpu5715f3/vvcmz" +
       "V1CdZaIuyQrTYwaxwuOpJDYtIo+r2LJm4VNGeqMulDy/Q9P9yJdA\nfkWmqD" +
       "khWREZUxxR5Eh8IlY0UY+hq8cWVJ3a5yw7Zeut3y2+e2p7Zw1qTqNmRUtRTB" +
       "VpXNcoKdI0\nasqR3DwxrTFZJnIatWqEyCliKlhVjgOhrqVRm6UsaJjmTWLN" +
       "EEtXC4ywzcobxOQySx8TqEnSNYua\neYnqpkVRS+IwLuBInipqJKFYNJZAga" +
       "xCVNk6ik6imgSqy6p4AQhvSpSsiPATI9vYdyBvUEBNM4sl\nUmKpPaJo4Ilu" +
       "L0fZ4t4dQACswRyhh/SyqFoNwwfUJlRSsbYQSVFT0RaAtE7PgxSK1lzzUCCq" +
       "N7B0\nBC+QDEUdXrqk2AKqEHcLY6HoRi8ZPwlitsYTM1e0pgNN/3kg+W0Pj3" +
       "mtTCSV6R8EpnUephmSJSbR\nJCIYr+bDZ+P7811+hID4Rg+xoBm77ZU9iT9f" +
       "7BY0nVVopucPE4lmpO9GutYujX0dqmFq1Bu6pbBU\nqLCcRzVp78SKBmTzTe" +
       "UT2Wa4tPn7mTf33/sM+asf1cdRQNLVfE6LoxDR5HF7HYR1QtGI+DqdzVqE\n" +
       "xlGtyj8FdP4b3JFVVMLcEYC1gekhvi4aCKEgPD54OpD4F2AvipqmZmeTUwTL" +
       "xAwbFPVrhM6x+Eu6\nDJGfO2wZCmzNYUOZy+kyUefc9EV2fPOiz8dw6kWZCi" +
       "k5patAmJHOf/X2ickdvzgtYsbyzFaMojtB\nYtiRGLYlhkFimEsMOxKRz8dl" +
       "3VzpRRYWmaHnby/GWs70Wxf8qCaNQkoul6d4XiWAOqyq+iKRM5Sn\nXasrxX" +
       "lmQVo2zUOGggIZFQ7iiAC3FUy03puJDn7jsMKQXksnv3/vm8ziSyxpWJDb2e" +
       "lCNQjZEaFb\nU1/qwPaDp9fXMKLFWhYNIO29/ukZ6ZsHdr70wTuf3eFkPEW9" +
       "y4C4nJMByat+0tQlIkOhco5/9F9T\nf3+obsvLflQL6IT6RDFkFYB9nVdGBa" +
       "BipeLEnAWcjVndzGGVbZUqSgM9ZOqLzheeLzfwdQs4oBGe\nOnhW2SnJfiO2" +
       "2cZeq0V2MX96bOCl7+rPAgMfvtb4BndKqUo2u8ppilCBuVYnHLMmIfD9s18l" +
       "H3r4\nyqm7eSzsYFAUMPLzqiIVuX43+yD2q6vgP9zRfvaRvnMfloK92jl9zD" +
       "TxMRbr4k+X1v76LfxbqA2A\nUUs5TjgE/VySH5g6SOnIyfGdoqKI+nPi3Ff3" +
       "933x8WW7Rrl6n0P1l8x9+Qs/v7jkZy4OQRfC1q4S\nongXZCsf7wwQRp7y7E" +
       "uI+7NBgDZKbc6h0U0DoFAbSGJdM6zI4YQuYTU+8eSlxqUH8yPbhSo3uAji\n" +
       "E5li9+Wn+77v4SrYEgOuMmj/DhawucsBO/szSNHIimrM1mh04+Cm/qFhKgoH" +
       "j047dE7udwbhsOhS\nfCMizNvqMi/KN4bYK/ZDhA9t7t+0haK6Albz3JLRUo" +
       "aw90a+7meZy6OLuPz1NgkrIN7CuI219xL6\ncvP3/PP1xxt6RDYxnq5yknS6" +
       "k6SCKyMdPX5uaCm1TxHB8TY+D/Hx3+15/Opl+jmHigNwJu2W4nIF\n92JX7R" +
       "n9oNAaeOGJnB8F06iFDy9Yo3uZLwBIaUgya9z+mIAkce9XjhIif2PlAtblLS" +
       "4usd7S4nQM\nWFfms1NNWBVZA0+9XU3qPdXEh3gCbucMvfy9oYz9kGHqFPQj" +
       "ctGdZ3Y6JZ10Ghr1oEX4euKuLZe+\nvvK88i1HRAMf4cYYh611iH9xwbRGNy" +
       "w2LLimVfuk3mnDinGxmyhq4GKjA9HR4ZXn7uaN0eH+KORu\naHYqngqXnLjb" +
       "tvAkjCPLDWHibQ+iNp5dqxykTWr5nHsT+nftzOTYBIeFKNfsPVkRlE54QjZT" +
       "qHpQ\nDrBXogQyt+sPuly/hW/MuL2yecVeGYwyrwwOwCncK2VYYzfG73Ys4m" +
       "rcbuPZgXyXDXdIh7XXGlb5\noH3qx/9ouh//4YCAalvl6MIcOvzER6Tvriap" +
       "ynAUorrRr5ICUZ164pW2kw/xJeg07+v+ctvI+Z9U\nKyhd7oJSyZaRLj138d" +
       "Phjz65D7RIo+Cu6dT4WGISFO7+n+IyUmuhc3fNIeWPPPFtbC+7elQyxSoR\n" +
       "3WASuDlpsxW47qmYEtbC02KnUEu1KcEVo2uU5evWbEpRcIHQXR7s3+NqJYNO" +
       "KzmxcjiObIxG+wcB\nji22mA1WjzCdJxvihx+tsHsdPO223e3/J7vvpageFN" +
       "rrRd4pl+FDjuGnV464AWb4ECCutSTHYznU\n3AaHhU1VHcvu7OJmKa1fOnjH" +
       "60brn/iwWr791cPskc2rqrtPuNYBwyRZhVtVL7qGMPEMRT3Xu35A\nVeB/uQ" +
       "d+KfgehIvwtfkoqoG3m/4s3N+r00PO2Ss3/aMUraqkBwc5P9ykj4E0IGXL3x" +
       "hVZiPRdlmV\nanfV+pRBJIUNecWnXq3dfeb9f3P0BiXxXx7smg99qaDAMBcZ" +
       "07B6zOJdnu2xm5KUN+EWQHmZsz3c\naIkTxbW+093WyrJ6Z/cnJ6t0tpEfWM" +
       "OjbCRkNXyFt0joez+q5guun7u7MU3Ttoz/ApOJkCaOEgAA\n");
}
