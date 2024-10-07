package overloading;

public class AddDemo {
	public static void main(String[] args) {
		Addition a=new Addition();
		a.add();
		a.add(5);
		a.add(10, 20);
		a.add(5, 6, 7);
		a.add(12.51f, 14.87f);
		a.add('a', 'b');
	}

}
