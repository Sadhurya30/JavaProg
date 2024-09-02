package StringProg;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Malayalam";
		String rev = "";
		
		char ch[] = s.toCharArray();
		
		for(int i= s.length()-1;i>=0;i--)
		{
			rev= rev+s.charAt(i);
			
		}
		
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println(rev + " is a palindrome");
		}
		else {
			System.out.println(rev + " not a palindrome");
		}
				
		
	}

}
