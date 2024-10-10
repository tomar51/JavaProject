package com;

public class Demo4 {
	
//with R.T & without F.A & write Return? (class w) 	
	
	public static int add() {
		
		int c =20+10;
		
		System.out.println(c);
		
		return c;
	}
	
	public static void main (String[]args) {
		
	System.out.println(add());
	
		int d = add();
		
		System.out.println(d);
		
		add();
		
		System.out.println(add());
	}

}
