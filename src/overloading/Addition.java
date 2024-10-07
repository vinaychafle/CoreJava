package overloading;

public class Addition {
int a,b;

public Addition()
{
	a=b=2;
}
public void add()
{
	System.out.println("Addition of a and b is "+(a+b));
}
public void add(int x)
{
	a=b=x;
	System.out.println("Addition is "+(a+b));
}
public void add(int x,int y)
{
	a=x;
	b=y;
	System.out.println("Addition is "+(a+b));
}
public void add(int x,int y,int z)
{
	System.out.println("Addition is "+(x+y+z));
}
public void add(float f,float f1)
{
	System.out.println("addition is "+(f+f1));
}
public void add(char ch,char ch1)
{
	System.out.println("addition is "+(char) (ch+ch1));
}


}
