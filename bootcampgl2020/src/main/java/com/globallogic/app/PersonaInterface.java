package com.globallogic.app;

public interface PersonaInterface {
	public abstract void hablar();
	public abstract void dormir();
	default void come(String s) {
		System.out.println("El" + s + " se alimenta");	
		}

}

