package constructors;
import java.util.Scanner;
public class RectangleDemo {
public static void main(String[] args) {
	Rectangle r=new Rectangle();
	System.out.println(r);
	r.Area();
	System.out.println("===========");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values for lenght and width: ");
	Rectangle r1=new Rectangle(sc.nextInt(),sc.nextInt());
	System.out.println(r1);
	r1.Area();
	sc.close();
	
	
}
}
/*constructor is a block of code similar to method. It can be called using object
 * it is used to initialize the object.
 * When constructor is called memory for object is allocated to memory
 * type 1 Default constructor
 * type 2 Parameterized constructor 
 */