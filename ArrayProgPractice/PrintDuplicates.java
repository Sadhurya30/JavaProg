package ArrayProgPractice;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,2,3,3,3,4,4,5,6,7,8,8,9,9,9};
		int count =1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
					count++;
				}
			}
			if(a[i]!=-1 && count>1)
			{
				System.out.println(a[i]);
			}
		}
	}

}
