package AllimpProgramJava;

public class NumberPresentInString {

	public static void main(String[] args) {

		String s = "Java@123";
		String rev = "";
		
		for(int i = 0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch>='0'&&ch<='9') {
				
				rev=rev+ch;
			}
		}
		System.out.println(rev);
	}

}
