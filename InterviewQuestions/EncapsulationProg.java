package InterviewQuestions;

public class EncapsulationProg {
	
	private int a=10;
	
	public int get() {
		return a;
	}
	
	public void set(int a1)
	{
		a=a1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       EncapsulationProg e1 = new EncapsulationProg();
       System.out.println(e1.get());
       
       e1.set(25);
       
       System.out.println(e1.get());
		
	}

}
