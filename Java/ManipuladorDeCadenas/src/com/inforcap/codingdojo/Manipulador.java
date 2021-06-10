package com.inforcap.codingdojo;

public class Manipulador {
	
	public void imprimirHasta255(int numero) {
		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}
	}
	public void trimAndConcat(String word,String word2) {	
		System.out.println(word.trim()+word2.trim());
		
	}
	public void indexOrNull(String word, char charc) {
		
		System.out.println(word.indexOf(charc));
		
		
	}
	public void indexOrNull2(String word1, String word2) {
		System.out.println(word1.indexOf(word2));
	}
	public void concatSubstring(String w1, int n1, int n2, String w2) {
		System.out.println(w1.substring(n1) + w2.substring(n2));
	}
	
}
