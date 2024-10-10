package com;
//p for fetch the details of team
//create multiple object and give value for call in () 

public class CricketTeam {
	String pname;
	int match;
	int jno;
	int htscore;
	
	CricketTeam(String pname,int match,int jno,int htscore){
		
		this.pname=pname;
		
		this.match=match;
		
		this.jno=jno;
		
		this.htscore=htscore;
		
	}
	void details() {
	
		System.out.println("player name is  "+pname); 
		
		System.out.println("matched played  "+match);
		
		System.out.println("player jersy number is  "+jno);
		
		System.out.println("player higst score  is  "+htscore);
		
		System.out.println();
	}
	public static void main(String[]args) {
	
		CricketTeam p1=new CricketTeam("virat",523,18,150);
		
		CricketTeam p2=new CricketTeam("rohit",555,15,200);
		
		CricketTeam p3=new CricketTeam("dhoni",560,19,180);
		
		CricketTeam p4=new CricketTeam("jaduu",490,20,201);
		
		p1.details();
		
		p2.details();
		
		p3.details();
		
		p4.details();
	}
		
		
	

}
