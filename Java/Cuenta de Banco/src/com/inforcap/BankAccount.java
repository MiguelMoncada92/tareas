package com.inforcap;

import java.util.Random;

public class BankAccount {
	private String numeroDeCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaAhorros;
	private static int numeroCuentasCreadas =0;
	private static double cantidadDineroCuenta =0;
	
	public String numeroDeCuenta() {
		Random numAl = new Random();
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				numeroDeCuenta = String.valueOf(numAl.nextInt(9));
			}
			else {
				numeroDeCuenta += String.valueOf(numAl.nextInt(array[i]+1)); 
			}
		}
		return numeroDeCuenta;
	}
	public void deposito(double deposito, String tipoCuenta) {
		cantidadDineroCuenta += deposito;
		if(tipoCuenta.equalsIgnoreCase("corriente")||tipoCuenta.equalsIgnoreCase("cuenta corriente")) {
			this.saldoCuentaCorriente += deposito;
			System.out.println("Deposito realizado en su cuenta corriente, su saldo es de: "+this.saldoCuentaCorriente);
		}
		else {
			this.saldoCuentaAhorros += deposito;
			System.out.println("Deposito realizado en su cuenta de ahorro, su saldo es de: "+this.saldoCuentaAhorros);
		}
	}
	
	public void retiroCuentaCorriente (double monto) {
		if (this.saldoCuentaCorriente <=0 ||  this.saldoCuentaCorriente < monto) {
			System.out.println("Saldo insuficiente");
		}
		else {
			this.saldoCuentaCorriente -= monto;
			System.out.println("Retiro completado, su saldo es de: " + this.saldoCuentaCorriente);
		}
	} 
	public void retiroCuentaAhorro (double monto) {
		if (this.saldoCuentaAhorros <=0 ||  this.saldoCuentaAhorros <= monto) {
			System.out.println("Saldo insuficiente");
		}
		else {
			this.saldoCuentaAhorros -= monto;
			System.out.println("Retiro completado, su saldo es de: " + this.saldoCuentaCorriente);
		}
	}
	public void saldoTotal() {
		double total = this.saldoCuentaAhorros + this.saldoCuentaCorriente;
		System.out.println("Su saldo total en nuestro banco es de "+total);
		System.out.println(this.saldoCuentaAhorros+" en su cuenta de ahorro");
		System.out.println(this.saldoCuentaCorriente+" en su cuenta corriente");
	}
	
	//Constructores
	
	public BankAccount(double saldoCuentaCorriente, double saldoCuentaAhorros) {
		numeroDeCuenta();
		this.saldoCuentaCorriente = saldoCuentaCorriente;
		this.saldoCuentaAhorros = saldoCuentaAhorros;
		numeroCuentasCreadas++;
	}
	
	public BankAccount( double saldoCuentaCorriente) {
		numeroDeCuenta();
		this.saldoCuentaAhorros = 0.0;
		this.saldoCuentaCorriente = saldoCuentaCorriente;
		numeroCuentasCreadas++;
	}
	
	public BankAccount() {
		numeroDeCuenta();
		numeroCuentasCreadas++;
	}
	
	
	//getters & setters
	public static int getNumeroCuentasCreadas() {
		return numeroCuentasCreadas;
	}
	public static void setNumeroCuentasCreadas(int numeroCuentasCreadas) {
		BankAccount.numeroCuentasCreadas = numeroCuentasCreadas;
	}
	public static double getCantidadDineroCuenta() {
		return cantidadDineroCuenta;
	}
	public static void setCantidadDineroCuenta(double cantidadDineroCuenta) {
		BankAccount.cantidadDineroCuenta = cantidadDineroCuenta;
	}
	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}
	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}
	public double getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}
	public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}
	public double getSaldoCuentaAhorros() {
		return saldoCuentaAhorros;
	}
	public void setSaldoCuentaAhorros(double saldoCuentaAhorros) {
		this.saldoCuentaAhorros = saldoCuentaAhorros;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
