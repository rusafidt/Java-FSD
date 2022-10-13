package hello;

public class ArayindexOOB1 {

	public static void main(String[] args) {
		try {
			String[] arr = new String[10]; 
	        System.out.println(arr[10]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds Exception occurs...!");
		} finally {
		System.out.println();
		System.out.println("The program then continues....");
	}

}
}
