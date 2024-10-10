package polymorphisum;

public class Bike extends Vehicle {
	
	void start() {
		
		System.out.println("bike is start");
	}
	
	void stop() {
		
		System.out.println("bike is stop");
	}
	
	public static void main(String[]args) {
		
		Vehicle b=new Bike();
		
		//Vehicle b=new Vehicle();
		
		
		
		b.start();
		
		b.stop();
	}

}
