package net.javacoding.jspider.api.model;

public interface Summary {
    
    public int getKnown();
    
    public int getVisited();
    
    public int getNotVisited();
    
    public int getParsed();
    
    public int getIgnoredForFetching();
    
    public int getIgnoredForParsing();
    
    public int getFetchErrors();
    
    public int getParseErrors();
    
    public int getForbidden();
    
    public int getUnvisited();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1XXWxURRSe7rbbbllouy2l9oeWAkpFdokJJNoXmtKGhaVd" +
       "uyCyliyz985uL9y9\n93rvbLsFJRqJoIkmhh818TchaUKQBwn6YoIG8C8+mL" +
       "5ANJoYDCFRDMYYicHgmZm73bu3fw8m22Ru\nZ2fOmfPNOd85M3PuNqqyTNQu" +
       "WSE6aRAr1B+PYdMicr+KLWsXDCWlq1X+2NQOTfegiijyKDJFdVHJ\nCsuY4r" +
       "AihyNbe/Mm6jJ0dTKj6tReZ9Yqj6++N/Htse1tXlSXQHWKFqeYKlK/rlGSpw" +
       "kUyJJsiphW\nnywTOYEaNELkODEVrCqHQFDXEihoKRkN05xJrBFi6eo4Ewxa" +
       "OYOY3GZhMIoCkq5Z1MxJVDctiuqj\nB/A4DueoooajikV7o8iXVogqW8+gI8" +
       "gbRVVpFWdAsDla2EWYrxgeZOMgXqsATDONJVJQqTyoaOCJ\nTrfGzI7X7AAB" +
       "UK3OEjqmz5iq1DAMoKCApGItE45TU9EyIFql58AKRa3zLgpCNQaWDuIMSVLU" +
       "4paL\niSmQ8nO3MBWKlrvF+EoQs1ZXzBzRGvYF/n0l9ncXj3mlTCSV4a8GpZ" +
       "UupRGSJibRJCIU7+ZCJyN7\nc+0ehEB4uUtYyPSt/WR39NalTiHTNofMcOoA" +
       "kWhSure5vWO67xe/l8GoMXRLYVQo2TmPasye6c0b\nwObmmRXZZKgw+dnIF3" +
       "ufP0t+9aCaCPJJuprLahHkJ5rcb/eroR9VNCJGh9Npi9AIqlT5kE/nv8Ed\n" +
       "aUUlzB0+6BuYjvF+3kAIVUOrgNaOxJ+PfSjyx3PZLDYnQwZFD2uEjrLgS7oM" +
       "YR89YBmKTMxRbCij\nWV0m6uiMcJ4tXDdRUcEy1J1fKpBxm66CalKauvHNsw" +
       "M7Xj4uosUYZkOiaB2YCxXNhWxzITAX4uZC\ntjlUUcENrSh1HouGzJLmt496" +
       "61/bYH3sQd4E8ivZbI7ilEog2bCq6hNETlLOtgYHszmhgI2BFBAT\nrCdVWI" +
       "gnAnhr3ETdbgIW0zYCPQysmj5y/7vfkxMXGFdYbJvY6gIaROqgwBboie/bvv" +
       "94t5cJTVQy\np+d5wq1gVtyuG2SpX1g/mzr81+V3a7vE+kynvbAAGHNrsnJw" +
       "90XfxmufLrnKnV2oHHWOEhMnVPCw\noYh1l0kIjP/4ZuzEqdvHnuZABVIvRT" +
       "U4BdvGEgWmzBQainxGLqUqkmMnjXOkSqil6eTpnrevzbmB\njvkynFenY0/9" +
       "EXgJX9kn8jBYGvgBLZfd9N510rMlIM3BKz/VjQ0qGSdqEZ7b2k5e+QqertvT" +
       "+fPg\n5qnn3EBrGbtJQWegf2epWlL6/PylHzZd//4ooEig6qHheH9fdAAAdy" +
       "5oLik1jLc94R1TvvLwustq\n2Bz1ulSp17lNKPsmgeNGYw5jI/78bMrGTF0i" +
       "MpxJRbtv/LPtzomqxy56UCUUYjiKKIYCAnV9pdt4\nSe3sLbCJmQLNJWndzG" +
       "KVTRUOj1o6ZuoTxRFeIJbyfj14cgm0B6DV2NWH/2eTQfZpFOWES3fz71rB\n" +
       "QA/rP8Q+PTbXKtj3EYhLY5HBfaaJJ1my5V+Y7njrS/wO1GSojZZyiPDSh0ry" +
       "zl6Bfbc4JtnvXiB8\nhlC4UExoYKLNGfqYqWShVo/bh8nFxJ8b5ZvrtwqCtj" +
       "gvKU7BbY/eJ2sab93hNPXDjQFbQzNcnX1i\nuYy8vvLMzQs3RpoEycWxvnrW" +
       "yerUEUc730zAYGm2aiELXPrK+lXnjoz8lPLYTghT5IVUhyTncDch\n7qrNJa" +
       "HsYMlhh7L2f4bSHYhFozREUS1E6UkFzk4is5HIXBi7oAVsjIFyY9xD0VLAOK" +
       "QvCrMV2jIb\n5rJyw9wP1RJgihvxvBAfhFZvQ6wvN0QFbokAMZLRdJPIg7o5" +
       "SKg0Bif2vHDXQgvacIPlhgu1tKkE\nLvPtQmg7oTXZaJvKjfYwRcsALXfpgG" +
       "nCk2RBnM02zuZy4zwqcHKeLoKTlaYWG2dLuXG+SlGA+VM3\nUwq8FrUFUbba" +
       "KFvLjfK0QLlbG3fWpjxF1faFm90QW2a9msXbTuqe3r/ustHwNb9DzLy/auAR" +
       "lM6p\nquOK4ryu+AyTpBVuvUZcDcQT4gOKuhZ7BlBUxf/zvbwv9M7AU3R+PT" +
       "jB4OuUn4IX9NzysGu755Q/\nC4QrlYdDp/jDKfohWANR1j0vLo9N8K7ntxP2" +
       "0giJB2Pe+A+PtB+m0BAAAA==");
}
