package com.globallogic.app;

public class MainAnimal {

	public static void main(String[] args) {
		Perro dog = new Perro();
		dog.dormir();
		dog.sonidoAnimal();
		dog.come(" perro");
		//dog.camina("perro");
		Hombre hombre = new Hombre();
		hombre.come(" hombre");
		hombre.dormir();
		hombre.hablar();
		hombre.sonidoAnimal();
		
		

	}

}
