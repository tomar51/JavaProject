package com;

//for non static object creation


public class ObjectDemo {
	
	static int a = 30;
	
	int b = 20;
	
	public static void add() {
		
		System.out.println("adding");
	}
		
		void sub() {
			
			System.out.println("subtraction");
		
	}
		public static void main(String[]args) {
			
			System.out.println(ObjectDemo.a);
			
			add();
			
			ObjectDemo d = new ObjectDemo();
			
			System.out.println(d.b);
			
			d.sub();
			
		}
	
	
	
	
	


}
