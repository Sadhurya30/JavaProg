package ExceptionHandling;
import java.util.Scanner;

public class Marriage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int a = sc.nextInt();
		
		if(a<18)
		{
			try {
				throw new HaveAPatienceException();
			}
			catch(HaveAPatienceException e){
				System.out.println("Go to school");
			}
				
		}
		else if(a>60) {
			try {
				throw new OutOfServiceException();
			}
			catch(OutOfServiceException e) {
				System.out.println("Better luck next life");
			}
		}
		else {
			System.out.println("Congratulations");
		}
		}

	}


