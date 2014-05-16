package java.util.concurrent;

public class ThreadPoolExecutor implements ExecutorService{

	public void execute(Runnable command){
		command.run();
	}

	public void shutdown(){}
	
	
//	public void setRejectedExecutionHandler(DiscardPolicy dp){}
	
	//public static class DiscardPolicy{}
	
	public boolean isTerminated(){ return true;}
	
	public Future submit(Runnable r){ return null;}
}