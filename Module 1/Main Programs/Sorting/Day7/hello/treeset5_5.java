package hello;

import java.util.TreeSet;

public class treeset5_5 {

	public static void main(String[] args) {
		TreeSet <Integer> list = new TreeSet<Integer> ();
		TreeSet <Integer> list1 = new TreeSet<Integer> ();

		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);

		
		System.out.println("Tree Set : " + list);
		
		list1 = (TreeSet)list.headSet(7);
		
		System.out.println("Tree Set (less than 7) : " + list1);
	}

}
