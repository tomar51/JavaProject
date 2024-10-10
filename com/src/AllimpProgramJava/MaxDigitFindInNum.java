package AllimpProgramJava;

public class MaxDigitFindInNum {

	public static void main(String[] args) {
		
		long l = 238556789;
		
		long max = l%10;
		
		while(l>0) {
			
			long d= l%10;
			
			if(d>max) {
				
				max=d;
				
			}
			  l=l/10;	
		}
		
		System.out.println(max);
		

	}

}
