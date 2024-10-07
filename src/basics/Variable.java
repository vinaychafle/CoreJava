package basics;

public class Variable {
	int a=5;          // instance variable
	
	public void method()
	{
		int b = 10;   // local variable
		System.out.println("value of local variable b is "+b);
		System.out.println("value of instance variable a is "+a);
		System.out.println("====================");
	}
	public void method2()
	{
		//System.out.println("value of variable b is "+b);
		System.out.println("value of instance variable a is "+a);
		System.out.println("====================");
	}
}
// local variable : accessible within method, it will not be visible outside the method.

// instance variable : accessible within whole class, defined outside of the all methods
//					   all method and all block can access this variable.