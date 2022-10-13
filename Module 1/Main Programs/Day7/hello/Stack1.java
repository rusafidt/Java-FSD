package hello;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack <String> list = new Stack<String> ();
		
		list.add("Hi");
		list.add("Black");
		list.add("Blue");
		list.add("Pink");
		list.add("Bye");
		
		System.out.println("The Stack : " + list);
	}

}
