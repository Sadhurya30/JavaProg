package ExtraPrograms;

public class CountUpperLowerCaseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "ABCDabcd1234";
		
		char[] ch = a.toCharArray();
		int ucount=0;
		int lcount=0;
		int digits =0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>64 && ch[i]<91)
			{
				ucount++;
			}
			else if(ch[i]>96 && ch[i]<123) {
				lcount++;
			}
			else if(ch[i]>47 && ch[i]<58) {
				digits++;
			}
		}
		System.out.println(ucount);
		System.out.println(lcount);
		System.out.println(digits);
	}

}
