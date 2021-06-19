package com.inforcap;

public class Samurai extends Human{

	public Samurai(String nombre) {
		super(nombre + " 'el samurai'");
		this.health = 200;
	}
	
	public void golpeMortal(Human h1) {
		h1.health = 0;
		this.health /= 2;
		System.out.println(this.name + " destroza por completo a " + h1.name);
	}
	
	public void medita() {
		this.health += (this.health/2);
		System.out.println(this.name + " se toma una pausa para contemplar la existencia...");
	}
	
	

}
