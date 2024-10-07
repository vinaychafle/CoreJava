package overriding;

public class Demo {
public static void main(String[] args) {
	Bike b=new Bike();
			b.run();
			
	Car c=new Car();
	c.run();
	
	SBI s=new SBI();
	System.out.println("Rate of intrest of SBI is "+s.rateofIntrest());
	
	ICICI i=new ICICI();
	System.out.println("Rate of intrest of ICICI is "+i.rateofIntrest());
	
	Axis a=new Axis();
	System.out.println("Rate of intrest of Axis is "+a.rateofIntrest());
	
	Herbivorus h=new Herbivorus();
	h.eat();
	
	Carnivorus c1=new Carnivorus();
	c1.eat();
	
	Omnivorus o=new Omnivorus();
	o.eat();
	
}
}
