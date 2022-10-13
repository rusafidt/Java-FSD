package hello;
//File reading

import java.io.File;
import java.util.Scanner;

public class file3 {

	public static void main(String[] args) {
		try {
			File f = new File("example.txt");
			Scanner r = new Scanner(f);
			
			while (r.hasNextLine()) {
				String data = r.nextLine();
				System.out.println(data);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
