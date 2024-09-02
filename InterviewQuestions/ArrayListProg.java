package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList i1 = new ArrayList();
		
		i1.add("java");
		i1.add(false);
		i1.add(14.98);
		i1.add(10);
		i1.add('g');
		
	System.out.println(i1);
		
		Iterator obj1 = i1.iterator();
		System.out.println(obj1.hasNext());
		System.out.println(obj1.next());
		obj1.remove();
		
		System.out.println(obj1);
		
	}

}
