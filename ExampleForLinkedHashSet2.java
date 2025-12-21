import java.util.*;

class Student5
{
    private String rollNo;
    private String name;
    private String email;

    public Student5(String rollNo, String name, String email)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
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

    @Override
    public String toString()
    {
        return "Student5[rollNo=" + rollNo + ", name=" + name + ", email=" + email + "]";
    }
}

public class ExampleForLinkedHashSet2
{
    public static void main(String args[])
    {
        Student5 s1 = new Student5("504", "Akki", "akki@gmail.com");
        Student5 s2 = new Student5("554", "gowthu", "gowthu@gmail.com");

        LinkedHashSet<Student5> lhs = new LinkedHashSet<>();
        lhs.add(s1);
        lhs.add(s2);

        for (Student5 i : lhs)
        {
            System.out.println(i);
        }
    }
}
