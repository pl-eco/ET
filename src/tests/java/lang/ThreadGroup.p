package java.lang;

public class ThreadGroup{
	public Thread thread;

	public ThreadGroup(){}

	public ThreadGroup(String name){}

	public void add(Thread t){
		thread = t;
	}
	public String getName(){
		return "ThreadGroupNamee";
	}
}