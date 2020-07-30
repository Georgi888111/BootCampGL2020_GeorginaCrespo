package com.globallogic.app;



public class ControlFlujosIf {

	//Ejercicio 4.1
	public static void main(String[] args) {
		
		int numero1=3;
		int numero2=10;
		int suma = numero1+numero2;
		
		
		
		if(suma<=10) {
			System.out.println("La suma de los números es: " + suma);
			
		}else {
			System.out.println("La suma de los números es mayor a 10");
		}
		
	//Ejercicio 4.2
		
		char letra1 = 'A';
		char letra2 = 'b';
		if(Character.isUpperCase(letra2)) {
			System.out.println("Es una letra mayúscula");
		}else {
			System.out.println("Es una letra minúscula");
		}
	
		//Ejercicio 4.3
		
		double compra = 400;
		double descuento;
		if(compra==300) {
			descuento = compra*0.20;	
		System.out.println("El descuento es de: " + descuento);
		}else {
			if(compra >350) {
				descuento = compra*0.25;
				System.out.println("El descuento es de: " + descuento);
			}else {
				System.out.println("Sin descuentos, el total es de: " + compra);
			}
		}
		
	}
	

}
