package com;

//[class Loading process for static variable & static method]	


public class VariableStatcMethod {
	

//(p. for 1 static variable & 2 static method ?)
	
	
	/*static int age = 20;
	
	public static void add(int a, int b) {
		
		int c =a+b;
		System.out.println(c);
	}
	
	public static void main(String[]args) {
		
		System.out.println(age);
		
		add(20,50);
	}*/
	
//(p. for 3 static variable & 2 static method?)	
	
	
	
	/*static int age =26;
	
	static String name = "aditi";
	
	static double sal =1000.00;
	
	public static void disp() {
		
System.out.println("my age is:"+VariableStatcMethod.age);
    
System.out.println("my name is:"+ name);
     
	}
    
   public static void main(String[]args) {
	   
	   disp();
	   
	   System.out.println(VariableStatcMethod.sal);
	   
   }*/
	
//(p. for 3 static variable & 2 static method?)	
		
	
	
	static int empid =4;
	
	static String empname = "abc";
	
	static double empsal = 200.0;
	
	public static void empDetails() {
		
		System.out.println("empname is:"+ empname);
	}
	
	public static void main(String[]args) {
		
		empDetails();
		
		System.out.println(empid);
		
		System.out.println(empsal);
		
		
	}
	
    
	

}
