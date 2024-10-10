
package inheritance;

public class Cat extends Animal {
	
	String name = "catii";
	
	void meow() {
		
		System.out.println("cat meow");
		
	}
	
	public static void main(String[] args) {
		
		Cat c= new Cat();
		
		System.out.println(c.name);
		
		c.meow();
		
		c.eat();
		
		c.sleep();
		
	}

}
