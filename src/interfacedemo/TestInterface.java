package interfacedemo;

class TestInterface {

	
	public static void main(String[] args) {
		Mercedes m=new Mercedes();
		m.accelerates();
		m.breaks();
		m.engine();
		
				
		Car c=new Mercedes();
		c.accelerates();
		c.breaks();
		
		
	}
	 

}
