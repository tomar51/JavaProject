package abrevis;

import java.util.Scanner;

public class New {
	
	public static void main(String[]args) {
		
		Scanner input= new Scanner(System.in);
		 
		System.out.print("enter first number  ");
		
		int first = input.nextInt();
		
		System.out.print("enter second number  ");
		
		int second = input.nextInt();
		
		/*int add= first + second;
		int sub= first - second;
		int mul = first * second;
		int mod = first % second;
		int div = first / second;*/
		
		double add= first + second;
		double sub= first - second;
		float mul = first * second;
		double mod = first % second;
		double div = first / second;
		
		System.out.println("addition is " + add);
		System.out.println("subtreaction is " + sub);
		System.out.println("multi is " + mul);
		System.out.println("modu is " + mod);
		System.out.println("divi is " + div );
		
	}

}
