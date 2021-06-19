package com.inforcap;

public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Human("Juan");
		Human h2 = new Human("Lord Farquad");
		Human h3 = new Human("Benito Camelot");
		Ninja n1 = new Ninja("Conde");
		Wizard w1= new Wizard ("Pedrón");
		Samurai s1 = new Samurai("Don Bacilón");
		h1.attack(h2);
		h2.displayHealth();
		h2.attack(h1);
		h1.displayHealth();
		h2.displayHealth();
		h1.attack(h2);
		h2.displayHealth();
		h1.displayHealth();
		h3.displayHealth();
		h3.attack(h1);
		h1.displayHealth();
		h2.displayHealth();
		h3.displayHealth();
		n1.attack(h2);
		n1.displayHealth();
		h2.displayHealth();
		n1.displaySigilo();
		w1.displayHealth();
		n1.steal(w1);
		n1.displayHealth();
		w1.displayHealth();
		n1.escapar();
		w1.curar(w1);
		w1.bolaDeFuego(h1);
		h1.displayHealth();
		w1.displayHealth();
		s1.displayHealth();
		s1.golpeMortal(w1);
		w1.displayHealth();
		s1.displayHealth();
		s1.medita();
		s1.displayHealth();
		
		
	}

}
