import java.util.*;
public class ExampleForTreeMap
{
public static void main(String args[])
{
TreeMap<String,String> tm=new TreeMap<String,String>();
tm.put("Name","Akki");
tm.put("Age","19");
tm.put("email","akki@gmail.com");

System.out.println(tm);
System.out.println("---------------------");

for(Object obj:tm.keySet())
{
System.out.println(obj);
}
System.out.println("---------------------");

}
}
