package com;
                                      // 7/9/23    
                               
public class ExpStaticVariableStaticBlock {
	
//static variable & static block	

	static int a;
	static {
		a=10;    //[for print this given print statement]
	}
	public static void main(String[]args) {
		System.out.println(a);
	}

	//static variable & non static block
	
	/*static int a;
	
	{
//for print this given a print statement & create a object
		
		a=20;
		

//System.out.println(a);
	}
	
	public static void main(String[]args) {
		System.out.println(a);
		
		
// ExpStaticVariableStaticBlock e=new ExpStaticVariableStaticBlock();
					 
		 
	}*/
	
//non static variable & static block
	
	/*int a;
	
	static {
		double a =20;
		System.out.println(a);
	}
	public static void main(String[]args) {
		System.out.println(a);  // error
	}*/
	
	//N S V & N S B
	
	/*int b;
	
	{
		int c=30;
		//System.out.println(c);
	}
	public static void main(String[]args) {
		
		System.out.println(b);    //error
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
