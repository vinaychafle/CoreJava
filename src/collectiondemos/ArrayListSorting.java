package collectiondemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSorting {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(6);
		list.add(2);
		 int length=list.size();
	      
		 for(int i=0;i<length;i++)
		 {
			 for(int j=1;j<length-i;j++)
			 {
				 if(list.get(j-1)>list.get(j))
				 {
					 int temp=list.get(j);
					
				 }
			 }
		 }
	       // System.out.println("Original array: " + Arrays.toString(numbers));

	        // Sort the array
	      //  Arrays.sort(numbers);
	       

	        // Print the sorted array
	       // System.out.println("Sorted array: " + Arrays.toString(array));
	}

}
