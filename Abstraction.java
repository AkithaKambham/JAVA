
abstract class Plane
{
abstract void takeOff();
abstract void fly();
abstract void land();
}


class CargoPlane extends Plane
{
void takeOff()
{
System.out.println("Cargoplane is taking off");
}
void fly()
{
System.out.println("Cargo plane is flying at low height");
}
void land()
{
System.out.println("Cargoplane is landing");
}
}


class PassengerPlane extends Plane
{
void takeOff()
{
System.out.println("passengerplane is taking off");
}
void fly()
{
System.out.println("passengerpalne is flying at low height");
}
void land()
{
System.out.println("passengerpalne is landing");
}
}


class FighterPlane extends Plane
{
void takeOff()
{
System.out.println("fighterplane is taking off");
}
void fly()
{
System.out.println("fighterplane  is flying at low height");
}
void land()
{
System.out.println("fighterplane is landing");
}
}


abstract class Airport extends Plane
{
void permit(Plane ref)
{
ref.takeOff();
ref.fly();
ref.land();
}
}

public class Abstraction
{
public static void main(String args[])
{
CargoPlane cp=new CargoPlane();
PassengerPlane pp=new PassengerPlane();
FighterPlane fp=new FighterPlane ();
Airport a=new Airport();
a.permit(cp);
a.permit(pp);
a.permit(fp);
}
}





