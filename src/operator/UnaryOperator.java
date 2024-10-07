package operator;

public class UnaryOperator {
public static void main(String[] args) {
	int a=5;
	System.out.println(a++ + --a - ++a + a--);
	System.out.println("value of a is "+a);
	System.out.println("****************");
	
	a=5;
	System.out.println("value of a is " + (a++ - ++a + a-- - --a));
	
			
}
}
