package programPractice;

import java.util.Scanner;

public class PrimeN1to100 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(int j=2;j<=n;j++)
		{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(j%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println(j+" ");
			}
		}
		sc.close();
	}

}
