package dimondProblemExp;

public class User {
	
	public static void main(String[] args) {
		
		College c=new SubClass();
		c.lecturarList();
		c.study();
		
		School s = new SubClass();
		s.teacher();
		s.study();
		
		Coaching ch=new SubClass();
		ch.trainer();
		ch.study();
	}

}
