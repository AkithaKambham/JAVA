import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class NameComparator implements Comparator<People>{

	@Override
	public int compare(People s1,People s2) {
		return s1.getName().compareTo(s2.getName());
	}
	
}

class RollNumberComparator implements Comparator<People>{

	@Override
	public int compare(People s1,People s2) {
		return s1.getRollNo().compareTo(s2.getRollNo());
	}
	
}
class People{
	private String name;
	private String rollNo;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	public String getName() {
		return name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public People(String name,String rollNo) {
		super();
		this.name=name;
		this.rollNo=rollNo;
	}
}


public class ExampleForComparator {

	public static void main(String[] args) {
		People p=new People("sanji","s4");
		People p=new People("zoro","s1");
		People p=new People("nami","s2");
		ArrayList<Integer> al=new ArrayList<>();
		al.add(p);
		al.add(p);
		al.add(p);
        Collections.sort(al,new RollNumberComparator());
        for(Object i:al)
        {
        	   System.out.println(i);
}
}
}

