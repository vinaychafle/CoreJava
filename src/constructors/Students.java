package constructors;

public class Students {
String name;
int roll;
public Students()
{
	name="Rahul";
	roll=154;
}
public Students(String n,int r)
{
	name=n;
	roll=r;
}
public String toString()
{
	return "name :"+name+", roll number :"+roll;
}
public void display()
{
	System.out.println("name : "+name);
	System.out.println("Roll : "+roll);
}
}
