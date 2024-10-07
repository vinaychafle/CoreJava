package basics;

public class VariableDemo1 {
	public static void main(String[] args) {
		
		Variables v = new Variables();
		
		v.method();
		v.method2();
		
		Variables v2 = new Variables();
		
		v2.method();
		v2.method2();
		
		v.a=51;
		v2.a=45;
		
		v.method();
		v2.method2();
		
		Variables v3 = new Variables();
		
		v3.method();
		v3.method2();
		
		v.a=10;
		v2.a=20;
		
		v.method();
		v2.method2();
		
		System.out.println(Variables.st);
		Variables.st=26;
		System.out.println(Variables.st);
		
	}
	

}
