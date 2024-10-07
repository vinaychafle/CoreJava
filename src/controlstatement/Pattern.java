package controlstatement;

public class Pattern {
public static void main(String[] args) {
	
			for(int r=1;r<=4;r++)
			{	char ch=(char)(96+r);
			for(int c=1;c>r;c++)
			{
				System.out.print(" ");
			}
	for(int c=1;c<=r;c++)
	{
		System.out.print(ch+" ");
	}
	System.out.println();
			}
			System.out.println("=======P2=========");
			for(int r=1;r<=4;r++)
			{
				char ch=65;
				//*for(int c=r;c<=r;c++)
				//{
				//	System.out.print(" ");
				//*}
				for(int c=1;c<=r;c++)
				{
					System.out.print(ch++ +" ");
				}
				System.out.println();
					
			}
			System.out.println("====P3====");
			
			for(int r=1;r<=4;r++)
			{char ch=65;
				for(int c=1;c<r;c++)
				{
					System.out.print(" ");
				}
				for(int c=r;c<=4;c++)
				{
					System.out.print(ch++ +" ");
				}
			
			System.out.println("");
			}
			System.out.println("=====P4======");
			int n=7,p=4;
			for(int r=1;r<=n;r++)
			{
				if(r<=(n-r))
				{
					for (int i = ((n/2)-r); i>=0 ; i--) {
						System.out.print(" ");
					}
				for(int c=1;c<=r;c++)
				if(r%2==0)
				{
					System.out.print(c+ " ");
				}
				else
				{
					System.out.print((char)(96+c)+ " ");
					}
					
				}
				else
				
				{
					for(int i=4;i<r;i++)
					{
						System.out.print(" ");
					}
					for(int c=1;c<=(8-r);c++)
						if(r%2==0)
						{
							System.out.print(c+" ");
						}
						else
						{
							System.out.print((char)(96+c)+" ");
						}
				
				}
				System.out.println();
			}
}
}

