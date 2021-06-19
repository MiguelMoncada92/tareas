package com.inforcap;

public class Human extends Molde {
	
	public Human(String nombre) {
		this.name = nombre;
		this.stealth = 3;
		this.health = 100;
		this.intelligence = 3;
		this.strength = 3;
				
	}
	
	public void attack(Human h2) {
		//System.out.println("'Aaahhggg'");
		System.out.println(this.name + " atacando a: "+ h2.name);
		h2.setHealth(h2.health - h2.strength);
	}
	

	
	
	
	
}
