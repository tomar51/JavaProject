package com;
//p with object creation & calling//

  public class Actors {
	
	String name;
	int age;
	int nofilm;
	String favfilm;
	
	Actors(String name,int age,int nofilm,String favfilm){
		
		this.name=name;
		this.age=age;
		this.nofilm=nofilm;
		this.favfilm=favfilm;
	}
	void details() {
		
	System.out.println("actor name is  "+name);	
	System.out.println("actor age is  "+age);
	System.out.println("number of films is  "+nofilm);
	System.out.println("my fav film is  "+favfilm);
	
	System.out.println();	
	}
	public static void main(String[]args) {
		
		Actors a1=new Actors("akshay",50,40,"baby");
		
		Actors a2=new Actors("ajay",51,45,"abc");
		
		Actors a3=new Actors("varun",35,10,"aaa");
		
		Actors a4=new Actors("ranveer",38,20,"bbb");
		
		a1.details();
		a2.details();
		a3.details();
		a4.details();
	}}


	
		
		
		
	
	


