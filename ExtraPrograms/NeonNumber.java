package ExtraPrograms;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 when the number is squared and then the digits of the squared  number are added
		 should be same to the number before squaring
		*/
		int num = 9;
		int squared = num*num;
		int lastDigit;
		int sum=0;
		
		while(squared>0)
		{
			lastDigit = squared%10;
			sum = sum + lastDigit;
			squared = squared/10;
		}
		if(num == sum)
		{
			System.out.println("its a neon number");
		}
		else {
			System.out.println("its not a neon number");
		}
		
	}

}
