package expectiondemo;

public class ExceptionDemo2 {
	int x[]=new int[7];
	 String s=null;
	void test()
	{
		try
		{
			System.out.println(x[7]);
			System.out.println(s.length());
		}
		catch(ArithmeticException a1)
		{
			a1.printStackTrace();
		}
		catch(NullPointerException a2)
		{
			a2.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException a3)
		{
			a3.printStackTrace();
		}
		catch(Exception a4)
		{
			a4.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		ExceptionDemo2 e=new ExceptionDemo2();
		e.test();
	}
	
	
}
