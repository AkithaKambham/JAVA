import java.util.ArrayList;
import java.util.List;

public class ExampleForCollection1
{
public static void main(String args[])
{
List<Integer> l=new ArrayList<>();
l.add(10);
l.add(20);
l.add(30);
l.add(40);
System.out.println("List" +l);
for(Object i :l)
{
System.out.println(i);
}
System.out.println("----------------------");
ArrayList<Integer> al=new ArrayList<>();
al.add(10);
al.add(25);
al.add(30);
al.add(70);
System.out.println("ArrayList" +al);
}
}
