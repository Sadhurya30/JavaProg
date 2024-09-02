package ArrayProg;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5,9,4,5,5,2,4,3};
		//int count =0;
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]==a[j])
        		{
        			a[i]=-1;
        			//count++;
        			
        		}
        	}
        	if(a[i]!=-1)
        	{
        		System.out.println(a[i]+ " ");
        	}
        }

		
	}
}