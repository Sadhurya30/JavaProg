package Collection;

import java.util.HashMap;

public class HashMapProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap obj = new HashMap();
		
		obj.put(1, "Sadhu");
		obj.put(2, "Radhu");
		obj.put(3, "Jeeva");
		obj.put(4, "bala");
		
		System.out.println(obj);
		
		HashMap<Integer,String> obj1 = new HashMap();
		
		
		obj1.put(1, "Sadhu");
		obj1.put(2, "Radhu");
		obj1.put(3, "Jeeva");
		obj1.put(4, "bala");
		
		System.out.println(obj1);
		
		System.out.println(obj1.containsKey(3));
		System.out.println(obj1.containsValue("Sadhu"));
		
		System.out.println(obj1.keySet());
		System.out.println(obj1.values());
		System.out.println(obj1.entrySet());
		System.out.println(obj1.size());
		System.out.println(obj1.isEmpty());
		obj1.remove(1);
		
		System.out.println(obj1);
		
		System.out.println(obj1.get(2));
		
		//System.out.println(putAll(obj));
	}

}
