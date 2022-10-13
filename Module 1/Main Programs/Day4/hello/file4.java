package hello;
//File deleting

import java.io.File;
import java.util.Scanner;

public class file4 {

	public static void main(String[] args) {
		try {
			File f = new File("example.txt");
			if(f.delete()) {
				System.out.println(f.getName() + " has been deleted");
			}
			else {
				System.out.println("File deletion has been successfully failed");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
