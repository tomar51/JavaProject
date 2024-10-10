package overLoading;

public class A {
	
	
	void bike(int a) {
		
		System.out.println("m 1");
	}
	
	void bike(double a) {
		
		System.out.println("m 2");
	}
	
	public static void main(String[] args) {
		
		A a=new A();
		a.bike(0);
	}                                                              

}
