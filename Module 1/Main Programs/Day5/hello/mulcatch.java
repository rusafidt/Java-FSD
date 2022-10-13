package hello;

public class mulcatch {

	public static void main(String[] args) {
		try {
			int a[] = new int[10];
			a[1] = 30/0;
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs...!!");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds Exception occurs...!!");
		}
		catch (Exception e) {
			System.out.print("Exception occurs");
		}
		System.out.println();
		System.out.print("The program continues");
	}

}
