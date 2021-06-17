package com.codingdojo.guardiaDelZoo;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("*vuela*");
		setEnergyLevel(energyLevel - 50);
		displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("Bueno, no importa");
		setEnergyLevel(energyLevel + 25);
		displayEnergy();
		
	}
	
	public void attackTown() {
		System.out.println("*Ciudad quemandose*");
		setEnergyLevel(energyLevel - 100);
		displayEnergy();
	}
	
	
	
}
