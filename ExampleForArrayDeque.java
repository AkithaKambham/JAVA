import java.util.ArrayDeque;
import java.util.Deque;
public class ExampleForArrayDeque
{
public static void main(String args[])
{
ArrayDeque<Integer> d=new ArrayDeque<>();
d.add(10);
d.add(20);
d.add(30);
System.out.println(d);
System.out.println("---------------------");
System.out.println(d.poll());
System.out.println("---------------------");
for(Object i:d)
{
System.out.println(i);
}
System.out.println("---------------------");
System.out.println(d.remove(23));
System.out.println("---------------------");
System.out.println(d);
}
}
