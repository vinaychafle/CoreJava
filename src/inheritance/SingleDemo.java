package inheritance;

import java.util.Scanner;

public class SingleDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name, Father name,Surname");
		
		Son son=new Son(sc.next(),sc.next(),sc.next(),sc.next());
		son.display();
		sc.close();
		
	}
}
