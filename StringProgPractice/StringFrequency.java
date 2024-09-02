package StringProgPractice;

public class StringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Qspiders Jspiders Qspiders";
		
		String s1[] = s.split(" ");
		int count=1;
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					count++;
					s1[j]=" ";
					
				}
			}
			if(s1[i]!=" ")
			{
				System.out.println("the count of " + s1[i] + " is " + count );
			}
		}
	}

}
