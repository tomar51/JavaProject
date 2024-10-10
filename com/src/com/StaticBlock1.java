package com;

//p(book) class non static block non static method [object] 

public class StaticBlock1 {
	
	static {
		System.out.println("welcome");
		
		System.out.println();//only for space
		
		System.out.println("static block 1");
		
		System.out.println();
	}
		static String bookname="java";
		
		
 public static void read() {
	 
	 System.out.println("read java book");
	 
	 System.out.println();
	 
 }
 
 {
	 System.out.println("non static B");
	 
	 System.out.println();
 }
    String author ="rahul";
 
 
 void write(){
	 System.out.println("writing book");
	 
	 System.out.println();
	 
 }
 
 public static void main(String[]args) {
	 
	 System.out.println(StaticBlock1.bookname);
	 
	 read();
	 
	 StaticBlock1 b=new StaticBlock1();
	 
	 System.out.println(b.author);
	 
	 b.write();
	 
 }
 
 
 
 
 
 
 
 
 
 
}
