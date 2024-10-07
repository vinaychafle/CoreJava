package test;

import java.util.Scanner;

public class Question4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n;
	n=sc.nextInt();
	int p=0,x = 0,sum=0;
	for(int i=1;i<=n;i++)
	{
		 x=2*p+1;
		System.out.println(x);
		p++;
		sum+=x;
	}
	System.out.println("The sum of odd natural number up to 5 terms is: "+sum);
	sc.close();
}
}
