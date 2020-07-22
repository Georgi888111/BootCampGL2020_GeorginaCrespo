package com.globallogic.app;

public class ControlFlujosFor {

	public static void main(String[] args) {
		//Ejercicio 4.4
		
		for (int i = 1; i <=10 ; i++) {
			System.out.println("Valor iterado: " + i);
		}
		
		//Ejercicio 4.5
		int contador =0;
		for (int i = 0; i < 10000; i++) {
			if(i%20==0) {
			contador ++;	
			}
		}
		
		System.out.println("El valor del contador es: " + contador);

		//Ejercicio 4.6
		
		String[]dias = new String[7];
		dias[0]= "Domingo";
		dias[1]= "Lunes";
		dias[2]= "Martes";
		dias[3]= "Miercoles";
		dias[4]= "Jueves";
		dias[5]= "Viernes";
		dias[6]= "Sabado";
		
		for (int i = 0; i < dias.length; i++) {
			System.out.println("Día de la semana: " + dias[i]);
		}
	}

}
