package hello;

public class ArrayIndexOOB {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[5];
			a[6] = 15;
		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds Exception occurs...!!");
			}
		System.out.println();
		System.out.print("The program then continues.");
		}
	}


