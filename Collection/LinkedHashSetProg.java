package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     LinkedHashSet obj = new LinkedHashSet();
		
		obj.add("java");
		obj.add(true);
		obj.add(25);
		obj.add('s');
		obj.add(null);
		obj.add("java");
		obj.add(true);
		obj.add(25);
		obj.add('s');
		obj.add(null);
		
		System.out.println(obj);

	}

}
