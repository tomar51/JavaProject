package treeSetExp;

import java.util.TreeSet;

public class Sortcar {
	
	public static void main(String[]args) {
		
		Car c1 = new Car(10000000);
		Car c2 = new Car(500000);
		Car c3 = new Car(300000);
		
		TreeSet<Car> t = new TreeSet();
		t.add(c1);
		t.add(c2);
		t.add(c3);
		
		for(Car z : c) {
			System.out.println(z);
		}
	}

}
