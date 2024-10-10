package AllimpProgramJava;

public class BubbelShot {

	public static void main(String[] args) {

		//Arranging array in Ascending OR Descending order it is called as Bubble Shot.
		
		int a []= {7,9,6,4,2,7,5};
		
		
		for(int i = 0;i<a.length;i++) {
			
			for(int j =0;j<a.length-1;j++) {
				
				if(a[j]>a[i]) {
					
					int temp=a[j];
					a[i]= a[j+1];
					a[j+1]=temp;
				}
			}
		
		System.out.println(a[i]);
		}
	}

}
