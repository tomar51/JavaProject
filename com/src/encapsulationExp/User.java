package encapsulationExp;

public class User {
	
	public static void main(String[]args) {
		
		
		Insta i=new Insta();
		
		System.out.println(i.uname);
		
		System.out.println(i.get());
		
		i.set(4321);
		
		System.out.println(i.get());
	}

}
