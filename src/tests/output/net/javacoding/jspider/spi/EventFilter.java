package net.javacoding.jspider.spi;

import net.javacoding.jspider.api.event.JSpiderEvent;

import et.util.MyUtility;

public interface EventFilter {
    
    public boolean filterEvent(
      net.javacoding.jspider.api.event.JSpiderEvent event);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAI1WbWxTVRg+bbd23Yr7BCYbbAxQFljL5wz0D8s+QkdhdcUo" +
       "ZVhO7z3dLtzee733\ntCuIRCMC+sOEgF8Jakw0JIb4QwL+MUEC+BVJzP6AGo" +
       "0GQzCKwRgjMRh8zzntenvXEZvcc0/Pfd7z\nvuf9eM57+haqtkzULllBus8g" +
       "VrA/HsOmReR+FVvWdlhKSper/bFTWzTdjVxR5FZkiuqjkhWSMcUh\nRQ5FBs" +
       "J5E3UaurpvXNVpYZ8Zu2xccnfyqyPDbR5Un0D1ihanmCpSv65RkqcJFMiQTI" +
       "qYVp8sEzmB\nGjVC5DgxFawq+wGoawnUZCnjGqZZk1ijxNLVHAM2WVmDmFxn" +
       "cTGKApKuWdTMSlQ3LYoaontwDoey\nVFFDUcWi4SjyphWiytZT6CDyRFF1Ws" +
       "XjAJwXLZ4ixHcMDbF1gNcqYKaZxhIpilTtVTTwRIdTYvrE\nS7cAAER9GUIn" +
       "9GlVVRqGBdQkTFKxNh6KU1PRxgFarWdBC0ULZt0UQDUGlvbicZKkqNWJi4lP" +
       "gPJz\ntzARiuY6YXwniNkCR8xs0RrxBv59KfZ3J495lUwkldnvA6FFDqFRki" +
       "Ym0SQiBO9kgyciO7LtboQA\nPNcBFpi+ZR89Fr15vkNg2ipgRlJ7iEST0t3e" +
       "9oVTfT/7PcyMGkO3FJYKZSfnUY0VvoTzBmTzvOkd\n2cdg8eMno5/uePZ98q" +
       "sb1USQV9LVbEaLID/R5P7C3AfzqKIRsTqSTluERlCVype8Ov8P7kgrKmHu\n" +
       "8MLcwHSCz/MGQsgHjwuepUj8HmQDRXMGc0SjQ4oK4Q0aFC3XCB1jCSDpMoR+" +
       "bI9lKDIxx+A1VgbN\ns63rJ10uVqPOClMhHTfrKggmpVPXvzwwuOXFoyJeLM" +
       "cKRlH0ECgLlpQFC8qC8AralCGXi6uZX+48\nFg2ZFc1vH4YbXu6xzrmRJ4H8" +
       "SiaTpTilEig2rKr6JJGTlGdboy2zeUJBNgZSkJigO6nCRrwQwFs5\nE3U5E7" +
       "BUthGYYciqqYP3vv49OXmG5QqLbQvbXZgGkdorbAt0x3cN7z7a5WGgySrm9D" +
       "wvuPlMi9Nx\nQ6z0i/tnUk//dfGt2k6xP5NpL24AypySjA7uPO9ddfXjusvc" +
       "1UXmqLdRTJxQkYeNJVu3m4TA+vev\nx46/cuvITm6osNRDUQ1OwbGxRCk4tk" +
       "g0FHmNbEpVJNtJmiuUSrC15cSr3SevVjzAwtkqnLPTkSf+\nCBzGl3aJOmwq" +
       "D/ygls2sf/sa6d4UkCpklZ/qRo9KckQtmefUtpUzX9HT9Y93/DTUe+oZp6E8" +
       "t0lR\nZrB/a7lYUrrwwfnv1l/79hBYkUC+bSPx/r7oIBjccV91Sakx1/aoZ0" +
       "L53M15l3FYBb4uFwrbjwm0\nbxK4bjTmMLbiz89M2ZipS0SGO6mk97V/Nt8+" +
       "Xr3hrBtVARHDVUQxEAjw+iKn8jLuDBeziakCybq0\nbmawyj4VL49aOmHqk6" +
       "UVTg9z+LwBPFkHzxp4ugrsw9/sYxMbmgWZcHQXH5eJDHSz+cNs6C7kmouN\n" +
       "KyEuzaUM7jNNvI8VW/65qYVvfIbfBE4GbrSU/YRTn2s6mK32YAomF7x/4OT1" +
       "w90/fnOlcDfYeo4S\n6pfkoey5F85P8aD54fbH1rZSQKD7YDMXv5HBp5xzRG" +
       "jYWCsIc4CVFJPsfWQ92NMEilizElTkYFSX\nsBoZeOdC3dSxbO+wsGSODRAZ" +
       "SOY7rrzXfa+TW1BQ6LXdPoX/vhw2t5Uqgr0GKVr9f5l949p1K9eu\n7lm3ga" +
       "Jqwj5wz7dQ1DMLXWOgaw4MDsf5Ct+uPGBs3MSCXmAA9j9MIZO4Ui4A/mizxy" +
       "dmKhk4Vq5w\nfZ9N/LlKvrFiQDim1d4W2oGb19wjS5tv3ubE4IhShR7BoeTY" +
       "ondvnLk+2iJoRTRSS2b0MnYZ0Uzx\n8wQMRmyL76eBoy+tWHz64OgPKXfBDy" +
       "GKfCldVwmG/sHLTV6N8uAcW1gYabfOaGRFuyV1Te1eftFo\n/IKX9XRLVAOZ" +
       "kc6qqo017AziNUySVrgBNaJaRYruhC5v9nuZIg+MPJwJgX8SmtPKeDhWYWbH" +
       "Y4oe\nKMdTVFv6Y4eC8z0AZVNiFLOwgRc+u8SDojbzxn/+4jHqKwwAAA==");
}
