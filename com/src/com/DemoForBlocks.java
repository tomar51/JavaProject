package com;

//exp for static block and non static block 

public class DemoForBlocks {
	
	static {
		System.out.println("static block -1");
	}
	{
		System.out.println("non static block -1");
		
	
	}
	static {
		System.out.println("static block -2");
	}
	{
		System.out.println("non static block -2");
	}
	
	public static void main(String[]args) {
		
		System.out.println("main start");
		
		 DemoForBlocks d=new  DemoForBlocks();
		 
		 System.out.println("main end");
	}
	
	static {
		System.out.println(" static block -3");
		DemoForBlocks d1= new DemoForBlocks ();
		
	}
	{
		System.out.println("non static block -6");
	}

	{
		System.out.println("non static block -4");
	}
	
	static {
		System.out.println(" static block -4");
	
	}
	
	{
		System.out.println("non static block -5");
	}

}
