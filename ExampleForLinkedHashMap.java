import java.util.*;
public class ExampleForLinkedHashMap
{
public static void main(String args[])
{
LinkedHashMap<String,String> lhm=new LinkedHashMap<String,String>();
lhm.put("Name","Akki");
lhm.put("Age","19");
System.out.println(lhm);
System.out.println("---------------------");
System.out.println(lhm.get(0));
System.out.println("---------------------");
for(Object i:lhm.keySet())
{
System.out.println(i);
}
System.out.println("---------------------");
for(Object i:lhm.entrySet())
{
System.out.println(i);
}
System.out.println("---------------------");
}
}
