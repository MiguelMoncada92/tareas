package com.inforcap;

public class SinglyLinkedList {
	public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.
    public void remove() {
    	
    }
    
    
    public void printValues() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.value + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
    
    
    public void find() {
    	
    }
    
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
        	System.out.println("poraqui");
            head = newNode;
        } else {
        	System.out.println("else");
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}    

	
}
