package ExtraPrograms;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// when the digits are added and digits are multiplies are same then its a spy number
		
		int num = 132;
		
		int lastDigit;
		int sum=0;
		int product =1;
		
		while(num>0)
		{
			lastDigit = num%10;
			sum = sum + lastDigit;
			product = product * lastDigit;
			num = num/10;
		}
		if(sum == product)
		{
			System.out.println("its a spy number");
		}
		else {
			System.out.println("its not a spy number");
		}
	}

}
