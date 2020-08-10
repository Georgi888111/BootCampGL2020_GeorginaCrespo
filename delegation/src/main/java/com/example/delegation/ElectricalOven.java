package com.example.delegation;

public class ElectricalOven extends ElectricalAppliance {

	private LedAppliance ledApp;

	public ElectricalOven(LedAppliance led) {
		this.ledApp = led;
	}
	
	@Override
	public void turnOn() {
	this.setPower(this.getPower()-75);	
	}
	
	public void turnLed() {
		this.setPower(this.ledApp.turnLed(this.power));
	}

}
