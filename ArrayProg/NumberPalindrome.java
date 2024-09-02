package ArrayProg;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num = 1221;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev =0;
		int given = num;
		
		while(num>0) {
			int temp =num%10;
			rev = rev*10 +temp;
			num = num/10;
		}
		
		if(rev == given)
		{
			System.out.println(rev + " is a palindrome");
		}
		else {
			System.out.println(rev + " is not a palindrome");
		}
		
		

	}

}
