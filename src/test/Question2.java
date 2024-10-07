package test;

public class Question2 {

	
public static void main(String[] args) {
System.out.println("Using 3 variable");
	int a=6,b=8,c;
	c=a;
	a=b;
	b=c;
	System.out.println("Value of a is "+a+" Value of b is "+b);
	
	
	System.out.println("Using 2 variable ");
	int d=6,e=8;
	d=e+d;
	e=d-e;
	d=d-e;
	
	System.out.println("d= "+d+"e= "+e);
}
}
