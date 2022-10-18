import java.util.*;

public class littlerobert{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		
		System.out.print("\nEnter the second number : ");
		int b = sc.nextInt();
		int c=0;
		int count=0;

		if (b<a) {
			c = a;
			a=b;
			b=c;
		}
		
		for ( int i=1; i<=b; i++) {
			if (a%i==0 && b%i==0) {
				count+=1;
			}
		}
		System.out.println("Number of integers that can divide both numbers : " + count);
	}
}
		
			
		
		

