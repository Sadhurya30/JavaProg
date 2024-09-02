package StringProgPractice;

public class StringPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Sadhurya";
		
		String s1 = "Palanivelan";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(7));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(6));
		System.out.println(s.concat(s1));
		
		String a1 = "I love India";
		String a2[] = a1.split(" ");
		
		for(int i=0;i<a2.length;i++)
		{
			System.out.println(a2[i]);
		}
	}

}
