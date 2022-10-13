package linkedlist;

import java.util.ArrayList;


public class CircularLinkedList {    
	   //node representation 
	class Node{    
	        int data;    
	        Node next;    
	            
	        public Node(int data) {    
	            this.data = data;    
	            this.next = null;    
	        }    
	    }    
	     
	    // Initializing head and tail of the circular linked list    
	    Node head = null;    
	    Node tail = null;    
	        
	    //adds new node to the list    
	    public void addnode(int data) {    
	          
	        Node newnode = new Node(data);    
	            
	        //Check if the list is empty    
	        if(head == null) {    
	        	// since empty list first node represented as both head and tail
	        	head = newnode;    
	            tail = newnode;
	            newnode.next = head;
	        }    
	        else {    
	            tail.next = newnode;    

	            tail = newnode;
	            tail.next = head;
	        }    
	    }    
	        
	    public void display() {    

	    	Node current = head;    
	            
	        if(head == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }
	        else {
	        System.out.println("Nodes of Circular Linked List : ");    
	        do {    
	            //Prints each node by incrementing pointer    
	            System.out.print(current.data + " ");    
	            current = current.next;    
	        }while(current != head);
	        	System.out.println();   
	        }
	    }

	        
	    public static void main(String[] args) {    
	            
	        CircularLinkedList sList = new CircularLinkedList();    
	            
	        //Add nodes to the list    
	        sList.addnode(1);    
	        sList.addnode(23);    
	        sList.addnode(345);    
	        sList.addnode(5678);    
	            
	        //Display the nodes present in the list    
	        sList.display();    
	    }    
	    
}
	
