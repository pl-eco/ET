package net.javacoding.jspider.core.storage;

import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Cookie;

import et.util.MyUtility;

public interface CookieDAO {
    
    public Cookie[] find(net.javacoding.jspider.api.model.Site site);
    
    public void save(net.javacoding.jspider.api.model.Site site,
                     Cookie[] cookies);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVXa2wURRyfu2uvvT7sE2hooaUUoYHe9UUt9Au1j1B60LNF" +
       "hVpy7O3OtUv3dtfd\nueuBQDAgCB9MCPiKqDHRkBjiBwj4QRMkgK9IYvoF1G" +
       "g0GIJRDMQYiMHgf2Z2e3vXUhQv2dm52f9r\n/o/ff+bEDZRtGqhKNP1ku45N" +
       "f9dQSDBMLHUpgmluhKWweDHbFzrer2pu5AoitywRVBQUzYAkECEg\nS4G+7o" +
       "6kgWp0Tdk+qmjEkjNNyurFdye+OrCu0oOKhlGRrA4Rgchil6YSnCTDqCCGYx" +
       "FsmJ2ShKVh\nVKJiLA1hQxYUeQcQauowKjXlUVUgcQObg9jUlAQlLDXjOjaY" +
       "TnsxiApETTWJEReJZpgEFQe3CQkh\nECeyEgjKJukIIm9UxopkPot2I08QZU" +
       "cVYRQI5wbtXQSYxEAvXQfyPBnMNKKCiG2WrHFZBU9UZ3JM\n7biuHwiANSeG" +
       "yZg2pSpLFWABlXKTFEEdDQwRQ1ZHgTRbi4MWgubfVygQ5eqCOC6M4jBBFZl0" +
       "If4J\nqHzMLZSFoDmZZEwSxGx+Rswc0RrwFvx9KHS7hsU8S8KiQu3PAaaFGU" +
       "yDOIoNrIqYM96J+4/2bY5X\nuREC4jkZxJymc8mHTwavn63mNJUz0AxEtmGR" +
       "hMW7bVULJjt/9nmoGbm6Zso0FdJ2zqIasr50JHXI\n5rlTEulHv/3xk8FPN+" +
       "95H//qRrl9yCtqSjym9iEfVqUua54D86CsYr46EI2amPShLIUteTX2H9wR\n" +
       "lRVM3eGFuS6QMTZP6gihHHhc8BQh/vPRgaD8Lk0bl3F354BfJyigYjJCwy9q" +
       "EgR+ZJupyxI2RkTN\nwCMmpCyEcMTBkaTyiyZcLlqomWWmQE6u1RTgD4vHr3" +
       "65s6f/4Is8aDTRLMsIagCd/pROv6XTT3X6\nLZ3+KZ3I5WLa5qU7kkZGogX0" +
       "28mO4pcazDNu5BlGPjkWixMhomAoPEFRtAkshQnLvBJHlrPkgsws\niECSgg" +
       "lhBQSxogDPJQxUm5mMqRLug5kAGTa5+97Xv4cnTtG8oXEup9K5aRC1cW5bQf" +
       "3QlnVbX6z1\nUKKJLBqAJCu+eVRLpv96KQzY8mOR5/48/1ZeDZdPeapsAaAs" +
       "k5NCw5293sbLH+dfZB63UaTIATdD\nmPCcLEnZutHAGNa/fy105OUbB55hhn" +
       "JLPQTlChHYtiASAo61QYcgrx6PKLLo2EnZDGXjryg/+kr9\nscszbmDB/aqd" +
       "IdWBTbcK9gsXtvCaLE0PfI8aj618+wquX1MgzpBcPqLpDQpOYCVlXqa29QwF" +
       "bU8X\nPV39U2/b8V2ZhrppimObp6drfTpbWDz3wdnvVl75dh9YMYxyNgwMdX" +
       "UGe8Dg6lnVhcWSROUTnjH5\nczfDYIpnM2B3OlOHc5vQAgwMrUelDqMrvuT0" +
       "lA0Zmogl6E8pva/+tfbmkexVp90oC0AZ2hIRAEwA\n4xdmKk/D0Q47m6gq4M" +
       "yPakZMUOgnu5HkkTFDm0itMJQoZPNi8GQ+PI9ab2S/6cdSOpRxTGHUtWxc\n" +
       "wjPQTedL6VBv5ZqLjisgLmWpDO40DGE7Lbbk85MLXv9MeBPwGXDSlHdgBoMu" +
       "JosiSIUzmBzVeQ/Y\neezq/vofv7lk9QnH+SNF9Ut4X/zMC2cnWdB8cBIQzA" +
       "2pgMBJhM5crDuDTxnm8NDQMY/jZjexOJva\nWhvBoFLQRE8uflnyBzVRUPq6" +
       "3zmXP3k43raOm1LoIOjrDierL71Xf6+GmWBp9DpakfU/JyEYG1Il\nQV89BL" +
       "X/R6Bf3dS0ovmxhpY2Qn1JeGDLCVpyH/AWdNkf0ySs+IeAOj1edFxDY24BAP" +
       "3fQWjvUiWK\nZg6Hs2hSf++b6L+xrOr2G27knsXfMxwcpiSExZOeulvuj+bW" +
       "sYTPiggmD0nmiWv6gSrtnMTMzU9L\n5pJZkpkRPs4DvjEV8JZVuu3CpQ90IY" +
       "+Drus2f2t7ezNj76XDpocLZ1NTQ0s7QYXU7UvNGo4hiIlt\nS9teKzyF1vYK" +
       "/2et2rF3W5jq8E7EUQ5Nqd2JD7O7lhXNLQ0tzVayUjH9TGJoamO18CybZWNO" +
       "y2SH\nZc2sgp5KD0ZLytzxhzO3pbVhZSNBOSJbNh9cMCN0b0ICQ8FUOoEsZM" +
       "gxKP+EdeY9PfxHo3RteTcH\nkArnXcpJuLb5Hq4ru36TddCM8prhYJ2h5PDC" +
       "d6+dujpYzvsvv30snnYBcPLwGwjbSIFOTwCLZtPA\nqC8sX3Ri9+APEbflgA" +
       "A4IKHRK5+X2duIkhCRKbfSg03FtIsfv56ItZNbl53XS77gSGBfIXIBPKNx\n" +
       "RXF0VmeX9eoGjspMdy7vaDw7dsFm/8URFoJrzVg8d3LmPQRVzsIMe6QvJ8de" +
       "uAvOzAEarJmTfj9B\nj6TTE5SX+uMkPUiQB0jp9NAUPBWz3krPyX7e/pL6P/" +
       "MQ4HqaDwAA");
}
