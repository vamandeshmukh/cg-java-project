package com.cg.demo.oop;

public class BankCustomer {

	// non static (fields and methods) - restricted access (object reference)
	// static (fields and methods) - free access (class reference)

//	access (method/field) 	in context  - reference 
//			static 			static 		- Class reference - 25 
//			static 			non static 	- Class reference - 31 
//			non static 		static 		- object reference - 27 
//			non static 		non static 	- this reference - 31 
	
	static int bankPhone;
	static String ifsc; // static member 
	int acNo;
	String name;
	double balance; // non static member 
	long phone;

	// 1. complete the following code

	static void staticMethod() {
		System.out.println(BankCustomer.ifsc);
		BankCustomer object = new BankCustomer();
		System.out.println(object.balance);
	}

	void nonStaticMethod() {
		System.out.println(BankCustomer.ifsc);
		System.out.println(this.balance);
	}

	void checkBalance() {
		System.out.println(balance);
	}

	void withdraw() {

		System.out.println("withdraw");

	}

	void transfer() {
	}

	static void deposit() {
	}

	static void openAccount() {

		System.out.println("openAccount");

	}

}
