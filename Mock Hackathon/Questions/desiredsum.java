import java.util.*;

public class desiredsum{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();

		int arr[] = new array[n];
		int sum = 0;

		for (int i=1; i<=n ; i++) {
			System.out.println("Enter the element " + i + " : ");
			arr[i] = sc.nextInt();
			}
		System.out.println("Enter the number : ");
		int num = sc.nextInt();


		for (int j=1; j<=n ; j++) {
			for (int k=1; k<=n ; k++) {
				sum = a[i] + a[j];
				if (sum==num) {
					System.out.println("The numbers are : " + arr[i] + " & " + arr[j]);
				}
			}
	}
	
}
		
			
		
		

