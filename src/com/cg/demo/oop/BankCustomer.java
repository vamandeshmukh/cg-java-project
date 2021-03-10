package com.cg.demo.oop;

public class BankCustomer {

	// non static (fields and methods) - restricted access (object reference)
	// static (fields and methods) - free access (class reference)

	static int ifsc;
	int acNo;
	String name;
	double balance;

	void withdraw() {
		System.out.println("withdraw");
	}

	void transfer() {
	}

	void checkBalance() {
	}

	static void deposit() {
	}

	static void openAccount() {
		System.out.println("openAccount");
	}

	public static void main(String[] args) {
		ifsc = 10;
//		acNo = 10; 
		openAccount();
		BankCustomer obj = new BankCustomer();
		obj.withdraw(); 
	}

}
