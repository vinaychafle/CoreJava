package abstraction;

public class Triangle extends Shape {
	int base=5;
	int height=5;
	@Override
	void area() {
		float area=0.5f*base*height;
		System.out.println("Area of triangle is "+area);
		
	}

}
