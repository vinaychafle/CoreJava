package programPractice;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	int n,s=0,r,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	n=sc.nextInt();
	c=n;
	while(n>0)
	{
		r=n%10;
		s=(s*10)+r;
		n=n/10;
	}
	if(c==s)
	{
		System.out.println(c+ " is palindrome number");
	}
	else
		System.out.println(c+" is not palindrome number");
	sc.close();
	
	int a=5;
	int b=4;

	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a= "+a+"b= "+b);
}
}
