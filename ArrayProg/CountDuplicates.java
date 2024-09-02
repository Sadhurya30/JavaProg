package ArrayProg;

public class CountDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,2,2,2,2,5,5};
		
		for(int i=0;i<a.length;i++)
		{
			int count =1;
		  for(int j=i+1;j<a.length;j++)
		  {
			if(a[i] == a[j])
			{
				a[j]=-1;
				count++;
			}
		  }
		  if(a[i]!=-1)
		  {
			  System.out.println("count of " + a[i] + "=" + count);
		  }
	}

}
}
