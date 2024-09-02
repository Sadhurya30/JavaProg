package ExceptionHandling;

import java.util.Scanner;

public class IPL {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the colour");
        String colour = sc.next();
        
       
        
        try {
        	getTeam(colour);
        }
        catch(CSKException e)
        {
        	e.printStackTrace();
        	System.out.println("Chennai Super Kings");
        }
        catch(RCBException e)
        {
        	e.printStackTrace();
        	System.out.println("Royal Challengers Banglore");
        }
        catch(MIException e)
        {
        	e.printStackTrace();
        	System.out.println("Mumbai Indians");
        }
	}
	 public static void getTeam(String colour) throws CSKException,RCBException,MIException
     {
     	if(colour.equals("yellow"))
     	{
     		throw new CSKException();
     	}
     	else if(colour.equals("Red"))
     	{
     		throw new RCBException();
     	}
     	else {
     		throw new MIException();
     	}
     }

}
