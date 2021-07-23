package com.codingdojo.web.models;

public class Animal {
	private String name;
	private String breed;
	private int peso;
		
	
	public Animal(String name, String breed, int peso) {
		
		this.name = name;
		this.breed = breed;
		this.peso = peso;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
	
	
}
