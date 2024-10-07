package abstraction;

public class Square extends Shape {
	int side=10;
	@Override
	void area() {
		int area=side*side;
		System.out.println("Area of square is "+area);
		
	}
	void show()
	{
		System.out.println("This is square shape");
	}

}
