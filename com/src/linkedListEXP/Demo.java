package linkedListEXP;

import java.util.LinkedList;

public class Demo {
	
	public static void main(String[]args) {
		
	LinkedList l=new LinkedList();	
		
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(40.33);
	l.add(35);
	l.add("aditi");
	l.add(22);
	l.add(null);
	l.add(30);
	
	/*for(int i=0;i<l.size();i++) {
		
		System.out.println(l.get(i));
	}*/
	
	for(int j=l.size()-1;j>=0;j--) { //its for reverse
		
		System.out.println(l.get(j));
	}
	
		
	}

}
