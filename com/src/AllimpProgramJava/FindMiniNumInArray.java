package AllimpProgramJava;

public class FindMiniNumInArray {

	public static void main(String[] args) {

		int a[]= {1,3,4,6,8,9};
		int min=a[0];
		
		for(int i= 0;i<a.length;i++)
		{
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
