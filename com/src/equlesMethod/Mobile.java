package equlesMethod;

// string & tostring method

public class Mobile {
	
	String brand;
	
	String colour;
	
	double price;
	
	String ram;
	
	 Mobile(String brand,String colour,double price,
			 String ram)
			{
		
		this.brand=brand;
		this.colour=colour;
		this.price=price;
		this.ram=ram;
	}
	  public String toString() {
		  
return "my phone brand  "+  brand  +  " colour is " + colour
		 
		 + " price is " + price +  " ram is  "  + ram;
	 }
	public boolean  equlas(Object Obj) {
		
		Mobile m= (Mobile)Obj;
		
return	this.brand == m. colour && this.brand == m.ram;
		
		
	}
	public static void main(String[]args) {
		
Mobile m1 = new Mobile("vivo","red",20000,"6 mb");

Mobile m2= new Mobile("mi","blue",10000,"4mb");

Mobile m3= new Mobile("iphone","white",50000,"5mb");

Mobile m4= new Mobile("intex","black",80000,"2mb");
		
    System.out.println(m1);
     System.out.println(m2);
     System.out.println(m3);
     System.out.println(m4);
     
     
     m2.equals(m3);
     m1.equals(m2);
     m3.equals(m4);
     
     
     


		
	}

}
