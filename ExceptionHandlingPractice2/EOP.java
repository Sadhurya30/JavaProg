package ExceptionHandlingPractice2;
//exception object propagation
public class EOP {

	//before achieving eop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Main start");
      m1();
      System.out.println("Main end");
	}
	
	public static void m1() {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Hello");
		}
	}

}
//after achieving eop


