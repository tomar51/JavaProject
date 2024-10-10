package overRiding;

public class B extends A {
	
	int age =20;
	
	void add() {
		
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		
		B b=new B();
		b.add();
		System.out.println(b.age);
	}

}
