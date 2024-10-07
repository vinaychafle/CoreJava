package constructors;

public class Rectangle {
int length;
int width;

public Rectangle()
{
	length=12;
	width=6;
}
public Rectangle(int L,int W)
{
	length=L;
	width=W;
}
public void Area()
{
	int area =length*width;
	System.out.println("Area ="+area);
}
public void display()
{
	System.out.println("length :"+length);
	System.out.println("width :"+width);
}
public String toString()
{
	return "lenght= "+length+",width= "+width;
}
}
