package net.javacoding.jspider.core.storage.spi;

import java.io.InputStream;

import et.util.MyUtility;

public interface ContentDAOSPI {
    
    public java.io.InputStream getInputStream(int id);
    
    public void setBytes(int i, byte[] bytes);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAKVXa2wUVRS+u9tuu+1iaXk1tNDyClTobKG0BPpDSltkYaFL" +
       "F6PUkmV25m47MDsz\nztzdbhHxAQL6w4SAr4gaEw2JIf6AgD80QQL4iiSmf0" +
       "CNRoMhGMVAjIEYDJ5772x3drZUopvMnTv3\nnnPPued857HHr6NSy0T1kiWQ" +
       "EQNbQlcsKpoWlrtU0bK2wFJculAaiB7boOle5IkgryITVBWRrJAs\nEjGkyK" +
       "Fwd0fWRI2Gro4Mqjqxzyk6ZdW8O8NfHVhf50NV/ahK0WJEJIrUpWsEZ0k/Cq" +
       "ZwKoFNq1OW\nsdyPqjWM5Rg2FVFVdgGhrvWjGksZ1ESSNrHVhy1dzVDCGitt" +
       "YJPJzC1GUFDSNYuYaYnopkXQ5MgO\nMSOG0kRRQxHFIh0R5E8qWJWtJ9Ae5I" +
       "ug0qQqDgLh9EjuFiF2YmgtXQfyCgXUNJOihHMsJTsVDSzR\n4OYYu/H8DUAA" +
       "rGUpTIb0MVElmggLqIarpIraYChGTEUbBNJSPQ1SCJp5z0OBqNwQpZ3iII4T" +
       "VOum\ni/ItoAows1AWgqa5ydhJ4LOZLp85vNXrD/79YvRWI/N5iYwllepfBk" +
       "yzXUx9OIlNrEmYM95OC0fC\nW9P1XoSAeJqLmNN0Lvjwkci1Mw2cpm4cmt7E" +
       "DiyRuHSnvX7WaOfPAR9Vo9zQLYVCoeDmzKtRe6cj\nawCap4+dSDeF3OYnfZ" +
       "9ufeZ9/KsXlYeRX9LVdEoLowDW5C57XgbziKJhvtqbTFqYhFGJypb8OvsG\n" +
       "cyQVFVNz+GFuiGSIzbMGQqgMHg88DyD+K6cDxAuDuUa6O3tj0bBgELRCw2SA" +
       "QkDSZXD+wA7LUGRs\nDki6iQcsgC24cQDWBlycWSqratjjoUHrDjkV8LlOV+" +
       "GcuHTsype7eza8cJA7kILO1pKgNpAt5GUL\ntmyByhZs2QKsCQWykcfDpM4o" +
       "NC71lkyD6rcTHZNfarZOe5GvHwWUVCpNxISKIRhFVdWHsRwnDI3V\nDuQzwA" +
       "FagwkALqgSV+EgFihgzYyJ5roBmg/rMMxEQN3onrtf/x4fPkmxRH0/lZ7OVQ" +
       "NP7uS6BZti\n29ZvPzjXR4mGS6hTsiwgZ1Apbjuupakhd34q8eSf596qaOTn" +
       "U5763AEgzM1J08Xtvf6WSx9XXmCW\nz2WWKkcKimHCcVqd13WLiTGsf/9a9P" +
       "DL1w88zhTlmvoIKhcTcG1RIgQMm0tEBPmNdEJVJMdNpowT\nSkLt1COvNB29" +
       "NO4FZt0rA7DsdeCxm8H94vltPE5rCh3fo6VTbW9fxk2rg9I4IAsQ3WhWcQar" +
       "efXc\n0jayzJizdNWjDT+tbT/2lFtRL4U6zvH0dG0sZItLZz84813b5W/3gR" +
       "b9qGxTb6yrM9IDCjdMKC4u\nVWfqNvuGlM+9LC/THDdOPi9k6nBeE8qCiaEc" +
       "adRgdCWQLYZs1NQlLEPNyst99a91Nw6XrjzlRSWQ\nqKFUERESDOT92W7hBb" +
       "m1I4cmKgo4K5O6mRJVupUrLhVkyNSH8yssW0xi88lgyUp4WuCpsLMTe9PN\n" +
       "GjpM4bmFUc9l4wKOQC+dL6RDk401Dx2XgF+m5BHcaZriCA227LOjs17/THwT" +
       "cjbkTkvZhVlq9LCz\naAapczozaiopyM4Zu3yc6v+jRb66uJtDrtbZljgJ1y" +
       "27i+dPuXaDAS8APYJobRpDX3GNcgk5NPvd\nqyev9E3lsOWFfF5RLXXy8GLO" +
       "DBQ0aODMmUgCoz6/eM7xPX0/JOhNKF+IIB8EL4QtU7et0JR0XE3d\nYccm/e" +
       "4g6IFBKECakSbQI2AxBYJrncbjZZJfavfRK/ubfvzmol14HZbLU/0S35c+/f" +
       "yZUYZ4l9lY\na0dnHtbuACBZwua4pmMFLz5RYnO2tq5cCgrVgCTaCgqKLER0" +
       "SVTD3e+crRw9lG5fz1WZ5CAId8ez\nDRffa7rbyFSwJfodtd3+LsuIZt6jBn" +
       "1tJuihiapmSpexOkCbwLQpQbhBntREVTBWta5YsaR1ZXPb\nigcJWkyGFGus" +
       "yIF18zVuUZPgsjaVOpXYIFd0wbGH2GZ7UWgF7dAK/s/QyuHBmydbSwuOw60s" +
       "4KhX\n9w1vuL6o/tYbXuSdwKvj9HtjJ8SlE775N70fTZ/PclJJQrS4492Ncn" +
       "EfXNDesmtWGvwqa+z3wwQO\nHCE4h/xWwzAcGFrGiProkCRo9X/si1YtXbak" +
       "dXnz8naCSqkw69/DaysUVujn1lDqIoUzOv2fwxVu\nQVmCJhUIpNW7tugfD+" +
       "/Lpbmj2xedM6q/4LbM9c7lAPJkWlUd5cNZSvyGiZMKU6ycp20ebtA7LLzP\n" +
       "fg0SDIzsCiZnzkBeuw9mgsrsmZN5hKC6CZjBSPTl5NgN/6DG5wAJ9sxJ/zQk" +
       "uEJ6giryH07S5+By\nQEqne41cYE5mgUk7SYHnuKzxD/6jXdDQDgAA");
}
