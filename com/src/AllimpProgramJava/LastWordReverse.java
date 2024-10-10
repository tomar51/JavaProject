package AllimpProgramJava;

public class LastWordReverse {

	public static void main(String[] args) {

		String s= "java is fun";
		String s1[]=s.split(" ");
		
		String word = s1[s1.length-1];
		String rev= "";
		
		for(int i=word.length()-1;i>0;i--) {
			
			rev= rev+word.charAt(i);
		}
		s1[s1.length-1]=rev;
		
		int result =0;
		
		for(int i =0;i<s1.length;i++) {
			
			rev=rev+s1[i];
		}
		System.out.println(rev);
		
	}

}
