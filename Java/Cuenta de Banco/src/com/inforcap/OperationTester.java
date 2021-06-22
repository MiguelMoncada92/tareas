package com.inforcap;

public class OperationTester {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		BankAccount account2 = new BankAccount();
		BankAccount account3 = new BankAccount();
		BankAccount account4 = new BankAccount();
		BankAccount account5 = new BankAccount();
		BankAccount account6 = new BankAccount();
		
		System.out.println(account.getNumeroDeCuenta());
		System.out.println(account2.getNumeroDeCuenta());
		System.out.println(account3.getNumeroDeCuenta());
		System.out.println(account4.getNumeroDeCuenta());
		System.out.println(account5.getNumeroDeCuenta());
		System.out.println(account6.getNumeroDeCuenta());
		
		account.deposito(10000, "cuenta corriente");
		account.deposito(10000, "cuenta corriente");
		account.deposito(10000, "cuenta corriente");
		account.deposito(10000, "cuenta corriente");
		account.deposito(10000, "cuenta corriente");
		account.deposito(10000, "ahorro");
		
		
		System.out.println(BankAccount.getNumeroCuentasCreadas());
		System.out.println(BankAccount.getCantidadDineroCuenta());
		account.retiroCuentaCorriente(10000);
		account.retiroCuentaCorriente(100);
		account.saldoTotal();
		

	}

}
