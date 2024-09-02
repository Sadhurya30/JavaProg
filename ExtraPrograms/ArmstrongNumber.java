package ExtraPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =153;
		int temp ;
		int sum=0;
		int given =num;
		
		
		while(num>0)
		{
			temp = num%10;
			sum = sum + temp*temp*temp;
			num= num/10;
		}
		if(sum == given)
		{
			System.out.println("its an armstrong number");
		}
		else {
			System.out.println("its not an armstrong number");
		}
	}

}
