package programPractice;

public class TestBlock {
	public static void main(String[] args) {
		
//	int n=49,s=1;
//	for(int i=1;i<=n;i++)
//	{
//		s=s*i;	
//		System.out.println(s);
//	}
//	
//	System.out.println("simlpy learn "+(100+100));
		
		int x=0,y=1,z=0;
		
		for(int i=0;i<=5;i++)
		{
			System.out.print(z+" ");
			x=y;
			y=z;
			z=x+y;
		}
		
	}
}
