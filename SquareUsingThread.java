class Demo1 extends Thread
{
public void run()
{
int sum=0;
for(int i=0;i<=10;i++)
{
sum=sum+i;
}
 double average=sum/10.0;
System.out.println("Average of first ten numbers="+average);
}
}

class Demo2 extends Thread
{
int arr[]={1,20,50,15,30};
public void run()
{
 System.out.println("Square of number in the array:");
for(int i=0;i<arr.length;i++)
{
System.out.println("square of" +arr[i] +"="+(arr[i]*arr[i]));
}
}
}
public class SquareUsingThread
{
public static void main(String args[])
{
 Demo1 d1=new Demo1();
 Demo2 d2=new Demo2();
  d1.start();
  d2.start();
}
}

