package com;

public class Flight extends IRCTC{
	
	int seatno=24;
	
	void food() {
		
		System.out.println("food is normal");
	}
	
	public static void main(String[]args) {
		
		Flight f=new Flight();
		
		f.booking();
		
		System.out.println(f.PNRNo);
		
		System.out.println(f.seatno);
		
		f.food();
		
	}

}
