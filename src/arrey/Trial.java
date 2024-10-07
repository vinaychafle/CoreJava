package arrey;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Trial {
	
	public static void main(String[] args) {
		float add=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be find out");
		float s=sc.nextFloat();
		float arr[]={5.1f,6.2f,4.6f,7.8f,10.6f};
		Boolean isinarray=false;
		for(int i=0;i<arr.length;i++)
		{
			if(s==arr[i])
			{
				isinarray=true;
				break;
			}
			
		}
		if(isinarray)
		{
			System.out.println("number is present");
		}
		else
		{
			System.out.println("number not present");
		}
		
		
		sc.close();
	}
	
	
}
