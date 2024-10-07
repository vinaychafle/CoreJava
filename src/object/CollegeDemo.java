package object;

public class CollegeDemo {
	public static void main(String[] args) {
		Bank b1= new Bank();
		b1.setData();
		b1.display();
		System.out.println("=============");
		
		College b2= new College();
		b2.College_name="JD College of engineering";
		b2.code=405;
		b2.Field="engineering";
		b2.number_of_department=12;
		
		System.out.println("name: "+b2.College_name);
		System.out.println("code : "+b2.code);
		System.out.println("number_of_department: "+b2.number_of_department);
		
				
	}
}
