package controlstatement;

import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		
	int i=5;
do{
	System.out.println(i*5);
i++;
}while(i>=10);
	System.out.println("=============");
Scanner sc= new Scanner(System.in);
int ch;
do
{
	System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.DIVISION ENTER THE CHOICE:  ");
ch=sc.nextInt();
int n1,n2;
	switch(ch)
	{
		case 1:n1=sc.nextInt();
			   n2=sc.nextInt();
			   System.out.println("Addition is :"+(n1+n2));
			   break;
			   
		case 2:n1=sc.nextInt();
		   n2=sc.nextInt();
		   System.out.println("Substraction is :"+(n1-n2));
		   break;
		   
		case 3:n1=sc.nextInt();
		   n2=sc.nextInt();
		   System.out.println("Multlipication is :"+(n1*n2));
		   break;
		   
		case 4:n1=sc.nextInt();
		   n2=sc.nextInt();
		   System.out.println("DIVISION is :"+(n1/n2));
		default: System.out.println("Please enter valid choice");
	}
	System.out.println("If you want to continue press 1 else press 0 to exit ");
	ch=sc.nextInt();
}
while(ch!=0);
sc.close();
}
}
