package com.inforcap;

public class PokemonTester {

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("Pikachu", 100, "electrico");
		Pokemon p2 = new Pokemon("Charizard", 100, "electrico");
		Pokemon p3 = new Pokemon("squirtl", 100, "electrico");
		Pokedex px = new Pokedex();
		px.agregarPokemon(p1);
		px.agregarPokemon(p2);
		px.agregarPokemon(p3);
		
		Pokemon p4 = px.crearPokemon("bulbasor", 0, "planta");
		px.agregarPokemon(p4);
		px.listaDePokemones();
		System.out.println(px.pokemonInfo(p1));
		

	}

}
