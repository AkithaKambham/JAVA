import java.util.Scanner;
class AdditionMultiThreading implements Runnable
{
public void run()
{
System.out.println("Addition task started");
Scanner s=new Scanner(System.in);

System.out.println("enter the first number");
int a = s.nextInt();

System.out.println("enter the second number");
int b = s.nextInt();

int sum=a+b;
System.out.println(sum);
}
}
class CharacterPrinting implements Runnable
{
public void run()
{
for(int i=65;i<=75;i++)
{
System.out.println((char)i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
e.printStackTrace();
}
}
System.out.println("character printing task is completed");
}
}
class NumberPrinting implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
e.printStackTrace();
}
}
System.out.println("Number task is completed");
}
}

public class MultiThreadingRunnable
{
public static void main(String args[])
{
AdditionMultiThreading a=new AdditionMultiThreading();
CharacterPrinting c=new CharacterPrinting();
NumberPrinting n=new NumberPrinting();
Thread t1=new Thread(a);
Thread t2=new Thread(c);
Thread t3=new Thread(n);
t1.start();
t2.start();
t3.start();
}
}
