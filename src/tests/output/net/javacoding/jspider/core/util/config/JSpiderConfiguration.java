package net.javacoding.jspider.core.util.config;

import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import java.io.File;

import et.util.MyUtility;

public interface JSpiderConfiguration {
    
    public java.io.File getDefaultOutputFolder();
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getJSpiderConfiguration();
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getPluginsConfiguration();
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getPluginConfiguration(java.lang.String pluginName);
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getSiteConfiguration(net.javacoding.jspider.api.model.Site site);
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getSiteConfiguration(java.lang.String host, int port);
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getDefaultSiteConfiguration();
    
    public net.javacoding.jspider.core.util.config.PropertySet
      getBaseSiteConfiguration();
    
    public java.io.File getPluginConfigurationFolder(
      java.lang.String pluginName);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1ZfWwcxRWfO387R/wRk1ixE5uQKBh8dz7bd7bjfuD6g1xy" +
       "xFcf/Yhrelnvzp03\n2dvd7s7aZ0rTVlAC/FEJJW2pREGVQJEqVFAp9J+2KQ" +
       "X6CRLyHw1tVdoqFKWiIFCLiiqq9M3Mnnfv\nvHd2FTuRZm88+97Me7/3mzdv" +
       "J0++jWpMA3WKZogs69gMjaeSgmFiaVwRTPMOGEqLL9U0JM8fVTU/\n8iWQX5" +
       "YIakqIZlgSiBCWpXB8YjRvoG5dU5azikbsedbMcujGD5dePnOkowo1zaImWU" +
       "0RgcjiuKYS\nnCezKJDDuXlsmGOShKVZ1KJiLKWwIQuKfBcIauosajXlrCoQ" +
       "y8DmDDY1ZZEKtpqWjg22ZmEwgQKi\npprEsESiGSZBzYmTwqIQtoishBOySU" +
       "YTqDYjY0Uyv4BOo6oEqskoQhYEdyYKXoTZjOEpOg7ijTKY\naWQEERdUqk/J" +
       "KiDRVaqx6vH+oyAAqnU5TBa01aWqVQEGUCs3SRHUbDhFDFnNgmiNZsEqBO0u" +
       "OykI\n1euCeErI4jRB7aVySf4KpBoYLFSFoOtLxdhMELPdJTFzRWu6NvDfB5" +
       "P/7mYxr5awqFD760Bpb4nS\nDM5gA6si5oofWKFz8eNWpx8hEL6+RJjLjB34" +
       "0acSly90cZkOD5np+ZNYJGnxw1jnnpWxNxqqqBn1\numbKlApFnrOoJu03o3" +
       "kd2LxzdUb6MlR4+bOZXxz/yvfwW35UH0e1oqZYOTWOGrAqjdv9OugnZBXz\n" +
       "0elMxsQkjqoVNlSrsb8BjoysYApHLfR1gSywfl5HCNVB80Hbi/i/RvoAXh1J" +
       "6bKEDWB7Rs5aBiN0\nSCfoYyomc5QJoiYBB+ZOmkxuTtQMPEeNhx5VmfOeIE" +
       "9Xblry+egWLt2ACrD1sKaAVlo8f+k3d08e\nfeB+Hk5KQdtmgj4CJoQcE0K2" +
       "CSFqAsePmxDyMgH5fGzxXcWI0xBKdKf94wejzV8Pms/5UdUsapBz\nOYsI8w" +
       "qGHSooiraEpTRhFG1xbQfGQqBwYB7YDBalFZiI7R6AeNFA+0pZ6+z1OPQEoO" +
       "LK6SuvvpNe\neoYSjBKijc7OTYPwnuK2BXpSdx45cf++Kiq0VE0jlWe7dBdd" +
       "pRTOKZovCvPn5r/4/guPNnbz+alO\nZ2ECWKxUk+aQD+6p7bv4420vsQAU0k" +
       "2TKy+lMOHkbXFsvcPAGMb/9HDy7DfePvM5Zii3tIqgemEe\n3BZEQgDYQnYi" +
       "qFa35hVZdHmyw2N/hdrbzn2z55GLng7sKZcWWEo789n3AvcJL97JN29rceAn" +
       "VSsX\nfew13HNrQPTgWgPR9KCCF7HimFe62u0sXRaQbvpM11+nYue/VGpoA2" +
       "U8LuhMjt9erJYWn//+hT9G\nX/vDvWDFLKo7Np0aH0tMgsFdFZdLiy2LHZ+s" +
       "WpB/5WfJmiY+jyRfrDTqdhPOCgPDGaVSwOhIQ34t\nZZOGJmIJDjJn3W/95/" +
       "C7Z2tGnvWjasjesOWIAFkHDoO9pYsXJdzRApvoUqC5LaMZOUGhrwonTiNZ\n" +
       "MLQlZ4QljetYvxmQ3AbtZmgBO2WxX/qylT528BTDpPex5wHOQD/tH6SPHptr" +
       "PvrshbjscBg8ZhjC\nMt1s+a+u7Pn2L4XvQCKHhGrKd2GWL1HRvrNnoM9bXS" +
       "/p36OQRLOYTOCMYClk2iK6RaZYcoMF291E\n4EcHP2jufuTSfT1/+f0r9mHk" +
       "KnIcqb+n77We+9qFFRbwBig3BPOYE0wod2jPx0oAiAfLVzys9NnI\nU/BtdD" +
       "tSzf6REbCnFRai1VFIlkIJTRSU+MR3n9+28pAVO8Ituc4lEJ9I57teeaLnSj" +
       "ezwF6w1nXc\n2X/XLQrGMWc30Z/DBN12dSfIoUh/byQSHOwHlnvje9Ds5oRm" +
       "cWkjKMDCK2uQEhWM2GisiE390Lbb\nbNp+lWwq5cK6REkStAsc8fKWyU/yiB" +
       "0vRGygr4+Nx+ljlqCPVsKTCOapuZS4AHtXwcaUQM+cZQCx\nv683NhwcGbiZ" +
       "oOxGj9Mi0wpTgeVF4zf1hCo5A9EY2Oh6kHNYoQwHSrmgNdtBa77WQTvBg5ZU" +
       "rKys\nmmWDJjtBizhBO0nQoUpBk3O6MsendiI2ENnSiHl5Qm39vBf049Babe" +
       "hbNwl6HxPzudEjDnoDDnrW\nJqSQ4d7B4WAsSiAdMr9plirws5llC1rYhfh3" +
       "zvpsUHmu5xiWJcNpx51+x50vEzT6f5NhsK93aCgY\niUSBDZktY8PGyDACrc" +
       "0mQ9vWkeEBB72og96DV08GSIWDsWAUyACnPFmlwYEysAq6HMppElZCKZBe\n" +
       "nxv3ENQGiFLhssw46/g26Ph2jqDhSr4ZkNLnZuDh8CI6wJLEINBC2gJarHGi" +
       "LCkmoe20SbFzk0jh\n52Ju4B51gBtygHtsE0jRz0gxBKRY0PjH3DLUSR3uui" +
       "1pyDkodxbte4RnZ//ZJ715ywQvmNrd91Nu\nwcP9V/D+HZffZR8bJdWbx2VF" +
       "ySIP7X38zWcuzbTxTxV+o3PjmksVtw6/1WFoBXT6sXRDpRWY9Iu3\n3PDk6Z" +
       "nX5/02hcMEVcEHG3yqMXOj65P+4Q2Q/ikndjEndk9vSuygQIyNELTHy4bV8r" +
       "AseWPQ2m3y\ntl/ryuKHBHU4dW1FBH/iIDjsIPjTTUBwkCIYHSRofwVT1gcy" +
       "Am23DeTuaw3kzwlqB+s/IZi4Ioq/\ndVAccVB8maBPbxRFnReqMjbnkqvdUk" +
       "xjw73RoeAwrd8WtiA1e7pZNjAfh9ZpB6Zz687s361CG3GV\nvxc3gaBQwEWD" +
       "sf6iAo4l6fV58SpBnd4ljv157nLgdccB10fXnzfFAZqjBqDOqGRL0RY7hvKQ" +
       "Vr0m\npLdw7Wv+O4Nfuov7Vk7c9ILe8mt2T7N6MV4Pn+sZS1Fc10DuK6Fa3c" +
       "AZmWFQz69fOCB/I+jgBtlL\n6I017TDg3uD6lwnqXk8fzlz641Z7C5JiBTXQ" +
       "oD9ujXegJPfWIKjO7rnl3yNoe7E8cMv5wy36LzgO\nQZR239c9vhr4TU1e/x" +
       "+gW7a6qhoAAA==");
}
