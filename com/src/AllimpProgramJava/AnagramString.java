package AllimpProgramJava;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String firstst = "top";
		String secondst = "pot";
		
		if(firstst.length()!=secondst.length()) {
			
			System.out.println("Not Anagram Num");
		}
		else {
			char ch[]=firstst.toCharArray();
			char ch1[]= secondst.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			boolean flag= false;
			
			for(int i =0;i<ch.length;i++)
			{
				if(ch[i]==ch1[i]) {
					
					flag=true;
				}
			else
			{
				flag=false;
				break;	
			}
			}
		
		if(flag==true)
		{
			System.out.println("anagram");
		}
			
		else
		{
			System.out.println("Not Anagram");
		}
			}
		
	}
}
