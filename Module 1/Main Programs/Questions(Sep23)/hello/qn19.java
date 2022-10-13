package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class qn19 {

	public static void main(String[] args) {
		
		Set<Integer> treeset1 = new TreeSet<Integer>();
		Integer[] n1 = {1,6,2,5,8,10};
		treeset1.addAll(Arrays.asList(n1));
		
		System.out.println("Tree Set : " + treeset1);
		
		treeset1.clear();
		System.out.println("\nTree Set : " + treeset1);
   
}
}