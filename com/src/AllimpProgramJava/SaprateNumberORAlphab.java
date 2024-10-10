package AllimpProgramJava;

public class SaprateNumberORAlphab {

	public static void main(String[] args) {

		String s = "a 1 b 2 c 3";
		String alpha ="",num = "";
		
		for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch>='0'&&ch<='9') {
				
				num=num+ch;
			}
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				
				alpha = alpha+ch;
			}
		}
		System.out.println(alpha+num);
	}

}
