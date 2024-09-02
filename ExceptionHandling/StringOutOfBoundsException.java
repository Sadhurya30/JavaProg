package ExceptionHandling;

public class StringOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s ="Sadhurya";
        
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(11));
	}

}
