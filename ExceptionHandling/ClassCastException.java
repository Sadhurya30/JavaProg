package ExceptionHandling;

public class ClassCastException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		
		System.out.println(c.b);
		System.out.println(c.a);
		
		Parent p = new Parent();
		
		System.out.println(p.a);
		
		Child c2 = (Child)p;
		System.out.println(c2.a);
		System.out.println(c2.b);
		

	}

}
