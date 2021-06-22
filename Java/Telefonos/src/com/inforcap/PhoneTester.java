package com.inforcap;

public class PhoneTester {

	public static void main(String[] args) {
		IPhone i9 = new IPhone("i9", 99, "Clatel", "MeGustaLaCerveza.mp3");
		Galaxy s9 = new Galaxy("s9", 46, "Wovistel", "tipitipitin.mp3");
		
		i9.displayInfo();
		System.out.println(i9.unlock());
		System.out.println(i9.ring());
		
		s9.displayInfo();
		System.out.println(s9.unlock());
		System.out.println(s9.ring());
		
		
		
		
		
		
		
		
	}

}
