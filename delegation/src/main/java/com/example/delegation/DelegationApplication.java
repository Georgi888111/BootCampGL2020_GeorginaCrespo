package com.example.delegation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DelegationApplication {

	public static void main(String[] args) {
		
		ElectricalOven oven = new ElectricalOven(new LedAppliance());
		System.out.println("Energia inicial: " + oven.power);
		oven.turnOn();
		System.out.println("Energia: " + oven.power);
		oven.turnLed();
		System.out.println("Energia: " + oven.power);
		
		
	}

}
