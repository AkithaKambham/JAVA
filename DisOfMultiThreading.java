class Printer implements Runnable
{
public void run()
{
String name=Thread.currentThread().getName();
System.out.println(name +"Printing started");
for(int i=0;i<=5;i++)
{
System.out.println(name + "is printing");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println("Some problem is occured");
}
}
System.out.println(name + "Completed the printing");
}
}

public class DisOfMultiThreading
{
public static void main(String args[])
{
Printer p=new Printer();
Thread t1=new Thread(p);
Thread t2=new Thread(p);
Thread t3=new Thread(p);

t1.setName("Akki");
t2.setName("Smiley");
t3.setName("Gubey");

t1.start();
t2.start();
t3.start();

}
}
