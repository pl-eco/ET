package java.lang;

public class Thread implements Runnable{
	public final static int MIN_PRIORITY = 1;
	public final static int MAX_PRIORITY = 10;
	public final static int NORM_PRIORITY = 5;

	private Runnable r;
	
	public Thread(){};
	
	public Thread(Runnable ab){
		r = ab;
	}
	
	public Thread(ThreadGroup group, Runnable target, String name,
                  long stackSize) {
  		r = target;
  		group.add(this);
  }
	
	public Thread(ThreadGroup tg, String name){
		tg.add(this);
	}
	
	public final ThreadGroup getThreadGroup() {
		ThreadGroup tg = new ThreadGroup();
		tg.add(this);
		return tg;
	}
	
	public boolean isDaemon(){
		 return false;
	}
	public Thread(String s){}
	
	public Thread(Runnable ab, String name){
		r = ab;
	}
	
	public void run(){
		r.run();
	}
	
	public void start(){
		r.run();
	}
	
	public static Thread currentThread(){
		return new Thread();
	}
	
	public void interrupt(){}
	
	public boolean isInterrupted(){ return false;}
	
	public static boolean interrupted(){ return false; }
	
	public boolean setDaemon(boolean is){ return false;}
	
	public static void sleep(long s){}
	
	public String getName(){
		return "threadName";
	}
	public void join(){}
	
	public void join(long ms, int ns){}
	
	public static void yield(){}
	
	public final int getPriority() { return 1; }
	
	public ClassLoader getContextClassLoader() { return null; }
	
	public boolean isAlive(){ return true;}
	
	public final void setName(String name) {}
	
	public final void setPriority(int newPriority) {}
	
	public static void sleep(long millis, int nanos){} 
	
	public void setContextClassLoader(ClassLoader cl) {}
	
	public void setUncaughtExceptionHandler(Object o){}
}