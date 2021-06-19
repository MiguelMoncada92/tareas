package com.inforcap;

public class Wizard extends Human {
	
	
	public Wizard(String nombre) {
		super (nombre + " 'el mago'");
		this.intelligence = 8;
		this.health = 50;	
	}
	public void curar(Human h1) {
		h1.health += this.intelligence;
		System.out.println(this.name + " esta curando a " + h1.name);
	}
	public void curarSe(Human h1) {
		if (h1.name.equalsIgnoreCase(this.name)) {
			System.out.println(this.name + "bebe hasta más no poder");
		}else {
			System.out.println(this.name + " le entrega una botella a " + h1.name + " y beben hasta más no poder");
		}
	}
	
	public void bolaDeFuego(Human h1) {
		h1.health -= (3*this.intelligence);
		System.out.println("La bola de fuego de " + this.name + " ha alcanzado a "+h1.name);
	}
	
}
