package net.javacoding.jspider.core.storage.memory;

import net.javacoding.jspider.core.storage.spi.*;

import et.util.MyUtility;

class InMemoryStorageImpl
  implements net.javacoding.jspider.core.storage.spi.StorageSPI
{

    protected net.javacoding.jspider.core.storage.spi.SiteDAOSPI siteDAO;
    protected net.javacoding.jspider.core.storage.spi.ResourceDAOSPI
      resourceDAO;
    protected net.javacoding.jspider.core.storage.spi.ContentDAOSPI contentDAO;
    protected net.javacoding.jspider.core.storage.spi.DecisionDAOSPI
      decisionDAO;
    protected net.javacoding.jspider.core.storage.spi.CookieDAOSPI cookieDAO;
    protected net.javacoding.jspider.core.storage.spi.EMailAddressDAOSPI
      emailAddressDAO;
    protected net.javacoding.jspider.core.storage.spi.FolderDAOSPI folderDAO;
    
    public InMemoryStorageImpl() {
        super();
        siteDAO =
          new net.javacoding.jspider.core.storage.memory.SiteDAOImpl(this);
        resourceDAO =
          new net.javacoding.jspider.core.storage.memory.ResourceDAOImpl(this);
        contentDAO =
          new net.javacoding.jspider.core.storage.memory.ContentDAOImpl(this);
        decisionDAO =
          new net.javacoding.jspider.core.storage.memory.DecisionDAOImpl(this);
        cookieDAO =
          new net.javacoding.jspider.core.storage.memory.CookieDAOImpl(this);
        emailAddressDAO =
          new net.javacoding.jspider.core.storage.memory.EMailAddressDAOImpl(
            this);
        folderDAO =
          new net.javacoding.jspider.core.storage.memory.FolderDAOImpl(this);
    }
    
    public net.javacoding.jspider.core.storage.spi.FolderDAOSPI getFolderDAO() {
        return folderDAO;
    }
    
    public net.javacoding.jspider.core.storage.spi.SiteDAOSPI getSiteDAO() {
        return siteDAO;
    }
    
    public net.javacoding.jspider.core.storage.spi.ResourceDAOSPI
      getResourceDAO() {
        return resourceDAO;
    }
    
    public net.javacoding.jspider.core.storage.spi.ContentDAOSPI getContentDAO(
      ) {
        return contentDAO;
    }
    
    public net.javacoding.jspider.core.storage.spi.DecisionDAOSPI
      getDecisionDAO() {
        return decisionDAO;
    }
    
    public net.javacoding.jspider.core.storage.spi.CookieDAOSPI getCookieDAO() {
        return cookieDAO;
    }
    
    public net.javacoding.jspider.core.storage.spi.EMailAddressDAOSPI
      getEMailAddressDAO() {
        return emailAddressDAO;
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALWZe2wcRxnA5+zz+R0/86B2ajd1m7iKzzmfz4ljQDFnW7nk" +
       "HLu+JCXG5brem3M2\n2du97s7Z51CiQtukVChSaYEihVQgoUgVL1EaJECEUF" +
       "qeQeA/+kKtQC2IVyqKBI2gpXwzO+ed3ds4\npj1b2r3x7Mx83/6+b775Zvar" +
       "V1CFaaB22QySxSw2g9HEpGSYOBVVJdM8CFVJ+ZmK6snz+zW9DPni\nqExJEd" +
       "QQl83elESkXiXVGxsZyhuoM6uri3OqTvg4RaPsvvmthV+e3tdWjhqmUYOiJY" +
       "hEFDmqawTn\nyTSqy+DMLDbM4VQKp6ZRk4ZxKoENRVKVE9BQ16ZRs6nMaRLJ" +
       "GdicwqauztOGzWYuiw0ms1AZR3Wy\nrpnEyMlEN0yCGuPHpHmpN0cUtTeumG" +
       "QojgJpBasp8250EpXHUUValeag4YZ44S162Yi9Y7Qemtco\noKaRlmRc6OI/" +
       "rmhAosPdY/mNu/ZDA+hamcHkqL4syq9JUIGaLZVUSZvrTRBD0eagaYWeAykE" +
       "3XDN\nQaFRVVaSj0tzOEnQJne7SesRtKpmWGgXgta7m7GRwGY3uGwmWGsiUP" +
       "f2Q5NvdjKb+1NYVqn+ldDp\nRlenKZzGBtZkbHW8mgs+GjuSay9DCBqvdzW2" +
       "2gzf8p1D8T9d7LDatHm0mZg9hmWSlN8aaN+8NPxa\ndTlVoyqrmwp1BcebM6" +
       "tO8idD+Sx484blEenDYOHhD6eePXLvE/ivZagqhgKyruYyWgxVYy0V5eVK\n" +
       "KMcVDVu1E+m0iUkM+VVWFdDZ/4AjraiY4ghAOSuRo6yczyLrzwfXB3i5nt7A" +
       "AjFtHGd0YzEBDgkG\nimWyajBL0B4NkxnqCLKeAheYOWZmlRQ2ZmTdwDOm1X" +
       "Ymw3rOeA6Rp6IbFnw+OofdM1AFd92rqzBg\nUj7/6s/vGd3/qQcte1If5EoT" +
       "9EFQImgrEeRKBKkSQa5E0FIi6KEE8vmY+I1O6NSKKTrZ/vatocYz\nPeaFMl" +
       "Q+jaqVTCZHpFkVwySVVFVfwKkkYV7aJMwI5ojgxXWz4NCgU1KFgdgEAsrzBt" +
       "ridlx7useg\nJIE3Lp1859evJxeepD5GfaKVjm6pBhY+bulW1524c99dD24p" +
       "p40W/NR40LTr+qMn5dcfGn/yuV+8\nvM2eIAR1Fc3b4p503rnVnzR0Gacgrt" +
       "nDf/7fe//+SMXgU2XID5MZwhmRwAkhNtzoluGYf0OFWEZh\nQc/atG5kJJU+" +
       "KgSgGnLU0BfsGuZC9azcCABq4aqAq4N78EZ6ow+b6a3FcjjK0/UOLFJevS+w" +
       "4/nv\n1z7DoBSCaoMQfROYWFO0yTbHQQNjqH/5sclHPnvl9EeYLbgxCApkc7" +
       "OqIueZfht9YPsWj3AR3NT6\n6Oe6zz5fMHaLPfqwYUiL1Nb5Tyxt/sJPpC9C" +
       "KIEpbSonsDVjmSRUEEDv21m5R3hI/9/Cm1D/c0+1\nMbqYFIyXmf3YP58+V9" +
       "NpKUP7tLNhKkGxNlzoMhodd/RKynefOBteStyhWFHRHWZdjU/84NC5q5fJ\n" +
       "K4y07R9U2k35YgUPS4Lr7npuvinwzcczZahyGjWypVLSyGFJzVE7TMNiZ0Z5" +
       "ZRzVO547Fy4rSg8t\n+3+72zcFsW7PtGMQlGlrWq52OeM6uG6Cq4E7Y4PLGX" +
       "0oSwu7WYcudt+67DrVWUMnoB9O5QnAVwge\nGZ4AG2wSbWC9grUs3XP21VPd" +
       "v3vxMl+6hJTIbvXn5P25Cw9cXCqjU6kakhPJPGC/CCRHtORjCQOY\nI+l8sR" +
       "orXn+I8J7hcCgCCjWDJJpMBZUUN/PInsFLr135hvImE1PDcpVh2oPLqWY1gu" +
       "ByPWvSVVFI\ny/hIXRNZk8acekFIbCSZ77j8le53Otn4XOuAsMLy/yvnJeOA" +
       "uFbUML1D/TsHIwTF3uvqtTu8a3so\n0tPXR1Ddwb2xRJAbiYqL2jY7CSt6MS" +
       "L6YtwtUDOz2Do266lnBke1XEZ8CKr7p0aHRxjAVoL6VrPm\nQV0wYamQmIxZ" +
       "gY/eIw7/7IarkYtq9PbPKXp7P0G1kLnqOUNmjkjr9lgOcUhwiAH2YEREvbMU" +
       "qPv7\nGOoByIYZakEVKvCwUztadaAAa2C1sKbsAVYAthWuJg6syRvYRzmwGh" +
       "rYsEZcvCSB185iXoMl4TXA\neIGbNzBetiZU3qxDNwetyGppRZf7X8e7mm1H" +
       "9oJ1rOBdEIQVEyavi1ZGoLXLTWvXjlApaEV2OL1L\nUIUK1JzavTvvGrEHWA" +
       "HYLXC1cGAt3sDmOTBYNvXjinsyLgq4BotxhUuCq5/h6idoHXcurggVd0LU\n" +
       "zIGqf/WuxbuvACoEVysH1eoN6pMcVAPOSIoKO3OIEKYL1wM2rr4dxbhKskxE" +
       "2DIR3kFQK8PlUocK\nPVWspQPd7tWiGx13DHIdT1vPAa73Bnim4Glptg1zoX" +
       "tYQBcqDmMl8bSwy9OWFaHiPiNq9u48bazQ\nvQAqX5yLFZJrZCfX7XyzJdA4" +
       "J8y7/uz/v1BbZVAjDynV5mudbLBTmdMffqPulPTjO61Er9m5caWp\nQ+TxF3" +
       "D3njrZY7dcTfRsj4rnsWpvB9zSxtmJTyHzbbij4/djA+c/7rUfaBdzUWe3pH" +
       "zp6xd/G3nh\npftBi2lUeWAiER2Oj4LCHSuKS8pN8223lx9VfsqSO56aF51T" +
       "OTsNORPyGgOTnKEddGSvnY494q08\nNUeFX/cekd5uXXFXdd0t19cgL5zDZM" +
       "xr8nxbmDyDriQ6rsuSGhv50qXapYdzA/vK+HBj9PZUSWZV\neHso1BPeRdB6" +
       "Ub+tZqcFjgp6DDF1n3BQ28LjBir8rgG170IQAa145ioyu2QzC1ux+gK9/agk" +
       "SHYy\nJBBoWmzhDiCTXkBu4zkOKvyuAZBnIfiBTlPeyfdlAUrIhvKrkiSRIQ" +
       "qlH/Y3G50KOMDMeIHZBlcP\nB9OzRmCWCKoHvaKeSfaLApc+m8tLJeESYVxg" +
       "Qd/gkO/AcvRa/hLiWEJrhOUVy19GvNPpPwhcwjaX\nP5aEy6DoL4ICDjDECw" +
       "yNxxEOJrJGYP5ixeOoV9r8hoCl38byj5Lkf45wuyzeAeVeLyh9cA1yKINr\n" +
       "BOVfBDWDVq68UUTztoAmYqP5b0nQsLAbgZnUVqyEA9CnUR5is8co9MB0U9HX" +
       "O+sbk7xl6a5tT2eb\nfsbOoZe/A1XFUVU6p6riGZ5QDmQNnFbYu1dZJ3oMhM" +
       "9P0G2r/9hAUMAqUGS+cmuISoJuXsUQ9PDI\nKomda4DSCp0J8tMfsUc9RCjv" +
       "HiCBl8T2jRA6nO1hMbb/EZu2EFQOTWmxdTndbbSPsKwzR5rMtgqp\nTSILQY" +
       "EmN/kvf89/+5nf/IcleZWy9RmVfjqUzd55CBukd1iT1EWTneXSZ/RzipwzDI" +
       "i0LBvmtqo1\nrRGtT4Vt4gnisqyug0cmR4esHErc3PWXbnMXgo2in+5Q3vsH" +
       "qZMGep8XMfYWPBiwQ0H6PuNc7P8A\nkdGb7ggfAAA=");
}
