package programs;

public class IntReverse {

	public static void main(String[] args) {

		int num = 23578; 
		int rev =0;
		
		
		while(num!=0) {
			
			int reminder=num%10;
			
			rev= rev*10+reminder;
			
			num=num/10;
		}
		System.out.println(rev);
	}

}
