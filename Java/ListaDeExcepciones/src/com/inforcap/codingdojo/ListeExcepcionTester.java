package com.inforcap.codingdojo;
import java.util.ArrayList;

public class ListeExcepcionTester {

	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("12");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");
		
		
		for(int i = 0; i < myList.size(); i++) {
			try {
				String values = String.valueOf(myList.get(i));
				int num = Integer.valueOf(values);
				System.out.println(num);
				}
			catch (Exception e) {
				//System.out.println(e.getMessage());
			}
		}
		
		
	}

}
