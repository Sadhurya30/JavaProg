package ArrayProg;

import java.util.Arrays;

public class EvenAndOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,2,4,7,9,8,10,12};
		int evencount =0,oddcount =0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		
		int even[] = new int[evencount];
		int odd[] = new int[oddcount];
		
		for(int i=0,j=0,k=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[j++] = a[i];
			}
			else {
				odd[k++] = a[i];
			}
		}
		
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));

	}

}
