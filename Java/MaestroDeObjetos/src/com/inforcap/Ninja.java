package com.inforcap;

public class Ninja extends Human{
	private int sigilo;
	
	public void displaySigilo() {
		System.out.println("El sigilo de " +this.name +" es " + getSigilo());
	}
	
	public void steal(Human h1) {
		this.health+=this.sigilo;
		h1.health -= this.sigilo;
		System.out.println(this.name + " esta robando la vida de " + h1.name);
	}
	
	public void escapar() {
		this.health -= 10;
		System.out.println(this.name +" despareció del lugar");
	}
	
	public Ninja(String nombre) {
		super(nombre + " 'el ninja'");
		setSigilo(10);
	}

	
	public int getSigilo() {
		return sigilo;
	}


	public void setSigilo(int sigilo) {
		this.sigilo = sigilo;
	}

}
