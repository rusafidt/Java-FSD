package linkedlist;

import java.util.ArrayList;


public class SinglyLinkedList {    
	   //node representation 
	class Node{    
	        int data;    
	        Node next;    
	            
	        public Node(int data) {    
	            this.data = data;    
	            this.next = null;    
	        }    
	    }    
	     
	    // Initializing head and tail of the singly linked list    
	    Node head = null;    
	    Node tail = null;    
	        
	    //adds new node to the list    
	    public void addNode(int data) {    
	          
	        Node newnode = new Node(data);    
	            
	        //Check if the list is empty    
	        if(head == null) {    
	        	// since empty list first node represented as both head and tail
	        	head = newnode;    
	            tail = newnode;    
	        }    
	        else {    
	            tail.next = newnode;    

	            tail = newnode;    
	        }    
	    }    
	        
	    public void display() {    

	    	Node current = head;    
	            
	        if(head == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Nodes of singly linked list : ");    
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.print(current.data + " ");    
	            current = current.next;    
	        }    
	        System.out.println();    
	    }    
	        
	    public static void main(String[] args) {    
	            
	        SinglyLinkedList sList = new SinglyLinkedList();    
	            
	        //Add nodes to the list    
	        sList.addNode(1);    
	        sList.addNode(2);    
	        sList.addNode(3);    
	        sList.addNode(4);    
	            
	        //Display the nodes present in the list    
	        sList.display();    
	    }    
	    
}
	
