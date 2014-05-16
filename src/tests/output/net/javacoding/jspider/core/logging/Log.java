package net.javacoding.jspider.core.logging;

public interface Log {
    
    boolean isDebugEnabled();
    
    boolean isErrorEnabled();
    
    boolean isFatalEnabled();
    
    boolean isInfoEnabled();
    
    boolean isTraceEnabled();
    
    boolean isWarnEnabled();
    
    void trace(java.lang.Object o);
    
    void trace(java.lang.Object o, java.lang.Throwable throwable);
    
    void debug(java.lang.Object o);
    
    void debug(java.lang.Object o, java.lang.Throwable throwable);
    
    void info(java.lang.Object o);
    
    void info(java.lang.Object o, java.lang.Throwable throwable);
    
    void warn(java.lang.Object o);
    
    void warn(java.lang.Object o, java.lang.Throwable throwable);
    
    void error(java.lang.Object o);
    
    void error(java.lang.Object o, java.lang.Throwable throwable);
    
    void fatal(java.lang.Object o);
    
    void fatal(java.lang.Object o, java.lang.Throwable throwable);
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1Za2wc1RW+s7bXj2xie20cN3Zs4zgQg73rrNdbiP/E8kPZ" +
       "ZIldOyhgjDazM3c3\nk8zOTGfu2hugURGBAD9aodACFQVVbZWqQlQqIv1Dla" +
       "ZAW6qiIv8JbQVqmwrRB1VQVTWqaNNz78z6\njsePzaRxLM3szJ1z7znnO989" +
       "58z4lU9QlWWidsmKkBMGtiKjM1OiaWF5VBUt6xAMpaW3q2qnzh7Q\n9AASUi" +
       "igyATVpyQrKotEjCpyNDk2XDRRl6GrJ3KqTpx1VqyyZ8dnC786vb+tAtXPon" +
       "pFmyEiUaRR\nXSO4SGZRKI/zGWxaI7KM5VnUqGEsz2BTEVXlIRDUtVkUtpSc" +
       "JpKCia1pbOnqPBUMWwUDm0xnaTCF\nQpKuWcQsSEQ3LYIaUsfEeTFaIIoaTS" +
       "kWGU6hYFbBqmx9EZ1EFSlUlVXFHAi2pEpeRNmK0Qk6DuJ1\nCphpZkUJl6ZU" +
       "Hlc0QKLTO2PJ454DIABTq/OYHNWXVFVqIgygsG2SKmq56AwxFS0HolV6AbQQ" +
       "tG3N\nRUGoxhCl42IOpwlq9cpN2Y9AqpbBQqcQdItXjK0EMdvmiZkrWpPB0H" +
       "+envpXF4t5pYwlldpfDZM6\nPJOmcRabWJOwPfFKIfJs8v5CewAhEL7FI2zL" +
       "jOz80b2pj8932jJtq8hMZo5hiaSlzxLt2xdH/lRb\nQc2oMXRLoVRY5jmL6p" +
       "TzZLhoAJtbllakDyOlhz+Z/tn9X/4+/msA1SRRUNLVQl5LolqsyaPOdTVc\n" +
       "pxQN26OT2ayFSRJVqmwoqLN7gCOrqJjCEYRrQyRH2XXRQAhVwyHAEUH2Xw09" +
       "EVSV0nMRg6BeDZM5\nGnhJlyHkc8csQ5GxOSfpJp5T9VyODjLZIl2zfkEQ6O" +
       "b0bi0VeLhPV2FmWjp76ZePjB946kk7UJRc\njjUE3Q7aIlxbxNEWodoijrYI" +
       "aEOCwPRsXQ4bjYNMt8vffjjc8JV+61wAVcyiWiWfLxAxo2LYZqKq\n6gtYTh" +
       "PGs0YXpxmVgIehDFAS9KRVWIhtAcBp3kTdXurxDZuEKxH4tHjy6nt/Ty+8Rl" +
       "lCo9pMV7dN\ngxgdt20L9c48uP/Ik90VVGihksJdZFttK9XiRW6CbvrS+vnM" +
       "w/9886W6Lnt9Oqe9tAAo886kieDK\nY8GBi29septhXcoZ9a7kMoOJzcBGbu" +
       "shE2MY/+D5qTNf++T0A8xQ29IKgmrEDLgtSoQAsKUUQ1DQ\nKGRURXJ50rTK" +
       "Jom0Nj/79d4XL67qwPa19jbLS6fv+zT0hPjWg/YODC8P/LhWyA+9/D7u3RuS" +
       "VqFV\nLdGNfhXPY5Wb59V2D8t5JaTrD3f+YSJx9kteQ8OU3Lg0Z3z0nuXT0t" +
       "KFV8//buj9354CK2ZR9cHJ\nmdGR1DgY3LmuurTUON/2hYqjyi8CLOPS7LVK" +
       "pl4+adjtJiR8E0Oh0ShgdKS2uJKyU6YuYRmqEdf7\n3L/3XT5TdffrAVQJKR" +
       "iKEBEhdUBG7/AqX5Y1h0tsoqpg5qasbuZFlT4qlY06ctTUF/gIyw+b2XUD\n" +
       "IEnRbIejzsk77Jc+DNNTk51NmHQ3O++0GRig17fTU6/DNYGe+yAuTZzBI6Yp" +
       "nqCbrfjo4vYXfi5+\nE7IxZEVLeQizpIeW7TtnBXre63pI74cJ2qJYYzhTyI" +
       "1rNIXIoKjNTYApU8lDrp53isnrs/8YkD+6\nc8ymaau7SXEL7otdxT1NH19m" +
       "ZK2FjkG0Di4xdmXF8ih5puM7H712abrZprpd1nesqKzuOXZpZy6F\nDLrZbl" +
       "1PA5N+685bXzk5/WEm4EARJag6o+sqFqGaBZnJuxEDLbEiqCEnqKH/M6jekJ" +
       "SN10EWr3HT\n1E0nXnQ0uZadWxw7t9xsOw8zOyegH1XL2dkGR4NjZ8PNtvMI" +
       "QZsVK6ll9WuBM+yYGb7ZZioMzkNQ\nlvC1wNns2Nl8s+00GZyHRVMrZ2YrHC" +
       "2OmS03yEyBidG+qdWdwezO1c4sj7x46Yne3//mXacXdqUv\nLvXn9KnCucfP" +
       "L7JS5cld7G2LXgnsDQQqCeu07IJEz3V2n/gYbSTozEQsAfaEQRF9OYsoMrR3" +
       "kqgm\nx751YdPiM4XEftuSzS6B5Fi62Pnud3uvdjELHIVBV7ft3FfPiybPqg" +
       "b9OUVQ7Jo72j2xWN/uof7Y\nIEGCzlBshjczVmVoxxixISkf9YehnaYtk10I" +
       "xw17xn6CKud1+m5qJ9OB1WjQ71ABlX5vAA0Cthi7\nf9QOxws8HJ9n44/T0z" +
       "f8gRXnYNHZT7sVvMQV3MUVvOxXQWyoPx6n/RxtLegGKkWliUflUOlZ+cCc\n" +
       "KQWG3nx1rW24zcF/2w3ehi54XuXw3M3h+YE/eBIe/Mv7/z3wX6a9zZr+9zuZ" +
       "HZV+N4Z/byz5PzjA\n/f+xP//vWod/F7iC3VzBT/0qWME/usq3ywN9rizQW+" +
       "HocIDu2Dii/ZrjEOM4vOcLh8GBvt3x/ljM\nB9HegVynQBOxpvt9cHQ57ndt" +
       "HM8+4O4Pcvc/9Od+zOO+W8EfuYI4V3DJr4JYvD8+eB08u1gOZ0qz\nbgfn7o" +
       "2j2WUOwxCH4VN/MMR90+wv4P4CNFfr0qzHcb9n42j2X+5+grt/1Z/7ibVpJl" +
       "RwBbxeC5V+\nFVwvza6Uw5mWzdscnG/bMJoJjRwG3lUIYX8weMtGWfeFTZDN" +
       "MX3FXNN/WjZ3Of7v2jCeCZ3cf942\nCF2+/I8PrF02hZ4lBXFel4WdfhVcZ9" +
       "kUPlcWaEq0Oxyg79g4osU4Drx9EAb94RDzTbQ+8D9LvxGs\nS7Q+x/++jSPa" +
       "Xu4/bxuEEX/+r/N+IIxzBbwwCxN+FVwv0fYsB7pI4MVSz9HP4q0r/klo/ytL" +
       "6l48\nsutNo/Ed9uF06d9NNfAWmi2oquu7rPsbbdAwcVZhkamxv4fa7k8StO" +
       "Ma/vVBULVzRb0QDtqTpwlq\nW2cy5Gr6455xL0Etq88ADc6VW/4+grYslyeo" +
       "jt+4RR8A6ECUXs4ZNs2N/wH1toTesh0AAA==");
}
