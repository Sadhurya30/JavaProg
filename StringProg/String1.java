package StringProg;

import java.util.Arrays;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="sadhurya";
		
		String s1 = "Palani";
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.concat(s1));
		
		//System.out.println(s1.append("Velan"));
		
		
		String a ="I love India";
		
		String a2[] = a.split("");
		
		for(int i=0;i<a2.length;i++)
		{
			System.out.print(a2[i]);
			
		}
		System.out.println();
		
		System.out.println(Arrays.toString(a2));
		
		

	}

}
