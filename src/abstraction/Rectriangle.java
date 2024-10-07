package abstraction;

public class Rectriangle extends Shape {
 int base=10;
int height=15;
	@Override
	void area() {
		int area=base*height;
		System.out.println("Area of triangle is "+area);
	}
	
	void show()
	{
		System.out.println("this is rectangle shape");
	}

}
