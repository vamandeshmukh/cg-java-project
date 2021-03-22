package com.cg.demo.objdemo;

//	https://stackoverflow.com/questions/8358600/a-good-small-example-to-demonstrate-wait-and-notify-method-in-java

class Customer {

	private double currentBalance = 1000;

	public synchronized void withdrawal(double with) {
		System.out.println("Current balance is " + currentBalance + " and amount to withdraw is " + with + ".");
		while (this.currentBalance < with) {
			System.out.println("Insufficient balance... waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.currentBalance -= with;
		System.out.println("Withdrawal successful... Remaining balance is " + currentBalance + ".");
	}

	public synchronized void deposit(double depositAmount) {
		System.out.println("Depositing amount " + depositAmount);
		this.currentBalance += depositAmount;
		System.out.println("Deposit successful... new balance is " + this.currentBalance);
		notify();
//		notifyAll();
	}
}

class Deposit implements Runnable {
	Customer customer;
	double depositAmount;

	Deposit(Customer customer, double depositAmount) {
		super();
		System.out.println("Customer");
		this.customer = customer;
		this.depositAmount = depositAmount;
	}

	@Override
	public void run() {
		customer.deposit(depositAmount);
	}
}

class Withdrawal implements Runnable {
	Customer customer;
	double withdrawAmount;

	Withdrawal(Customer customer, double withdrawAmount) {
		super();
		System.out.println("Withdrawl");
		this.customer = customer;
		this.withdrawAmount = withdrawAmount;
	}

	@Override
	public void run() {
		customer.withdrawal(withdrawAmount);
	}
}

public class App {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Thread withdrawal = new Thread(new Withdrawal(customer, 2000));
		Thread deposit1 = new Thread(new Deposit(customer, 50));
		Thread deposit2 = new Thread(new Deposit(customer, 150));
		Thread deposit3 = new Thread(new Deposit(customer, 900));
		withdrawal.start();
		deposit1.start();
		deposit2.start();
		deposit3.start();
	}
}
