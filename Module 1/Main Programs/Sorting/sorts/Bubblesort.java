package sorts;

import java.util.Scanner;  
  
public class Bubblesort {
	public static void main (String[] args) {
		 int size, i, j, temp;  
	       int arr[] = new int[50];  
	       Scanner scan = new Scanner(System.in);  
	         
	       System.out.print("Enter the Array Size : ");  
	       size = scan.nextInt();  
	         
	         
	       for(i=0; i<size; i++)  
	       {  
	    	   System.out.print("Enter the Array Element " + (i+1)+" : ");
	           arr[i] = scan.nextInt();  
	       }  
	         
	       System.out.print("Sorting Array using Bubble Sort Technique \n"); 
	       
	       for( i=0; i < size; i++){  
               for( j=1; j < (size-i); j++){  
                        if(arr[j-1] > arr[j]){  
                               //swap elements  
                               temp = arr[j-1];  
                               arr[j-1] = arr[j];  
                               arr[j] = temp;
                        }
               }
	       }
	       System.out.print("Array after Sorting is :\n");  
	       for(i=0; i<size; i++)  
	       {  
	           System.out.print(arr[i]+ "  ");  
	       }  
	       
}
}