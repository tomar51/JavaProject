package programs;

public class PalindromeInString {

	public static void main(String[] args) {
		
		String name = "NAMAN";
		
		String rev = "";
		
		for(int i =name.length()-1;i>=0;i--) {
			
			rev = rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			
			System.out.println("palindrome Num");
			
			
		}
		else {
			
			System.out.println("Not Palindrome");
		}
		
		

	}

}
