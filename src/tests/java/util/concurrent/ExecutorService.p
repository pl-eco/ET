package java.util.concurrent;

public interface ExecutorService{

	public void execute(Runnable command);

	public void shutdown();

	public boolean isTerminated();
	
	public Future submit(Runnable o);
}