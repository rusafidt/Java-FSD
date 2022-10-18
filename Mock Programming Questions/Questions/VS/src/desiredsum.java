import java.lang.reflect.Array;
import java.util.*;

public class desiredsum{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();

		int[] arr = new int[n+1];
		int sum = 0;

		for (int i=0; i<n ; i++) {
			System.out.println("Enter the element " + i + " : ");
			arr[i] = sc.nextInt();
			}
		
		Arrays.sort(arr);
		
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();


		for (int j=1; j<=n ; j++) {
			for (int k=1; k<=j ; k++) {
				sum = arr[j] + arr[k];
				if (sum==num) {
					System.out.println("\nThe numbers are : " + arr[j] + " & " + arr[k]);
				}
			}
	}
	
}
}
		
			
		
		

