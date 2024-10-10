package overrideToStringMe;

public class Student {
	
	int rollNum;
	
	String name;
	
	int age;
	
	int Marks;
	
	Student(int rollNum,String name,int age,int Marks){
		
		this.rollNum =rollNum;
		
		this.name=name;
		this.age=age;
		this.Marks=Marks;
	}
	
	public String toString() {
		
return "student rollnum is "+rollNum +" student name is "
+name  +"student age " + age +"student mark " +Marks;
		 
		
	}
	
	public static void main(String[] args) {
		 
		Student s1 =new Student(1,"shruti",21,99);
		
		Student s2 =new Student(2,"shru",22,89);
		
		Student s3 =new Student(3,"aditi",24,97);
		Student s4 =new Student(4,"gudiya",25,79);
		Student s5 =new Student(5,"tanu",26,66);
		Student s6 =new Student(6,"abhi",23,69);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}

}
