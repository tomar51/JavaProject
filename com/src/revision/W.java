package revision;

public class W {
	
	static int price = 2000;
	
	String  brand ;
	
	
	
	static void wateh() {
		
		System.out.println(" watch start");
	}
	void stop() {
		
		System.out.println(" watch stop");
		
	}
	
	static  {
		
		System.out.println("welcome to the watch");
		
	}	
	
	{
		
		System.out.println(" i am buying watch");
	}
	
	W(String brand){
		
		this.brand=brand;
		
		
	}
	
	public static void main(String[] args) {
		
		W w=new W("boat");
		
		System.out.println(price);
		System.out.println(w.brand);
		
		
		W.wateh();
		
		w.stop();
		
	}

}
