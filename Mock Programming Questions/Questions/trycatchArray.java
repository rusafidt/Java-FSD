import java.util.*;

class Exception1 {
	public String getPriceDetails() {
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("Enter the size of array : ");
		int num = sc.nextInt();
		
		int[] arr =  new int [num];
		
		for (int i =0; i<num ; i++) {
			System.out.println("Enter the Price details : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the index of array : ");
				
		try {
			int n = sc.nextInt();
			return ("The array element is " + arr[n]);
		} catch (ArrayIndexOutOfBoundsException e) {
			return("Array Index out of range ");
		}
		catch (InputMismatchException e) {
			return("Input was not in the correct format ");
		}
		
		
	
	}
}

public class trycatchArray {
	
	public static void main (String[] args) {
		Exception1 arr = new Exception1();
		System.out.println(arr.getPriceDetails());
	}
}


