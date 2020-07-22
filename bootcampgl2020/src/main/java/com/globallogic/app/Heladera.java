package com.globallogic.app;

public class Heladera extends Electrodomestico {
	
private double capacidad;
private boolean tieneFreezer;
private double capacidadFreezer;

public double getCapacidad() {
	return this.capacidad;
}
public void setCapacidad(double capacidad) {
	this.capacidad = capacidad;
}
public boolean isTieneFreezer() {
	return this.tieneFreezer;
}
public void setTieneFreezer(boolean tieneFreezer) {
	this.tieneFreezer = tieneFreezer;
}
public double getCapacidadFreezer() {
	return this.capacidadFreezer;
}
public void setCapacidadFreezer(double capacidadFreezer) {
	this.capacidadFreezer = capacidadFreezer;
}


public void guardarElemento(String alimento) {
	
}

public void extraerElemento(String alimento) {
	
}

void encender() {
	System.out.println("Heladera encendida");
}

}
