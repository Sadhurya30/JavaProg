package ExtraPrograms;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 6;
		
		int sum =0;
		
		for(int i=1;i<num ;i++)
		{
			if(num%i==0)
			{
				sum = sum+i;
			}
		}
		if(sum == num)
		{
			System.out.println("its a perfect number");
			
		}
		else {
			System.out.println("its not a perfect number");
		}

	}

}
