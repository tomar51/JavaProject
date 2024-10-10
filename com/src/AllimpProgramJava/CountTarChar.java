package AllimpProgramJava;

public class CountTarChar {

	public static void main(String[] args) {

		String s = "Java";
		char tar= 'a';
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(tar==ch) {
				
				count ++;
			}
		}
		if(count>0) {
			
			System.out.println(count);
		}
		else {
			System.out.println("Not Present");
		}
	}

}
