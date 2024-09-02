package ArrayProg;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //int num =6;
      
	  Scanner sc = new Scanner(System.in);
	
	  int num = sc.nextInt();
      for(int i=1;i<=num;i++)
      {
    	  if(num%i==0)
    	  {
    		  System.out.println(i);
    	  }
      }
	}

}
