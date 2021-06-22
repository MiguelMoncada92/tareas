package com.inforcap;

public class ListTester {
	public static void main(String[] args) { 
		  SinglyLinkedList sll = new SinglyLinkedList();
		  System.out.println(sll.getHead());
		 
		  
		  sll.add(3);
		  System.out.println(sll.getHead());
	      sll.add(4);
	      System.out.println(sll.getHead());
	      sll.add(10);
	      sll.add(5);
	      sll.add(15);
	      sll.add(2);
	      sll.remove();
	      sll.remove();
	      sll.printValues();
	      
	      
	        
		
		
	}
}
