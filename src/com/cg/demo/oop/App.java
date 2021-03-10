package com.cg.demo.oop;

public class App {

	public static void main(String[] args) {
		System.out.println("Start");
		BankCustomer obj = new BankCustomer();
		obj.checkBalance();
		
		obj.balance = 100;
		
		BankCustomer.ifsc = "aaa"; 

		BankCustomer.openAccount();
		
		BankCustomer obj2 = new BankCustomer();
		obj2.nonStaticMethod();
	
		BankCustomer.staticMethod();
		
		
		

		// 2. create two objects of BankCustomer
		// and call all the methods and fields appropriately.

	}

}
