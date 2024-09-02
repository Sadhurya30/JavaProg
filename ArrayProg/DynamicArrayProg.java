package ArrayProg;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrayProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the element");
			a[i]=sc.nextInt();
			System.out.println(a[i]);
		}
		for(int i =0 ;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
		
	}

}
