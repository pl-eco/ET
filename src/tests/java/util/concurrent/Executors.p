package java.util.concurrent;

public class Executors{

/*
	public static ExecutorService newFixedThreadPool(int nThreads){
		return new ThreadPoolExecutor();
	}
*/	
	
	public static ExecutorService newCachedThreadPool(){
		return new ThreadPoolExecutor();
	}
	
	public static ExecutorService newCachedThreadPool(ThreadFactory factory){
		return new ThreadPoolExecutor();
	}
	
	public static ExecutorService newFixedThreadPool(int i){ return new ThreadPoolExecutor(); }
	
	public static ThreadFactory defaultThreadFactory(){ return new DefaultThreadFactory(); }
}
