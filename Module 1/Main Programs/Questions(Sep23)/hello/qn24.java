package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Sort {
	
		 private int temp_array[];
		    private int len;
		 
		    public void sort(int[] nums) {
		         
		        if (nums == null || nums.length == 0) {
		            return;
		        }
		        this.temp_array = nums;
		        len = nums.length;
		        quickSort(0, len - 1);
		    }
		     private void quickSort(int low_index, int high_index) {
		         
		        int i = low_index;
		        int j = high_index;
		        
		        int pivot = temp_array[low_index+(high_index-low_index)/2];
		        
		        while (i <= j) {
		               while (temp_array[i] < pivot) {
		                i++;
		            }
		            while (temp_array[j] > pivot) {
		                j--;
		            }
		            if (i <= j) {
		                exchangeNumbers(i, j);
		               
		                i++;
		                j--;
		            }
		        }
		        
		        if (low_index < j)
		            quickSort(low_index, j);
		        if (i < high_index)
		            quickSort(i, high_index);
		    }
		 
		    private void exchangeNumbers(int i, int j) {
		        int temp = temp_array[i];
		        temp_array[i] = temp_array[j];
		        temp_array[j] = temp;
		    }
		     
		    
}
public class qn24 {
		    public static void main(String args[])
		    {
		        Sort ob = new Sort();
		        int nums[] = {7, -5, 3, 2, 1, 0, 45};
		        System.out.print("Original Array : ");
		        System.out.println(Arrays.toString(nums));
		        ob.sort(nums);
		        System.out.print("Sorted Array : ");
		        System.out.println(Arrays.toString(nums));
   
}
}
