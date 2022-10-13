package hello;
//File writing


import java.io.File;
import java.io.FileWriter;

public class file2 {

	public static void main(String[] args) {
		try {
			FileWriter w = new FileWriter("example.txt");
			w.write("Hello !!");
			w.write("Why are you handsome?");
			w.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
