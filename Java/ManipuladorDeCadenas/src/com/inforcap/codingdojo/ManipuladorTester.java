package com.inforcap.codingdojo;

public class ManipuladorTester {

	public static void main(String[] args) {
		Manipulador function = new Manipulador();
		
		//function.imprimirHasta255(255);
		//function.trimAndConcat("              com            ", "                     pare                   ");
		//function.indexOrNull("Coding", 'd' );
		//function.indexOrNull2("Hola", "la");
		function.concatSubstring("Hola", 1, 3, "mundo");
	}

}
