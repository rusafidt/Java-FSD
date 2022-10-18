import java.util.*;

public class factorial {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the factorial number : ");
		int num = sc.nextInt();
		
		int p = 1;
		for (int i = 1; i<=num ; i++) {
			p = p * i;
		}
		System.out.println("The factorial of " + num +" is : "+ p);
	}
}