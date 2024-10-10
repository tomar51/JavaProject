package objectExp2;

public class Employee {
	
	int id;
	Employee(int id){
		
		this.id=id;
	}
	public static void main(String[]args) {
		
		Employee e=new Employee(1);
		
		System.out.println(e);
	}

}

 //output
//objectExp2.Employee@1ddc4ec2

