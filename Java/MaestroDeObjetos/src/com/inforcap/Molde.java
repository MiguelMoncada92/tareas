package com.inforcap;

public class Molde {
	protected String name;
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	
	public int displayHealth () {
		System.out.println("Salud restante de "+this.name +" = "+health);
		return health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int healt) {
		this.health = healt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
