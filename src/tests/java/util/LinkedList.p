package java.util;

public class LinkedList implements List{
	private Object field;
	
	public boolean add(Object obj){
		field = obj;
		return true;
	}
	
	public boolean remove(Object obj){
		return true;
	}
	
	public Object remove(int i){ return field; }
	public int size(){
		return 1;
	}
	
	public Object get(int i){
		return field;
	}
	
	public boolean isEmpty(){ return true;}
	
	public Object removeFirst(){ return field; }
	
	public Object[] toArray(){
		Object[] ar = new Object[1];
		ar[0] = field;
		return ar;
	}
	
	public Object[] toArray(Object[] o){ return o;}
	
	public Iterator iterator(){
		return new MyIterator(field);
	}
	
	public List subList(int fromIndex, int toIndex){ return this;}
	
	public boolean contains(Object o){  return true;}
	
	public void clear(){}
	
	public Object set(int i, Object o){  field = o; } 

	public boolean addAll(Collection c){
			field = c.iterator().next();
			return true;
		}
}