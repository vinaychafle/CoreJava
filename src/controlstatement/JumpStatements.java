package controlstatement;

public class JumpStatements {
public static void main(String[] args) {
	System.out.println("====using break ======");
	for(int i=1;i<=8;i++)
	{for(int c=1;c<=8;c++)
	{
	if(c==2)
		break;
	System.out.print(c+" ");
	}
	System.out.println();}
	System.out.println("====using continue ======");
	for(int i=1;i<=8;i++)
	{for(int c=1;c<=8;c++)
	{
	if(c==5)
		continue;
	System.out.print(c+" ");
	}
	System.out.println();}
	System.out.println("====jump ======");
	for(int i=1;i<=5;i++)
	{
		for(int c=1;c<=5;c++)
		{
			if(i==1 || i==5){
				System.out.print(c+" ");
			}
			else
			{
				if(c==1 || c==5)
				{
					System.out.print(c+" ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			
		}
		
	
	System.out.println();
	}
}
}

