package overrideToStringMe;

public class IndainCT {
	
	String name;
	int age;
	int jno;
	int highscore;
	int match;
	
	IndainCT(String name, int age, int jno, 
			int highscore, int match)

	{
		this.name=name;
		this.age=age;
		this.jno=jno;
		this.highscore=highscore;
		this.match=match;
		
	}
	public String toString() {
		
return " name : " +name + " age : " + age + " jno is : "
+ jno +" highscore : " + highscore + " matches : " + match;
		
	}
	
	public static void main(String[] args) {
		
		IndainCT c1= new IndainCT("Rohit   ",30, 2,  100, 66);
		IndainCT c2= new IndainCT("virat    ",29, 21,  140, 56);
		IndainCT c3= new IndainCT("chris    ",31, 22, 150, 76);
		IndainCT c4= new IndainCT("dhoni    ",36, 27, 200, 126);
		IndainCT c5= new IndainCT("jack     ",20, 66, 110, 86);
		IndainCT c6= new IndainCT("glanne   ",10, 25, 90,  36);
		IndainCT c7= new IndainCT("shane    ",32, 28, 130, 96);
		IndainCT c8= new IndainCT("shoib    ",50, 44, 105, 44);
		IndainCT c9= new IndainCT("mitchel  ",10, 42, 170,  46);
		IndainCT c10= new IndainCT("shubhman  ",25, 4, 150, 30);
		IndainCT c11= new IndainCT("sky     ",34, 23, 120,   61);
		
		/*System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		System.out.println(c10);
		System.out.println(c11);*/
		
 IndainCT []c= {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11};
		
		for(int i=0;i<c.length;i++)
		{
		System.out.println(c[i]);
		
		
		
	}
	
	}
}
