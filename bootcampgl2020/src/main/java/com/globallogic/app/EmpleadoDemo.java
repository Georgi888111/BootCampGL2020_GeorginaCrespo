package com.globallogic.app;

//Ejercicio 3.6
public class EmpleadoDemo {

	public static void main(String[] args) {
		Empleado empleado = new Empleado();
		empleado.setSalario(1000);
		System.out.println(empleado.getNombre() + " tiene un salario promedio de " + empleado.getSalario());

	}

}
