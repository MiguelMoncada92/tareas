package com.inforcap.codingdojo;
import java.util.ArrayList;

public class Basicos {

	public static void main(String[] args) {
		//1
		System.out.println("Ejercicio 1");
		int[] entero = {5, 256};
		for(int i = 1; i < entero[0]; i++) {
			System.out.println(i);
		}
		//2
		System.out.println("Ejercicio 2");
		for(int i = 0; i < entero[0]; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		//3
		System.out.println("Ejercicio 3");
		int sum = 0;
		for(int i = 0; i < entero[0]; i++) {
			sum = sum + i;
			System.out.println("Nuevo numero: " + i + " Suma: "+sum);
		}
		//4
		System.out.println("Ejercicio 4");
		int[] array = {1,3,5,7,9,13};
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//5
		System.out.println("Ejercicio 5");
		int[] array2 = {-3,-5,-7,0,48};
		int max = array[0];
		for(int i = 0; i < array2.length; i++) {
			if(max < array2[i]) {
				max = array2[i];
			}
		}
		System.out.println(max);
		//6
		System.out.println("Ejercicio 6");
		int[] array3 = {2,10,3};
		int suma = 0;
		for(int i = 0; i < array3.length; i++) {
			suma = suma + array3[i];
		}
		System.out.println(suma/array3.length);
		//7
		System.out.println("Ejercicio 7");
		ArrayList<Integer> y = new ArrayList<Integer>();
		for(int i = 1; i < entero[0]; i++) {
			if (i%2 != 0) {
				y.add(i);
			};
		}
		System.out.println(y);
		//8
		System.out.println("Ejercicio 8");
		int[] mayorQue = {1,3,5,7};
		int valor = 3;
		ArrayList<Integer> mayor = new ArrayList<Integer>();
		for (int j= 0; j < mayorQue.length; j++) {
			if (valor < mayorQue[j]) {
				mayor.add(mayorQue[j]);
			}
		}
		System.out.println(mayor.size());
		
		//9
		System.out.println("Ejercicio 9");
		ArrayList<Integer> cuadrado = new ArrayList<Integer>();
		cuadrado.add(1);
		cuadrado.add(5);
		cuadrado.add(10);
		cuadrado.add(-2);
		System.out.println(cuadrado);
		for(int i = 0; i < cuadrado.size(); i++) {
			int x = cuadrado.get(i);
			x = x*x;
			cuadrado.set(i, x);
		}
		System.out.println(cuadrado);
		
		//10
		System.out.println("Ejercicio 10");
		ArrayList<Integer> sinNegativos = new ArrayList<Integer>();
		sinNegativos.add(1);
		sinNegativos.add(5);
		sinNegativos.add(10);
		sinNegativos.add(-2);
		for(int i = 0; i < sinNegativos.size(); i++) {
			if (sinNegativos.get(i)<0) {
				sinNegativos.set(i, 0);
			}
		}
		System.out.println(sinNegativos);
		//11
		System.out.println("Ejercicio 11");
		int[] arr = {1,5,10,-2};
		double avg = 0;
		double Max = arr[0];
		double min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
			avg = avg + arr[i];
			
		}
		ArrayList<Double> maxMinAvg = new ArrayList<Double>();
		maxMinAvg.add(Max);
		maxMinAvg.add(min);
		maxMinAvg.add(avg/arr.length);
		System.out.println(maxMinAvg);
		//12
		System.out.println("Ejercicio 12");
		ArrayList<Integer> ordenar = new ArrayList<Integer>();
		ordenar.add(1);
		ordenar.add(5);
		ordenar.add(10);
		ordenar.add(7);
		ordenar.add(-2);
		ordenar.add(-89);
		for(int i = 0; i < ordenar.size(); i++) {
			if(i != ((ordenar.size())-1)) {
				ordenar.set(i, ordenar.get(i+1));
			}
			else {
				ordenar.set(i, 0);
			}
		}
		System.out.println(ordenar);
		
	}
}
