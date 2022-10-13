package hello;

import java.util.Scanner;

public class arr5 {

	public static void main(String[] args) {
		int arr[] = new int[20];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		arr[5] = 5;
		arr[6] = 6;
		arr[7] = 7;
		arr[8] = 8;
		arr[9] = 9;
		arr[10] = 10;
		System.out.println("Displaying the number in Arrays : ");
		for (int i=1; i<=10; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int large,small;
		large = small = arr[1];
		for (int j=1; j<=10; j++) {
			if (arr[j]>large)
				large = arr[j];
			
			if (arr[j]<small)
				small = arr[j];
		}
		System.out.println();
		System.out.println();
		System.out.println("The smallest element in array : " + small);
		System.out.println();
		System.out.println("The largest element in array : " + large);
		
	}
}
