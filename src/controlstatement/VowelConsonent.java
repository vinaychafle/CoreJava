package controlstatement;

import java.util.Scanner;

public class VowelConsonent {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the charactor to be checked");
	char ch=sc.next().charAt(0);
	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
	System.out.println(ch+ " is a vowel");
	}
	else
	{
		System.out.println(ch+ " is a consonent");
	}
	sc.close();
	}

}

