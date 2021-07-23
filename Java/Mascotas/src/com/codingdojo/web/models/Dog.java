package com.codingdojo.web.models;

public class Dog extends Animal implements Pet{

	public Dog(String name, String breed, int peso) {
		super(name, breed, peso);
		
	}
	public String showAffection() {
		if (getPeso() < 10) {
			return this.getName() + " hopped into your lap and cuddled you!";
		}
		else {
			return this.getName() + " curl up next to tou!";
		}
	
	}
}
