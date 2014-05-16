package net.javacoding.jspider.core.task;

public interface WorkerTask extends net.javacoding.jspider.core.task.Task {
    int WORKERTASK_SPIDERTASK = 1;
    int WORKERTASK_THINKERTASK = 2;
    
    public int getType();
    
    public void prepare();
    
    public void tearDown();
    
    String jlc$CompilerVersion$jl = "2.4.0";
    long jlc$SourceLastModified$jl = 1051926914000L;
    String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAL1Xa2wUVRS+3W23D1b74GHTFigFIwhsi0pV6g+bUtKlC127" +
       "FaTWLLczd8vQ2Zlh\n5u52qUokIlWMJEZ8JQj+ICExxBiN+seIBvAVTUx/KG" +
       "okKIZofARjDMRg9Jx7Z7uz0wI/TGwy0zsz\n53XP+c537h77lZQ5NmlSnAjf" +
       "aTEn0pWIU9thapdOHWcAXiWVU2WV8aO9hhkgJTES0FROqmOK06pS\nTls1tT" +
       "W6tiNnk2bL1HeO6CZ37Uyzsmbx5bFPJ9Y3Bkn1IKnWjASnXFO6TIOzHB8k4T" +
       "RLDzPb6VRV\npg6SWoMxNcFsjeraOAiaxiCpc7QRg/KMzZx+5ph6FgXrnIzF" +
       "bOEz/zJGwoppONzOKNy0HU5qYttp\nlrZmuKa3xjSHd8RIKKUxXXV2kF0kGC" +
       "NlKZ2OgOC8WH4XrcJi6zp8D+JVGoRpp6jC8iqlo5oBmVjo\n15ja8ZJeEADV" +
       "8jTj28wpV6UGhRekToakU2OkNcFtzRgB0TIzA144abiiURCqsKgySkdYkpN6" +
       "v1xc\nfgKpSpEWVOFkrl9MWIKaNfhq5qlWXyj89774xWZR81KVKTrGXw5KC3" +
       "xK/SzFbGYoTCpeykQORLdk\nmgKEgPBcn7CU6bzx7XtjPx5fKGUaZ5DpG97O" +
       "FJ5ULrc3zZ/s/KEyiGFUWKajIRSKdi6qGne/dOQs\nQPO8KYv4MZL/+F7/B1" +
       "seeYX9HCAVURJSTD2TNqKkkhlql7suh3VMM5h825dKOYxHSakuXoVM8Qzp\n" +
       "SGk6w3SEYG1Rvk2scxYhpByuErgiRP5V442T8GbTHoVyUGc0YnGy0mB8COuv" +
       "mCpUfmi7Y2kqs4cU\n02ZDHISGvPI5NF89VlKCfervMh0g2WPqoJ1Ujp775K" +
       "Hu3icelzVDnLmBcbIcPEYKHiOuxwh6jKDH\nSMEjKSkRvm4oziKWRcXu+eX1" +
       "jpr9K523AiQ4SCq1dDrD6bDOoOuorptjTE1yAbtaD8QFsgCW4WFA\nKASQ1M" +
       "GQ6AhIW9YmLX4kFvo3CisK8Jrc9c/nvyXH3kDQYJHnoHUZGpRsVMYWXpZ4YP" +
       "3Wx1uCKDRW\nitnPic67Ab34s7cOOSBvPz384J8nDlU1S/uo0yQMBMBXI8ur" +
       "dHdtKNJKKjvGD946mdisSTD7u8Mn\nPP7uvYcufcbPiBJVAktxCtiCll/g79" +
       "GitsJm9Qe/idoFu3d8ka0NvXY4HSDlg6RGsB81+CaqZ1iC\nAbtWaU6X+zJG" +
       "riv6XsxFsvE63J7npMkfl8dtR544MVmlXsjBGqVxXSnge52QqYF01sPVDtdc" +
       "t0PE\nf/xYh7fZOQG9WlFbDCgSBeIdYXbd9y8fubh74g5IXJSUZTFwyElNQW" +
       "5jBsfH3mPPzp914OyToojY\ni2h0KaLFXxeM+9KjobYv35l1SlQjPwOqPcMC" +
       "cicZpbYAtgGbYU6/fSH+zLO/TtwvkCahFuRgRDMo\npC1kZYZ1TYGFI8ZcDl" +
       "h4c19/b3f/QGeiN5mIR9fKpR9ccVtLA1llXTZ9c/CPNvX88rUSXPXeKe0V\n" +
       "7LnlH7Zk9o8XJKxgZFJn41T7Twelz8nTC46cf+Nc/xzJG3KuLZ42Wrw6craJ" +
       "yoatHOxh0dU8COmT\nyxcd29V/ZljupK6YW7qNTHr14dNs2d1hZQb2CsL0hV" +
       "SKfa0WbCjg1FIEqtvhanBB1TAdVLi4GdsZ\nF3eLx5Xi3uYWD9e34O1WvN0G" +
       "FZvnqdhAT3Sju8bPa0QUuRnMcFJBh4G7qAIhV04dG4RhDxXNnmHo\nRernHH" +
       "hu2cEv/QyEHVHvBYlsUlm8hw6e27vs7FefufPWg5CC1E/JPZm3Hjs+GcADiA" +
       "8e4kSHqxJx\nygEySha3bpUcQHHuaq5a1dYuo5vDyY3XnCs4URAh86901hDo" +
       "mLjv9/BeevIB3AWavgu8cdNaqbMs\n0wtZ8xvZII5WeT6q3rzwu3XtRx/25y" +
       "+Ig9Obv2K1pPL+q8e/WX366z0AvUFSvrEv0dUZ64ZsLryq\nu6RSm228J7hN" +
       "+0jk1SXMaQfCYqWOYpqsshmcZ42BqYxPH4Vx21SYCofegt/n/+q58EzZnW8G" +
       "kHUL\nUwQtLPFx8qyUaaepjg7yJ9Aqvs02xwpvfAQ9y+2fZreXmn29VOi/Iu" +
       "CLvurxwlxwbwxyP7tAnp22\nTXfioM7tnpz/4of0pSDyeamjjTPB16RoZrsW" +
       "8K56PuIznH7LRxjPJ24NEVL3F+2iEa6b3F3c9B93\n4Y/hmgFqEKBlM4vaMs" +
       "3tltTp4KQ0a+KPKMlnbTNF3gTXCjfyFf935FmgMM6ovdYcM/DZJsCFVYXz\n" +
       "Ic7D+mm/9uRvEqVlcuvSE1btxwKaU78bKuDwnsrouveA4FmHIFEpTTivkGiU" +
       "nLObk+ZrEQykE/+J\nnTwi1fZw0ngVNdDAf16NCSD7mTWgiu7KK7+Pk+uL5S" +
       "FDhQev6FMwvkAUl/unaNNzbpEsnbP+BQiw\nsFSJDwAA");
}
