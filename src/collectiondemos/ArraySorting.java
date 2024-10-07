package collectiondemos;

import java.util.Arrays;

public class ArraySorting {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {5, 3, 8, 1, 2, 7, 4, 6};

		 int length=array.length;
	      
		 for(int i=0;i<length;i++)
		 {
			 for(int j=1;j<length-i;j++)
			 {
				 if(array[j-1]>array[j])
				 {
					 int temp=array[j];
					 array[j]=array[j-1];
					 array[j-1]=temp;
				 }
			 }
		 }
	       // System.out.println("Original array: " + Arrays.toString(numbers));

	        // Sort the array
	      //  Arrays.sort(numbers);
	       

	        // Print the sorted array
	        System.out.println("Sorted array: " + Arrays.toString(array));
	}

}
