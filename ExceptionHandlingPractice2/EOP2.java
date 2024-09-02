package ExceptionHandlingPractice2;

public class EOP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //after achieving eop
		
		System.out.println("main start");
		
		try {
			m1();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		    System.out.println("Hello laila");	
		}
		System.out.println("main end");
	}
	public static void m1()
	{
		System.out.println(10/0);
	}

}
