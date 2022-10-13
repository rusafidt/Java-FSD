package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class qn20 {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		Integer t[] = {-4,7,2,10,9,3,-1};
		tree.addAll(Arrays.asList(t));
		
		System.out.print("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		TreeSet<Integer> subset = new TreeSet<Integer>();
		subset = (TreeSet<Integer>)tree.subSet(tree.first(),n);   
		Iterator val = subset.iterator();
		System.out.print("Numbers less than " + n + " are : ");

		while(val.hasNext())
				System.out.print(val.next()+" ");
   
}
}