import java.util.*;

public class diamond1{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int num = sc.nextInt();
		
		System.out.println();
	
		for (int k =1; k<=num ; k++) {
			for (int l = 1; l<=k ; l++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		for (int i =2; i<=num ; i++) {
			for (int j = i; j<=num ; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}