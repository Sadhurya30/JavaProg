package Collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //generic collection
		ArrayList<Integer> obj = new ArrayList();
     
     obj.add(10);
     obj.add(20);
     obj.add(30);
     obj.add(40);
    // obj.add("sadhu");
     
     System.out.println(obj);
     
     System.out.println(obj.get(0));
     System.out.println(obj.get(1));
     System.out.println(obj.get(2));
     System.out.println(obj.get(3));
	}

}
