package com.inforcap;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentaje, String carrier, String ringTone) {
		super(versionNumber, batteryPercentaje, carrier, ringTone);
	}
	@Override
	public String ring() {
		return "Este Galaxy esta sonando";
	}
	@Override
	public String unlock() {
		return "Este Galaxy se va a desbloquear";
	}
	@Override
	public void displayInfo() {
		System.out.println("Este Galaxy tiene un numero de version: "+ this.getVersionNumber() + 
				", un porcentaje de bateria de: "+ this.getBatteryPercentage() +
				", su operador es: " + this.getCarrier()+
				" y su tono es: " + this.getRingTone());
	}

}
