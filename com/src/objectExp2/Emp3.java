package objectExp2;

public class Emp3 {
	
	String name;
	
	Emp3(String name){
		
		this.name=name;
	}
	
	//@override
	
	public String toString() {
		
		return "name of emp "+name;
	}
	
	public static void main(String[] args) {
		
		Emp3 e = new Emp3("aditi");
		
		Emp3 e2= new Emp3("shruti");
		
		System.out.println(e);
		System.out.println(e2);
	}

}
