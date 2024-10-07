package operator;

public class AssignmentOperator {
public static void main(String[] args) {
	// = += -= *= /= &= ^= |= <<= >>= >>>=
	int a=5;
	System.out.println("addition assignment operator " + (a+=15));
	System.out.println("value of a is" +a);
	
	System.out.println("substraction assignment operator " + (a-=2));
	System.out.println("value of a is" +a);
	System.out.println("Multiplication assignment operator " + (a*=2));
	System.out.println("value of a is " +a);
	System.out.println("division assignment operator " + (a/=6));
	System.out.println("value of a is" +a);
	System.out.println("AND assignment operator " + (a&=2));
	System.out.println("value of a is" +a);
	System.out.println("Modulus assignment operator " + (a%=10));
	System.out.println("value of a is" +a);
	System.out.println("assignment OR opertor " + (a|=12));
	System.out.println("value of a is" +a);
	System.out.println("Ex- OR operator " + (a^=7) );
	System.out.println("value of a is" +a);
	System.out.println(+ (a<<=3));
	System.out.println("value of a is" +a);
	System.out.println(+ (a>>=2));
	System.out.println("value of a is" +a);
	int b=-3;
	System.out.println(+ (b>>>=60));
	System.out.println("value of b is" +b);
	
}
}
