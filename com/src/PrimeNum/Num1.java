package PrimeNum;

public class Num1 {

	public static void main(String[]args) {
		
		int n=1 ;
		
		int count= 0;
		
		for(int i=1;i<=n;i++) {
			
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime num");
		}
		else {
			System.out.println("not prime num");
		}
	}
	
}
