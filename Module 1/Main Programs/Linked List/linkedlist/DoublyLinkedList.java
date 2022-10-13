package linkedlist;

public class DoublyLinkedList {    
  
    //Node representation    
    class Node{    
        int data;    
        Node prev;    
        Node next;    
  
        public Node(int data) {    
            this.data = data;
            this.prev = null;
            this.next = null;
        }    
    }    
  
    //Initialize head and tail for the doubly linked list    
    Node head = null;  
    Node tail = null;    
  
    //adds new node into a list  
    public void addnewnode(int data) {    
  
        Node newNode = new Node(data);    
  
        //Check if doubly linked list is empty or not   
        if(head == null) {  

        	head = newNode;  
            tail = newNode;  
            head.prev = null;    
            tail.next = null;    
        }  
        else {    
  
            tail.next = newNode;    
            newNode.prev = tail;    
            tail = newNode;    
            tail.next = null;    
        }    
    }    
  
    public void display() {  
        Node current = head;    

        if(head == null) {  
            System.out.println("List is empty");    
            return;    
        }  

        System.out.println("Nodes of doubly linked list: ");    

        while(current != null) {    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
    }    
  
    public static void main(String[] args) {    
  
        DoublyLinkedList obj = new DoublyLinkedList();    
  
        obj.addnewnode(12);    
        obj.addnewnode(23);    
        obj.addnewnode(25);    
        obj.addnewnode(26);    
        obj.addnewnode(69);    
  
        obj.display();    
    }		
	}    
  