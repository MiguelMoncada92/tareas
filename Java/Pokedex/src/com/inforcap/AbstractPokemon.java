package com.inforcap;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon crearPokemon(String nombre, int salud, String tipo) {
		return new Pokemon(nombre, salud, tipo);
		
	}
	
	public String pokemonInfo(Pokemon p1) {
		return p1.getNombre() + " tiene: "+ p1.getSalud() +" de salud y es de tipo "+p1.getTipo();
	}
	
}
