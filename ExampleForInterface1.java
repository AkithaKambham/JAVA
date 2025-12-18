import java.util.Scanner;
interface Calculator
{
void add();
void sub();
}
class MyCalculator1 implements Calculator
{
public void add()
{
int number1 = 20;
int number2 = 30;
int sum=number1 + number2;
System.out.println("the sum is :"+sum);
}

public void sub()
{
int number1 = 20;
int number2 = 30;
int sub=number1 - number2;
System.out.println("the difference is :"+sub);
}
}
class MyCalculator2 implements Calculator
{
public void add()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number:");
int number1 =s.nextInt();
System.out.println("Enter the second number:");
int number2 =s.nextInt();
int sum=number1 + number2;
System.out.println("the sum is :"+sum);
}

public void sub()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number:");
int number1 =s.nextInt();
System.out.println("Enter the second number:");
int number2 =s.nextInt();
int sub=number1 - number2;
System.out.println("the dufference is :"+sub);
}
}


public class ExampleForInterface1
{
public static void main(String args[])
{
MyCalculator1 m1= new MyCalculator1();
MyCalculator2 m2= new MyCalculator2();
m1.add();
m1.sub();

m2.add();
m2.sub();
}
}


