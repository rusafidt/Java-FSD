package search;

import java.util.Scanner;  
  
public class Linearsearch_int {  
   public static void main(String args[])  
   {  
      int i, flag = 0;
      int item = 9; //item to search
      int arr[] = {12,7,9,6,69};
      int n = arr.length;
      for (i=0; i<n; i++) {
    	  if (arr[i]==item) {
    		  flag = 1;
    		  break;
    	  }
      }
      
      if (flag==1) {
    	  System.out.println("Item found at " + i);
      }
      else
    	  System.out.println("Item not found ");
      
   }
}