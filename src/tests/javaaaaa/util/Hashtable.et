package java.util;

public class Hashtable{
	
	public Object field;
	
	public Hashtable(){}
	public Hashtable(int i){}
	public boolean containsKey(Object obj){
		return false;
	}
	
	public void put(Object key, Object obj){
		field = obj;
	}
		
	public Object get(Object obj){
		return field;
	}
	
	public boolean remove(Object o){ return true;}
	
	public Enumeration keys(){
		Enumeration e = new Enumerator(field);
		return e;
	}
	
	 public void clear() { }
	 
	 public Enumeration elements() { return new Enumerator(field); }
	 
	 public int size(){ return 1; }
	 
	 public boolean isEmpty(){ return false;}
	 
	 public Object clone(){
		Hashtable table = new Hashtable();
		table.put("", field);
		return table;
	}
}