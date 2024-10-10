package com;



public class Watches {
	
	static int price =10000;
	
	String brand;
	
	 static void start() {
		  
		 System.out.println("my watch is started");
		 
		 
		
	}
	 void stop() {
		 
		 System.out.println("my watch is stoped"); 
	 }
	 static {
		 System.out.println("welcome to watch");
		  
	 }
	 
	 {
		 System.out.println("i am buying the watch");
	 }
	 Watches(String brand){
		 this.brand=brand;  //constructor create
	 }
		 
		 
	 
	 public static void main(String[]args) {
		 
	System.out.println( Watches.price);
	
	Watches.start();
		
		 Watches w1 =new Watches("rolex");
		 
		 System.out.println(w1.brand);
		 
		
		 
		 w1.stop();
		 
	 }
	 
	

}
