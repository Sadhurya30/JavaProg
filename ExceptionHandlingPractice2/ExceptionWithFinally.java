package ExceptionHandlingPractice2;

public class ExceptionWithFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			System.out.println(10/0);
			}
		catch(NullPointerException e)
		{
			System.out.println("Hello Meena");
		}
		finally {
			System.out.println("HI sadhu");
		}
	}
	

}
