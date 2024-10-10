package com;

//(this class child class for father class)[inheritance]




public class Son  extends Father{
	
String name ="shyam";
	
	void boy() {
		
		System.out.println("having fathers property");
	}
	public static void main(String[]args) {
		
		Son  b=new Son();
		
 //Father f= new Father();//no use 
	
		
		System.out.println(b.fname);
		
	System.out.println(b.age);
		
		System.out.println(b.name);
		
		b.boy();
		
		b.property();
		
		b.property1();
		

	

}


	
	





}
