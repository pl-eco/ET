package net.javacoding.jspider.core.rule;

import net.javacoding.jspider.api.model.Decision;

import et.util.MyUtility;
import net.javacoding.jspider.api.model.Site;

import et.util.MyUtility;
import net.javacoding.jspider.core.SpiderContext;

import et.util.MyUtility;
import net.javacoding.jspider.spi.Rule;

import et.util.MyUtility;
import java.net.URL;

import et.util.MyUtility;

public interface Ruleset {
    int RULESET_GENERAL = 1;
    int RULESET_SITE = 2;
    
    public net.javacoding.jspider.api.model.Decision applyRules(
      net.javacoding.jspider.core.SpiderContext context,
      net.javacoding.jspider.api.model.Site currentSite, java.net.URL url);
    
    public void addRule(net.javacoding.jspider.spi.Rule rule);
    
    public int getType();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK1Ya2wc1RW+3rV3/djUjxhi2U5sjJFiw64dv+LE/YFlO2ST" +
       "JXZ3bWhc083dmbvO\nxLMzw8yd9SYNURE04SFVQoTSSuFVgVKVCBAI+qdqio" +
       "C+1EiVfxTaqog2FaJqqaiqiqiiSs+9d2Zn\nduyYRq2lmbk7c15zzne+c8cX" +
       "PkY1lok6JStBjxvESkxl5rBpEXlKxZY1D7ey0js1dXPnD2p6CFWl\nUEiRKW" +
       "pMSdaAjCkeUOSB5PREyUTdhq4eX1Z16thZZ2XvzZ+t/vLMgY4walxEjYqWoZ" +
       "gq0pSuUVKi\niyhWIIUcMa1JWSbyImrWCJEzxFSwqpwAQV1bRC2WsqxhapvE" +
       "ShNLV4tMsMWyDWJyn+7NFIpJumZR\n05aobloUNaWO4SIesKmiDqQUi06kUC" +
       "SvEFW27kWnUDiFavIqXgbBG1PuWwxwiwP72H0Qr1cgTDOP\nJeKqVK8oGmSi" +
       "K6hRfuPegyAAqtECoUf1sqtqDcMN1CJCUrG2PJChpqItg2iNboMXitqvaRSE" +
       "ag0s\nreBlkqWoLSg3Jx6BVB1PC1Oh6IagGLcENWsP1MxXrdlI7N+PzH3azW" +
       "teLRNJZfFHQWlHQClN8sQk\nmkSE4hU7cTZ52O4MIQTCNwSEhczkLT9YSH10" +
       "sUvIdGwgM5s7RiSalT4b69y+NvmnujALo9bQLYVB\noeLNeVXnnCcTJQPQfG" +
       "PZInuYcB/+OP2Tw1//PvlLCNUmUUTSVbugJVEd0eQpZx2FdUrRiLg7m89b\n" +
       "hCZRtcpvRXT+G9KRV1TC0hGBtYHpUb4uGQihKBxVcAwh8dfKThTVpW2VgG7C" +
       "oKhfI3SJFV/SZSj7\n0jHLUGRiLkm6SZZMkFsqC5eY4cbVqirWocH+UgGM+3" +
       "UVVLPS+cu/ODlz8OGHRLUYwpyQKNoJ7hKe\nu4TjLsHcJZi7hOMOVVVxR9sq" +
       "k8eqIbOm+eurE03fjFtvhFB4EdUphYJNcU4l0GxYVfVVImcpR1uz\nD9kcUI" +
       "DGWA6ACd6zKhjijQDZKpqoJwhAr22TsMKAqrVTV3/1t+zqawwrrLatzLoIDS" +
       "q1ImKL9WXu\nOXDkoZ4wE1qtZkkv8YbbxrwEU7ePtb5rv5D72j/ferq+W9hn" +
       "Op3cQAh8dRBXZWbqzgqtrHTviXPD\na5m7FYHhYFMEhE/8aOHpK5fo+7w+dU" +
       "BOFAOkoNN3BFuzoptYjwaDvwubnt3xXxebI688Uwih6CJq\n4qSHNXoXVm2S" +
       "IUCq9Yo15dxMoS0VzyspSPTbhNPqFHUG4/K5nXD5kiWr2o83WDNptq7j2N3C" +
       "ZZog\nnW1wDMKxzWkMfmUPW9hpa4lDr5nXlgWUSALfLhOz5Y/PPv/p/WfGIX" +
       "FJVFNkgUNOmjy5QzabGqcv\nPLG94ewHj/IishZkRncytATrwuK+8kBk8N0f" +
       "NrzDq+FSf6NvRkDuBJE0e2CbNwnL6e+/Pff4Ex+f\n+QpHmoBamIIRRcOQto" +
       "hh51RFgoXFp1sJ7KYXUjOZmfnsHTOHZtKTqSCs5kylAOxUdOjz9cV/DMof\n" +
       "3jotYNXmH8t+wf1DV0nv1o8+EYCCGYmtQ+WuXw/HgJPHdjz/4WuX062CLsQg" +
       "u3ndLPHriGHGaxoz\nSvAON23mgUu/fetNF06l38+JN2mpZJUZzS6MPvMe6b" +
       "s9Jm1AWmEYt5BE/l6jnAQ5kHoq4BSHo92B\nU/t6OLFFP2tktrid/4zz86BT" +
       "NrYeYqdhdhqBWsXcWmWS8zPs5l7uu7SBMkW1OAdchSUItK68O+Dm\nfNSzdY" +
       "PZlmhrPfutvnPvBhkHsbxuv9ZI5jk98+W/x07jt+9hqkzxi+Cb6kZcJUWiel" +
       "6DRu7kOxC3\nfxvv7vrDvrHz9wX9h9mU8UOzUi0rvfnSxd+NvvfbB6Fgiyh6" +
       "aDYzNZmagdp2beouKzUXO74UPqr8\nLMT3P4Jg1u2bKpUmKmml3iSw7dPmy+" +
       "SyfnTMmbpEZNgben6f/Nf+Tx6v2fN6iLGUx7rMQm+Awxry\nulnAKnPgbtTq" +
       "6VFTX/XuBAitAY45OHodBPYGEOihtgI4HI37/TDhXMVoYatHNpOmiY+zwVa6" +
       "f237\nd36Knwoz/qu2lBOE81u4XLA2f8EEi4seP3nu8um+D35zydmH+YjEk/" +
       "pz9kH7jW9cXOOFCbAI3+mz\nVRXf/ULespXcXi+2JznqaO4a3DMIAbWAJ/Zl" +
       "kFDkREqXsJqcfu7NhrXH7LEDIpQtPoHkdLbUdemF\nvqvdPATHY8S31XN+R4" +
       "vY9AjOYBdg2eH/fiu1d3jstuFd8dEhiqKS+Obg6W+lqG+zHVKGr6d8GkfE\n" +
       "e6/43nsXf8BjV687qtGR+O5Bihok24TBTzMKJW5kt1wjMmwoiYIuEzVRlnai" +
       "Mn1RDXlRWdcd1e6h\n+O49QMS2qbrRxDg+WUgL6VQleNn5q6wBHCJjvw9TVI" +
       "8NQz3O7fqDPOkFOb7HC/I+iu7YLEiKrZWl\nVd1cWZomEtye1URxQHAeHkHc" +
       "o1Djkfj4eD98yQlN7jsRCGOTmnuZZT4sACDiKgsVfd8DR7/T9/3/\nY9+7qa" +
       "viYlX+PD3sK+awl6dHrq+YI0O3DY3Eh4cpqmZP3Ax0XSMDcOFfBJ9f4Aeglb" +
       "Asp12jY4bQ\nmQBPRZ39m0AM8MGNUtju7AeRe/0/pBBV7Pw3ifxJiHyZUHec" +
       "7EUw+6NOxti2r23d/zLEF7fUs3Zk\n51tG88/5RCl/FdcCX+VtVfXvg33riG" +
       "GSvMId14ohIsr7XYq6P+/jzF+054TaCxR1bKIGGuzi1/ge\ntMPGGvDazsov" +
       "/yJFX6iUh1b2fvhFXwKKAFG2fNlwoeXbnotZUzL+A2njKUtnEgAA");
}
