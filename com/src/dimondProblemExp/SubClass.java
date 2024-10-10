package dimondProblemExp;

public class SubClass extends Coaching 
   implements College,School
    {

	@Override
	public void teacher() {
		System.out.println("teachers data");
		
	}

	@Override
	public void study() {
		System.out.println("studyss");
		
	}

	@Override
	public void lecturarList() {
		System.out.println("lecturar data");
	}

	@Override
	void trainer() {
		System.out.println("trainer data");
		
	}
	

}
