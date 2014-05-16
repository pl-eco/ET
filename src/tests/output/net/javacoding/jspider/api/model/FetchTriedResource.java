package net.javacoding.jspider.api.model;

import java.util.Date;

import et.util.MyUtility;

public interface FetchTriedResource
  extends net.javacoding.jspider.api.model.Resource
{
    
    public int getHttpStatus();
    
    public HTTPHeader[] getHeaders();
    
    public java.util.Date getFetchTime();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1Xe2wURRif3rXX12Hf0EChpYDQAFcKKa8aY9NHWnrQs61R" +
       "askxtzvXLuztrruz\n7YFAMCAgf5gQ8BVRY6IhMcQ/IOAfmiABfEUS039AjU" +
       "aDIRjFQIyBGAx+M7PX29sebYKJl+zc7Mz3\nmu/7fd83e/ImyrNMVCNZIbrD" +
       "IFaorT+CTYvIbSq2rAFYikqX8gojJ3o03YdywsinyBSVhCWrUcYU\nNypyY3" +
       "d7S9JEdYau7hhWderImSRl/YJ7Y18f3DDHj0oGUYmi9VNMFalN1yhJ0kEUTJ" +
       "BEjJhWqywT\neRCVaYTI/cRUsKrsBEJdG0TlljKsYWqbxOojlq6OMsJyyzaI" +
       "yXWmFsMoKOmaRU1borppUVQa3oZH\ncaNNFbUxrFi0JYwCcYWosvUc2oP8YZ" +
       "QXV/EwEM4Mp07RyCU2drJ1IC9SwEwzjiWSYsndrmjgiVov\nx8SJF/YAAbDm" +
       "Jwgd0SdU5WoYFlC5MEnF2nBjPzUVbRhI83QbtFA0+4FCgajAwNJ2PEyiFFV7" +
       "6SJi\nC6gKuVsYC0VVXjIuCWI22xMzV7R6A8F/Dkfu1PGY58pEUpn9+cA0z8" +
       "PUR+LEJJpEBONdO3Sse7Nd\n40MIiKs8xIKmddFHT4VvnKsVNHOy0PTGthGJ" +
       "RqV7q2vmjrf+UuhnZhQYuqUwKGScnEc14uy0JA1A\n88wJiWwzlNr8tO+zzX" +
       "s/IL/5UEE3Cki6aie0blRINLnNmefDPKxoRKz2xuMWod0oV+VLAZ2/gzvi\n" +
       "ikqYOwIwNzAd4fOkgRDKhycHnkokfjPYQFFlJ6HSyICpEJmB1DYlEjIoatYI" +
       "HWI4kHQZEDC0zTIU\nmZhD2FCGErpM1KFsfEmmrmQsJ4flrTfrVIBol66ClK" +
       "h04tpXuzp6XjokYshw5xhK0SrQHEprDjma\nQ6A5xDWHJmtGOTlc56xM77Jw" +
       "ySyrfj/VUvrycuusD/kHUaGSSNgUx1QC2YhVVR8jcpRyOJa5oM8R\nB3ANxg" +
       "C5YEhUBUE8U8Cdoyaq9yI0ndfdMMMAu/E997/5Izp2moGJBb+SSRemQSi3C9" +
       "uCDf1bNmw9\nVO9nRGO5LCpJnpGzmBavFztZbUjJT8Se/+vC20V1Qj7jqUkJ" +
       "AGVeTlYv7u4LrLjySfEl7vdUaSlx\n1aB+QgVQy9K2DpiEwPoPr0eOvnLz4L" +
       "PcUGGpn6ICHINjY4lScGyqElEUMOyYqkiuk1RkyaVQdeWx\nVxuOX/EegMWy" +
       "mqQoO9o2iqQTKbrr+LUDDT99e9lJY1d7SFP9Gt1vn33x3LiP1bVCKNTY2pQC" +
       "GW8U\nbJbDi6cGeGQC2EohB3CRwPEK6nCuW7NyrbCukqKGaeGZAiULwtwHlT" +
       "Fegg8+czt4AF/cIk5Sngne\nDs1ONL9zlTQ8EZSypEkh1Y3lKhklatrFXm0b" +
       "eXlPoaXk6dqfO1ef2O11tp8lq9vZmWxR6fyH575v\nvvrdfrBiEOVv6u1vaw" +
       "13gMG1U6qLSmWjc570jyhf8CDwQp2lKWUytbiPCeExCfRUbWAiPJPTLmLq\n" +
       "EpGh8ab1vvZ3162jeevO+FAuBB/6LcVQJaF5zfMqz2gQLamMYKqAsziumwms" +
       "sq1UhyyiI6Y+ll7h\nOJnB56XgyWJ45sFT4pRY/s82y9lQIaojp67n4yKRRT" +
       "42X8yGBidfcti4DOJSkc7CVtPEO1jBSL4w\nPveNz/Fb0HigAVjKTsLrO8qo" +
       "HY4ENna6Ntl7K0UzhgntotRgFx3bAj1z3PGPmEoCutKo0zbPDP65\nQr6+tF" +
       "2gtNp9HXMTdq28TxZW3LjFsepJuSy92aPkyLz3rp++1lcpkC4uMAsm3SHcPO" +
       "ISw08UNFiu\nzZ9KA6e+uHT+yT19P8Z8jieaKfJDzYJqxc1tRtxfj2XE81F4" +
       "ypx4lv3HeHqjMW2oBigqYqEiGEoM\ni1Oly/scEOxs+8d6bi6pufOmD/mmKH" +
       "ZZLlUTEqLSKf/C276PZy7kOZMbw5ZIOO9tdPJlM+MOyY0u\nzvBf1RT+44TO" +
       "rQG7qu26iWq7dNpq2zUwEBH+MQwoi0VcRlNTc1MzuKsc3MW+BUKKHArrEla7" +
       "2989\nXzx+xF69QaB5houguz2arL38fsP9Ol6wHL8FXJc75z1/FJtpaBvsDz" +
       "re4w91Y1rftGZZU9PyVWsp\nqkhHerFVJypfNkSyClPheLTi/0bkdoqCYKc4" +
       "ipIg7hDSdAhXreAbcTbYD++bddw30Iir3DonvJNC\nySPpKtmOKUFJ+IiZLJ" +
       "DdaqonfQqKDxapfnzrkgtG2ZcC/6mPigIIftxWVVdLcrengGGSuMLPXiBa\n" +
       "gXDEborqpgMuRXn8n59hl+DbC99XD+aDYgWjm34ffBZmp6co35m56Q+AqzLp" +
       "IWHSL27Sl0AbkLLp\n4YlsLOV+ZrfjkLhqJY1/AcGo2KGlDwAA");
}
