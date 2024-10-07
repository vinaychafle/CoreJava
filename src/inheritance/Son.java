package inheritance;

public class Son extends Father {
	String name;
	
	public Son(String name,String fn,String sn,String gN)
	{
		super(fn,sn,gN);
		this.name= name;
	}
	public void displayInfo()
	{
		System.out.println("name : "+name);
		display();
	}
}
