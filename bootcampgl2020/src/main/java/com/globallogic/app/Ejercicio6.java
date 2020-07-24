package com.globallogic.app;

import java.util.ArrayList;
import java.util.Collections;
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
			
		}
		
		EmpleadoDos mayorSueldo = empleados.get(0);
		for (EmpleadoDos empleadoDos : empleados) {
		if(empleadoDos.getSueldoBase()>mayorSueldo.getSueldoBase()) {
			mayorSueldo = empleadoDos;
		}
			
		}
		
		System.out.println("El empleado con mayor sueldo es: "   );
		System.out.println(mayorSueldo.toString());
		
		EmpleadoDos menorSueldo = empleados.get(0);
		for (EmpleadoDos empleadoDos : empleados) {
		if(empleadoDos.getSueldoBase()<menorSueldo.getSueldoBase()) {
			menorSueldo = empleadoDos;
		}
			
		}
		
		System.out.println("El empleado con menor sueldo es: "   );
		System.out.println(menorSueldo.toString());
		
		System.out.println("Empleados ordenados por salario");
		Collections.sort(empleados);
		for (EmpleadoDos empleadoDos : empleados) {
			System.out.println(empleadoDos.toString());
			System.out.println("-----------------------");
		}
	
		EmpleadoDos mayorHorasExtras = empleados.get(0);
		
		for (EmpleadoDos empleadoDos : empleados) {
			if(empleadoDos.complementoHorasExtras()>mayorHorasExtras.complementoHorasExtras()) {
				mayorHorasExtras = empleadoDos;
			}
				
			}
			
			System.out.println("El empleado con mayor cobro en horas extras es: "   );
			System.out.println(mayorHorasExtras.toString());
			
			EmpleadoDos menorHorasExtras = empleados.get(0);
			
			for (EmpleadoDos empleadoDos : empleados) {
				if(empleadoDos.complementoHorasExtras()<menorHorasExtras.complementoHorasExtras()) {
					menorHorasExtras = empleadoDos;
				}
					
				}
				
				System.out.println("El empleado con menor cobro en horas extras es: "   );
				System.out.println(menorHorasExtras.toString());
				
				
				
				

	}

}
