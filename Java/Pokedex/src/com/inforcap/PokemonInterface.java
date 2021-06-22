package com.inforcap;

public interface PokemonInterface {
	Pokemon crearPokemon(String nombre, int salud, String tipo);
	String pokemonInfo(Pokemon pokemon);
	void listaDePokemones();
}
