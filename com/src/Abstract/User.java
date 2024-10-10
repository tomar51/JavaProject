package Abstract;

//insta re

public class User {

	public static void main(String[] args) {
		
		Insta i=new InstaImp();
		
		i.login();
		i.logout();
		i.post();
	}
}
