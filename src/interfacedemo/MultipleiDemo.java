package interfacedemo;

public class MultipleiDemo implements MultipleInterface,Printable {

	@Override  //this is multiple interface
	public void show() {
		System.out.println("multiple inheretance");
		
	}

	@Override
	public void print() {
		System.out.println("Welcome MLI");
		
	}

		public static void main(String[] args) {
			MultipleiDemo m=new MultipleiDemo();
			m.show();
			m.print();
		}
}
