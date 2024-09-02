package ArrayProgPractice;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num =1222;
       int given = num;
       int rev=0;
       
       
       while(num>0)
       {
    	   int temp =num%10;
    	   rev= rev*10+temp;
    	   num = num/10;
    	   
       }
       if(given==rev)
       {
    	   System.out.println(rev + " is a palindrome");
       }
       else {
    	   System.out.println(rev + " is not a palindrome");
       }
	}

}
