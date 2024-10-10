package revision;

public class C extends A{
	
	String ename="abc";
	
	void property3() {
		
		System.out.println("home");
		
	}
	
	public static void main(String[] args) {
		
	
		C c=new C();
		
		System.out.println(c.name);
		
		System.out.println(c.ename);
		
		System.out.println(c.sal);
		
		c.property();
		c.property2();
		c.property3();
	}
	

}
