package java.util;

public class HashMap implements Map{
	public Object field;
	
	public HashMap(){}
	
	public HashMap(int i){}
	public Object put(Object key, Object value) {
		field = value;
		return value;
	}
	
	public boolean containsKey(Object name){ return true;}
	
	public Object get(Object key){
		return field;
	}
	
	public Object remove(Object key){
		return field;
	}
	
	public int size(){return 1;}
	
	public Collection values(){
	/*	List list = new ArrayList();
		list.add(field);
		return list;
		*/
		Set set = new HashSet();
		set.add(field);
		return set;
	}
	
	public Set keySet(){
		Set s = new HashSet();
		s.add(field);
		
		return s;
	}
	
	public Object clone(){
		HashMap map = new HashMap();
		map.put("", field);
		return map;
	}
	
	public void clear(){};
	
	public Set entrySet() {
        Set set = new TreeSet();
        set.add(field);
        return set;
  }
  
  public void putAll(Map m) {
  	field = m.get("");
  }
}