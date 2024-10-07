package inheritance;

import java.util.Scanner;

public class MultilevelInheretance {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter child name ,Father name ,Surname and Grandfather name");
	Son s=new Son(sc.next(),sc.next(),sc.next(),sc.next());
	s.displayInfo();
	sc.close();
	
}
}
