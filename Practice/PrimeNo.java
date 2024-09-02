package Practice;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=14;
		int count=1;
		for(int i=2;i<n/2;i++)
		{
			
			if(n%i==0)
			{
				count++;
			}
		}
		if(n<=1 || count>1)
		{
			System.out.println("not a prime number");
		}
		else {
			System.out.println("its a prime number");
		}
	}

}
