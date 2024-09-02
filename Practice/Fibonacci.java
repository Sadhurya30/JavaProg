package Practice;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8; 
		int firstNum = 0;
		int secondNum =1;
		System.out.println(firstNum);
		System.out.println(secondNum);
		int sum =0;
		
		for(int i=2;i<n;i++)
		{
			sum = firstNum + secondNum;
			System.out.println(sum);
			firstNum = secondNum;
			secondNum = sum;
			
		}

	}

}
