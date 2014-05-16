package java.util.concurrent;

public class Semaphore{
	public Semaphore(int i, boolean b){}

	public boolean hasQueuedThreads(){  return true;}
	
	public int getQueueLength(){  return 1;}	
	
	 public void release() {}
	
	 public void release(int permits) {}
	 
	 public void acquire(){}

}