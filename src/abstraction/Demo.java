package abstraction;

public class Demo {
	public static void main(String[] args) {
		Rectriangle r=new Rectriangle();
		r.area();
		r.show();
		Square s=new Square();
		s.area();
		s.show();
		Triangle t=new Triangle();
		t.area();
		Shape s1=new Rectriangle();
		s1.show();
		
	}

}
