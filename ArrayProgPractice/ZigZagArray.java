package ArrayProgPractice;

public class ZigZagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		
		int b[] = {6,7,8,9,10};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[i] + " ");
				break;
			}
		}

	}

}
