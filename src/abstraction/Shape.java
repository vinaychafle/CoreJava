package abstraction;

abstract class Shape {
	abstract void area(); //abstraction method
	void show() {		//non abstract method
		System.out.println("this is a shape");
	}
	
}
