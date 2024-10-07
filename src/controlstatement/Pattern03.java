package controlstatement;

public class Pattern03 {
public static void main(String[] args) {
	int s=5;
	
	for(int i=1;i<=10;i++)
	{
		int a=1;
		for(int j=1;j<=i;j++)
		{
			 a=2*a;
		}
		System.out.print((s+a)+" ");
		s=s+a;
		
	}
}
}
