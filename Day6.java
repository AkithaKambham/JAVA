import java.util.ArrayList;
class Student6
{
private String name;
private int age;
 public String getName()
{
return name;
}
public void SetName(String name)
{
this.name=name;
}
public int getAge()
{
return age;
}
public void SetAge(int age)
{
this.age=age;
}

public Student6(String name,int age)
{
this.name=name;
this.age=age;
}
}

public class Day6
{
public static void main(String args[])
{
Student6 s1=new Student6("Akki",19);
Student6 s2=new Student6("Nami",20);
ArrayList<Student6> al=new ArrayList<> ();
al.add(s1);
al.add(s2);

for(Object i:al)
{
System.out.println(i);
}
}
}







