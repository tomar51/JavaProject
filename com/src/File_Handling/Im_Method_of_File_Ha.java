package File_Handling;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Im_Method_of_File_Ha {
	
	public static void main(String[]args) {
		
		File f = new File("E: Adii");
		
		if(f.mkdir()) {
			
			System.out.println("folder got created");
		}
		else {
			System.out.println("folder already present");
		}
		
		System.out.println(f.getAbsolutePath());
		
		System.out.println(f.getName());
		
		//getAbsolutePath() use for folder path
		
		File f1 = new File(f.getAbsolutePath()+"//manual.txt");
		
		try {
			if(f1.createNewFile()) {
				
				System.out.println("file is created");
			}
			else {
				
				System.out.println("file already present");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		// imp methods
		
		System.out.println(f1.length());
		
		System.out.println(f1.canWrite());
		
		System.out.println(f1.canRead());
		
		System.out.println(f1.exists());
		
		
		System.out.println(f1.lastModified());
		long mili = f1.lastModified();
 		Date d = new Date(mili);
 		System.out.println(d);
		
	}

}
