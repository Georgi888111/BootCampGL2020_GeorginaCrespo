package com.globallogic.app;

import java.util.ArrayList;

public class ControlFlujosForeach {

	public static void main(String[] args) {
	
		//Ejercicio 4.9
		ArrayList<Integer>numeros = new ArrayList<Integer>();
		int i =1;
		while(i<=10) {
			numeros.add(i);
			i++;
		}
		
		for (Integer num : numeros) {
			System.out.println("Valor iterado: " + num);
		}
		
		
		//Ejercicio 4.10
		
		ArrayList<String>dias = new ArrayList<String>();
		dias.add("Lunes");
		dias.add("Martes");
		dias.add("Miercoles");
		dias.add("Jueves");
		dias.add("Viernes");
		dias.add("Sabado");
		dias.add("Domingo");
		
		for (String dia : dias) {
			System.out.println("Dia de la semana: " + dia);
		}
		
		//Ejercicio 4.11
		
		//String palabra = "BootCamp 2020";
		
		//for (Char letra : palabra) {
			
		//}
	}
	

}
