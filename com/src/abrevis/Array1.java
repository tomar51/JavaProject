package abrevis;

public class Array1 {
	
	public static void main(String[]args) {
		
		/*int []a = new int[3];//array declaration and creation 
		
		a [0]= 12;  //array initialization 
		a[1]= 44;
		a[2]=3;
		
		
		
		System.out.println(a[0]);
		System.out.println(a[2]);
		System.out.println(a[1]);*/
		
 //array declaration & array initialization
		
		String [ ] a={"a","d","i","t","i"};

		
	for(int i=0;i<a.length;i++)	{
		
		System.out.print(a[i]);
	}
	System.out.println();
	
		//reverse for loop
		
		for(int i= a.length-1;i>=0;i--) {
			
			System.out.print(a[i]);
		
		
		}
		
	}

}
