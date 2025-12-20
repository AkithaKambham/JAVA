import java.util.ArrayList;
class Student
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

public Student(String name,int age)
{
super();
this.name=name;
this.age=age;
}
}
public class ExampleForArrayList
{
public static void main(String args[])
{
Student1 s1=new Student1("Akki",19);
Student2 s2=new Student2("Nami",20);
ArrayList al=new ArrayList();
al.add(s1);
al.add(s2);

for(Object i:al)
{
System.out.println(i);
}
}
}






















