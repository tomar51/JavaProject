package getSetMethod;

public class User {
	
	public static void main(String[]args) {
		
		Insta i=new Insta();
		
		System.out.println(i.username);
		
		System.out.println(i.get());
		
		i.set(333); 
		
		System.out.println(i.get());
		
		
	}

}
