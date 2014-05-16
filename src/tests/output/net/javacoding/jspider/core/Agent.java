package net.javacoding.jspider.core;

import net.javacoding.jspider.core.event.CoreEvent;

import et.util.MyUtility;
import net.javacoding.jspider.core.exception.TaskAssignmentException;

import et.util.MyUtility;
import net.javacoding.jspider.core.task.WorkerTask;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public interface Agent {
    
    public void start();
    
    public void flagDone(net.javacoding.jspider.core.task.WorkerTask task);
    
    public net.javacoding.jspider.core.task.WorkerTask getThinkerTask()
          throws net.javacoding.jspider.core.exception.TaskAssignmentException;
    
    public net.javacoding.jspider.core.task.WorkerTask getSpiderTask()
          throws net.javacoding.jspider.core.exception.TaskAssignmentException;
    
    public void scheduleForSpidering(java.net.URL url);
    
    public void scheduleForParsing(java.net.URL url);
    
    public void registerEvent(
      java.net.URL url, net.javacoding.jspider.core.event.CoreEvent event);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAMVYe2wU1Ro/u223D5Zb+kCqBVqKqA3tbulTrBqbtoSFFWqL" +
       "ghWyzs6c3Q6dnRln\nzraLImouV7yaeGPk3uvbaDSoUf6Q+EpIUPEdTUz/8R" +
       "XNvcEYjY9ojNEYDX7fOTOd2W1pa8TY5Mye\nOfO9zu97ndMnvyYltkWWy3aE" +
       "7TGpHekfGZIsmyr9mmTb22ApIb9aUj50aLNuBEkgToKqwkhlXLaj\nisSkqK" +
       "pEYwO9OYs0moa2J60ZzJEzQ8oFq3+ZfPvApvoiUjlKKlV9hElMlfsNndEcGy" +
       "XhDM0kqWX3\nKQpVRkmVTqkyQi1V0tRrgdDQR0m1raZ1iWUtag9T29AmkLDa" +
       "zprU4jrdxTgJy4ZuMysrM8OyGVkS\n3y1NSNEsU7VoXLVZb5yEUirVFPsaso" +
       "8UxUlJSpPSQHhG3N1FlEuMbsB1IK9QwUwrJcnUZSkeV3VA\noqGQY3rHZ28G" +
       "AmAtzVA2ZkyrKtYlWCDVwiRN0tPREWapehpIS4wsaGHkrFMKBaIyU5LHpTRN" +
       "MFJX\nSDckPgFVOYcFWRhZWkjGJYHPzirwmc9bW0PhX28d+rGR+7xYobKG9p" +
       "cC08oCpmGaohbVZSoYf8pG\nDsauzC4PEgLESwuIBU3fmucuj39+rEHQ1M9C" +
       "szW5m8osIf/SvXzFVN+n5UVoRplp2CqGQt7OuVeH\nnC+9OROi+Yxpifgx4n" +
       "58cfi1K298gn4ZJGUxEpINLZvRY6Sc6kq/My+FeVzVqVjdmkrZlMVIscaX\n" +
       "QgZ/BzhSqkYRjhDMTYmN8XnOJISUwgjAuJiIvxp8MFLal6Y6i5iMrNYp24mu" +
       "lw0FnL5zt22qCrV2\nyoZFdzpUOZRXORkIYGIWppUGMbjR0IAnIR868dbewc" +
       "3/vEU4CQPLsYSRVaAn4umJOHoiqCfC9ZBA\ngGtYlg8Woq9gknz1dO+S21vt" +
       "Z4OkaJSUq5lMlklJjUJySZpmTFIlwXh0VfkimQcQRF84CYEIahMa\nCOKBD+" +
       "hMWKSpMOC8NI3BTIIomtp38t1vEpNHMDbQl7UoXZgGnhkXtoWbR3ZtuvqWpi" +
       "IkmixGkHM8\nwZahlkLMNmCqu/Izyet+OP5ARaOQjzzLXQGgrJAT0/+nv4fa" +
       "3ju66FWOslspKn0lZYQyEXdVnq3b\nLEph/eO7hu7899cHruKGCkuLGCmTkr" +
       "BtSWYMgHULCyMhM5vUVNm3k5pZUiNSV3vwP833vTfrBlac\nKqN5NTqw47vw" +
       "zdIru0TeVec7flDPZroefJ82XxKWZwmocmaYrRqdoJpnXqG2S3mlc5Gu3N7w" +
       "/w3d\nh64vNLQUw5q6PIP9l+azJeSXDh/7qOv9D/eDFaOkdMvWkf6++CAY3D" +
       "CnuoRcNVF/WdGY+kaQ11ms\nWbPU53ymXv82ocxbFNqLjoDhSnluZsgOWYZM" +
       "FehBnt7//rzx2ztL1j8TJMVQeKH1MAkKBtTxlYXK\n82plrxtNqAo4F6UMKy" +
       "Np+MltFhVszDImvRVeGRbz+RJAchGMM2EsdaoN/8WP1fioEXWEUzfx5xoR\n" +
       "gUGcn4uPZifWAvhsAb/UeBHcZ1nSHky23E1TK+5+XbofajDUQlu9lvJSR/Ly" +
       "zpGAz0t8H/G9l8ER\ng0kWA/n1fr8PWWoGCvOE0zmeGf2+Tfls7YCIzjr/ic" +
       "RPuLH9JD275vNveYyWw/FAsrdMB+rM9lSg\n5I6Vj3x25MRwrYhw0cNXz2ij" +
       "fh7Rx/lOwibm2Kq5NHDqV9auenLf8CfJoINAlJHiCQMPTiFubxvh\nQHXnOb" +
       "IFRr3jyPo/6EjXDQFOhlW+zg+86K4CkL33nbi5+X8fvOP0ax/qHtUXif3ZZ/" +
       "9xbIonVgHk\n/ESIswA/JUHc874g0gefFaKfXYFlDzl72rvAnmpQhAfIiKpE" +
       "4oYsabGBh15aNHVHtnuTsGSxjyA2\nkMg1vPNo88lGboGjMOQ7ETjvpROS5Q" +
       "WDiT/bGWlZQM+9oL2npb2ntbMdXMUke5xDWMvI2rn6KBJG\nthvWOJy0YDp/" +
       "KmwBEDDlBwyd2xibLRDOgdHkBELTaQqEOZPVjRJ83ya8tdvzVo/pYnHRXFjQ" +
       "nExN\ndEUEoeiz8ayeAWgH3XUuN8nI39KUbRvDVs5B82s1PK0Ckh34MBfowY" +
       "7OlnXrWjvOZ2RZvopz7UZR\n11HartkgXwOj2YG8+S+CfK+3+fU8cjW+DGeE" +
       "xbCdEb7hQsBu8HjO9wC7cYGAda7jgPXAvSdPw/x4\ntcGIOnhFT3Ot8m3v1u" +
       "ntdbR527ttodvraelY39rZzUhR1tLcIA7zDoeRfPlwfP6M3c9IrS2PQcfX\n" +
       "6AbDEiCBylNmbwRGlwNN158HzT0eNOs8aO5dIDRdHS0dUOw6BTTI+a/5oTgI" +
       "t1YfFHjBnwuIHhgX\nOkBceJqACAoyPxCPeUC0e0A8vkAguttaOtp4CkwD4R" +
       "f+lCe8wxN++HcIX9/aBSiXwLlZZwvqKZwS\nLkYWHcTZ/G55GAqERdNwUKMW" +
       "ZxEeyYFWbgheTOpm/HNG/AtBbpq6+rzjZtWb/Og6fc0vg86aymqa\n72TsPy" +
       "WHTIumVK68TJxIBVovMFI/x9ags+IP38TzguMolJ7ZOeDO7Mz89MegfeTTM1" +
       "LhvfhJXwaX\nAilOj093sCU8+fGqGhGnm5z5G4cLmhkBEwAA");
}
