package com.inforcap;

public class IPhone extends Phone implements Ringable {
	
	public IPhone(String versionNumber, int batteryPercentaje, String carrier, String ringTone) {
		super(versionNumber, batteryPercentaje, carrier, ringTone);
	}
	@Override
	public String ring() {
		return "Este IPhone esta sonando";
	}
	@Override
	public String unlock() {
		return "Este Iphone se va a desbloquear";
	}
	@Override
	public void displayInfo() {
		System.out.println("Este IPhone tiene un numero de version: "+ this.getVersionNumber() + 
				", un porcentaje de bateria de: "+ this.getBatteryPercentage() +
				", su operador es : " + this.getCarrier()+
				" y su tono es: " + this.getRingTone());
	}
	
	
	
	
	
}
