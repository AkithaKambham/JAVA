class Car
{
private String colour;
private int milage;
private String name;
public Car(String colour, int milage, String name)
{
this.colour=colour;
this.milage=milage;
this.name=name;
}
public String getColour()
{
return colour;
}
public int getMilage()
{
return milage;
}
public String getName()
{
return name;
}
}
public class ExampleForCar
{
public static void main(String args[])
{
Car c=new Car("Black",200,"KiaCarans");
System.out.println("The car colour :"+c.getColour());
System.out.println("The car milage :"+c.getMilage());
System.out.println("The car name:"+c.getName());
}
}


