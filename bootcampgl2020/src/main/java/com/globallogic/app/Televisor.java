package com.globallogic.app;

public class Televisor extends Electrodomestico {

	private double pulgadas;
	private String resolucion;
	
	public double getPulgadas() {
		return this.pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	public String getResolucion() {
		return this.resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	public void cambiarCanal(int numero) {
		
	}
	void encender() {
		System.out.println("Televisor encendido");
	}
}
