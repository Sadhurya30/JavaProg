package ExtraPrograms;

public class ReversingTheStringFully {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "My name is Sadhurya";
		
		String s1[] =s.split(" ");
		String rev = "";
		
		for(int i=s1.length-1;i>=0;i--)
		{
		   rev = rev + reverse(s1[i]+ " ");	
		}
		System.out.println(rev);
	}
	
	public static String reverse(String s)
	{
		char[] ch = s.toCharArray();
		String  rev = "";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev = rev + ch[i];
		}
		return rev;
	}
}
