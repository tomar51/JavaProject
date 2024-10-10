package AllimpProgramJava;

public class CountVowelNumSpacialCharConsonant11 {

	public static void main(String[] args) {

		String s = "java@123";
		int v=0,c=0,sc=0,num=0;
		
		for(int i=0;i<s.length();i++) {
			
			char ch= s.charAt(i);
			
			if(ch>='a'&&ch<='z') {
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				v++;
			}
			else {
				c++;
			}}
			 else if(ch>='0'&&ch<='9') {
				
				num++;
				
			}
			
			else {
				
				sc++;
			}
			
		
	}System.out.println();

	}
}
