package constructors;

public class Demo {
public static void main(String[] args) {
	Students s=new Students();
	System.out.println(s);
	
	Students s1=new Students();
	System.out.println(s1);
	
	s1.name="Ram";
	s1.roll=201;
	System.out.println(s1);
}
}
