package interfacedemo;

public class Mercedes implements Car {

	@Override
	public void gearMode() {
		System.out.println("car is in gear mode");
		
	}

	@Override
	public void engine() {
		System.out.println("engine is on");
		
	}

	@Override
	public void accelerates() {
		System.out.println("car can accelerates");
		
	}

	@Override
	public void breaks() {
		System.out.println("car has disk break");
		
	}

}
