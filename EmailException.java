import java.util.Scanner;

class UserPasswordException extends Exception
{
	public String getMessage()
	{
          return "Invalid user details. Try again!";
	}
}

class Details
{
	String user_name = "akki";
	int password = 1111;
	String UN;
	int PWD;
	void acceptInput()
	{
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the user name : ");
	   UN = s.next();
	   System.out.println("Enter the password : ");
	   PWD = s.nextInt();
	}
	
	void verify() throws UserPasswordException
	{
		if(user_name.equals(UN)&& password == PWD)
		{
		    System.out.println("Login successful");
		}
		else
		{
		   UserPasswordException i = new UserPasswordException();
		   System.out.println(i.getMessage());
		   throw i;
		}
	}
}

class Email {
	
	void initiate()
	{
		Details d = new Details();
		try {
		d.acceptInput(); 
		d.verify();
		}
		catch(Exception e)
		{
			 try {
			   d.acceptInput(); 
			   d.verify();
			 }
			 catch(Exception a)
			 {
				 try {
				   d.acceptInput(); 
			           d.verify();
				 }
				 catch(Exception b)
				 {
					 System.out.println("Login blocked!");
					 System.exit(0);
				 }
			 }
		}
	}
}
public class EmailException 
{
	public static void main(String[] args) {
		
		Email em = new Email();
		 em.initiate();
	
	

	}

}
