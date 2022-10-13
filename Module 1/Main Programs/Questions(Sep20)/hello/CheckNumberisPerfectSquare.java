package hello;

import java.util.Scanner;

public class CheckNumberisPerfectSquare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the perfect square number: ");  
		int a = sc.nextInt();
		int flag = 0;
		
		for (int i=1; i<=a ; i++)  {
			if (a==Math.pow(i,2)) {
				flag=1; 
				}
			}
		
		if (flag==1) {
			System.out.println(a + " is a perfect square number ");
		}
		else {
			System.out.println(a + " is not a perfect square number ");
		}
		
	}

}
