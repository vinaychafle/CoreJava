package arrey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDisplay {
	static int arr[]={12,13,14,15,16,17,18};
	
	
		void Display()
	{
		System.out.println("Array in order: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	void reverseDisplay()
	{
		System.out.println("Array in reverse order: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		ArrayDisplay a=new ArrayDisplay();
		a.Display();
		a.reverseDisplay();
		List<Integer> list=new ArrayList<Integer>();	//to convert arrays to list
		List<int[]> l=Arrays.asList(arr);
	}
}

