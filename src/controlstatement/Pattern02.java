package controlstatement;
	import java.util.*;
public class Pattern02 {
public static void main(String[] args) {
	int n=6,y=2*n-1;
	for(int i=1;i<=2*n-1;i++)
	{
		if(i<=n){
		for(int k=1;k<=n-i;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			char ch=(char)(96+j);
			if(i%2!=0)
			{
				System.out.print(ch+" ");
			}
			else
			{
				System.out.print(j+" ");
			}
		}
	}
		else
		{
			for(int k=1;k<=(i-n);k++)
			{
				System.out.print(" ");
			}
			int x=1;
			for(int j=1;j<=(y-i)+1;j++)
			{
				char ch=(char)(96+x++);
				if(i%2!=0)
				{
					System.out.print(ch+" ");
				}
				else
				{
					System.out.print(j +" ");
				}
		}
		}
		
		
		System.out.println();
	}
	
}
}
