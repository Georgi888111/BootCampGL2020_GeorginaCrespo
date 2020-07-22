package com.globallogic.app;

import java.util.ArrayList;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Ejercicio 5.1
		
		Electrodomestico electro = new Electrodomestico();
		Heladera heladera = new Heladera();
		heladera.setColor("Blanca");
		heladera.setConsumo('N');
		heladera.setMarca("Samsung");
		heladera.setPeso(70);
		heladera.setTieneFreezer(true);
		heladera.setCapacidad(100);
		heladera.setCapacidadFreezer(20);
		
		System.out.println("Voy a comprar una heladera marca: " + heladera.getMarca() + " de color " 
		+ heladera.getColor() + " con un peso de " +  heladera.getPeso());
		
		
		//Ejercicio 5.2
		
		Televisor televisor = new Televisor();
		Cafetera cafetera = new Cafetera();
		
		
		ArrayList<Electrodomestico> electros= new ArrayList<Electrodomestico>(); 
		electros.add(heladera);
		electros.add(televisor);
		electros.add(cafetera);
		
		for (Electrodomestico electrodomestico : electros) {
		electrodomestico.encender();	
		}
		
		//Ejercicio 5.3
		
		Gato gato = new Gato();
		gato.setNombre("Felipe");
		gato.setPatas(4);
		System.out.println("Mi gato se llama " + gato.getNombre() + "y tiene " + gato.getPatas());
		
	}
	 

}
