import java.util.*;

public class pattern2 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int num = sc.nextInt();
		
		System.out.println();
	
		for (int i =1; i<=num ; i++) {
			for (int j = i; j<=num ; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}