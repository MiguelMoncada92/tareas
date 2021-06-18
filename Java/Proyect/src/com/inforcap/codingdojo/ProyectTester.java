package com.inforcap.codingdojo;

import java.util.ArrayList;

public class ProyectTester {
	

	public static void main(String[] args) {
		Proyect proyect = new Proyect();
		proyect.setInitialCost(100000.00);
		proyect.setName("T. Digital");
		proyect.setDescription("Formar en programación");
		System.out.println(proyect.elevatorPitch());
		System.out.println(proyect.getName());
		System.out.println(proyect.getDescription());
		
		Proyect p2 = new Proyect("Inforcap");
		p2.setInitialCost(100000.00);
		p2.setDescription("Gran Proyecto");
		System.out.println(p2.elevatorPitch());
		System.out.println(p2.getName());
		System.out.println(p2.getDescription());
		
		Proyect p3 = new Proyect("Corfo", "Super proyecto");
		p3.setInitialCost(100000.00);
		System.out.println(p3.elevatorPitch());
		System.out.println(p3.getName());
		System.out.println(p3.getDescription());
		
		Proyect p4 = new Proyect("Sercotec", "The best proyect in the world", 1351321.1351);
		System.out.println(p4.elevatorPitch());
		System.out.println(p4.getName());
		System.out.println(p4.getDescription());
		
		ArrayList<Proyect> array = new ArrayList<Proyect>();
		array.add(proyect);
		array.add(p2);
		array.add(p3);
		array.add(p4);
		Portafolio portafolio = new Portafolio ();
		portafolio.setArray(array);
		System.out.println(portafolio.getArray(0));
		System.out.println(array.get(0));
		
		
		
	}
	
}
