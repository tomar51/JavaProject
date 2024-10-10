package demo310;

public class NStatic {
	
	int a1=10;
	
	int b2=20;
	
	public static void main(String[] args) {
		
		NStatic n =new NStatic();
		
		NStatic2 s2=new NStatic2();
		
		System.out.println(s2.c);
		
		System.out.println(s2.d);
		
		System.out.println(n.a1);
		
		System.out.println(n.b2);
	}

	}


