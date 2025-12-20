import java.util.*;
class Employee
{
private String empName;
private String empDesignation;
private String empEmail;

public Employee(String empName ,String empDesignation, String empEmail)
{
super();
this.empName=empName;
this.empDesignation=empDesignation;
this.empEmail=empEmail;
}
public String getEmpName()
{
return empName;
}
public String getEmpDesignation()
{
return empDesignation;
}
public String getEmpEmail()
{
return empEmail;
}


@Override
public String toString()
{
return "Employee[empName=" + empName +", empDesignation=" + empDesignation +", empEmail=" + empEmail + "]";
}
}
public class Example2ForLinkedList
{
public static void main(String args[])
{
   Employee e1=new Employee("Akki","Dancing","akki@gmail.com");
   Employee e2=new Employee("nami","roasting","nami@gmail.com");
   Employee e3=new Employee("Gowthu","Eating","gowthu@gmail.com");
   LinkedList<Employee> ll=new LinkedList<>();
ll.add(e1);
ll.add(e2);
ll.add(e3);
 for (Object i:ll)
{
System.out.println(i);
}
}
}
 