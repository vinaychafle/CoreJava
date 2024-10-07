package test;

public class Q2P1 {
int a,b,c;
public void setData()
{
	a=6;
	b=8;
	c=a+b;
}
public void display()
{
	System.out.println("a= "+a);
	System.out.println("b= "+b);
	System.out.println("c= "+(a+b));
}
public static void main(String[] args) {
	Q2P1 c=new Q2P1();
	c.a=8;
	c.b=6;
	c.c=('a'+'b');
	c.display();
}
}
