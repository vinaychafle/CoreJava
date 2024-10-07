package hasA;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter City , State, pincode, name, id");
	Address ad=new Address(sc.next(),sc.next(),sc.next());
	
	Employee e=new Employee(sc.next(),sc.nextInt(),ad);
	e.display();
	sc.close();
}
}
