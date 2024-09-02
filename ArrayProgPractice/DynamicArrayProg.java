package ArrayProgPractice;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrayProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		for(int i=0;i<a.length;i++)
		{
	        System.out.println("enter the element");
			a[i]= sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println(Arrays.toString(a));

	}

}
