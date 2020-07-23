package com.globallogic.app;

public class EmpleadoDos extends Persona {

	private int dni;
	private double sueldoBase;
	private String nombre;
	private int cantHorasExtras;
	private double retenciones;
	private boolean esCasado;
	private int numeroHijos;
	public static double importeHora;

	public EmpleadoDos() {
		super();
	}

	public EmpleadoDos(int dni) {
		super();
		this.dni = dni;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantHorasExtras() {
		return cantHorasExtras;
	}

	public void setCantHorasExtras(int cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}

	public double getRetenciones() {
		return retenciones;
	}

	public void setRetenciones(double retenciones) {
		this.retenciones = retenciones;
	}

	public boolean isEsCasado() {
		return esCasado;
	}

	public void setEsCasado(boolean esCasado) {
		this.esCasado = esCasado;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public double complementoHorasExtras() {
		double complemento = this.cantHorasExtras * this.importeHora;
		return complemento;
	}

	public double sueldoBruto() {
		return this.sueldoBase + complementoHorasExtras();
	}

	public double calculoRetenciones() {
		double porcentaje = 0;
		if (this.esCasado) {
			porcentaje = porcentaje + 0.02;
		}

		if (this.numeroHijos > 0) {
			while (this.numeroHijos > 0) {
				porcentaje = porcentaje + 0.01;
				numeroHijos--;
			}

		}
		this.retenciones = sueldoBruto() * porcentaje;
		return this.retenciones;

	}

	@Override
	public String toString() {
		return dni + nombre + "\n Sueldo base: " + sueldoBase + "\n" + "Horas extras: " + cantHorasExtras
				+ "\n tipo IRPF " + retenciones + "\n Casado: " + esCasado + "\n Numero de hijos: " + numeroHijos;

	}

}
