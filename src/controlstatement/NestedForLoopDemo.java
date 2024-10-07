package controlstatement;

public class NestedForLoopDemo {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*" + " ");
		}
		System.out.println();
	}
	System.out.println("========================");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j +" ");
		}
		System.out.println();
	}
	System.out.println("========================");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((i+j) +" ");
		}
		System.out.println();
	}
	System.out.println("========================");
	for(int i=1,p=1;i<=2;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print(p++ +" ");
		}
		System.out.println();
	}
	System.out.println("========================");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=2;j++)
		{
			System.out.print(i-j +" ");
		}
		System.out.println();
	}
	System.out.println("============03============");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(j+ " " +i +" ");
		}
		System.out.println();
	}
	System.out.println("=======p2=======");
	for(int r=1;r<=4;r++)
	{
		for(int c=1;c<r;c++)
		{
			System.out.print("  ");
		}
		for(int c=r;c<=4;c++)
		{
			System.out.print(c+ " ");
		}
		System.out.println();
	}
}
}
