package AllimpProgramJava;

public class CountTheWordPresent {

	public static void main(String[] args) {


		String s = " Hi Hi Hii Bye Hello";
		String tar= "Hi";
		String s1[]=s.split(" ");
		int count = 0;
		
		for(int i=0;i<s1.length;i++) {
			
            String word =s1[i];
            
			if(tar.equals(word)) {
				
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
