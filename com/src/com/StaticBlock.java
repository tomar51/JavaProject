package com;
// p static block how to work with all the block is
//static [p for all static block]


public class StaticBlock { 
	
	static int a;
	
	static {
		System.out.println("static block 6");
	}
	public static void main(String[]args) {
		System.out.println("main method start");
		
		System.out.println("main method end");
	}
	static {
		System.out.println("s b 3");
	}
	static {
		
	System.out.println("s b 4");
	}

}
