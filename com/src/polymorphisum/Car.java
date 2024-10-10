package polymorphisum;

public class Car extends Vehicle {
	
	void start() {
		
		System.out.println("car is start");
	}
	
	void stop() {
		
		System.out.println("car is stop");
	}
	
	public static void main(String[]args) {
		
		Vehicle c=new Car();
		
		c.start();
		
		c.stop();
		
	}

}
