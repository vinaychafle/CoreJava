package thisKeyword;

public class AreaofTriangle {
float a,base,height;
	public AreaofTriangle()
	{
		a=0.5f;
		base=5f;
		height=40f;
	}
	public void area()
	{
		float area =a*base*height;
		System.out.println("Area ="+area);
	}
	public void display()
	{
		System.out.println("a :"+a);
		System.out.println("base :"+base);
		System.out.println("height: "+height);
	}
	
}
