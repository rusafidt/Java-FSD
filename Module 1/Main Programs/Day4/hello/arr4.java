package hello;
//2D 
import java.util.Scanner;

public class arr4 {

	public static void main(String[] args) {
		int n[][] = new int [5][5];
		int i,j;
		Scanner scan = new Scanner(System.in);
		for (i=1; i<=3; i++) {
			for (j=1; j<=3; j++) {
				
				System.out.print("Enter the number of Row " + i + " and Column " + j + " : ");
				n[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Array is : ");
		{
			for (i=1; i<=3; i++) {
				for (j=1; j<=3; j++) {
					System.out.print(" "+ n[i][j]);
				}
				System.out.println();
			}
		}
	}
}