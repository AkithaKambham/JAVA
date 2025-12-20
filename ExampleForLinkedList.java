import java.util.*;
public class ExampleForLinkedList
{
public static void main(String args[])
{
List<Object> l=new LinkedList<>();
l.add("java");
l.add(10);
l.add(35.5);
l.add(23);
l.add(null);
System.out.println("The list:" +l);
for(Object i:l)
{
System.out.println(i);
}
System.out.println(l.get(0));
System.out.println(l.isEmpty());
System.out.println("------------------------");

LinkedList<Object> ll=new LinkedList<>();
l.add("java");
l.add(10);
l.add(20);
l.add("python");
l.add(null);
System.out.println("The Linkedlist:" +ll);
for(Object i:ll)
{
System.out.println(i);
}
}
}
