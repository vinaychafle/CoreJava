package test;

import java.util.Scanner;

public class CountVowelsandConsonant {
public static void main(String[] args) {
	String s=new String();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string ");
	s=sc.nextLine();
	s=s.toUpperCase();
	int i,vowel=0,con=0;
	
	for(i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c!=' ')
		{
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
			 vowel++;
			}
			else
			{
				con++;
			}
		}
		
	}
	System.out.print("Total vowel "+vowel+" Total con "+con);
	sc.close();
	
	
	
}
}
