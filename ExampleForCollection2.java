import java.util.ArrayList;
import java.util.List;

public class ExampleForCollection2
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
System.out.println(l.size());
System.out.println(l.contains(10));
System.out.println(l.get(1));
System.out.println(l.getLast());
System.out.println(l.getFirst());
System.out.println(l.remove(3));
System.out.println(l.set(1,1000));

System.out.println("----------------------");
ArrayList<Integer> al=new ArrayList<>();
al.add(10);
al.add(25);
al.add(30);
al.add(70);
System.out.println("ArrayList" +al);
System.out.println(al.size());
System.out.println(al.contains(10));
System.out.println(al.get(1));
System.out.println(al.getLast());
System.out.println(al.getFirst());
System.out.println(al.remove(3));
System.out.println(al.set(1,1000));

}
}
