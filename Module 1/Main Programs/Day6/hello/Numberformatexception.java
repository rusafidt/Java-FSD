package hello;

public class Numberformatexception {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt("55cc");
			System.out.print(a);
	}
		catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println();
			System.out.println(e);
		}
		System.out.println();
		System.out.println("The program then continues...");
	}

}
