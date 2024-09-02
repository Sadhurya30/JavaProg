package ArrayProgPractice;

import java.util.Arrays;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		int evenCount=0,oddCount=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		int even[] = new int[evenCount];
		int odd[] = new int[oddCount];
		
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
