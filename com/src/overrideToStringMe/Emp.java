package overrideToStringMe;

public class Emp {
	
	String ename;
	
	int sal;
	
	Emp(String ename,int sal){
		
		this.ename=ename;
		
		this.sal=sal;
	}
	
	public String toString() {
		
		return "emp name is  "+ename +   
				"  emp sal is "+sal;
		
		
		
	}
		
		
		
		public static void main(String[] args) {
			
			
			Emp e1= new Emp("shruti",10000);
			
			Emp e2= new Emp("aditi",20000);
			
			Emp e3= new Emp("tomar",30000);
			
			System.out.println(e1);
			
			System.out.println(e2);
			
			System.out.println(e3);
			
			
		}
}	
		
