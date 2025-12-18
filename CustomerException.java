import java.util.Scanner;
class ATM
{
int acc_number=12345678;
int password=1111;
int AN,PWD;
void acceptInput()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the account number");
AN=s.nextInt();
System.out.println("enter the password");
PWD=s.nextInt();
}
void verify()
{
if(acc_number==AN && password==PWD)
{
System.out.println("collect your money");
}
else
{
System.out.println("Invalid card details. try again");
}
}
} 

class Bank
{
void initiate()
{
ATM atm =new ATM();
atm.acceptInput();
atm.verify();
}
}
 
public class CustomerException 
{
public static void main(String args[])
{
Bank b=new Bank();
b.initiate();
}
}
