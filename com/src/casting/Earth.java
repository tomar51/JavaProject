package casting;

public class Earth extends Sun {
	
	String earthcolour ="green";
	
	void earthtem() {
		
		System.out.println("earth tem is normal");
	}
	
	public static void main(String[]args) {
		
		 Sun s=new Earth();
		 
		 Earth e= (Earth)s;
		 
		 System.out.println(s.suncolour);
		 
		 s.tem();
		 
		 System.out.println(e.earthcolour);
		 
		 e.earthtem();
		
	}

}
