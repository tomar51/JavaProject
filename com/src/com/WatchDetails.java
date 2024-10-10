package com;
//[p for details for watch]( with constructor create)
//(& with create multiple object given value in it)

public class WatchDetails {
	String brandname;
	int price;
	int modelno;
	
WatchDetails(String brandname,int price,int modelno){
	
	this.brandname =brandname;
	
	this.price =price;
	
	this.modelno= modelno;
}
void details() {
	
	System.out.println("watch brand is  "+brandname);
	
	System.out.println("watch price is  "+price);
	
	System.out.println("watch model no is  "+modelno);
	System.out.println();
}
public static void main(String[]args) {
	
WatchDetails watch1 =new WatchDetails("fasttrack",2000,42);
	
WatchDetails watch2 =new WatchDetails("boat",2200,45);

WatchDetails watch3 =new WatchDetails("titan",3000,52);

  watch1. details();
  
  watch2. details();
  
  watch3. details();
}


}
