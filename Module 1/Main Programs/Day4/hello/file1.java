package hello;
//File Creating

import java.io.File;

public class file1 {

	public static void main(String[] args) {
		File fileobj = new File("example.txt");
		
		try {
			boolean success = fileobj.createNewFile();
			
			if (success) {
				System.out.println("File got created");
			}
			else {
				System.out.println("File already exists");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
