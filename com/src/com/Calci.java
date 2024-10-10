package com;

public class Calci{
	
//(Method OverLOading) without R.T & with F.A (+,-,%,*)
	

	public static void add(int a,int b) {
	
		System.out.println("M1");
		int c = a+b;
		System.out.println(c);
	}
	
	public static void add(int a,double b) {
		
		System.out.println("M2");
		double c = a+b;
		System.out.println(c);
	}
	
	public static void add(double a, double b) {
		
		System.out.println("M3");

		double c =a+b;
		System.out.println(c);
	}
	
	public static void add(int a, int b, int c) {
		
		System.out.println("M4");

		int d = a+b+c;
		System.out.println(d);
	}
	
	public static void add(double a,double b,double c) {
		
		System.out.println("M5");

		double d = a+b+c;
		System.out.println(d);
	}
	
	public static void  sub(int a, int b) {
		
		System.out.println("M6");

		int c = a-b;
		System.out.println(c);
	}
	
	public static void  sub(int a, double b) {
		
		System.out.println("M7");
		double c= a-b;
		System.out.println(c);
	}
	public static void  sub(double a, double b) {
		
		System.out.println("M8");
		double c= a-b;
		System.out.println(c);

	}
	public static void  sub(double a, double b, double c) {
		
		
		System.out.println("M9");
		double d= a-b-c;
		System.out.println(d);

	}
	public static void  sub(int a, int b, int c) {
		
		System.out.println("M10");
		int d = a-b-c;
		System.out.println(d);

	}
	
	public static void  mul(int a, int b) {
		
		System.out.println("M11");

		int c = a*b;
		System.out.println(c);
	}
	
	public static void  mul(int a, double b) {
		
		System.out.println("M12");
		double c= a*b;
		System.out.println(c);
	}
	public static void  mul(double a, double b) {
		
		System.out.println("M13");
		double c= a*b;
		System.out.println(c);

	}
	public static void  mul(double a, double b, double c) {
		
		
		System.out.println("M14");
		double d= a*b*c;
		System.out.println(d);

	}
	public static void  mul(int a, int b, int c) {
		
		System.out.println("M15");
		int d = a*b*c;
		System.out.println(d);

	}
	
	
	public static void  div(int a, int b) {
		System.out.println("M16");

		int c = a%b;
		System.out.println(c);
	}
	
	public static void  div(int a, double b) {
		
		System.out.println("M17");
		double c= a%b;
		System.out.println(c);
	}
	public static void  div(double a, double b) {
		
		System.out.println("M18");
		double c= a%b;
		System.out.println(c);
		

	}
	public static void  div(double a, double b, double c) {
		
		
		System.out.println("M19");
		double d= a%b%c;
		System.out.println(d);
		


	}
	public static void  div(int a, int b, int c) {
		
		System.out.println("M20");
		int d = a%b%c;
		System.out.println(d);
		
		

	}
	
	public static void main(String[]args) {
		
	
	    add(2,4);
		add(10,4.0);
		add(20,1.0);
		add(2,4,60);
		add(10,20,3.0);
		
        sub(4,2);
		sub(10,20.9);
		sub(20.0,10.0);
		sub(10.0,20,20.8);
		sub(8,10,20);

		mul(4,2);
		mul(10,20.9);
		mul(20.0,10.0);
		mul(10.0,2.0,20.8);
		mul(8,4,2);

		div(4,2);
		div(10,20.9);
		div(20.0,10.0);
		div(10.0,20,20.8);
		div(8,10,20);
	
	

	
	


	
	

	
	

	
		
		
	

	

		
	


		
		
		
		
	}
	
	
	

}
