package java.util;

public class ArrayList implements List{
	private Object field;
	
	public ArrayList(){}
	
	public ArrayList(int i){}
	
	public ArrayList(Collection c){
		field = c.iterator().next();
	}
	
	public boolean add(Object obj){
			field = obj;
			return true;
	}
	
	public boolean remove(Object obj){
		return true;
	}
	
	public Object remove(int i){
		return field;
	}
	
	public int size(){
			return 1;
	}
	
	public Object get(int i){
		return field;
	}
	
	public Object toArray()[]{
			Object[] o = new Object[1];
			o[0] = field;
			return o;
	}
	
	public Object toArray(Object[] a)[] {
		return a;
	}

	public boolean isEmpty(){return true;}
	
	public boolean contains(Object o){return false;}
	
	public Iterator iterator(){
			return new MyIterator(field);
	}
	
	public List subList(int fromIndex, int toIndex){ return this;}
	
	public Object set(int i, Object o){ field = o; return o; }
	
	public void clear(){}
	
	public boolean addAll(Collection c){
			field = c.iterator().next();
			return true;
		}
}