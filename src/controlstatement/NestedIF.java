package controlstatement;

public class NestedIF {
public static void main(String[] args) {
	int a=5;
	if(a>0)
	{
		if(a%2==0)
		{
	System.out.println(a+ " is even number");
		}
	else
	{
		System.out.println(a+" is odd number");
	}
	System.out.println(a+ " is positive number");
}
}
}
