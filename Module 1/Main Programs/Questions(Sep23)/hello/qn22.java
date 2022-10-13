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

public class qn22 {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();  
		  queue.add("Red");
		  queue.add("Green");
		  queue.add("Orange");
		  queue.add("White");
		  queue.add("Black");
		  queue.add("Rose");
		  System.out.println("Priority Queue : " + queue);
		
		  System.out.println("First element in priority queue : " + queue.peek());
		  
   
}
}
