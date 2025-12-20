import java.util.*;
public class ExapleForSet
{
public static void main(String args[])
{
  HashSet<String>hs=new HashSet<>();
  hs.add("Akki");
hs.add("java");
hs.add("Python");
 System.out.println(hs);
System.out.println("---------------------");
System.out.println(hs.size());
System.out.println("---------------------");
System.out.println(hs.isEmpty());
System.out.println("---------------------");
System.out.println(hs.clone());
System.out.println("---------------------");

for(Object e:hs)
{
System.out.println(e);
}
}
}
