package Collection;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> obj = new ArrayList();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		
		for(Integer i : obj)
		{
			System.out.println(i);
		}
		
		System.out.println("****************************");
		
		
		for(Object o : obj)
		{
			System.out.println(o);
		}
		
		ArrayList obj1 = new ArrayList();
		obj1.add(10);
		obj1.add(false);
		obj1.add("Sadhu");
		obj1.add('c');
		
		System.out.println(obj1);
		
		for(Object o : obj1)
		{
			System.out.println(o);
		}
	}

}
