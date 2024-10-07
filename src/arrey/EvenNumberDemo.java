package arrey;

import java.util.Scanner;

public class EvenNumberDemo {
	int arr[]={1,2,3,4,5,6,7,8,9,10,11,12};
	void Display()
	{
		System.out.println("Even numbers in array are: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	void OddNo()
	{
		System.out.println("odd numbers in array are: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		EvenNumberDemo n=new EvenNumberDemo();
		n.Display();
		n.OddNo();
		
	}
}
