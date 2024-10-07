package inheritance;

public class Father extends Grandfather{
	String Father_name;
	String Surname;
	
	public Father(String fn,String sn,String gN)
	{
		super(gN);
		Father_name=fn;
		Surname=sn;
		
	}
	public void display()
	{
		System.out.println("Father name "+Father_name);
		System.out.println("Surname : "+Surname);
	}
}
