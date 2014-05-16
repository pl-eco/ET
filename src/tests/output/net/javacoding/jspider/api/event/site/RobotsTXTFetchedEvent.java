package net.javacoding.jspider.api.event.site;

import net.javacoding.jspider.api.event.EventVisitor;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;

public class RobotsTXTFetchedEvent
extends net.javacoding.jspider.api.event.site.SiteRelatedEvent
{

    protected java.lang.String robotsTXT;
    
    public RobotsTXTFetchedEvent(net.javacoding.jspider.api.model.Site site,
                                 java.lang.String robotsTXT) {
        super(site);
        this.robotsTXT = robotsTXT;
    }
    
    public java.lang.String getComment() {
        return "robots.txt fetched from site " + site;
    }
    
    public java.lang.String getRobotsTXT() { return robotsTXT; }
    
    public net.javacoding.jspider.api.model.Site getSite() { return site; }
    
    public void accept(net.javacoding.jspider.api.event.EventVisitor visitor) {
        visitor.visit(this);
    }
    
    final public static String jlc$CompilerVersion$jl = "2.4.0";
    final public static long jlc$SourceLastModified$jl = 1051926914000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYfWwcRxWfO5/vfLYbf8cmdmLHcT+s2nf2ne04OSFq+UNx" +
       "condOzdtjKvrenfO\n3mRvd7s7d76EEooITVtQRdWUDym0AoECKKKoUcqnCF" +
       "FbviOB/2gLqBUoVVUEqYoQagRF4c3snndu\n7xyDTC3t3nj3vXlv3nu/37yd" +
       "89dQpWmgDtEMkeM6NkPjyVnBMLE0rgimOQePUuLLlcHZcwdUzYs8\nceSVJY" +
       "Lq4qIZlgQihGUpPD0RyxuoS9eU40uKRux5SmbZu+v9lV+f3t9egermUZ2sJo" +
       "lAZHFcUwnO\nk3lUm8GZRWyYY5KEpXnUoGIsJbEhC4p8AgQ1dR41mvKSKpCs" +
       "gc0ENjUlRwUbzayODWaz8DCOakVN\nNYmRFYlmmATVx48KOSGcJbISjssmic" +
       "WRPy1jRTIfRCdRRRxVphVhCQS3xgurCLMZw1P0OYhXy+Cm\nkRZEXFDxHZNV" +
       "iESnW2NtxT0HQABUAxlMlrU1Uz5VgAeo0XJJEdSlcJIYsroEopVaFqwQtG3d" +
       "SUGo\nShfEY8ISThHU5pabtV6BVJCFhaoQ1OIWYzNBzra5csZla8Zf++/HZ9" +
       "/rYjn3SVhUqP8BUNrhUkrg\nNDawKmJL8Xo2dGb6SLbDixAIt7iELZmxW797" +
       "T/ztS52WTHsZmZnFo1gkKfH9kY7tq2NvBiuoG1W6\nZsq0FIpWzrI6a7+J5X" +
       "Wo5q1rM9KXocLLnyR+euThb+G/eFHVNPKLmpLNqNMoiFVp3B4HYByXVWw9\n" +
       "nUmnTUymkU9hj/wa+x/CkZYVTMPhh7EukGU2zusIoQBcHrhuQ9bfFnojqDWh" +
       "LWrEnLtvbgoTcRlL\nkzmskpBO0IdVTBZoKYiaBEWwcNTUZQkbC4IuL2AqtA" +
       "C+44V19PPUct2Kx0Mh7AagAtW6T1NgtpR4\n7uovH5o88NijVjppCdo+ExQD" +
       "D0KOByHbgxB4EGIehKgHobIeII+H2W4tDjjNoESB9tfnY/VP9Jsv\neFHFPA" +
       "rKmUyWCIsKBoAKiqKtYClFWIU2cGhgRQgVXLsIxQwOpRSYiIEHIpwzULe7aB" +
       "2oT8NIgEpc\nPXnjN++kVi7Q+qL10Exnt1yD7B6zfKvtTd6//4FHuyuo0IqP" +
       "Jg5EezaePSW+8/jBC6/86vU7HHAQ\n1FOC2VJNijm3+7OGJmIJOM2Z/gv/3P" +
       "fuU5V7LnqRD4AMVEYEKEDghR1uG0XYixV4jAYLNGvSmpER\nFPqqQD7VZNnQ" +
       "VpwnrH5uYeN6CEANXJVwtdjV20hv9GUjvTVZ1Ubj6VoDY8nrn/IPvPqjmpdZ" +
       "UAqE\nWscxbxITC54NTjrmDIzh+etfnH3q6WunP8pyYSeDIL+eXVRkMc/8a/" +
       "VA7pvKUEWorfnM53vPvlpI\ndpMz+5hhCMdprvOfXN3+pZ8JXwYaATib8gnM" +
       "0Opllryg1IYLU06OH7TIx6Kqh85efaT3j7+7YtMZ\nt006Un9Oncq+8OlLq1" +
       "4a4iBsWIJ5qIAwtmHSkYdtIpBGVvL0SZDFs9oC8SCxNYciw6PgUCNYohts\n" +
       "SJZCcU0UlOmJr1yuWX0yO7LfcuUWTmB6IpXvvPL13htdzAXbop9jTPv/QE4w" +
       "Djngpz8RgqY2xUF7\nB0f7otH+IZjIR+VYtpoJuvUmvJLRJKyEkgXpsBWDvV" +
       "wM9rAXUXqL/T88HBrqHxmA+Y2CSMHNelYu\nlHlC1j5cKDd672PjfgoDViqI" +
       "+dlti1A2crPuFG0rClDOLH7sHy8+U91llSbV6Vgjmna+4oq0UuKD\nJ85GV5" +
       "P3ylam3RuuS/jEj+955voV8gbDncMW1NrOfKmDhwWOyEZfyTX4v/NsxosC86" +
       "ieNU2CSg4L\nSpaich4q1hy3H8ah4vj3xS2MBYbYGht2uJmKM+vmKWc7gnEx" +
       "OBxqohtpJ1z1NjXVu6jJg1g1x5lC\nD7vfvkYkQd3QCPiHpXxJCdi1l+Bqb7" +
       "cLf1bAJ+7ac/nNa8/J7zGMVbP+cYxq2K4H2RMO+BWabtJO\nhWuV7Zl6ZnQz" +
       "xswOEVTNzA5Go8O7N13okdG+weH+CMy6ZW7fdDK0tlRqK8mv/SR0SaVLpI4h" +
       "h/yh\nfLY48JhUsxn+JfQOvsTk2ASd+yNsa2BLus0Gh4OfDhs7ENbt63WcrF" +
       "s+fd/fah8RXrrfqvvG4qaC\nmh9+9jXce1etWKaNCRJN71cgRooDTre1g6wT" +
       "L9Rh3b2df5oaOfdxNzp9tJni0VmslhIvf/vSH4Zf\n+/0p8GIeBQ7NJMfH4p" +
       "PgcOdNzaXEhlz73RXL8s9ZAdlAKfl+KFaKFcOj2sDw+aPOFYGkq2j/3gFX\n" +
       "q52l1nL7N5ejdThuQwIEv6uXMBnXMhmoOx5GpgOjkQGHwsnmKzvaNzjYHwUK" +
       "b3Is3252WQFhJYiY\nPbkoGt1wtdvRaP+AogGcUgs+JcrRyie4eAw68Xh48/" +
       "HYzeIBSG/hbW8ckW02kaLC7wcQkVMEBcAr\n9/7+GS4YEScYn910MKKDNBiR" +
       "EdjNbbNFcRgtF4c+uHbZcdj1v8XBY2/i3NLOcEuLOkt7evNLG+6L\nQHMVhY" +
       "jmZJDUjELj0r/hdxub47CltXHSPgcNtyCKWCfu7mTWkDPQRebsL/yL838fkN" +
       "66c8Ji6Tb+\n5IgX3Be5gXua3n7X6kuKu+IyXY3LyJM7vvbWhauJZovprbOW" +
       "XSXHHbyOdd7CllKr071m580sMOmX\n7tx5/mTijUWvHYJF2NFyGj3g8jN/By" +
       "i2W8qmhn5ptJUceVkHM2L36gN3vKg3/IJ9wK0dnlRBP57O\nKgrf7nBjv27g" +
       "tMz8qLKaH6u0vnnzVtr5ROf7729YuucJ6tpIl6BK9svrPUfQtvX1CKqAOy//" +
       "PEFb\ny8tD3dojXv4iNCjF8rCjOP/wot8DayBKh9/Xecj9gOvYRvQCKkb+u9" +
       "MMyhEJrAjETietl2auH0rq\nWJTpR1f+qz/03f3Eb//F9uyAaJ1W0hM66OoY" +
       "IMNjqqAcN1mjTN/Rkwsxa8BXOWHNjZ3dGtOa0TqR\na+ebwjVbPXNHZidL+0" +
       "L63bJZFhnpi0QYQfpoX7jJUx/oHT9ULlbMf75DpCtZsG3+B096Yi5pFgAA\n");
}
