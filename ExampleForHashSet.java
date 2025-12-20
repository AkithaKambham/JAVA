import java.util.*;
class Doggy
{
  private String name;
  private String breed;
  public Doggy(String name,String breed)
  {
     super();
     this.name=name;
     this.breed=breed;
  }
  public String getName()
  {
    return name;
  }
  public String getBreed()
  {
     return breed;
  }
  @Override
  public String toString()
  {
     return "Doggy[name" + name +=", breed=" + breed+"]";
}
}
   public class ExampleForHashSet
     {
   public static void main(String args[])
     {
       Doggy d=new Doggy("Apam","lab");
       HashSet<String> hs=new HashSet<>();
       hs.add(d);
       for(Object e:hs)
         {
       System.out.println(e);
       }
       }
       }

