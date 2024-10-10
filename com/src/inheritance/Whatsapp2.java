package inheritance;

public class Whatsapp2 extends Whatsapp1 {
	
	void message() {
		
		System.out.println("single tick");
		
		System.out.println("double tick");
		
		System.out.println("blue tick");
		
	}
	
	void call() {
		
		System.out.println("voice message");
		
		System.out.println("voice call");
		
		System.out.println("video call");
	}
	
	public static void main(String[]args) {
		
		Whatsapp w=new Whatsapp();
		
		Whatsapp1 w1=new Whatsapp1();
		
		Whatsapp2 w2=new Whatsapp2();
		
		w.message();
		
		w.call();
		
		w1.message();
		
		w1.call();
		
		w2. message();
		
		w2.call();
				
	}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	

}
