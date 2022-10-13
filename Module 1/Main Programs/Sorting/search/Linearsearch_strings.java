package search;

import java.util.Scanner;  
  
public class Linearsearch_strings {  
   public static void main(String args[])  
   {  
      int i, flag = 0;
      String item = "Hello"; //item to search
      String arr[] = {"Hi", "Hello", "Vazha", "Chinnu", "Vinay"};
      int n = arr.length;
      for (i=0; i<n; i++) {
    	  if (arr[i]==item) {
    		  flag = 1;
    		  break;
    	  }
      }
      
      if (flag==1) {
    	  System.out.println("Item ("+item+") found at " + i);
      }
      else
    	  System.out.println("Item not found ");
      
   }
}