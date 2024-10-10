package AllimpProgramJava;

public class PalinDromeNumber {

	public static void main(String[] args) {
		
		int num = 121, rev= 0, copynum =num;
		
		while(num>0) {
			
			int reminder = num%10;
			
			rev =rev*10+reminder;
			
			num = num/10;
		}
		if(copynum==rev) {
			
			System.out.println("It is Palindrome Number");
		}
		else {
			System.out.println("Not Palindrome number");
		}

	}

}
