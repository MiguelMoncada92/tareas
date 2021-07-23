package com.codingdojo.web.models;

public class Cat extends Animal implements Pet {

	public Cat(String name, String breed, int peso) {
		super(name, breed, peso);
		
	}
	public String showAffection() {
		return "El gato ronronea como motor de tractor";
	}
}
