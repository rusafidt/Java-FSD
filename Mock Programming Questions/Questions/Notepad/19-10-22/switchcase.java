import java.util.*;

public class switchcase{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number (a) : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the second number (b) : ");
		int b = sc.nextInt();
		
		System.out.println("\n     Arithmetic Operations     ");
		System.out.println("\n 1) Addition \n 2) Subtraction \n 3) Multiplication \n 4) Division");
		
		System.out.print("\nEnter the choice : ");
		int num = sc.nextInt();
		
		switch (num) {
			case 1: System.out.println("\nAddition of " + a + " and " + b + " = " + (a+b));
					break;
			case 2: System.out.println("\nSubtraction of " + a + " and " + b + " = " + (a-b)); 
			break;
			case 3: System.out.println("\nMultiplication of " + a + " and " + b + " = " + (a*b)); 
			break;
			case 4: System.out.println("\nDivision of " + a + " and " + b + " = " + (a/b)); 
			break;
	}
}
}