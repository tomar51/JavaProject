package Abstract;

public class FoodUser {
	
	public static void main(String[] args) {
		
	
	
	FoodDelivery s= new Swiggy();
	
	s.orderFood();
	
	s.payment();

	
	FoodDelivery zo= new Zomato();
	
	zo.orderFood();
	
	zo.payment();
	
	FoodDelivery ze= new Zepto();
	
	ze.orderFood();
	
	ze.payment();
	
}
	}

