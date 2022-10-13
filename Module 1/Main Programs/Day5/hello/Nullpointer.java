package hello;

public class Nullpointer {

			public static void main(String[] args) {
				String s = null;

				try {
					System.out.print("First Element : " + s.charAt(0));
				} catch (NullPointerException e) {
					System.out.println("Null Pointer exception occurs...!!");
				}
				System.out.println();
				System.out.println("The program then continues....");

			}
}



