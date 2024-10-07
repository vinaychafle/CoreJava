package controlstatement;

public class LeapYearProgram {
public static void main(String[] args) {
	int y=700;
	
	if(y%4==0)
	{
		
	
	if(y%100==0)
	{
	
		if(y%400==0)
		
			{
			System.out.println(y+ (" is a leap year"));
			}
			}
		else
		{
			System.out.println(y+(" is not a leap year"));
		}
		
	}
	else
	{
		System.out.println(y+" is a leap year");
	}
	}
	
}

