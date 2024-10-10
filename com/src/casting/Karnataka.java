package casting;

public class Karnataka extends Bharat {
	
	String CM="ABC";
	
	public static void main(String[]args) {
		
		Bharat b=new Karnataka();
	
		Karnataka k= (Karnataka) b;
				
		System.out.println(b.PM);
		
		System.out.println(k.CM);
				
				
	}
	

}
