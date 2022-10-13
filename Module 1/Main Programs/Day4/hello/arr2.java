package hello;

import java.util.Scanner;

public class arr2 {

	public static void main(String[] args) {
		int arr[] = new int[20];
		for (int i=1; i<=10; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the number " + i +" : ");
			arr[i] = scan.nextInt();	
			}
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check in Array : ");
		int num = sc.nextInt();
		int flag = 0;
		
		for (int j=0; j<10; j++) {
			if (arr[j]==num) {
				flag = 1;
			}
			else {
				flag = 0;
			}
		}
		if (flag==1) {
			System.out.print("The number " + num + " is present in array.");
		}
		else {
			System.out.print("The number " + num + " is not present in array.");
		}
	}
}
