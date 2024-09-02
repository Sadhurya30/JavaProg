package StringProgPractice;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "malayalam";
		char [] ch = s.toCharArray();
		String rev = "";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		
		if(s.equals(rev))
		{
			System.out.println(s+ " is a Palindrome");
		}
		else {
			System.out.println(s+ " is not a Palindrome");
		}
	}

}
