package Practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 153;
		int temp;
		int sum=0;
		int given=n;
		
		while(n>0)
		{
			temp = n%10;
			sum = sum + temp*temp*temp;
			n = n/10;
		}
		
		if(given==sum)
		{
			System.out.println("its an armstrong number");
		}
		else {
			System.out.println("not an armstrong number");
		}
	}

}
