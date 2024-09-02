package ArrayProg;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5,9,4,5,5,2,4,3};
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
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
				System.out.println(a[i] + " ") ;
			}
		}
	}

}
