package com.globallogic.bootcampgl.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Customer implements CommandLineRunner{
	
	
	private String name;
	private int dni;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) { 
		this.id = id;
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Name: Jose Perez");
		System.out.println("Dni: 3233131");
		System.out.println("ID: 12121");
	}
	

	
	

}
