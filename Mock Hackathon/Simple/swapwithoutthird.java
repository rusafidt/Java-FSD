import java.util.*;

public class swapwithoutthird{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number, a : ");
		int a = sc.nextInt();
		
		System.out.print("\nEnter the second number, b : ");
		int b = sc.nextInt();

		System.out.print("\nBefore Swapping, first number a = " + a + " and second number b = " +b);

		
			a = a+b;
			b = a-b;
			a = a-b;
			System.out.println("\nAfter Swapping, first number a = " + a + " and second number b = " +b);
		
		

	}
}