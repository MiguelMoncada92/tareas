package com.inforcap.codingdojo;
import java.util.ArrayList;


public class Portafolio {
	 
	ArrayList<Proyect> array = new ArrayList<Proyect>();

	public Proyect getArray(int numero) {
		return array.get(numero);
	}

	public void setArray(ArrayList<Proyect> array) {
		this.array = array;
	}

	public Portafolio() {
		super();
	}

	public Portafolio(ArrayList<Proyect> array) {
		super();
		this.array = array;
	}
	
	
}
