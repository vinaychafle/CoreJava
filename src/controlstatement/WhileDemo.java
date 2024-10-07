package controlstatement;

public class WhileDemo {
public static void main(String[] args) {
	System.out.println("======Print even no=====");
	int i=0;
	while(i<10)
	{
		i=i+2;
		System.out.print(i+" ");
				
	}
	System.out.println();
	
	System.out.println("======Print odd no=====");
	 i=1;
	while(i<10)
	{
		
		System.out.print(i+" ");
		i=i+2;	
	}
	System.out.println();
	System.out.println("======series 7 1 6 2 5 3 4 4 3 5 2 6 1 7=====");
	int x=7,y=1;
	while(y<=7)
	{
		System.out.print(x+ " " +y+" ");
		x--;
		y++;
		}
	System.out.println();
	System.out.println("======series 2 9 4 18 6 27...20 90 =====");
	int a=1,b=1,n=0;
	while(a<=10)
	{
		System.out.print((a*2)+" "+(b*9)+" ");
		a++;
		b++;
		
	}
	System.out.println();
	System.out.println("======series 5 7 11 19 35 67 ....print 10 values =====");
	int a1=2, b1=0;
int s=5;
	System.out.print(s+" ");
	for(int i1=1;i1<=10;i1++)
	{
		int v=1;
		for(int j=1;j<=i1;j++)
		{
			v=v*2;
		}
		System.out.print((s+v)+" ");
		s=s+v;
	}
	
		
		
}
}


