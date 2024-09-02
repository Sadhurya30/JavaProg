package InterviewQuestions;

public class CountOfUpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "QsPiDeRs";
		
		char ch[] = s.toCharArray();
		int upperCaseCount =0, lowerCaseCount =0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>64 && ch[i]<91)
			{
				upperCaseCount++;
			}
			else if(ch[i]>96 && ch[i]<123)
			{
				lowerCaseCount++;
			}
		}
		System.out.println(upperCaseCount);
		System.out.println(lowerCaseCount);

	}

}
