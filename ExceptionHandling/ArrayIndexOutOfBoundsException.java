package ExceptionHandling;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
        System.out.println(a.length);
        System.out.println(a[9]);
	}

}
