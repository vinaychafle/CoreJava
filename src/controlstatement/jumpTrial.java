package controlstatement;

public class jumpTrial {
public static void main(String[] args) {
	for(int r=1;r<=5;r++)
	{
		for(int c=1;c<=5;c++)
		{
			if((r==1)||(c==1)||(r==5)||(c==5))
			
			{
				System.out.print(c+" ");
			}
			
			else
			{
			System.out.print("  ");
			}
		}
		System.out.println();
	}
	}
}

