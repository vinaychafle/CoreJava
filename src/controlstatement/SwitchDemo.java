package controlstatement;

public class SwitchDemo {
public static void main(String[] args) {
	int e=2;
	int a=10,b=20;
	System.out.println("1.Addition 2.Substraction 3. Multiplication");
	switch(e)
	{
	case 1:System.out.println(" Addition "+ (a+b)); break;
	case 2:System.out.println(" Substraction "+(a-b)); break;
	case 3:System.out.println(" Multiplication "+(a*b)); break;
	default:System.out.println("Please enter correct choice");
	}
	int n=50;
	System.out.println("lets find even odd number");
	switch(n%2)
	{
	case 0:System.out.println("number "+n+" is even number");break;
	case 1:System.out.println("number "+n+" is odd number");break;

	}
	System.out.println("-------------------");
	String day = "Friday";
	switch(day)
	{
	case "monday":System.out.println(" monday is first day of week");break;
	case "Tuesday":System.out.println(" Tuesday is Second day of week");break;
	case "Wednesday":System.out.println(" Wednesday is Third day of week");break;
	case "Thursday":System.out.println(" Thursday is Fourth day of week");break;
	case "Friday":System.out.println(" Friday is Fifth day of week");break;
	case "Saturday":System.out.println(" Saturday is Sixth day of week");break;
	case "Sunday":System.out.println(" Sunday is Third day of week");break;
	default:System.out.println("There are seven days in the week");
	}
	System.out.println("-------------------");
	String month = "June";
	switch(month)
	{
	case "January":System.out.println(" January is the 1st month of year");break;
	case "February":System.out.println(" February is the 2nd month of year");break;
	case "March":System.out.println(" March is the 3rd month of year");break;	
	case "April":System.out.println(" April is the 4th month of year");break;	
	case "May":System.out.println(" May is the 5th month of year");break;	
	case "June":System.out.println(" June is the 6rd month of year");break;	
	
	
	
	}
	
	
}
}
