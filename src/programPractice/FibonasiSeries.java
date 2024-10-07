package programPractice;

public class FibonasiSeries {

	public static void main(String[] args) {
		
		int x=0,y=1,z=0;
		for(int i=0;i<=9;i++)
		{
			System.out.print(z+" ");
			x=y;
			y=z;
			z=x+y;
		}

	}

}
