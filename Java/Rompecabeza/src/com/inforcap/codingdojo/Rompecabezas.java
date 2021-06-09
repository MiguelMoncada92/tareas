package com.inforcap.codingdojo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Rompecabezas {

	public static void main(String[] args) {
		//1
		System.out.println("Ejercicio 1");
		int[] arreglo = {3,5,1,2,7,9,8,13,25,32};
		ArrayList<Integer> newArray = new ArrayList <Integer>();
		for(int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] > 10) {
				newArray.add(arreglo[i]);
			}
		}
		System.out.println(newArray);
		//2
		System.out.println("Ejercicio 2");
		String[] arreglo2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		ArrayList<String> newArray2 = new ArrayList <String>();
		for(int i = 0; i < arreglo2.length; i++) {
			newArray2.add(arreglo2[i]);
		}
		ArrayList<String> cincoLetras = new ArrayList <String>();
		for(int j = 0; j < newArray2.size(); j++) {
			if(newArray2.get(j).length()>5) {
				cincoLetras.add(newArray2.get(j));
				}
		}
		System.out.println(cincoLetras);
		
		//3
		System.out.println("Ejercicio 3");
		String[] abecedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		ArrayList<String> abece = new ArrayList <String>();
		for(int i = 0; i < abecedario.length; i++) {
			abece.add(abecedario[i]);
		}
		System.out.println(abecedario.length);
		Collections.shuffle(abece);
		System.out.println(abece);
		System.out.println(abece.get(abece.size()-1));
		System.out.println(abece.get(0));
		if (abece.get(0) == "a" || abece.get(0)=="e" || abece.get(0)=="i" || abece.get(0)=="o" || abece.get(0)=="u") {
			System.out.println("¿cual es la probabilidad de que salga este mensaje?");
		}
		
		//4
		System.out.println("Ejercicio 4");
		Random r = new Random();
		ArrayList<Integer> randond = new ArrayList <Integer>();
		for(int i = 0; i<10; i++) {
			int x= r.nextInt(45);
			x += 55;
			randond.add(x);
		}
        System.out.println(randond);
        System.out.println("El largo del arreglo es: " + randond.size());
        
        //5
        System.out.println("Ejercicio 5");
		Collections.sort(randond);
		System.out.println(randond);
		System.out.println(randond.get(0));
		System.out.println(randond.get(randond.size()-1));
		
		//6
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

