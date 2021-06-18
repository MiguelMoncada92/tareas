package com.inforcap.codingdojo;

public class Proyect {
	
	public Proyect(String name, String description, double initialCost) {
		super();
		this.name = name;
		this.description = description;
		this.initialCost = initialCost;
	}

	//Atributos o campos/ método acceso/Tipo/Nombre
	private String name;
	private String description;
	private double initialCost;
	
	//Acciones o metodos/ método acceso/Tipo/Nombre
	public String elevatorPitch () {
		return name+"("+initialCost+"): "+description;
	}
	
	
	


	public double getInitialCost() {
		return initialCost;
	}


	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}


	public Proyect() {
		
	}

	public Proyect(String name) {
		
		this.name = name;
	}

	public Proyect(String name, String description) {
		
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
