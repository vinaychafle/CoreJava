package thisKeyword;

public class ThisVariable {

	int a=10, b=20;
	public void assignData(int a,int b)
	{
		this.a=a;
		this.b=b;
				
	}
	public void display()
	{
		this.assignData(30, 61);
		System.out.println("a:"+a+",b:"+b);
	}
	
}
/*This keyword refers to current class instance variable
 * 1.For variables= To represent current class
 * 2.For methods= To use to call current class method*/
