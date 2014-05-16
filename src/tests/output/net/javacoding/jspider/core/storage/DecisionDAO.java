package net.javacoding.jspider.core.storage;

import net.javacoding.jspider.api.model.Decision;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Resource;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public interface DecisionDAO {
    
    public void saveSpiderDecision(
      net.javacoding.jspider.api.model.Resource resource,
      net.javacoding.jspider.api.model.Decision decision);
    
    public void saveParseDecision(
      net.javacoding.jspider.api.model.Resource resource,
      net.javacoding.jspider.api.model.Decision decision);
    
    public net.javacoding.jspider.api.model.Decision findSpiderDecision(
      net.javacoding.jspider.api.model.Resource resource);
    
    public net.javacoding.jspider.api.model.Decision findParseDecision(
      net.javacoding.jspider.api.model.Resource resource);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYe2wURRifu7bXJ5Y+xMYCraDRxt5dS7krUP+g9hFKj7a2" +
       "GqWUHNvdubKwt7vu\nzl0PRCKKoEZNiPhWjImmxhj/0Kj/mKARn5HE9B98RK" +
       "PBEIxiMMZojAa/mdll57bHq2qTnZud+V7z\nfb/vm2/7yilUYltosWxHyA4T" +
       "25GesRHJsrHSo0m2fTMsJeX3S8pHZgZ1I4gCCRRUFYKqE7IdVSQi\nRVUlOt" +
       "DblbNQs2loO6Y0gzhy5khZs/yv6U/3r28sQtXjqFrVx4hEVLnH0AnOkXFUlc" +
       "bpSWzZ3YqC\nlXFUo2OsjGFLlTR1JxAa+jiqtdUpXSIZC9uj2Da0LCWstTMm" +
       "tphOdzGBqmRDt4mVkYlh2QQtTGyT\nslI0Q1QtmlBt0pVAoZSKNcW+He1GRQ" +
       "lUktKkKSBclHBPEWUSo/10HcgrVDDTSkkydlmKt6s6eKLJ\nz3H2xFcPAgGw" +
       "lqYx2WqcVVWsS7CAarlJmqRPRceIpepTQFpiZEALQVeeUygQlZmSvF2awkmC" +
       "Gvx0\nI3wLqMqZWygLQZf7yZgkiNmVvpgJ0RoOVf39wMjvzSzmxQqWNWp/KT" +
       "At9TGN4hS2sC5jzvhHJnJw\nYGNmcRAhIL7cR8xpuq9565bEycNNnKaxAM3w" +
       "5DYsk6T8V3zxktnu78uLqBllpmGrFAp5J2dRHXF2\nunImoHnRWYl0M+Juvj" +
       "P6wca7XsY/BlHZAArJhpZJ6wOoHOtKjzMvhXlC1TFfHU6lbEwGULHGlkIG\n" +
       "ewd3pFQNU3eEYG5KZCub50yEUCk8AXjqEf+rpANBC3qxrNpgQm/3cMQkqF3H" +
       "ZIICQDYUCP3ENttU\nFWxNyIaFJ2wALQRxIo8nR3VUTwcCNFn9qaYBLtcZGk" +
       "hIyjPHP9nVN3j/fTxwFGyOdQRFQWvE0xpx\ntEao1oijNSJoRYEA03dFvjtp" +
       "fBSaRj+91rXw4bD9ZhAVjaNyNZ3OEGlSw5B+kqYZ01hJEoa/GgHr\nDGKAz6" +
       "pJgCoYkdRAEEsN8F/WQsv8kPQSeQBmEuBsdveZz35OTr9O0UOjXU+lc9Mgdt" +
       "u5bVUtY5vX\nb7lvWRElmi6mYcixFLyCavF7sJ8WA1d+evKO3947VNHM5VOe" +
       "xa4AUObnpAXij3tCbcfernyf+dyt\nJdVC0RnDhCOzxrP1ZgtjWP/6iZFHHj" +
       "21fxMzlFtaRFCZNAnHlmRCwLFu6SEoZGYmNVUWTlJXIHki\nDfUHH2t55ljB" +
       "Ayw5V86zerX/tl+q9klHNvPMrM0PfJ+eScee+xy3rK2SC8CrnBhmWMNZrHnm" +
       "+bVt\nYLXQ9XT1rU3f9cdn7vQbWkxBjl2evp4N+WxJ+d1XD38V+/zLvWDFOC" +
       "odGh7r6U70gcFN51WXlGuy\njTcVbVU/CrJKTKtagQqez9QlHhMuAgvDBaRT" +
       "h9GV8txcyI5YhowVuKU8vY//ue70IyWr3wiiYijN\ncDkRCUoKVPqlfuV51b" +
       "TLRRNVBZyVKcNKSxrdcq+TCrLVMqa9FVYnFrD5Qqf+DMKzwKlH7Jdu1tKh\n" +
       "jlcVRr2MjddwBAbp/Fo6tDhYC9CxFeJS5yG427KkHTTZcntmlzz5ofQsVGmo" +
       "lra6E7NiGOSygKlB\nDCav7fwm2PXM8X0t335x1LkthC7Eo/ohuTfz5r2HZ1" +
       "nQyqEfkOwhLyDQj9BZgN3R4FNWc3ho6FjB\nK2cvcTjb4x3tYFAtaKL9S0RV" +
       "IglDlrSB3uffrZw9kImv56YsEAgGepO5pqMvtpxpZiY4GkPCheS8\nl2Yla8" +
       "hLCfrTR9CaSy72a9o7Wjs6w7GVUAig2TEyltN31BPUco4iLplqJG0oWIuMih" +
       "w38vNvEM6/\ngm3002FovtbF4uHODrBOcTYu3jpXVD6u6LiWYtMpVPS9C7ok" +
       "W8riMSbC5YPgNYpoGrHUNMQg67Qf\nb4z/2qacuL6XR7FBbGtFwnUrzuCr60" +
       "6eZmXMh6kCPY5PyYGlL5x4/fhoPS+CvBFcPqcXE3l4M8iO\nVWXSMnzV+TQw" +
       "6iPXX/XK7tFvJoOOO6IEFWcN2n2HmL1tiHktnpfr6+GpdnK9+l/muhsTN40F" +
       "OKUE\nOHV4cJqaH5xirR3xcKxDADsVNigq3C4oXOkp1OarMBYLd64Q8EuFjV" +
       "4YklugmaGQZB83vQLvpkLB\nuAGeGicYNf9RMAKMLCD6Zofgm7jnm53z801n" +
       "68r2cGyVPxgX9g20PLUpwK0vXQVD9wiGxjxD756v\noe3t4XgbQY1ztV5rN/" +
       "N7msW1UGy64KlzYlP3/8XmQeHIq7wjPzS/I69uXdkWjnVeemz2AW6pl/Jw\n" +
       "K9p5ULCz07Pz0fnaCaGJrYYP2TlKfZHJEVQpMNMWuWHOPxL45668bHbLde+Z" +
       "NR+zJursJ2kZXMOp\njKYJPZrYr4VMC6dUdsYy3hvxAz8NFfsiPocIKnVmzC" +
       "lPceZDALrzMEOhpj8ix/MELSrMARqcmUj/\nAkGX5dMTVOG9iKQzBBUBKZ2+" +
       "ZLr38ELWpdEvrghvpHLmP/xEgx7qEQAA");
}
