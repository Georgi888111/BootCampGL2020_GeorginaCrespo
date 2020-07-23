package com.globallogic.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int cantidadEmpleados;

		do {
			System.out.println("Ingrese la cantidad de empleados, no debe superar los 20");
			cantidadEmpleados = teclado.nextInt();
		} while (cantidadEmpleados > 20 || cantidadEmpleados < 1);

		ArrayList<EmpleadoDos> empleados = new ArrayList();
		EmpleadoDos empleado = null;
		while (cantidadEmpleados > 0) {
			empleado = new EmpleadoDos();
			System.out.println("Ingrese el nombre del empleado");
			String nombre = teclado.next();
			empleado.setNombre(nombre);
			System.out.println("Ingrese el dni del empleado");
			int dni = teclado.nextInt();
			empleado.setDni(dni);
			System.out.println("Ingrese el sueldo del empleado");
			double sueldo = teclado.nextDouble();
			empleado.setSueldoBase(sueldo);
			System.out.println("Es casado?");
			String casado = teclado.next();
			if (casado.equalsIgnoreCase("si")) {
				empleado.setEsCasado(true);
			} else {
				empleado.setEsCasado(false);
			}
			System.out.println("Ingrese la cantidad de hijos");
			int hijos = teclado.nextInt();
			empleado.setNumeroHijos(hijos);
			System.out.println("Cantidad de horas extras realizadas");
			int cantHoras = teclado.nextInt();
			empleado.setCantHorasExtras(cantHoras);

			empleados.add(empleado);
			cantidadEmpleados--;
		}

		System.out.println("Ingresar importe de horas extras");
		double importe = teclado.nextDouble();
		empleado.importeHora = importe;

		for (EmpleadoDos empleadoDos : empleados) {
			empleadoDos.calculoRetenciones();
			System.out.println(empleadoDos.toString());
			System.out.println("-----------------");
		}

	}

}
