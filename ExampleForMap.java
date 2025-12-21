import java.util.*;
public class ExampleForMap
{
public static void main(String args[])
{
HashMap<String,String> hm=new HashMap<String,String>();
hm.put("Name","akki");
hm.put("place","tpt");
System.out.println(hm);
System.out.println("---------------------");
System.out.println(hm.get("Name"));
System.out.println("---------------------");
System.out.println(hm);
}
}
