package arrey;

public class MaxNumber {
	int a[]={75,233,34,90,60};
	      // 0   1   2  3  4
	int max=a[0]; //max=75
	int min=a[0];
	void testmax(){
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("maximum number is "+max);
	}
	
	void testmin()
	{
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("minimum number is : "+min);
	}
	public static void main(String[] args) {
		MaxNumber max=new MaxNumber();
		max.testmax();
		max.testmin();
		
	}
}
