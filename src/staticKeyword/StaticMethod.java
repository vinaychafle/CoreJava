package staticKeyword;

public class StaticMethod {
	int a=10;
	static int b=20;
	
	static
	{
		System.out.println("inside static block. ");
		//System.out.println(a);
		System.out.println(b);
		System.out.println("=========");
	}
	public static void stMethod()
	{
		System.out.println("value of b is "+b);
		System.out.println("Static method cannot display non ststic data ");
		System.out.println("===============");
	}
	public void nstMethod()
	{
		stMethod();
		System.out.println("Value of static variable b is "+b);
		System.out.println("Value of a is "+a);
		System.out.println("==========");
	}
	public static void main(String[] args) {
		StaticMethod sm= new StaticMethod();
		stMethod();
		sm.nstMethod();
	}
}
