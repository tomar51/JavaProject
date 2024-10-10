package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_in_file {
	
	public static void main(String[]args) {
		
		File f =new File("E://JavaT");
		
		if(f.mkdir()) {
			
			System.out.println("folder created");
		}
		else{
			System.out.println("folder already present");
			
		}
		File f1 =new File(f.getAbsolutePath()+"janote.txt");
		
		try {
			if(f1.createNewFile()) {
				System.out.println("file created");
			}
			else {
				System.out.println("already present");
			}
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}
		FileWriter fw= null;
		
		try {
			fw=new FileWriter(f1);
			fw.write("hello");
			fw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
