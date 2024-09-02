package ArrayProgPractice;

import java.util.Arrays;

public class MergeOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9,10};
		
		int c[] =  new int[a.length + b.length];
		int count=0;
		for(int i=0,j=0;i<a.length;i++)
		{
			c[j++] = a[i];
			count++;
		}
		for(int j=0;j<b.length;j++)
		{
			c[count++] = b[j];
		}
		System.out.println(Arrays.toString(c));
	}

}
