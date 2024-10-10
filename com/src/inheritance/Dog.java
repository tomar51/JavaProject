package inheritance;

public class Dog extends Animal {
	
	String name= "lucy";
	
	void Brak(){
		
		System.out.println("dog barking");
	}
	
	public static void main(String[] args) {
		
		Dog d=new Dog();
		
		System.out.println(d.name);
		
		d.Brak();
		
		d.eat();
		
		d.sleep();
		
	}
	

}
