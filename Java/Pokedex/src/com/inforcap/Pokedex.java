package com.inforcap;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	
	ArrayList<Pokemon> misPokemones = new ArrayList<Pokemon>();
	@Override
	public void listaDePokemones() {
		for (int i =0; i< misPokemones.size(); i++) {
			System.out.println(misPokemones.get(i).getNombre());
		}
		
	}
	
	public void agregarPokemon (Pokemon p1) {
		misPokemones.add(p1);
	}
	
	

}
