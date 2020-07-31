package com.globallogic.bootcampgl.junitTest;

//Ejercicio 1.7
public class EjercicioFor {
	private int numero1;

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public boolean cicloFor(int numero1) {
		boolean retorna = false;
		for (int i = 0; i < numero1; i++) {
			if (i == 3) {
				retorna = true;
				break;
			} else {
				retorna = false;
			}
		}
		return retorna;
	}
}
