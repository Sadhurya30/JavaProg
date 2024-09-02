package ArrayProg;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5,9,1,2,3};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j] =temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
