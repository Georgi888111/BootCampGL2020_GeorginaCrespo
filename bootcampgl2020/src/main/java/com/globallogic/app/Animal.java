package com.globallogic.app;

public interface Animal {

	public abstract void dormir();
	public abstract void sonidoAnimal();
	
	default void come(String s) {
	System.out.println("El" + s + " se alimenta");	
	}
	
	static void camina(String s) {
		System.out.println("El" + s + " camina");
	}
		
	
}
