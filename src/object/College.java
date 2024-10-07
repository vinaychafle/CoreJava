package object;

public class College {
	String College_name;
	int code;
	String Field;
	int number_of_department;

	public void setData()
	{
	College_name = "KITS college";
	code= 120;
	Field="Engineering";
	number_of_department=5;
	}
	public void display()
	{
		System.out.println("College name= KITS college");
		System.out.println("code= 120");
		System.out.println("Field=Engineering");
		System.out.println("number of department= 5");
	}
}
