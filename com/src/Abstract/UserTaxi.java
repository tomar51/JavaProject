package Abstract;

public class UserTaxi {
	
	public static void main(String[]args) {
		
		Taxi o=new Ola();
		
		o.startTrip();
		
		o.endTrip();
		
		Taxi u=new Uber();
		
		u.startTrip();
		
		u.endTrip();
	}

}
