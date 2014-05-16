package net.javacoding.jspider.core.util.html;

import java.io.*;

import et.util.MyUtility;
import java.util.ArrayList;

import et.util.MyUtility;

public class RobotsTXTLineSet
{

    final public static java.lang.String
      USER_AGENT =
      "user-agent:";
    protected java.lang.String
      userAgent;
    protected RobotsTXTLine[]
      lines;
    
    RobotsTXTLineSet(java.lang.String userAgent,
                     RobotsTXTLine[] lines) {
        super();
        this.
          userAgent =
          userAgent;
        this.
          lines =
          lines;
    }
    
    public java.lang.String
      getUserAgent(
      ) {
        return userAgent;
    }
    
    public RobotsTXTLine[]
      getLines(
      ) {
        return lines;
    }
    
    public static net.javacoding.jspider.core.util.html.RobotsTXTLineSet
      findLineSet(
      java.io.InputStream is,
      java.lang.String spiderUserAgent)
          throws java.io.IOException {
        java.io.BufferedReader br =
          new java.io.BufferedReader(
          new java.io.InputStreamReader(
            is));
        return RobotsTXTLineSet.
                 findLineSet(
                 br,
                 spiderUserAgent);
    }
    
    public static net.javacoding.jspider.core.util.html.RobotsTXTLineSet
      findLineSet(
      java.io.BufferedReader br,
      java.lang.String spiderUserAgent)
          throws java.io.IOException {
        java.lang.String userAgent =
          RobotsTXTLineSet.
            findUserAgent(
            br,
            spiderUserAgent);
        if (userAgent ==
              null) {
            return null;
        } else {
            RobotsTXTLine[] lines =
              RobotsTXTLineSet.
                parseRules(
                br);
            return new net.javacoding.jspider.core.util.html.RobotsTXTLineSet(
              userAgent,
              lines);
        }
    }
    
    private static java.lang.String
      findUserAgent(
      java.io.BufferedReader br,
      java.lang.String spiderUserAgent)
          throws java.io.IOException {
        if (spiderUserAgent ==
              null) {
            spiderUserAgent =
              "";
        }
        java.lang.String spiderUserAgentLowerCase =
          spiderUserAgent.
            toLowerCase();
        java.lang.String line =
          br.
            readLine();
        while (line !=
                 null) {
            line =
              line.
                trim();
            if (line.
                  toLowerCase().
                  startsWith(
                  USER_AGENT)) {
                java.lang.String userAgent =
                  line.
                    substring(
                    USER_AGENT.
                      length() +
                      1).
                    trim();
                if (userAgent.
                      equals(
                      "*") ||
                      spiderUserAgentLowerCase.
                        indexOf(
                        userAgent.
                          toLowerCase()) >
                      -1) {
                    return userAgent;
                }
            }
            line =
              br.
                readLine();
        }
        return null;
    }
    
