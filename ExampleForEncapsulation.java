class Student
{
private String rollNo;
private String name;
private String email;
private int age;
public void setData(String x, String y, String z, int a)
{
rollNo =x;
name =y;
email =z;
a =age;
}
public String getRollNo()
{
return rollNo;
}
public String getName()
{
return name;
}
public String getEmail()
{
return email;
}
public int getAge()
{
return age;
}
}
public class ExampleForEncapsulation
{
public static void main(String args[])
{
Student s=new Student();
s.setData("A101","Akki","akki@gmail.com",21);
System.out.println("The student roll number :"+s.getRollNo());
System.out.println("The student name :"+s.getName());
System.out.println("The student email:"+s.getEmail());
System.out.println("The student age :"+s.getAge());
}
}




