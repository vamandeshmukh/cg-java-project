package com.cg.demo.oop;

public class BankCustomer {

	// non static (fields and methods) - restricted access (object reference)
	// static (fields and methods) - free access (class reference)

	
	
	static int bankPhone;
	static String ifsc;
	int acNo;
	String name;
	double balance;
	long phone;

	// 1. complete the following code 
	
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

}
