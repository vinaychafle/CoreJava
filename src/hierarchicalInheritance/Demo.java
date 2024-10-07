package hierarchicalInheritance;

public class Demo {
public static void main(String[] args) {
	Civil c=new Civil();
	c.teach();
	c.physics();
	
	System.out.println("============");
	Mechanical mech=new Mechanical();
	mech.PhysicsToMech();
	mech.teach();
}
}
