package com.globallogic.app;

public class PointDemo {

	//Ejercicio 3.5
	public static void main(String[] args) {
		
		VariableInstancia vI = new VariableInstancia();
		vI.setEngPoints(50);
		vI.setMathsPoints(80);
		
		System.out.println("Los valores de las variables son: " + vI.getEngPoints() + "y" + vI.getMathsPoints());
	}

}
