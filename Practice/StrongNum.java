package Practice;

public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=145;
     int given =n;
     int sum =0;
     int fact=1;
     int rem;
     
     while(n>0)
     {
    	rem =n%10;
    	for(int i=1;i<=rem;i++)
    	{
    		fact*=i;
    		sum+=fact;
    	}
    	System.out.println("factorial is" + fact);
    	//sum+=fact;
    	n=n/10;
     }
     
     if(sum ==given)
     {
    	 System.out.println("its a strong number");
     }
     else {
    	 System.out.println("not a strong number");
     }
	}

}
