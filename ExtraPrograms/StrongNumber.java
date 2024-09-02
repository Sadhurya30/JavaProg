package ExtraPrograms;
public class StrongNumber {
	public static int factorial(int n)
	{
		int fact =1;
		for(int i=1;i<=n;i++)
		{
			fact =fact*i;
		}
		return fact;
	}
    public static void main(String[] args) {
//factorial of the digits should given the number itself 
		
		int num =145;
		int given =num;
		int lastDigit =0;
		int fact =1;
		int sum =0;
		
		while(num>0) {
			lastDigit = num%10;
			sum = sum + factorial(lastDigit);
			num = num/10;
			
		}
		if(sum == given)
		{
			System.out.println("its a strong number");
		}
		else {
			System.out.println("its not a strong number");
		}
		
	}

}
