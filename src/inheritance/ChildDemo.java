package inheritance;

public class ChildDemo extends ParentDemo {

	String name="VInaychafleAcademy";
	public ChildDemo()
	{
		super();
		System.out.println("This is child class constructor");
	}
	
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am in child class");
	}
	public static void main(String[] args) {
		
		ChildDemo d=new ChildDemo();
		d.getData();
		
		

	}

}
