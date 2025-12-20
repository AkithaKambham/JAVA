import java.util.*;
class CarVector
{
private String carName;
private String carColor;
public CarVector(String carName ,String carColor)
{
super();
this.carName=carName;
this.carColor= carColor;
}
public String getCarName()
{
return carName;
}
public String getCarColor()
{
return carColor;
}

@Override
public String toString()
{
return "CarVector[carName=" + carName +", carColor=" + carColor +"]";
}
}
public class Example2ForVector
{
public static void main(String args[])
{
   CarVector cv1=new CarVector("Honda","Black");
   CarVector cv2=new CarVector("Kiacarans","Grey");
   Vector<CarVector> v=new Vector<>();
   v.add(cv1);
   v.add(cv2);
 for (Object i:v)
{
System.out.println(i);
}
}
}
 