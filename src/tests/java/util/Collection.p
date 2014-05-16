package java.util;

public interface Collection{
//    int size();
//  boolean isEmpty();
 //boolean contains(Object o);
 Object toArray()[];
 boolean add(Object o);
//  boolean remove(Object o);
 Object toArray(Object[] a)[];
 
 public Iterator iterator();
 
 public boolean contains(Object o);
 
 	public boolean remove(Object o);
 	
 	public boolean addAll(Collection c);
 	
 	public int size();
 	
 	public boolean isEmpty();
 	
 	public void clear();
}