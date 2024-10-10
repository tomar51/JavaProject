package programs;

public class ArrayWithoutShorthingBigNum {

	public static void main(String[] args) {
		
		int arry[]= {4,7,9,8,10};
		int max=arry[0];
		
		for(int i =0;i<arry.length;i++) {
			
			if(arry[i]>max) {
				
				max=arry[i];
			}
				
		}
		System.out.println(max);
		

	}

}
