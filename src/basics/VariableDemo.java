package basics;

public class VariableDemo {
	public static void main(String[] args) {
		Variable v = new Variable();
		v.method();
		v.method2();
		
		Variable v2 = new Variable();
		v2.method();
		v2.method2();
		
		v.a=88;
		v2.a = 99;
		
		v.method();
		v2.method();
	}
}
// HW : create one more object of variable class and assign new value for instance variable a and display it.