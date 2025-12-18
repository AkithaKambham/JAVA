class Circle
{
double area(int r,double pi)
{
pi=Math.PI;
return pi*r*r;
}
}
public class CircleArea
{
public static void main(String args[])
{
Circle c=new Circle();
System.out.println(c.area(20,35.5d));
}
}