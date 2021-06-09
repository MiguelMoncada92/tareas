package com.inforcap.codingdojo;

import java.util.ArrayList;
import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		String[] abecedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		ArrayList<String> abece = new ArrayList <String>();
		for(int i = 0; i < abecedario.length; i++) {
			abece.add(abecedario[i]);
		}
		System.out.println("Ejercicio 6");
		ArrayList <String> encadena = new ArrayList <String>();
		Random chain = new Random();
		for(int u = 0; u < 5; u++) {
			encadena.add(abece.get(chain.nextInt(26)));
		}
		String caden="";
		for(int j = 0; j < encadena.size(); j++) {
			caden = caden + encadena.get(j);
		}
		System.out.println(caden);
		System.out.println(encadena);
				
		//7
		System.out.println("Ejercicio 7");
		ArrayList<String> variasCadenas = new ArrayList<String>();
		variasCadenas.add(caden);
		for(int i = 0; i < 10; i++) {
			
			caden = "";
			encadena.clear();
			for(int u = 0; u < 5; u++) {
				encadena.add(abece.get(chain.nextInt(26)));
			}
			
			for(int j = 0; j < encadena.size(); j++) {
				caden = caden + encadena.get(j);
			}
			
			variasCadenas.add(caden);
			
		}
		System.out.println(variasCadenas);

	}

}
