package staticKeyword;

public class SVDemo {
public static void main(String[] args) {
	new StaticVariable();
	new StaticVariable();
	new StaticVariable();
	new StaticVariable();
	
	System.out.println("Object created are "+StaticVariable.counter);
}
}
