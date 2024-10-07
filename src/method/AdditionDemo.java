package method;

public class AdditionDemo {
public static void main(String[] args) {
	Addition a=new Addition();
			a.a=15;
			a.b=20;
			a.addition();
			
			Addition a1=new Addition();
			a1.a=10;
			a1.b=40;
			a1.addition();
			
			a.a=100;
			a.b=200;
			a.addition();
			
			System.out.println("Addition of 44 & 55 is "+a.add(44, 55));
			
			a1.a=70;
			a1.b=75;
			a1.addition();
			
			int sum=a1.add(44, 55);//calling add method by passing parameters 44 & 55
			System.out.println("addition is "+sum);
			
			a1.addValue(22, 33);
}
}
