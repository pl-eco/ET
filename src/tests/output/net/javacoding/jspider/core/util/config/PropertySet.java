package net.javacoding.jspider.core.util.config;

public interface PropertySet {
    
    public java.lang.String getString(java.lang.String name,
                                      java.lang.String defaultValue);
    
    public java.lang.Class getClass(java.lang.String name,
                                    java.lang.Class defaultValue);
    
    public int getInteger(java.lang.String name, int defaultValue);
    
    public boolean getBoolean(java.lang.String name, boolean defaultValue);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALVYa2wc1RW+Xtvr1yaOnZBY5GGTgMBg7/oRPxKLCuOHsvEm" +
       "WWwexTXa3J25u55k\ndmaYuWNvAk1bkRJoJaTwRgogECgIEJWKgD+VUgT0pS" +
       "Ih/wFatWqVClG1IFBVgRAonHPvjGd2vYlR\nIizNzN0759xz7jnf+e4Zv/wJ" +
       "qXVsskVx4vyIxZz42Eya2g5Tx3TqODfDVEZ5p7YhfXrKMCOkKkUi\nmspJc0" +
       "pxEirlNKGpieT4SNEmHZapH8nrJvfWWbHK7h1fL/75xN7N1aR5ljRrxgynXF" +
       "PGTIOzIp8l\nsQIrZJntjKoqU2dJi8GYOsNsjeraURA0jVnS6mh5g3LXZs40" +
       "c0x9AQVbHdditrDpT6ZITDENh9uu\nwk3b4WRd6hBdoAmXa3oipTl8JEWiOY" +
       "3pqnMnOUaqU6Q2p9M8CG5M+btIiBUTkzgP4o0auGnnqMJ8\nlZrDmgGRaC/X" +
       "WN7xlVMgAKp1BcbnzWVTNQaFCdIqXdKpkU/McFsz8iBaa7pghZPLz7soCNVb" +
       "VDlM\n8yzDSVu5XFq+AqkGERZU4eSycjGxEuTs8rKchbJ1IBr75hfpLzpEzm" +
       "tUpujofx0obStTmmY5ZjND\nYVLxSzf+cPJ2d0uEEBC+rExYyoxe9cYtqY/P" +
       "tEuZzRVkDmQPMYVnlK8Ht2xdGv1XQzW6UW+ZjoZQ\nKNm5yGraezNStADNG5" +
       "dXxJdx/+Vvp393+09fZP+JkPokiSqm7haMJGlghjrmjetgnNIMJmcP5HIO\n" +
       "40lSo4upqCl+Qzhyms4wHFEYW5TPi3HRIoTUwVUF1zoi/6J442RN2jYFSmcY" +
       "j1ucDBiMzyEAFFOF\n1M8dcixNZfacYtpsDn2GkZHT8nMlekW007xYVYUFW1" +
       "5uOmBzj6nDKhnl9Nk/3T0xdf99MnkIOM9D\nTvrBcjywHPcsx9GyjJa0HA9Z" +
       "JlVVwuam0rBinlQsp//+emTdA93O6xFSPUsatELB5TSrMyhDquvm\nIlMzXO" +
       "CwJYR5ATXAaSwLkAVHMjosJEoE4rhgk+3l0AwKOgkjCnhbOnbuvU8zi68iij" +
       "DrG3B16Rrk\n8LD0LdY5c8feg/dtr0ahxRpMR1GU4ia0Uh7FSSQFf/1C9q7/" +
       "v/VUY4dcH3W2+AuAsXJNJIov74n2\nvP+bpndE3H1OaQ6RDwRTIrQl8PVmmz" +
       "GY/9vj6Yce+eTEj4Sj0tNqTuppFrZNFc4hsD4FcRK13Kyu\nKaGdrK9QRPG2" +
       "DQ8/2nnq/Yob2Hq+2he8deKHn8fupW/fISu0tTTxE4ZbGHj6A9Z5Q0ypALEG" +
       "blrd\nOltgeuBeubV9ghP9SDff1v7PycHTPy53tAaBznydibF9pWoZ5c1Xzv" +
       "x14IO/HAcvZknd/gMzY6Op\nCXC4/YLmMkrLwuabque1P0QEIyO7VWDyUqWR" +
       "8DbhQLAZHEQGBgxnGoorIQsVpDAVTqvA7mNf7fns\nodpdr0VIDVA0VBqnQC" +
       "3A+NvKjZew6oiPJjQFmk050y5QHV/5x0ojn7fNxWBGcMUaMUYuaoLrerjq\n" +
       "PV4ST3zZirf1klmE9HZxv0oiMILjq/HW6WGtCu9dkJf1AYJHbZsewWIr/mxp" +
       "6xO/p08CWwNrOtpR\nJkgxItcCpbZwMiXHyxPh7lNn7+38x4fveqdGqBsJpP" +
       "6dOe6+/vMzSyJpDdAXUGd/kBDoS3BUJc5q\niKngHJkavDdK9hzHkkLN/sEh" +
       "8KcVDGEbE9fUeMpUqJ4cf+bNpqWT7uBe6cmakEByPFNsf/f5znMd\nwgPPYD" +
       "R0Lnm/6xaovT+oCHxMcHL9RXH+7uGuvuHu/l1cok8kYQN0NCL6yKRx2T2IFz" +
       "fKTe4LNjks\n5ifxtv8SXNjZ2z3Yw0lMZTnq6vxWqrtid1OlqMD7DYgsj2bw" +
       "9wgQQp7xlV7eEng5GHh5Kydj5/Gy\nYKpzlu7mNQPdhFaPzY3JZ1rMgqf9A1" +
       "29Q90DQ9dChLxzbNm28JcIS4MldbEbrkavLhovsS78CPiQ\nD+334PJ+h3qC" +
       "/VJOfnBxWent6eob7O4f4gEvTYXtscBeb2Avdyn2+ndBbMtg4COyOUCkOEpW" +
       "R8Ys\nOAjZEdJhx80AGLsCx61VHOfUOTw3o8wD4+rMnqTYKRwBt/v6uvp7un" +
       "v7hgETmxz/PW7NifvWcf1D\nlaAxDFfMg0bs+4PG0SBVfcGO77r4VPVVgAY0" +
       "2mH2TdtaAUhrwWvbX5v9X4/60XXjkvbawp+DYcE9\nfefYles//kwc+2UcXO" +
       "HboMzIyW3PffTq2ekNsmmQH1A7VnzDhHXkR5QIUszCtuWKC1kQ0m9fd8XL\n" +
       "x6b/no14MEtwUg2tEzRNwt2B1YEJso0AjST0W3lm48w9lcCBams9cKz9/sBx" +
       "MgBHfwCOBy8eHDux\nIHb2ruCNn1jSp+Oc1GVNoFVq+EHrXT1ov5RBu1Eq4s" +
       "yjpMhJU8g4Nr5tK/5NID9mle1LB695y2r5\no2iNlj846+F0zbm6Huq8wl1Y" +
       "1LJZThP262XHI2P2NCdXf8cPHY5fgjgQu3pK6j/LScdq+hA/fITV\nnudk8w" +
       "XUQAMfYY0XONlYWQOS4I3C8i9xsrZUHsIe/AiLvgK4B1Ec/sqq0DfIxqpofQ" +
       "u6fWr1AhIA\nAA==");
}
