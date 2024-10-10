package AllimpProgramJava;

public class PalinDromeString {

	public static void main(String[] args) {
		
		String name = "JAVAJ";
		String rev = "", copyname = name;
		
		for(int i =name.length()-1;i>=0;i--) {
			
			rev = rev+name.charAt(i);
			
		}
		if(copyname.equals(rev)) {
			
			System.out.println("It  is Pailndrome");
		}else {
			
			System.out.println("Not Palindrome");
		}

	}

}
