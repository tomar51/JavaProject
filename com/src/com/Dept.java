package com;

//this belongs to univ & college class

public class Dept extends College {
	
	String Dname="cs";
	
	void labExam(){
		
		System.out.println("lab exam going on");
		
		System.out.println();
		
	}
	public static void main(String[]args) {
		
		Dept d=new Dept();
		
		System.out.println(d.Uname);
		
		System.out.println(d.Collname);
		
		System.out.println(d.Dname);
		
		d.settingPaper();
		
		d.conductExam();
		
		d.labExam();
		
	}

	
}
