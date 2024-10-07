package programPractice;

public class SquareRoot {
public static void main(String[] args) {
	int num=9;
	double temp;
	double sr=num/2; //9/2=4
	
	do
	{
		temp=sr;//4, 3
		sr=(temp+(num/temp))/2; //(4+(9/4))/2=4+2/2=3
								//(3+(9/3))/2=3
	}
	while(temp-sr!=0);
	System.out.println("Square root of number is "+sr);
}
}
