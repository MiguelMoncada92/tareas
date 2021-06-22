package com.inforcap;

public class Pokemon{
	private String nombre;
	private int salud;
	private String tipo;
	private int id;
	private static int numeroPokemones=1;
	
	//métodos
	
	public void atacarPokemon(Pokemon p1) {
		p1.salud -= 10;
		System.out.println(this.nombre + " esta atacando a " + p1.nombre);
	}
	
	//constructor
	public Pokemon(String nombre, int salud, String tipo) {
		this.nombre = nombre;
		this.salud = salud;
		this.tipo = tipo;
		id = numeroPokemones;
		numeroPokemones++;
	}
	//getter setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
}
