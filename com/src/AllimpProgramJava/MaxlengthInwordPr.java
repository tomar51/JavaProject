package AllimpProgramJava;

public class MaxlengthInwordPr {

	public static void main(String[] args) {

		String s = "Java is a Programming Language";
		String s1[]= s.split(" ");
		String max = s1[0];
		
		for(int i =0;i<s1.length;i++) {
			
			String word = s1[i];
			
			if(word.length()>max.length()) {
				
				max=word;
			}
		
		}
		System.out.println(max);
	}

}
