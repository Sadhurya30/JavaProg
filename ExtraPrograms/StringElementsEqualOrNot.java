package ExtraPrograms;

public class StringElementsEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1[] = {"qspiders","jspiders","qspiders"};
		String s2[] = {"qspiders","jspiders","qspiders"};
		
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals(s2[i]))
			{
				System.out.println(s1[i] + "and" + s2[i] + "is same");
			}
			else {
				System.out.println(s1[i]+ "and" + s2[i]+ "is different");
			}
		}
	}

}