    private static RobotsTXTLine[]
      parseRules(
      java.io.BufferedReader br)
          throws java.io.IOException {
        java.util.ArrayList al =
          new java.util.ArrayList(
          );
        java.lang.String line =
          br.
            readLine();
        while (line !=
                 null &&
                 line.
                   toLowerCase().
                   indexOf(
                   USER_AGENT) ==
                 -1) {
            net.javacoding.jspider.core.util.html.RobotsTXTLine robotsTXTline =
              RobotsTXTLine.
                parse(
                line);
            if (robotsTXTline !=
                  null &&
                  robotsTXTline.
                    getType() ==
                  RobotsTXTLine.
                    ROBOTSTXT_RULE_DISALLOW) {
                al.
                  add(
                  robotsTXTline);
            }
            line =
              br.
                readLine();
        }
        return (RobotsTXTLine[])
                 al.
                   toArray(
                   new net.javacoding.jspider.core.util.html.RobotsTXTLine[al.
                                                                             size()]);
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZe2wcxRmfO9vnZ+JXEhLsYNd1lLj1nR/38DlWFQ7HaZxc" +
       "YmM7L2N0rPfm7E32\ndpfdOfuS0oiqlFBUUVVQaEUKatU2EqpaCipUoiJEgZ" +
       "Y+0oerBvqgpSJ/UEEQ+aNKBFTpN7O7t3N7\nFyf4hKXdW8/ON9833/f7ft/M" +
       "7I8uogpDR62iESBHNWwEhifHBd3AyWFZMIwpaEqIr1RUj5/arahe\n5Ikjr5" +
       "QkqD4uGj1JgQg9UrJndPtQVkftmiofnZNVYo1TMMrWT3+0+LsTu1rKUP00qp" +
       "eUSSIQSRxW\nFYKzZBrVpXF6FutGLJnEyWnUqGCcnMS6JMjSMeioKtOoyZDm" +
       "FIFkdGxMYEOVF2jHJiOjYZ3ptBvj\nqE5UFYPoGZGoukFQQ/ywsCD0ZIgk98" +
       "QlgwzFkS8lYTlp3I2Oo7I4qkjJwhx0XBe3Z9HDRuzZQduh\ne40EZuopQcS2" +
       "SPkRSQFPtLklcjPu3A0dQLQyjcm8mlNVrgjQgJpMk2RBmeuZJLqkzEHXCjUD" +
       "Wgi6\n+ZqDQqcqTRCPCHM4QdB6d79x8xX0qmZuoSIErXV3YyNBzG52xYyL1p" +
       "iv7n8Pjl9uZzEvT2JRpvZX\ngtAtLqEJnMI6VkRsCl7JBB4ZPZRp9SIEnde6" +
       "Opt9Ypue3xd/+3Sb2aelSJ+x2cNYJAnxo0jrxqXY\nheoyakaVphoShULezF" +
       "lUx603Q1kN0LwuNyJ9GbBfvjTxy0P3PoXf8aKqUeQTVTmTVkZRNVaSw9Zz\n" +
       "JTzHJQWbrWOplIHJKCqXWZNPZf+DO1KSjKk7fPCsCWSePWc1hFAlXB644sj8" +
       "q6Y3iPaEOqsSY+rg\nFB19EpOARlBUwWSGokBUkxD/mcOGJiWxPiOqOp6hhs" +
       "/Mk7Q8UyiapfrqFz0emrjutJMBoztVGQZK\niKfe+s09I7u/+oAZRAo8y1KC" +
       "IqA84CgPWMoDVLnpNao84FaOPB6m9qZ8D9OQJWlmvfvMUMNDfuM5\nLyqbRt" +
       "VSOp0hwqyMISMFWVYXcTJBGCQbOfgz1AFk62YBvWBLQoaBWLaASxd01OFGqZ" +
       "Pbo/AkAPSW\njl/943uJxWcpoCgA1tDRTdPA8COmbXVdk3fuuuuBjjLaabGc" +
       "Rgq6dl5/9IT43oN7nj3/2ze2ONlA\nUGdBkhZK0iRzmz+uqyJOAok5wz/2wc" +
       "73H64Y/JkXlUPmAncRAdwNRHCLW0desg3ZxEWdBZK1KVVP\nCzJ9ZbNNDZnX" +
       "1UWnhUFnFXtuAAdQJ1TA1WzBlbYh+rKJ3ppNoFF/uubAaPHKl329r/2i9hXm" +
       "FJtB\n6zmqBbyY+djohGNKxxRHb3xr/OFvXjxxB4uFGQyUZWbd5IGQNxehhM" +
       "D6NY882nXyNTvGzc6gMV0X\njtIQZ7+0tPHbvxK+A3QBaWtIxzDLSi9T4AWh" +
       "9dgecmR4j0kyJiXdc/Kt+7ve/Os5i7a4cuj0+k/i\nvsxzXzm95KWerYbCJB" +
       "h77ZxihZE+eVixgOgxpNOWaubGGjNte4klGRoIBcGgJtBEC2lASgbiqijI\n" +
       "o9u/e6Z26RuZyC7TlFVch9HtiWzbuR90XW1nJlgafRwzWv9XLgj6Xifd6U8f" +
       "QbGVEs7Wvkh3f58/\nOADGZwysx+awQli01kBxZXGgmRwwCxnFC+c/Fhzqvv" +
       "sWd1/c0nr5cS/yLuO+ImUpN0JCfKas85L3\nhXWdLFPKZwXD9LC7nheW67wq" +
       "zCJRm8uCzXCFbPQXyQLW0aLdz3HxC2m2D4IrYFNNAxquYWP19QcH\nBtlY/f" +
       "QWKzFUwUF/BHBWQcuWYWcVvX+WPXfT6VkpR//vsLpQrnWXkx3UqzZRpWe/8N" +
       "+zT9S0mxlI\nZVrZMGUQ8RY+sfKkEuLdx04GlyYPSCag3esHV+djL+574so5" +
       "8k/GKg4XUm2fyhYauF/gaDp6fqHR\n9/STaS+qnEYNbA0oKGS/IGeoc6YBFs" +
       "aw1RiHxOLf56/IzJwfynF9q5uHObVuFnbqLDznc4BDvOvh\nisJVa0Gu1gU5" +
       "j4egWppqfoHm2lbaOs6kO9l9s8mZZRDllKQIYKJPy8zKkggPBltYZwFc+yZH" +
       "JhKx\nz4/sneIhfIiDcK+LgsxgbL918MyFiz+RLjOaqWGpFaMS1rSqWQuXvG" +
       "WqZtBFGbcrsEbqHNOMIaY2\n6KA9FIyUAvFIpDsMEB8kaP/KVjEBxzGbjXYi" +
       "6HOYtHON1NzpPP8dh0VloZvo5KwAoiYG7tUOGY4o\nmTT/ErK9fGIktp0OPm" +
       "AWVnrfncPEarja4FplCa1yYwIxIk8VwgDAUq3pKgHM4mS2gKStuMtc3PvY\n" +
       "izu4kPSWVCD6+7v7wv7+EEGrp3aOTgZyBlA1ad4i2pBc1ged1i+yfwt9wPrP" +
       "2xTH/hvMG6NlmTF4\nn2Q5n/Szobe5eDla6KlgSZ6KME8BP9cwT7EZUBXH7O" +
       "nkPFSfLRJq+rzfZmyH1FvtNZSONl5rV8d2\npCcOXqq7X3j5TpOMm/LX8RSz" +
       "4Sdfx1231olFNg3VRNX8Ml7AslMx3Nr2sDprk2P9gbZ/74ic+qK7\nZPjo1o" +
       "UvGfliCfHMj0//Pfz63+4DK6ZR5d6xyeFYfAQMbltWXUJsXGi5vWxeepUxl8" +
       "XeBXv0fKGh\nfM6u0THJ6MpUHnO359BFmboDrrUWutYWWzLT273LFt7rVuWv" +
       "E1QHtLSvWCY/yqE27KwbHiNo23K4\n1DMynpHSGofLCWgCUIaD3cGwPzzwGY" +
       "LWyBZUeeUsX82s+1qeJ+jSaYPliQ2fkCceJ6gKjIkXSfVa\nq5ReywTead/n" +
       "nBYplurRXseVP1y5K0Pd/YP+EHVlA+dKZr3bg1AW0EG4NlrmbyzmwUIO8DIO" +
       "oLcD\nxb1n73e42T/NzT7qzPOnJVHZYHcI6jDQoVcy7KWwuS2T1MCoomUI7A" +
       "iwkOYNeZ4zhFvz/rxEQyJh\nfxS2J/WmTD5wizvJYx0BcLa96NgW7tUKZzQ2" +
       "khWxRvdZrPtTsEaD1VfSMoQf6Sw3ywFnli+vGFah\nAZqhA1GA1W0rXPRwpj" +
       "JgFUPjIYvdkP37yaDx95yjOQL7QykgCIa6QwP+CCxBvLO6Hbt1duxuy6To\n" +
       "yUlyAgswHG/LXzhbIo4t50u0JRLxR6OlAvIfnG0DjLNeYu2vXht5/+JEQs50" +
       "3ixxOn1RfxQW3Gs4\nrbB0NktlUTTRI6V9cHVbaOq+QTQRVKnp0oJA8MeD1D" +
       "vOvCP9zrzfLWXeIYBUvz88yCBFR/szr/F9\nTmPQ0XipRI2RPn80WCpwLnO2" +
       "hTjgXCBoFQ1h0WXFB5xQnzOhD0ucUN+gPxqGVMzTmweegqUFBc8w\nXNss8G" +
       "z7GFT09jK4KfSUp4KbtFOPPL6SNqjB7lDUHwk7uLlhc+occwZ6ucBdhYWKRj" +
       "+p0XrgXgZR\nd7Uv4y5eQSM332jRZZCTPZ7mEr0AoY9AVW52LM/FnW69GtxS" +
       "9Fx3fcGHRPNzl9ixdNeWs1rjr82z\nP/uTVFUcVaUyssyfunDPPk3HKYm5sM" +
       "o8gzHdsIGgTTdUR2HXTn+oTzzrTdlWgtqvJwti9IcXayOo\nZRkxkKA/vEQH" +
       "ZE1xCWBJ64nvvwm23/n9Ia7OP3zXLQSVKWwh4OnKrXS4o1zzBCxrneXa5x6T" +
       "GhYl\nekad/d4L5bc/9KcP2TarUjQ/4tIPl6LRsyAZEumJKYJ81GAHbvQd/b" +
       "4jZnQdUp/tR63w1BrmiOaH\nyhb+ACmnq3Pq0PhI4RlSb3/p2/A+SNFyug1f" +
       "+Rex4zraUMxDzGorH9n5D7VftNT9H0u02jl2HwAA\n");
}
