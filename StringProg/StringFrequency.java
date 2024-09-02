package StringProg;

public class StringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Qspiders Vadapalani Qspiders Jspiders arumbakkam Qspiders";
		
		String s1[] = s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			int count =1;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					count++;
					s1[j]= " ";
				}
			}
			if(s1[i]!=" ")
			{
				System.out.println(s1[i] + " " + count );
			}
		}
		
	}

}
