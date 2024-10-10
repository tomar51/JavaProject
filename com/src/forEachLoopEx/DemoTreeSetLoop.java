package forEachLoopEx;

import java.util.TreeSet;

public class DemoTreeSetLoop {
	
	public static void main(String[]args) {
		
		TreeSet t=new TreeSet();
		
		t.add(60);
		t.add(20);
		t.add(30);
		t.add(80);
		t.add(50);
		t.add(70);
		
		//System.out.println(t);
		
	//	System.out.println();
		
		for(Object i: t)
			
		{
			System.out.println(i);
		}
		
	}

}
