package com;

public class Train extends IRCTC{
	
	int seatno=27;
	
	void food() {
		
		System.out.println("food is not god");
	}
	public static void main(String[]args) {
		
		Train t=new Train();
		
		t.booking();
		
		System.out.println(t.PNRNo);
		
		System.out.println(t.seatno);
		
		t.food();
		
	}

}
