package java.util.concurrent;

public class DefaultThreadFactory implements ThreadFactory{
	public Thread newThread(Runnable r){ return new Thread(r);}
}