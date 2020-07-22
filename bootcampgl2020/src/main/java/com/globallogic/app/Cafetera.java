package com.globallogic.app;

public class Cafetera extends Electrodomestico {
	
	private double litros;

	public double getLitros() {
		return this.litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}
	
	public void elegirSabor(String sabor) {
		
	}

	void encender() {
		System.out.println("Cafetera encendida");
	}
}
