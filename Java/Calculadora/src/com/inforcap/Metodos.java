package com.inforcap;

public class Metodos extends Operacion{

	public Metodos() {
		super();
	}
	
	public void calcular(double n1, String op, double n2) {
		
		String frase = "El resultado de la ecuacion es ";
		if( op.equalsIgnoreCase("+")) {
			System.out.println( frase + (n1+n2));
		}
		else if (op.equalsIgnoreCase("-")) {
			System.out.println(frase + (n1-n2));
		}
		else {
			System.out.println("El operador no es admisible, asegurese de restar o sumar");
		}
	}
	
	
	
	
}
