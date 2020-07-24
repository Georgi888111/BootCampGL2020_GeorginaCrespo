package com.globallogic.app;

public class Hombre implements Animal,PersonaInterface {

	@Override
	public void hablar() {
		System.out.println("Las personas hablan mucho");
		
	}

	@Override
	public void dormir() {
		System.out.println("El hombre duerme muchas horas");
		
	}

	@Override
	public void sonidoAnimal() {
		System.out.println("El hombre no hace sonido animal");
		
	}

	@Override
	public void come(String s) {
		// TODO Auto-generated method stub
		PersonaInterface.super.come(s);
	}


	
}
