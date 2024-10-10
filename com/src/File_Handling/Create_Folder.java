package File_Handling;

import java.io.File;

public class Create_Folder {
	
	public static void main(String[]args) {
		
		File f = new File("E://Aditi");
		
		if(f.mkdir()) {
			
			System.out.println("folder got created");
		}
		else {
			
			System.out.println("folder already present");
		}
		
	}

}
