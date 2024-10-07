package test;

import java.util.Scanner;

public class Q3copy {
	public static void main(String[] args) {
		String s;
	Scanner sc=new Scanner(System.in);
	System.out.println("pLease enter the alphabet :");
	s=sc.next();
	s=s.toUpperCase();
	char c=s.charAt(0);
	{
		if(s.length()==1)
	if((c>='a')&&(c<='z')||(c>='A')&&(c<='Z'))
	{
		if(c==('A')||c==('E')||c==('I')||c==('O')||c==('U'))
		{
			System.out.println(c+" is a vowel");
		}
		else
		{
			System.out.println(c+" is a consonent");
			}
			
		}
		else
		{
			System.out.println("plese enter valid charactor");
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	sc.close();
		
}
}


