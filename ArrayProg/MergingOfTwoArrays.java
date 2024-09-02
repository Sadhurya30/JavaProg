package ArrayProg;

import java.util.Arrays;

public class MergingOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		
		int c[] = new int[a.length + b.length];
		int count =0;
		
		for(int i=0;i<a.length;i++)
		{
			c[i] = a[i];
			count++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[count++] = b[i];
		}
		
	
		System.out.println(Arrays.toString(c));
	}

}
