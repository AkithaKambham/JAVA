import java.util.Scanner;

class ATM
{
    int acc_number = 12345678;
    int password = 1111;
    int AN, PWD;

    void acceptInput()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the account number :");
        AN = s.nextInt();
        System.out.println("Enter the password : ");
        PWD = s.nextInt();
    }

    void verify()
    {
        if(acc_number == AN && password == PWD)
        {
            System.out.println("Collect your money");
        }
        else
        {
            System.out.println("Invalid card details. Try again!");
        }
    }
}
class Bank
{
    void initiate()
    {
        ATM atm = new ATM();
        atm.acceptInput();
        atm.verify();
        
    }
}

public class ExampleForCustomExceptions
{
    public static void main(String a[])
    {
        Bank b = new Bank();
        b.initiate();
}
}
