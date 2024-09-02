package ArrayProg;

import java.util.Arrays;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9,10};
		int c[] = new int [a.length + b.length];
		
		for(int i=0,k=0;i<a.length;i++)
		{
			c[k]=a[i];
			System.out.print(c[k]+ " ");
			for(int j=0;j<b.length;j++)
			{
				c[k] =b[i];
				System.out.print(c[k]+ " ");
				break;
			}
		}
		
		
	}
}
