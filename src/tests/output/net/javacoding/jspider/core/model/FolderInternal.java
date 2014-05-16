package net.javacoding.jspider.core.model;

import net.javacoding.jspider.api.model.*;

import et.util.MyUtility;
import net.javacoding.jspider.core.storage.spi.StorageSPI;

import et.util.MyUtility;

public class FolderInternal
  implements net.javacoding.jspider.api.model.Folder
{

    protected net.javacoding.jspider.core.storage.spi.StorageSPI
      storage;
    protected int
      id;
    protected int
      parent;
    protected java.lang.String
      name;
    protected int
      site;
    
    public FolderInternal(net.javacoding.jspider.core.storage.spi.StorageSPI storage,
                          int id,
                          int parent,
                          java.lang.String name,
                          int site) {
        super();
        this.
          storage =
          storage;
        this.
          id =
          id;
        this.
          parent =
          parent;
        this.
          name =
          name;
        this.
          site =
          site;
    }
    
    public int
      getId(
      ) {
        return id;
    }
    
    public int
      getSiteId(
      ) {
        return site;
    }
    
    public void
      setId(
      int id) {
        this.
          id =
          id;
    }
    
    public net.javacoding.jspider.api.model.Site
      getSite(
      ) {
        return storage.
                 getSiteDAO().
                 find(
                 site);
    }
    
    public java.lang.String
      getName(
      ) {
        return name;
    }
    
    public net.javacoding.jspider.api.model.Folder
      getParent(
      ) {
        if (parent ==
              0) {
            return null;
        } else {
            return storage.
                     getFolderDAO().
                     findById(
                     parent);
        }
    }
    
    public Resource[]
      getResources(
      ) {
        return storage.
                 getResourceDAO().
                 findByFolder(
                 this);
    }
    
    public Folder[]
      getFolders(
      ) {
        return storage.
                 getFolderDAO().
                 findSubFolders(
                 this);
    }
    
    public net.javacoding.jspider.api.model.Folder
      getFolder(
      java.lang.String name) {
        Folder[] folders =
          this.
            getFolders();
        for (int i =
               0;
             i <
               folders.
                 length;
             i++) {
            net.javacoding.jspider.api.model.Folder folder =
              folders[i];
            if (folder.
                  getName().
                  equals(
                  name)) {
                return folder;
            }
        }
        return null;
    }
    
    public java.lang.String
      toString(
      ) {
        return "[FOLDER id: " +
        id +
        " name:" +
        name +
        "]";
    }
    
    public int
      hashCode(
      ) {
        return id;
    }
    
    public boolean
      equals(
      java.lang.Object other) {
        if (other instanceof net.javacoding.jspider.core.model.FolderInternal) {
            net.javacoding.jspider.core.model.FolderInternal otherFolder =
              (net.javacoding.jspider.core.model.FolderInternal)
                other;
            if (otherFolder.
                  id ==
                  id) {
                return true;
            }
        }
        return false;
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.4.0";
    final public static long
      jlc$SourceLastModified$jl =
      1051926914000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVZe2wUxxmf89vGYGzAEGzAEFNwsM++O58fuElj2UYcHHBw" +
       "hATX9LLeG9sL69tl\nd84+aIpSJQ1JVEWKSN80UatGSBV9KCipVKpSlFfbFK" +
       "n1HyRNlahVojRRS5S0qqBpWvrNY2/n1mc7\nvcqW5na9+81879/3zez5a6jU" +
       "tlCjavvJCRPb/oF4TLFsnBzQFds+CI8S6oullbFzu1NGEfJFUZGW\nJKgmqt" +
       "rtSYUo7VqyPTLYl7FQk2noJ8Z1g4h1Zq2y/daPp39zeldDMaoZRjVaKk4Uoq" +
       "kDRorgDBlG\n1ZN4chRbdn8yiZPDqDaFcTKOLU3RtZNAaKSGUZ2tjacUkraw" +
       "fQDbhj5FCevstIktxtN5GEXVqpGy\niZVWiWHZBC2PHlWmlPY00fT2qGaTvi" +
       "gqG9OwnrSPo1OoOIpKx3RlHAjro44W7WzF9h30OZBXaSCm\nNaao2JlSckxL" +
       "gSU2eGdkNW7eDQQwtXwSkwkjy6okpcADVMdF0pXUeHucWFpqHEhLjTRwIWjt" +
       "nIsC\nUYWpqMeUcZwgaI2XLsZfAVUlMwudQtAqLxlbCXy21uMzyVv7yqr//W" +
       "jsehPzeUkSqzqVvxwmrfdM\nOoDHsIVTKuYTb6T9T0QOpxuLEALiVR5iTtO/" +
       "+Sd3Rd+9tIHTNOSh2Td6FKskoX7c1bhupv/tymIq\nRoVp2BoNhRzNmVdj4k" +
       "1fxoRors+uSF/6nZe/OPDS4fu/j/9ShCoiqEw19PRkKoIqcSo5IO7L4T6q\n" +
       "pTB/um9szMYkgkp09qjMYP+DOcY0HVNzlMG9qZAJdp8xEULlMHwwhhH/q6Q/" +
       "EIA7DD2JrQgNopSi\n+02CgilMRmgMqEYSvD9y1DY1IBlRDQuPTBpJrI94J2" +
       "Uon5ppn48mrDfddIjNnWxCQj331q/vG9r9\nyMPceTTghIQEdQBbv8vWL9j6" +
       "KVs/Y+vPZYt8PsZwda5NqZOSNJf++kzf8sfa7OeKUPEwqtQmJ9NE\nGdUx5K" +
       "Ci68Y0TiYIC8JaKeBZnEGQVo9CvIIUCR0WYvkBRpyy0CZvXLrZHIE7BYJt5t" +
       "TN376fmL5A\nQ4i6fCVdnYsGDjzGZatuiR/Zde/Dm4op0XQJ9Q2QNi+8ekJ9" +
       "/9E9F66+8sZWN/4Jap6VlrNn0rTy\nih+zDBUnAbbc5b/20c4PzpT2PluESi" +
       "BXAa2IAjEGqb/eyyMnvfocqKLGgplLxgxrUtHpKwdfqsiE\nZUy7T1jQLGX3" +
       "y8EAS2CUwlgtArSW/tCXdfRnBQ8xak+PDgwIbzxQ1vHqz5a8yIziYGaNBK5x" +
       "THgG\n1rruOGhhDM/f+HrszFeunf4s84VwBkFlZnpU19QMk2+1D3y/Ig8a+N" +
       "esfOKrLWdfdZy9wl2937KU\nE9TXmS/OrPvGy8q3ASkgY23tJGYJWco40RK3" +
       "BjtLDg3s4fjC0ei+s2891PLH318RiCVVQpfqvcSD\n6ee+dGmmiJq4EmqSYu" +
       "910orVRHrnY3UC3MhCnj6pZPas4pkbIGJmOBTsBIHqgBOtoX4t6Y8aqqJH\n" +
       "Br9zecnM4+muXVyUpRJBZDCR2XDl6ZabTUwEwbFMAkXxf/mUYu11M55eggT1" +
       "/e9osz3Q3Rrsaevs\nIqjchgiHusK8tJJj15wgImj98Mwf5/fxWAT0bZAdEL" +
       "O0SRB7SlSNZ4f/3pF8Z9sgV3yN3I3IhDuD\nN3Hzinc/YAHocUOe0uRh8vj6" +
       "771z4a0DK3lO8/p966wSKs/hNZx5r9rMgA4b5+PAqF/YtvH8qQNv\njnJN6n" +
       "JRcyiVngw/9RpuubNazQPOxdBlQE7wIKFP72AWb+fxMyjFT5i9CNGfoYK929" +
       "XT1t1LuAyO\na5ez1KIo7edtCRPDyU/628ru2yhusNxCTLhNgoTCt7c27aCt" +
       "loN9k6Of/8fzT1Y18VymcxqzKZoT\nITmzEurxk2dDM/G7NW5Xr6c9xCd/ft" +
       "eTN66QN3mcZOGVctuYmS3gIUVC/p6rU7VlP35qsgiVD6Pl\nrJFUUuSQoqcp" +
       "jA1DitsD4mEUUlR+n9vWcfToy5aPRm+oSWy9wO7GBdznoomL5ctgbBSYjpyr" +
       "hOU+\nxNL/EJvQzH63ZJG30rQMAvLhZMaT4CLcRqRwC3rgipt78M7ey29f+5" +
       "F2nUFSFeuo++kMIXgleyLh\nZLFh2rR3kzYPYqXmfabN86yToCrGNtAZ7uwp" +
       "LLbDPa2BcFsQcK/64M5I3IEkuvwRV9lT0CjO1olK\nIuyJ6lisLXNTguav/B" +
       "JytuTAUP8gXbmHl076uz/HRatgVItJ1fldpNGfe4gD63fMtdQtMJaKpZbm\n" +
       "X0oXS5WZCrQNZN7l1oorcq6zlzPEci5IiPCwpPAIsRefkzzXHSjMc92h1s6e" +
       "tjB4rpJ5zkkDm7gp\nwSApMpdOtLGpETrV5NfphKMTFE7sGoip9SkBYy7SNY" +
       "rGUdL9lKR7wHSgc8scVVGBQih31rSOrJtr\n58VqyOl7Pqx+SHnhSJEA1zuB" +
       "HzHMNh1PYd3FWe8ie9hG04GUmrs3/GlH17kveIG2mu4eZKDNnZZQ\nL//w0h" +
       "/Cr73+IIDnMCrfuy8+0B8dgjzYMC+7hFo71bC/eEL7JUMDgXmztse5k/pyka" +
       "7KwrC7Tx3M\nwbumnN61XmQBcq7e3lVy4hzlasFa9mWCSsdh48dzETGaR3Kk" +
       "aISxTkixbpGkOANOByniEKPzSLJO\n1ADkXD+5JD4e2J+wwH8TjEJ3w/wgY7" +
       "vJZ3wGsmjKoEdCvGvpyCcj9dNmIePmRbLW04Drwlpypp6X\nMrXL7Zl+UBg6" +
       "hbpbA4G2YBjaJMFri93EY9YBgc0LggCdls9KDTBahJVaFslKF7iV9nqw/KeS" +
       "lbpd\nK10szEqdAWalbm4lyitrJYbcc4Vxm1C+bZGUv8QTKsbqoqz+S5L6Pa" +
       "76LxeofpipD411XZZbjgHu\nz2eAZhhhYYDwIhngFeiHQCR6TJq2VGzTbb60" +
       "02JbaYq9D07vvra18fq3ilDRPJvdPOeH2RUS6jPF\nzR8WXaxvZgccJaOKzR" +
       "Hde/A6+1w157iUib0kx1Ar5jGU7NSrklN7szW6ZcH0dKxjmma2nwkEOnvd\n" +
       "uHi9wKY0ROMiBNvpVbITsqGRLyqaYPQKZXsXKSreBDVBIC6vzUhmcoSonUcI" +
       "2eJ/di0e6mCN1v25\nRgx3uEZ8j6BPF2DErmBrsLst1HsbQTVkQrP9ruT57L" +
       "cVxu1C9NsLqo6ygh9KCgZdVf5WWDx0Bejx\nSqhX6mwjC3vrGgcxobMk3D8l" +
       "4QKucB8VLBwEa2cHBzH+emEQWw9jpzD3zkUK1/8QVEEMfjYh6e8r\nlfR3T0" +
       "d8ZQXuQ4IsWUH/WofZwkWMbqeiQv3o4qjvqwL1JxR7YgDkpu/zNoW3wYgJQW" +
       "L/b9j7VkmW\ndXsoX31hlu3pYKeKYNlSg0yIGM49eOIHJwvboha6Tnw8rei2" +
       "tyctHzUMHSsppy0NoAxBy3JloQfJ\na2Z9tOSf1tRNM/dufd6s/RUvX87nr4" +
       "ooqhhL67p8OCPdl5kWHtOYhSv4UQ034GaCNi742QXswa5U\nBV8zn7iVoIZ5" +
       "JgJy0Is8YxtB9flngFHEnUzvB7Pk0gNeu//IpLCjLwZSehuk6O5bmxENhHOC" +
       "Ejex\nqtFj7Mx3L5bsf+x3/2I7wXKVf+KlnzVVu31Kg113ez844ITNTtLoO/" +
       "otSE1btFViO2Fh0CU2X5F/\nxmyQz42yvJoPHo4NzT466gkXGJ6h1lBnWwiW" +
       "KqEHEIV8MTtloVvyWYVJKrKSnR5RmccEo/8C3UJx\nPogfAAA=");
}
