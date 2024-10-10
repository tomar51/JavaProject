package programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 333;
		int reminder, sum=0, temp;
		temp = num;
		
		while(num>0) {
			
			reminder= num%10;
			sum = sum*10;
			
			num= num/10;
		}
		if(num==sum) {
			
			System.out.println("Palindrome Number");
		}
		else {
			
			System.out.println("Not Palindrome Number");
		}
	}

}
