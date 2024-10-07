package controlstatement;

public class Pattern01 {
	public static void main(String[] args) {
		//1 10 11 20 21
		//2  9 12 19 22 
		//3  8 13 18 23
		//4  7 14 17 24
		//5  6 15 16 25
		int n=5;
		
		for(int r=1;r<=5;r++)
		{
			int p=r,q=n-r+1;
			for(int c=1;c<=n;c++)
			{
				if((r==2||r==3||r==4)&&(c==2||c==3||c==4))
				{
				System.out.printf("  ");
				}
			
			else
			{
				System.out.print(c+" ");
			}
			}
			System.out.println();
	
	}

	
}
}
