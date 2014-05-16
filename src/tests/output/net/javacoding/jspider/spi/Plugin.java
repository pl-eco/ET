package net.javacoding.jspider.spi;

import net.javacoding.jspider.api.event.EventSink;

import et.util.MyUtility;

public interface Plugin extends net.javacoding.jspider.api.event.EventSink {
    
    public java.lang.String getName();
    
    public java.lang.String getVersion();
    
    public java.lang.String getDescription();
    
    public java.lang.String getVendor();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1XXWwUVRS+u9tuu+1CfyjQ0JbWIsHFdrelBYUaY9OfsHSh" +
       "a7f+UIvL7Mzd7dDZ\nmXHmTrtFRAxYfh5MDPiXoMYHQ2KMDxrxxQQJ4l8kMX" +
       "0BNSYafNAoRh+MxGDw3DszndmhVYMJm8yd\nu/eee8653znnu3fevIJKdQ01" +
       "8nqUzKhYj/alkpymY6FP4nR9FIbS/PnSUPLUkKz4kS+B/KJAUFWC\n12MCR7" +
       "iYKMTi/T0FDbWoijSTkxRi6blBy5Y116Y/P7ytIYCqxlCVKKcIR0S+T5EJLp" +
       "AxFM7jfAZr\neq8gYGEM1cgYCymsiZwk7gVBRR5DtbqYkzliaFgfwboiTVHB" +
       "Wt1QscZs2oMJFOYVWSeawRNF0wmq\nTuzhpriYQUQplhB10pNAwayIJUF/DO" +
       "1HgQQqzUpcDgRXJOxdxJjG2CAdB/EKEdzUshyP7SUlk6IM\nSDR7V8zv+PYh" +
       "EIClZXlMJpR5UyUyBwOo1nRJ4uRcLEU0Uc6BaKligBWCVi2qFITKVY6f5HI4" +
       "TVC9\nVy5pToFUiMFClxC03CvGNEHMVnli5orWcDD817HkHy0s5iUC5iXqfx" +
       "ksWu1ZNIKzWMMyj82FV43o\nifhOo9GPEAgv9wibMr1r33sg8cOZZlOmYQGZ" +
       "4cwezJM0f21TY9Nc7/ehAHWjXFV0kaZC0c5ZVJPW\nTE9BhWxeMa+RTkbtyQ" +
       "9GPtp54A38kx+Vx1GQVyQjL8dRCMtCn9Uvg35ClLE5OpzN6pjEUYnEhoIK\n" +
       "+w9wZEUJUziC0Fc5MsH6BRUhVAaPD547kflbShuCypOSkRPlqErQGhmTcRp7" +
       "XhEg6uN7dFUUsDYO\nr3FbqkAVVk37fLQyvXUlQRJuVSRYk+ZPXf5s38DQ0S" +
       "NmlGhmWa4QdBvYiTp2opadKLyiph3k8zEL\nK4vRovALtEp+frun+pl2/bQf" +
       "BcZQSMznDcJlJAzVxUmSMo2FNGHpVeNKZZZBkH7hDGQimE1LoIhl\nPsAzpa" +
       "FWb8Y5dRqHHgdpNLf/+he/pKffoclBg1lHtZuuQWgmTd/CkdSubbuPtAao0H" +
       "QJRbnAKmwl\nteLFbJDWuq0/n3n893OvVLSY+umaRlsBGPOupPV/9WCw4+L7" +
       "lecZyjZVVLk4JYWJmXg1jq+jGsYw\n/s2LyePPXTn8CHPU9DQA+cBlYNscTw" +
       "gAazMLQUHVyEgi79rJsgVqI1pfd+L5yMmL3g3QWNZjW3Kg\nb7tZRGbJ7Tt5" +
       "eTby7ZcXrLJ00b0j9WP6kHH66TNzfspTISBeTt9hpxQjftrzMTKUIfuoAjoS" +
       "Yula\nYWZtB90cXbl5Y4fpXB1B6xfJRQ5yEU9hmUQHaJuC8NIgNC1GS4xSDz" +
       "/8W3iW+3CXuZPa4uQdkI38\nxlcv4ch9YX6BoggRRW2XwKTkQOy1tp3RtZ0t" +
       "VQ81fze46dQTXrBLaGm6wS5elubPvnXm642XvjoE\nXoyhsh3Dqb7exAA43P" +
       "yP5tJ8zVTD/YEJ8RMWBEa8CxwyxYt63NuE8GgYzkh5dD48N5ZdUlN4LMBB\n" +
       "6th94c+tvx4v3fyuH5VA8OH8JBywHhxGq73Giwi/x64IagpWVmYVLc9JdMo+" +
       "8SrIhKZMOyMsT5aw\nfjUgWQlPAzx1FmWyN52spc0ykwuZdCtr15pV5Kf9db" +
       "SJWPXio20bxGWZU4W9msbNUMIoPDXX9NLH\n3MtwkACh6+JezPgaFXGHpYG2" +
       "g65J+r+XoLIcJrQe2LxF0kNOuneC5VqoK3otiopCNKHwnBTvf+1s\n5dyzxq" +
       "ZtZroucQnE+9OF5guvR663sFhb9RV0nXPW/7IpTtvhpDF9JQi6d5GDJK8I4y" +
       "oj+HFgLzJs\nENUg9smyZcNdbV0d7d2d6wkKkwlRj7o3BaVazbCjXB41ryWI" +
       "zdxTFK7VVsiQ/f4f4fKC/a+RGCWo\nApx+EO6KAJE7GLucYGxg49tp8+hNQ3" +
       "U3g6oLoKqyobKsUr0jCyHTaj3Ift9KZDIELQUf+7HOa6JK\nPOhMOuh0OegA" +
       "u7T9hxvJlq7uts7O9q5uglYWm1int5h8sygmTfBELEwitxoTSvosbrIAnwIu" +
       "OGYc\nOLodOPbedLJsnk+WpU6yUKMmLgU43U1hek+ov+FjybzS861zu+84p9" +
       "Z8ylh4/tpdDpyQNSTJRfJu\nwg+qGs6KbFflJrmaWzwAXxKL3wIJCkDLtv6k" +
       "KX8QPoAWlgfys3pu+VnYa7E8lKbzxy16FKyBKO0e\nm78WuLjGvIQU1L8BbO" +
       "uEOY8OAAA=");
}
