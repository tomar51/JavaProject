package Abstract;

//exp

public class B extends A{
	
	void add() {
		
		System.out.println("adding");
		
	}
	
	void sub() {
		
		System.out.println("sum");
	}
	
	public static void main (String[]args) {
		
		B b=new B();
		
		b.add();
		
		b.sub();
		
	}

}
