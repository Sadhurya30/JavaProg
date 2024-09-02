package Collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//non generic collection
		ArrayList obj = new  ArrayList();
		
		obj.add("Sadhu");
		obj.add(null);
		obj.add(10);
		obj.add(10.387);
		obj.add(false);
		obj.add('f');
		
		System.out.println(obj);
		System.out.println(obj.get(0));
		System.out.println(obj.get(1));
		System.out.println(obj.get(2));
		System.out.println(obj.get(3));
		System.out.println(obj.get(4));
	}

}
