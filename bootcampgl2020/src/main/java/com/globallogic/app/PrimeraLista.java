package com.globallogic.app;

import java.util.ArrayList;

public class PrimeraLista {

	//Ejercicio 3.3
	public static void main(String[] args) {
		ArrayList<String>letters = new ArrayList<String>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		
		System.out.println("Elementos del array:");
		for (int i = 0; i < letters.size(); i++) {
			System.out.print(letters.get(i) + "-");
		}
		System.out.println("");
		System.out.println("La cantidad de elementos del array es: " + letters.size());
		letters.add(0, "X");
		
		System.out.println("Elementos del array con la x:");
		for (int i = 0; i < letters.size(); i++) {
			System.out.print(letters.get(i) + "-");
		}
	}

}
