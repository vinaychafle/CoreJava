package programPractice;

public class ArmstrongNumber {
public static void main(String[] args) {
	int n=153,length=0;
	int t1=n;  //logic of //first we have to find length for multiplication
	while(t1>0)
	{
	t1=t1/10;
	length=length+1;
	}
	
	int t2=n,rem;
	int arm=0;
	
	while(t2!=0)
	{	int mul=1;
		rem=t2%10;
	for(int i=1;i<=length;i++)
	{
		mul=mul*rem;
	}
	arm=arm+mul;
	t2=t2/10;
	
	}
	if(arm==n){
		System.out.println(n+" is armstrong number");
		}
		else
		{
			System.out.println(n+" is not armstrong number");
		}
}
}
