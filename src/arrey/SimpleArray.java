package arrey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter array size");
		size=sc.nextInt();
		int number []=new int[size];
		
		for(int i=0;i<size;i++)
		{
			number[i]=sc.nextInt();
		}
		
		System.out.println("please enter the value to be checked");
		int x=sc.nextInt();
		
		for(int j=0;j<number.length;j++)
		{
			if(number[j]==x)
			{
				System.out.println("number at x is: "+j);
			}
		}
		
		sc.close();
		
	}
}
