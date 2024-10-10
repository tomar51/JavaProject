package com;

public class Calldemo2 {
	public static int add(int a,int b) {
		int c = a+b;
//call class with return type and with formal argument 		
		//Q) given 1
		
		return c;
		
	}
	public static int mul(int a,int b) {
		int c = a*b;
		
		return c;
	}
	public static int sub(int a,int b) {
		int c = a-b;
		return c;
	}
	public static int div(int a, int b) {
		int c = a%b;
		return c;
	}
	public static int mod(int a, int b) {
		int c = a/b;
		return c;
	}
	public static void main (String[]args) {
		System.out.println("start");
		
		System.out.println(add(2,8));
		
		System.out.println(mul(2,6));
		
		System.out.println(sub(8,4));
		
		System.out.println(div(2,4));
		
		System.out.println(mod(2,4));
		
		System.out.println("end");
		
		
		
	}

}
