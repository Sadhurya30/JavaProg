package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		System.out.println("Enter the number");
		
		int b = sc.nextInt();
		
		int res = b/a;
		
		System.out.println(res);
		
		
		

	}

}
