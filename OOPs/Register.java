package OOPs;

import java.util.Scanner;
class Register 
{
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNo;
	private String password;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
        this.lastName = lastName;
	}

	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public long getPhoneNo()
	{
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}

	public Register(String firstName,String lastName,String email,long phoneNo, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
	}

}

class RegisterDriver
{
  public static void main (String[] args)
	{
	  Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first name: ");
	  String firstName1 = sc.next();
	  System.out.println("Enter the last name: ");
	  String lastName1 = sc.next();
	  System.out.println("Enter the emailID: ");
	  String emailId1 = sc.next();
	  System.out.println("Enter the phone number: ");
	  long phoneNo1 = sc.nextLong();
      System.out.println("Enter the password: ");
	  String password1 = sc.next();
      System.out.println("===============================================");

      Register r1 = new Register(firstName1,lastName1,emailId1,phoneNo1,password1);

	  System.out.println("Enter the first name: " + r1.getFirstName());
	  System.out.println("Enter the last name: " + r1.getLastName());
	  System.out.println("Enter the mailId: " + r1.getEmail());
	  System.out.println("Enter the phoneNo: " + r1.getPhoneNo());
	  System.out.println("Enter the password: " + r1.getPassword());

	  System.out.println("===============================================");

	  r1.setFirstName("Meera");
	  System.out.println("Enter the first name: " + r1.getFirstName());

	  r1.setLastName("S");
      System.out.println("Enter the last name: " + r1.getLastName());

	  r1.setEmail("meera123@gmail.com");
	  System.out.println("Enter the mailId: " + r1.getEmail());

      r1.setPhoneNo(8825958171l);
	  System.out.println("Enter the phoneNo: " + r1.getPhoneNo());

	  r1.setPassword("sad@123");
	  System.out.println("Enter the password: " + r1.getPassword());
	  System.out.println("===============================================");


	  System.out.println("Enter the first name: ");
	  String firstName2 = sc.next();
	  System.out.println("Enter the last name: ");
	  String lastName2 = sc.next();
	  System.out.println("Enter the emailID: ");
	  String emailId2 = sc.next();
	  System.out.println("Enter the phone number: ");
	  long phoneNo2 = sc.nextLong();
      System.out.println("Enter the password: ");
	  String password2 = sc.next();
      System.out.println("===============================================");

	  Register r2 = new Register(firstName2,lastName2,emailId2,phoneNo2,password2);

      System.out.println("Enter the first name: " + r2.getFirstName());
	  System.out.println("Enter the last name: " + r2.getLastName());
	  System.out.println("Enter the mailId: " + r2.getEmail());
	  System.out.println("Enter the phoneNo: " + r2.getPhoneNo());
	  System.out.println("Enter the password: " + r2.getPassword());

      System.out.println("===============================================");

	  r2.setFirstName("Jasmine");
	  System.out.println("Enter the first name: " + r2.getFirstName());

	  r2.setLastName("R");
      System.out.println("Enter the last name: " + r2.getLastName());

	  r2.setEmail("jasmine123@gmail.com");
	  System.out.println("Enter the mailId: " + r2.getEmail());

      r2.setPhoneNo(9940354692l);
	  System.out.println("Enter the phoneNo: " + r2.getPhoneNo());

	  r2.setPassword("edad@123");
	  System.out.println("Enter the password: " + r2.getPassword());
	  System.out.println("===============================================");


	  System.out.println("Enter the first name: ");
	  String firstName3 = sc.next();
	  System.out.println("Enter the last name: ");
	  String lastName3 = sc.next();
	  System.out.println("Enter the emailID: ");
	  String emailId3 = sc.next();
	  System.out.println("Enter the phone number: ");
	  long phoneNo3 = sc.nextLong();
      System.out.println("Enter the password: ");
	  String password3 = sc.next();
      System.out.println("===============================================");

      Register r3 = new Register(firstName3,lastName3,emailId3,phoneNo3,password3);

	  System.out.println("Enter the first name: " + r3.getFirstName());
	  System.out.println("Enter the last name: " + r3.getLastName());
	  System.out.println("Enter the mailId: " + r3.getEmail());
	  System.out.println("Enter the phoneNo: " + r3.getPhoneNo());
	  System.out.println("Enter the password: " + r3.getPassword());

	  System.out.println("===============================================");

	  r3.setFirstName("Deeksha");
	  System.out.println("Enter the first name: " + r3.getFirstName());

	  r3.setLastName("R");
      System.out.println("Enter the last name: " + r3.getLastName());

	  r3.setEmail("deeksha123@gmail.com");
	  System.out.println("Enter the mailId: " + r3.getEmail());

      r3.setPhoneNo(7200868870l);
	  System.out.println("Enter the phoneNo: " + r3.getPhoneNo());

	  r3.setPassword("deek@123");
	  System.out.println("Enter the password: " + r3.getPassword());
	  System.out.println("===============================================");






	}

}
