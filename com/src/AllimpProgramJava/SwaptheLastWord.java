package AllimpProgramJava;

public class SwaptheLastWord {

	public static void main(String[] args) {

		String s= "Java is Fun";
		String s1[]=s.split(" ");
		String temp = s1[0];
		
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		
		String rev ="";
		
		for(int i=0;i<s1.length;i++)
		{
			rev=rev+s1[i]+"";
		}
		System.out.println(rev);
	}

}
