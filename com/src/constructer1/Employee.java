package constructer1;

public class Employee {
	
	int empid;
	
	String ename;
	
	int empsal;
	
	Employee(int empid,String ename,int empsal)
	{
		this.empid=empid;
		
		this.ename=ename;
		
		this.empsal=empsal;
	}
	
	void details() {
		
		System.out.println("emp id is " +empid);
		
		
		System.out.println("empl name is " +ename);
		
		System.out.println("employee salary is " +empsal);
		
		System.out.println();
	}
	
	public static void main(String[]args) {
		
		Employee e1=new Employee(1,"ab",1000);
		
		
		Employee e2=new Employee(2,"bb",2000);
		
		Employee e3=new Employee(3,"cd",3333);
		
		Employee e4=new Employee(4,"aa",2222);
		
		e1.details();
		
		e2.details();
		
		e3.details();
		
		e4.details();

	}

}
