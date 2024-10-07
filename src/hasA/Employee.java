package hasA;

public class Employee {
	String name;
	int id;
	Address ad;	//create Has- A relationship
	
	public Employee(String name,int id,Address a)
	{
		this.name=name;
		this.id=id;
		ad=a;
	}
	public void display()
	{
		System.out.println("Name "+name);
		System.out.println("ID "+id);
		System.out.println("City "+ad.City);
		System.out.println("State "+ad.State);
		System.out.println("Pincode "+ad.Pincode);
	}
}
