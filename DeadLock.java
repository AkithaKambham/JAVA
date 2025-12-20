class Family implements Runnable
{
     String resource1="TV";
     String resource2="PlayStation";
public void run()
{
String name=Thread.currentThread().getName();
     if(name.equals("CR")==true)
{
    crAccquireResource();
}
else
{
lrAccquiredResource();
}
}
void crAccquireResource()
{
synchronized(resource2)
{
try
{
System.out.println("CR acquire the playstore");
Thread.sleep(1000);
synchronized(resource1)
{
System.out.println("CR acquired TV");
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println("cr failed");
}
}
}



void lrAccquiredResource()
{
synchronized(resource1)
{
try
{
System.out.println("CR acquire the TV");
Thread.sleep(1000);
synchronized(resource2)
{
System.out.println("CR acquired Playstation");
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println("lr failed");
}
}
}
}
   public class DeadLock
{
public static void main(String args[])
{
  Family f=new Family();
  Thread t1=new Thread(f);
  Thread t2=new Thread(f);
  t1.setName("CR");
  t2.setName("LR");

  t1.start();
  t2.start();
}
}

