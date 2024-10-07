package controlstatement;

public class FibonasiSeries {
	public static void main(String[] args) {
		int x=0,y=1,z=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			
			x=y;
			y=z;
			System.out.print(z+" ");
			z=x+y;
				}
			
			x=0;
			y=1;
			z=0;
			System.out.println();
			
		}
		
		
	}

}
