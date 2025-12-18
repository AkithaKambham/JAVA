class Plane
{
void takeoff()
{
System.out.println("plane is taking off");
}
void fly()
{
System.out.println("plane is flying");
}
void land()
{
System.out.println("plane is landing");
}
}
class CargoPlane extends Plane
{
void fly()
{
System.out.println("CargoPlanes is flying at low heights");
}
}
class CargoPlane1 extends CargoPlane
{
void land()
{
System.out.println("landing with high speed");
}
}
class CargoPlane2 extends CargoPlane1
{
void takeoff()
{
System.out.println("it just take off");
}
}
public class ExampleForPlane
{
public static void main (String args[])
{
CargoPlane2 c=new CargoPlane2();
c.takeoff();
c.fly();
c.land();
}
}
