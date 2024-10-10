package programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		int num = 153;
		int arm = 0 ,reminder;
		int realnum = num;
		
		while(num>0) {
			
			reminder= num%10;
			
			arm=(reminder*reminder*reminder)+arm;
			
			num = num/10;
		}
		if(realnum==arm) {
			
			System.out.println("armstrong Num");
		}
		else {
			
			System.out.println("not ArmStrong");
		}

	}

}
