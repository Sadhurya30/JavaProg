package Collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack obj = new Stack();
		
		obj.push("Sadhu");
		obj.push("Radhu");
		obj.push("Jeeva");
		obj.push("Jeeva");
		
				
		System.out.println(obj);
		
		System.out.println(obj.search("Jeeva"));
		
		System.out.println(obj.search("Shakthi"));

		
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		
		try {
			obj.pop();
		}
		catch(EmptyStackException e) {
			System.out.println("Stack is empty");
		}

	}

}
