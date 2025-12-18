import java.util.Scanner;
abstract class Calculator
{
abstract void add();
abstract void sub();
abstract void mul();
abstract void div();
}
class MyCalculator extends Calculator
{

void add()
{
int number1 = 20;
int number2 = 30;
int sum=number1 + number2;
System.out.println("the sum is :"+sum);
}

void sub()
{
int number1 = 20;
int number2 = 30;
int sub=number1 - number2;
System.out.println("the difference is :"+sub);
}

void mul()
{
int number1 = 20;
int number2 = 30;
int mul=number1 * number2;
System.out.println("the product is :"+mul);
}

void div()
{
int number1 = 20;
int number2 = 30;
int div=number1 / number2;
System.out.println("the quotient is :"+div);
}
}

class MyCalculator2 extends Calculator
{

void add()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number:");
int number1 =s.nextInt();
System.out.println("Enter the second number:");
int number2 =s.nextInt();
int sum=number1 + number2;
System.out.println("the sum is :"+sum);
}

void sub()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number:");
int number1 =s.nextInt();
System.out.println("Enter the second number:");
int number2 =s.nextInt();
int sub=number1 - number2;
System.out.println("the dufference is :"+sub);
}

void mul()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number:");
int number1 =s.nextInt();
System.out.println("Enter the second number:");
int number2 =s.nextInt();
int mul=number1 * number2;
System.out.println("the product is :"+mul);
}

void div()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number:");
int number1 =s.nextInt();
System.out.println("Enter the second number:");
int number2 =s.nextInt();
int div=number1 / number2;
System.out.println("the quotient is :"+div);
}
}

class Math
{
void arthimetic(Calculator c)
{
c.add();
c.sub();
c.mul();
c.div();
}
}

public class ExampleForAbstaction2
{
public static void main(String args[])
{
MyCalculator m1= new MyCalculator();
MyCalculator2 m2= new MyCalculator2();

Math m= new Math();
m.arthimetic(m1);
System.out.println("------------------");
m.arthimetic(m2);
}
}










