package com.codingdojo.guardiaDelZoo;

public class Gorilla extends Mammal{
	
	public Gorilla() {
		this.energyLevel = 100;
	}

	public void throwSomething() {
		System.out.println("Tirando algo");
		setEnergyLevel(energyLevel - 5);
		displayEnergy();
	}
	
	public void eatBananas() {
		System.out.println("comiendo bananas");
		setEnergyLevel(energyLevel + 10);
		displayEnergy();
		
	}
	
	public void climb() {
		System.out.println("Escalando");
		setEnergyLevel(energyLevel - 10);
		displayEnergy();
	}
	
}
