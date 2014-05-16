package java.util;

public class MySet implements Set{
	private Object field;
	
	public boolean add(Object obj){
		field = obj;
		return true;
	}

	public Object next(){
		return field;
	}
	
	public boolean isEmpty(){  return true;}
	
	public void clear(){}
	
	public Iterator iterator(){
		return new MyIterator(field);
	}
	
	public boolean remove(Object o){ return true;	}
	public Object remove(int i){return field;}
	
	public int size(){return 1;}
	
		public Object toArray(Object[] o)[]{
			o[0] = field;
			return o;
		}
		
		public Object toArray()[]{
			Object[] o = new Object[1];
			o[0] = field;
			return o;
		}
		
		public boolean contains(Object o){ return true;}
		
		public boolean addAll(Collection c){
			field = c.iterator().next();
			return true;
		}
}