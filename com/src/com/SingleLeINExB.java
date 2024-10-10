package com;

//[single level inheritance] (exp)[this belong to SLIA]

public class SingleLeINExB extends SingleLeINExA {
	
	String name = "raju";
	
	public static void main(String[]args) {
		
		SingleLeINExB c= new SingleLeINExB();
		
		System.out.println(c.name);
		
		System.out.println(c.age);
		
	}

}
