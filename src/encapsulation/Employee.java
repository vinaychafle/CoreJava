package encapsulation;

public class Employee {

	private int id;
	private String name;
	
	public void setid(int id){
		this.id=id;
	}
	
	public void getid(){
		System.out.println(id);
	}
	
	public void setname(String name){
		this.name=name;
		
	}
	public void getname(){
		System.out.println(name);
	}
}
