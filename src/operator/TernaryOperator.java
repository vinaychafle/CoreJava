package operator;
import java.util.Scanner;

public class TernaryOperator {
public static void main(String[] args) {
	int a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("anter values for a & b ");
	a= sc.nextInt();
	b= sc.nextInt();
	System.out.println("the smaller number is " + ((a<b)?a:b));
	System.out.println("the bigger number is " + ((a>b)?a:b));
	int smaller = (a<b)?a:b;
	System.out.println(smaller + " is smaller number");
	int bigger = (a>b)?a:b;
	System.out.println(bigger + " is bigger number");
	sc.close();
	
}
}
