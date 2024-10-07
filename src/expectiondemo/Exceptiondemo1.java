package expectiondemo;

public class Exceptiondemo1 {
	void test()
	{
		int x=10;
		System.out.println("hello");
		try
		{
			int y=x/0;
			System.out.println(y);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This is finally block");
		}
		System.out.println("steps after exception");
	}
	public static void main(String[] args) {
		Exceptiondemo1 e1=new Exceptiondemo1();
		e1.test();
	}
}
