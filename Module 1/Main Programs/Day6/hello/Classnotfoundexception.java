package hello;

public class Classnotfoundexception {

	public static void main(String[] args) {
		try {
			Class.forName("NoClassExist");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		} finally {
	System.out.println();
	System.out.println("Program then continues.. ");
	}
	
}
}