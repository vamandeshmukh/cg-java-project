package com.cg.demo.oop;

public class BankCustomer {

	// non static (fields and methods) - restricted access  
	// static (fields and methods) - free access  

	static int ifsc;
	int acNo;
	String name;
	double balance;


	void withdraw() {
	}

	void transfer() {
	}

	void checkBalance() {
	}


	static void deposit() {
	}

	static void openAccount() {
	}
	
	public static void main(String[] args) {
		ifsc = 10;
//		acNo = 10; 
		openAccount();
//		withdraw();
		
	}

}
