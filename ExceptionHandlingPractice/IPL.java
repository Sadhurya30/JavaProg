package ExceptionHandlingPractice;

import java.util.Scanner;

public class IPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		String color = sc.next();
		
		
		try {
			getTeam(color);
		}
		catch(CSKException e)
		{
			e.printStackTrace();
			System.out.println("Chennai Super kings");
		}
		catch(RCBException e)
		{
			e.printStackTrace();
			System.out.println("Royal Challenger Bangalore");
		}
		catch(MIException e)
		{
			e.printStackTrace();
			System.out.println("Mumbai Indians");
		}

	}
	public static void getTeam(String color) throws CSKException,RCBException,MIException{
		if(color.equals("Yellow"))
		{
			throw new CSKException();
		}
		else if(color.equals("Red"))
		{
			throw new RCBException();
		}
		else {
			throw new MIException();
		}
	}

}
