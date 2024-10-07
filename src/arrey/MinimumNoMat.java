package arrey;

public class MinimumNoMat {
	
	public static void main(String[] args) {
		//Q) FInd the maximum number from column in which minimum number is present
		int arr[][]={{1,2,6},{5,1,1},{0,4,7}};
		int min=arr[0][0];
		int col=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
					col=j;
				}
			}
		}
		int k=0;
	    int max=arr[0][col];
	
		while(k<3)
		{
			if(arr[k][col]>max)
			{
				max=arr[k][col];
			}
			k++;
		}
		System.out.println(max);
	}

}
