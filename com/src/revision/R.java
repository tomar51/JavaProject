package revision;

public class R {
	
	public static void main(String[]args) {
		
		String s="aditi";
		String d="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			d=d+s.charAt(i);
		}
		System.out.println(d);
	}

}
